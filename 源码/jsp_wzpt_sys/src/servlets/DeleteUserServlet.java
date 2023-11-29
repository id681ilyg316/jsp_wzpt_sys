package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import bean.Comment;
import bean.Post;
import bean.User;
import dao.CommentDao;
import dao.PostDao;
import dao.UserDao;
//��ȡ����
@SuppressWarnings("serial")
public class DeleteUserServlet extends HttpServlet{
		
	    @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	req.setCharacterEncoding("utf-8");
	    	 resp.setContentType("text/plain;charset=utf-8");
	    	 PrintWriter out=resp.getWriter();
	    	 String id=req.getParameter("id");
	    	 if (id.equals("1")) {
	    		 out.print("不能删除管理员账户！");
				
			}else {
				UserDao userDao = new UserDao();
				userDao.delete(id);
				PostDao postDao = new PostDao();
				List<Post> list = postDao.getPosts(Integer.parseInt(id));
				for(Post post:list) {
					postDao.delPost(post.getPost_id());
				}
				out.print("删除成功！");
			}
			
		}
	    @SuppressWarnings("unused")
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	    	       
	    	 
		}
	   
}
