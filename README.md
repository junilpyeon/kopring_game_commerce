# kopring_game_commerce
코프링 게임 커머스웹


## 🖥️ 프로젝트 소개
kotlin + spring 서버와 
react 프론트서버 개발 스터디를 위한 쇼핑사이트 개발
<br>

## 🕰️ 개발 기간

### 🧑‍🤝‍🧑 맴버구성

### ⚙️ 개발 환경
- `Java 17`
- `JDK 1.8.0`
- **IDE** : STS 3.9
- **Framework** : Springboot(2.x)
- **Database** : H2 DB(11xe)
- **ORM** : Mybatis

## 📌 주요 기능
#### 로그인
#### 게임기능
-음식먹이기
-쓰다듬기
-레벨업
#### 최저가 비교 기능 

## 🧑‍🤝‍🧑 세팅 방법
#### docker 세팅
- 도커 Desktop 파일 설치 https://hub.docker.com/
- docker-compose up 명령어 터미널에서 실행, ready for connections 찍히는 것 확인
1. Mysql URL 에러 처리 :
  - docker exec -it mysql-local bash (터미널에서 도커 컨테이너 들어가기)
  - mysql -uroot -p (사용자 정보 확인)
  - SELECT user, host FROM mysql.user; (콘솔에서 확인)
  - SELECT VERSION(); (버전확인)
2. java.sql.SQLSyntaxErrorException: Access denied for user 'kodmin'@'%' to database 'myapp_db' 에
  - CREATE USER 'kodmin'@'localhost' IDENTIFIED BY 'your_secure_password'; (계정 생성)
  - GRANT ALL PRIVILEGES ON myapp_db.* TO 'kodmin'@'localhost'; (계정 권한 부여)
  - FLUSH PRIVILEGES; (바로 적용)
3. Unknown database 'myapp_db' 에러
  - CREATE DATABASE myapp_db; (계정 생성)
  - GRANT ALL PRIVILEGES ON myapp_db.* TO 'kodmin'@'%'; (권한 부여)
