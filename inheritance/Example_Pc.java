package inheritance;

class Rectangle{
	int length;
	int breadth;
	Rectangle(){
		length=1;
		breadth=1;
	}
	Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
}

class Cuboid extends Rectangle{
	int height;
	Cuboid(){
		height =1;
	}
	Cuboid(int l,int b,int h){
		super(l,b);
		height =h;
		
	}
	int volume() {
		return length*breadth*height;
	}
}

public class Example_Pc {

	public static void main(String[] args) {
        Cuboid c1= new Cuboid(10,20,30);
        System.out.println(c1.volume());

	}

}
