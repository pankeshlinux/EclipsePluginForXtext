/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Region#getRegionLabel <em>Region Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Region#getRegionType <em>Region Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject
{
  /**
   * Returns the value of the '<em><b>Region Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Region Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Region Label</em>' containment reference.
   * @see #setRegionLabel(RegionLabel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRegion_RegionLabel()
   * @model containment="true"
   * @generated
   */
  RegionLabel getRegionLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Region#getRegionLabel <em>Region Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Region Label</em>' containment reference.
   * @see #getRegionLabel()
   * @generated
   */
  void setRegionLabel(RegionLabel value);

  /**
   * Returns the value of the '<em><b>Region Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Region Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Region Type</em>' containment reference.
   * @see #setRegionType(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRegion_RegionType()
   * @model containment="true"
   * @generated
   */
  Type getRegionType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Region#getRegionType <em>Region Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Region Type</em>' containment reference.
   * @see #getRegionType()
   * @generated
   */
  void setRegionType(Type value);

} // Region
