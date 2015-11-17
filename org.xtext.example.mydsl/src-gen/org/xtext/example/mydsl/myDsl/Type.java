/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Primitive Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Data Type</em>' containment reference.
   * @see #setPrimitiveDataType(PrimitiveDataType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_PrimitiveDataType()
   * @model containment="true"
   * @generated
   */
  PrimitiveDataType getPrimitiveDataType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type#getPrimitiveDataType <em>Primitive Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Data Type</em>' containment reference.
   * @see #getPrimitiveDataType()
   * @generated
   */
  void setPrimitiveDataType(PrimitiveDataType value);

} // Type
