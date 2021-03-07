package exo9;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class exo9 {

	public static void main(String[] args) {
		List <String> strings= Arrays.asList("Alex","John","Elijah","David","Nicolas","james");
		
		System.out.println("\n Question 1 \n");
		Predicate <String> p1= (String s)-> s.length()>4;
		for(String s:strings) {
			System.out.println(s+" a plus que 4 caractere : " +p1.test(s));
		}
		
		System.out.println("\n Question 2 \n");
		List <String> strings2= Arrays.asList("Alex","John","Elijah","David","Nicolas",null,"");
		Predicate <String> p2= (String s)-> s!=null;
		for(String s:strings2) {
			System.out.println(s+" n'est pa null : " +p2.test(s));
		}
		
		System.out.println("\n Question 3 \n");
		Predicate <String> p3= (String s)-> s.startsWith("J")||s.startsWith("j");
		for(String s:strings) {
			System.out.println(s+" commence par J: " +p3.test(s));
		}
		
		System.out.println("\n Question 4 \n");
		Predicate <String> p4= (String s)-> s.length()==5;
		for(String s:strings) {
			System.out.println(s+" a 5 caractere : " +p4.test(s));
		}
	
		System.out.println("\n Question 5 \n");
		Predicate <String> p5= (String s)-> p4.test(s) && p3.test(s);
		for(String s:strings) {
			System.out.println(s+" a 5 caractere et commence par J : " +p5.test(s));
		}
	}

}
