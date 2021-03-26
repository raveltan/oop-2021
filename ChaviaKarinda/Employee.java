
import java.util.ArrayList;
import java.io.*;

public class Employee {
int id;
String name;
String design;
static ArrayList al = new ArrayList(); 
//Return the list representation of array
//Any change in array elements will change the arraylist also
static int count = 0; //To track the no. of employees

Employee()
{
}

//Constructor for initializing employee objects

Employee(int id, String name, String design)
{
this.id = id;
this.name = name;
this.design = design;
count++;
}

//Method to store employees details in an arraylist

public void putDetails(Employee C)
{
al.add(e);
}

//Method to retrieve employee objects

public Employee getDetails(int id)
{
Employee Cs = (Employee)al.get(id);
return Cs;
}


public static void main(String[] args) throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Employee C = new Employee();
Employee C1 = new Employee(1, "SaiRam", "Project Owner");
Employee C2 = new Employee(2, "Ameina", "GL");
Employee C3 = new Employee(3, "Jenisha", "PM");
Employee C4 = new Employee(4, "Camille", "PL");
Employee C5 = new Employee(5, "Gabriel", "TL");
Employee C6 = new Employee(6, "Katami", "TM");


C.putDetails(C1);
C.putDetails(C2);
C.putDetails(C3);
C.putDetails(C4);
C.putDetails(C5);
C.putDetails(C6);

System.out.println("The total number of employees are: " +count);
System.out.println(" ");

while(true)
{
System.out.println("Enter employee id to get the employee details: ");
int id = Integer.parseInt(br.readLine());
boolean flag = false;

for(int i=0; i {
Employee es = e1.getDetails(i);
if(id == es.id)
{
System.out.println("The details of the employee with id " +id +" is: ");
System.out.print(es.id +" " +es.name+" " +es.design);
flag = true;
break;
	}
}

System.out.println(" ");

if(!flag)
{
System.out.println("Sorry, no data exists with the id " +id);
}
System.out.println(" ");
String ch = null;

while(true)
{
System.out.println("Want to Continue(yes/no)?)");
System.out.println(" ");
ch = br.readLine();
if(ch.equalsIgnoreCase("yes") || ch.equalsIgnoreCase("no")) break;
if(!(ch.equalsIgnoreCase("yes") || ch.equalsIgnoreCase("no")))
{
System.out.println("Invalid option : Please type yes/no");
System.out.println(" ");
	}
}

Object[] array = list.toArray();
 
        //Printing the elements of the returned array
        //This method returns an array containing all elements of the ArrayList
 
        for (Object object : array)
        {
            System.out.println(object);
        }

if(ch.equalsIgnoreCase("no"))
{
System.out.println(" ");
System.out.println("Thank you!");
break;
			}
		}
	}
