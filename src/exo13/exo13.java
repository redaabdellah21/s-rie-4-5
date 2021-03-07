package exo13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exo13 {

	public static void main(String[] args)  {
		Map<Integer,String> map =new HashMap<Integer,String>();
		map.put(3, "one");
		map.put(4, "four");
		map.put(5, "three");
		map.put(6, "eleven");
		System.out.println("\n Question 1 \n");
		 for (Map.Entry<Integer, String> entry : map.entrySet()) {
			   System.out.println(entry.getKey()+" = "+entry.getValue().toUpperCase()) ;
			}
		List<Integer> keys = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("\n Question 2 \n");
		for(int key:keys) {
			map.putIfAbsent(key, "");
			System.out.println("[" + key +  "] = " + map.get(key)) ;
		}
		
		List <String> words= List.of("one","tow","three","four","five","six","seven","eight","nine","ten","eleven","twelve");
		Map<Integer,List<String>> map2= new HashMap<>();
		for(String word:words) {
			int key=word.length();
			map2.computeIfAbsent(key, l -> new ArrayList<>())
			    .add(word);
		}
		System.out.println("\n Question 3 \n");
		map2.forEach((key,word)-> System.out.println("[" + key +  "]" +"="+ word)) ;
		Map<Integer,String> map3= new HashMap<>();
		for(String word:words) {
			int key=word.length();
			map3.merge(key,word,(val,newval)->val+","+newval);
		}
		System.out.println("\n Question 4 \n");
		map3.forEach((key,word)-> System.out.println("[" + key +  "]" +"="+ word)) ;
	}
	

}
