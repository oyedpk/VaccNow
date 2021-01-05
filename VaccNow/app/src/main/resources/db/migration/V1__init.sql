create table branch (
    id number(10) PRIMARY KEY,
    name varchar2(100) NOT NULL,
    capacity number NOT NULL
);

create table vaccine (
    id number(10) PRIMARY KEY,
    name varchar2(100) NOT NULL,
    price number(6,2) NOT NULL
);

create table branch_vaccine (
    branch_id number(10) CONSTRAINT bv_1 REFERENCES branch (id),
    vaccine_id number(10) CONSTRAINT bv_2 REFERENCES vaccine (id)
);

create table timeslot (
    id number(10) PRIMARY KEY,
    branch_id number(10) CONSTRAINT bv_1 REFERENCES branch (id),
    slot varchar2(100) NOT NULL,
);

create table payment (
    id number(10) PRIMARY KEY,
    amount number(6,2) NOT NULL,
    status varchar2(10) NOT NULL
);

create table schedule (
    id number(10) PRIMARY KEY,
    branch_id number(10) CONSTRAINT bs_1 REFERENCES branch (id),
    vaccine_id number(10) CONSTRAINT vs_1 REFERENCES vaccine (id),
    payment_id number(10) CONSTRAINT ps_1 REFERENCES payment (id)
);

