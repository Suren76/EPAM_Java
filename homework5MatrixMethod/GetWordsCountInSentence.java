package homework5MatrixMethod;

public class GetWordsCountInSentence {
    public static void main(String[] args) {
        String stringToCheck = "sentence to test code of words count";

        boolean isInWordCheckPhase = true;
        int wordsCount = 0;

        for (int i = 0; i < stringToCheck.length(); i++) {
            char charToCheck = stringToCheck.charAt(i);

            if ((97 <= charToCheck && charToCheck <= 122 || 65 <= charToCheck && charToCheck <= 90) && !isInWordCheckPhase) {
                isInWordCheckPhase = true;
                wordsCount++;
            }
            if (charToCheck == ' ') isInWordCheckPhase = false;
        }

        System.out.println("Words cont in sentence: " + wordsCount);
    }
}
