class Armstrong{
    public static void main(String[] args) {
       int n=153;
       Armstrong obj=new Armstrong();
    Boolean res=obj.armstrong(n);
    System.out.println(res);
    }
    Boolean armstrong(int n){
        int cnt=0,last=0,ans=0,n1=n,n2=n;
        while(n1>0){
            cnt++;
            n1=n1/10;
        }
        while(n2>0){
             last=n2%10;
             ans+=(int)(Math.pow(last,cnt));
            n2=n2/10;
        }
           return ans==n;    
    }
}
