--  平台的用户权限






/**
 创建功能菜单
 */


 create table huadou_mennu(
   huadou_id INT NOT NULL AUTO_INCREMENT,
   huadou_name VARCHAR(100) NOT NULL,
   huadou_parentId VARCHAR(40) NOT NULL,
   create_data DATE,
   update_data DATA ,
   user_id VARCHAR ,
   PRIMARY KEY ( huadou_id )
);