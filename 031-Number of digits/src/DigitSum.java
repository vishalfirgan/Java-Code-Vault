
public class DigitSum {
  public int getNoDigits(int n)
  {
	  int cnt=0;
	  while(n!=0)
	  {
		  cnt++;
		  n=n/10;
	  }
	  return cnt;
  }
}
