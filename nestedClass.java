class outer{
	int Outervalue;
	outer(int value){
		Outervalue=value;
	}
	public static class inner{
		int InnerValue;
		inner(int value){
			InnerValue=value;
		}
	}
}

class nestedClass{
	public static void main(String args[]){
		outer obj1=new outer(15);
		System.out.println("Outer value:"+obj1.Outervalue);
		outer.inner obj2=new outer.inner(22);
		System.out.println("Inner Value:"+obj2.InnerValue);
}
}