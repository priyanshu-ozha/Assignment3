import java.util.*;
class Guesser{
    int guesserNo;
    int guesserNo(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Guesser Guess A Number Between 1 to 10");
        guesserNo=scan.nextInt();
        return guesserNo;
    }
}
class Player{
    int playerNo;
    int  playerNo(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Player Guess A Number Between 1 to 10");
         playerNo=scan.nextInt();
        return playerNo;
    }
}

class Umpire{
    int guessernumber;
    int playernumer1;
    int playernumber2;
    int playernumber3;

    void guesser(){
        Guesser guess=new Guesser();
        guessernumber=guess.guesserNo();
    }
    void player(){
        Player p1=new Player();
       playernumer1=p1.playerNo();
        Player p2=new Player();
        playernumber2=p2.playerNo();
        Player p3=new Player();
        playernumber3=p3.playerNo();
    }

    int checkValidityOfNumber(){
       if(guessernumber>10){
        if(playernumer1>10 && playernumber2>10 && playernumber3>10){
            System.out.println("The Guesser Player1,2 and 3  Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
        }else if(playernumer1>10 && playernumber2>10){
            System.out.println("The Guesser Player1,2 Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
  
        }else if(playernumber2>10 && playernumber3>10){
            System.out.println("The Guesser Player2 and 3  Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;

        }else if(playernumer1>10 && playernumber3>10){
            System.out.println("The Guesser Player1 and 3  Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;

        }else if(playernumer1>10){
            System.out.println("The Guesser Player1  Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;

        }else if(playernumber2>10){
            System.out.println("The Guesser Player2  Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;


        }else if(playernumber3>10){
            System.out.println("The Guesser Player3  Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;

        }else{
            System.out.println("The Guesser Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;

        }
        
       }else if(playernumer1>10){
        if(playernumber2>10 && playernumber3>10){
            System.out.println("The Player1,2 and 3 Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
        }else if(playernumber2>10){ 
            System.out.println("The Player1 and 2 Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
        }else if(playernumber3>10){
            System.out.println("The Player1 and 3 Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
        }else{
            System.out.println("The Player1 Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
        }
  
        
       }else if(playernumber2>10){
        if(playernumber3>0){
            System.out.println("The Player2 and 3 Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
        }else{
            System.out.println("The Player2 Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
        }     
       
       }else if(playernumber3>10){
        System.out.println("The Player3 Has Guessed Invalid No Only no between 1 to 10 are allowed!"); return 0;
      
       }else{
        return 1;
       }
    }

    int compare(){
        if(guessernumber==playernumer1){
            if( guessernumber==playernumber2 && guessernumber==playernumber3){
                System.out.println("Player 1 ,2 And 3 Has Won The Game");
                return 123;
            }else if(guessernumber==playernumber2){
                System.out.println("Player 1 and 2 Has Won The Game");
                return 12;
            }else if( guessernumber==playernumber3){
                System.out.println("Player 1 And 3 Has  Won The Game");
                return 13;
            }else{
                System.out.println("Player 1  Has Won The Game");
                return 1;
            }

        }else if(guessernumber==playernumber2){
            if(guessernumber==playernumber3){
                System.out.println("Player 2 And 3 Has Won The Game");
                return 23;
            }else{
                System.out.println("Player 2 Has Won The Game");
                return 2;
            }          
        }else if(guessernumber==playernumber3){
            System.out.println("Player 3 HAs Won The Game");
            return 3;
        }else{
            System.out.println("Game Lost Try Again!!");
            return 0;
        }
    }
}
public class GuesserGameProject{
    
    public static void main(String[] args) {
        int cmp;
       int player1wincount=0;
       int player2wincount=0;
       int player3wincount=0;
        System.out.println("Welcome To The Game!! All player will have Chance to Guess Three Time and Those who will win maximum time will won the game");
        for(int i=0;i<3;i++){
        if(i==2){
            System.out.println("Final Round!! Its Time To Find The WInner");
        }else{
            System.out.println("Round : " + (i+1));
        }

           
        Umpire obj=new Umpire();
        obj.guesser();
        obj.player();
        int val = obj.checkValidityOfNumber();

        if(val==1){
            cmp=obj.compare();
            
            if(cmp==123){
                player1wincount=player1wincount+1;
                player2wincount=player2wincount+1;
                player3wincount=player3wincount+1;
            }else if(cmp==12){
                player1wincount=player1wincount+1;
                player2wincount=player2wincount+1;
            }else if(cmp==23){
                player2wincount=player2wincount+1;
                player3wincount=player3wincount+1;
            }else if(cmp==13){
                player1wincount=player1wincount+1;
                player3wincount=player3wincount+1;
            }else if(cmp==1){
                player1wincount=player1wincount+1;  
            }else if(cmp==2){
                player2wincount=player2wincount+1;
            }else if(cmp==3){
                player3wincount=player3wincount+1;
            }else{
                System.out.println("Play The Next Round Best of Luck!!");
                
            }
        }
              
            
        }
     

        if(player1wincount == player2wincount & player1wincount==player3wincount){
            System.out.println("All HAs Won THe Final");
        }else if(player1wincount>0 && player2wincount>0){
            if(player1wincount==player2wincount){
                System.out.println("Player 1 and Player 2  Has won the final");
            } 
        }else if(player2wincount>0 && player3wincount>0){
            if(player2wincount==player3wincount){
                System.out.println("Player 2 and Player 3 Has won The final ");
            }
            
        }else if(player1wincount>0 && player3wincount>0){
            if(player1wincount==player3wincount){
                System.out.println("Player 1 and Player 3 Has won the final");
            }
            
        }else{
            if(player1wincount>player2wincount && player1wincount>player3wincount){
                System.out.println("Player 1 has Won The final");
            }else if(player2wincount>player1wincount && player2wincount>player3wincount){
              System.out.println("Player 2  wins the final");
            }else{
                System.out.println("Player 3 has won the final");
            }
        }

        
    }
}