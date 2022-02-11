import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordMixer {

    static String buildStringFromMixedArray(ArrayList<String> inputArrayList){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < inputArrayList.size(); i++){
            str.append(inputArrayList.get(i) + "\\ ");
        }

        return str.toString();
    }

    static ArrayList<String> mixArray(ArrayList<String> inputArrayList){
        Collections.shuffle(inputArrayList);

        return inputArrayList;
    }

    static ArrayList<String> makeArrayListFromInput(String inputString){
        Scanner scanner = new Scanner(inputString);
        ArrayList<String> outputArrayList = new ArrayList<String>();

        while (scanner.hasNext()){
            outputArrayList.add(scanner.next());
        }

        return outputArrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your sentence: ");
        String inputString = scanner.nextLine();

        System.out.println("Your mixed sentence: " + buildStringFromMixedArray(mixArray(makeArrayListFromInput(inputString))));
    }
}
