
															Declarations and Access Modifiers Part-8|| final variables
														=================================================================

 ---------------------
	final variables 
 ---------------------

	final Instance variable 
   -------------------------
	
		-> If the value of a variable is different from object to object such type of variables are called instance variables.

		-> For every object a separate copy of instance variable will be created.
		
		-> For instance variable we are not required to perform initialization explicitly JVM will always provide default values.
		
			class Test  {
				
				
				int x;
				public static void main(String args[]){
					
					Test t = new Test();
					System.out.println(t.x); //0
				}
			}
		
		-> If the instance variable declared as final then compulsory we have to perform initialization explicitly whethere we are using or not and JVM won't provide default
			values.
			
			Ex. 
			
			class Test {
				
				final int x ;
			}//invalid CE:variable x might not have been initialized.
			
	Rule: 

		1. For final instance variable compulsory we should perform initialization before constructor complition.
		
		2. That is the following are various places For initialization.
		
		Ex. 
		
		- At the time of declaration    Inside instance block 		Inside constructor
		 ---------------------------    ---------------------       -------------------
		                                                            
			class Test {                class Test {                class Test {
				                        	                        	
				final int x =10;        	final int x ;           	final int x ;
			}                           	{                       	Test() {
			                            		x =10;              		
		                                	}                       		x =10;
										}                           	}
                                                                    }
																	
		- These are the only possible place to perform initialization For final instance variables If we are trying to perform initialization any where Else then we will get 
		  compile time error.
		
		Ex.
		
			class Test {
				
				final int x ;
				
					public void m1(){
						
						x =10;
					}
			}//CE: cannot a value to final variable x 
		
		
		
	final static variables 	
	----------------------	
		
	   -> If the value of a variable is not different from object to object such type of variables are not recumanded to declare as instance variables we have to declare those 
		  variables at class level by using static modifier.
	  
	  -> In the case of instance variable For every object a separate copy will be create but in the case of static variables a single copy will be created at class level 
		 and shared by every object of that class.
		 
	  	 
																															----------------	
																															| Cname:DS     |
																															----------------
		class {																											|-----|		|	  |--------|
										-------------   -------------  -------------							-------------   -------------  -------------
			String name ;               |name:durga;|   |name:shiva;|  |name:Ravi; |                            |name:durga;|   |name:shiva;|  |name:Ravi; |
			int rollno;                 |rollno:101;|   |rollno:101;|  |rollno:101;|                            |rollno:101;|   |rollno:101;|  |rollno:101;|
			String Cname;               |Cname:DS   |   |Cname:DS   |  |Cname:DS   |							-------------   -------------  -------------
										-------------   -------------  -------------                            	s1          	s2         	s600
		}                               	s1          	s2         	s600                                    
		
		
		
	-> For static variables is not required to perform initialization explicitly JVM will always provide default values

			class Test {
				
				static int x;
				
				public static void main(String args[]){
					
					System.out.println(x);// 0 
					
				}
			}
			
			
	-> If the static variable declared as final then compulsory we should perform initialization explicitly otherwise we will get compile time error. And won't provide any
		default values


		
		class Test {
			
			final static int x ;
			
		} //CE: variable x might not have been initialized. 
		
		
		Rule: 
		
			- For final static variables compulsory we should perform initialization before class loading compilation.
			
			- That is following are various places For these.
			
				1. At the time declaration.
				
						class Test {
							
							final static int x =10;
						}
				
				2. Inside static block.
				
					class Test {
						
						final static int x;
						
						static {
							
							x = 10;
						}
					}
		
		
		    - These are the only possible to perform initialization For final static variables. If we are trying to perform initialization any where else then we will get compile 
			  time error.
			  
				Ex. 
				
					class Test {
						
						final static int x ;
						public static void m1(){
							
							x =10;
						}
					}//CE: cannot assign a value to final variable x 
		
		
	 final local variables 	
	------------------------

	 -> Sometimes to meet temporary requirement of the programmer we have to declare variables inside a method or block or constructor. Such type of variables are called local
		variables or temporary variables or stack variables or autmatic variables.
		
	-> For local variables JVM won't provide any default values compulsory we should perform initialization explicitly before using that local variable that is if we are not using 
	   then it is not required to perform initialization For local variable.
	
		Ex. 
	
		class Test {											class Test {
			                                                    	
				public static void main(String args[]) {        	public static void main(String args[]){
					                                            		
					int x ;                                     		int x ;
					System.out.println("Hello");                		System.out.println(x);
				}                                               	}
		} //Hello                                               }//CE: variable x might not have been initialized.
		
		
	 -> Even though local variable is final before using only we have to perform initialization that is If we are not using then it is not required to perform initialization even 
		though it is final.
		
		Ex. 

		class Test {
			
			public static void main(String args[]){
				
				final int x ;
				System.out.println("Hello");
			}
		} //Hello 
		
		
		
	-> The only applicable modifier For local variable is final by mistake If we are trying to apply any other modifier then we will get compile time error.

			class Test {
				
				int x ; // public default privaye protected 
				
				static int y; // public default privaye protected
				
				public static void main(String args[]){
					
					int x =10; //final 
				}
			}
			
			
			class Test {
				
				public static void main(String args[]) {
					
					public int x =10;		|
					private int x =10;		|
					protected int x =10;	|==>// invalid illegal start of expression 	
					static  int x =10;		|
					transient  int x =10;	|
					volatile  int x =10;	|
					
					final int x = 10; //valid 
					
				}
			}
				
	
Note: 
	
	-> If we are not declaring any modifier then by Default it is default but these rule is applicable only For instance and static variables but not For local variables.
	
	Formal parameter of a Method
   ------------------------------

		-> Formal parameter of a method simpily access local variable of that method hance a formal parameter can be declare as final.
		
		-> If formal parameter declared as final then within the method we can't perform re-assignment.
		
		Ex. 
	
		class Test {
			
			public static void main(String args[]){
				
				m1(10,20);
				  -------
					|----------> these values whatever we are passing these things by default considard as actual parameter or value.
				  
			}		
			public static void m1(final int x , int y){
								  --------------------
										|-----------------------These things considard as formal parameter

				x =100;// CE: cannot assign value to final variable x 			
				y =200;						
				System.out.println(x+"...+"y);						
			}						
		}
				
					
	
		
		
		
		
		
		
		
		
	   

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		