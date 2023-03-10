--
ALTER TABLE ITEM_FAVORIT ADD CONSTRAINT ITEM_FAVORIT_ITEM_CODE_FK FOREIGN KEY(ITEM_CODE)
REFERENCES ITEM(ITEM_CODE); 

ALTER TABLE ITEM_FAVORIT ADD CONSTRAINT ITEM_FAVORIT_MEMBER_CODE_FK FOREIGN KEY(MEMBER_CODE)
   REFERENCES MEMBER(MEMBER_CODE) ON DELETE CASCADE;

ALTER TABLE ORDERINFO
ADD CONSTRAINT ORDERINFO_MEMBER_CODE_FK FOREIGN KEY(MEMBER_CODE)
REFERENCES MEMBER(MEMBER_CODE) ON DELETE CASCADE;

ALTER TABLE CART
ADD CONSTRAINT CART_MEMBER_CODE_FK FOREIGN KEY (MEMBER_CODE) REFERENCES MEMBER(MEMBER_CODE) ON DELETE CASCADE;

 create sequence cart_seq;
create sequence orderInfo_seq;   

ALTER TABLE TOUR_FAVORITE
ADD CONSTRAINT TOUR_FAVORITE_CODE_FK FOREIGN KEY(TOUR_CODE) REFERENCES TOUR(TOUR_CODE) ON DELETE CASCADE;



ALTER TABLE ORDERITEM
ADD CONSTRAINT ORDERITEM_MEMBER_CODE_FK FOREIGN KEY(MEMBER_CODE)
   REFERENCES MEMBER(MEMBER_CODE);

ALTER TABLE ORDERITEM
ADD CONSTRAINT ORDERITEM_ORDERINFO_CODE_FK FOREIGN KEY(ORDERINFO_CODE)
   REFERENCES ORDERINFO(ORDERINFO_CODE);

