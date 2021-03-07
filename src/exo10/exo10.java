package exo10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class exo10 {
	public static void main(String[] args) {
		List <String> strings= Arrays.asList("Alex","John","Elijah","David","Nicolas","james","def");
		List <String> strings2= Arrays.asList("Alex","John","Elijah","David","Nicolas",null);
		
		
		System.out.println("\n Question 1 \n");
		Function<String,String> f1= (String s)-> s.toUpperCase();
		for(String s:strings) {
			System.out.println(s+" tourné en majuscules : " +f1.apply(s));
		}
		
		System.out.println("\n Question 2 \n");
		Function<String,String> f2= (String s)-> s == null ? "": s ;
		for(String s:strings2) {
			System.out.println(s+" : " +f2.apply(s));
		}
		
		System.out.println("\n Question 3 \n");
		Function<String,Integer> f3= (String s)-> s == null ? 0: s.length();
		for(String s:strings2) {
			System.out.println("Taille de " + s + ": " +f3.apply(s));
		}
		
		System.out.println("\n Question 4 \n");
		Function<String,String> f4= (String s)-> s == null ? "()": "("+s+")";
		for(String s:strings2) {
			System.out.println(s+" entre parenthèses : " +f4.apply(s));
		}
		
		System.out.println("\n Question 5 \n");
		System.out.println("-1 = n'existe pas \n");
		BiFunction<String,String,Integer> f5= (String s1,String s2)-> s1.indexOf(s2);
		for(String s:strings) {
			System.out.println("L'indice d'occurence de '(ij) dans " + s + ": " +f5.apply(s,"ij"));
		}
		
		System.out.println("\n Question 6 \n");
		BiFunction<String,String,Integer> f6= (String s1,String s2)-> s1.indexOf(s2);
		for(String s:strings) {
			System.out.println("L'indice d'occurence de " + s + " dans (abcdefghi): " +f6.apply("absdefghi",s));
		}
	}
}
