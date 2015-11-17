/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CommandParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CommandParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandParameter()
 * @model
 * @generated
 */
public interface CommandParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(ParameterName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandParameter_Name()
   * @model
   * @generated
   */
  ParameterName getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CommandParameter#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(ParameterName value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(CommandParameter)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandParameter_Parameter()
   * @model containment="true"
   * @generated
   */
  CommandParameter getParameter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CommandParameter#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(CommandParameter value);

} // CommandParameter
