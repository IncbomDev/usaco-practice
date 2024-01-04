package problem;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class friends {

    static HashMap<String, Integer> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("./gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

        int friends = Integer.parseInt(f.readLine());

        for (int i = 0; i < friends; i++) {
            String person = f.readLine();
            accounts.put(person, 0);
        }

        int friendsIteriated = 0;

        String friendName = "";

        int moneyGiving = 0;
        int friendsGiving = 0;

        for (int i = 0; i < friends; i++) {
            friendName = f.readLine();
            String fullData = f.readLine();
            String[] dataArray = fullData.split(" ");
            moneyGiving = Integer.parseInt(dataArray[0]);
            friendsGiving = Integer.parseInt(dataArray[1]);
            for (int j = 0; j <= friendsGiving; j++) {
                int modAmount = moneyGiving % friendsGiving;
                int newAmount = moneyGiving - modAmount;
                int
                addMoney(friendName, modAmount);

            }
            break;

        }
    }

    public static void addMoney(String person, String owner, int amount) {
        accounts.put(person, accounts.get(person) + amount);
        accounts.put(owner, accounts.get(owner) - amount);
    }

    public static void addMoney(String person, int amount) {
        accounts.put(person, accounts.get(person) + amount);
    }

}
