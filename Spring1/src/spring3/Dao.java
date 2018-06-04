package spring3;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	public void insert(){
		System.out.println("正在调用dao中的insert方法");
	}
}
