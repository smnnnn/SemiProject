package member.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import admin.model.vo.GradeList;
import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberService {
		
	private MemberDao memberDao = new MemberDao();

	public Member loginMember(String userId, String userPwd) {
		Connection conn = getConnection();
		
		Member loginMember = memberDao.loginMember(conn, userId, userPwd);
		
		close(conn);
		
		return loginMember;
	}

	public int insertMember(Member member) {
		Connection conn = getConnection();
		
		int result = memberDao.insertMember(conn, member);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public Member updateMember(Member member) {
		Connection conn = getConnection();
		Member updatedMember = null;
		
		int result = memberDao.updateMember(conn, member);
		
		if(result > 0) {
			updatedMember = memberDao.selectMember(conn, member.getUserNo());
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return updatedMember;
	}

	public Member updatePwd(int userNo, String userPwd, String newPwd) {
		Connection conn = getConnection();
		Member updatedMember = null;
		
		int result = memberDao.updatePwd(conn, userNo, userPwd, newPwd);
		
		if(result > 0) {
			updatedMember = memberDao.selectMember(conn, userNo);
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);		
		
		return updatedMember;
	}
	
	public int deleteAccount(int userNo/*, String dissatisfaction*/) {
		Connection conn = getConnection();
		// Member updatedMember = null;
		
		int result = memberDao.deleteAccount(conn, userNo/*, dissatisfaction*/);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public Member searchId(String userName, String userEmail) {
		Connection conn = getConnection();
		
		Member result = memberDao.searchId(conn, userName, userEmail);
		
		close(conn);
				
		return result;
	}	

	public Member searchPw(String userId, String userName, String userEmail) {
		Connection conn = getConnection();
		
		Member result = memberDao.searchPw(conn, userId, userName, userEmail);
		
		close(conn);		
		
		return result;
	}
	
	public Member memberLogin(String userId, String userName, String userEmail) {
		Connection conn = getConnection();
		
		Member result = memberDao.memberLogin(conn, userId, userName, userEmail);
		
		close(conn);
		
		return null;
	}
	
	
	public List<Member> nSelectList() {
		Connection conn = getConnection();
		List<Member> memberList = memberDao.nSelectList(conn);
				 
		close(conn);		
		
		return memberList;
	}

	public int nUpdateMember(int userNo) {
		Connection conn = getConnection();
		int result = memberDao.nUpdateMember(conn, userNo);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}

	public int nDeleteMember(int userNo) {
		Connection conn = getConnection();
		int result = memberDao.uDeleteMember(conn, userNo);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
	}

	public List<GradeList> gSelectList() {
		Connection conn = getConnection();
		List<GradeList> gradeList = memberDao.gSelectList(conn);
		
		close(conn);
		
		return gradeList;
	}

	public int gUpdateMember(int uNo, int wNo) {
		Connection conn = getConnection();
		int result = memberDao.gUpdateMember(conn, uNo);
		int result2 = memberDao.gUpdate2Member(conn, wNo);
		if(result > 0 && result2 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public int gDeleteMember(int wNo) {
		Connection conn= getConnection();
		int result = memberDao.gDeleteMember(conn, wNo);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		

		return result;
	}

	public int idCheck(String userId) {
		Connection conn = getConnection();
		
		int result = memberDao.idCheck(conn, userId);
		
		close(conn);
		
		return result;
	}

	public int nicknameCheck(String userNickname) {
		Connection conn = getConnection();
		
		int result = memberDao.nicknameCheck(conn, userNickname);
		
		close(conn);
		
		return result;
	}

	public Member checkClient(String userPwd) {
		Connection conn = getConnection();
		
		
		
		return null;
	}

	// 회원탈퇴
	public Member deleteAccount2(/*String dissatisfaction, */String userId, String userPwd) {
		Connection conn = getConnection();
		
		Member result = memberDao.deleteAccount2(conn/*, dissatisfaction*/, userId, userPwd);
		
		close(conn);
				
		return result;
	}

	// 로그인 유저
	public Member selectMember(int user_no) {
		Connection conn = getConnection();
		
		Member member = memberDao.selectMember(conn, user_no);
		
		close(conn);
		
		return member;
	}

	// 로그인 유저 찾아오기
	public Member selectMember2(int user_no) {
		Connection conn = getConnection();
		
		Member member = memberDao.selectMember2(conn, user_no);
		
		close(conn);
		
		return member;
	}

}
