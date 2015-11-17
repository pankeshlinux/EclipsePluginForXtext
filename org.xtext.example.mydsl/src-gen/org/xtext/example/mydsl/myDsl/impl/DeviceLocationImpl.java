/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.DeviceLocation;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceLocationImpl#getRegionLabel <em>Region Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeviceLocationImpl#getRegionValue <em>Region Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceLocationImpl extends MinimalEObjectImpl.Container implements DeviceLocation
{
  /**
   * The default value of the '{@link #getRegionLabel() <em>Region Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegionLabel()
   * @generated
   * @ordered
   */
  protected static final String REGION_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRegionLabel() <em>Region Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegionLabel()
   * @generated
   * @ordered
   */
  protected String regionLabel = REGION_LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getRegionValue() <em>Region Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegionValue()
   * @generated
   * @ordered
   */
  protected static final int REGION_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRegionValue() <em>Region Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegionValue()
   * @generated
   * @ordered
   */
  protected int regionValue = REGION_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceLocationImpl()
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
    return MyDslPackage.Literals.DEVICE_LOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegionLabel()
  {
    return regionLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegionLabel(String newRegionLabel)
  {
    String oldRegionLabel = regionLabel;
    regionLabel = newRegionLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEVICE_LOCATION__REGION_LABEL, oldRegionLabel, regionLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRegionValue()
  {
    return regionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegionValue(int newRegionValue)
  {
    int oldRegionValue = regionValue;
    regionValue = newRegionValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEVICE_LOCATION__REGION_VALUE, oldRegionValue, regionValue));
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
      case MyDslPackage.DEVICE_LOCATION__REGION_LABEL:
        return getRegionLabel();
      case MyDslPackage.DEVICE_LOCATION__REGION_VALUE:
        return getRegionValue();
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
      case MyDslPackage.DEVICE_LOCATION__REGION_LABEL:
        setRegionLabel((String)newValue);
        return;
      case MyDslPackage.DEVICE_LOCATION__REGION_VALUE:
        setRegionValue((Integer)newValue);
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
      case MyDslPackage.DEVICE_LOCATION__REGION_LABEL:
        setRegionLabel(REGION_LABEL_EDEFAULT);
        return;
      case MyDslPackage.DEVICE_LOCATION__REGION_VALUE:
        setRegionValue(REGION_VALUE_EDEFAULT);
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
      case MyDslPackage.DEVICE_LOCATION__REGION_LABEL:
        return REGION_LABEL_EDEFAULT == null ? regionLabel != null : !REGION_LABEL_EDEFAULT.equals(regionLabel);
      case MyDslPackage.DEVICE_LOCATION__REGION_VALUE:
        return regionValue != REGION_VALUE_EDEFAULT;
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
    result.append(" (regionLabel: ");
    result.append(regionLabel);
    result.append(", regionValue: ");
    result.append(regionValue);
    result.append(')');
    return result.toString();
  }

} //DeviceLocationImpl
