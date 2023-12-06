
															Declarations and Access Modifiers Part-4 || package statement
													========================================================================
													
------------------------
   package Statement
------------------------

-> It is an encapsulation mechanisam to group releted classes and interfaces into a single unit, Which is nothing but package.

	Ex 1. 
		
		- All classes and interfaces which are required For database operation or grouped into single module or package which is nothing but java.sql package.
		
	Ex 2. 

		- All classes and interfaces which are usefull For file IO operations or grouped into a separet package which is nothing but java.IO package.
		
-> The main advantages of package are :-

	1. To resolve naming conflicts(That is unique identification of our components).

	2. It improves modularity of the application.
	
	3. It improves maintainebility of the application.
	
	4. It provides security For our components.
	
	
-> There is one univercially accepted naming convention For packages. That is use internet domain name in reverse.

		Ex. 
		
		com.icicibank  .		loan  .   housing  .     Account
		-------------		  -------	 --------      ----------
		     |					 |	        |                |
		clinets internet      module     Sub-module     class name 
		domain in reverse	  name 			name 
		
		
-> 

		package com.durgasoft.scjp;
		
		public class Test {
			
			public static void main(String args[]) {
				
				System.out.println("Package Demo");
			}
		}
		
		1. javac Test.java 
		
			- Generated .class file will be placed in current working directory.
		
			CWD 
			 |
			 |---Test.class 
						
						
						
						
						|-------------> current working directory.
		2. javac -d 	. Test.java 
				 ---	 
				  |-> Destination to place generated .class files.
			
			- Generated .class file will be placed in currosponding package structure.	

				CWD
				 | 
				 |-->com 
					 |--->durgasoft 
							|------->scjp
									 |---->Test.class 


	-> If the currosponding package structure not already available then these command it self will create currosponding package structure.
	
	-> As destination initiated '.' dot we can take any valid directory name.
	
		EX. 				
            				
            				|-------------> current working directory.
			2. javac -d 	F: Test.java 
            		 ---	 
            		  |-> Destination to place generated .class files.
            	
            	- Generated .class file will be placed in currosponding package structure.	
					 
					 F:
            		CWD
            		 | 
            		 |-->com 
            			 |--->durgasoft 
            					|------->scjp
            							 |---->Test.class 
   
    -> If the specified directory not already available then we will get compile time error.
		
		Ex. 
	
		javac -d Z: Test.java 

		- If Z: not available then we will get compile time error saying directory not found : Z: 

	-> At the time of execution we have to use fully qualified name.
		
		Ex. 
		
			java com.durgasoft.scjp.Test
			
				o/p: Package demo.
				


 Conclusion-1 
-------------

	-> In any java source file there can be atmost one package statement that is more than one package statement is not allowed otherwise we will get compile time error.
	
	
		Ex. 
	
		package pack1; //valid 
		package pack2; //invalid  CE: class, interface or Enum expected 
		
		public class A {
			
			
		} //invalid CE: class, interface or Enum expected 



 Conclusion-2 
--------------
	
	-> In any java program the first non-comment statement should be package statement (If it is available), Otherwise we will get compile time error.
	
		Ex.
		
			import java.uti.*;
			package pack1; //invalid CE: class, interface or Enum expected 
			
			public class A {
				
				
			}
 

 Summary 
---------

	-> The following is valid java source file structure.
	
	Ex. 
 
	 -------------------------------------------------
	 |	package statement;							 | -> This order is important 	
	 |	import statement;                            | -> Atmost one package is allowed
	 | 	class|interface|enum declaration we can take | -> Any number of import statement we can take 
	 |												 | -> Any number of class|interface|enum are allowed
	 -------------------------------------------------	

 Note: 
 
	- An source file is valid java program .
	
	- Hance a the following are valid java source files.
	
	----------	  -------------------	----------------------   ----------------------		-------------------
   |		 |    |					|   |					 |   | package pack1	  |     | class {   	  |
   |	     |    |	 package pack1  |   | import java.util.*;|   | import java.util.*;|     |	  			  |
   |         |    |                 |   |                    |   |                    |     |      }          |
   -----------    -------------------   ----------------------   ----------------------     -------------------
	Test.java		 Test.java				Test.java				Test.java					Test.java

	//valid 		 valid 					valid 						valid 					valid 


























		