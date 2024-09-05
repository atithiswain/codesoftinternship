import java.util.*;

public class Numbergame {

    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int chances=12;
     int finals=0;
         boolean playAgain=true;
         System.out.println("welCome player");
         System.out.println("Hii player you have About_" +chances+ " _To won the game!!!");
         while (playAgain) {
            int rand =getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance"+(i+1)+"Enter your guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("you won it.");
                    break;

                }
                else if(user > rand){
                  System.out.println("Too High");

                }
                else{
                    System.out.println("Too low!!!!!");
            
                }

            }
            if(guess==false){
                System.out.println("Sorry player you Lost the chance!!!"+rand);
            }
            System.out.println("Do you want to Play again(yes/No)");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("y");


         }
         System.out.println("Thats it player ,Hope you enjoy it:");
         System.out.println("Here is your Score "+finals);


        }

         static int getrandN(int main,int max){

            int min=1;


            return (int)(Math.random()*(max-min+1)+min);



         }
 }
    