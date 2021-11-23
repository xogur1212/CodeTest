class Solution123 {
	public int countPrimes(int n) {
		int count=0;
        
        
		boolean []primes =new boolean[n+1];
        
       
		for(int i=2;i<primes.length;i++) {
			primes[i]=true;
		}
		
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			//소수가 맞으면
			if(primes[i]) {
				for(int j=i*i;j<=n;j+=i)
					primes[j]=false;
			}
			
			
		}
		for(int i=0;i<n;i++) {
			if(primes[i]) count++;
				
		}
		
        
		return count;

	}
}