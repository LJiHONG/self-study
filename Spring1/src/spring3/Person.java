package spring3;

import org.springframework.stereotype.Component;
//1��Component��ע����ָ��bean��id��Ĭ�ϵ���������Ϊ��������ĸСд����ΪĬ�ϵ�idֵ
//idΪperson��bean��ʵ��
//2��xml�ĵ��У����֪��ɨ����Щ�������Component���ε����
//��valueָ��bean��id

@Component(value="abc")
public class Person {
	public void eat(){
		System.out.println("���ڳԷ�");
	}
}
