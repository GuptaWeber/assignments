package com.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.pojo.Person;

public class PersonImpl implements PersonIO {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public List<Person> getPersons() {

		int a=0;
		List<Person> persons = new ArrayList<Person>();
	
		while(a!=2){
		
		System.out.println("Enter Id and Name");
		persons.add(new Person(sc.nextInt(), sc.next()));
		a += 1;
		}
		return persons;
	}

	@Override
	public Person findById(int id, List<Person> persons) {
			
		for(Person p: persons){
			if(p.getpId()==id){
				return p;
			}
		}
		return new Person();
	}

	@Override
	public boolean removePerson(int id, List<Person> persons) {

		for(Person p: persons){
			if(p.getpId()==id){
				if(persons.remove(p)){
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Person updatePerson(int id, List<Person> persons) {
		
		for(Person p: persons){
			if(p.getpId()==id){
				
				System.out.println("Enter new Name");
				String name = sc.next();
				
				p.setName(name);
				return p;
			}
		}
		return new Person();
	}

	@Override
	public void displayPersons(List<Person> persons) {

		for(Person p : persons){
			System.out.println("PId : "+ p.getpId() + " PName : "+ p.getName());
		}
		
		
	}
	
	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		
		persons.add(person);
		
		return persons;
	}



}
