import java.util.*;  
// Parent class  
class Parent   
{  
    static   
    {  
        System.out.println("Parent class first static block");  
    }  
      
    static   
    {  
        System.out.println("Parent class second static block");  
    }  
}  
  
// Child class inheriting from Parent  
class Child extends Parent   
{  
    static   
    {  
        System.out.println("Child class static block");  
    }  
}  
  
// Main class to execute the program  
public class MainLoading  
{  
    public static void main(String [] args)   
    {  
        Child child=new Child();  
    }  
}  