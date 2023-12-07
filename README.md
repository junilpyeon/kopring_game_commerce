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
#### 로그인 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Login)" >상세보기 - WIKI 이동</a>
- 

## 🧑‍🤝‍🧑 세팅 방법
#### docker 세팅
- 도커 Desktop 파일 설치 https://hub.docker.com/
- docker-compose up 명령어 터미널에서 실행, ready for connections 찍히는 것 확인
- Mysql URL 에러 처리 :
  - docker exec -it mysql-local bash (터미널에서 도커 컨테이너 들어가기)
  - mysql -uroot -p (사용자 정보 확인)
  - SELECT user, host FROM mysql.user; (콘솔에서 확인)
  - SELECT VERSION(); (버전확인)
