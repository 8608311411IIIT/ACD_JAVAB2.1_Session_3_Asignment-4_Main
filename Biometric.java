/*program which is just like a biometric which keeps record on number of students present in a particular class as well as number of students in the 
 school in a specific day by the use of static variable and static method.*/
import java.util.*;
class Attendance{
    private static int aSchool=0;//no of student present in school
    private static int []aClass=new int[10];//no of students present in each class(1st to 10th class); 
    static{
    for(int i=0;i<10;i++)
        aClass[i]=0;//student in each class initialized to 0
    }
          public static void setAttendance(int x){//method which increas the count of attendance according to user input.
               aClass[x-1]++;
               aSchool++;
          }

              public static void showAttendance(){//method which shows user no of students present in each class and school too
                   System.out.println("Number of student in class are");
                   for(int i=0;i<10;i++)
                   System.out.println("class "+(i+1)+" :"+aClass[i]);
                   System.out.println("Number of student in school is "+aSchool+" \n");    
              }
}

public class Biometric{

     public static void main(String []args){
         int i,cls;
         while(true){
         System.out.println("Select a choice.\n1.Enter the attendance.\n2.To check no of students in a class and in school\n3.Exit");
         Scanner sc=new Scanner(System.in);
         i=sc.nextInt();
         
          
            if(i==1){
                
                System.out.println("Enter your class ");//we assume that a class has a max of 60 student.
                cls=sc.nextInt();
                Attendance.setAttendance(cls);
               
            }
               
                else if(i==2){
                    Attendance.showAttendance();
                }
                     else if(i==3){
                          System.exit(0); 
                     }
     
                        else{
                            System.out.println("Invalid choice selected");
                       
                       }
          }
     }

}
