You are tasked with developing a simple billing system that manages customer bills.
  Each bill has several attributes, and you need to implement functionality to find
  the bill with the highest amount based on a specific payment status and to count
  the number of bills based on the type of connection (prepaid or postpaid).

### Class Definitions

1. *Class Bill*:
    - *Attributes*:
        - billNo (int): The unique bill number.
        - name (String): The name of the customer.
        - typeOfConnection (String): The type of connection (e.g., "prepaid", "postpaid").
        - billAmount (double): The total bill amount.
        - status (boolean): The payment status of the bill (true if paid, false if unpaid).
    - *Methods*:
        - Getters and Setters for all attributes.
        - A parameterized constructor to initialize a bill object.

2. *Class Myclass*:
    - *Methods*:
        - findBillWithMaxBillAmountBasedOnStatus(Bill[] bills, boolean status):
  This method takes an array of Bill objects and a boolean parameter indicating
  the payment status. It returns the Bill object with the highest amount among 
  those bills matching the specified status. If no bills match, return null.
  
        - getCountWithTypeOfConnection(Bill[] bills, String typeOfConnection):
  This method takes an array of Bill objects and a string indicating the type of
  connection. It returns the count of bills that match the given connection type
  (case insensitive). If none match, return 0.

### Input Format
- The first line contains an integer n, the number of bills.
- The next n lines contain the details of each bill in the following order:
    - billNo (int)
    - name (String)
    - typeOfConnection (String)
    - billAmount (double)
    - status (boolean, where true means paid and false means unpaid)
- After entering the bills, read a boolean value to indicate the status to filter the bills for the maximum amount search.
- Finally, read a string indicating the type of connection to count the bills.

### Output Format
- If a bill with the specified status exists, print its bill number and customer name.
- If no such bill exists, print "There are no bills with the given status."
- Print the count of bills for the specified type of connection. 
  If the count is greater than zero, output the count. Otherwise,
  print "There are no bills with given type of connection."

### Constraints
- The types of connection should be case insensitive.
- Each bill's attributes must be correctly validated according to
  their types (e.g., bill amount should be a non-negative number).

### Example

#### Input

4
111
Aman Mittal
Prepaid
914.25
true
222
Rekha Kumar
Prepaid
1425.75
false
333
Samira Gupta
Prepaid
1305.00
true
444
Mohit Saxena
Postpaid
1300.50
false
true
Prepaid


#### Output

333 Samira Gupta
Number of bills with connection type Prepaid: 3


