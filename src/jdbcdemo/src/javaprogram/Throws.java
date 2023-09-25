 
package javaprogram;
import java.io.IOException;

public class Throws {
 
	class Testthrows2{  
	void m()throws IOException{  
	throw new IOException("device error");//checked exception  
	  }  
	void n() throws IOException{  
	m();  
	  }  
	void p(){  
	try{
	n();  
	   }
	catch(Exception e)
	{
	System.out.println("exception handled");
	}  
	}  
	public void main(String args[]){  
	   Testthrows2 obj=new Testthrows2();  
	obj.p();  
	System.out.println("normal flow...");  
	  }  
	}


}
