import java.util.Scanner;
class node{
	String data=null;
	node next=null;
}

class stack_operation{
	node temp=null;
	void push(String x){
		node stack=new node();
		stack.data=x;
		stack.next=temp;
		temp=stack;
	}
	void display(){
		System.out.println("The stack elements are given below,");
		node v=temp;
		while(v!=null){
			System.out.println(v.data);
			v=v.next;
		}
	}
	void peek(){
		System.out.println("The peeked element is "+temp.data);
	}
	void Size(){
		node v=temp;
		int count=0;
		while(v!=null){
			v=v.next;
			count++;
		}
		System.out.println("The number of elements im a stack is "+count);
	}
	void isEmpty(){
		if (temp.data==null){
			System.out.println("The stack is empty.");
		}else{
			System.out.println("The stack is not empty.");
		}
	}
	void pop(){
		if (temp.data!=null){
			temp=temp.next;
			System.out.println("The element is poped.");
		}
	}
	void reverse(){
		node rev_temp=null;
		rev_temp=temp;
		temp=null;
		node v=rev_temp;
		while (v!=null){
			push(v.data);
			v=v.next;
		}
		System.out.println("The stack is reversed.");
	}
}

class stack{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		stack_operation obj1=new stack_operation();
		String text="""
				Enter the given operation number to perform particular task,
					1=push()
					2=display()
					3=peek()
					4=size()
					5=isEmpty()
					6=pop()
					7=reverse()
					8=end
						""";
		System.out.println(text);
		boolean j=true;
		while (j==true){
			System.out.println("Enter the operation number you want to perform:");
			int operation_no=input.nextInt();
			input.nextLine();
			if (operation_no==1){
				boolean i=true;
				while(i==true){
				System.out.println("Enter the value to insert into stack (or) end to end the operation:");
				String val=input.nextLine();
					if (val.equalsIgnoreCase("end")){
						i=false;
					}else {
						obj1.push(val);
					}
				}
			}
			else if (operation_no==2){
				obj1.display(); 
			}
			else if (operation_no==3){
				obj1.peek();
			}
			else if (operation_no==4){
				obj1.Size();
			}
			else if (operation_no==5){
				obj1.isEmpty();
			}
			else if (operation_no==6){
				obj1.pop();
			}
			else if(operation_no==7){
				obj1.reverse();
			}
			else if(operation_no==8){
					j=false;
			}
			else{
				System.out.println("Enter the correct operation number");
			}
		}
	}
}
