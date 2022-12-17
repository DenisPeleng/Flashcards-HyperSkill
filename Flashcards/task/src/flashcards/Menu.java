package flashcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final List<FlashCard> flashCardList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void startMenu() {
        addCardsMenu();
        checkUserMenu();
    }

    public static void addCardsMenu() {
        System.out.println("Input the number of cards:");
        int numberOfCards = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfCards; i++) {
            System.out.printf("Card #%d:\n", i);
            String cardName = scanner.nextLine();
            System.out.printf("The definition for card #%d:\n", i);
            String cardDefinition = scanner.nextLine();
            flashCardList.add(new FlashCard(cardName, cardDefinition));
        }
    }

    public static void checkUserMenu() {
        for (FlashCard currentFlashCard : flashCardList) {
            System.out.printf("Print the definition of \"%s\":\n", currentFlashCard.getCardName());
            String userAnswer = scanner.nextLine();
            if (currentFlashCard.isCorrect(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("Wrong. The right answer is \"%s\".\n", currentFlashCard.getDefinition());
            }
        }
    }
}
