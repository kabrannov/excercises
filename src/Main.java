import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(i<10){
            System.out.print("Enter a number: ");
            list.add(scanner.nextInt());
            i++;
        }

        Integer largest = list.stream().max(Integer::compare).get();

        System.out.println(largest);


    }
}
