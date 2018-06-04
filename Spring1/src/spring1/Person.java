package spring1;

public class Person {
	private String name;
	private Car car;
	
	public Person(){
		System.out.println("person构造器");
	}
	public void a(){
		System.out.println("person初始化");
	}
	
	public void b(){
		System.out.println("person销毁");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("SetName方法");
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}
	
}
