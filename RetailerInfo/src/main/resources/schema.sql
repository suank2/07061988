DROP table ShopInfo;
create table ShopInfo(
      shopId int not null primary key,
      shopName varchar_ignorecase(50) not null,
      shopNumber varchar_ignorecase(50) not null,
      postalCode varchar_ignorecase(50) not null,
      latitude varchar_ignorecase(50) not null,
      longitude varchar_ignorecase(50) not null);
   