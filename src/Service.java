public class Service {
    String words;

    public Service(String words) {
        this.words = words;
    }

    public void printSearchPalindrome(String word) {
        String word1 = words;
        word1 = words.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        String string = word1;
        String word2 = new StringBuffer(string).reverse().toString();
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println(words + " = УСПЕХ - это палиндром. ");
        } else {
            System.out.println(words + " = НЕУДАЧА - это не палиндром. ");
        }
    }
}