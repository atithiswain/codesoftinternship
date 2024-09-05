import java.util.*;

public class StuGreadCalculator {


    public static void main(String arg[]){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Wellcome To StudentGread Calculator!!");
          System.out.println("Enter the number of Subject: ");
                      
          int NumberOfSubject=scanner.nextInt();

          int TotalMarks=0;// This is the total number oF Subject 

          for(int i=1;i<=NumberOfSubject;i++){
             System.out.println("Enter the marks obtained in Your Subject"+ i +":");
              int marks=scanner.nextInt();
              TotalMarks=TotalMarks+marks; 
             
          }
          double aveper=(double)TotalMarks/NumberOfSubject;
           
             String Grade;
            if(aveper>=90){

                Grade="O";

            }
              else if(aveper>=80){
                Grade="A";

            }
            else if(aveper>=70){
                Grade="A pluse";
            }
            else if(aveper>=60){
                Grade="B";

            }
           else  if(aveper>=50){
                Grade="B pluse";

            }
            else if(aveper>=40){
                Grade="C";

            }
            else if(aveper>=30){
                Grade="D";
               
            }
            else{

                Grade="F";
                System.out.println("You are Fail!!");
            }
           
           System.out.println("Total Marks Scored is "+TotalMarks);
           System.out.println("Average persendage Gained is"+ aveper +"%");
           System.out.println("Grade:"+Grade);


    
}
}
