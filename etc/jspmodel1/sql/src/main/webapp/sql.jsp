<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
<title>sql</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>sql : Structured Query Language</h1>
<pre>
데이터베이스에서 데이터를 추출하고 조작하는 데에 사용하는 데이터 처리 언어
SQL은 무엇을 할 수 있나요?
SQL은 데이터베이스에 대해 쿼리를 실행할 수 있습니다.
SQL은 데이터베이스에서 데이터를 검색할 수 있습니다
SQL은 데이터베이스에 레코드를 삽입할 수 있습니다
SQL은 데이터베이스의 레코드를 업데이트할 수 있습니다
SQL은 데이터베이스에서 레코드를 삭제할 수 있습니다
SQL은 새로운 데이터베이스를 생성할 수 있습니다 => create database bbs
SQL은 데이터베이스에 새로운 테이블을 생성할 수 있습니다. 데이터를 담아주는 테이블
SQL은 데이터베이스에 저장 프로시저를 생성할 수 있습니다.
프로시저 : DB 에 대한 일련의 작업을 정리한 절차를 관계형 데이터베이스 관리 시스템에 저장한 것이다
SQL은 데이터베이스에 뷰를 생성할 수 있습니다 
SQL은 테이블, 프로시저 및 뷰에 대한 권한을 설정할 수 있습니다.

웹 사이트에서 SQL 사용
RDBMS 데이터베이스 프로그램(예: MS Access, SQL Server, MySQL)
PHP나 ASP와 같은 서버 측 스크립팅 언어를 사용하려면
SQL을 사용하여 원하는 데이터를 얻으려면
HTML / CSS를 사용하여 페이지 스타일을 지정하려면

관계형 데이터베이스

RDBMS는 관계형 데이터베이스 관리 시스템을 의미합니다.

RDBMS는 SQL의 기반이며, MS SQL Server, IBM DB2, Oracle, MySQL, Microsoft Access 
등 모든 최신 데이터베이스 시스템의 기반입니다.

CREATE DATABASE ldh;
ddl Data Definition Language 데이터 정의어

create : 데이터 베이스, 테이블 
alter : 데이블을 수정하는 역활
drop : 데이터베이스 테이블을 삭제 하는 역활
truncate : 테이블을 초기화 시키는 역활

DML (data manipulation language) 데이터 조작어
create read update delete
select : 데이터를 조회하는 역활을 한다
insert : 데이터를 삽입하는 역활을 한다
update : 데이터를 수정하는 역활을 한다
delete : 데이터를 삭제하는 역활을 한다

DCL (data control language): 데이터 제어어
데이터베이스에 접근하거나 객체에 권한을 준는 등의 역활
GRANT : 특정데이터베이스 사용자에게 특정 작업에 대한 수행권한을 부여
REVOKE : 특정데이터베이스 사용자에게 특정 작업에 대한 수행권한을 부여한걸 박탈,회수

트랜잭션 제어어(TCL : Transaction Control Language)
commit : 트랜잭션(데이터베이스의 상태를 변화시키기 위해서 수행하는 작업의 단위) 
작업이 정상적으로 완료되었음을 관리자에게 알려준다
rollback : 트랜잭션 작업이 비정상적으로 종료 되었을때 원래의 상태로 복구
SAVEPOINT : rpg게임에서 보스방앞에서 세이브 트랜잭션 전체를 롤백하지 않고도 특정한 지점으로 ROLLBACK



git
commit : git에 저장하는 단계
rollback : 업로드 하면서 원하지 않계 단계에 맞지 않을때 그걸 언느 시점으로 돌리는걸 

SQL 구문
데이터베이스에서 수행해야 하는 대부분의 작업은 SQL 문을 사용하여 수행됩니다.

SELECT * FROM user; 고객 테이블에서 모든 레코드를 선택하세요
SELECT CustomerName, City FROM Customers;
커스터머 테이블에서 도시, 커스텀명 데이터를 모두 추출

SELECT DISTINCT Country FROM Customers; 고객이 속한 나라중에 모든 국가를 열거
DISTINCT없다면 요점이 없이 수량대로 다나옵니다

WHERE => 레코드를 필터링하는 데 사용됩니다.
지정된 조건을 충족하는 레코드만 추출하는 데 사용됩니다.

SELECT * FROM Customers
WHERE Country='Mexico'; //멕시코만 출력

가장 중요한 SQL 명령 중 일부
SELECT- 데이터베이스에서 데이터를 추출합니다
UPDATE- 데이터베이스의 데이터를 업데이트합니다
DELETE- 데이터베이스에서 데이터를 삭제합니다
INSERT INTO- 데이터베이스에 새로운 데이터를 삽입합니다.
CREATE DATABASE- 새로운 데이터베이스를 생성합니다
ALTER DATABASE- 데이터베이스를 수정합니다
CREATE TABLE- 새 테이블을 만듭니다
ALTER TABLE- 테이블을 수정합니다
DROP TABLE- 테이블을 삭제합니다
CREATE INDEX- 인덱스(검색 키)를 생성합니다.
DROP INDEX- 인덱스를 삭제합니다

ORDER BY : 결과 집합을 오름차순이나 내림차순으로 정렬하는 데 사용됩니다.
가장 높은 가격부터 가장 낮은 가격 순으로 제품을 정렬하세요:
SELECT * FROM Products
ORDER BY Price DESC[내림차순(역순)]; ASC[일반적인 1부터 10까지]

AND 연산자 [그리고] LIKE "G%"
'G'로 시작하는 스페인의 모든 고객을 선택하세요:

SELECT * FROM Customers
WHERE Country = 'Spain' AND CustomerName LIKE 'G%';

or = 또는 지역변수
SELECT * FROM Customers 스페인에 서만 G R 둘다 출력
WHERE Country = 'Spain' AND (CustomerName LIKE 'G%' OR CustomerName LIKE 'R%');

SELECT * FROM Customers 스페인과 다른나라에서도 전역
WHERE Country = 'Spain' AND CustomerName LIKE 'G%' OR CustomerName LIKE 'R%';

NOT 연산자 : 반대 결과, 즉 부정 결과를 제공합니다.
SELECT * FROM Customers
WHERE NOT Country = 'Spain';//스페인을 제외한

부트스트랩에서 나오는 중요한 클래스 space-between(사이)
SELECT * FROM Customers
WHERE CustomerID BETWEEN 10 AND 60; 10 ~ 60

SELECT * FROM Customers
WHERE CustomerID NOT BETWEEN 10 AND 60; 10 ~ 60사이를 제외한 그외값

SELECT * FROM Customers
WHERE NOT CustomerID > 50;

안에 존재하는
SELECT * FROM Customers
WHERE City IN ('Paris', 'London'); 시티안에 파리 런던

SELECT * FROM Customers
WHERE City NOT IN ('Paris', 'London');시티안에 파리 런던아닌

INSERT INTO
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');

INSERT INTO
INSERT INTO Customers (CustomerName, ContactName, Address)
VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21');

INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES
('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway'),
('Greasy Burger', 'Per Olsen', 'Gateveien 15', 'Sandnes', '4306', 'Norway'),
('Tasty Tee', 'Finn Egan', 'Streetroad 19B', 'Liverpool', 'L1 0AA', 'UK');

NULL : NULL 값을 갖는 필드는 값이 없는 필드입니다.
테이블의 필드가 선택 사항인 경우 이 필드에 값을 추가하지 않고도 새 레코드를 삽입하거나 레코드를 업데이트할 수 있습니다. 
그런 다음 필드는 NULL 값으로 저장됩니다.

IS NOT NULL 구문

SQL UPDATE 문 : 테이블의 기존 레코드를 수정하는 데 사용됩니다.

UPDATE Customers
SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
WHERE bno = 1;

업데이트 경고! where를 생략하면 모두 업데이트 됩니다
UPDATE Customers
SET ContactName='Juan';

DELETE 문 : 테이블의 기존 레코드를 삭제하는 데 사용됩니다.
게시판에서 삭제방법 두가지  bno 거기에 순번을 선택해서 삭제

DELETE FROM Customers; 테이블 안에 내용을 비움

SELECT TOP 절
SELECT TOP 3 * FROM Customers;
Customers 테이블의 처음 3개 레코드만 선택하세요:

but 모두 지원하지는 않음
mysql일 경우
SELECT column_name(s)
FROM table_name
WHERE condition
LIMIT number;

오라ㅋ 
SELECT column_name(s)
FROM table_name
ORDER BY column_name(s)
FETCH FIRST number ROWS ONLY;

집계함수
MIN()- 선택된 열 내에서 가장 작은 값을 반환합니다.
SELECT MIN(Price)
FROM Products;

MAX()- 선택된 열 내에서 가장 큰 값을 반환합니다.

COUNT()- 집합의 행 수를 반환합니다.
SELECT COUNT(*) 지정된 기준과 일치하는 행의 수를 반환합니다.
FROM Products;

중복 무시[DISTINCT]
표에는 몇 가지 다른 가격이 있습니까 Products?
SELECT COUNT(DISTINCT Price)
FROM Products;

별칭사용
import matplotlib.pyplot as plt
열 이름을 "레코드 수"로 지정합니다.
SELECT COUNT(*) AS [Number of records]
FROM Products;

SUM()- 숫자 열의 총합을 반환합니다.
AVG()- 숫자 열의 평균 값을 반환합니다.

LIKE 연산자 : 지정된 패턴을 검색하는
SELECT * FROM Customers
WHERE CustomerName LIKE 'a%';

join
(INNER) JOIN: 두 테이블 모두에서 일치하는 값을 갖는 레코드를 반환합니다.
LEFT (OUTER) JOIN: 왼쪽 테이블의 모든 레코드와 오른쪽 테이블의 일치하는 레코드를 반환합니다.
RIGHT (OUTER) JOIN: 오른쪽 테이블의 모든 레코드와 왼쪽 테이블의 일치하는 레코드를 반환합니다.
FULL (OUTER) JOIN: 왼쪽 또는 오른쪽 테이블에 일치 항목이 있는 경우 모든 레코드를 반환합니다.

GROUP BY : "각 국가의 고객 수를 구하세요"와 같이 그룹화
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country;

EXISTS 연산자 : 하위 쿼리에 레코드가 존재하는지 테스트하는 데 사용됩니다.
하위 쿼리가 하나 이상의 레코드를 반환하면 연산자는 TRUE를 반환합니다 .
제품 가격이 20 미만인 공급업체를 나열합니다.

SELECT SupplierName
FROM Suppliers
WHERE EXISTS (SELECT ProductName FROM Products WHERE Products.SupplierID = Suppliers.supplierID AND Price < 20);

SELECT INTO : 한 테이블의 데이터를 새 테이블로 복사합니다.

SELECT * INTO CustomersBackup2017
FROM Customers;

SELECT * INTO CustomersBackup2017 IN 'Backup.mdb'
FROM Customers;

INSERT INTO SELECT : 한 테이블의 데이터를 복사하여 다른 테이블에 삽입

"공급업체"를 "고객"으로 복사합니다(모든 열을 채웁니다)
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
SELECT SupplierName, ContactName, Address, City, PostalCode, Country FROM Suppliers;

CASE 표현식 (sql에 if else)
SELECT OrderID, Quantity,
CASE
    WHEN Quantity > 30 THEN 'The quantity is greater than 30'
    WHEN Quantity = 30 THEN 'The quantity is 30'
    ELSE 'The quantity is under 30'
END AS QuantityText
FROM OrderDetails;

SQL 저장 프로시저 (sql 함수)
CREATE PROCEDURE sql을 위장한 함수
AS
SELECT * FROM Customers
GO;

EXEC  sql을 위장한 함수

sql주석 짧은 주석 --sql주석
jsp주석 <%-- --%>
java,vue,react,c = //,/**/
python  # ''''''
</pre>
</div>
</div>
</div>
</body>
</html>