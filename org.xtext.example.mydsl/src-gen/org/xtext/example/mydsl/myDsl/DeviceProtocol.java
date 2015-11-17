/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeviceProtocol#getProtocolName <em>Protocol Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceProtocol()
 * @model
 * @generated
 */
public interface DeviceProtocol extends EObject
{
  /**
   * Returns the value of the '<em><b>Protocol Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol Name</em>' attribute.
   * @see #setProtocolName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceProtocol_ProtocolName()
   * @model
   * @generated
   */
  String getProtocolName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeviceProtocol#getProtocolName <em>Protocol Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol Name</em>' attribute.
   * @see #getProtocolName()
   * @generated
   */
  void setProtocolName(String value);

} // DeviceProtocol
