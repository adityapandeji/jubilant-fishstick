import java.rmi.server.*;
public class AddC extends UnicastRemoteObject implements AddI {
	AddC() throws Exception{
		super();
	}
	public int add(int x,int y) {return x+y;}
	public boolean pcheck(String str)
	{   
		boolean b=false;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			b=true;
		}
		
		return b;
	}
	

}
