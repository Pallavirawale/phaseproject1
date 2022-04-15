
//This section will guide you to: 
//●	Create a Java project in your IDE
//●	Write a program in Java to verify the working of access modifiers
//
//
//
//This lab has three subsections, namely:
//1.2.1	Writing a program in Java to implement access modifiers
//1.2.2	Executing the program and verifying how the access modifiers work
//1.2.3	Pushing the code to your GitHub repositories

//1. Class is having Default access modifier 
//class defAccessSpecifier
//{ 
//  void display() 
//     { 
//         System.out.println("You are using defalut access specifier"); 
//     } 
//} 
//
//public class accessSpecifiers1 {
//
//	public static void main(String[] args) {
//		//default
//		System.out.println("Dafault Access Specifier");
//		defAccessSpecifier obj = new defAccessSpecifier(); 		  
//        obj.display(); 
//
//	}
//}
//
//
////2. using private access specifiers
//class priaccessspecifier 
//{ 
//   private void display() 
//    { 
//        System.out.println("You are using private access specifier"); 
//    } 
//} 
//
//public class accessSpecifiers2 {
//
//	public static void main(String[] args) {
//		//private
//		System.out.println("Private Access Specifier");
//		priaccessspecifier  obj = new priaccessspecifier(); 
//        //trying to access private method of another class 
//        //obj.display();
//
//	}
//}
//
//
////3. using protected access specifiers
//package pack1;
//
//public class proaccessspecifiers {
//
//	protected void display() 
//    { 
//        System.out.println("This is protected access specifier"); 
//    } 
//}
//
////create another package
//package pack2;
//
//import pack1.*;
//
//public class accessSpecifiers3 extends proaccessspecifiers {
//
//	public static void main(String[] args) {
//		accessSpecifiers3 obj = new accessSpecifiers3 ();   
//	       obj.display();  
//	}
//
//}
//
//
//
//
//
//
////4. using public access specifiers
//package pack1;
//
//public class pubaccessspecifiers {
//
//	public void display() 
//    { 
//        System.out.println("This is Public Access Specifiers"); 
//    } 
//}
//
////create another package
//package pack2;
//import pack1.*;
//
//public class accessSpecifiers4 {
//
//	public static void main(String[] args) {
//		
//		pubaccessspecifiers obj = new pubaccessspecifiers(); 
//        obj.display();  
//		
//	}
//}
