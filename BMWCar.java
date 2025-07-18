// BMWCar.java
public class BMWCar {
    private boolean engineOn = false;
    private String driveMode = "Comfort";
    private boolean tractionControl = true;
    private boolean autoBrakingSystem = true;
    private boolean laneAssist = true;
    private boolean sosSystemEnabled = true;

    public void startEngine() {
        if (!engineOn) {
            engineOn = true;
            System.out.println("🚗 Engine started.");
        } else {
            System.out.println("Engine is already on.");
        }
    }

    public void stopEngine() {
        if (engineOn) {
            engineOn = false;
            System.out.println("🛑 Engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
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
            if (driveMode.equalsIgnoreCase("Drift")) {
                tractionControl = false;
                System.out.println("⚠️ Traction control disabled. Drift mode activated.");
            } else {
                tractionControl = true;
            }
        } else {
            System.out.println("Invalid mode selected.");
        }
    }

    public void activateAutoBrakingSystem() {
        if (autoBrakingSystem) {
            System.out.println("🛑 Auto Braking System engaged.");
        } else {
            System.out.println("Auto Braking System is not available.");
        }
    }

    public void checkLaneAssist() {
        if (laneAssist) {
            System.out.println("📶 Lane Assist is active.");
        } else {
            System.out.println("Lane Assist is not available.");
        }
    }

    public void emergencySOS() {
        if (sosSystemEnabled) {
            System.out.println("📡 SOS signal sent. Help is on the way!");
        } else {
            System.out.println("SOS system is disabled.");
        }
    }

    public void statusReport() {
        System.out.println("====== BMW Car Status ======");
        System.out.println("Engine: " + (engineOn ? "On" : "Off"));
        System.out.println("Drive Mode: " + driveMode);
        System.out.println("Traction Control: " + (tractionControl ? "Enabled" : "Disabled"));
        System.out.println("Auto Braking: " + (autoBrakingSystem ? "Enabled" : "Disabled"));
        System.out.println("Lane Assist: " + (laneAssist ? "Enabled" : "Disabled"));
        System.out.println("SOS System: " + (sosSystemEnabled ? "Enabled" : "Disabled"));
        System.out.println("============================");
    }

    public static void main(String[] args) {
        BMWCar myBMW = new BMWCar();

        // Let's test each function step-by-step
        myBMW.statusReport(); // initial status
        myBMW.startEngine();
        myBMW.setDriveMode("Sport+");
        myBMW.activateAutoBrakingSystem();
        myBMW.checkLaneAssist();
        myBMW.setDriveMode("Drift");
        myBMW.emergencySOS();
        myBMW.stopEngine();
        myBMW.statusReport(); // final status
    }
}
