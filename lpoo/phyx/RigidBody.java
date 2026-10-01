package lpoo.phyx;

import lpoo.geom.*;
import lpoo.math.*;

/**
 *
 * @author Luiz Cardoso Neto, José Guilherme
 */
public final class RigidBody
{
  private Shape shape;

  float getSurfaceArea();
  float getVolume();
  float getMass();
  Vector3 getGlobalCenterOfMass();
  Matriz3 getGlobalinertiaTensor();
  Bounds3 bounds();

} // RigidBody
