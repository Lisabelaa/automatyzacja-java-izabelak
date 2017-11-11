import java.util.Scanner;

public class FirstExercise {

    public static void main (String[] args){


        String text = "Witaj świecie";
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        do {
            System.out.println("Aby zamknąć aplikację wpisz 'exit' i wciśnij enter.");
            answer = scanner.nextLine();
        } while(!answer.equals("exit"));
        scanner.close();
    }
}
