package practice;
class DataHiding
{
	private  String name;
	private  int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
public class Encapsulation {
public static void main(String[] args) {
	DataHiding obDataHiding=new DataHiding();
	obDataHiding.setName("karthi");
	obDataHiding.setRollno(20);
	String answString=obDataHiding.getName();
	int ans=obDataHiding.getRollno();
	System.out.println(answString);
	System.out.println(ans);
}
}
