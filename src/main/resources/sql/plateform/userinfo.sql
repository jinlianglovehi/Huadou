create table user_info(
   id VARCHAR(20) NOT NULL  ,
   username VARCHAR(100) NOT NULL,
   password VARCHAR (20)not NULL ,
   age  INT  ,
   phonenumber VARCHAR (25) ,
   create_data DATE,
   update_data DATE,
   PRIMARY KEY (id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;