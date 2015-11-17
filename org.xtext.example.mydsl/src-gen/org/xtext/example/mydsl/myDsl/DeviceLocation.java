/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeviceLocation#getRegionLabel <em>Region Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeviceLocation#getRegionValue <em>Region Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceLocation()
 * @model
 * @generated
 */
public interface DeviceLocation extends EObject
{
  /**
   * Returns the value of the '<em><b>Region Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Region Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Region Label</em>' attribute.
   * @see #setRegionLabel(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceLocation_RegionLabel()
   * @model
   * @generated
   */
  String getRegionLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeviceLocation#getRegionLabel <em>Region Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Region Label</em>' attribute.
   * @see #getRegionLabel()
   * @generated
   */
  void setRegionLabel(String value);

  /**
   * Returns the value of the '<em><b>Region Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Region Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Region Value</em>' attribute.
   * @see #setRegionValue(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeviceLocation_RegionValue()
   * @model
   * @generated
   */
  int getRegionValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DeviceLocation#getRegionValue <em>Region Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Region Value</em>' attribute.
   * @see #getRegionValue()
   * @generated
   */
  void setRegionValue(int value);

} // DeviceLocation
