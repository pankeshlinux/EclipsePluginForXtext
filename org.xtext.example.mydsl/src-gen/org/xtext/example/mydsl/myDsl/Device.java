/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Device#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Device#getDeviceLocation <em>Device Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Device#getPlatformType <em>Platform Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Device#getDeviceAbilities <em>Device Abilities</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Device#getDeviceProtocol <em>Device Protocol</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Device#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Device#getDeviceDescription <em>Device Description</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject
{
  /**
   * Returns the value of the '<em><b>Device Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Name</em>' attribute.
   * @see #setDeviceName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDevice_DeviceName()
   * @model
   * @generated
   */
  String getDeviceName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Device#getDeviceName <em>Device Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device Name</em>' attribute.
   * @see #getDeviceName()
   * @generated
   */
  void setDeviceName(String value);

  /**
   * Returns the value of the '<em><b>Device Location</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeviceLocation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Location</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Location</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDevice_DeviceLocation()
   * @model containment="true"
   * @generated
   */
  EList<DeviceLocation> getDeviceLocation();

  /**
   * Returns the value of the '<em><b>Platform Type</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.PlatformType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Platform Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platform Type</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDevice_PlatformType()
   * @model containment="true"
   * @generated
   */
  EList<PlatformType> getPlatformType();

  /**
   * Returns the value of the '<em><b>Device Abilities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeviceAbilities}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Abilities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Abilities</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDevice_DeviceAbilities()
   * @model containment="true"
   * @generated
   */
  EList<DeviceAbilities> getDeviceAbilities();

  /**
   * Returns the value of the '<em><b>Device Protocol</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeviceProtocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Protocol</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Protocol</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDevice_DeviceProtocol()
   * @model containment="true"
   * @generated
   */
  EList<DeviceProtocol> getDeviceProtocol();

  /**
   * Returns the value of the '<em><b>Database Name</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DatabaseName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database Name</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDevice_DatabaseName()
   * @model containment="true"
   * @generated
   */
  EList<DatabaseName> getDatabaseName();

  /**
   * Returns the value of the '<em><b>Device Description</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeviceDescription}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Description</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Description</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDevice_DeviceDescription()
   * @model containment="true"
   * @generated
   */
  EList<DeviceDescription> getDeviceDescription();

} // Device
