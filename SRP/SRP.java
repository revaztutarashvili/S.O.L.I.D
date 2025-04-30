
//აქ მოყვანილია მაგალითი სრპ-ის დარღვევით სადაც სარეცხი მანქანის ყველა ფუნქცია ერთ კლასშია გაწერილი
public class DishwasherDryer {
    public void washing() {
        System.out.println("Washing clothes ...");
    }

    public void spin() {
        System.out.println("Spining dclothes...");
    }

    public void dry() {
        System.out.println("Drying dclothes...");
    }

    public void iron() {
        System.out.println("Ironing dclothes...");
    }
}


/*______________________________________________________________________________________________
აქ კი მოყვანილია კოდის მაგალითი სრპ-ის დაცვით, როდესაც თითოეულ ფუნქცია გაწერილია ცალკე კლასში და
ამრიგად, თითოეული კლასი პასუხისმგებელია თითო ტასკზე.*/

// მხოლოდ რეცხვაზეა ეს კლასი პასუხისმგებელი
public class washer {
    public void wash() {
        System.out.println("Washing...");
    }
}

// მხოლოდ გაწურვაზეა ეს კლასი პასუხისმგებელი
public class Spiner {
    public void spin() {
        System.out.println("Spining...");
    }
}

// მხოლოდ გაშრობაზეა ეს კლასი პასუხისმგებელი
public class Dryer {
    public void dry() {
        System.out.println("Drying...");
    }
}

// მხოლოდ გაუთოვებაზეა ეს კლასი პასუხისმგებელი
public class Ironer {
    public void iron() {
        System.out.println("Ironing...");
    }
}

