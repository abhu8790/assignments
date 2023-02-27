//WAP to understand the concept of final variable 
class Cricket
{
   final int ballspeed = 123;   // Data Member 1 
   void run()    // run() method definition 
   {
      // ballspeed = 150; // CTE
	   System.out.println("\n\nSpeed of ball in run method is "+ballspeed);
   }
   public static void main(String args[])
   { 
       Cricket c = new Cricket();   // Instance or object creation
	   c.run();   // Method call or message passing
   }
}
