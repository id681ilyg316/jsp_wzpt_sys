package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Post;
import dao.PostDao;
import dao.UserDao;
//��ȡ����
@SuppressWarnings("serial")
public class DeletePostServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/plain;charset=utf-8");
		PrintWriter out=resp.getWriter();
		String id=req.getParameter("id");
		PostDao postDao = new PostDao();
		postDao.delPost(Integer.parseInt(id));
		out.print("删除成功！");
	}

	@SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	    	       

	}

}
