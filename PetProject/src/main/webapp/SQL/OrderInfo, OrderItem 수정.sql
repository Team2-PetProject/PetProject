ALTER TABLE orderitem DROP COLUMN orderinfo_code;

--orderinfo_seq 삭제

ALTER TABLE orderinfo MODIFY orderinfo_code VARCHAR2(20);

ALTER TABLE orderitem ADD ORDERINFO_CODE VARCHAR2(20) NOT NUll;


--OrderItem 외래키 삭제(외래키로 안 지정되어 있는 경우 필요 없음)
alter table orderitem drop CONSTRAINT ORDERITEM_ORDERINFO_CODE_FK;

--주문금액에 따른 배달비 - OrderInfo 테이블에 Order_Delivery 컬럼 추가
ALTER TABLE ORDERINFO ADD ORDERINFO_DELIVERY NUMBER(7,0) NULL;