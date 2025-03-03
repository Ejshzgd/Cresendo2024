package frc.robot.utils;

public class ModuleConfig {
    
    // fields for drive motor & turn motor
    public final int DRIVE_PORT;
    public final int TURN_PORT;

    // field for angle offset for turn motor
    public final double OFFSET;

    // name of module
    public final String NAME;

    public ModuleConfig(String name, int deezPort, int teePort, double oofset) {

        // initializing fields
        NAME = name;
        DRIVE_PORT  = deezPort;
        TURN_PORT = teePort;
        OFFSET = oofset;

    } 

}
