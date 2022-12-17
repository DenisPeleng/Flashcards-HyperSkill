package flashcards;

public class FlashCard {
    private final String cardName;
    private final String definition;

    public FlashCard(String cardName, String definition) {
        this.cardName = cardName;
        this.definition = definition;
    }

    public String getCardName() {
        return cardName;
    }

    public String getDefinition() {
        return definition;
    }

    public void printCard(){
        System.out.println("Card:");
        System.out.println(cardName);
        System.out.println("Definition:");
        System.out.println(definition);
    }
    public boolean isCorrect(String userAnswer){
        return definition.equals(userAnswer);
    }
}
