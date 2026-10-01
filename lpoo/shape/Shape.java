package lpoo.shape;

import lpoo.geom.*;
import lpoo.math.*;
import lpoo.phyx.*;

/**
 *
 * @author Luiz Cardoso Neto, José Guilherme
 */
public abstract class Shape
{
    String name;
    Pose pose;
    Vector3 centerOfMass;
    double mass;
    Matrix3 inertiaTensor;

    //Constructors
    public Shape()
    {
        this.pose = new Pose();
    }
    public Shape(String name, Pose pose)
    {
        this.name = name;
        this.pose = new Pose(pose);
    }
    void setPose(Pose pose)
    {
        this.pose = new Pose();
    }
    Pose getPose()
    {
        return this.pose;
    }
}