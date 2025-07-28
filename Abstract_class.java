abstract class shape{
	String name;
	shape(String name){
		this.name=name;
	}
	abstract void calculate_area();
	void display(){
		System.out.println("The shape name is:"+name);
	}
}

class circle extends shape{
	double radius;
	circle(String name,double radius){
		super(name);
		this.radius=radius;
	}
	void calculate_area(){
		super.display();
		System.out.println(3.14*radius*radius);
	}
}

class rectangle extends shape{
	double length;
	double bregth;
	rectangle(String name,double len,double bre){
		super(name);
		length=len;
		bregth=bre;
	}
	void calculate_area(){
		super.display();
		System.out.println(length*bregth);
	}
}

class Abstract_class{
	public static void main(String args[]){
		circle obj1=new circle("Circle",8.0);
		obj1.calculate_area();
		rectangle obj2=new rectangle("Rectangle",4.0,5.0);
		obj2.calculate_area();
	}
}