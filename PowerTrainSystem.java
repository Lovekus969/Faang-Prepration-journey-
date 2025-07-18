public class PowerTrainSystem {
    private boolean engineOn = false;
    private String driveMode = "Comfort";
    private int rpm = 0;
    private boolean launchControlActive = false;

    public void startEngine() {
        if (!engineOn) {
            engineOn = true;
            rpm = 700; // Idle
            System.out.println("🔥 Engine started. Welcome to the beast mode.");
        } else {
            System.out.println("Engine is already ON.");
        }
    }

    public void stopEngine() {
        engineOn = false;
        rpm = 0;
        launchControlActive = false;
        System.out.println("Engine off. Powering down systems.");
    }

    public void setDriveMode(String mode) {
        if (!engineOn) {
            System.out.println("Start engine first to change drive mode.");
            return;
        }

        if (mode.equalsIgnoreCase("Comfort") || mode.equalsIgnoreCase("Sport") || 
            mode.equalsIgnoreCase("Sport+") || mode.equalsIgnoreCase("Drift")) {
            driveMode = mode;
            System.out.println("Drive mode set to: " + driveMode);
            if (driveMode.equals("Drift")) {
                System.out.println("⚠️ Traction control disabled. Drift mode activated.");
            }
        } else {
            System.out.println("Invalid mode selected.");
        }
    }

    public void revEngine(int throttle) {
        if (!engineOn) {
            System.out.println("Engine is OFF.");
            return;
        }

        rpm += throttle * 500;
        if (rpm > 8000) rpm = 8000;
        System.out.println("Revving... RPM: " + rpm);
    }

    public void activateLaunchControl() {
        if (driveMode.equals("Sport+") && engineOn) {
            launchControlActive = true;
            System.out.println("🚀 Launch control armed. Hold brake & throttle.");
        } else {
            System.out.println("Switch to Sport+ mode and start engine to activate launch control.");
        }
    }

    public void status() {
        System.out.println("=== Powertrain Status ===");
        System.out.println("Engine: " + (engineOn ? "ON" : "OFF"));
        System.out.println("Drive Mode: " + driveMode);
        System.out.println("RPM: " + rpm);
        System.out.println("Launch Control: " + (launchControlActive ? "Armed" : "Inactive"));
        System.out.println("==========================");
    }




    public static void main(String[] args) {
        PowerTrainSystem m8 = new PowerTrainSystem();

        m8.startEngine();
        m8.setDriveMode("Sport+");
        m8.activateLaunchControl();
        m8.revEngine(5);
        m8.status();
        m8.setDriveMode("Drift");
        m8.stopEngine();
    }
}
