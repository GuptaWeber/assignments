import java.util.List;
import java.util.Scanner;

import com.exception.PersonNotFoundException;
import com.interfaces.PersonImpl;
import com.pojo.Person;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonImpl pImpl = new PersonImpl();
		Scanner sc = new Scanner(System.in);
		
		
		List<Person> persons = pImpl.getPersons();
		
		try
		{
			int i =0,ch;
			
			do{
				System.out.println("Enter your choice: \n 1. Find a Person by Id \n 2. Remove a Person "
						+ " \n 3. Update a Person \n 4. Display Persons \n 5. Add a Person");
				
				ch=sc.nextInt();
				if(ch==1){
					
					System.out.println("Enter the id of Person");
					int id = sc.nextInt();
					
					Person p = pImpl.findById(id, persons);
					
					if(p.getName()!=null){
						System.out.println(p.toString());
					}else{
						throw new PersonNotFoundException("Person Not Found Exception");
					}
					
				}else if(ch == 2){
					System.out.println("Enter the id of Person that you want to remove");
					int id = sc.nextInt();
					
					if(pImpl.removePerson(id, persons)){
						System.out.println("Person Removed Successfully");
					}else{
						throw new PersonNotFoundException("Person Not Found Exception");
					}
					
				}else if(ch == 3){
					System.out.println("Enter the id of Person that you want to update");
					int id = sc.nextInt();
					Person p = pImpl.updatePerson(id, persons);
					
					if(p.getName()!=null){
						System.out.println("Person Got Updated");
					}else{
						throw new PersonNotFoundException("Person Not Found Exception");
					}
					
				}else if(ch == 4){
					pImpl.displayPersons(persons);
				}else if(ch == 5){
					System.out.println("Enter the id and name of the Person");
					int id = sc.nextInt();
					String name = sc.next();

					pImpl.addPerson(persons, new Person(id, name));
					
					System.out.println("Added Person");
					
					
				}else if(ch ==0){
					break;
				}
				
			}while(i==0);
		


		
		
		
		}catch(PersonNotFoundException e){
			e.displayMessage();
		}
	}

}
