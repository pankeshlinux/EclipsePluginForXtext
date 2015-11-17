/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Actuator#getActuatorName <em>Actuator Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Actuator#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends EObject
{
  /**
   * Returns the value of the '<em><b>Actuator Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actuator Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuator Name</em>' containment reference.
   * @see #setActuatorName(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActuator_ActuatorName()
   * @model containment="true"
   * @generated
   */
  EntityName getActuatorName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Actuator#getActuatorName <em>Actuator Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actuator Name</em>' containment reference.
   * @see #getActuatorName()
   * @generated
   */
  void setActuatorName(EntityName value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActuator_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Actuator
