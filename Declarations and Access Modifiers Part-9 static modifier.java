
														Declarations and Access Modifiers Part-9|| static modifier
													================================================================

 static modifier
=================

	-> static is the modifier applicable For method and variables but not For classes.
	
	-> We can't declare top level class with static modifier but we can declare inner class as static (such type of inner classes are called static nested classes).
	
	-> In thes case of instance variables  for every object a separate copy will be created but in the case of static variables a single copy will be created at class level 
	   and shared by every object of that class.
		
		Ex. 
		
		class Test {
																				 --------------
			static int x =10;											----->  | x =10, 888  |<-----------------------------
			int y =20;													|		---------------								|
																		|													|
			public static void main(String args[]){						|													|	
																		|													|
				Test t1 = new Test();									|-------|											|	
				t1.x=888;													   --------------								|
				t1.y=999;												t1---->| y = 20, 999|						   	  ---------
				Test t2 = new Test();										   --------------						t2--> | y = 20|
				System.out.println(t2.x+"..."+t2.y);																  	  ---------
			}
		} // 888 20 
		
	
	-> 	We can't access instance member directly from static area but we can access from instance area directly.
	
	-> We can access static members from both instance and static areas directly.
	
		Ex 
	
			class Test {
				
				int x = 10; 
				static int y =20;
				
				public void m1(){
					
					System.out.println(x);
					System.out.println(y);
				}
				public static void m1(){
					System.out.println(x);//invalid 
					System.out.println(y);
					
				}
			}
	
		-> Considard the following declarations ? 
				
		I. int x =10;
		
	   II. static int x = 10;
	   
	  III. public void m1(){
												
			System.out.println(x);				
			}	
			
	  IV. public static void m1(){				
		  
			System.out.println(x);
			}
	  
		- Within the same class which of the above declarations we can take  simultaneously.
	  
	  
			A. I and III //valid 
            B. I and IV  //invalid CE: non-static variables x cannot be referenced from a static context 
            C. II and III //valid 
            D. II and IV //valid 
			E. I and II // invalid CE: variable x is already defined in Test 
			F. III and IV // invalid CE: m1() is already defined in Test.
			
 Case 1: Overloading concept applicable for static methods including main() methd. But JVM can always call String [] aray argument main() method only.
 
			Ex. 
		
			class Test{ 
			
				public static void main(String args[]){<-----------
																  |
					System.out.println("String[]");				  |	
				}												  |//==> Overloaded method 
				public static void main(int [] args){			  |	
																  |
					System.out.println("int[]");				  |
				}<-------------------------------------------------
			} //Stirng[] 
			
			
		- Other overloaded method we have to call just like a normal method call.



 Case 2: Inheritance concept applicable for static methods including main method hance while excuting child class If child doesn't containe main() method then parent class main()
		 method will be executed.
		 
		 Ex. 
 																									
                                                                                                                
			class P {<----------------------------------------												    				javac p.java 
															 |                                                  					|
				public static void main(String args[]) {     |                                                  		 ----------------------
					                                         |                                                  		 |					  |	
					System.out.println("Parent main");       |                                                  	 p.class 				c.class
				}                                            |//====> Save as p.java                            		
			}                                                |                                                  		
			Class  C extends P{								 |			                                        java P 						java c 
															 |                                                  
			}<------------------------------------------------                                                  o/p: parent main 			parent main 
			
			
 Case 3: It's seems overriding concept applicable for static method but it is not overriding and it is method hidding.

		Ex. 																										    
                                                                                                                    				javac p.java 
		class P {<----------------------------------------                                                          					|
														 |	                                                        		 ----------------------
			public static void main(String args[]) {     |	                                                        		 |					  |	
				                                         |		                                                    	 p.class 				c.class
				System.out.println("Parent main");       |	                                                        		
			}                                            |	                                                        		
		}                                                |	// ==> It is method hidding but not overriding.         java P 						java c 
		Class  C extends P{								 |	                                                        
                                                         |                                                          o/p: parent main 			child main
			public static void main(String args[]) {     |
				                                         |
				System.out.println("Parent main");       |
														 |	
			}										 	 |	
		}<------------------------------------------------	

 Note: 

	- For static method overloading and inheritance concept are applicable but overriding concept are  not applicable but initiated of overriding method hidding concept are 
	  applicable.

-> Inside method implimentation if we are using at lest one instance variable then that method talks about a particular object. Hance we should declare method as instance method. 
 
-> Inside method implimentation if we are not using any instances variable then these method no way related to a particular object hance a we have to declare such type of method 
   as static method irespective of whether we are using static variables or not.


	class Student  {
		
		String name;
		int rollno;
		int marks;
		static String Cname;
		
				getStudentInfo(){
					
					return name+"...+"marks;
					
				} //instance method 
				
				getCollegeInfor(){
					
					return cname;
				} // static method 
				
				getAverage(int x, int y){
					
					return x+y/2;
					
				} // static method 
				getcompliteInfo(){
					
					return name+".."marks+".."+rollno+"..."+cname;
				} // instance method 
		
			
	-> For static methods implimentation should be available where as For abstract methods implimentation is not available hance a abstract static combination is illegal For 
	   methods.


	synchronized modifier
 --------------------------

	-> synchronized is the modifier applicable For methods and blocks but not For classes and variables.
	
	-> If multiple threads trying to operate simultaneously on the same java object then there may be a chance of data inconsistancy problem these is called race condition.
	 
	-> We can overcome these problem by using synchronized keyword.
	
	-> If a method or block declared as synchronized then at a time only one thread is allowed to execute that method or block on the given object so that data inconsistancy 
		problem will resolved.
		
	-> But the main disadvantage o synchronized is it increases waiting time of threads and cretes perfrmenace problem . hance a IF there is no specific requirement then it is 
		not recomanded to use synchronized keyword.

	-> synchronized method should compulsory containe implimentation where as abstract method doesn't containe any implimentation hance a' abstract and synchronized is illegal
		combination of modifier For methods.
		
	
































	  
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			