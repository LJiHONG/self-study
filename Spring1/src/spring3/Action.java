package spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//autowired���������Զ�װ�䣬�����IOC�����д��ڶ��service���쳣
@Controller
public class Action {
	@Autowired(required=false)
	private Myservice myservice;
	public String excute(){
		System.out.println("���뵽Action��");
		//myservice.add();
		return "";
	}
}
