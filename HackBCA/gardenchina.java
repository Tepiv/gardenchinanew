import java.util.*;

public class gardenchina {
    public static String[][] string2d = new String[17][];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();
        int categ = 1;
        int prod = 1;
        int quant = 0;
        ArrayList<Integer> quantList = new ArrayList<Integer>();
        ArrayList<String> orderList = new ArrayList<String>(); 
        ArrayList<Double> priceList = new ArrayList<Double>();

        do{
            System.out.println("\nEnter any number greater than 1000 at any stage to end your order. You can also choose not to continue after purchasing an item.\n");
        for (int i = 0; i < 16; i ++) {
            System.out.println(string2d[i][0]);
        }
        System.out.println("\nChoose a category of food from the list provided (use the numbers in the parenthesis to select): \n");
        categ = input.nextInt();
        for (int i = 0; i < string2d[categ].length; i++) {
            System.out.println(string2d[categ][i]);
        }
        System.out.println("\nEnter the product you would like (numbers provided to the left)\n");
        prod = input.nextInt();
        orderList.add(string2d[categ][prod]);

        System.out.println("Enter the quantity of the product\n");
        quant = input.nextInt(); 
        quantList.add(quant);

        if (1 <= quant && quant <= 1000) {
        priceList.add(getCostofProduct(categ, prod) * quant);
        System.out.println("The current price of your order is: $" + (float)ArraySum(priceList));
        }
       
      


    System.out.println("The final price of your order is: $" + (float)ArraySum(priceList));
    ArrayString(orderList, quantList);
        }while(quant < 1000);
    
    
}
//Below is code that is for the menu, the first array will be the different categories, then the food per category.
    public static String[][] menu() {
    String[] appetizer = {"Appetizer (0)", "1. Egg Roll - 1.35", "2. Shrimp Roll - 1.55", "3. Crispy Vegetable Spring Rolls (2) - 2.75", "4. Fried Wonton (10) - 3.75", "5. Cheese Wonton/Crab Rangoon (8) - 4.75", "6. Boneless Spare Ribs (Small) - 6.25", 
        "7. Boneless Spare Ribs (Large) - 11.25", "8. BBQ Spare Ribs (Small) - 7.95", "9. BBQ Spare Ribs (Large) - 13.95", "10. Chicken Stick (4) - $5.55", "11. Veg Dumpling (8) - 5.75", "12. Pork Dumpling (8) - 5.75", 
        "13. Chicken Dumpling (8) - 5.75", "14. Shrimp Dumpling (8) - 5.95", "15. Fried Dumpling w/ Garlic Sauce - 6.95", "16. Shrimp Toast - 3.75", "17. Noodles w/ Peanut Sauce - 5.25", "18. Dim Sum (7) - 6.25",
        "19. Hot & Spicy Wonton - 4.95", "20. Pu Pu Platter (for 2) - 12.95", "21. Apple Stick (10) - 2.65", "22. Chinese Donut - 3.75", "23. Pan Fried Wonton in Garlic Sauce - 6.25"};
        
        String[] soup = {"Soup (1)", "1. Hot and Sour Soup- 2.15", "2. Wonton Soup- 1.95", "3. Wonton Egg Drop Mixed Soup - 2.55", "4. Chicken Rice Soup - 1.75", "5. Chicken Noodle Soup - 1.75", "6. Egg Drop Soup - 1.95", 
        "7. Vegetable w/ Soup - 4.95", "8. Seafood Combination Soup- 6.95", "9. House Special Mai Fun Soup- 6.25", "10. House Special Lo Mein Soup - 6.25"};
        
        String[] friedRice = {"Fried Rice (2)", "1. Vegetable Fried Rice - 3.95", "2. Chicken Fried Rice - 4.25", "3. Roast Pork Fried Rice - 4.25", "4. Shrimp Fried Rice - 4.95", "5. Beef Fried Rice - 4.95", "6. Yang Chow Fried Rice(w. Egg) - 5.25", 
        "7. House Special Fried Rice - 5.25"};
    
        String[] loMein = {"Lo Mein (3)", "1. Chicken Lo Mein - 4.55", "2. Roast Pork Lo Mein - 4.55", "3. Beef Lo Mein - 4.95", "4. Shrimp Lo Mein - 4.95", "5. Vegetable Lo Mein - 4.55", "6. House Special Lo Mein - 5.55", "7. Lobster Lo Mein - 5.75", "8. Plain Lo Mein - 3.95", "9. Crab Meat Lo Mein - 4.55"};
      
        String[] chowMein =  {"Chow Mein (4)", "1. Chicken Chow Mein - 4.75", "2. Chicken Chop Suey - 4.75", "3. Roast Pork Chow Mein - 4.75", "4. Roast Pork Chop Suey - 4.75", "5. Beef Chow Mein - 5.25", "6. Beef Chop Suey - 5.25", 
        "7. Shrimp Chow Mein - 5.25", "8. Shrimp Chop Suey - 5.25", "9. Vegetable Chow Mein - 4.25", "10. Vegetable Chop Suey 4.25", "11. House Special Chow Mein - 5.55", "12. House Special Chop Suey - 5.55"};
        
        String[] maiFun =  {"Mai Fun (5)", "1. Chicken Mai Fun/Chow Fun - 7.95", "2. Roast Pork Mai Fun/Chow Fun - 7.95", "3. Beef Mai Fun/Chow Fun - 8.55", "4. Shrimp Mai Fun/Chow Fun - 8.55", "5. Vegetable Mai Fun/Chow Fun - 7.75", "6. House Special Mai Fun/Chow - 8.75", 
        "7. Singapore Mai Fun"};

        String[] roastPork = {"Roast Pork (6)", "1. Hunan Pork - 5.75", "2. Pork w/ Garlic Sauce - 5.75", "3. Roast Pork w/ Broccoli - 5.75", "4. Roast Pork w/ Mixed Vegetable - 5.75", "5. Sweet and Sour Pork - 5.75", "6. Pork w/ Bean Sprout - 9.45", 
        "7. Moo Shu Pork (w/ 8 pancakes) - 9.45", "8. Pork w/ String Bean - 9.45", "9. Roast Pork w/ Snow peas - 5.75", "10. Pork w/ Zucchini - 5.75"};

        String[] beef = {"Beef (7)", "1. Beef with Mixed Vegetable - 6.25", "2. Hunan Beef - 6.25", "3. Beef Szechuan Style - 6.25", "4. Kung Pao Beef (w/ Peanuts) - 6.25" , "5. Mongolian Beef - 10.55", "6. Shredded Beef w/ Bean Sprout - 10.55", 
        "7. Beef w/ Oyster Sauce - 10.55", "8. Hot & Spicy Beef - 10.55", "9. Curry Beef - 6.25", "10. Beef w/ Brocoli - 6.25", "11. Shredded Beef w/ String Bean - 10.55", "12. Pepper Steak w/ Onion - 6.25", 
        "13. Beef with Garlic Sauce - 6.25", "14. Beef w/ Mushroom - 6.25", "15. Beef w/ Zucchini - 6.25", "16. Beef w/ Snow Peas - 6.25", "17. Beef Eggplant w/ Garlic Sauce - 10.55"};

        String[] poultry = {"Poultry (8)", "1. Chicken w/ Broccoli - 5.95", "2. Hunan Chicken - 5.95", "3. Chicken Szechuan Style - 5.95", "4. Chicken w/ Mixed Vegetable - 5.95", "5. Chicken with Snow Peas - 5.95", "6. Hot & Spicy Chicken - 9.75", 
        "7. Kung Pao Chicken (w/ Peanuts) - 5.95", "8. Lemon Chicken - $9.75", "9. Chicken with Cashew Nuts - 5.95", "10. Chicken with Mushrooms - 5.95", "11. Curry Chicken - 5.95", "12. Chicken with Garlic Sauce - 5.95", 
        "13. Sweet and Sour Chicken - 5.95", "14. Moo Shu Chicken (w/ 8 pancakes) - 9.75", "15. Chicken w/ Black Bean Sauce - 5.95", "16. Chicken w/ Zucchini - 5.95", "17. Chicken w/ Cauliflower - 9.75", "18. Chicken w/ String Bean - 9.75",
        "19. Chicken Eggplant w/ Garlic Sauce - 9.75"};

        String[] seafood = {"Seafood (9)", "1. Shrimp w/ Broccoli - 6.55", "2. Shrimp w/ Mixed Vegetable - 6.55", "3. Curry Shrimp - 6.55", "4. Hunan Shrimp - 6.55", "4. Shrimp Szechuan Style - 6.55", "5. Shrimp with Cashew Nuts - 6.55", 
        "6. Shrimp with Garlic Sauce) - 6.55", "7. Kung Pao Shrimp (w/ Peanuts) - 6.55", "8. Imperial Shrimp - 10.95", "9. Sweet and Sour Shrimp - 6.55", "10. Shrimp with Lobster Sauce - 6.55", "11. Hot & Spicy Shrimp - 10.95", 
        "12. Baby Shrimp w/ Bean Sprout - 10.95", "13. Shrimp w/ String Beans - 10.95", "14. Crabmeat w/ Garlic Sauce - 6.55", "15. Shrimp w/ Mushrooms - 6.55", "16. Shrimp w/ Zucchini - 6.55", "17. Shrimp w/ Snow Peas - 6.55",
        "18. Shrimp Eggplant w/ Garlic Sauce - 10.95"};

        String[] vegetable = {"Vegetable (10)", "1. Mixed Vegetable - 4.95", "2. Sauteed Cauliflower - 4.95", "3. Broccoli w/ Garlic Sauce - 4.95", "4. Sauteed Broccoli - 4.95", "5. Eggplant w/ Garlic Sauce - 4.95", "6. Sauteed String Beans - 4.95", 
        "7. Moo Shu Veg. (w/ 8 pancakes) - 7.95", "8. Bean Sprout w/ Tofu - 7.95", "9. General Tso's Tofu - 7.95", "10. Snow Peas w/ Water Chestnuts - 4.95"};

        String[] eggFooYoung = {"Egg Foo Young (11)", "1. Chicken Egg Foo Young - 7.25", "2. Roast Pork Egg Foo Young - 7.25", "3. Shrimp Egg Foo Young - 7.95", "4. Beef Egg Foo Young - 7.95", "5. Vegetable Egg Foo Young - 7.25", "6. Special Egg Foo Young - 8.25", 
        "7. Crab Meat Egg Foo Young - 7.45"};

        String[] friedSpecialties = {"Fried Specialties (12)", "1. Fried Chicken Wings (4) - 4.75", "2. Fried Baby Shrimp (15) - 4.65", "3. Jumbo Shrimp (5) -5.25", "4. Fried Scallop (12) - 4.65", "5. Chicken Nugget (10) - 4.75", "6. Fried 1/2 Chicken - 4.95", 
        "7. Fried Fish - 5.25", "8. Fried Crab Stick (5) - 4.35", "9. Spare Rib Tips - 4.65", "10. BBQ Wings - 5.95", "11. Garlic Wings - 5.95", "12. Buffalo Wing - 5.95", 
        "13. Honey Wing - 5.95", "14. Fried Green Plaintain - 2.95", "15. French Fries - 2.25"};

        String[] weightWatcherSpecial = {"Weight Watcher Special (13)", "1. Mixed Vegetable w/ Tofu - 8.75", "2. Chicken w/ Broccoli - 9.95", "3. Chicken w/ Mixed Vegetable - 9.95", "4. Shrimp w/ Broccoli - 9.95", "5. Shrimp w/ Mixed Vegetable - 11.95", "6. Triple Green Jade - 8.75", 
        "7. Triple Delight - 13.25", "8. Chicken w/ Zucchini - 9.95", "9. Chicken w/ String Bean - 9.95", "10. Chicken w/ Cauliflower - 9.95", "11. Steamed Chicken - 6.75"};

        String[] chefsSuggestion = {"Chef's Suggestions (14)", "1. General Tso's Chicken - 9.95", "2. Sesame Chicken - 9.95", "3. Crispy Hot Spicy Chicken - 9.95", "4. Orange Chicken - 10.25", "5. Boneless Chicken w/ Mixed Veg - 9.95", "6. Sesame Beef - 11.95", 
        "7. Orange Beef - 11.95", "8. Kung Pao Delight - 10.95", "9. Seafood Delight - 13.25", "10. Shrimp and Scallop Twins - 13.25", "11. Scallop & Shrimps w/ Garlic Sauce - 13.25", "12. Happy Family - 13.25", 
        "13. Four Seasons - 11.95", "14. Dragon and Phoenix - 11.95", "15. General Tso's Shrimp - 12.25", "16. Sesame Shrimp - 12.25", "17. Crispy Hot Spicy Beef - 11.95", "18. Butterfly Shrimp w/ Bacon - 12.25",
        "19. Fried Crispy Calamari(Squid) w/ Salt & Pepper - 12.95", "20. Tai Ching Chicken - 10.65", "21. Triple Delight - 11.95", "22. Pineapple Chicken - 10.65", "23. Salt & Pepper Shrimp - 12.95", "24. Seafood Pan Fried Noodle - 13.25", "25. Double Happiness - 11.55"};

        String[] dinnerCombo = {"Dinner Combo (15)", "1. Sweet & Sour Chickenn - 7.65", "2. Hunan Pork - 7.65", "3. Hunan Chicken - 7.65", "4. Hunan Beef - 7.65", "5. Chicken Lo Mein - 7.65", "6. Pork Lo Mein - 7.65", 
        "7. Beef Lo Mein - 7.65", "8. Shrimp Lo Mein - 7.65", "9. Chicken w/ Vegetable -  7.65", "10. Roast Pork w/ Vegetables - 7.65", "11. Pork w/ Garlic Sauce - 7.65", "12. Chicken w/ Garlic Sauce - 7.65", 
        "13. Pepper Chicken w/ Onion - 7.65", "14. Chicken w/ Cashew Nuts - 7.65", "15. Kung Pao Chicken - 7.65", "16. General Tso's Chicken - 7.95", "17. Broccoli w/ Garlic Sauce - 7.65", "18. Chicken Szechuan Style - 7.65",
        "19. Beef Szechuan Style - 7.65", "20. Pepper Steak w/ Onion", "21. Hunan Shrimp - 7.65", "22. Shrimp w/ Mixed Vegetable - 7.65", "23. Triple Delight - 7.65", "24. Chicken w/ Broccoli - 7.65", "25. Beef w/ Broccoli - 7.65", "26. Chicken w/ Zucchini - 7.65", "27. Beef w/ Zucchini - 7.65", "28. Shrimp w/ Broccoli - 7.65", "29. Sesame Chicken - 7.65", "30. Orange Chicken - 7.65", 
        "31. Mixed Vegetable - 7.65", "32. Boneless Spare Rib - 7.65", "33. Bar-B-Q Spare Ribs - 7.65", "34. Pork Egg Foo Young - 7.95", "35. Chicken Egg Foo Young - 7.65", "36. Beef Egg Foo Young - 7.65", "37. Shrimp Egg Foo Young - 7.95", "38. Chicken Chow Mein - 7.65", "39. Shrimp Chow Mein 7.65", "40. Hot & Spicy Chicken - 7.65", "41. Hot & Spicy Beef - 7.65", "42. Shrimp w/ Lobster Sauce - 7.95", "43. Triple Green Jade - 7.65", "44. Chicken w/ Snow Peas - 7.65", 
        "45. Beef w/ Snow Peas - 7.65", "46. Chicken w/ Mushroom - 7.65", "47. Beef w/ Mushroom - 7.65", "48. Chicken w/ String Beans - 7.65", "49. Beef w/ String Beans - 7.65", "50. Chicken w/ Eggplant - 7.65", "51. Beef w/ Eggplant - 7.65", "52. Curry Chicken - 7.65", "53. Curry Beef - 7.65"};

        string2d[0] = appetizer;
        string2d[1] = soup;
        string2d[2] = friedRice;
        string2d[3] = loMein;
        string2d[4] = chowMein;
        string2d[5] = maiFun;
        string2d[6] = roastPork;
        string2d[7] = beef;
        string2d[8] = poultry;
        string2d[9] = seafood;
        string2d[10] = vegetable;
        string2d[11] = eggFooYoung;
        string2d[12] = friedSpecialties;
        string2d[13] = weightWatcherSpecial;
        string2d[14] = chefsSuggestion;
        string2d[15] = dinnerCombo;

        return string2d;
    }
    public static double getCostofProduct(int categ, int prod) {
        String temp = string2d[categ][prod];
        String[] tempo = temp.split("-");
        double costtemp = Double.parseDouble(tempo[1]);
        return costtemp;
      
    }
    public static double ArraySum(ArrayList<Double> costList) {
        double arraysum = 0;
        for (int i = 0; i < costList.size(); i ++) {
            arraysum += costList.get(i);
        }
        return arraysum;
    }
    public static ArrayList<String> ArrayString(ArrayList<String> orderList, ArrayList<Integer> quantList) {
        ArrayList<String> completeOrder = new ArrayList<String>();
        for (int i = 0; i < orderList.size(); i++) {
            String a = Integer.toString(quantList.get(i));
            completeOrder.add("Product: " + orderList.get(i) + "\nCost: " + a);
        }
        return completeOrder;
    }

}