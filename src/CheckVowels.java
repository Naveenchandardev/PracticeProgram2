
public class CheckVowels {
    public static void main (String[] args){
        String input ="check";
        Boolean a=input.toLowerCase()
                .matches((".*[aeiou].*"));
        System.out.println(a);
    }
}
