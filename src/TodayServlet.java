

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import org.apache.naming.java.javaURLContextFactory;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		LocalDateTime time = LocalDateTime.now();
		
		int y = time.getYear();
		int m = time.getMonthValue();
		int d = time.getDayOfMonth();
		int h = time.getHour();
		int min = time.getMinute();
		
		Formatter form = new Formatter(out);
		
		out.println("<h1><a href = 'index.html'>메인화면</a></h1>");
		form.format("<p style='text-align: center; padding : 300px 0px; '> 현재시간 : %d/%d/%d %d:%d</p>", y,m,d,h,min);

		out.close();
	}		
}
