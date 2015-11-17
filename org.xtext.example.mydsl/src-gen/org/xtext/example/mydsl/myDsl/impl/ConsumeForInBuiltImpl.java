/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ConsumeForInBuilt;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SourceName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consume For In Built</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConsumeForInBuiltImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConsumeForInBuiltImpl#getSensorForConsume <em>Sensor For Consume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumeForInBuiltImpl extends MinimalEObjectImpl.Container implements ConsumeForInBuilt
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected SourceName name;

  /**
   * The cached value of the '{@link #getSensorForConsume() <em>Sensor For Consume</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensorForConsume()
   * @generated
   * @ordered
   */
  protected EntityName sensorForConsume;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConsumeForInBuiltImpl()
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
    return MyDslPackage.Literals.CONSUME_FOR_IN_BUILT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceName getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (SourceName)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.CONSUME_FOR_IN_BUILT__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceName basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(SourceName newName)
  {
    SourceName oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSUME_FOR_IN_BUILT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getSensorForConsume()
  {
    if (sensorForConsume != null && sensorForConsume.eIsProxy())
    {
      InternalEObject oldSensorForConsume = (InternalEObject)sensorForConsume;
      sensorForConsume = (EntityName)eResolveProxy(oldSensorForConsume);
      if (sensorForConsume != oldSensorForConsume)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME, oldSensorForConsume, sensorForConsume));
      }
    }
    return sensorForConsume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName basicGetSensorForConsume()
  {
    return sensorForConsume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensorForConsume(EntityName newSensorForConsume)
  {
    EntityName oldSensorForConsume = sensorForConsume;
    sensorForConsume = newSensorForConsume;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME, oldSensorForConsume, sensorForConsume));
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
      case MyDslPackage.CONSUME_FOR_IN_BUILT__NAME:
        if (resolve) return getName();
        return basicGetName();
      case MyDslPackage.CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME:
        if (resolve) return getSensorForConsume();
        return basicGetSensorForConsume();
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
      case MyDslPackage.CONSUME_FOR_IN_BUILT__NAME:
        setName((SourceName)newValue);
        return;
      case MyDslPackage.CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME:
        setSensorForConsume((EntityName)newValue);
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
      case MyDslPackage.CONSUME_FOR_IN_BUILT__NAME:
        setName((SourceName)null);
        return;
      case MyDslPackage.CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME:
        setSensorForConsume((EntityName)null);
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
      case MyDslPackage.CONSUME_FOR_IN_BUILT__NAME:
        return name != null;
      case MyDslPackage.CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME:
        return sensorForConsume != null;
    }
    return super.eIsSet(featureID);
  }

} //ConsumeForInBuiltImpl
