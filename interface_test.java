interface readable{
	public void read();
}
interface downloadable{
	public void download();	//interface should not have body of method
}

class Ebook implements readable,downloadable{
	int j=0;
	public void read(){
		if (j==1){
			System.out.println("The Ebook was readed");
		} else {
			System.out.println("First download the Ebook");
		}
	}
	public void download(){
		System.out.println("The Ebook was downloaded.");
		j=1;
	}
}
class interface_test{
	public static void main(String ars[]){
		Ebook obj1=new Ebook();
		obj1.read();
		obj1.download();
		obj1.read();
	}
}