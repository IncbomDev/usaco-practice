package problem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/*
ID: nathane3
LANG: JAVA
PROG: ride
*/
class Ride {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("problem/ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("problem/ride.out")));

        String groupA = f.readLine();
        String groupB = f.readLine();

        assert groupB != null;
        List<Integer> groupBNum = new ArrayList<>();
        for (char s : groupB.toCharArray()) {
            groupBNum.add(getCharNumber(s));
        }
        List<Integer> groupANum = new ArrayList<>();
        assert groupA != null;
        for (char c : groupA.toCharArray()) {
            groupANum.add(getCharNumber(c));
        }
        int resultA = 1;
        for (int i : groupANum) {
            resultA *= i;
        }

        int resultB = 1;
        for (int i : groupBNum) {
            resultB *= i;
        }

        String resultAS = "";

        if (resultA % 47 == 27) {
            resultAS = "GO";
        } else {
            resultAS = "STAY";
        }

        String resultBS = "";

        if (resultB % 47 == 27) {
            resultBS = "GO";
        } else {
            resultBS = "STAY";
        }

        if (resultBS.equals("GO") && resultAS.equals("GO")) {
            out.println("GO");
        } else {
            out.println("STAY");
        }

        f.close();
        out.close();

    }

    public static int getCharNumber(char c) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i + 1;
            }
        }
        return 0;
    }

}
