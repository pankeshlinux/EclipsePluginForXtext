/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Consume#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Consume#getFromName <em>From Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConsume()
 * @model
 * @generated
 */
public interface Consume extends EObject
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
   * @see #setName(SourceName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConsume_Name()
   * @model
   * @generated
   */
  SourceName getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Consume#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(SourceName value);

  /**
   * Returns the value of the '<em><b>From Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Name</em>' reference.
   * @see #setFromName(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConsume_FromName()
   * @model
   * @generated
   */
  EntityName getFromName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Consume#getFromName <em>From Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Name</em>' reference.
   * @see #getFromName()
   * @generated
   */
  void setFromName(EntityName value);

} // Consume
