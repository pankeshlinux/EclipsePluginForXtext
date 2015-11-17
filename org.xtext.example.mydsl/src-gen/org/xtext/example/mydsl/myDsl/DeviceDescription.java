/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeviceDescription#getDevicedescriptionText <em>Devicedescription Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceDescription()
 * @model
 * @generated
 */
public interface DeviceDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Devicedescription Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Devicedescription Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devicedescription Text</em>' attribute.
   * @see #setDevicedescriptionText(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceDescription_DevicedescriptionText()
   * @model
   * @generated
   */
  String getDevicedescriptionText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeviceDescription#getDevicedescriptionText <em>Devicedescription Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Devicedescription Text</em>' attribute.
   * @see #getDevicedescriptionText()
   * @generated
   */
  void setDevicedescriptionText(String value);

} // DeviceDescription
