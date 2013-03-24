/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCollisionObjectWrapper {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btCollisionObjectWrapper(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btCollisionObjectWrapper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

	/** Temporary instance, use by native methods that return a btCollisionObjectWrapper instance */
	protected final static btCollisionObjectWrapper temp = new btCollisionObjectWrapper(0, false);
	public static btCollisionObjectWrapper internalTemp(long cPtr, boolean own) {
		temp.reuse(cPtr, own);
		return temp;
	}
	/** Pool of btCollisionObjectWrapper instances, used by director interface to provide the arguments. */
	protected static final com.badlogic.gdx.utils.Pool<btCollisionObjectWrapper> pool = new com.badlogic.gdx.utils.Pool<btCollisionObjectWrapper>() {
		@Override
		protected btCollisionObjectWrapper newObject() {
			return new btCollisionObjectWrapper(0, false);
		}
	};
	/** Reuses a previous freed instance or creates a new instance and set it to reflect the specified native object */
	public static btCollisionObjectWrapper obtain(long cPtr, boolean own) {
		final btCollisionObjectWrapper result = pool.obtain();
		result.reuse(cPtr, own);
		return result;
	}
	/** delete the native object if required and allow the instance to be reused by the obtain method */
	public static void free(final btCollisionObjectWrapper inst) {
		inst.delete();
		pool.free(inst);
	}
	/** Same as deleting and recreating this object with the new pointer, but without garbage collecting */
	protected void reuse(final long cPtr, final boolean own) {
		delete();
		swigCPtr = cPtr;
		swigCMemOwn = own;
	}

  public void setM_parent(btCollisionObjectWrapper value) {
    gdxBulletJNI.btCollisionObjectWrapper_m_parent_set(swigCPtr, this, btCollisionObjectWrapper.getCPtr(value), value);
  }

  public btCollisionObjectWrapper getM_parent() {
	return btCollisionObjectWrapper.internalTemp(gdxBulletJNI.btCollisionObjectWrapper_m_parent_get(swigCPtr, this), false);
}

  public void setM_shape(btCollisionShape value) {
    gdxBulletJNI.btCollisionObjectWrapper_m_shape_set(swigCPtr, this, btCollisionShape.getCPtr(value), value);
  }

  public btCollisionShape getM_shape() {
    long cPtr = gdxBulletJNI.btCollisionObjectWrapper_m_shape_get(swigCPtr, this);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public void setM_collisionObject(btCollisionObject value) {
    gdxBulletJNI.btCollisionObjectWrapper_m_collisionObject_set(swigCPtr, this, btCollisionObject.getCPtr(value), value);
  }

  public btCollisionObject getM_collisionObject() {
	return btCollisionObject.getInstance(gdxBulletJNI.btCollisionObjectWrapper_m_collisionObject_get(swigCPtr, this), false);
}

  public Matrix4 getM_worldTransform() {
	return gdxBulletJNI.btCollisionObjectWrapper_m_worldTransform_get(swigCPtr, this);
}

  public Matrix4 getWorldTransform() {
	return gdxBulletJNI.btCollisionObjectWrapper_getWorldTransform(swigCPtr, this);
}

  public btCollisionObject getCollisionObject() {
	return btCollisionObject.getInstance(gdxBulletJNI.btCollisionObjectWrapper_getCollisionObject(swigCPtr, this), false);
}

  public btCollisionShape getCollisionShape() {
    long cPtr = gdxBulletJNI.btCollisionObjectWrapper_getCollisionShape(swigCPtr, this);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

}