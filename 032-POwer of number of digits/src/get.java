
public class get {
     public int power(int n)
     {
    	 int temp=n;
    	 int cnt=0;
    	 while(temp!=0)
    	 {
    		 
    		 cnt++;
    		temp=temp/10;
    	 }
    	 if(cnt==1)
    	 {
    		 return n;
    	 }
    	 int mul=1;
    	 while(cnt!=0)
    	 {
    		 
    		 mul=mul*n;
    		 cnt--;
    	 }
    	 return mul;
     }
}
