
											Declarations and Access Modifiers Part-2 || import and static import
										      =========================================================================

----------------------------------------
  Case 1 : Types of import statements 	
----------------------------------------

 -> There are two types of import statements.

		1. Explicit class import.
		
		2. Inmplicit class import.
		


   1. Explicit class import
 ----------------------------

  -> Ex. import java.util.ArrayList;

	- It is highly recommanded to use explicit class import because it improves readability of the code.
	
	- Best sutable For Hi-Tech city where readability is important.
	
	
  2. Implicit class import
-----------------------------

 -> Ex. import java.util.*;

	- Not recommanded to use because it raduces readability of the code.
	
	- Best sutable For Ameerpeth where typing is important.
	

---------------------------------------------------------------------
  Case 2:  Which of the following import statements are meangful ? 
---------------------------------------------------------------------  
  
	import java.util.ArrayList; //valid 
	import java.util.ArrayList.*; //invalid 
	import java.util.*; //valid 
	import java.util; //invalid 
	
-------------------------------------------	
  Case 3:  Considard the following code.
-------------------------------------------

  -> 

		class MyObject extends java.rmi.UnicastRemoteObject 
		{
			
		}
	
	- The code compiles fine even though we are not writing import statements. Because we used fully qualified name.
	

 Note: Whenever we are using fully qualified it is not reaquired write import statements, Similarlly whenever we writing import statements it is not required to use fully 
	   qualified name.

	   
--------------	   
  Case 4: 
--------------	
	
	
		import java.util.*;
		import java.sql.*;
		
		class Test {
			
				public static void main(String args[]) {
					
					Date d  = new Date();
				}
		} //CE: reference to Date is ambiguous.
		
	- Even the case of List also we may get same ambiguoty problem because it available in both until and awt packages.

------------	
  Case 5: 
------------

	- While resolving class names compiler will always gives the precidence in the following order.
	
			1. Explicit class import.
			
			2. classes prasent in current working directory(defualt package).
		
			3. Implicit class import.
	
	Ex.		
	
	import java.util.Date;
	import java.sql.*;
	
	class Test {
		
			public static void main(String args[]) {
				
				Date d  = new Date();
				System.out.println(d.getClass().getName());
			}
	} //valid 
	
	
   - In the above example util package date got considard.

 -----------  
   Case 6: 
 -----------

	-> Whenever we are importing a java package all classes and interfaces prasent in that package by default available but not sub-pckage classes. If we want to use sub-pckage
	   class compulsory we should write import statements until sub-pckage level.
	   
	   
		Ex. 

		java 
	  	  |---util
	  	       |---regex
	  	 	     |----Pattern 
								
		- To use pattern class in our program which import statements is required >
		
			1. import java.*;			
            2. import java.util.*;		
	        3. import java.util.regex.*; //valid 
			4. No import required.			
			
		Ex. 
			
		java.lang.reflect.*;			    java 	
	                                                      |---lang
	                                                            |---reflect
                                                         		  |----Method 
-----------
  Case 7: 
-----------

 -> All classes and interfaces prasent in the following packages or by default available to every java program hance a we are not required to write import statements.

		1. java.lang package.
		
		2. default package (current working directory(CWD)).
	
	- These are 2 package we are not required to import. 
 
  Ex. 
 
	class Test {
		
			public static void main(String args[]) 
			{
				String s = new String("durga");
				Student s = new Student("Durga",101);
				System.out.println(s.name+"..."+s.rollno);
			}
	}

--------------
   Case 8 : 
--------------

 -> import statements is totally compile time related concept. If more number of imports then more will be the compile time but there is not effect on execution time
	(runtime).
	
------------------------------------------------------------------------------------------	
  Case 9: Difference between C language #include<std.h> and java lang import statements.
-------------------------------------------------------------------------------------------

 -> In the case of C lang #include all input,output header files will be loaded at the beagining only (At translation time). Hance it is static include.

 -> But in the case of java import statement no .class file will loaded at the beagining, whenever we are using a particular class then only currusponding .class file will be 
	loaded. These is like Dynamic include or Load on Demand or Load on fly.
	
	
 Note: 
 
	- 1.5v versions new features.

		for-each loop 
		var-arg method 
		Autoboxing and Autounboxing
		Generics 
		co-verient return types
		Queue
		Annotions 
		enum
		static import
  
-----------------  
  static import 
-----------------

	-> Introduces in 1.5v version.
	
	-> According to sun uses of static import raduces length of the code and improves readability but according to world wide programming experts(like us) uses of static import
	   creates confusions and raduces readability. Hance a If there is no specific requirement then it is not recommanded to use static import.
	   
	-> Useally we can access static members by using class name but whenever we are writing static import we can access static members directly without class name.

	
	Ex. 
	
	   
	Without Static import											With Static import
                                                                    
                                                                    	
		class Test {                                                	import static java.lang.Math.sqrt; 
			                                                        	import static java.lang.Math.*; 
			public static void main (String args[]) {               			
				                                                    	class Test {
				System.out.println(Math.sqrt(4));                   		
				System.out.println(Math.max(10,20));                		public static void main(String args[]) {
				System.out.println(Math.random());                  			
				                                                    			System.out.println(sqrt(4));
			}                                                       			System.out.println(max(10,20));
		}                                                           			System.out.println(random());
                                                                    		}
                                                                    	}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  
  
  
  
  
  
  
  
  
  
  

	
	



























