---------------------------------------
--ITEM (중심) (상품리스트)
---------------------------------------
CREATE TABLE ITEM
(
ITEM_CODE VARCHAR2(10) PRIMARY KEY, --상품코드
ITEM_CATEGORY VARCHAR2(20) NOT NULL, --상품카테고리
ITEM_NAME VARCHAR2(50) NOT NULL, --상품이름
ITEM_INFO VARCHAR2(4000) NOT NULL, --상품요약정보
ITEM_PRICE NUMBER(7,0) NOT NULL, --상품가격
ITEM_IMAGE VARCHAR2(50) NOT NULL, --상품이미지
ITEM_SPEC VARCHAR2(50) NULL, -- 크기, 무게
ITEM_TASTE VARCHAR2(50) NULL --색, 음식 맛
);
----------------------------
--CART(상품테이블)
-----------------------------
CREATE TABLE CART
(
CART_CODE NUMBER(10,0) PRIMARY KEY, ---상품삭제넘버
MEMBER_CODE VARCHAR2(20) NOT NULL, --- 유저아이디
CART_AMOUNT NUMBER(2,0) NOT NULL, ---상품수량
ITEM_SPEC VARCHAR2(50) NULL, -- 크기, 무게,색
ITEM_TASTE VARCHAR2(50) NULL  --음식 맛
);
----------------------------
--ITEM_FAVORIT (상품 찜목록)
-----------------------------
CREATE TABLE ITEM_FAVORIT
(
MEMBER_CODE VARCHAR2(20) NOT NULL,  --유저 아이디
ITEM_CODE VARCHAR2(10) NOT NULL, -- 상품 코드
CONSTRAINT G_FAVORIT PRIMARY KEY
(ITEM_CODE,MEMBER_CODE)
);

----------------------------
--ORDERINFO(주문테이블) ---결제하는 곳 금액만 있으면 되니깐 주문상품에 있는 것(상품금액*금액 다더해서 주문금액 총테이블 넣으면 될듯 결제로직 자바에 있음.)주문내역 WHERE USERID=1
-----------------------------

     CREATE TABLE ORDERINFO
  (  
ORDERINFO_CODE NUMBER(10,0) PRIMARY KEY, --주문테이블번호고 이번호로 삭제 기능 기본키고 
MEMBER_CODE VARCHAR2(20)NOT NULL, --아이디
ORDERINFO_ORDERNAME VARCHAR2(10) NOT NULL, --주문자이름
ORDERINFO_POST VARCHAR2(5) NOT NULL, --배송지우편번호
ORDERINFO_ADDR1 VARCHAR2(500) NOT NULL, --배송지주소
ORDERINFO_ADDR2 VARCHAR2(500) NOT NULL, --배송지상세주소
ORDERINFO_PHONE VARCHAR2(11) NOT NULL, --배송자전화번호
ORDERINFO_PAYMETHOD VARCHAR2(30) NOT NULL, --결제방법
ORDERINFO_ORDERDAY DATE  DEFAULT SYSDATE --결제날
  );     
-----------------------
--MEMBER(회원정보
-----------------------------
CREATE TABLE MEMBER
(
MEMBER_CODE VARCHAR2(10) PRIMARY KEY, --회원 아이디
MEMBER_PASSWD VARCHAR2(10) NOT NULL, --회원 비밀번호
MEMBER_NAME VARCHAR2(10) NOT NULL, --회원이름
MEMBER_POST VARCHAR2(6) NOT NULL, --회원우편번호
MEMBER_ADDR1 VARCHAR2(500) NOT NULL, --회원주소
MEMBER_ADDR2 VARCHAR2(500) NOT NULL, --회원상세주소
MEMBER_PHONE1 VARCHAR2(3) NOT NULL, --회원 전화번호
MEMBER_PHONE2 VARCHAR2(4) NOT NULL, --회원 전화번호
MEMBER_PHONE3 VARCHAR2(4) NOT NULL, --회원 전화번호
MEMBER_EMAIL1 VARCHAR2(20) NOT NULL, --회원 이메일
MEMBER_EMAIL2 VARCHAR2(20) NOT NULL --회원 이메일
);
----------------------------
--TOUR
-----------------------------
CREATE TABLE TOUR
(
TOUR_CODE NUMBER(10,0) PRIMARY KEY, --축제번호
TOUR_NAME VARCHAR2(100) NOT NULL, --축제이름
TOUR_IMAGE VARCHAR2(100) NOT NULL, --축제 이미지
TOUR_INFO VARCHAR2(2000) NOT NULL, --축제설명
TOUR_DAY DATE DEFAULT SYSDATE --축제일
);	
----------------------------
--T_FAVORITE
----------------------------
CREATE TABLE TOUR_FAVORITE
(
TOUR_CODE NUMBER(10,0) NOT NULL,  --축제번호
MEMBER_CODE VARCHAR2(20) NOT NULL, --회원아이디
CONSTRAINT TOUR_FAVORITE PRIMARY KEY
(TOUR_CODE,MEMBER_CODE)
);
----------------------------------------
----------------------------------------
CREATE TABLE ORDERITEM --(주문상품테이블) (여기서 금액만 넘어감)
(
ORDERITEM_CODE NUMBER(10,0) PRIMARY KEY, --이걸로 오더인포에서 주문할꺼임
CART_CODE NUMBER(10,0) NOT NULL, --카트코드에 있는걸로 스펙(크기,무게,색 설정한거랑) 테이스트(맛) 정한거 끌고와야함
ITEM_CODE VARCHAR2(10) NOT NULL, --카트코드에 아이템코드와 일치하는지 확인해야함
ORDERINFO_CODE NUMBER(10,0) NOT NULL,
ITEM_CATEGORY VARCHAR2(20) NOT NULL,
MEMBER_CODE VARCHAR2(20) NOT NULL,
ORDER_NAME VARCHAR2(50) NOT NULL,
CART_AMOUNT  NUMBER(2,0) NOT NULL,
ITEM_PRICE NUMBER(7,0) NOT NULL,
ITEM_IMAGE VARCHAR2(50) NOT NULL,
ITEM_SPEC CHAR(10) NOT NULL, --크기, 무게,색
ITEM_TASTE VARCHAR2(10) NOT NULL --음식 맛
);