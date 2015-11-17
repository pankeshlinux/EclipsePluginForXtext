/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.Generate;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PeriodicSensors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Sensors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PeriodicSensorsImpl#getSensorName <em>Sensor Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PeriodicSensorsImpl#getGenerateInfo <em>Generate Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicSensorsImpl extends MinimalEObjectImpl.Container implements PeriodicSensors
{
  /**
   * The cached value of the '{@link #getSensorName() <em>Sensor Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensorName()
   * @generated
   * @ordered
   */
  protected EntityName sensorName;

  /**
   * The cached value of the '{@link #getGenerateInfo() <em>Generate Info</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerateInfo()
   * @generated
   * @ordered
   */
  protected EList<Generate> generateInfo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PeriodicSensorsImpl()
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
    return MyDslPackage.Literals.PERIODIC_SENSORS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getSensorName()
  {
    return sensorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSensorName(EntityName newSensorName, NotificationChain msgs)
  {
    EntityName oldSensorName = sensorName;
    sensorName = newSensorName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME, oldSensorName, newSensorName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensorName(EntityName newSensorName)
  {
    if (newSensorName != sensorName)
    {
      NotificationChain msgs = null;
      if (sensorName != null)
        msgs = ((InternalEObject)sensorName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME, null, msgs);
      if (newSensorName != null)
        msgs = ((InternalEObject)newSensorName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME, null, msgs);
      msgs = basicSetSensorName(newSensorName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME, newSensorName, newSensorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Generate> getGenerateInfo()
  {
    if (generateInfo == null)
    {
      generateInfo = new EObjectContainmentEList<Generate>(Generate.class, this, MyDslPackage.PERIODIC_SENSORS__GENERATE_INFO);
    }
    return generateInfo;
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
      case MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME:
        return basicSetSensorName(null, msgs);
      case MyDslPackage.PERIODIC_SENSORS__GENERATE_INFO:
        return ((InternalEList<?>)getGenerateInfo()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME:
        return getSensorName();
      case MyDslPackage.PERIODIC_SENSORS__GENERATE_INFO:
        return getGenerateInfo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME:
        setSensorName((EntityName)newValue);
        return;
      case MyDslPackage.PERIODIC_SENSORS__GENERATE_INFO:
        getGenerateInfo().clear();
        getGenerateInfo().addAll((Collection<? extends Generate>)newValue);
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
      case MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME:
        setSensorName((EntityName)null);
        return;
      case MyDslPackage.PERIODIC_SENSORS__GENERATE_INFO:
        getGenerateInfo().clear();
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
      case MyDslPackage.PERIODIC_SENSORS__SENSOR_NAME:
        return sensorName != null;
      case MyDslPackage.PERIODIC_SENSORS__GENERATE_INFO:
        return generateInfo != null && !generateInfo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PeriodicSensorsImpl
