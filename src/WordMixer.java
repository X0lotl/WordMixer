import java.util.ArrayList;
import java.util.Scanner;

public class WordMixer {

    static ArrayList<String> mixArraty(String input, boolean finishInput){

        if
    }

    static String makeArrayListFromInput(String inputString){
        Scanner scanner = new Scanner(inputString);
        ArrayList<String> inputArrayList = new ArrayList<String>();
        boolean finishInput = false;
        while (scanner.hasNext()){
            mixArraty(scanner.next(), finishInput);
        }
        finishInput = true;

        String output = " ";

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        makeArrayListFromInput(inputString);
    }
}
