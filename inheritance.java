class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void displayInfo(){
		System.out.println("The employee name is:"+name);
		System.out.println("The employee id is:"+id);
		System.out.println("The employee salary is:"+salary);
	}	
}

class Manager extends Employee{
	int teamsize;
	Manager(String name,int id,double salary,int teamsize){
		super(name,id,salary);
		this.teamsize=teamsize;
	}
	void displayInfo(){
		super.displayInfo();
		System.out.println("The team size is:"+teamsize);
	}
}

class Developer extends Employee{
	String programming_language;
	Developer(String name,int id,double salary,String lang){
		super(name,id,salary);
		programming_language=lang;
	}
	void displayInfo(){
		super.displayInfo();
		System.out.println("The programming language is:"+programming_language);
	}
}

class inheritance{
	public static void main(String[] args){
		Manager obj1=new Manager("Arun",123,1000.0,4);
		obj1.displayInfo();
		Developer obj2=new Developer("Arun",123,1000.0,"python");
		obj2.displayInfo();
	}
}