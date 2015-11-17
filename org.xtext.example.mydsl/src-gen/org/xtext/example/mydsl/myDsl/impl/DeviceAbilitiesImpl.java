/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.DeviceAbilities;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Abilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceAbilitiesImpl#getDeviceEntityName <em>Device Entity Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceAbilitiesImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceAbilitiesImpl extends MinimalEObjectImpl.Container implements DeviceAbilities
{
  /**
   * The cached value of the '{@link #getDeviceEntityName() <em>Device Entity Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceEntityName()
   * @generated
   * @ordered
   */
  protected EntityName deviceEntityName;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected DeviceAbilities name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceAbilitiesImpl()
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
    return MyDslPackage.Literals.DEVICE_ABILITIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getDeviceEntityName()
  {
    if (deviceEntityName != null && deviceEntityName.eIsProxy())
    {
      InternalEObject oldDeviceEntityName = (InternalEObject)deviceEntityName;
      deviceEntityName = (EntityName)eResolveProxy(oldDeviceEntityName);
      if (deviceEntityName != oldDeviceEntityName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DEVICE_ABILITIES__DEVICE_ENTITY_NAME, oldDeviceEntityName, deviceEntityName));
      }
    }
    return deviceEntityName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName basicGetDeviceEntityName()
  {
    return deviceEntityName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeviceEntityName(EntityName newDeviceEntityName)
  {
    EntityName oldDeviceEntityName = deviceEntityName;
    deviceEntityName = newDeviceEntityName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEVICE_ABILITIES__DEVICE_ENTITY_NAME, oldDeviceEntityName, deviceEntityName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceAbilities getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(DeviceAbilities newName, NotificationChain msgs)
  {
    DeviceAbilities oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DEVICE_ABILITIES__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(DeviceAbilities newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEVICE_ABILITIES__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEVICE_ABILITIES__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEVICE_ABILITIES__NAME, newName, newName));
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
      case MyDslPackage.DEVICE_ABILITIES__NAME:
        return basicSetName(null, msgs);
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
      case MyDslPackage.DEVICE_ABILITIES__DEVICE_ENTITY_NAME:
        if (resolve) return getDeviceEntityName();
        return basicGetDeviceEntityName();
      case MyDslPackage.DEVICE_ABILITIES__NAME:
        return getName();
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
      case MyDslPackage.DEVICE_ABILITIES__DEVICE_ENTITY_NAME:
        setDeviceEntityName((EntityName)newValue);
        return;
      case MyDslPackage.DEVICE_ABILITIES__NAME:
        setName((DeviceAbilities)newValue);
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
      case MyDslPackage.DEVICE_ABILITIES__DEVICE_ENTITY_NAME:
        setDeviceEntityName((EntityName)null);
        return;
      case MyDslPackage.DEVICE_ABILITIES__NAME:
        setName((DeviceAbilities)null);
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
      case MyDslPackage.DEVICE_ABILITIES__DEVICE_ENTITY_NAME:
        return deviceEntityName != null;
      case MyDslPackage.DEVICE_ABILITIES__NAME:
        return name != null;
    }
    return super.eIsSet(featureID);
  }

} //DeviceAbilitiesImpl
