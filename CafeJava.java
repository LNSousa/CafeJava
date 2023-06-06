public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 2.5;
        double lattePrice = 3.0;
        double cappuccinoPrice = 4.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println( isReadyOrder1 ? customer1 + readyMessage + "\n" + displayTotalMessage + dripPrice : customer1 + pendingMessage);
        
        // Noah
        System.out.println(generalGreeting + customer4);
        System.out.println(isReadyOrder4 ? customer4 + readyMessage + "\n" + displayTotalMessage + cappuccinoPrice : customer4 + pendingMessage);

        // Sam (2) - 2 lattes - ready
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : customer2 + pendingMessage);
        System.out.println(displayTotalMessage + (2*lattePrice));

        //Jimmy - (latte - coffee)
        System.out.println(customer3 + ", you owe $" + (lattePrice - dripPrice));

    }
}