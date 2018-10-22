
//Java code for thread creation by extending 
//the Thread class 
class Multithreading extends Thread 
{ 
 public void run() 
 { 
     try
     { 
         // Displaying the thread that is running 
         System.out.println ("Thread " + 
               Thread.currentThread().getId() + 
               " is running");
         System.out.println();
         System.out.println(Thread.currentThread().getName()+Thread.currentThread().getClass());
         System.out.println();
         System.out.println(Thread.currentThread().getPriority());
         System.out.println();
     } 
     catch (Exception e) 
     { 
         // Throwing an exception 
         System.out.println ("Exception is caught"); 
     } 
 } 
} 

//Main Class 
public class MultithreadingDemo
{ 
 public static void main(String[] args) 
 { 
     int n = 8; // Number of threads 
     for (int i=0; i<2; i++) 
     { 
         Multithreading object = new Multithreading(); 
         object.start(); 
     } 
 } 
} 