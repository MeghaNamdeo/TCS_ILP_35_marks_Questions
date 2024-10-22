*Objective*: Create a laptop management system that can keep track of different laptops and provide functionality to query based on brand and operating system type.

### Class Definitions

1. *Class Laptop*:
   - *Attributes*:
     - laptopId (int): Unique identifier for the laptop.
     - brand (String): Brand name of the laptop.
     - osType (String): Operating system type of the laptop (e.g., "Windows", "Mac OS", etc.).
     - price (double): Price of the laptop.
     - rating (double): Rating of the laptop (scale of 1 to 5).
   - *Methods*:
     - Getters and setters for all attributes.
     - A parameterized constructor to initialize a Laptop object.

2. *Class Solution*:
   - *Methods*:
     - countOfLaptopsByBrand(Laptop[] laptops, String brand):
       - This method takes an array of Laptop objects and a brand name (String) as input.
       - It returns the count of laptops from the array that match the specified brand and have a rating greater than 3. If no laptops meet this condition, return 0.
     - searchLaptopByOsType(Laptop[] laptops, String osType):
       - This method takes an array of Laptop objects and an operating system type (String) as input.
       - It returns an array of Laptop objects whose osType matches the given string (case insensitive). If no laptops match, return null.
   - *Main Method*:
     - Demonstrates the functionality by reading inputs and calling the above methods.

### Input Format
1. An integer n, the number of laptops.
2. For each laptop, read the following:
   - laptopId (int)
   - brand (String)
   - osType (String)
   - price (double)
   - rating (double)
3. A string representing the brand to query.
4. A string representing the OS type to query.

### Output Format
- For the countOfLaptopsByBrand method:
  - Print the count of laptops that match the specified brand and have a rating greater than 3. 
  - If the count is 0, print "The given brand is not available."
- For the searchLaptopByOsType method:
  - Print the laptopId and rating of each laptop that matches the specified OS type. 
  - If no laptops match, print "The given OS is not available."

### Sample Input
*Input 1:*

4
123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
HP
Windows


### Sample Output

2
126 3
123 5


*Input 2:*

5
123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
Asus
Windows
40000
3
127
HP
Ubuntu
50000
4


### Sample Output

The given brand is not available.
The given OS is not available.


### Explanation
1. In Input 1, there are 4 laptops and the query is for the brand "HP":
   - The count of HP laptops with a rating greater than 3 is 2.
   - The query for the OS type "Windows" finds two laptops with that OS and prints their IDs and ratings.

2. In Input 2, the query for the brand "HPI" (which does not exist) results in "The given brand is not available."
