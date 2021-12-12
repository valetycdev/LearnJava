package Learn;
import java.util.HashMap;
public class Map {
    public static void main(String[] args) {
        // Create a HashMap(Dictionary)
        HashMap<String, Integer> Computer = new HashMap<>();
        // Add elements to HashMap(Dictionary)
        Computer.put("RTX 3090", 5);
        Computer.put("Intel Core i9", 2);
        Computer.put("Asus Motherboard", 4);
        Computer.put("16GB Ram Stick", 6);
        Computer.put("Power Supply", 15);
        Computer.put("Intel Core i7", 7);
        Computer.put("Intel Core i5", 3);
        Computer.put("Intel Core i3", 1);
        System.out.println("Computer: " + Computer);
        // Get the value of the key "RTX 3090"
        System.out.println("Amount of RTX 3090: " + Computer.get("RTX 3090"));
        // Get Computer's size FUNCTION = size()
        System.out.println("Computer Size: " + Computer.size());
        // Check if the key "RTX 3090" is in the HashMap(Dictionary) containsKey()
        System.out.println("Is RTX 3090 in the Computer? " + Computer.containsKey("RTX 3090"));
        // Check if the value 5 is in the HashMap(Dictionary) containsValue()
        System.out.println("Is 5 in the Computer? " + Computer.containsValue(5));
        // Remove the key "RTX 3090" from the HashMap(Dictionary) remove()
        // Computer.remove("RTX 3090");
        for (String key : Computer.keySet()) {
            System.out.println("PC Part: " + key + " Amount: " + Computer.get(key));
        }
        // Get the keys of the HashMap(Dictionary) keySet()
        System.out.println("Computer Parts: " + Computer.keySet());


    }
}
