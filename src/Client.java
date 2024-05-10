import java.rmi.Naming;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 String str=input.next();
		
		AddI obj=(AddI)Naming.lookup("rmi://localhost:7000/PALINDROMECHECK");
	//	AddI obj1=(AddI)Naming.lookup("ADD");
		int n= obj.add(5,4);
		boolean a=obj.pcheck(str);
		System.out.println(a);
	}

}
