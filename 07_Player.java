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
