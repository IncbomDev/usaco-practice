import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("./ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

        String groupA = f.readLine();
        String groupB = f.readLine();

        if (groupA != null && groupB != null) {
            System.out.println(groupA);
            System.out.println(groupB);
            out.println(groupB);
        } else {
            System.out.println("Not enough lines in the file");
        }

        f.close();
        out.close();

    }

    public static int getCharNumber(char c) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (char s : chars) {
            return c - 'A' + 1;
        }
        return 0;
    }
}
