package overriding.practice;

public class OverRiding {

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.msg();
		Child child = new Child();
		child.msg();
		Parent p=new Child();
		p.msg();
	}

}
