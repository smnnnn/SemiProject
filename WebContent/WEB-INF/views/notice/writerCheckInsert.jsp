<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- ajax는 jquery 추가해야함 -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
<!-- 외부 스타일 시트 -->
<link href="${ contextPath }/resources/css/notice/writerCheckInsert.css" rel="stylesheet">
<title>작가인증게시판</title>
</head>
<body>
	<!-- 메뉴바 -->
	<jsp:include page="/WEB-INF/views/common/menubar.jsp" />

	 <div class="csarea wrapper">
        <!-- cs 카테고리 -->
		<jsp:include page="/WEB-INF/views/notice/csCategory.jsp" />
        
        <div class="content">
            <div class="wcheck_header">작가 인증게시판</div>
            <div class="wcheck_ment">
                <ul>
                    <li>평일 오후 5시 이후 신청은 당일 확인이 어려울 수 있습니다.</li>
                    <li>토, 일요일 및 공휴일 신청은 평일 운영 시간 내 순차적으로 확인해드리겠습니다.</li>
                    <li>작가 인증 서류 확인시 다소 시간이 걸릴 수도 있으니 이점 양해바랍니다.</li>
                </ul>
            </div>

            <form class="wc_info" <%-- action="${ contextPath }/w-check/insert" --%> method="post" enctype="multipart/form-data">
                <div class="wc_titlearea">
                    <span class="wc_title">제목</span>
                    <span class="wc_title2">
                    	<input type="text" placeholder="작가 인증 신청합니다." name="title" required>
                    </span>
                </div>

                <div class="wc_contentarea">
                    <span class="wc_content">내용</span>
                    <div class="wc_content2">
                        <textarea name="content" required></textarea>
                    </div>
                </div>
                
                <div class="wc_bookarea">
                    <div class="wc_book">내도서</div>
                    <div class="wc_book2">
                        <fieldset class="wc_search">
	                        <!-- <label>도서검색 :</label> -->
	                        <select id="wc_type">
	                        	<option value="title">제목</option>
	                        	<option value="writer">작가</option>
	                        </select>
	                        <input type="text" id="wc_input">
	                        <button type="button" id="wc_btn">검색하기</button>   
                        </fieldset>
                        <select name="selectbook" id="wc_select">
                        	<option>▼ 도서선택 ▼</option>
                        </select>
                        <textarea id="wc_textarea"></textarea>                       
                    </div>
                </div>

                <div class="wc_filearea">
                    <span class="wc_file">파일 첨부</span>
                    <div class="wc_file2">
                        <span class="wc_uplode"><input type="file" name="file1"></span>
                        <span class="wc_uplode"><input type="file" name="file2"></span>
                        <ul>
                            <li>인증서류 ex) 출판사 계약서, 저작권 등록증 등</li>
                            <li>첨부가능 용량은 파일당 5MB 미만이며, 최대 2개까지 가능합니다.</li>
                            <li>첨부가능 파일확장자 : jpg, gif, bmp, png</li>
                            <li>첨부파일 중 개인정보가 포함되어 있는 파일은 상담 완료 후 즉각 파기하며, 상담 외의 목적으로는 사용되지 않습니다.</li>
                        </ul>
                    </div>
                </div>
                <div class="wc_btn">
                    <button type="button" onclick="location.href='${ contextPath }/w-check'">취소</button>
                    <button type="submit">등록</button>
                </div>
            </form>
        </div>
        <!-- 광고  -->
		<jsp:include page="/WEB-INF/views/common/adArea.jsp" />
    </div>

	<!-- footer -->
	<jsp:include page="/WEB-INF/views/common/footer.jsp" />
	
	<script>
		/*
		<fieldset class="wc_search">
	    	<label>도서검색 :</label>
	    	<input type="text" id="wc_input">
	    	<button type="button" id="wc_btn">검색하기</button>   
		</fieldset>
		<select name="selectbook" id="wc_select">
			<option>▼ 도서선택 ▼</option>
		</select>
		<textarea id="wc_textarea"></textarea>       
		*/
		$(function(){
			$('#wc_btn').click(function(){
				$.ajax({
					url : "${ pageContext.servletContext.contextPath }/w-check/insert",
					data : { type : $('#wc_type').val(), input : $("#wc_input").val( ) },
					dataType : "json",
					type : "get",
					success : function(list) {
						console.log(list);
					},
					error : function(e) {
						console.log(e);
					}
					
					
					
				});
			});
		});
	
	
	
	
	
	
	
	
	
	
	
	</script>
</body>
</html>