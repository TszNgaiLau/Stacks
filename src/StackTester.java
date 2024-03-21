import java.util.ArrayList;
import java.util.Scanner;

public class StackTester {

    public static void main(String[] args) {
        WebStack stack = new WebStack();
        Webpage page1 = new Webpage("Home Page","This is your home page");
        Webpage page2 = new Webpage("Google","I’m Feeling Lucky");
        Webpage page3 = new Webpage("Wikipedia","Please donate $3");
        stack.push(page1);
        stack.push(page2);
        stack.push(page3);
        System.out.println(stack);
    }


}