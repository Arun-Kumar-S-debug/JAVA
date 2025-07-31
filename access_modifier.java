class management{
	public String name;   //accesible anywhere in the program
	protected int id;   //accesible by its own and inherited class
	private int aadharnumber;	//accesible in the class only
	management(String name,int id,int aadharnumber){
		this.name=name;
		this.id=id;
		this.aadharnumber=aadharnumber;
	}
	void display(){
		System.out.println("aadharnumber:"+aadharnumber);
	}
}

class department extends management{
	department(String name,int id,int aadharnumber){
		super(name,id,aadharnumber);
	}
	void details(){
		System.out.println("student name:"+name);
		System.out.println("student id:"+id);
	}
}

class access_modifier{
	public static void main(String[] args){
		department obj1=new department("Arun",25423,5635633);
		obj1.display();
		obj1.details();
	}
}