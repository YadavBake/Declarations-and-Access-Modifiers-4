
														Declarations and Access Modifiers Part-6|| Class Level Modifiers: abstract
													==================================================================================
---------------------	
 abstract Modifier
---------------------

 -> Abstract is the modifier applicable For classes and methods but not For variables.

  
   Abstract Method 
--------------------

	-> Even though we don't know about implementation still we can declare a method with abstract modifier. That is for abstract methods only declaration is avialable but not 
	   not implementation hance a abstract method declaration should ends with semicolane';'.
	   
	   Ex. 
	
			public abstract m1(); //valid 
			public abstract m1() {}//invlid
			
	-> Child class is responsible to provide implementation For parent class abstract methods.

		Ex.
		
		abstract class Vehicle {
			
			abstract public int getNoOfWheels();
				
		}
		
		class Bus extends Vehicle {						class Auto extends Vehicle {
				                                        	
			public int getNoOfWheels(){                 	public int getNoOfWheels(){
				                                        		
				return 7;                               		return 3;
				                                        		
			}                                           	}
		}                                               }
		
	-> By declaring abstract method in the parent class we can provide guidelines to the child classes such that which methods compulsory child has to implements.
	
	-> Abstract method never talks about implementation If any modifier talks about implementation then it's form illigal combination with abstract modifier.
	
	-> The following are various illigal combination of modifiers For methods with respect to abstract.
		
		- final,native,synchronized,static,private,strictfp.
		
	Ex. 
	
	 ---------------							------------------
	 |	abstract   |							| 				 |
	 |	           |                            |  final         |
	 |	           |   Enimy of This methods    |  native 	     |
	 |	           |==========================> |  synchronized  |  Ex. 
	 |	           |                            |  static        | 
	 |	           |                            |  private       | 	abstract final void m1(); //invalid CE: Illegal combination of modifiers abstract and final 
	 |	           |                            |  strictfp      |
	 ---------------						    ------------------
		
		
		
	 abstract class 
	----------------

		-> For any java class IF we are not allowed to create an object(because of partial implementation) such type of class we have to declare with abstract modifier.

		-> That is For abstract classes instantiation is not possible.
		
		Ex. 
		
		abstract class Test {
			
			public static void main(String args[]){
		
				Test t  = new Test();
			}
		} //CE: Test is abstract; cannot be instantiated.
		
		
-----------------------------------------	
	abstract class Vs abstract Method 
-----------------------------------------

	 -> If a class containes at list one abstract method then compulsory we should declare class as abstract. Otherwise we will get compile time error.
	 
	  Resions 
     ---------  
		
		- If a class containes at list one abstract method then implementation is not complite and hance a it is recomanded to create an object, To restrict object instantiation 
		  compulsory we should declaration class as abstract.
	 
	 
	    abstract class Vehicle {
			
			public abstract int getNoOfWheels();
		}
	
	
	-> Even though class doesn't containes any abstract methos still we can declare class abstract if we don't want instantiation that is abstract class can containe zero number 
	   of abstract methods also.
	   
	   
	   Ex 1. 
	   
	    - HttpServelt is abstract but it doesn't any abstract methods.
	   
		
	   
			 abstract HttpServelt class {
				 
					doGet();
					doPost();
			 }
	   
	   Ex 2.
	   
		- Every Adapter class is recomanded to declare as abstract but it doesn't containe any abstract method.
		
		
		Ex. 
		
		class P {											class P {										class P {
			                                                	                                            	
			public  void m1();                              	public abstract void m1() {}                	public abstract void m1();
			                                                                                                	
		} //CE: Missing method body or declare abstract.    }//CE: abstract method cannot have a body       }//CE: P is not abstract and does not override abstract method m1() in P.
		
		
		- If we are extending abstract class then For each and every abstract method of parent class we should provide implementation. Otherwise we have declare child class 
		  abstract. In these case next level child class is responsible to provide implementation.
		  
		  
		Ex. 
		
		abstract class P {
			
			public abstract void m1();
			public abstract void m2();
			
		}
		
		class C extends P {
			
			public void m1() {}
			
		} // CE: C is not abstract and does not override abstract method m2() in P. 
		

    final V/s abstract 
  ----------------------
  
	-> abstract methods compulsory we should override in child classes to provide implementation where as we can't override' final methods. Hance a final and abstract combination
	   is illegal combination For methods.
	   
	-> For final classes we can't create child class where as for abstract classes we should create child class to provide implementation.' Hance a final and abstract combination
	   is illegal combination For classes.
	   
	   
	-> abstract class can containe final method where as final class can't containe abstract method.
	
		Ex. 
	
	
		abstract class Test {				final class Test {
			                                	
			public final void m1(){         	public abstract void m1();
				                            	
			}                               } //CE: 
		} //valid 
		
		
 Note: 

	- It is highly recomanded to use abstract modifier because it's promote several OOPs features like Inheritance and polymorphisam.
		
		
		



































		
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
			
		 
		
		
 		
		
		
		
		
		
		
		
		
		
		