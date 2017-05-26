//java program to show constructor chaining to other class using super() keyword
import java.util.*;
class Base{
     String name;
       public Base(String name){//constructor with single argument
           this.name=name;
           System.out.println("calling parametrized constructor of the base");
       }

          public Base(){//constructor with no arguments
                 this(" ");
                 System.out.println("No argument constructor of Base class");
          }
}

class Derived extends Base{//class Derived inheriting from Base class

     public Derived(){//constructor with no arguments
          System.out.println("No argument constructor of Derived class");
     }

         public Derived(String name){//constructor with single argument
              super(name);
              System.out.println("calling parametrized constructor of derived class");
         }


}

public class Constructor{

    public static void main(String []args){
          String name=new String();
          Scanner sc=new Scanner(System.in);
          System.out.println("Hello dude!!!!May i know ur good name. ");
          name=sc.next();//taking user name as input
          Derived obj=new Derived(name);//calling parametrized constructor
    }

}
