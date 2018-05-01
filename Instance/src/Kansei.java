
public class Kansei {

	public static void main(String[] args) {
		Sekkei hito=new Sekkei("名前",18,"趣味");
		System.out.println(hito.getName());
		System.out.println(hito.getAge());
		System.out.println(hito.getHobby());
		hito.setName("苗字");
		System.out.println(hito.getName());
	}

}
