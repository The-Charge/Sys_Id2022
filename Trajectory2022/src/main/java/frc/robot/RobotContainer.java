package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;


/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a Command-based is a "declarative" paradigm, very little
 * robot logic should "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */

public class RobotContainer {

    private static RobotContainer m_robotContainer = new RobotContainer();

    // SUBSYSTEMS
    // public ControlPanel controlPanel = new ControlPanel();
    // public ColorSensor colorSensor = new ColorSensor();
    public Drivetrain drivetrain = new Drivetrain();


    SendableChooser<Command> m_chooser = new SendableChooser<>();

    public RobotContainer() {
        configureButtonBindings();
    }
    

    private void configureButtonBindings() {
        

        // m_chooser.addOption("GalacticSearchRedA", new GalacticSearchRedA( drivetrain,
        // intake ));
        // m_chooser.addOption("GalacticSearchRedB", new GalacticSearchRedB( drivetrain,
        // intake ));
        // m_chooser.addOption("GalacticSearchBlueB", new GalacticSearchBlueB(
        // drivetrain, intake ));
        // m_chooser.addOption("GalacticSearchBlueA", new GalacticSearchBlueA(
        // drivetrain, intake ));
        // m_chooser.addOption("BarrelRacing", new BarrelRacing( drivetrain ));
        // m_chooser.addOption("Slalom", new Slalom( drivetrain ));
        // m_chooser.addOption("Bounce", new Bounce( drivetrain ));
         m_chooser.setDefaultOption("autonomous forward", new PathVieverTest(drivetrain));
        // m_chooser.setDefaultOption("DriveFullSpeed", new DriveFullSpeed(drivetrain));

    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // The selected command will be run in autonomous
        return m_chooser.getSelected();
    }

    public static RobotContainer getInstance() {
        return m_robotContainer;
    }

}
