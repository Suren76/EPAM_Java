package homework5MatrixMethod;

public class GetWordsCountInSentence {
    public static void main(String[] args) {
        String stringToCheck = "sentence to test code of words count";

        boolean isInWordCheckPhase = false;
        int wordsCount = 0;

        for (int i = 0; i < stringToCheck.length(); i++) {
            char charToCheck = stringToCheck.charAt(i);

            if (('a' <= charToCheck && charToCheck <= 'z' || 'A' <= charToCheck && charToCheck <= 'Z') && !isInWordCheckPhase) {
                isInWordCheckPhase = true;
                wordsCount++;
            }
            if (charToCheck == ' ') isInWordCheckPhase = false;
        }

        System.out.println("Words cont in sentence: " + wordsCount);
    }
}
