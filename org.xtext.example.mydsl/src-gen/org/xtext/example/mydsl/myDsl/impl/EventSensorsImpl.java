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
import org.xtext.example.mydsl.myDsl.EventConditions;
import org.xtext.example.mydsl.myDsl.EventSensors;
import org.xtext.example.mydsl.myDsl.Generate;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Sensors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EventSensorsImpl#getSensorName <em>Sensor Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EventSensorsImpl#getGenerateInfo <em>Generate Info</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EventSensorsImpl#getEventConditions <em>Event Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventSensorsImpl extends MinimalEObjectImpl.Container implements EventSensors
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
   * The cached value of the '{@link #getEventConditions() <em>Event Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventConditions()
   * @generated
   * @ordered
   */
  protected EList<EventConditions> eventConditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventSensorsImpl()
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
    return MyDslPackage.Literals.EVENT_SENSORS;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EVENT_SENSORS__SENSOR_NAME, oldSensorName, newSensorName);
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
        msgs = ((InternalEObject)sensorName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EVENT_SENSORS__SENSOR_NAME, null, msgs);
      if (newSensorName != null)
        msgs = ((InternalEObject)newSensorName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EVENT_SENSORS__SENSOR_NAME, null, msgs);
      msgs = basicSetSensorName(newSensorName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EVENT_SENSORS__SENSOR_NAME, newSensorName, newSensorName));
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
      generateInfo = new EObjectContainmentEList<Generate>(Generate.class, this, MyDslPackage.EVENT_SENSORS__GENERATE_INFO);
    }
    return generateInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventConditions> getEventConditions()
  {
    if (eventConditions == null)
    {
      eventConditions = new EObjectContainmentEList<EventConditions>(EventConditions.class, this, MyDslPackage.EVENT_SENSORS__EVENT_CONDITIONS);
    }
    return eventConditions;
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
      case MyDslPackage.EVENT_SENSORS__SENSOR_NAME:
        return basicSetSensorName(null, msgs);
      case MyDslPackage.EVENT_SENSORS__GENERATE_INFO:
        return ((InternalEList<?>)getGenerateInfo()).basicRemove(otherEnd, msgs);
      case MyDslPackage.EVENT_SENSORS__EVENT_CONDITIONS:
        return ((InternalEList<?>)getEventConditions()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.EVENT_SENSORS__SENSOR_NAME:
        return getSensorName();
      case MyDslPackage.EVENT_SENSORS__GENERATE_INFO:
        return getGenerateInfo();
      case MyDslPackage.EVENT_SENSORS__EVENT_CONDITIONS:
        return getEventConditions();
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
      case MyDslPackage.EVENT_SENSORS__SENSOR_NAME:
        setSensorName((EntityName)newValue);
        return;
      case MyDslPackage.EVENT_SENSORS__GENERATE_INFO:
        getGenerateInfo().clear();
        getGenerateInfo().addAll((Collection<? extends Generate>)newValue);
        return;
      case MyDslPackage.EVENT_SENSORS__EVENT_CONDITIONS:
        getEventConditions().clear();
        getEventConditions().addAll((Collection<? extends EventConditions>)newValue);
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
      case MyDslPackage.EVENT_SENSORS__SENSOR_NAME:
        setSensorName((EntityName)null);
        return;
      case MyDslPackage.EVENT_SENSORS__GENERATE_INFO:
        getGenerateInfo().clear();
        return;
      case MyDslPackage.EVENT_SENSORS__EVENT_CONDITIONS:
        getEventConditions().clear();
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
      case MyDslPackage.EVENT_SENSORS__SENSOR_NAME:
        return sensorName != null;
      case MyDslPackage.EVENT_SENSORS__GENERATE_INFO:
        return generateInfo != null && !generateInfo.isEmpty();
      case MyDslPackage.EVENT_SENSORS__EVENT_CONDITIONS:
        return eventConditions != null && !eventConditions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EventSensorsImpl
