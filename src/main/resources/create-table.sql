ALTER TABLE KARTHI_USER
ADD CONSTRAINT user_id_pk PRIMARY KEY (user_id);

CREATE TABLE KARTHI_ADDRESS (
user_id NUMBER(10),
Address_Line1 varchar(50 char),
Address_Line2 varchar(50 char),
street varchar(50 char),
country varchar(50 char),
zipcode varchar(50 char)
);

ALTER TABLE KARTHI_ADDRESS
ADD CONSTRAINT user_id_fk
   FOREIGN KEY (user_id)
   REFERENCES KARTHI_USER (user_id);