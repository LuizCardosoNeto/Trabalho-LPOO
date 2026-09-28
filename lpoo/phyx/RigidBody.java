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

  float surfaceArea();
  float volume();
  float mass();
  Vector3 centerOfMass();
  Matriz3 inertiaTensor();
  Bounds3 bounds();

} // RigidBody
