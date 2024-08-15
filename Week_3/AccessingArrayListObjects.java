package Week_3;

import java.util.ArrayList;

public class AccessingArrayListObjects {
    public static void main(String[] args) {
        ArrayList<String> topCompanies = new ArrayList<>();

        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        // Add companies to the ArrayList
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Display the list of companies
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world:");
        System.out.println(topCompanies);

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        System.out.println("Best Company: " + bestCompany);

        String secondBestCompany = topCompanies.get(1);
        System.out.println("Second Best Company: " + secondBestCompany);

        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        System.out.println("Last Company in the list: " + lastCompany);

        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
