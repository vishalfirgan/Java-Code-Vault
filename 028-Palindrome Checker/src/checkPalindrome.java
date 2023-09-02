
public class checkPalindrome {
      public boolean isPalindrome(int n)
      {
    	  int rem=0;
    	  int temp=n,reverse=0;
    	  while(n!=0)
    	  {
    		  rem=n%10;
    		  reverse=rem+10*reverse;
    		  n=n/10;
    	  }
   
    	 
    	 if(temp==reverse)
    		 return true;
    	 else
    		 return false;
      }
} 