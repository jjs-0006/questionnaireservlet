package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class result
 */
@WebServlet("/result")
public class result extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html;charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");
	    PrintWriter writer = response.getWriter();
	    String sex,age,job,text;
	    sex = request.getParameter("sex");
	    age = request.getParameter("age");
	    job = request.getParameter("job");
	    text = request.getParameter("text");
	    writer.println("<!DOCTYPE html><html><head><title>Servlet</title></head><body><h1>結果</h1><body>");
	    writer.println("<br>性別:" + sex);
	    writer.println("<br>年齢:" + age + "歳");
	    writer.println("<br>職業:" + job);
	    writer.println("<br>今日の気分:" + text);
	    writer.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        String sex,age,job,text;
        sex = request.getParameter("sex");
        age = request.getParameter("age");
        job = request.getParameter("job");
        text = request.getParameter("text");
        writer.println("<!DOCTYPE html><html><head><title>Servlet</title></head><body><h1>結果</h1><body>");
        writer.println("<br>性別:" + sex);
        writer.println("<br>年齢:" + age + "歳");
        writer.println("<br>職業:" + job);
        writer.println("<br>今日の気分:" + text);
        writer.println("</body></html>");
	}

}
