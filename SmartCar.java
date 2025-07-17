public class SmartCar {
    private String model;
    private String color;
    private boolean engineOn;
    private double fuelLevel;
    private boolean doorsLocked;
    private boolean autopilotEnabled;

    public SmartCar(String model, String color) {
        this.model = model;
        this.color = color;
        this.engineOn = false;
        this.fuelLevel = 100.0;
        this.doorsLocked = true;
        this.autopilotEnabled = false;
    }

    public void welcomeDriver(String driverName) {
        System.out.println("👋 Welcome, " + driverName + "!");
    }

    public void unlockDoors() {
        doorsLocked = false;
        System.out.println("🔓 Doors unlocked.");
    }

    public void lockDoors() {
        doorsLocked = true;
        System.out.println("🔒 Doors locked.");
    }

    public void startEngine() {
        if (!engineOn && fuelLevel > 0) {
            engineOn = true;
            System.out.println("🚗 Engine started.");
        } else if (fuelLevel <= 0) {
            System.out.println("⛽ Can't start. Fuel empty!");
        } else {
            System.out.println("⚠️ Engine is already running.");
        }
    }

    public void drive() {
        if (engineOn && fuelLevel > 0) {
            fuelLevel -= 5;
            System.out.println("🏎️ Driving... Fuel left: " + fuelLevel + "%");
        } else {
            System.out.println("🚫 Start engine first or refuel.");
        }
    }

    public void honk() {
        System.out.println("📢 Beep Beep!");
    }

    public void enableAutopilot() {
        if (engineOn) {
            autopilotEnabled = true;
            System.out.println("🤖 Autopilot mode activated.");
        } else {
            System.out.println("⚠️ Can't enable autopilot. Start engine first.");
        }
    }

    public void stopCar() {
        engineOn = false;
        autopilotEnabled = false;
        System.out.println("🛑 Car stopped. Engine turned off.");
    }

    public void checkFuel() {
        System.out.println("⛽ Fuel level: " + fuelLevel + "%");
    }

    public void refuel() {
        fuelLevel = 100.0;
        System.out.println("🛢️ Refueled to 100%.");
    }

    public void displayStatus() {
        System.out.println("\n===== CAR STATUS =====");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Engine On: " + engineOn);
        System.out.println("Doors Locked: " + doorsLocked);
        System.out.println("Autopilot Enabled: " + autopilotEnabled);
        System.out.println("Fuel Level: " + fuelLevel + "%");
        System.out.println("======================\n");
    }


  
    public static void main(String[] args) {
        SmartCar audi = new SmartCar("BMW M8", "Black");

        audi.welcomeDriver("Bhavneet");
        audi.unlockDoors();
        audi.startEngine();
        audi.drive();
        audi.enableAutopilot();
        audi.checkFuel();
        audi.drive();
        audi.stopCar();
        audi.refuel();
        audi.lockDoors();
        audi.displayStatus();
    }

}
