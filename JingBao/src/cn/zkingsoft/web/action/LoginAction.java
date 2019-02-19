package cn.zkingsoft.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zkingsoft.pojo.User;
import cn.zkingsoft.service.UserService;
import cn.zkingsoft.service.impl.UserServiceImpl;
import cn.zkingsoft.web.core.ActionForm;
import cn.zkingsoft.web.core.ActionForward;
import cn.zkingsoft.web.core.DispatcherAction;
import cn.zkingsoft.web.form.LoginForm;

/**
 * ���ǵ�¼
 * 
 * @author Lxp
 *
 */
public class LoginAction extends DispatcherAction {

	public ActionForward denglu(HttpServletRequest req, HttpServletResponse resp, ActionForm form)
			throws ServletException, IOException {
		System.out.println("��¼");
		LoginForm uf = (LoginForm) form;
		UserService us = new UserServiceImpl();
		try {
			System.out.println(uf.getUsername());
			User user = us.selectUserByUsername(uf.getUsername());
			if (user != null) {
				if (user.getPassword().equals(uf.getPassword())) {
					System.out.println("��¼�ɹ���");
					req.getSession().setAttribute("loginmsg", "��¼�ɹ���");
					req.getSession().setAttribute("user", user);//���û���¼����Ϣ����������ҳ����ʾ�û���
					return new ActionForward(true, "show");
				} else {
					System.out.println("�������");
					req.getSession().setAttribute("loginmsg", "�������");
					return new ActionForward(true, "loginandregisterhtml");
				}
			} else {
				System.out.println("�û�������");
				req.getSession().setAttribute("loginmsg", "�û�������");
				return new ActionForward(true, "loginandregisterhtml");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		// if("lxp".equals(uf.getUname())&&"123".equals(uf.getUpass())){
		// //----------------
		// //�������Ų�ѯservice�������
		// //----------------
		// req.getSession().setAttribute("user", uf);
		// return new ActionForward(true,"show");
		// }else{
		// return new ActionForward(true,"loginandregisterhtml");
		// }
	}
}
