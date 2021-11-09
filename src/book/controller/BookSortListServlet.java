package book.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.model.service.BookService;
import book.model.vo.Search;

/**
 * Servlet implementation class BookSortListServlet
 */
@WebServlet("/book/sort")
public class BookSortListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookSortListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 기본 1page부터 시작
		int page = 1;
		// 페이지 전환 시 전달 받은 페이지가 있다면 해당 page 적용
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		BookService bookService = new BookService();
		
		// if(request.getParameter("category") != null) -> if문 통과 시 값 추출
		
		
		String sort = request.getParameter("sort");
		String searchCondition = request.getParameter("searchCondition");
		String searchValue = request.getParameter("searchValue");
		Search search = new Search(searchCondition, searchValue, sort);
		
		List<String> categoryList = bookService.categoryList(search);
		Map<String, Object> map = bookService.selectSortList(page, search);
		
		request.setAttribute("pi", map.get("pi"));
		request.setAttribute("bookList", map.get("bookList"));
		request.setAttribute("categoryList", categoryList);
		request.setAttribute("sort", sort);
		
		request.getRequestDispatcher("/WEB-INF/views/book/bookListView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
