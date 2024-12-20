Create class Medicine with below attributes: 

MedicineName - String 
batch - String 
disease - String 
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
This method will take array of Medicine objects and a disease String as parameters. 
And will return another sorted array of Integer objects where the disease String matches with the 
original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
method and print the result.

Input
-------------

dolo650
FAC124W
fever
100
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
200
aspirin
ASP849Q
flu
250
fever

Output
---------
100
200


  import java.util.*;

class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Medicine[] arr = new Medicine[4];
        for (int i = 0; i < 4; i++) {
            String medicineName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine(); 

            arr[i] = new Medicine(medicineName, batch, disease, price);
        }
        String disease2 = sc.nextLine();
        Integer[] result = getPriceByDisease(arr, disease2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    // Ensure the return type is Integer[] not Integer
    public static Integer[] getPriceByDisease(Medicine[] arr, String disease) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDisease().equalsIgnoreCase(disease)) {
                l1.add(arr[i].getPrice());
            }
        }
        // Sort the prices
        l1.sort(Integer::compareTo);
        return l1.toArray(new Integer[0]); 
    }
}

class Medicine {
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
