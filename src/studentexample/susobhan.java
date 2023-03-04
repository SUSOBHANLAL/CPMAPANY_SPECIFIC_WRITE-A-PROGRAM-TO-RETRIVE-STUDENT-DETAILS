package studentexample;
import java.util.*;
class student{
	String name;
	int age;
	String clg;
	int [] marks;
	double avgmarks;
	public student(String name, int age, String clg, int[] marks, double avgmarks) {
		super();
		this.name = name;
		this.age = age;
		this.clg = clg;
		this.marks = marks;
		this.avgmarks = avgmarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public double getAvgmarks() {
		return avgmarks;
	}
	public void setAvgmarks(double avgmarks) {
		this.avgmarks = avgmarks;
	}
	
}

public class susobhan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<student> s1 = new ArrayList<student>();
		
		System.out.print("enter the num of student");
		int n  = sc.nextInt();
		 sc.nextLine();
		
	  for(int j =0;j<n;j++) {
		  System.out.print("eneter name");
		  String name = sc.nextLine();
		  System.out.println();
		  sc.nextLine();
		  
		  
		  System.out.print("age");
		  int age = sc.nextInt();
		  System.out.println();
		  sc.nextLine();
		  
		  System.out.print("cog");
		  String clg = sc.nextLine();
		  System.out.println();
		  sc.nextLine();
		  
		
		  int marks[] = new int[5];
		  for(int i= 0;i<5;i++) {
			  System.out.print("maerks");
			  marks[i] = sc.nextInt();
			  System.out.println();
			  
		  }
		  
		  
		  //calculate avg marks
		  double sum =0;
		  for(int i= 0;i<5;i++) {
			  sum+=marks[i];
		  }
		  
		  double avg = sum/5.0;
		  
		  student s11 = new student(name,age,clg,marks,avg);
		  
		  //adding student element to the arraylist
		  
		  s1.add(s11);
		  sc.nextLine();
	  }
	  for(int k=0;k<s1.size();k++) {
		  
		  
		 student s11= s1.get(k);
		 String result;
		 if(s11.getAvgmarks()>35) {
			 result ="pass";
			 
		 }else {
			 result = "fail";
		 }
		 
		 System.out.println("student "+ k+1 +" name "+s11.getName()+" college "+s11.getClg()+" age "+s11.getAge()+" avgmarks "+s11.getAvgmarks()+" result "+result);
	  }
	  
	  
	}

}
