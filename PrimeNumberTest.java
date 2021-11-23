import java.util.*;

class PrimeNumber {

	int countPrimes(int n) {
		int count=0;
		boolean []primes =new boolean[n+1];
		for(int i=0;i<primes.length;i++) {
			primes[i]=true;
		}
		
		primes[0]=primes[1]=false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			//소수가 맞으면
			if(primes[i]) {
				for(int j=i*i;j<=n;j+=i)
					primes[j]=false;
			}
			
			
		}
		for(int i=0;i<=n;i++) {
			if(primes[i]) count++;
				
		}
		
		return count;

	}
}

public class PrimeNumberTest {

	public static void main(String[] args) {
		PrimeNumber dc = new PrimeNumber();
		System.out.println(dc.countPrimes(100));

	}
}
