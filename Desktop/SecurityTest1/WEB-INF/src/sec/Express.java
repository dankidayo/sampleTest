package sec;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class Express extends HttpServlet{		
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
			//日本語を読めるようにする
			req.setCharacterEncoding("Shift-JIS");
			//メンバーフラグ、ニュースID取得
			String memberflg = req.getParameter("memberflg");
			String newsid = req.getParameter("newsid");
			//転送のための準備
			ServletContext context = getServletConfig().getServletContext();
			
			//ユーザから入力があった場合に必要
			req.setCharacterEncoding("JISAutoDetect");
			
			//htmlページパス
			String path = new String();
			if(newsid.equals("0")){
				path = "express.html";
			}else if(newsid.equals("1")){
				if(memberflg.equals("0")){
					path = "addmember.html";
				}else if(memberflg.equals("1")){
					path = "memberonly";
				}else{
					path = "error.html";
				}
				
			}else{
				path = "error.html";
			}
			
			//転送する機能をもったRequestDispatcherを取得
			RequestDispatcher dispacher = context.getRequestDispatcher("/" + path);
			
			//転送実行
			dispacher.forward(req,res);
			
		}
}
