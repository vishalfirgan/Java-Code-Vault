
public class Powerr {
   public int   getPower(int num,int n)
      { int mul=1;
	      while(n!=0)
	      {
	    	  mul=mul*num;
	    	n--;  
	      }
    	  return mul;
      }
}
