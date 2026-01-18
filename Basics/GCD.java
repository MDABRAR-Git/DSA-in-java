public class GCD
{
	public static void main(String[] args) {
		int n1=9,n2=12;
		GCD obj=new GCD();
		int ans=obj.gcd(n1,n2);
		System.out.println(ans);
	}
	int gcd(int n1,int n2){
		if(n1==0)
			return n2;
		if(n2==0)
			return n1;
		if(n1==n2)
			return n1;
		if(n1>n2)
			return gcd(n1-n2,n2);
		return gcd(n1,n2-n1);
	}
}
