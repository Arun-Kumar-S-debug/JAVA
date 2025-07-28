class addition{
	int add(int a,int b){
		return a+b;
	}
	float add(float a,float b){
		return a+b;
	}
}

class method_overloading{
	public static void main(String[] args){
		addition h1=new addition();
		System.out.println(h1.add(6,8));
		System.out.println(h1.add(6.0f,8.0f));
	}
}