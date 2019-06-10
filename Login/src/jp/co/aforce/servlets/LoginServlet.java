package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.LoginBean;
import jp.co.aforce.models.LoginModel;


@SuppressWarnings("serial")

public class LoginServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		RequestDispatcher rDispatcher = request.getRequestDispatcher("/login.jsp");
		rDispatcher.forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request , HttpServletResponse response)
			throws IOException, ServletException{

		request.setCharacterEncoding("UTF-8");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);

		LoginModel loginModel = new LoginModel();
		String forward_jsp = "/login.jsp";

		if(loginModel.loginCheck(username,password)) {

			loginBean.setMsg("ようこそ、"+username+"さん");
			request.setAttribute("loginBean",loginBean);

			forward_jsp = "/success.jsp";

		}else {
			loginBean.setEmsg("ユーザー名またはパスワードが違います。");
			request.setAttribute("loginBean", loginBean);
		}

		RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
		rDispatcher.forward(request,response);
	}
}
