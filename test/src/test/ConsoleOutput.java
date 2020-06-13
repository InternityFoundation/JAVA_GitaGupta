package test;
import java.io.Console;

public class ConsoleOutput 
{
	private String myString;
	public int myInt;
	public void printToConsole()
	{
	    Console console = System.console();
	    console.writer().write("Hello ");
	    console.flush();
	
	    System.out.println("World!");
	}

	public static void main(String args[]) 
	{
	    for (int i=0;i<args.length;i++)
	    {
	        System.out.println(args[i]);
	    }
	
	    ConsoleOutput c = new ConsoleOutput();
	
	    /*
	        Note: must be run from command line, otherwise NPE
	     */
	    c.printToConsole();
	}
}