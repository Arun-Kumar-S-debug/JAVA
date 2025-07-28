class movie{
	String movie_name;
	String language;
	int duration;

	movie(String name,String lang,int time){
		movie_name=name;
		language=lang;
		duration=time;
	}
	movie(String name,String lang){
		movie_name=name;
		language=lang;
		duration=120;
	}
	void display(){
		System.out.println("Movie name:"+movie_name);
		System.out.println("Language:"+language);
		System.out.println("Duration:"+duration);
	}
}

class constructor1{
	public static void main(String[] args){
		movie obj1=new movie("Inception","Tamil",144);
		movie obj2=new movie("DNA","Tamil");
		obj1.display();
		obj2.display();
	}
}