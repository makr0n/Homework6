class ParkingSystem {
    public static void main(String[] args) {
        ParkingSystem parking = new ParkingSystem(0, 2, 4);
        System.out.println(parking.addCar(1));
        System.out.println(parking.addCar(2));
        System.out.println(parking.addCar(3));
    }

    private int[] numberOfSlots;

    public ParkingSystem(int big, int medium, int small) {
        this.numberOfSlots = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (numberOfSlots[carType - 1] <= 0) {
            return false;
        } else {
            numberOfSlots[carType - 1] = numberOfSlots[carType - 1] - 1;
            return true;
        }
    }
}