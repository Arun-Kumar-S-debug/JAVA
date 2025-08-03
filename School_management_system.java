import java.util.Scanner;
class person{
   String name;
   int age;
   person(String name,int age){
      this.name=name;
      this.age=age;
   }
   void displayInfo(){
      System.out.println("The student name is:"+name);
      System.out.println("The age of "+name+" is:"+age);
   }
}

class student extends person{
   String studentId;
   String grade;
   student(String name,int age,String studentId,String grade){
      super(name,age);
      this.studentId=studentId;
      this.grade=grade;
   }
   void displayInfo(){
      super.displayInfo();
      System.out.println(name+" id is:"+studentId);
      System.out.println(name+" grade is:"+grade);
   }
}

interface payable{
   public void calculatePay();
}

class teacher extends person{
   String employeeId;
   String subject;
   teacher(String name,int age,String employeeId,String subject){
      super(name,age);
      this.employeeId=employeeId;
      this.subject=subject;
   }
   void displayInfo(){
      super.displayInfo();
      System.out.println("Employee id:"+employeeId);
      System.out.println("Subject of teacher:"+subject);
   }
}

class teacher1 implements payable{
   int experi;
   teacher1(int experi){
      this.experi=experi;
   }
   public void calculatePay(){
      int salary=15000+2000*(experi);
      System.out.println("The salari of teacher is:"+salary);
   }
}

class displayDetails{
   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the student details.");
      System.out.println("Enter the name of the student:");
      String s_name=input.nextLine();
      System.out.println("Enter the age of student:");
      int age=input.nextInt();
      input.nextLine();
      System.out.println("Enter the id of student:");
      String id=input.nextLine();
      System.out.println("Enter the grade of student:");
      String grade=input.nextLine();
      student ST_obj=new student(s_name,age,id,grade);
      ST_obj.displayInfo();
      System.out.println("_______________________________________________________________________");
      System.out.println("Enter teacher details:");
      System.out.println("Enter the name of the teacher:");
      String t_name=input.nextLine();
      System.out.println("Enter the age of teacher:");
      int t_age=input.nextInt();
      input.nextLine();
      System.out.println("Enter the employee id of teacher:");
      String e_id=input.nextLine();
      System.out.println("Enter the subject of teacher:");
      String subject=input.nextLine();
      System.out.println("Enter the experience of teacher:");
      int experi=input.nextInt(); 
      input.nextLine();
      teacher t_obj=new teacher(t_name,t_age,e_id,subject);
      teacher1 sa_obj=new teacher1(experi);
      t_obj.displayInfo();
      sa_obj.calculatePay();
   }
}

