package sec;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class Express extends HttpServlet{		
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
			//���{���ǂ߂�悤�ɂ���
			req.setCharacterEncoding("Shift-JIS");
			//�����o�[�t���O�A�j���[�XID�擾
			String memberflg = req.getParameter("memberflg");
			String newsid = req.getParameter("newsid");
			//�]���̂��߂̏���
			ServletContext context = getServletConfig().getServletContext();
			
			//���[�U������͂��������ꍇ�ɕK�v
			req.setCharacterEncoding("JISAutoDetect");
			
			//html�y�[�W�p�X
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
			
			//�]������@�\��������RequestDispatcher���擾
			RequestDispatcher dispacher = context.getRequestDispatcher("/" + path);
			
			//�]�����s
			dispacher.forward(req,res);
			
		}
}
