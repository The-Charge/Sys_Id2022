## Trajectory Notes
Here are some helpful notes to keep in mind when working with trajectory stuff that we discovered.

### Trajectory Generation (Coordinates)
To go backwards:
`config.setReversed(true)`
make coordinates go backwards (i.e. start (0,0) end (-2,0))  
  
To do multiple trajectories in a row:
call the commands in order from  `addCommands()` and just make sure you reset encoders. You can also concatenate (see below).  
  
  Remember: the coordinates are (X,Y, Rotation2d()). X - how far forward, Y - how far over (to the left of the robot is positive), and the angle is the heading it should be at (+ is to the left)
  
  ### PathWeaver
  To go backwards/backtrack original path:
  make sure `Reverse Splines` button is checked. Also, make the headings on the path flip 180deg, so they face where the robot wants to head. Basically, and just like with the backwards stuff above, when the configuration is set to reverse, it just tells the robot to run in reverse, but the headings stay the same (in PathWeaver), so it needs to change.  
    
To run multiple trajectories in a row: 
This is different than the coordinates. You MUST use the `Trajectory result = traj1.concatenate(traj2)`. It acts quite strangely if you just code it like the coordinates. We believe that the file code in combination with the `addCommands()` makes the robot run all of those trajectories at once, or something similar.
