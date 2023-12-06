
														Declarations and Access Modifiers Part-5 || Class Level Modifiers: final
													===============================================================================

 
---------------------------------- 
 class Level modifiers Module-2 
----------------------------------

 -> Whenever we are writing our own classes we have to provide some information aobut our class to the JVM. Like 
 
		1. Whether thes class can be accessiable from any where or not.
		
		2. Whether child class creation is possible or not.
		
		3. Whether object creation is possible or not ect...
		
	- We can specify these information by using appropriate modifier.

	
	---------------
	|class Test { |			public 			final 				native 
	|			  |
	|			  |		   private 		   abstract 			strictfp
	|}            |
	|			  |		  <default>		   static 				transient 	
	|             |
	|			  |		  protected 	   synchronized 		volatile 
	|             |
	|             |
	|             |
	|             |
	---------------
	
	-> The only applicable modifiers For top level classes are: 
	
		1. public 
		2. <default>
		3. final
		4. abstract
		5. strictfp
		
	-> But For inner classes the applicable modifiers are:

		1. public 
        2. <default>				6. private 
        3. final			++		7. protected
        4. abstract					8. static 
        5. strictfp
		
	Ex. 
	
	
		private class Test {
			
				public static void main(String args[]){
					
					System.out.println("Hello");
					
				}
		}//invalid CE: modifier private not allowed here.
		
		
		
	Ex 
	
			
	 
	11	private class A {
	12	 
	13	 
	14	}
	15	
	16	static class B {
	17	 
	18	}
	19		public static void main (String args[]) {
	20 
	21	 System.out.println("Hello");
	22 } //valid Because above classes are inner classes
	

------------------------------------------
   Access Specifires Vs Access modifiers 	 
------------------------------------------

 -> public,private, protected, default are considard as access specifiers accept these remaining are considard as Access modifiers. 

 -> But these rule is applicable only For old languages Like C++ but not For java.

 -> In java all are considard as Access modifiers only there is no words like access specifier.


	Ex. 
	
		private class Test {
			
		}
		// CE: modifier private not allowed here.
		
		
-------------------		
  public classes 	
------------------

 -> If a class declared as public then we can access that class from any where.
 
	
	Ex. 														
	
		package pack1;													package pack2;
		                                                                import pack1.A;
		                                                                
		 punlic class A {                                               	class B {
				                                                        		
				public void m1() {                                      		public static void main(String args[]){
					                                                    			
					System.out.println("Hello");                        			A a = new A();
				}                                                       			a.m1();
			}                                                           		}
		                                                                	}
		javac -d . A.java                                               	
                                                                        java -d . B.java
			pack1                                                       java pack2.B  
			  |--A.class 												o/p: Hello
			  
			
	 - If  class A is not public then While compiling B class we will get compile time error saying pack1.A is not public in pack1; cannot be accessed from outside package.

	 
		
----------------------
   <default> classes 
-----------------------

   -> If a class declared as default then we can access that class only within the current package that is from outside package we can't access. Hance a default access is also 
	  known as package level access.


--------------------
   final modifier	
--------------------

	-> final is the modifier applicable For classes, methods, and variables.
	
	
   	final Method 
  -----------------	

		-> Whatever methods parent has by default available to the child through inheritance.

		-> If the child not satisfied to with parent method impliementation then child is allowed to re-define that method based on it's requirement this is called overriding.
		
		-> If the parent class method is declared as final then we can't override that method in the child class becuase it's impliementation is final.
		
		Ex. 
		
		class Parent {
			
			public void property(){							
				
				System.out.println("cash,gold,land");
			}
			
			public final void Marry(){<----------------				
													  |
				System.out.println("Mahalaxmi");	  |<---	
			}<----------------------------------------	  |			
		}                                                 |
														  |
		class Child extends Parent {                      |
														  |
			public void property(){                       | ==>// These is called method overriden 
				                                          |	   // But it is invalid CE: marry() in child cannot override marry() in parent; overriden method is final 
				System.out.println("cash,gold,land");     |
			}											  |
			                                              |
			public void Marry(){<----------------------   |
													  |	  |
				System.out.println("Charu ");		  |<---	
			}<-----------------------------------------
		}


		final class 
	  --------------

		-> If a class declared as final we can't extends funcationality of that class that is we can't child class for that class that is inheritance is not possible for final 
		   classes.
			
			Ex. 
			
				final class P {
					
				}
				class C extends P {
					
					
				}//CE: cannot inherit from final P.
	
	Note*:
	
		- Every method prasent inside final class is always final  by default. But every variable prasent inside final class is need not be final. 

				final class P {
					
					
					m1();
					m2();
					m3();
					.
					.
					m1000();
					
				static int x = 10;
					public static void main(String args[]){
						
						x = 777;
						System.out.println(x); // o/p: 777
					}
					
				}
		
		- The main advantage of final keyword is we can achieve security and we can provide unique impliementation.
		
		- But the disadvantage of final keyword is we are missing key benifits of OOP's:inheritannce(because of final classes),and  Polymorphisam(becuase of final methods) hance 
		  If there is no specific requirement then it is not recomanded to use final keyword.
		  
		  

			




















   
   

	
		
		
		
		
		
		
		
		
		
		
		
			


































  
  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		