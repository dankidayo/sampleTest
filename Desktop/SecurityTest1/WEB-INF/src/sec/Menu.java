package sec;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
//import java.util.Date;

public class Menu extends HttpServlet{		
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
			int bolMember = 0;
			
			//入力文字コード設定
			//日本語を読めるようにする
			req.setCharacterEncoding("Shift-JIS");
			//パスワード取得
			String password = req.getParameter("password");
			if(password==null || password.equals("")){
				bolMember = 0;
			}else{
				bolMember = 1;
			}
			//前半
			String html1 ="<!doctype html><html lang=ja><head><meta charset=Shift-JIS><title>Menu</title></head><body>";
			//後半
			String html2 ="<FORM METHOD=\"POST\" ACTION=\"express\"><INPUT TYPE=\"HIDDEN\" NAME=\"memberflg\" VALUE=" + bolMember + "><INPUT TYPE=\"RADIO\" NAME=\"newsid\" VALUE=0 CHECKED>最新情報<BR>";
			String html3 ="<INPUT TYPE=\"RADIO\" NAME=\"newsid\" VALUE=1>丸得！情報（会員のみ）<BR><INPUT TYPE=\"SUBMIT\" VALUE=\"記事を読む\"></FORM></body></html>";
			
			
			//レスポンス設定、PrintWriter取得
			res.setContentType("text/html;charset=Shift-JIS");
			PrintWriter out = res.getWriter();
			out.println(html1 + html2 + html3);
			
			
			out.close();
		}
		
}