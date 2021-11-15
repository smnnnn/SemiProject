package admin.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import admin.model.dao.ChartDao;

public class ChartService {
	private ChartDao chartDao = new ChartDao();


	public int seoulSelect() {
		Connection conn = getConnection();
		int result = chartDao.seoulSelect(conn);
		close(conn);
		return result;
	}

	public int incheonSelect() {
		Connection conn = getConnection();
		int result = chartDao.incheonSelect(conn);
		close(conn);
		return result;
	}

	public int gyeonggiSelect() {
		Connection conn = getConnection();
		int result = chartDao.gyeonggiSelect(conn);
		close(conn);
		return result;
	}


	public int gangwonSelect() {
		Connection conn = getConnection();
		int result = chartDao.gangwonSelect(conn);
		close(conn);
		return result;
	}


	public int gyeongsangSelect() {
		Connection conn = getConnection();
		int result = chartDao.gyeongsangSelect(conn);
		close(conn);
		return result;
	}


	public int chungcheongSelect() {
		Connection conn = getConnection();
		int result = chartDao.chungcheongSelect(conn);
		close(conn);
		return result;
	}


	public int jeollaSelect() {
		Connection conn = getConnection();
		int result = chartDao.jeollaSelect(conn);
		close(conn);
		return result;
	}


	public int jejuSelect() {
		Connection conn = getConnection();
		int result = chartDao.jejuSelect(conn);
		close(conn);
		return result;
	}

	public int manSelect() {
		Connection conn = getConnection();
		int result = chartDao.manSelect(conn);
		close(conn);
		return result;
	}
	public int man1Select() {
		Connection conn = getConnection();
		int result = chartDao.man1Select(conn);
		close(conn);
		return result;
	}
	public int man2Select() {
		Connection conn = getConnection();
		int result = chartDao.man2Select(conn);
		close(conn);
		return result;
	}public int man3Select() {
		Connection conn = getConnection();
		int result = chartDao.man3Select(conn);
		close(conn);
		return result;
	}public int man4Select() {
		Connection conn = getConnection();
		int result = chartDao.man4Select(conn);
		close(conn);
		return result;
	}public int man5Select() {
		Connection conn = getConnection();
		int result = chartDao.man5Select(conn);
		close(conn);
		return result;
	}public int man6Select() {
		Connection conn = getConnection();
		int result = chartDao.man6Select(conn);
		close(conn);
		return result;
	}
	
	public int womanSelect() {
		Connection conn = getConnection();
		int result = chartDao.womanSelect(conn);
		close(conn);
		return result;
	}
	public int woman1Select() {
		Connection conn = getConnection();
		int result = chartDao.woman1Select(conn);
		close(conn);
		return result;
	}
	public int woman2Select() {
		Connection conn = getConnection();
		int result = chartDao.woman2Select(conn);
		close(conn);
		return result;
	}
	public int woman3Select() {
		Connection conn = getConnection();
		int result = chartDao.woman3Select(conn);
		close(conn);
		return result;
	}
	public int woman4Select() {
		Connection conn = getConnection();
		int result = chartDao.woman4Select(conn);
		close(conn);
		return result;
	}
	public int woman5Select() {
		Connection conn = getConnection();
		int result = chartDao.woman5Select(conn);
		close(conn);
		return result;
	}
	public int woman6Select() {
		Connection conn = getConnection();
		int result = chartDao.woman6Select(conn);
		close(conn);
		return result;
	}


	

	
}
