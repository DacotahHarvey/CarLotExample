public class App {
    public static void main(String[] args) throws Exception {
        // Make the first Carlot from the Carlot class
        Carlot myLot = new Carlot("Codys Carlot");

        myLot.buyCar(new InventoryItem(
            new Car(2010, "ABC123", "Red", "Toyota", "Corolla", 1000 * 100, 0),
            2000)
        );

        myLot.buyCar(new InventoryItem(
            new Car(2010, "123123123", "Blue", "Honda", "Civic", 3000 * 100, 0),
            5000)
        );

        myLot.buyCar(new InventoryItem(
            new Car(2010, "322313", "Red", "Honda", "Civic", 10000 * 100 , 0),
            5000)
        );

        System.out.println(myLot.findByMake("Honda"));
    
        // I am not sure how to sell a car or take input without importing the java.util.Scanner; and if so would I need it for each 
        //file? also when I do figure out how to take input need to make it so that it changes the priceHistory of that car to the 
        // most recent sold for price(porbably listPrice.)
    }
}
