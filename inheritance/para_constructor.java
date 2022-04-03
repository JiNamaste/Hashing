package inheritance;

class Parent{
	Parent(){
		System.out.println("non-param constructor of parent class");
	}
	Parent(int x){
		System.out.println("param constructor of parent class" + x);
	}
	Parent(int x,int y ){
		System.out.println("2-param constructor of parent class" + (x + y));
	}
}
class Child extends Parent{
	Child(){
		System.out.println("non-param constructor of child class");
	}
	Child(int y ){
		System.out.println("param constructor of child class" + y);
	}
	Child(int z,int y){
		super(z,y);
		System.out.println("two param constructor of child class" + y);
	}
}

public class para_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
               Child child1 = new Child(20,30);
	}

}
