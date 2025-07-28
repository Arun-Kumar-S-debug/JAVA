class details{
	String name;
	int age;
	details(){ 		//default costructor
		name="Unknown";
		age=0;
	}
	details(String data,int val){	//parametrized consrtructor
		name=data;
		age=val;
	}
	void display(){
		System.out.println(name+" "+age);
	}
}

class constructor{
	public static void main(String[] args){
		details obj1=new details();
		obj1.display();
		details obj2=new details("Arun",18);
		obj2.display();
	}
}