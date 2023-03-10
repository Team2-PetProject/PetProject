---------------------------------------
--ITEM (�߽�) (��ǰ����Ʈ)!!!
---------------------------------------
CREATE TABLE ITEM
(
ITEM_CODE VARCHAR2(10) PRIMARY KEY, --��ǰ�ڵ�
ITEM_CATEGORY VARCHAR2(20) NOT NULL, --��ǰī�װ�
ITEM_NAME VARCHAR2(50) NOT NULL, --��ǰ�̸�
ITEM_INFO VARCHAR2(4000) NOT NULL, --��ǰ�������
ITEM_PRICE NUMBER(7,0) NOT NULL, --��ǰ����
ITEM_IMAGE VARCHAR2(50) NOT NULL, --��ǰ�̹���
ITEM_SPEC VARCHAR2(50) NULL, -- ũ��, ����
ITEM_TASTE VARCHAR2(50) NULL --��, ���� ��
);
----------------------------
--CART(��ǰ���̺�)
-----------------------------
CREATE TABLE CART
(
CART_CODE NUMBER(10,0) PRIMARY KEY, ---��ǰ�����ѹ�
MEMBER_CODE VARCHAR2(20) NOT NULL, --- �������̵�
CART_AMOUNT NUMBER(2,0) NOT NULL, ---��ǰ����
ITEM_SPEC VARCHAR2(50) NULL, -- ũ��, ����,��
ITEM_TASTE VARCHAR2(50) NULL  --���� ��
);
----------------------------
--ITEM_FAVORIT (��ǰ ����)
-----------------------------
CREATE TABLE ITEM_FAVORIT
(
MEMBER_CODE VARCHAR2(20) NOT NULL,  --���� ���̵�
ITEM_CODE VARCHAR2(10) NOT NULL, -- ��ǰ �ڵ�
CONSTRAINT G_FAVORIT PRIMARY KEY
(ITEM_CODE,MEMBER_CODE)
);

----------------------------
--ORDERINFO(�ֹ����̺�) ---�����ϴ� �� �ݾ׸� ������ �Ǵϱ� �ֹ���ǰ�� �ִ� ��(��ǰ�ݾ�*�ݾ� �ٴ��ؼ� �ֹ��ݾ� �����̺� ������ �ɵ� �������� �ڹٿ� ����.)�ֹ����� WHERE USERID=1
-----------------------------

     CREATE TABLE ORDERINFO
  (  
ORDERINFO_CODE NUMBER(10,0) PRIMARY KEY, --�ֹ����̺��ȣ�� �̹�ȣ�� ���� ��� �⺻Ű�� 
MEMBER_CODE VARCHAR2(20)NOT NULL, --���̵�
ORDERINFO_ORDERNAME VARCHAR2(10) NOT NULL, --�ֹ����̸�
ORDERINFO_POST VARCHAR2(5) NOT NULL, --����������ȣ
ORDERINFO_ADDR1 VARCHAR2(500) NOT NULL, --������ּ�
ORDERINFO_ADDR2 VARCHAR2(500) NOT NULL, --��������ּ�
ORDERINFO_PHONE VARCHAR2(11) NOT NULL, --�������ȭ��ȣ
ORDERINFO_PAYMETHOD VARCHAR2(30) NOT NULL, --�������
ORDERINFO_ORDERDAY DATE  DEFAULT SYSDATE --������
  );     
-----------------------
--MEMBER(ȸ������
-----------------------------
CREATE TABLE MEMBER
(
MEMBER_CODE VARCHAR2(10) PRIMARY KEY, --ȸ�� ���̵�
MEMBER_PASSWD VARCHAR2(10) NOT NULL, --ȸ�� ��й�ȣ
MEMBER_NAME VARCHAR2(10) NOT NULL, --ȸ���̸�
MEMBER_POST VARCHAR2(6) NOT NULL, --ȸ�������ȣ
MEMBER_ADDR1 VARCHAR2(500) NOT NULL, --ȸ���ּ�
MEMBER_ADDR2 VARCHAR2(500) NOT NULL, --ȸ�����ּ�
MEMBER_PHONE1 VARCHAR2(3) NOT NULL, --ȸ�� ��ȭ��ȣ
MEMBER_PHONE2 VARCHAR2(4) NOT NULL, --ȸ�� ��ȭ��ȣ
MEMBER_PHONE3 VARCHAR2(4) NOT NULL, --ȸ�� ��ȭ��ȣ
MEMBER_EMAIL1 VARCHAR2(20) NOT NULL, --ȸ�� �̸���
MEMBER_EMAIL2 VARCHAR2(20) NOT NULL --ȸ�� �̸���
);
----------------------------
--TOUR
-----------------------------
CREATE TABLE TOUR
(
TOUR_CODE NUMBER(10,0) PRIMARY KEY, --������ȣ
TOUR_NAME VARCHAR2(100) NOT NULL, --�����̸�
TOUR_IMAGE VARCHAR2(100) NOT NULL, --���� �̹���
TOUR_INFO VARCHAR2(2000) NOT NULL, --��������
TOUR_DAY DATE DEFAULT SYSDATE --������
);	
----------------------------
--T_FAVORITE
----------------------------
CREATE TABLE TOUR_FAVORITE
(
TOUR_CODE NUMBER(10,0) NOT NULL,  --������ȣ
MEMBER_CODE VARCHAR2(20) NOT NULL, --ȸ�����̵�
CONSTRAINT TOUR_FAVORITE PRIMARY KEY
(TOUR_CODE,MEMBER_CODE)
);
----------------------------------------
----------------------------------------
CREATE TABLE ORDERITEM --(�ֹ���ǰ���̺�) (���⼭ �ݾ׸� �Ѿ)
(
ORDERITEM_CODE NUMBER(10,0) PRIMARY KEY, --�̰ɷ� ������������ �ֹ��Ҳ���
CART_CODE NUMBER(10,0) NOT NULL, --īƮ�ڵ忡 �ִ°ɷ� ����(ũ��,����,�� �����ѰŶ�) ���̽�Ʈ(��) ���Ѱ� ����;���
ITEM_CODE VARCHAR2(10) NOT NULL, --īƮ�ڵ忡 �������ڵ�� ��ġ�ϴ��� Ȯ���ؾ���
ORDERINFO_CODE NUMBER(10,0) NOT NULL,
ITEM_CATEGORY VARCHAR2(20) NOT NULL,
MEMBER_CODE VARCHAR2(20) NOT NULL,
ORDER_NAME VARCHAR2(50) NOT NULL,
CART_AMOUNT  NUMBER(2,0) NOT NULL,
ITEM_PRICE NUMBER(7,0) NOT NULL,
ITEM_IMAGE VARCHAR2(50) NOT NULL,
ITEM_SPEC CHAR(10) NOT NULL, --ũ��, ����,��
ITEM_TASTE VARCHAR2(10) NOT NULL --���� ��
);