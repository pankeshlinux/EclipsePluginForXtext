/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Parameters#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Parameters#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Name</em>' containment reference.
   * @see #setParameterName(ParameterName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameters_ParameterName()
   * @model containment="true"
   * @generated
   */
  ParameterName getParameterName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Parameters#getParameterName <em>Parameter Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Name</em>' containment reference.
   * @see #getParameterName()
   * @generated
   */
  void setParameterName(ParameterName value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameters_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Parameters#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Parameters
