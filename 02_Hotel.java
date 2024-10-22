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

   import java.util.Scanner;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;

    // Parameterized constructor
    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
    }

    // Getters
    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    // Setters
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }
}

class MyClass {
    public int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month) {
        int totalRoomsBooked = 0;

        for (int i = 0; i < hotels.length; i++) {
            String bookingMonth = hotels[i].getDateOfBooking().split("-")[1]; // Extracting month from date
            if (bookingMonth.equalsIgnoreCase(month)) {
                totalRoomsBooked += hotels[i].getNoOfRoomsBooked();
            }
        }

        return totalRoomsBooked;
    }

    public Hotel searchHotelByWifiOption(Hotel[] hotels, String wifiOption) {
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i].getWifiFacility().equalsIgnoreCase(wifiOption)) {
                return hotels[i]; // Return the first hotel matching the wifi option
            }
        }
        return null; // No hotel found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Hotel[] hotels = new Hotel[n];

        for (int i = 0; i < n; i++) {
            int hotelId = scanner.nextInt();
            String hotelName = scanner.next();
            String dateOfBooking = scanner.next();
            int noOfRoomsBooked = scanner.nextInt();
            String wifiFacility = scanner.next();
            hotels[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility);
        }

        String queryMonth = scanner.next();
        String queryWifiOption = scanner.next();

        MyClass solution = new MyClass();

        // Query for total rooms booked in the given month
        int roomsBooked = solution.noOfRoomsBookedInGivenMonth(hotels, queryMonth);
        if (roomsBooked == 0) {
            System.out.println("No rooms booked in the given month.");
        } else {
            System.out.println(roomsBooked);
        }

        // Query for hotel by Wi-Fi option
        Hotel foundHotel = solution.searchHotelByWifiOption(hotels, queryWifiOption);
        if (foundHotel == null) {
            System.out.println("No such option available.");
        } else {
            System.out.println(foundHotel.getHotelId());
            System.out.println(foundHotel.getHotelName());
            System.out.println(foundHotel.getDateOfBooking());
            System.out.println(foundHotel.getNoOfRoomsBooked());
            System.out.println(foundHotel.getWifiFacility());
        }

        scanner.close();
    }
}

