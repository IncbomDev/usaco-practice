import java.io.*;
import java.util.HashMap;

/*
ID: nathane3
LANG: JAVA
PROG: gift1
*/
class gift1 {

    static HashMap<String, Integer> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("./gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./gift1.out")));

        int friends = Integer.parseInt(f.readLine());

        for (int i = 0; i < friends; i++) {
            String person = f.readLine();
            accounts.put(person, 0);
        }

        String friendName = "";

        int moneyGiving = 0;
        int friendsGiving = 0;

        for (int i = 0; i < friends - 1; i++) {
            friendName = f.readLine();
            System.out.println("Processing: " + friendName);

            String fullData = f.readLine();
            String[] dataArray = fullData.split(" ");
            moneyGiving = Integer.parseInt(dataArray[0]);
            friendsGiving = Integer.parseInt(dataArray[1]);
            int modAmount;
            if (moneyGiving == 0) {
                modAmount = 0;
            } else {
                modAmount = moneyGiving % friendsGiving;
            }
            int newAmount = moneyGiving - modAmount;
            int moneyToEachPerson;
            if (friendsGiving > 0) {
                moneyToEachPerson = newAmount / friendsGiving;
            } else {
                moneyToEachPerson = 0;
            }
            System.out.println("Money Giving: " + moneyGiving);
            System.out.println("Friends Giving: " + friendsGiving);
            System.out.println("Mod Amount: " + modAmount);
            System.out.println("New Amount: " + newAmount);
            System.out.println("Money to Each Person: " + moneyToEachPerson);

            addMoney(friendName, modAmount);

            for (int j = 0; j < friendsGiving; j++) {
                String receiver = f.readLine();
                addMoney(receiver, friendName, moneyToEachPerson + (j < modAmount ? 1 : 0));
            }
        }

        for (String key : accounts.keySet()) {
            out.println(key + " " + accounts.get(key));
        }
        out.close();
    }

    public static void addMoney(String person, String owner, int amount) {
        accounts.put(person, accounts.get(person) + amount);
        accounts.put(owner, accounts.get(owner) - amount);
    }

    public static void addMoney(String person, int amount) {
        accounts.put(person, accounts.get(person) + amount);
    }

}
