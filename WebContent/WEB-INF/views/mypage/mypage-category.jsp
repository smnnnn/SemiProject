<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bomsoup login</title>
    <link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
    <!-- favicon (Real Favicon Generator 등에서 가공 필요) -->
    <link rel="icon" type="image/x-icon" href="resources/image/khfavicon.ico">
    <!-- 외부 스타일 시트 -->
    <link href="<%= request.getContextPath() %>/resources/css/mypage-style.css" rel="stylesheet">
</head>
<body>
	<!-- mypage-category 추가 -->
    <aside class="category">
        <div class="ca-head">마이페이지</div>
        <div class="area1"><a class="ca-top" href="#">개인정보 수정</a>
            <ul class="ca-list">
                <li><a href="#">회원정보 수정</a></li>
                <li><a href="#">회원탈퇴</a></li>
                <li><a href="#">회원주소록</a></li>
                <li><a href="#">마이리뷰</a></li>
                <li><a href="#">내쿠폰</a></li>
            </ul>
        </div>
        <div class="area2"><a class="ca-top" href="#">주문내역</a>
            <ul class="ca-list">
                <li><a href="#">주문 조회/변경/취소</a></li>
                <li><a href="#">반품/교환 내역</a></li>
                <li><a href="#">취소 주문내역</a></li>
            </ul>
        </div>
        <div class="area3"><a class="ca-top" href="#">작가 소통게시판</a>
            <ul class="ca-list">
                <li><a href="#">내 작가 리스트</a></li>
                <li><a href="#">즐겨찾기 게시판</a></li>
                <li><a href="#">최근 대화 내역</a></li>
            </ul>
        </div>
        <div class="area4"><a class="ca-top" href="#">고객센터</a>
	        <ul class="ca-list">
	            <li><a href="#">나의 계정 도움말</a></li>
	            <li><a href="#">자주 묻는 질문 FAQ</a></li>
	            <li><a href="#">1:1 고객상담</a></li>
	        </ul>
	    </div>
        <div><img src="#">광고1</div>
        <div><img src="#">광고2</div>
    </aside>    
</body>
</html>