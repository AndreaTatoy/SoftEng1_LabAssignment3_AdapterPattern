public class Application {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        Refrigerator refrigerator = new Refrigerator();

        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet smartphoneChargerOutlet = new SmartphoneAdapter(smartphoneCharger);
        PowerOutlet refrigeratorOutlet = new  RefrigeratorAdapter(refrigerator);

        laptopOutlet.plugIn();
        smartphoneChargerOutlet.plugIn();
        refrigeratorOutlet.plugIn();
    }
    
}
