/** 创建数据表*/

--     private int id ;
--
--     private String menuName ;// 菜单名称
--
--     private int parentId ;// 父菜单id
--     private int  userId ; //某一个用户的菜单名称;
--
--     private Date createData ;
--     private Date updateData ;
DROP TABLE IF EXISTS menu_item;
COMMIT ;

-- 创建表数据
CREATE TABLE IF NOT EXISTS menu_item(
   id   VARCHAR (40) not NULL   ,
   menuName VARCHAR(20) NOT NULL,
   parentId VARCHAR (40)DEFAULT 0,
   userId  INT  ,
   create_data DATE,
   update_data DATE,
   imageclass VARCHAR (20),
   menuType INT ,
   url VARCHAR (30),
   PRIMARY KEY (id)
)  DEFAULT CHARSET=utf8;

COMMIT ;
-- 添加数据

-- 插入数据
INSERT INTO menu_item (id, menuName , parentId,userId,imageclass,menuType)
                       VALUES
                       ('74862f5087f04118847f0fbf19f2ba3a' ,'首页', '0',2 ,'fa fa-home',1);

COMMIT ;

INSERT INTO menu_item (id, menuName ,url, parentId,userId,imageclass,menuType)
                       VALUES
                       ('9e232206edf642d89c706e297e7d45d5' ,'图表','/menu/frame/pager_chart', '74862f5087f04118847f0fbf19f2ba3a',2,'fa fa-adjust',2 );





