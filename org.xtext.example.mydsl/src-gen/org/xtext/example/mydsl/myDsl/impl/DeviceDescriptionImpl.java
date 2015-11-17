/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.DeviceDescription;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceDescriptionImpl#getDevicedescriptionText <em>Devicedescription Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDescriptionImpl extends MinimalEObjectImpl.Container implements DeviceDescription
{
  /**
   * The default value of the '{@link #getDevicedescriptionText() <em>Devicedescription Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevicedescriptionText()
   * @generated
   * @ordered
   */
  protected static final String DEVICEDESCRIPTION_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDevicedescriptionText() <em>Devicedescription Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevicedescriptionText()
   * @generated
   * @ordered
   */
  protected String devicedescriptionText = DEVICEDESCRIPTION_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceDescriptionImpl()
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
    return MyDslPackage.Literals.DEVICE_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDevicedescriptionText()
  {
    return devicedescriptionText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDevicedescriptionText(String newDevicedescriptionText)
  {
    String oldDevicedescriptionText = devicedescriptionText;
    devicedescriptionText = newDevicedescriptionText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEVICE_DESCRIPTION__DEVICEDESCRIPTION_TEXT, oldDevicedescriptionText, devicedescriptionText));
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
      case MyDslPackage.DEVICE_DESCRIPTION__DEVICEDESCRIPTION_TEXT:
        return getDevicedescriptionText();
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
      case MyDslPackage.DEVICE_DESCRIPTION__DEVICEDESCRIPTION_TEXT:
        setDevicedescriptionText((String)newValue);
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
      case MyDslPackage.DEVICE_DESCRIPTION__DEVICEDESCRIPTION_TEXT:
        setDevicedescriptionText(DEVICEDESCRIPTION_TEXT_EDEFAULT);
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
      case MyDslPackage.DEVICE_DESCRIPTION__DEVICEDESCRIPTION_TEXT:
        return DEVICEDESCRIPTION_TEXT_EDEFAULT == null ? devicedescriptionText != null : !DEVICEDESCRIPTION_TEXT_EDEFAULT.equals(devicedescriptionText);
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
    result.append(" (devicedescriptionText: ");
    result.append(devicedescriptionText);
    result.append(')');
    return result.toString();
  }

} //DeviceDescriptionImpl
