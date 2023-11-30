// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Write Number in Expanded Form
        You will be given a number and you will need to return it as a string in Expanded Form. For example:

        Kata.expandedForm(12); # Should return "10 + 2"
        Kata.expandedForm(42); # Should return "40 + 2"
        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
        NOTE: All numbers will be whole numbers greater than 0.
         */
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(42));
        System.out.println(expandedForm(70304));
    }
    public static String expandedForm(int num) {
        if(num == 0) return "0";
        int digit = num % 10;
        int rest = num / 10;
        int spot = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(digit * spot);
        while(rest != 0 || digit != 0) {
            digit = rest % 10;
            rest = rest / 10;
            spot *= 10;

            if (digit != 0) {
                if(!sb.isEmpty()) {
                    sb.insert(0, " + ");
                }
                sb.insert(0, digit * spot);
            }
        }
        return sb.toString().trim();
    }
}