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

import org.xtext.example.mydsl.myDsl.DatabaseName;
import org.xtext.example.mydsl.myDsl.Device;
import org.xtext.example.mydsl.myDsl.DeviceAbilities;
import org.xtext.example.mydsl.myDsl.DeviceDescription;
import org.xtext.example.mydsl.myDsl.DeviceLocation;
import org.xtext.example.mydsl.myDsl.DeviceProtocol;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PlatformType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl#getDeviceLocation <em>Device Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl#getPlatformType <em>Platform Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl#getDeviceAbilities <em>Device Abilities</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl#getDeviceProtocol <em>Device Protocol</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl#getDeviceDescription <em>Device Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device
{
  /**
   * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceName()
   * @generated
   * @ordered
   */
  protected static final String DEVICE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceName()
   * @generated
   * @ordered
   */
  protected String deviceName = DEVICE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeviceLocation() <em>Device Location</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceLocation()
   * @generated
   * @ordered
   */
  protected EList<DeviceLocation> deviceLocation;

  /**
   * The cached value of the '{@link #getPlatformType() <em>Platform Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlatformType()
   * @generated
   * @ordered
   */
  protected EList<PlatformType> platformType;

  /**
   * The cached value of the '{@link #getDeviceAbilities() <em>Device Abilities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceAbilities()
   * @generated
   * @ordered
   */
  protected EList<DeviceAbilities> deviceAbilities;

  /**
   * The cached value of the '{@link #getDeviceProtocol() <em>Device Protocol</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceProtocol()
   * @generated
   * @ordered
   */
  protected EList<DeviceProtocol> deviceProtocol;

  /**
   * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseName()
   * @generated
   * @ordered
   */
  protected EList<DatabaseName> databaseName;

  /**
   * The cached value of the '{@link #getDeviceDescription() <em>Device Description</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceDescription()
   * @generated
   * @ordered
   */
  protected EList<DeviceDescription> deviceDescription;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceImpl()
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
    return MyDslPackage.Literals.DEVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeviceName()
  {
    return deviceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeviceName(String newDeviceName)
  {
    String oldDeviceName = deviceName;
    deviceName = newDeviceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEVICE__DEVICE_NAME, oldDeviceName, deviceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceLocation> getDeviceLocation()
  {
    if (deviceLocation == null)
    {
      deviceLocation = new EObjectContainmentEList<DeviceLocation>(DeviceLocation.class, this, MyDslPackage.DEVICE__DEVICE_LOCATION);
    }
    return deviceLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PlatformType> getPlatformType()
  {
    if (platformType == null)
    {
      platformType = new EObjectContainmentEList<PlatformType>(PlatformType.class, this, MyDslPackage.DEVICE__PLATFORM_TYPE);
    }
    return platformType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceAbilities> getDeviceAbilities()
  {
    if (deviceAbilities == null)
    {
      deviceAbilities = new EObjectContainmentEList<DeviceAbilities>(DeviceAbilities.class, this, MyDslPackage.DEVICE__DEVICE_ABILITIES);
    }
    return deviceAbilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceProtocol> getDeviceProtocol()
  {
    if (deviceProtocol == null)
    {
      deviceProtocol = new EObjectContainmentEList<DeviceProtocol>(DeviceProtocol.class, this, MyDslPackage.DEVICE__DEVICE_PROTOCOL);
    }
    return deviceProtocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DatabaseName> getDatabaseName()
  {
    if (databaseName == null)
    {
      databaseName = new EObjectContainmentEList<DatabaseName>(DatabaseName.class, this, MyDslPackage.DEVICE__DATABASE_NAME);
    }
    return databaseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceDescription> getDeviceDescription()
  {
    if (deviceDescription == null)
    {
      deviceDescription = new EObjectContainmentEList<DeviceDescription>(DeviceDescription.class, this, MyDslPackage.DEVICE__DEVICE_DESCRIPTION);
    }
    return deviceDescription;
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
      case MyDslPackage.DEVICE__DEVICE_LOCATION:
        return ((InternalEList<?>)getDeviceLocation()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DEVICE__PLATFORM_TYPE:
        return ((InternalEList<?>)getPlatformType()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DEVICE__DEVICE_ABILITIES:
        return ((InternalEList<?>)getDeviceAbilities()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DEVICE__DEVICE_PROTOCOL:
        return ((InternalEList<?>)getDeviceProtocol()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DEVICE__DATABASE_NAME:
        return ((InternalEList<?>)getDatabaseName()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DEVICE__DEVICE_DESCRIPTION:
        return ((InternalEList<?>)getDeviceDescription()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DEVICE__DEVICE_NAME:
        return getDeviceName();
      case MyDslPackage.DEVICE__DEVICE_LOCATION:
        return getDeviceLocation();
      case MyDslPackage.DEVICE__PLATFORM_TYPE:
        return getPlatformType();
      case MyDslPackage.DEVICE__DEVICE_ABILITIES:
        return getDeviceAbilities();
      case MyDslPackage.DEVICE__DEVICE_PROTOCOL:
        return getDeviceProtocol();
      case MyDslPackage.DEVICE__DATABASE_NAME:
        return getDatabaseName();
      case MyDslPackage.DEVICE__DEVICE_DESCRIPTION:
        return getDeviceDescription();
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
      case MyDslPackage.DEVICE__DEVICE_NAME:
        setDeviceName((String)newValue);
        return;
      case MyDslPackage.DEVICE__DEVICE_LOCATION:
        getDeviceLocation().clear();
        getDeviceLocation().addAll((Collection<? extends DeviceLocation>)newValue);
        return;
      case MyDslPackage.DEVICE__PLATFORM_TYPE:
        getPlatformType().clear();
        getPlatformType().addAll((Collection<? extends PlatformType>)newValue);
        return;
      case MyDslPackage.DEVICE__DEVICE_ABILITIES:
        getDeviceAbilities().clear();
        getDeviceAbilities().addAll((Collection<? extends DeviceAbilities>)newValue);
        return;
      case MyDslPackage.DEVICE__DEVICE_PROTOCOL:
        getDeviceProtocol().clear();
        getDeviceProtocol().addAll((Collection<? extends DeviceProtocol>)newValue);
        return;
      case MyDslPackage.DEVICE__DATABASE_NAME:
        getDatabaseName().clear();
        getDatabaseName().addAll((Collection<? extends DatabaseName>)newValue);
        return;
      case MyDslPackage.DEVICE__DEVICE_DESCRIPTION:
        getDeviceDescription().clear();
        getDeviceDescription().addAll((Collection<? extends DeviceDescription>)newValue);
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
      case MyDslPackage.DEVICE__DEVICE_NAME:
        setDeviceName(DEVICE_NAME_EDEFAULT);
        return;
      case MyDslPackage.DEVICE__DEVICE_LOCATION:
        getDeviceLocation().clear();
        return;
      case MyDslPackage.DEVICE__PLATFORM_TYPE:
        getPlatformType().clear();
        return;
      case MyDslPackage.DEVICE__DEVICE_ABILITIES:
        getDeviceAbilities().clear();
        return;
      case MyDslPackage.DEVICE__DEVICE_PROTOCOL:
        getDeviceProtocol().clear();
        return;
      case MyDslPackage.DEVICE__DATABASE_NAME:
        getDatabaseName().clear();
        return;
      case MyDslPackage.DEVICE__DEVICE_DESCRIPTION:
        getDeviceDescription().clear();
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
      case MyDslPackage.DEVICE__DEVICE_NAME:
        return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
      case MyDslPackage.DEVICE__DEVICE_LOCATION:
        return deviceLocation != null && !deviceLocation.isEmpty();
      case MyDslPackage.DEVICE__PLATFORM_TYPE:
        return platformType != null && !platformType.isEmpty();
      case MyDslPackage.DEVICE__DEVICE_ABILITIES:
        return deviceAbilities != null && !deviceAbilities.isEmpty();
      case MyDslPackage.DEVICE__DEVICE_PROTOCOL:
        return deviceProtocol != null && !deviceProtocol.isEmpty();
      case MyDslPackage.DEVICE__DATABASE_NAME:
        return databaseName != null && !databaseName.isEmpty();
      case MyDslPackage.DEVICE__DEVICE_DESCRIPTION:
        return deviceDescription != null && !deviceDescription.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (deviceName: ");
    result.append(deviceName);
    result.append(')');
    return result.toString();
  }

} //DeviceImpl
