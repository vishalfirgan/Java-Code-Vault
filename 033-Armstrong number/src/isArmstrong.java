
public class isArmstrong {
    public boolean  checkArmstrong(int n)
      {
    	
    	int temp=n;
    	int count=getNoOfDigits(n);
    	int sum=0;
    	while(n!=0)
    	{
    		int rem=n%10;
    		int mul=(int)Math.pow(rem, count);
    		
    		sum+=mul;
    		n=n/10;
    	}
    	
    	
//    	if(temp==sum)
//    	{
//      	return true;
//    	}else{
//    		return false;
//    	}
    	 
    	 //rather we can use following
    	 return temp==sum;
    	 
      }
    public int getNoOfDigits(int n)
    {
    	int cnt=0;
    	while(n!=0)
    	{
    		n=n/10;
    		cnt++;
    	}
    	return cnt;
    }
}
