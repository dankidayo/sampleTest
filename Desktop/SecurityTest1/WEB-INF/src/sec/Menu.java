package sec;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
//import java.util.Date;

public class Menu extends HttpServlet{		
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
			int bolMember = 0;
			
			//���͕����R�[�h�ݒ�
			//���{���ǂ߂�悤�ɂ���
			req.setCharacterEncoding("Shift-JIS");
			//�p�X���[�h�擾
			String password = req.getParameter("password");
			if(password==null || password.equals("")){
				bolMember = 0;
			}else{
				bolMember = 1;
			}
			//�O��
			String html1 ="<!doctype html><html lang=ja><head><meta charset=Shift-JIS><title>Menu</title></head><body>";
			//�㔼
			String html2 ="<FORM METHOD=\"POST\" ACTION=\"express\"><INPUT TYPE=\"HIDDEN\" NAME=\"memberflg\" VALUE=" + bolMember + "><INPUT TYPE=\"RADIO\" NAME=\"newsid\" VALUE=0 CHECKED>�ŐV���<BR>";
			String html3 ="<INPUT TYPE=\"RADIO\" NAME=\"newsid\" VALUE=1>�ۓ��I���i����̂݁j<BR><INPUT TYPE=\"SUBMIT\" VALUE=\"�L����ǂ�\"></FORM></body></html>";
			
			
			//���X�|���X�ݒ�APrintWriter�擾
			res.setContentType("text/html;charset=Shift-JIS");
			PrintWriter out = res.getWriter();
			out.println(html1 + html2 + html3);
			
			
			out.close();
		}
		
}