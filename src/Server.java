import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		Registry registry=LocateRegistry.createRegistry(7000);
		AddC obj= new AddC();
		registry.bind("PALINDROMECHECK", obj);
		//Naming.rebind("ADD",obj);
		System.out.println("server started");
	}

}
