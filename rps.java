package summer2019;
import java.util.*;
public class rps {//Tyler Hernandez Rock Paper Scissors

	public static void main(String[] args)
	{
		char response= askForRPS();
		checkForWin(response);
		
		
	}
	
	public static char askForRPS(){
		Scanner input = new Scanner(System.in);
		System.out.println("ROCK PAPER SCISSORS SAYS SHOOT: \n (type r, p, or s) ");
		String response = input.nextLine();
		return response.charAt(0);
	}
	public static void checkForWin(char response) {
		String computer = "rps";
		Random rand = new Random();
		int number= rand.nextInt(computer.length());
		char comp = computer.charAt(number);
		System.out.println("Computer has chosen "+ comp);
		if(response == 'r'|| response == 'R') {
			if(comp == 'r'|| comp =='R')
				System.out.println("Rock = Rock\nTie Game");
			if(comp == 'p'|| comp == 'P')
				System.out.println("Rock < Paper\nComputer Wins!");
			if(comp == 's'|| comp == 'S')
				System.out.println("Rock > Scissors\nPlayer Wins!");
		}
		if(response == 'p'|| response == 'P') {
			if(comp == 'p'|| comp == 'P')
				System.out.println("Paper = Paper\nTie Game");
			if(comp == 'r'|| comp == 'R')
				System.out.println("Paper > Rock\nPlayer Wins!");
			if(comp == 's'|| comp == 'S')
				System.out.println("Paper < Scissors\nComputer Wins!");
		}
		if(response == 's'|| response == 'S') {
			if(comp == 's'|| comp == 'S')
				System.out.println("Scissors = Scissors\nTie Game");
			if(comp == 'r'|| comp == 'R')
				System.out.println("Scissors < Rock\nComputer Wins!");
			if(comp == 'p'|| comp == 'P')
				System.out.println("Scissors > Paper\nPlayer Wins!");
		}
	}

}
