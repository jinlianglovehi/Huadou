--  平台的用户权限






/**
 创建功能菜单
 */

-- DELETE  TABLE  huadou_menu ;
 create table huadou_mennu(
   huadou_id VARCHAR (20) NOT NULL ,
   huadou_name VARCHAR(100) NOT NULL,
   huadou_parentId VARCHAR(40) NOT NULL,
   create_data DATE,
   update_data DATE ,
   user_id VARCHAR ,
   PRIMARY KEY ( huadou_id )
);