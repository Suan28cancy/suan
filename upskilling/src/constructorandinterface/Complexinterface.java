package constructorandinterface;

//Interface Declaration
interface Animal1{  
void FiveSense();  
}  

//Implement interface 
class Dog implements Animal1{  
public void FiveSense()
{
	System.out.println("Dog Barks !!!");
}  
}  
class Cat implements Animal1{  
public void FiveSense()
{
	System.out.println("Cat Meow!!!");}  
} 
 
//Using Interface
class Complexinterface{  
public static void main(String args[]){  
Animal1 d=new Cat();  
d.FiveSense();  

Animal1 e = new Dog();
e.FiveSense();
}
}
