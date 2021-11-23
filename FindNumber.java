import java.util.Scanner;

class FindDetailNumber{
	
	public int countNumber(int number,int findNumber) {
		int count=0;
		
		if(number>10000) {
			System.out.println(number%100/10);
			if(number/10000==findNumber)count++;
			if(number%10000/1000==findNumber)count+=1;
			if(number%1000/100==findNumber)count+=1;
			if(number%100/10==findNumber)count+=1;
			if(number%10==findNumber)count++;
			
		}
		
		else if(number>1000) {
			
			if(number%1000==7)count++;
			if(number%100==7)count++;
			if(number%10==7)count++;
		}
		
		else if(number>100) {
		
			if(number%100==7)count++;
			if(number%10==7)count++;
		}
		
		else if(number>10) {
			
			if(number%100==7)count++;
			if(number%10==7)count++;
		}
		else {
			if(number==7)count++;
		}
		
		
		
		return count;
	}
}

public class FindNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		FindDetailNumber fdn=new FindDetailNumber();
		System.out.println(fdn.countNumber(sc.nextInt(),sc.nextInt()));
		
		
		
	}
}
