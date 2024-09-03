import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
    // open the file, check if all rows indeed sum to same constant
    // 1. open file 2.read one line string 3. split string into mutiple ints
    // 4. add to a constant 5. save this constant, check with others

    public static boolean checkMagic(String fileName) throws IOException {
        // boolean isMagic = true;
        int lastSum = -1;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        // get this line of string
        String line;
        while ((line = reader.readLine()) != null) {
            // get all int strings
            String[] parts = line.split("\t");
            int currSum = 0;
            for (String part : parts) {
                currSum += Integer.parseInt(part);
            }

            // if it's first row
            if (lastSum == -1) {
                lastSum = currSum;
            }
            // not first row
            else {
                if (lastSum != currSum) {
                    return false;
                }
            }
        }
        reader.close();
        return true;
    }

    public static void main(String[] args) throws IOException{
        String[] fileNames = {"Mercury.txt", "Luna.txt"};
        for (String f : fileNames) {
            System.out.println(f + "is Magic?: " + checkMagic(f));
        }
    }

}
