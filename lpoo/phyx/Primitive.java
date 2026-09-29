package lpoo.phyx;

import lpoo.geom.*;
import lpoo.math.*;

/**
 *
 * @author Luiz Cardoso Neto, José Guilherme
 */
public abstract class Primitive extends Shape
{
    public Vector3 centerOfMass()
    {
        localCenterOfMass = new Vector3(0,0,0);
        return localCenterOfMass;
    }
    
}