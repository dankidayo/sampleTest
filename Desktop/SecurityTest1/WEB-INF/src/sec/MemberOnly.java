package sec;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class MemberOnly extends HttpServlet{		
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
			//���X�|���X�ݒ�APrintWriter�擾
			res.setContentType("text/html;charset=Shift-JIS");
			PrintWriter out = res.getWriter();
			String html1 ="<!doctype html><html lang=ja><head><meta charset=Shift-JIS><title>Menu</title></head><body><h1>�G�N�X�v���X������ł�����</h1></body><html>";
			out.print(html1);
		}
}
