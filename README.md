
# [도서 쇼핑몰 봄숲]

   작가와 소통 가능한 도서 쇼핑몰 '봄숲'.    
   코로나 시대에 온라인 서점에서 작가와 다이렉트로 소통 할 수 있는 공간이 생긴다면 독자들은 줄어든 작가와의 만남이나 팬싸인회에서 오던 갈증을 채울 수 있고, 영세 작가에게는 또 다른 기회의 장이 될 수 있을 것 같아 작가와 소통할수 있는 도서 쇼핑몰을 기획하게 되었습니다.
   
<img width="1200" alt="저장" src="https://user-images.githubusercontent.com/86585267/153936039-fb88ebb1-8693-465f-ab11-05a5bf0ad2a1.png">



* ## 개발 기간
    2021.09.15 ~ 2021.11.17
* ## 설계의 주안점

   작가 인증, 독자와 작가의 소통 기능, 도서 추천 기능

* ## 사용 기술 및 개발환경

   - Server : Apache Tomcat 9.0    
   - DataBase : Oracle 11g  
   - Development Tool : sqlDeveloper, Visual Studio code, Eclipse     
   - Development Language : JAVA, HTML5, CSS3, JavaScript, jQuery, Ajax    
   - Team Coop : Github, ERDCloud, Figma, Draw.io    
   - Open API : PostCodify, Iamport, Chart.js     

* ## 역할 분담
   - 김보미 : 도서 검색 기능, 검색관련 카테고리 및 정렬기능, 도서 상세 조회, 도서 별점기능, 도서 댓글 및 대댓글 기능    
   - **김소민 : 메인 도서 추천 카테고리(이주의 책/신간 도서/화제의 책/오늘의 책/베스트 셀러), 장바구니(CRUD),주문 페이지,    
       할인/결제 기능**    
   - 윤용한 : 회원 탈퇴신청 관리 기능, 회원 등급 관리 기능, 통계 그래프, 배송환불현황관리, 책 등록, 오늘의 책 등록    
  - 정다정 : 메인카테고리 마우스오버시 드롭다운 기능, 고객센터 게시글(파일포함) 등록/수정/삭제/파일다운로드, 작가마이페이지 정보수정/탈퇴/답변 달기     
* ## 구현 기능

   - [메인] : 로그인, 회원가입, 도서 검색(검색어 입력, 카테고리 클릭), **추천 카테고리 클릭시 해당 상세페이지 이동(DB 기반 도서 추천 기능)**

  - [마이페이지] : -일반회원 : 정보 수정/회원 탈퇴, 주문내역 확인, 게시판 바로가기
            - 작가회원 : 정보 수정/회원 탈퇴, 내도서 리스트, 게시글 답변 작성

  - [도서] : 도서 검색 기능, 검색관련 카테고리(대분류/소분류) 및 정렬(인기/신상/최고가/저가순)기능, 도서 상세 조회, 도서 별점기능, 도서 댓글 및 대댓글 기능

  - **[장바구니] : 담기,삭제,수량 변경,상품 정렬,총 결제 예상 금액 / 주문 및 결제 : 주소 입력(회원주소/새주소), 할인(쿠폰), 결제 기능(카카오/신용카드)**

  - [고객센터] : FAQ, 1:1문의/작가소통 게시판/작가인증 게시판 게시글 작성/수정/삭제**

  - [관리자페이지] : 회원 탈퇴신청 관리 기능, 회원 등급 관리 기능, 통계 그래프, 배송환불현황관리, 책 등록, 오늘의 책 등록

* ## 팀 ERD
   - [click here](https://www.erdcloud.com/d/LNg3in7EjpjLvkrvB)
