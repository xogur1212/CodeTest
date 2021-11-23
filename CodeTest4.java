import java.util.*;

class Solution4 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        
        while(it.hasNext()) {
        	
            answer *= it.next().intValue()+1;
          
        }
        return answer-1;
    }
}
public class CodeTest4 {
	public static void main(String[] args) {
		Solution4 s4 =new Solution4();
		String [][] clothes = {{"a","head"},{"c","head"},{"e","head"}};
		//String [][]clothes ={{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int abc=5;
		
		System.out.println(abc);
		System.out.println(s4.solution(clothes));
	}
}
