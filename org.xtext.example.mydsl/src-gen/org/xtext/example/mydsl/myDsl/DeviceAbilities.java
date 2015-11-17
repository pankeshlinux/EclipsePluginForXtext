/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Abilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeviceAbilities#getDeviceEntityName <em>Device Entity Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeviceAbilities#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceAbilities()
 * @model
 * @generated
 */
public interface DeviceAbilities extends EObject
{
  /**
   * Returns the value of the '<em><b>Device Entity Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Entity Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Entity Name</em>' reference.
   * @see #setDeviceEntityName(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceAbilities_DeviceEntityName()
   * @model
   * @generated
   */
  EntityName getDeviceEntityName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeviceAbilities#getDeviceEntityName <em>Device Entity Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device Entity Name</em>' reference.
   * @see #getDeviceEntityName()
   * @generated
   */
  void setDeviceEntityName(EntityName value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(DeviceAbilities)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceAbilities_Name()
   * @model containment="true"
   * @generated
   */
  DeviceAbilities getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeviceAbilities#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(DeviceAbilities value);

} // DeviceAbilities
