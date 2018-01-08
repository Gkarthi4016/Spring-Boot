ALTER TABLE KARTHI_USER
ADD CONSTRAINT user_id_pk PRIMARY KEY (user_id);

CREATE SEQUENCE KARTHI_USER_SEQ
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;

CREATE TABLE KARTHI_ADDRESS (
user_id NUMBER(10),
Address_Line1 varchar(50 char),
Address_Line2 varchar(50 char),
street varchar(50 char),
country varchar(50 char),
zipcode varchar(50 char)
);

 ALTER TABLE KARTHI_ADDRESS
  ADD (city varchar(50 char),
  state varchar(50 char));

ALTER TABLE KARTHI_ADDRESS
ADD CONSTRAINT user_id_fk
   FOREIGN KEY (user_id)
   REFERENCES KARTHI_USER (user_id);
   
     CREATE TABLE KARTHI_ORDERS (
  order_id NUMBER(10),
user_id NUMBER(10),price NUMBER(10),
order_date date
);

ALTER TABLE KARTHI_ORDERS add PRIMARY KEY (order_id);
CREATE SEQUENCE KARTHI_ORDER_SEQ
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;