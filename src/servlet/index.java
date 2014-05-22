package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=UTF-8");
	    PrintWriter writer = response.getWriter();
	    writer.println("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Servlet</title></head><body><h1>アンケート</h1>");
	    writer.println("<form method=\"get\" action=\"result\">");
	    writer.println("性別　　　　　 <input type=\"radio\" name=\"sex\" value=\"男\" checked=\"checked\"/>:男");
	    writer.println("<input type=\"radio\" name=\"sex\" value=\"女\"/>:女<br>");
	    writer.println("年齢　　　　　 <input type=\"number\" name=\"age\" min=\"0\" value=\"20\"/><br>");
	    writer.println("職業　　　　　 <select name=\"job\"><option value=\"製造\">製造</option><option value=\"販売\">販売</option>");
	    writer.println("<option value=\"事務\">事務</option><option value=\"その他\">その他</option>");
	    writer.println("</select><br>今日の気分　<input type=\"text\" name=\"text\"/><br>");
        writer.println("<input type=\"submit\" value=\"確認\"/>");
	    writer.println("</form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html><head><meta charset=\"UTF-8\"><title>Servlet</title></head><body><h1>アンケート</h1>");
        writer.println("<form method=\"post\" action=\"result\">");
        writer.println("性別　　　　　 <input type=\"radio\" name=\"sex\" value=\"男\" checked=\"checked\"/>:男");
        writer.println("<input type=\"radio\" name=\"sex\" value=\"女\"/>:女<br>");
        writer.println("年齢　　　　　 <input type=\"number\" name=\"age\" min=\"0\" value=\"20\"/><br>");
        writer.println("職業　　　　　 <select name=\"job\"><option value=\"製造\">製造</option><option value=\"販売\">販売</option>");
        writer.println("<option value=\"事務\">事務</option><option value=\"その他\">その他</option>");
        writer.println("</select><br>今日の気分　<input type=\"text\" name=\"text\"/><br>");
        writer.println("<input type=\"submit\" value=\"確認\"/>");
        writer.println("</form></body></html>");
	}

}
