package spring1;

public class Person {
	private String name;
	private Car car;
	
	public Person(){
		System.out.println("person������");
	}
	public void a(){
		System.out.println("person��ʼ��");
	}
	
	public void b(){
		System.out.println("person����");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("SetName����");
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
