package constructor;

class DefaultPerson {
	String name;
	//생성자를 정의하지 않으면 컴파일러에 의해 기본생성자 생성됨
	public DefaultPerson() {} //기본생성자 //아무것도 전달받지 않으면, 아무작업도 수행하지 않음
}


class DefaultPerson2 {
	String name;
	public DefaultPerson2 (){
		System.out.println("DefaultPerson2() 생성자 호출됨");
		name = "홍길동" ;
	}
}


class ParameterPerson{
	String name;
	public ParameterPerson(String newName) {
		System.out.println("ParameterPerson(String) 생성자 호출됨");
		name = newName;
	}
}


class ParameterPerson2{
	String name;
	int age;
	boolean isHungry;

	public ParameterPerson2(String name, int age, boolean isHungry) {
		super();
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
	
}

////////////////////////////////////////////////////////////////////

public class Ex1 {

	public static void main(String[] args) {

		DefaultPerson dp = new DefaultPerson();
		System.out.println("DefaultPerson의 name : " + dp.name);
		System.out.println("=====================================");
		
		DefaultPerson2 dp2 = new DefaultPerson2();
		System.out.println("DefaultPerson2의 name : " + dp2.name);
		System.out.println("=====================================");
		
		ParameterPerson p = new ParameterPerson("소지섭");
		System.out.println("ParameterPerson의 name : " + p.name);
		System.out.println("=====================================");
		
		ParameterPerson2 p2 = new ParameterPerson2("우영우", 20, true);
		System.out.println("ParameterPerson2의 name : " + p2.name);
		System.out.println("ParameterPerson2의 age : " + p2.age);
		System.out.println("ParameterPerson2의 isHungry : " + p2.isHungry);
		System.out.println("=====================================");
		
		
		//기존 파라미터 전달받는 생성자를 정의해둔경우 컴파일러가 기본 생성자 자동으로 생성안해서 
		//기본생성자 호출시 오류발생
//		new DefaultPerson();   //실행 O
//		new DefaultPerson2();  //실행 O
//		new ParameterPerson(); //실행 X
//		new ParameterPerson2();//실행 X
	}

}

