//password generator

package Practice;
import java.util.Scanner;
public class passGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.print("Empname:");
		String Empname=sc.next();
		System.out.print("Empno:");
		String Empno=sc.next();
		
		//1st two letter should be 1st two letters of string
		String str1=Empname.substring(0,2);
		
		// next 3 number should be last 3 numbers of empno
		String str2=Empno.substring(Empno.length() -3);
		
		//last char should be the last latter of empname
		String str3=Empname.substring(Empname.length() -1);
		
		String password=str1.concat(str2).concat(str3);

		System.out.print("password:"+password);
	}

}
