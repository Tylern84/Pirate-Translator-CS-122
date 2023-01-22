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

    /**
     * _Part 1: Implement this method_
     *
     * Translate the input string and return the resulting string
     */
    public String translate(String input) {
        // TODO: implement this
        input= input.toLowerCase();


//        String[] array1= input.split(" ");
//        for(int i=0; i< array1.length;i++){
//            System.out.println(array1[i]);
//        }
        //prints out one word
        for(int i=0;i < 20;i++){
            if(input.contains(phrases[i])){
                input= input.replace(phrases[i],piratetalk[i]);


            }
        }
//        for(int i= 0; i < array1.length; i++){
//            for (int j=0; j < phrases.length; j++){
//                if(array1[i].contains(phrases[j])){
//                    System.out.println(piratetalk[j]);
//                }
//            }
//        }

        return input;
    }


}

