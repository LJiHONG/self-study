package spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//autowired按照类型自动装配，如果在IOC容器中存在多个service，异常
@Controller
public class Action {
	@Autowired(required=false)
	private Myservice myservice;
	public String excute(){
		System.out.println("走入到Action中");
		//myservice.add();
		return "";
	}
}
