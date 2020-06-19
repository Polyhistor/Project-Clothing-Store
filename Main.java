
import model.ClothingItem;
import model.ClothingSize;
import model.Shirt;
import model.Hat;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, ClothingItem> items = new HashMap<>();
        items.put("shirt", new Shirt(ClothingSize.L, 19.99, 3));
        items.put("hat", new Hat(ClothingSize.M, 29.99, 1));

        var anItem = items.get("hat");
        displayItemDetails(anItem);

        var keys = items.keySet();

        for (String key : keys) {
            var item = items.get(key);
            displayItemDetails(item);
        }

        // List<String> colors = new ArrayList<String>();
        // colors.add("red");
        // colors.add("green");
        // colors.add("blue");

        // for (int i = 0; i < colors.size(); i++) {
        // System.out.println(colors.get(i));
        // }

        // List<ClothingItem> items = new ArrayList<>();
        // items.add(new Shirt(ClothingSize.L, 19.99, 3));
        // items.add(new Hat(ClothingSize.M, 29.99, 1));

        // for (int i = 0; i < items.size(); i++) {
        // displayItemDetails(items.get(i));
        // }

        // for (ClothingItem clothingItem : items) {
        // displayItemDetails(clothingItem);
        // }

        // String[] colors = new String[3];
        // colors[0] = "red";
        // colors[1] = "blue";
        // colors[2] = "green";

        // for (int i = 0; i < colors.length; i++) {
        // System.out.println(colors[i]);
        // }

        // ClothingItem[] items = { new Shirt(ClothingSize.L, 19.99, 3), new
        // Hat(ClothingSize.M, 29.99, 1) };

        // for (ClothingItem clothingItem : items) {
        // displayItemDetails(clothingItem);
        // }

    }

    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s", item.getSize(), item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}