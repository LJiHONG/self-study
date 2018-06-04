package spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class Myservice {
	@Autowired
	private Dao dao;
	public void add(){
		System.out.println("service当中的add方法调用");
		dao.insert();
	}
}
