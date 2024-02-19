import java.util.*;

public class resturantManagement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vstr, tvstr = 0, nvstr, tnvstr = 0, amt = 0, tamt = 0,ch;

        double vat = 0;

        String str = " ", ans, choice = "Y";
        System.out.println("Welcome to the Multi Cuisine Restaurant");
        System.out.println("Starter Corner: 1");
        System.out.println("Main Course: 2");
        System.out.println("Deserts................: 3");
        System.out.println();
        System.out.println("Press 1 for Starter");
        // System.out.println("Press 2 for mail Course");
        // System.out.println("Press 3 for Cool with Deserts");
        System.out.println();
        System.out.println("Enter you choice");

        ch = in.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Welcome to the Starter Menu!!!:");
            System.out.println("Enter 'VS' for Veg Starter abd 'NVS' for Non Veg Starter");
            str = in.next();

            if(str.equalsIgnoreCase("VS")){
                System.out.println("Starters\t\t\tPrice in Rs.");
                System.out.println("1. Paneer Tikka\t\t\t110");
                System.out.println("2. Veg Seekh Kabab\t\t\t110");
                System.out.println("3. Hara Bhara Kebab\t\t\t110");
                System.out.println("4. Shanghai Spring Roll\t\t\t150");
                System.out.println("5. American Corn Ball\t\t\t150");
                System.out.println("6. Cripsy American Corn\t\t\t140");
                System.out.println("7. Crispy Baby Corn\t\t\t140");
                System.out.println("8. Crispy Mashroom\t\t\t140");
                System.out.println("9. Crispy Chilli Potato\t\t\t120");
                System.out.println("10. Crispy Chilli Chana\t\t\t150");
                System.out.println();

                while (choice.equalsIgnoreCase("Y")) {
                    System.out.println("Choose your starter from the above list by entering the number");
                    vstr = in.nextInt();
                    System.out.println("Enter the total number of starters you want: ");
                    tvstr = in.nextInt();
                    if(vstr >= 1 && vstr <=3)
                        amt = tvstr * 110;
                    if(vstr == 4 || vstr == 5)
                        amt = tvstr * 150;
                    if(vstr == 6 || vstr == 7)
                        amt = tvstr * 140;
                    if(vstr == 8 || vstr == 9)
                        amt = tvstr * 120;
                    if(vstr == 10)
                        amt = tvstr * 150;
                    tamt = tamt + amt;

                    System.out.println("Do you want to palce more order? Enter Y/N");
                    choice = in.next();
                }
            }

            if(str.equalsIgnoreCase("NVS")){
                System.out.println("Non-Vegeterian Starter:");
                System.out.println();
                System.out.println("Non-Veg Starters\t\t\tPrice in Rs.");
                System.out.println("1. Chicken Tikka\t\t\t170");
                System.out.println("2. Murg Reshmi Kebab\t\t\t170");
                System.out.println("3. Murg Chili Kebab\t\t\t160");
                System.out.println("4. Chiken Seekh Kebab\t\t\t180");
                System.out.println("5. Tangdi Kebeb\t\t\t180");
                System.out.println("6. Murg Tandori\t\t\t180");
                System.out.println("7. Fish Ajwani\t\t\t190");
                System.out.println("8. Drums of Heaven\t\t\t180");
                System.out.println("9. Shanghai Chicken\t\t\t180");

                while (choice.equalsIgnoreCase("Y")) {
                    System.out.println("Chose your starter from the above list by entering the number:");
                    nvstr = in.nextInt();
                    System.out.println("Enter the total number of starters you want: ");
                    tnvstr = in.nextInt();

                    if(nvstr == 1 || nvstr == 2)
                        amt = tnvstr * 170;
                    if(nvstr == 3)
                        amt = tnvstr + 160;
                    if(nvstr == 4 || nvstr == 5)
                        amt = tnvstr * 180;
                    if(nvstr == 8 || nvstr == 7)
                        amt = tnvstr * 190;
                    if(nvstr == 8)
                        amt = tnvstr * 180;
                    if(nvstr == 9 || nvstr == 10)
                        amt = tnvstr * 180;
                    tamt  = tamt + amt;
                    System.out.println("Do you want to place more order? Enter Y/N");
                    choice = in.next();
                }
            }

            System.out.println("******************Multi Cuisine Restaurant******************");
            System.out.println("***********Bill***********");
            System.out.println("Total cost = Rs."+tamt);

            vat = Math.round(14.5/100.0 * tamt);
            System.out.println("VAT = 14.5%");
            System.out.println("Total VAT = Rs."+vat);
            System.out.println("Amount to be paid = Rs."+(tamt + vat));
            System.out.println();

            break;
            default:
            System.out.println("You have entered a wrong choice11");
            System.out.println("You can enter in the Multi Cuisine Restaurant by executing the program again with the correct choice!!");
            System.out.println("Now, 'Quit' the program.");
        }

        System.out.println("To exit Multi Cuisine Restaurant Wolrd, enter the word 'Quit' !!");
        ans = in.next();
        if(ans.equals("quit") || ans.equals("QUIT") || ans.equals("Quit")){
        System.out.println("Thanks for coming to Multi Cuisine Restaurant!!!");
        System.out.println("Your Pleasure Our Comfort!!!");
        System.out.println("Visit Again!!!");
        System.out.println();
        }
        in.close();
    }
}