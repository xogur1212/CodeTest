import java.util.*;

class Solution3 {
    public int solution(String[][] clothes) {
        int answer = 0;
       
       // HashMap<String,Integer> clothesMap =new HashMap<>();
       
        for(int i=0;i<clothes.length;i++) {
        	for(int j=0;j<clothes[i].length;j++) {
        		answer++;
        		
        	}
        }
  
        for(int i=0;i<clothes.length;i++) {
        
        	for(int a=0;a<=i;a++) {
        		
        			if(i!=a) {
        				if(clothes[i][1]==clothes[a][1]) {
            				
                			answer--;
                			
            			}
        			}
        			
        		
        	}
        	
        }
        
        return answer;
    }
}
public class CodeTest3 {

	public static void main(String[] args) {
		Solution3 s3 =new Solution3();
		//String [][] clothes = {{"a","head"},{"c","sunglasses"},{"e","head"}};
		String [][]clothes ={{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		System.out.println(s3.solution(clothes));
	}
}
