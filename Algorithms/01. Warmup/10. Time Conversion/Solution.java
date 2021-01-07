import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static String timeConversion(String s) {
        int hours   = Integer.parseInt(s.substring(0,2));
        int minutes = Integer.parseInt(s.substring(3,5));
        int seconds = Integer.parseInt(s.substring(6,8));

        if (s.startsWith("PM", 8) && hours != 12) {
            hours += 12;
        } else if (s.startsWith("AM", 8) && hours == 12) {
            hours = 0;
        }
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
