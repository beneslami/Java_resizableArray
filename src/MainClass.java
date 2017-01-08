import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ben on 1/8/17.
 */
public class MainClass {
    public static void main(String[] args) {
        DynamicArray resizable_array = new DynamicArray(0);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1 for add");
            System.out.println("2 for remove");
            int input = sc.nextInt();
            if(input == 1){
                System.out.println("enter number you want to append:");
                int num_add = sc.nextInt();
                resizable_array.add(num_add);
            }
            else if(input == 2){
                System.out.println("enter number you want to remove:");
                int num_remove = sc.nextInt();
                resizable_array.remove(num_remove);
            }
            resizable_array.show();
            System.out.println("---------------");
        }

    }
}
