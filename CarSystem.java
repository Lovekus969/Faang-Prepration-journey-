public class CarSystem {

    public static void main(String[] args) {
        Car myCar = new Car();

        // Trying to change drive mode before engine starts
        myCar.setDriveMode("Sport");

        // Start the engine
        myCar.startEngine();

        // Set different drive modes
        myCar.setDriveMode("Comfort");
        myCar.setDriveMode("Sport+");
        myCar.setDriveMode("Drift");

        // Try an invalid mode
        myCar.setDriveMode("Eco");

        // Stop the engine
        myCar.stopEngine();

        // Try to change mode again after stopping engine
        myCar.setDriveMode("Comfort");
    }
}

class Car {
    private boolean engineOn;
    private String driveMode;

    public Car() {
        this.engineOn = false;
        this.driveMode = "Comfort"; // default mode
        System.out.println("Car created. Default mode: Comfort.");
    }

    public void startEngine() {
        if (!engineOn) {
            engineOn = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    public void stopEngine() {
        if (engineOn) {
            engineOn = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }

    public void setDriveMode(String mode) {
        if (!engineOn) {
            System.out.println("Start engine first to change drive mode.");
            return;
        }

        if (mode.equalsIgnoreCase("Comfort") || 
            mode.equalsIgnoreCase("Sport") || 
            mode.equalsIgnoreCase("Sport+") || 
            mode.equalsIgnoreCase("Drift")) {
            
            driveMode = mode;
            System.out.println("✅ Drive mode set to: " + driveMode);

            if (driveMode.equalsIgnoreCase("Drift")) {
                System.out.println("⚠️ Traction control disabled. Drift mode activated.");
            }

        } else {
            System.out.println("❌ Invalid mode selected.");
        }
    }
}
