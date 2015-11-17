/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Actuator;
import org.xtext.example.mydsl.myDsl.EventSensors;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PeriodicSensors;
import org.xtext.example.mydsl.myDsl.StorageService;
import org.xtext.example.mydsl.myDsl.Struct;
import org.xtext.example.mydsl.myDsl.VocSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voc Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VocSpecImpl#getStructs <em>Structs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VocSpecImpl#getPeriodicSensors <em>Periodic Sensors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VocSpecImpl#getEventSensors <em>Event Sensors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VocSpecImpl#getActuators <em>Actuators</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VocSpecImpl#getStorageService <em>Storage Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VocSpecImpl extends MinimalEObjectImpl.Container implements VocSpec
{
  /**
   * The cached value of the '{@link #getStructs() <em>Structs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructs()
   * @generated
   * @ordered
   */
  protected EList<Struct> structs;

  /**
   * The cached value of the '{@link #getPeriodicSensors() <em>Periodic Sensors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriodicSensors()
   * @generated
   * @ordered
   */
  protected EList<PeriodicSensors> periodicSensors;

  /**
   * The cached value of the '{@link #getEventSensors() <em>Event Sensors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSensors()
   * @generated
   * @ordered
   */
  protected EList<EventSensors> eventSensors;

  /**
   * The cached value of the '{@link #getActuators() <em>Actuators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuators()
   * @generated
   * @ordered
   */
  protected EList<Actuator> actuators;

  /**
   * The cached value of the '{@link #getStorageService() <em>Storage Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageService()
   * @generated
   * @ordered
   */
  protected EList<StorageService> storageService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VocSpecImpl()
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
    return MyDslPackage.Literals.VOC_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Struct> getStructs()
  {
    if (structs == null)
    {
      structs = new EObjectContainmentEList<Struct>(Struct.class, this, MyDslPackage.VOC_SPEC__STRUCTS);
    }
    return structs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PeriodicSensors> getPeriodicSensors()
  {
    if (periodicSensors == null)
    {
      periodicSensors = new EObjectContainmentEList<PeriodicSensors>(PeriodicSensors.class, this, MyDslPackage.VOC_SPEC__PERIODIC_SENSORS);
    }
    return periodicSensors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventSensors> getEventSensors()
  {
    if (eventSensors == null)
    {
      eventSensors = new EObjectContainmentEList<EventSensors>(EventSensors.class, this, MyDslPackage.VOC_SPEC__EVENT_SENSORS);
    }
    return eventSensors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actuator> getActuators()
  {
    if (actuators == null)
    {
      actuators = new EObjectContainmentEList<Actuator>(Actuator.class, this, MyDslPackage.VOC_SPEC__ACTUATORS);
    }
    return actuators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StorageService> getStorageService()
  {
    if (storageService == null)
    {
      storageService = new EObjectContainmentEList<StorageService>(StorageService.class, this, MyDslPackage.VOC_SPEC__STORAGE_SERVICE);
    }
    return storageService;
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
      case MyDslPackage.VOC_SPEC__STRUCTS:
        return ((InternalEList<?>)getStructs()).basicRemove(otherEnd, msgs);
      case MyDslPackage.VOC_SPEC__PERIODIC_SENSORS:
        return ((InternalEList<?>)getPeriodicSensors()).basicRemove(otherEnd, msgs);
      case MyDslPackage.VOC_SPEC__EVENT_SENSORS:
        return ((InternalEList<?>)getEventSensors()).basicRemove(otherEnd, msgs);
      case MyDslPackage.VOC_SPEC__ACTUATORS:
        return ((InternalEList<?>)getActuators()).basicRemove(otherEnd, msgs);
      case MyDslPackage.VOC_SPEC__STORAGE_SERVICE:
        return ((InternalEList<?>)getStorageService()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.VOC_SPEC__STRUCTS:
        return getStructs();
      case MyDslPackage.VOC_SPEC__PERIODIC_SENSORS:
        return getPeriodicSensors();
      case MyDslPackage.VOC_SPEC__EVENT_SENSORS:
        return getEventSensors();
      case MyDslPackage.VOC_SPEC__ACTUATORS:
        return getActuators();
      case MyDslPackage.VOC_SPEC__STORAGE_SERVICE:
        return getStorageService();
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
      case MyDslPackage.VOC_SPEC__STRUCTS:
        getStructs().clear();
        getStructs().addAll((Collection<? extends Struct>)newValue);
        return;
      case MyDslPackage.VOC_SPEC__PERIODIC_SENSORS:
        getPeriodicSensors().clear();
        getPeriodicSensors().addAll((Collection<? extends PeriodicSensors>)newValue);
        return;
      case MyDslPackage.VOC_SPEC__EVENT_SENSORS:
        getEventSensors().clear();
        getEventSensors().addAll((Collection<? extends EventSensors>)newValue);
        return;
      case MyDslPackage.VOC_SPEC__ACTUATORS:
        getActuators().clear();
        getActuators().addAll((Collection<? extends Actuator>)newValue);
        return;
      case MyDslPackage.VOC_SPEC__STORAGE_SERVICE:
        getStorageService().clear();
        getStorageService().addAll((Collection<? extends StorageService>)newValue);
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
      case MyDslPackage.VOC_SPEC__STRUCTS:
        getStructs().clear();
        return;
      case MyDslPackage.VOC_SPEC__PERIODIC_SENSORS:
        getPeriodicSensors().clear();
        return;
      case MyDslPackage.VOC_SPEC__EVENT_SENSORS:
        getEventSensors().clear();
        return;
      case MyDslPackage.VOC_SPEC__ACTUATORS:
        getActuators().clear();
        return;
      case MyDslPackage.VOC_SPEC__STORAGE_SERVICE:
        getStorageService().clear();
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
      case MyDslPackage.VOC_SPEC__STRUCTS:
        return structs != null && !structs.isEmpty();
      case MyDslPackage.VOC_SPEC__PERIODIC_SENSORS:
        return periodicSensors != null && !periodicSensors.isEmpty();
      case MyDslPackage.VOC_SPEC__EVENT_SENSORS:
        return eventSensors != null && !eventSensors.isEmpty();
      case MyDslPackage.VOC_SPEC__ACTUATORS:
        return actuators != null && !actuators.isEmpty();
      case MyDslPackage.VOC_SPEC__STORAGE_SERVICE:
        return storageService != null && !storageService.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VocSpecImpl
