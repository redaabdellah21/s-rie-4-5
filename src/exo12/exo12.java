package exo12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class exo12 {

	public static void main(String[] args) {
		List<String> words= new ArrayList<>();
		words.add("one");words.add("two");words.add("three");words.add("four");words.add("five");words.add("six");words.add("seven");
		words.add("eight");words.add("nine");words.add("ten");words.add("eleven");words.add("twelve");
		System.out.println("\n Question 1 \n");
		words.forEach( System.out::println);
		System.out.println("\n Mettre les mots qui commencent par des voyelles en majuscules: ");// j'ai mis ça en avant pour voir plus d'exemples
		Predicate <String> vowel= (String s)-> s.startsWith("a")||s.startsWith("e")||s.startsWith("u")|| s.startsWith("i")||s.startsWith("o")||s.startsWith("y");
		for (String s:words) {
			if(vowel.test(s)==true) {
				System.out.println(s.toUpperCase());
			}
			else {
			System.out.println(s);
			}
		}
		System.out.println("\n Question 2 \n");
		words.removeIf(s-> s.length()%2==0);
		words.forEach(System.out::println);
		System.out.println("\n Question 3 \n");;
		words.replaceAll(String ::toUpperCase);
		words.forEach(System.out::println);
		
		Comparator<String> c1= Comparator.comparingInt(String::length);
		words.sort((c1.reversed()));
		System.out.println("\n Question 4 \n");
		words.forEach(System.out::println);
		Comparator<String> c2= Comparator.comparing(String::length).thenComparing(String::compareTo);
		words.sort((c2));
		System.out.println("\n Question 5 \n");
		words.forEach(System.out::println);
	}

}