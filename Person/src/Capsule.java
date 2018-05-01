
public class Capsule {

	public static void main(String[] args) {

		Person hito=new Person("名前",20,"趣味");
		System.out.println(hito.getName());
		System.out.println(hito.getAge());
		System.out.println(hito.getHobby());
		hito.setName("西島");
		System.out.println(hito.getName());
		hito.setHobby("野球");
		System.out.println(hito.getHobby());
	}

}