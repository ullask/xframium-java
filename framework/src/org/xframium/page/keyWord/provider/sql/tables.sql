drop table PERFECTO_TEST_SUITES;
drop table PERFECTO_TEST_SUITE_PAGES;
drop table PERFECTO_TESTS;
drop table PERFECTO_TEST_STEPS;
drop table PERFECTO_TEST_SUBSTEPS;
drop table PERFECTO_TEST_STEP_PARAMS;
drop table PERFECTO_TEST_STEP_TOKENS;
drop table PERFECTO_FUNCTIONS;
drop table PERFECTO_TEST_IMPORTED_SUITES;

create table PERFECTO_TEST_SUITES
(
        NAME VARCHAR(50) NOT NULL    
);

create table PERFECTO_TEST_SUITE_PAGES
(
        SUITE_NAME VARCHAR(50) NOT NULL,
        PAGE_NAME VARCHAR(100) NOT NULL,
        CLASS_NAME VARCHAR(100)
);

create table PERFECTO_TEST_IMPORTED_SUITES
(
        SUITE_NAME VARCHAR(50) NOT NULL,
        IMPORTED_NAME VARCHAR(50) NOT NULL,
        INCLUDE_TESTS VARCHAR(1),
        INCLUDE_FUNCTIONS VARCHAR(1),
        CONSTRAINT CHK_INCLUDE_TESTS CHECK (INCLUDE_TESTS IN ( 'Y', 'N' )),
        CONSTRAINT CHK_INCLUDE_FUNCTIONS CHECK (INCLUDE_FUNCTIONS IN ( 'Y', 'N' ))
);

create table PERFECTO_TESTS
(
        SUITE_NAME VARCHAR(50) NOT NULL,
        NAME VARCHAR(50) NOT NULL,
        DATA_DRIVER VARCHAR(100),
        DATA_PROVIDER VARCHAR(100),
        LINK_ID VARCHAR(100),
        TIMED VARCHAR(1),
        THRESHOLD INTEGER,
        ACTIVE VARCHAR(1),
        OS VARCHAR(100),
        TAG_NAMES VARCHAR(200),
        CONSTRAINT CHK_TIMED CHECK (TIMED IN ( 'Y', 'N' )),
        CONSTRAINT CHK_ACTIVE_1 CHECK (ACTIVE IN ( 'Y', 'N' ))
);

create table PERFECTO_TEST_STEPS
(
        STEP_KEY INTEGER NOT NULL,
        SUITE_NAME VARCHAR(50) NOT NULL,
        TEST_NAME VARCHAR(50) NOT NULL,
        NAME VARCHAR(50) NOT NULL,
        PAGE_NAME VARCHAR(100),
        TYPE VARCHAR(20),
        ACTIVE VARCHAR(1),
        LINK_ID VARCHAR(100),
        OS VARCHAR(100),
        POI VARCHAR(100),
        THRESHOLD INTEGER,
        TIMED VARCHAR(1),
        INVERSE VARCHAR(1),
        WAIT INTEGER,
        FAILURE_MODE VARCHAR(20),
        VALIDATION VARCHAR(1),
        VALIDATION_TYPE VARCHAR(20),
        DEVICE VARCHAR(200),
        TAG_NAMES VARCHAR(200),
        OFFSET INTEGER,
        CONSTRAINT CHK_TIMED_1 CHECK (TIMED IN ( 'Y', 'N' )),
        CONSTRAINT CHK_ACTIVE_3 CHECK (ACTIVE IN ( 'Y', 'N' )),
        CONSTRAINT CHK_INVERSE CHECK (INVERSE IN ( 'Y', 'N' )),
        CONSTRAINT CHK_VALIDATION CHECK (VALIDATION IN ( 'Y', 'N' ))
);

create table PERFECTO_TEST_SUBSTEPS
(
        PARENT_KEY INTEGER NOT NULL,
        CHILD_KEY INTEGER NOT NULL
);

create table PERFECTO_TEST_STEP_PARAMS
(
        STEP_KEY INTEGER NOT NULL,
        TYPE VARCHAR(50),
        VALUE VARCHAR(100) NOT NULL,
        OFFSET INTEGER
);

create table PERFECTO_TEST_STEP_TOKENS
(
        STEP_KEY INTEGER NOT NULL,
        NAME VARCHAR(50) NOT NULL,
        VALUE VARCHAR(100) NOT NULL,
        TYPE VARCHAR(50)
);

create table PERFECTO_FUNCTIONS
(
        SUITE_NAME VARCHAR(50) NOT NULL,
        NAME VARCHAR(50) NOT NULL,
        DATA_DRIVER VARCHAR(100),
        DATA_PROVIDER VARCHAR(100),
        LINK_ID VARCHAR(100),
        TIMED VARCHAR(1),
        THRESHOLD INTEGER,
        ACTIVE VARCHAR(1),
        OS VARCHAR(100),
        CONSTRAINT CHK_TIMED_2 CHECK (TIMED IN ( 'Y', 'N' )),
        CONSTRAINT CHK_ACTIVE_4 CHECK (ACTIVE IN ( 'Y', 'N' ))
);

