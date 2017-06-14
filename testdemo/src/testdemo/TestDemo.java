package testdemo;
class Student{
	private String name;
	private String sex;
	private int num;
	private int grade;
	private double mark;
	public Student(String sn,String s,int n,int g,double m){
		setName(sn);
		setSex(s);
		setNum(n);
		setGrade(g);
		setMark(m);
	}
	public void setName(String n){
		name = n;
	}
	public void setSex(String s){
		sex = s;
	}
	public void setNum(int n){
		num = n;
	}
	public void setGrade(int g){
		grade = g;
	}
	public void setMark(double m){
		mark = m;
	}
	public String getName(){
		return name;
	}
	public String getSex(){
		return sex;
	}
	public int getNum(){
		return num;
	}
	public int getGrade(){
		return grade;
	}
	public double getMard(){
		return mark;
	}
	public String info(){
		return name + "\n"+
				sex + "\n"+
				num + "\n"+
				grade + "\n"+
				mark;
	}
	
}
public class TestDemo {
	public static void main(String args[]){
		System.out.println(new Student("tom","male",1,1,100.0).info());
	}

}
