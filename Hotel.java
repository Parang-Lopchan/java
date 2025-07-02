public class Hotel {
    String hotelName;
    int rooms;
    double roomRate;

    double calculateRevenue() {
        return rooms * roomRate;
    }

    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.hotelName = "Sunrise Inn";
        h.rooms = 100;
        h.roomRate = 150.0;

        System.out.println("Total Revenue: $" + h.calculateRevenue());
    }
}

