
											Declarations and Access Modifiers Part-7|| MemberLevel Modifiers
										     =======================================================================

----------------------------------------------------
   strictfp [strict floating point] Modifier(1.2v)	
----------------------------------------------------

 ->  Introduced in 1.2v verision.
 
 -> We can use strictfp For classes and method but not variables.
 
 -> Useally the result of floating point arithmetic is different  from platform to platform If we want platform independent result For floating point arithmetic then we should 
	go For strictfp modifier.
	
	
	
  strictfp Method 
------------------

	- If a method declared as strictfp all floating point calculation in that method has to follow IEEE 754 standard show that we will get platform independent results.
	
	- abstract modifier never talks about implementation where as strictfp method always talks aobut implementation hance a abstract and strictfp combination is Illegal 
	  For methods.
	  
	
		Ex. 
	
		strictfp public void m1(){
			
			System.out.println(10.0/3);
		}
		
  strictfp class 		
------------------

	- If a class declared as strictfp then every floating point calculation prasent in every concrete method	has to follow IEEE 754 standard so that we will get platform
																						    ----------------
	   independent results.

	
	
	abstract strictfp class Test {
	  |	     |--------------
	  | 	-----------       |
	  | 	|m1() {}  |       |
	  | 	|m2() {}  |       |
	  | 	|m3() {}  |<------|
	  | 	|.        |
	  |	|..       | // strictfp talks about concrete methods
	  | 	|m100(){} |
	  |	    -----------
	   |	
		|   -------
		|   |mx();|
		--->|my();| // abstract talks aobut abstract methods 
		    |mz();|
		    -------
			
		}   
			
			
	- We can declare abstract and strictfp combination For classes that is abstract and strictfp combination is legal For classes but illegal For methods.
	
		Ex.
		
		abstract strictfp class Test {					abstract strictfp void m1() ; // CE: illegal combination of modifiers: abstract and strictfp.
			
		}
		
	
---------------------------------------------------	
	Member Modifiers Method or variables modifier
---------------------------------------------------

		1. public Members 
	  --------------------
	  
			->  If a member declared as public then we can access that member from any where.But corrusponding class should be visible that is before chacking member visibility 
				we have to check class visibility.
			
			Ex. 
			
			package pack1;							    package pack2;
			class A {                                                           import pack1.A;
				                                                                class B {
				public void m1(){                                               	
					                                                            	public static void main(String args[]){
					System.out.println("A class public method");                		
				}                                                               		A a = new A();
			}                                                                   		a.m1();
			                                                                    	}
			java -d . A.java                                                    }
			                                                                    
			                                                                    java -d . B.java 
											//CE: pack1.A is not public in pack1; cannot be accessed from outside package. 
																					
			- In the above example even though m1() method is public we can't access from outside package because corrusponding class A is not public that is if both class and 
			   method are public then only we can access the method from outside package.
			
		
	  2. default members 
	 --------------------
		
		- If a member declared as default that we can access that member only within the current package. That is from outside of the package we can't access. Hance a 
		  default access is also known as package level access.
		  
	
	 3. private members 
	---------------------	
	
		- If a member is private then we can access that member only within the class that is from outside of the class we can't access.	
			
		- abstract method should be available to the child classes to provide implementation where as private methods are not available to the child classes hance a private 
		  and abstract combination is illegal For method.
		  
			Ex. 

			class P {
				
				abstract void m1();
				private void m1(){
				
				}
			}
			
			class C extends P {
				
			}//invalid 
		
      		
	  4. protected Members(The most missunderstood modifier in java)		
	 ----------------------------------------------------------------

		- If a member declare as protected then we can access that member any where within the current package but only in child classes of outside package.
		
			Ex. 
			
			protected = <default >+ kids 
			
		- We can access protected members within the current package any where either by using parent reference or by using child reference.
		
		- But we can access protected members in outside package only in child classes and we should use child reference only that is parent reference cannot be used to access 
		  protected members from outside package. 



			package pack1;									    package pack2;
			public class A {                                                                    import pack1.A;
				                                                                                class C extends A {
				protected void m1(){                                                            	
					                                                                            	public void main(Strinags[]) {
					System.out.println("The most missunderstood modifier");                     		
				}                                                                               		A a = new A();
			}                                                                                   		a.m1();//invalid CE: m1() has protected access in pack1.A
			                                                                                    								
			class B extends A {                                                                 		C c = new C ();
				                                                                                		c.m1();//valid 
				public static void main(String args[]){                                         		
					                                                                            		A a1 = C();			
					A a = new A ();                                                             		a1.m1();//invalid CE: m1() has protected access in pack1.A	
					a.m1(); //valid                                                             	}
					                                                                            }
					B b = new b();
					b.m1(); //valid 
					
					A a1 = B();
					a1.m1();//valid 
					
				}
			}
			
	->  We can access protected members from outside package only in child classes and we should use that child classs reference only. For example from D class If we want to 
		access we should use D class reference only.

		
		package pack1;								package pack2;											
		public class A {                                                        import pack1.A;
			                                                                    class C extends A {
			protected void m1(){                                                		
				                                                                }	
				System.out.println("The most missunderstood modifier");         class D extends C{	
			}                                                                   		
		}                                                                       	public static void main(String args[]){	
		                                                                        			
		class B extends A {                                                     		A a = new A ();	
			                                                                    		a.m1(); //invalid CE: m1() has protected access in pack1.A 	
			public static void main(String args[]){                             			
				                                                                		C c = new C();	
				A a = new A ();                                                 		c.m1(); //invalid CE: m1() has protected access in pack1.A 	
				a.m1(); //valid                                                 			
				                                                                		D d = new D();	
				B b = new b();                                                  		d.m1(); //valid 	
				b.m1(); //valid                                                 			
				                                                                		A a1 = new C ();	
				A a1 = B();                                                     		a1.m1();//invalid CE: m1() has protected access in pack1.A 	
				a1.m1();//valid                                                 			
				                                                                		A a1 = new D();
			}                                                                   		a1.m1(); //invalid CE: m1() has protected access in pack1.A 
		}                                                                       		
		                                                                        		C c1 = new D();
		                                                                        		c1.m1(); //invalid CE: m1() has protected access in pack1.A 
		                                                                        
		                                                                        	}
		                                                                        }
																				
																				
	-> Summary Table of private default protected and public modifier.
	
	
	
		----------------------------------------------------------------------------------------------------
		|	visibility			   |private 	   |default    | protected 	   |public  | 
		|	                                   |               |           |                   |        |
		| 1. within the same class 		   |   Yes	   |  Yes      |	Yes 	   |  Yes   |		
		|                                          |               |           |                   |        |
		|                                          |               |           |                   |        |
		| 2. frome child class   		   |	NO 	   |  Yes      |        Yes	   |  Yes   |
		|	 same package                      |               |           |                   |        |
		|                                          |               |           |                   |        |
		| 3. From non-child class of same package  |   NO	   |  Yes      |	Yes	   |  Yes   |	   
		|                                          |               |           |                   |        |
		|                                          |               |           |                   |        |
		| 4. From child class of outsie package    |	NO	   |	NO     |	Yes	   |  Yes   |	
		|					   |		   |	       |  [we should use   |        |
		|					   |		   |	       |  child reference  |        |
		|					   |		   |	       |	only ]     |        |
		|					   |		   |	       |	           |        |
		| 5. From non-child class of outside 	   |   NO	   |	NO     |	No 	   |  Yes   |
		|	package.                           |               |           |                   |        |
		-----------------------------------------------------------------------------------------------------
		
		
	 - The most restricted modifier is private.

     - The most accessible is public.

			private < default < protected < public  
		
	 - Recomanded modifier for data member (variable) is private.

     - But recomanded modifier for Method(service) is public.  
		
		
        
        
        
        
        
        
        
		
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 -> 	
		
			
			
			
			
			
			
			
			
			
			
