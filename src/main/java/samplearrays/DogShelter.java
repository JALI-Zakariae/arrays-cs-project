package samplearrays;

public class DogShelter {

    // initialize an array of 3
    public static int[] dogCounts = new int[3];

    public static void main(String[] args) {

        // Adding counts for three types of dogs
        dogCounts[0] = 15;
        dogCounts[1] = 30;
        dogCounts[2] = 20;

        // Display initial dog counts
        System.out.println("Initial Dog Counts:");
        displayDogs();

        // Increase count for second breed of dog
        addBreed(1, 5);

        // Remove the third breed (set to 0, since arrays can't shrink)
        deleteBreed(2);

        // Display updated dog counts
        System.out.println("\nUpdated Dog Counts:");
        displayDogs();

    }

    // Add count to a given index
    public static void addBreed(int index, int count) {
        if (index>=dogCounts.length || index<0){
            System.out.println("Invalid index");
        }
        else{
            dogCounts[index] +=count;
        }
    }

    // Remove a breed by setting its count to 0
    public static void deleteBreed(int index) {
        if (index>=dogCounts.length || index<0){
            System.out.println("Invalid index");
        }
        else{
            dogCounts[index] = 0;
        }
        // add your code here
    }

    // Display all dog counts
    public static void displayDogs() {
        for (int i = 0;i<dogCounts.length;i++){
            System.out.println("The breed " + i +" has "+dogCounts[i]+" dogs.");
        }
        System.out.println();

    }
}

