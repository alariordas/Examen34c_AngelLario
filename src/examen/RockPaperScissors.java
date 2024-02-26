package examen;

import java.util.*;
/**
 * Esta es la clase RockPaperScissors, esta esta compuesta por un iniciador de clases,
 *  un main que es el que se va encargar de ejecutar la clase y un metodo que es ejecutado por el main,
 *  el metodo recive el nombre de checkGame()
 * @author DAM107
 * @since 26/02/2024
 */
public class RockPaperScissors {
	/**
	 * Declaración de las variables iniciales de la clase.
	 */
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	public static List<String> optionList = Arrays.asList("Rock", "Paper", "Scissors");
/**
 * Iniciador del constructor por defecto
 */
	public RockPaperScissors() {
	}
/**
 * Este es nuestro main el cual es encarga de ejecutar un pequeño menu que comprueba una entrada de teclado, se comrpobara que dicha entrada sea numerica y que se encuentre entre el 1 y 3
 * a partir de eso ejecuta nuestro metodo checkGame()
 * @param args
 */
	public static void main(String[] args) {
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(computerChoice, userChoice));
		scanner.close();
	}
/**
 * Este es el metodo encargado de la logica del juego de piedra, papel y tijera. Comarando los 2 siguientes parametros de entrada.
 * @param userChoice Esta variable de tipo String es la opcion que ha elegido el usuario, por ejemplo "Rock"
 * @param computerChoice Esta variable de tipo String es la opcion que se ha generado de forma aleatoria en el main en este caso optionList.get(new Random().nextInt(3)), por ejemplo "Scissors"
 * @return Este nos devolvera una variable de tipo String que en este ejemplo será "You win this round!"
 */
	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
			
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!";
			
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
			gameResult = "You win this round!";
			
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			gameResult = "You win this round!";
			
		} else {
			gameResult = "Computer wins this round!";
		}
		return gameResult;
	}
}