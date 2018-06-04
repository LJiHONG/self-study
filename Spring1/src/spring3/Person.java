package spring3;

import org.springframework.stereotype.Component;
//1、Component标注无需指定bean的id，默认的命名策略为类名首字母小写，作为默认的id值
//id为person的bean的实例
//2、xml文档中，需告知需扫描哪些包下面的Component修饰的组件
//用value指定bean的id

@Component(value="abc")
public class Person {
	public void eat(){
		System.out.println("正在吃饭");
	}
}
