#Q1) https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
class Solution:
    def power(self,N,R):
        div=1000000007
        s=pow(N,R,div)
        return s
#Q2) https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
class Solution:
    def gcd(self, a : int, b : int) -> int:
        # code here
        x=max(a,b)
        y=min(a,b)
        while(b!=0):
            r=a%b
            a=b
            b=r
        return a
#Q3) https://www.geeksforgeeks.org/problems/reverse-digit0316/1
class Solution
{
    public long reverse_digit(long n)
    {
        long num=0;
        // Code here
        while(n!=0){
            long r=n%10;
            num=num*10+r;
            n/=10;
        }return num;
    }
}
