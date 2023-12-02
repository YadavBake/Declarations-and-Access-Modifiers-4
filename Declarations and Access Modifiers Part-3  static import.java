
												Declarations and Access Modifiers Part-3 || static import
											    ================================================================


-> Explane about System.out.println() ?  

	Ex. 
	
		class Test {								class System {
			static String s = "java";                                           	static PrintStream out ;
			                                                                    		
		}                                                                       	}
		                                                                        	
		Test	. 	s 	.  	length();                               	System . 	 out . 			println();
		  |		|		   |			                         |		  |			   |
	Test is a 	   s is a 		length() is a method                       System is a	      out is a 	          println() is a method 
        class name     static variable 		prasent in string                         class prasent     static variable	  prasent in PrintStream 
			in Test class of 		class                             in java.lang      prasent in System	  class .
			the type java.lang.                                               package           class of the type 	
			String                                                          		   PrintStream 
				
	- 'out' is a static variable prasent in System class hance a we can access by using class name 'System' But Whenever we are writing static import it is not required to use 
	   class name and we can access 'out' directly.
	
	Ex. 
	
	import static java.lang.System.out;
	class Test {
		
		public static void main(String args[]) {
			
			out.println("Hello");
			out.println("Hi");
			
		}
	} 
	
	
->  While static resoveling static members compiler will always considard the priority in the following order.


		1. Current class static members.
		2. Explicit static import.
		3. Implicit static import.
		
		Ex. 
										import static java.lang.Integer.MAX_VALUE; ---->//Line-2 
		import static java.lang.Integer.*; 		                import static java.lang.Byte.*;
		import static java.lang.Byte.*;                                     
		                                                                    public class Test {
		public class Test {                                                 	static int MAX_VALUE = 999; -----//Line- 1 
			                                                                	public static void main(String args[]) {
			public static void main(String args[]) {                        		
				                                                            		System.out.println(MAX_VALUE);
				System.out.println(MAX_VALUE);                              	}
			}                                                               } // output:999 
		} //CE: reference to MAX_VALUE is ambiguous.				   output:2147483647
											//   output: 127	
	 
	 - If we comment line - 1 then explicit static import will be considard and hance a Interger class MAX_VALUE will considard in these case the output is 2147483647.
	 
	 - If we commnet both lines-1  and Line-2 then implicit static import will be considard in these case output is 127(Byte class MAX_VALUE).

	 
 
	Normal Import 
   ----------------	
									2. Implicit import
	1. Explicit import                                              
	                                                                	Syntax:
		Syntax:                                                     	
		                                                            		import packagename.*;
			import packagename.classname;                           		
			                                                        	Ex.
			Ex.                                                     	
				import java.util.ArrayList;                         	 import java.util.*;
	
	
	
     static  Import 
	----------------	
									2. Implicit static  import
	1. Explicit static import                                              
	                                                                	Syntax:
		Syntax:                                                     	
		                                                            		import packagename.classname.*;
			import packagename.classname.staticmember;                           			 
			                                                        	Ex.3. 	 
    		Ex.                                                     	
    			import static java.lang.Math.sqrt;                         	 import  static java.lang.Math.*;
				import static java.lang.System.out;							 import static  java.lang.System.*;
				
 -> Which of the following import statements are valid ? 
 

   import java.lang.Math.*; // invalid because  normal import  after classname semicolne is required not '.*' . 
   import static java.lang.Math.*; // valid 
   import java.lang.Math.sqrt; //invalid Because it is normal import and normal import never talks about Member level upto class level it can talk.
   import static java.lag.Math.sqrt(); // invlid because method name you have to specifi not '()' breaket open and close. 
   import  java.lag.Math.sqrt.*;//invlaid meaning less /
   import static java.lag.Math.sqrt;//valid because can you please import sqrt static member for out program 
   import java.lang; //invalid because normal import after classname '.*' must be required.
   import static  java.lang; //invalid meaning less  because static import always talks about a particular class or particular member 
   import java.lang.*; // valid 
   import static java.lang.*;// invalid because '.*' is allowed for static after class name not after package name.
   

-> Two packages containes a class or interface with the same name is very rare and hance ambiguty problmen is very rare in normal import.

-> But a two classes and interfaces containes a variable or method with same name is very comman and hance ambiguty problem is also very comman problem in static import.

-> Uses of static import readuces readability and creates confusion and hance a If there is no specific requirement then it is not recommanded to use static import.


-> Difference between normal import and static import: - 

	- We can use normal import to import classes and interface of a particular package.
	
	- Whenever we are writing  normal import it is not required to use fully qualified and we can use Short names directly.
	
	- We can use static import to import static members of a particular class or interface.
	
	- Whenever we are writing static import it is not required to use class name to access static members and we can access directly.



























































	
	
	
	
	
	
	
	
	
