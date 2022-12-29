/*Consider a class Student having data members name, marks of three subjects,average and member function printDetails(). Take input
of 3 students from user using array of objects and print it.*/
import java.util.*;
class Student{
	String name;
	double a,b,c,avg;

	void getDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.nextLine();
		System.out.println("Enter a subject marks");
		a=sc.nextDouble();
		System.out.println("Enter b subject marks");
		b=sc.nextDouble();
		System.out.println("Enter c subject marks");
		c=sc.nextDouble();
		avg= (a+b+c)/3;
	}
	void printDetails(){
		System.out.println("Name : "+this.name+"\nmarks a :"+this.a+"\nmarks b :"+this.b+"\nmarks c :"+this.c+"\nAverage : "+this.avg);
	}
}
class Prac17{
	public static void main(String []args){
		Student []st=new Student[3];
		for(int i=0;i<3;i++){
			st[i]=new Student();
			st[i].getDetails();
		}
		for(int i=0;i<3;i++){
			st[i].printDetails();
		}
	}
}