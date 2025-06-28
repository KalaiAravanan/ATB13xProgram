package ex_16_Arrays;
import java.util.Scanner;

public class Task_CheckTypeOfWebsite_BasedOnDomain {
    public static void main(String[] args) {
        /* ) Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
        :- take the Site URL input from the user
        Example Scenarios
        Input: example.com, Output: The website type is: Commercial website
        Input: example.org, Output: The website type is: Non-profit organization
        Input: example.edu, Output: The website type is: Educational institution
        Input: example.gov, Output: The website type is: Government website
        Input: example.net, Output: The website type is: Network-related website
        Input: example.info, Output: The website type is: Informational website
        Input: example.xyz, Output: The website type is: Unknown or other types of websites */

        System.out.println("Enter any Website");
        Scanner scanner = new Scanner(System.in);
        String website = scanner.next();
        System.out.print(website);

        int dotIndex = website.lastIndexOf('.');
        String site = website.substring(dotIndex);

        if(site.equals(".com")){
            System.out.println("Commercial website");
        }
        else if(site.equals(".org")){
            System.out.println("Non-Profit website");
        }
        else if(site.equals(".edu")){
            System.out.println("Educational institution website");
        }
        else if(site.equals(".gov")){
            System.out.println("Government website");
        }
        else if(site.equals(".info")){
            System.out.println("Informational website");
        }
        else{
            System.out.println("Unknown website");
        }
   }
}

