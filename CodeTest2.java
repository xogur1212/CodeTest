import java.util.HashMap;
class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Integer> hashMap =new HashMap<>();
        for(String number: phone_book){
            hashMap.put(number,0);
           
        }
     
        for(String number: hashMap.keySet()){
            for(String number2 : phone_book)
               // if(number.contains(number2)){
                if(number.startsWith(number2)){
                	hashMap.put(number,hashMap.get(number)+1);
                }
               
        }
        for(String number : hashMap.keySet()) {
        	if(hashMap.get(number)!=1)
        		answer=false;
        }
        return answer;
    }
}


public class CodeTest2 {

	public static void main(String[] args) {
		Solution2 s1 =new Solution2();
		String [] phone_book= {"11931","123","456"};
		System.out.println(s1.solution(phone_book));
	}
}
