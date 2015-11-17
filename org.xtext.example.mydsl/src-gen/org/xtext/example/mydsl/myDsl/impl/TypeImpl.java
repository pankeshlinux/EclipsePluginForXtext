/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PrimitiveDataType;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The cached value of the '{@link #getPrimitiveDataType() <em>Primitive Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveDataType()
   * @generated
   * @ordered
   */
  protected PrimitiveDataType primitiveDataType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveDataType getPrimitiveDataType()
  {
    return primitiveDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitiveDataType(PrimitiveDataType newPrimitiveDataType, NotificationChain msgs)
  {
    PrimitiveDataType oldPrimitiveDataType = primitiveDataType;
    primitiveDataType = newPrimitiveDataType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE, oldPrimitiveDataType, newPrimitiveDataType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitiveDataType(PrimitiveDataType newPrimitiveDataType)
  {
    if (newPrimitiveDataType != primitiveDataType)
    {
      NotificationChain msgs = null;
      if (primitiveDataType != null)
        msgs = ((InternalEObject)primitiveDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE, null, msgs);
      if (newPrimitiveDataType != null)
        msgs = ((InternalEObject)newPrimitiveDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE, null, msgs);
      msgs = basicSetPrimitiveDataType(newPrimitiveDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE, newPrimitiveDataType, newPrimitiveDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE:
        return basicSetPrimitiveDataType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE:
        return getPrimitiveDataType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE:
        setPrimitiveDataType((PrimitiveDataType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE:
        setPrimitiveDataType((PrimitiveDataType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.TYPE__PRIMITIVE_DATA_TYPE:
        return primitiveDataType != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeImpl
