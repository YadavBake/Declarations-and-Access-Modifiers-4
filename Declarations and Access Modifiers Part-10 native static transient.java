
											Declarations and Access Modifiers Part-10|| native,static,transient
										     ========================================================================

=====================
   native modifier								 
=====================

   -> native is the modifier applicable only For methods and we can't apply any where else.
   
   -> The methods which are implemented in non-java(mostly C, or C++) are called native methods or foreign methods .
   
   -> The main objectives of native keyword are :-
   
			1. To improve performance of the system.
			
			2. To achieve machine leve or memory level communication.
			
			3. To use a already exisiting legacy non-java code etc.
			
	-> pseudo code to use native keyword in java 
	
		
			class Native {
				
				static {
					
					System.loadLibrary("native library path");// Load native library ----1
				}
				public native void m1(); // Declare a native method ----2
				
				
			}
			
			class client {
				
				public static void main(String []args) {
					
					Native n = new Native ();
					n.m1();// invoke a native method ---3 
					
				}
			}
			
			
		- For native methods implementation is already available in old languages like C, or C++. And we are not responsible to provide implementation hance a native method 
		  decleration should ends with semicolane.
		  
		  
		  
		  public native void m1(); //valid 
		  
		  public native void m1(); //invalid CE: native method cannnot have a body.


	-> For native methods implementation is already available in old languages but For abstract methods implementation should not be available hance a we can't declare native as 
	   abstract that is native and abstract combination is illegal combination For methods.



	-> We can't declare' native methods as strictfp because there is no garenty that old languages follow IEEE 754 standard hance a native and strictfp combination is illegal 
	   combination For methods.
		
	-> The main advantage of native keyword is performance will be improved but the disadvantage of native keyword is it's break platform independent nature of java. 
	
	
---------------------	
  transient keyword	
---------------------

	-> transient is the modifier applicable only For variables.
	
	-> We can use transient keyword in sirealization context.
	
	-> At the time of serialization If we don't want to save the value of a particular variable to meet security constrant then we should declare that variable as transient.
	
	-> At the time of serialization JVM ignores origenal value of transient variable and save default value to the file. Hance a transient means not to save serialize.
	
		    -------------------						----------------------------
		    |		     |						|			   |	
		    | uname = "Durga" |   Serialization                         |                          |
transient-> 	    | pswd = 12334    |--------------------------               |                          |
		    |                 |				|		|   -------------------    |
		    -------------------                         |		|   |		      |    |
                         a1                                     |               |   | uname = "Durga" |    |
                                                                |------------------>| pswd = null     |    |
                                                                        |       |   |                 |    |
									|  	|   -------------------    |
                                                                        |       |            |		   |		
                                                    |-----------------------------------------             |
                                                    |                           |			   |		
						    |				----------------------------
						    |					ans.ser	
                                                    |				
	-------------------                         |
        |		  | 	Deserialization	    | 
        | uname = "Durga" |--------------------------- 
        | pswd = null     | 
        |                 | 
        ------------------- 
		a2

-----------------------
   volatile modifier
-----------------------

	-> volatile is the modifier applicable only For variables and we can't apply anywhere else.

	-> If the value of a variable keep on changing by multiple thread then there may be chance of data inconcitancy problem we can solve these problem by using volatile modifier.
	
	-> If a variable declared as volatile then For every thread JVM will create a separate local copy.
	
	-> Every modification performed by the thread will takes place in local copy so that there is no effect on remaining threads.
	
	-> The main advantage of volatile keyword is we can overcome data inconcitancy problem but the main disadvantage of volatile keyword is creating and maintaining a separete copy
	   For every thread increases complexity of programing and creates performance problems. Hance a IF there is no specific requirement it is never recomanded to use volatile
	   keyword and it is almost depricated keyword.
	   
	-> final variable means the value never changes where as volatile variable means the value keep on changing hance a volatile and final is illegal combination For variable.

	
	
	   
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	|Modofier     | applicable classes   |	for Methods 	| for variable     |  for blocks    |    for interfaces    |     for Eum	  |  for constroctors | 
	-------------------------------------|------------------|------------------|----------------|----------------------|----------------------|------------------ |
	|	      | outer|  | inner      |	    Yes		|	Yes	   |	 	    |    outer 	 |  inner  | outer   |	inner     |                   |
	------------------------|------------|------------------|------------------|----------------|------------|---------|-------- |------------|-------------------|
	| public      |   Yes   |   Yes      |       Yes        |       Yes        |                |     Yes    |    Yes  |  Yes    |    Yes     |       Yes         |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| private     |         |   Yes      |       Yes        |       Yes        |                |            |    Yes  |         |    Yes     |       Yes         |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| protected   |         |   Yes      |       Yes        |       Yes        |                |            |   Yes   |         |    Yes     |       Yes         |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| default     |   Yes   |   Yes      |       Yes        |       Yes        |                |     Yes    |   Yes   |   Yes   |    Yes     |       Yes         |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| final       |   Yes   |    Yes     |       Yes        |       Yes        |                |            |         |         |            |                   |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| abstract    |   Yes   |    Yes     |       Yes        |                  |                |     Yes    |   Yes   |         |            |                   |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| static      |         |    Yes     |       Yes        |       Yes        |      Yes       |            |   Yes   |         |   Yes      |                   |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| synchronized|         |            |       Yes        |                  |      Yes       |            |         |         |            |                   |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| native      |         |            |       Yes        |                  |                |            |         |         |            |                   |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| strictfp    |   Yes   |    Yes     |       Yes        |                  |                |    Yes     |   Yes   |   Yes   |    Yes     |                   |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| transient   |         |            |                  |       Yes        |                |            |         |         |            |                   |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	| volatile    |         |            |                  |       Yes         |               |            |         |         |            |                   |
	---------------------------------------------------------------------------------------------------------------------------------------------------------------   
	 
	   
	-> The only applicable modifier for local variable is final.

	-> The only applicable modifies for constructors are public,private, protected, default.
	
	-> The modifiers which are applicable only for methods native.
	
	-> The modifiers which are applicable only for variables volatile and transient.
	
	-> The modifiers which are applicable for classes but not for interfaces final.
	
	-> The modiers which applicable for classes but not for enum final and abstract.
	   
	   
	   
	   
	   
