Objective*: Create a hotel management system to track hotel bookings and facilitate queries regarding room bookings and Wi-Fi availability.

### Class Definitions

1. *Class Hotel*:
   - *Attributes*:
     - hotelId (int): Unique identifier for the hotel.
     - hotelName (String): Name of the hotel.
     - dateOfBooking (String): Date of booking in the format dd-mon-yyyy.
     - noOfRoomsBooked (int): Number of rooms booked at the hotel.
     - wifiFacility (String): Indicates whether Wi-Fi is available (e.g., "Yes" or "No").
   - *Methods*:
     - Getters and setters for all attributes.
     - A parameterized constructor to initialize a Hotel object.

2. *Class Solution*:
   - *Methods*:
     - noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month):
       - This method takes an array of Hotel objects and a month (String) as input.
       - It returns the total number of rooms booked in that month. If no rooms are booked, return 0.
     - searchHotelByWifiOption(Hotel[] hotels, String wifiOption):
       - This method takes an array of Hotel objects and a Wi-Fi option (String) as input.
       - It returns the first Hotel object where wifiFacility matches the given option (case insensitive). If no hotel matches, return null.
   - *Main Method*: 
     - Demonstrates the functionality by reading inputs and calling the above methods.

### Input Format
1. An integer n, the number of hotels.
2. For each hotel, read the following:
   - hotelId (int)
   - hotelName (String)
   - dateOfBooking (String in dd-mon-yyyy format)
   - noOfRoomsBooked (int)
   - wifiFacility (String)
3. A string representing the month to check for bookings.
4. A string representing the Wi-Fi option to search for.

### Output Format
- For the noOfRoomsBookedInGivenMonth method:
  - Print the total number of rooms booked. 
  - If the value is 0, print "No rooms booked in the given month."
- For the searchHotelByWifiOption method:
  - Print the details of the hotel if found, else print "No such option available."

### Sample Input 1

4
101
Best Stay
01-jan-2022
10
Yes
102
Apple Stay
12-Feb-2022
3
Yes
103
Accord
11-May-2022
5
Yes
104
Royal Park
22-Dec-2021
7
Yes
jan
Yes


### Sample Output 1

10
101
Best Stay
01-jan-2022
10
Yes


### Sample Input 2

4
101
Best Stay
01-jan-2022
10
Yes
102
Apple Stay
12-Feb-2022
3
Yes
103
Accord
11-May-2022
5
Yes
104
Royal Park
22-Dec-2021
7
Yes
may
No such option available


### Sample Output 2

No rooms booked in the given month
No such option available
