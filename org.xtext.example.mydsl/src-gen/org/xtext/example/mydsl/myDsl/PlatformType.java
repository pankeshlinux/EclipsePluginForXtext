/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PlatformType#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlatformType()
 * @model
 * @generated
 */
public interface PlatformType extends EObject
{
  /**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see #setDeviceType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlatformType_DeviceType()
   * @model
   * @generated
   */
  String getDeviceType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PlatformType#getDeviceType <em>Device Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device Type</em>' attribute.
   * @see #getDeviceType()
   * @generated
   */
  void setDeviceType(String value);

} // PlatformType
