package leetcode;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-words/
//692. Top K Frequent Words
public class leetcode692 {
	public static void main(String[] args) {
		System.out.println(new leetcode692().topKFrequent(new String[] { "i","love","leetcode","i","love","coding" },2));
		System.out.println(new leetcode692().topKFrequent(new String[] { "the","day","is","sunny","the","the","the","sunny","is","is" },4));
	}
	
	public List<String> topKFrequent(String[] words, int k) {
		List<String> result = new ArrayList<String>();
		TreeMap<String, Integer> check = new TreeMap<>();
		
		for(int i= 0 ; i < words.length; i++) {
			int cnt = check.get(words[i]) != null ? check.get(words[i]) + 1 : 1;
			
			check.put(words[i], cnt);
		}
		List<String> list = new ArrayList<String>(check.keySet());
		Collections.sort(list, (value1, value2) -> (check.get(value2).compareTo(check.get(value1))));
		for(String key : list) {
			if(k > 0) {
				result.add(key);	
			} else {
				break;
			}
			k--;
		}
		return result;
	}
}