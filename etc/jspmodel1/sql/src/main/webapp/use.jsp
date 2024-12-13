<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
<div class="row">
<div class="col-md-12">
<h1>프로젝트까지 많이 사용</h1>
<pre>
CREATE DATABASE Statement 데이터 베이스 생성

CREATE DATABASE databasename;

DROP DATABASE Statement 데이터 베이스 삭제

BACKUP DATABASE Statement
BACKUP DATABASE testDB
TO DISK = 'D:\backups\testDB.bak';

테이블 만들기
CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
);

복사하여 테이블 만들기
CREATE TABLE new_table_name AS
    SELECT column1, column2,...
    FROM existing_table_name
    WHERE ....;

drop 완전삭제 delete 알맹이만 남김

테이블 잘라내기
TRUNCATE TABLE table_name;
테이블 자체가 아닌 테이블 내부의 데이터를 삭제하는 데 사용됩니다.

ALTER TABLE 
기존 테이블에 열을 추가, 삭제 또는 수정하는 데 사용됩니다.

ALTER TABLE boards
ADD pic varchar(255);


제약조건 : 테이블의 데이터에 대한 규칙을 지정하는 데 사용됩니다.
테이블에 들어갈 수 있는 데이터 유형을 제한하는 데 사용됩니다
이를 통해 테이블의 데이터의 정확성과 신뢰성이 보장됩니다
제약 조건과 데이터 작업 사이에 위반 사항이 있는 경우 작업이 중단됩니다.

NOT NULL- 열이 NULL 값을 가질 수 없음을 보장합니다.
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255) NOT NULL,
    Age int
);

UNIQUE- 열의 모든 값이 서로 다른지 확인합니다.
열의 모든 값이 서로 다르다는 것을 보장합니다.
Persons" 테이블이 생성될 때 "ID" 열에 제약 조건을 생성합니다.
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    UNIQUE (ID)
);

PRIMARY KEYNOT NULL- a 와 . 의 조합 UNIQUE. 테이블의 각 행을 고유하게 식별합니다.
CREATE TABLE Persons (
    ID int NOT NULL PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);

FOREIGN KEY - 테이블 간 링크를 파괴하는 작업을 방지합니다.
CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
);


CHECK- 열의 값이 특정 조건을 만족하는지 확인합니다.
19금 가입
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CHECK (Age>=18)
);


DEFAULT- 값이 지정되지 않은 경우 열에 대한 기본값을 설정합니다.
값을 지정하지 않으면 모든 새 레코드에 기본값이 추가됩니다.
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    City varchar(255) DEFAULT 'Sandnes'
);

CREATE TABLE Orders (
    ID int NOT NULL,
    OrderNumber int NOT NULL,
    OrderDate date DEFAULT GETDATE()
);

자동증가필드 : 기본적으로 시작 값은 AUTO_INCREMENT1이며, 새 레코드가 생길 때마다 1씩 증가합니다.
CREATE TABLE Persons (
    Personid int NOT NULL AUTO_INCREMENT,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (Personid)
);

CREATE INDEX- 데이터베이스에서 매우 빠르게 데이터를 생성하고 검색하는 데 사용됩니다.
</pre>

</div>
</div>
</div>
