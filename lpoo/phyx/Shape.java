package lpoo.phyx;

import lpoo.geom.*;
import lpoo.math.*;

/**
 *
 * @author Luiz Cardoso Neto, José Guilherme
 */
public abstract class Shape
{
    String name;
    Pose pose;

    //Constructors
    public Shape()
    {
        //do nothing
    }
    public Shape(String name; Pose pose)
    {
        this.name = name;
        this.pose = pose;
    }

    Vector3 localCenterOfMass()
    Matriz3 localInertiaTensor()
}