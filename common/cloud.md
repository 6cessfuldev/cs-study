# 클라우드

## 전통적이 배포 방식
- 컴퓨터 한 대에 하나의 OS
  
## 가상화 배포 방식
- 컴퓨터의 하드웨어를 소프트웨어적으로 구현
- 한대의 컴퓨터를 가지고 여러개의 OS를 구동할 수 있게

## 하이퍼바이저
- 하나의 시스템 상에서 가상 컴퓨터를 여러개 구동할 수 있도록 해주는 중간계층

## 장점
한대의 하드웨어로 여러 사용자들에게 독립적으로 클라우드 서비스 제공

## 단점
- 가상머신마다 일일일 설치해야 함

## 오프프레미스 방식
- 내가 아닌 다른 회사의 공급자가 호스팅하고 인터넷을 통해 사용자에게 제공되는 인프라, 플랫폼 또는 소프트웨어
- 자체 인프라나 하드웨어 설치 없어도 애플리케이션과 리소스에 쉽고 싸게 이용 가능

## 참고) 온프레미스 방식
- 네트워크 선까는 것부터 서버, 데이터베이스 설치 등을 모두 담당하는 방식

## IaaS
### Infrastructure-as-a-Service
- AWS의 EC2, NCP
- node.js, MongoDB등을 개발자가 직접 설치해야함
- 대신 특정 서비스에 종속되지 않음

## PaaS
### Platform-as-a-Service
- heroku
- 이미 필요한 실행환경과 데이터베이스가 설치되어 있음

## SaaS
### Software as a Service
- 완전한 서비스를 클라우드 서비스로부터 제공
- 구글DOCS

## IaaS와 PaaS의 차이
| | IaaS | PaaS |
|---------|---------|---------|
| 유연성| 높음| 낮음|
| 이식성| 높음| 낮음|
| 운영효율| 낮음|높음|

## 컨테이너
- 애플리케이션이 한 컴퓨팅 환경에서 다른 컴퓨팅 환경으로 빠르고 안정적으로 실행되도록 코드와 모든 종속성을 패키징하는 소프트웨의 표준 단위
- **OS를 공유**

## Docker
- 컨테이너 배포에 필요한 기능을 제공하는 플랫폼

## Docker의 요소
- 도커파일 : 패키지, 환경변수 설정 등을 기록한 파일. 이를 빌드해 도커 이미지로 변환
- 도커이미지 : 컨테이너 실행에 필요한 파일과 설정값, 데이터 등을 포함된 상태값, 하나의 이미지에서 여러개의 컨테이너를 생성할 수 있으며 컨테이너의 상태와는 무관하게 이미즌 그대로 존재
- 도커컨테이너 : 컨테이너가 실행시키면 도커이미지에 설정된 프로그램, 데이터 등이 실제 컴퓨팅자원과 연결
