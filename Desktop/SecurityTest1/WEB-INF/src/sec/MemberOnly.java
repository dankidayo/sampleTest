package sec;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class MemberOnly extends HttpServlet{		
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
			//レスポンス設定、PrintWriter取得
			res.setContentType("text/html;charset=Shift-JIS");
			PrintWriter out = res.getWriter();
			String html1 ="<!doctype html><html lang=ja><head><meta charset=Shift-JIS><title>Menu</title></head><body><h1>エクスプレスから飛んできたぜ</h1></body><html>";
			out.print(html1);
		}
}
