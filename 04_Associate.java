### Overview
You are required to develop a simple Associate Management System to manage 
  details of associates, including their scores and experience. The system
  should allow searching for associates based on their scores and finding
  the associate with the maximum experience.

### Class Definitions

1. *Class Associate*:
    - *Attributes*:
        - id (int): A unique identifier for the associate.
        - name (String): The name of the associate.
        - scores (double): The score of the associate.
        - experience (int): The experience of the associate in months.
    - *Methods*:
        - Getters and Setters for all attributes.
        - A parameterized constructor to initialize an associate object.

2. *Class Solution*:
    - *Methods*:
        - searchAssociateByScores(Associate[] associates, double scores):
  This static method takes an array of Associate objects and a double
  representing scores. It returns the Associate object that matches
  the given score. If no associate is found with the specified score,
  the method should return null.
  
        - findAssociateWithMaxExperience(Associate[] associates): This
  static method takes an array of Associate objects and returns the
  Associate object that has the maximum experience. If there are
  multiple associates with the same maximum experience, return 
  any one of them.

### Input Format
- The first line contains an integer n, the number of associates.
- The next n lines contain the details of each associate in the following order:
    - id (int)
    - name (String)
    - scores (double)
    - experience (int)
- The last line contains a double value representing the score to search for associates.

### Output Format
- If an associate with the specified score exists, print their ID and name in the format: id name.
- If no such associate exists, print: "No Associate found with the given scores."
- Additionally, print the ID and name of the associate with the maximum experience.

### Constraints
- The IDs should be unique for each associate.
- Scores and experience values should be non-negative.

### Example

#### Input

4
105
Nisha
35
2
107
Uma
15
3
101
Manu
43
7
112
Delma
26
10
43


#### Output

101 Manu
112 Delma

