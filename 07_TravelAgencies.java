Question: 1
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000


  import java.util.Scanner;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    // Getters
    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean hasFlightFacility() {
        return flightFacility;
    }

    // Setters
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] arr = new TravelAgencies[4];

        for (int i = 0; i < 4; i++) {
            int regNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine(); // Consume newline
            boolean flightFacility = sc.nextBoolean();
            arr[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }

        int searchRegNo = sc.nextInt();
        sc.nextLine(); // Consume newline
        String searchPackageType = sc.nextLine();

        // Find the highest package price
        int highestPackagePrice = findAgencyWithHighestPackagePrice(arr);
        System.out.println(highestPackagePrice);

        // Find agency details for given ID and type
        TravelAgencies result = agencyDetailsForGivenIdAndType(arr, searchRegNo, searchPackageType);
        if (result != null) {
            System.out.println(result.getAgencyName() + ":" + result.getPrice());
        }
    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        int maxPrice = arr[0].getPrice();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getPrice() > maxPrice) {
                maxPrice = arr[i].getPrice();
            }
        }
        return maxPrice;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] arr, int regNo, String packageType) {
        for (int i = 0; i < arr.length; i++) {
            // Check if regNo and packageType match (case insensitive)
            if (arr[i].getRegNo() == regNo && arr[i].getPackageType().equalsIgnoreCase(packageType)) {
                return arr[i];
            }
        }
        return null;
    }
}

