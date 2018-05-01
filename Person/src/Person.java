
public class Person {

	private String name=null;
	private int age=0;
	private String hobby=null;

	public Person(String name,int age,String hobby){
		this.name=name;
		this.age=age;
		this.hobby=hobby;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public String getHobby(){
		return this.hobby;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setHobby(String hobby){
		this.hobby=hobby;
	}
}