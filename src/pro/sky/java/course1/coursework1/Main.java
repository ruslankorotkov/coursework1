package pro.sky.java.course1.coursework1;
public class Main {
    public static void searchPalindrome(String words) {
        String words1 = words;
        words1 = words.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        String string = words1;
        String words2 = new StringBuffer(string).reverse().toString();
        if (words1.equalsIgnoreCase(words2)) {
            System.out.println(words + " = УСПЕХ - это палиндром. ");
        } else {
            System.out.println(words + " = НЕУДАЧА - это не палиндром. ");
        }
    }

    public static void main(String[] args) {
        String palindrome = " Лег на храм, и дивен и невидим архангел ";
        searchPalindrome(palindrome);
    }
}