public class PirateTranslator {
    String[] phrases = {"hello", "his", "hers", "hi", "is", "pardon me", "excuse me",
            "my", "friend", "sir", "madam",
            "stranger", "officer",
            "where", "you", "tell",
            "know", "how far", "old", "happy"};
    String[] piratetalk = {"ahoy", "ye", "ye", "yo-ho-ho", "be", "avast", "arrr",
            "me", "me bucko", "matey", "proud beauty",
            "scurvy dog", "foul blaggart",
            "whar", "ye", "be tellin'",
            "be knowin'", "how many leagues",
            "barnacle-covered", "grog-filled"};

    String[] positiveWords = {"adore", "enjoy", "love"};
    String[] negativeWords = {"hate", "despise", "dislike"};

    String[] lastTranslations = new String[25];
    int s = 0;
//    creating a varibale to store orginal string
    String orginInput;

    /**
     * _Part 1: Implement this method_
     * <p>
     * Translate the input string and return the resulting string
     */
    public String translate(String input) {
        // TODO: implement this
        //transform input into all lower case
        input = input.toLowerCase();
        boolean hasPositive = false;
        boolean hasNegative = false;

        //checking if input was the same as the previous input
        if(input.equals(orginInput)){
            return "I be a translator, not a puppet!";
        }
        else{
            orginInput=input;
        }

        //Translate Input
        for (int i = 0; i < 20; i++) {
            if (input.contains(phrases[i])) {
                input = input.replace(phrases[i], piratetalk[i]);
            }
        }
        //Checking for positive words
        for (int i = 0; i < 3; i++) {
            if(orginInput.contains(positiveWords[i])){
                hasPositive= true;
            }
        }
        //Checking Negative
        for(int i=0; i < 3; i++){
            if(orginInput.contains(negativeWords[i])){
                hasNegative=true;
            }
        }

        //appending strings (if necessary)
        if(hasPositive && hasNegative){
            input= input;
        } else if (hasPositive) {
            input= input + " 'tis like me pirate treasure!";
        } else if (hasNegative) {
            input= input + " 'tis like bein' food for the fish!";
        }

        return input;
    }

}
