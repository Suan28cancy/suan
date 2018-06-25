package collections.Arraylist;


import java.util.*;
public class hasNextarraylist {
 
public static void main(String args[]){  
//Creating user-defined class objects  
Userdefinedclassobjectarraylist s1=new Userdefinedclassobjectarraylist(101,"suan","Female");  
Userdefinedclassobjectarraylist s2=new Userdefinedclassobjectarraylist(102,"Vinu","Male");  
  
 //creating arraylist  
ArrayList<Userdefinedclassobjectarraylist> al=new ArrayList<Userdefinedclassobjectarraylist>();  
al.add(s1);//adding Userdefinedclassobjectarraylist class object  
al.add(s2);  
 
//Getting Iterator  
Iterator itr=al.iterator();  
//traversing elements of ArrayList object  
while(itr.hasNext()){  
 Userdefinedclassobjectarraylist st=(Userdefinedclassobjectarraylist)itr.next();  
System.out.println(st.SSN+" "+st.name+" "+st.status);  
 }  
}  
}  


