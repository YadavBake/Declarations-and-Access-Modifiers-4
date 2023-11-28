
														Declarations and Access Modifiers Part-1 || Java Source File Structure
													============================================================================

------------------------------------
 Declarations and Access Modifiers	
------------------------------------

 1. Java source file structure.
 2. class Level modifiers.
 3. Member Level modifiers.
 4. Interfaces. 

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

 1. Java source file Structures.
--------------------------------

 -> A java program can containe any number of classes but at most one class can be declared as public. If there is public class then name of the program and name of the public 
	class must be matched otherwise we will get compile time error.
	
	
	Case:1 If there is no public class then we can use any name and there no restrictions. 
 
	class A {		 
		
	}					A.java
	class B {			B.java	
	                    C.java
	}                   Druga.java
	class C {
		
	}
	
	Case:2 If class B is public then name of the program should be B.java otherwise we will get compile time error saying class B is public,should be declared in a 
			file named B.java.
	
	class A {
		
	}			
    public class B { 		
									
    }         
    class C {
    	
    }
	
	Case :3 -> If class B and class C declared as public and name of the program is B.java then we will get compile time error saying class C public, should be 
			   declared in a file named C.java
	
	class A {
    	
    }			
    public class B {
              
    }         
   public  class C {
    	
    }
		
	
	Ex. 2 
													|														
	class A {										|															javac Durga.java
													|												--------------------------------------------
		public static void main(String args[]){		|												|			 |				|		      |	
													|											A.class 	   B.class      C.class	        D.class 
			System.out.println("A class main");		|										
		}											|											java A 	   	  java B 	  	 java C   		java D 
	}												|						            	A class Main   	B class Main  	C class Main 	RE:NoSuchMethodError:main 
													|										
	                                                |																						java Durga 		
	class B {                                       |																						RE: NoClassDefFoundError:Durga
		                                            |
		public static void main(String args[]){     |==>// Save as Durga.java 
			                                        |
			System.out.println("B class main");     |	Conclusion:
		}                                           |   
	}												|   1. Whenever we are compiling a java program For every class prasent in that program a separate .class file will
	                                                |      Generated.	 
	                                                |    
	class C {                                       |   2. We can compile a java program (java source file) but we can run a java .class file.
    	                                            |   
    	public static void main(String args[]){     |	3. Whenever we are executing a java class the curruspoding class main method will be executed.
    		                                        |   
    		System.out.println("C class main");     |	4. If the class doesn't containe main method then we will get runtime exception saying NoSuchMethodError:main
    	}											|   
    }                                               |	5. If the curruspoding .class file not available then we will get runtime exception saying NoClassDefFoundError.
	                                                |   
	class D {                                       |	 6. It is not recommanded to declare multiple classes in a single source file, It is highly recommanded to declare
		                                            |       to declare only one class per source file and name of the program we have keep same as class name. The main 
	}                                               |	    advantage of these approach is readability and maintainebility of the code will be improved.
                                                    |
                                                    |  
													|	
													|	
-------------------
 import Statement 
------------------- 
 
  -> 

	class Test {
		
		public static void main(String args[]) {
			
			ArrayList al= new ArrayList();
		}		|
	}			|-->// CE:cannot find symbol symbol: class ArrayList, Location: class Test 
	
 -> We can solve these problem by using fully qualified name. 
 
	
	class Test {
		
		public static void main(String []args) 
		{
			java.util.ArrayList al = new java.util.ArrayList();
			
		}
	} //solved with fully qualified name 

-> The problem with uses of fully qualified name every time is it increases length of the code and raduces readability.

-> We can solve these problem by using import statement.

-> Whenever we are writing import statement it is not required to use fully qualified name every time. We can use Sort name directly.

	Ex. 
	
	import java.util.ArrayList;
	class Test {
		
		public static void main(String []args)
		{
			ArrayList al = new ArrayList();
		}
	} // solved with short name 
	
	
-> Hance a import statement access typing Shortcut.

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	