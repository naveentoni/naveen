package tony.com;

public class BHAI 
{
String Sname;
int rollno;
BHAI(String Sname,int rollno)
{
this.Sname=Sname;
this.rollno=rollno;
}
//overriding of the toString method
public String toString()
{
	return Sname+"**"+rollno;
}
public static void main(String[] args) 
{
BHAI S=new BHAI("BOYS",19);
System.out.println(S);
	}

}
