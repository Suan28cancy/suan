package constructorandinterface;

interface Animal{  
void print();  
}  
class Interface implements Animal{  
public void print(){System.out.println("Bark");}  
 
public static void main(String args[]){  
Interface obj = new Interface();  
obj.print();  
 }  
}  



