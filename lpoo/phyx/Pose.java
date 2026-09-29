package lpoo.phyx;

import lpoo.geom.*;
import lpoo.math.*;
/**
 *
 * @author Luiz Cardoso Neto, José Guilherme
 */
public class Pose
{
    private Matrix3 R;
    private Vector3 t;

    public Pose(Matrix3 R, Vector3 t)
    {
        this.R = R;
        this.t = t;
    }
}