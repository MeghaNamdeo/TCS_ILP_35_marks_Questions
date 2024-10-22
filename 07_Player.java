Objective*: Develop a player management system that allows querying player information based on their type and the match type they play.

### Class Definitions

1. *Class Player*:
   - *Attributes*:
     - playerId (int): Unique identifier for the player.
     - playerName (String): Name of the player.
     - runs (int): Total runs scored by the player.
     - playerType (String): Type of the player (e.g., "International", "State").
     - matchType (String): Type of match played (e.g., "Test", "One Day").
   - *Methods*:
     - Getters and setters for all attributes.
     - A parameterized constructor to initialize a Player object.

2. *Class Solution*:
   - *Methods*:
     - findPlayerWithLowestRuns(Player[] players, String playerType):
       - This method takes an array of Player objects and a player type (String) as input.
       - It returns the lowest runs scored by players of the specified type. If no players match the type, it returns 0.
     - findPlayerByMatchType(Player[] players, String matchType):
       - This method takes an array of Player objects and a match type (String) as input.
       - It returns an array of Player objects belonging to the specified match type, sorted in descending order of playerId. If no players match, it returns null.
   - *Main Method*:
     - Demonstrates functionality by reading input values and calling the above methods.

### Input Format
1. An integer n, the number of players.
2. For each player, read the following:
   - playerId (int)
   - playerName (String)
   - runs (int)
   - playerType (String)
   - matchType (String)
3. Two strings for capturing player type and match type.

### Output Format
- For the findPlayerWithLowestRuns method:
  - Print the lowest runs scored among players of the specified type. If there are no players, print "No such player."
- For the findPlayerByMatchType method:
  - Print the playerId of each player from the returned array. If the returned value is null, print "No Player with given match type."

### Sample Input

*Input 1:*

4
11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
State
One day


### Sample Output

67
14
11


*Input 2:*

4
11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
District
T20


### Sample Output

No such player
No Player with given match type


### Explanation
1. *Input 1*:
   - There are 4 players and the query is for the player type "State":
     - The lowest runs scored by State players is 67 (by Ashwin).
     - The players who have participated in "One Day" matches are Ashwin (ID 14), Varun (ID 13), and Sachin (ID 11), printed in descending order of playerId.
  
2. *Input 2*:
   - The query for the player type "District" yields "No such player."
   - The query for the match type "T20" also yields "No Player with given match type," as no players were registered under this match type.


   import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    // Parameterized constructor
    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    // Getters
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    // Setters
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

class MyClass {
    public int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int lowestRuns = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < players.length; i++) {
            if (players[i].getPlayerType().equalsIgnoreCase(playerType)) {
                found = true;
                if (players[i].getRuns() < lowestRuns) {
                    lowestRuns = players[i].getRuns();
                }
            }
        }

        return found ? lowestRuns : 0;
    }

    public Player[] findPlayerByMatchType(Player[] players, String matchType) {
        ArrayList<Player> filteredPlayers = new ArrayList<>();

        for (int i = 0; i < players.length; i++) {
            if (players[i].getMatchType().equalsIgnoreCase(matchType)) {
                filteredPlayers.add(players[i]);
            }
        }

        if (filteredPlayers.isEmpty()) {
            return null;
        } else {
            Player[] result = filteredPlayers.toArray(new Player[0]);
            Arrays.sort(result, Comparator.comparingInt(Player::getPlayerId).reversed());
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            int playerId = scanner.nextInt();
            String playerName = scanner.next();
            int runs = scanner.nextInt();
            String playerType = scanner.next();
            String matchType = scanner.next();
            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        String queryPlayerType = scanner.next();
        String queryMatchType = scanner.next();

        MyClass solution = new MyClass();

        // Query for lowest runs by player type
        int lowestRuns = solution.findPlayerWithLowestRuns(players, queryPlayerType);
        if (lowestRuns == 0) {
            System.out.println("No such player");
        } else {
            System.out.println(lowestRuns);
        }

        // Query for players by match type
        Player[] matchTypePlayers = solution.findPlayerByMatchType(players, queryMatchType);
        if (matchTypePlayers == null) {
            System.out.println("No Player with given match type.");
        } else {
            for (int i = 0; i < matchTypePlayers.length; i++) {
                System.out.println(matchTypePlayers[i].getPlayerId());
            }
        }

        scanner.close();
    }
}
