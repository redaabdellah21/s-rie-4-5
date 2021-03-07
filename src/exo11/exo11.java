package exo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class exo11  {
	public static void main(String[] args) {
		List<String> strings= Arrays.asList("Alex","John","Elijah","David","Nicolas","james");
		List <String> strings2= Arrays.asList("Luca","Giani");
		
		System.out.println("\n 0==> Egaux , -1==> False, 1==> True \n");
		
		Comparator<String> c1= Comparator.comparingInt(String::length);
		System.out.println(" \n Question1: \n");

		for(String s:strings) {
			for (String s1:strings2) {
			System.out.println( s + " est plus grand que " +s1+" : " +c1.compare(s,s1));
			}
		}
		List<Person> persons= new ArrayList<>();
		List<Person> persons2= new ArrayList<>();
		List<Person> persons3= new ArrayList<>();
		Person p1 = new Person ("Zineddine","Ziden",25);
		Person p2 = new Person ("Ronaldo","Jr",30);
		Person p3 = new Person ("Beckham","David",35);
		Person p4 = new Person ("Figo","Luis",40);
		Person p5 = new Person ("Casillas","Iker",45);
		Person p6 = new Person ("Messi","Lionel",35);
		Person p7 = new Person ("Iniesta","Andres",35);
		Person p8 = null;
		Person p9 = new Person ("Messi","plastique",35);
		Person tab[]= {p1,p2,p3,p4,p5,p9};
		Person tab2[]= {p6,p7};
		for(int i=0;i<tab.length;i++) {
			persons.add(tab[i]);
		}
		for(int i=0;i<tab2.length;i++) {
			persons2.add(tab2[i]);
		}
		Person tab3[]= {p8,p6,p7,p8,p1,p8,p4};
		for(int i=0;i<tab3.length;i++) {
			persons3.add(tab3[i]);
		}
		Comparator<Person> c2= Comparator.comparing(Person::getNom);
		System.out.println(" \n Question2: \n");
		for(Person p:persons) {
			for (Person p11:persons2) {
			System.out.println( p + " est plus grand que " +p11+" : " + (c2.compare(p,p11)==0?0:c2.compare(p,p11)<0?1:-1));
			}
		}
		Comparator<Person> c3= Comparator.comparing(Person::getNom).thenComparing(Person::getPrenom);
		System.out.println(" \n Question3: \n");
		for(Person p:persons) {
			for (Person p11:persons2) {
			System.out.println( p + " est plus grand que " +p11+" : " +(c3.compare(p,p11)==0?0:c3.compare(p,p11)<0?1:-1));
			}
		}
		Comparator<Person> c4= Comparator.comparing(Person::getNom).thenComparing(Person::getPrenom).reversed();
		System.out.println(" \n Question4: \n");
		for(Person p:persons) {
			for (Person p11:persons2) {
			System.out.println( p + " est plus grand que " +p11+" : " +(c4.compare(p,p11)==0?0:c4.compare(p,p11)<0?1:-1));
			}
		}
		System.out.println(" \n Question5: \n");
	    Comparator<Person> cmpNull= Comparator.nullsLast(c3);
	    persons3.sort(cmpNull);
	    System.out.println(persons3.toString()+"\n");
		
		
	}

}