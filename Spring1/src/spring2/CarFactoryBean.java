package spring2;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Object> {

	@Override
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.setType("±£Ê±½Ý");
		return car1;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
