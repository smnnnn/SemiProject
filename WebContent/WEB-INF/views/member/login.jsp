<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/menubar.jsp" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bomsoup login</title>
    <link href="resources/css/login-style.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
    <!-- favicon (Real Favicon Generator 등에서 가공 필요) -->
    <link rel="icon" type="image/x-icon" href="resources/image/khfavicon.ico">
    <!--웹 폰트-->
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">
    <!-- 외부 스타일 시트 -->
	<link href="<%= request.getContextPath() %>/resources/css/login-style.css" rel="stylesheet">
</head>
<body>
    <div id="top">
        <header class="page-header">
            <!--
            <h1>
                <a href="#">
                    <img class="logo" src="image/logo.jpg" alt="Bomsoup">
                </a>
            </h1>
            -->
            <nav>
                <ul class="main-nav">
                    <li><a href="login.html">로그인</a></li>
                    <li><a href="joinmembership.html">회원가입</a></li>
                    <li><a href="#">마이페이지</a></li>
                    <li><a href="#">장바구니</a></li>
                    <li><a href="#">고객센터</a></li>
                </ul>
            </nav>
        </header>
        <!-- 페이지 제목 -->
        <div class="mainlogo wrapper">
            <h2 class="page-title">
                <a href="#"><img class="logo" src="resources/image/logo.png" alt="home logo"></a>
                    <select class="textbox" id="nationality">
                        <option value="writer" class="so">작가검색</option>
                        <option value="bk" class="so">도서검색</option>
                        <option value="Search" class="so" selected>통합검색</option>
                    </select type="submit">                                    
                <input type="text" class="textbox">
                <a href="#"><input type="button" class="textbox2" value="검색"></a>
            </h2>
        </div>        
        <div class="topline">
        </div>
    </div>
    <div class="main-center">
        <fieldset class="lofd">
            <legend id="lolegend">로그인</legend>
                <tr>
                    <td><input type="text" class="textbox" id="loginid" placeholder="아이디를 입력하세요"></td><br><br>
                </tr>
                <tr>
                    <td><input type="password" class="textbox" id="loginps" placeholder="비밀번호를 입력하세요"></td><br>                   
                </tr><br>
                <tr>
                    <td>
                        <input type="radio"><label id="emailcheck"> 또는 E-Mail 저장 </label>
                        <a href="id.html"><input type="button" value="아이디 찾기" class="idb"></a>
                        <a href="password.html"><input type="button" value="비밀번호 찾기" class="psb"></a><br>
                    </td>
                </tr>
                <a href="joinmembership.html"><input type="button" value="봄숲 간편 회원가입" class="mbjoin"></a><br>
                <div class="imgdiv">
                    <a href="https://naver.com"><img class="naverlogo" src="resources/image/naver.jpg" alt="naver logo"></a>   
                    <a href="https://kakao.com"><img class="kakaologo" src="resources/image/kakao.jpg" alt="kako logo"></a>
                </div>
            </fieldset>
            <button id="lobut" onclick="lolo()">로그인</button>
            <script>
                function lolo() {
                    alert("로그인");
                    window.location.href = "login.html";
                }
            </script>
    </div>
    <footer>
        <div class="wrapper">
            <p><small>&copy; 2021 Bomsoup</small></p>
        </div>
    </footer>
</body>
</html>