import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class WordMixer {

    static String buildStringFromMixedArray(ArrayList<String> inputArrayList){
        StringBuilder str = new StringBuilder();
        for (String s : inputArrayList) {
            str.append(s).append("\\ ");
        }

        return str.toString();
    }

    static ArrayList<String> mixArray(ArrayList<String> inputArrayList){
        Collections.shuffle(inputArrayList);

        return inputArrayList;
    }

    static ArrayList<String> makeArrayListFromInput(String inputString){
        Scanner scanner = new Scanner(inputString);
        ArrayList<String> outputArrayList = new ArrayList<>();

        while (scanner.hasNext()){
            outputArrayList.add(scanner.next());
        }

        return outputArrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = " ";

        while (!Objects.equals(inputString, "")) {
            System.out.print("Please enter your sentence: ");
            inputString = scanner.nextLine();

            System.out.println("Your mixed sentence: " + buildStringFromMixedArray(mixArray(makeArrayListFromInput(inputString))));
        }
    }
}