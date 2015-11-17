/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InteractionAction#getActionName <em>Action Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InteractionAction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InteractionAction#getInteractionEntity <em>Interaction Entity</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionAction()
 * @model
 * @generated
 */
public interface InteractionAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Action Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Name</em>' containment reference.
   * @see #setActionName(ActionName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionAction_ActionName()
   * @model containment="true"
   * @generated
   */
  ActionName getActionName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InteractionAction#getActionName <em>Action Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Name</em>' containment reference.
   * @see #getActionName()
   * @generated
   */
  void setActionName(ActionName value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Parameters}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionAction_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameters> getParameters();

  /**
   * Returns the value of the '<em><b>Interaction Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Entity</em>' reference.
   * @see #setInteractionEntity(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionAction_InteractionEntity()
   * @model
   * @generated
   */
  EntityName getInteractionEntity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InteractionAction#getInteractionEntity <em>Interaction Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction Entity</em>' reference.
   * @see #getInteractionEntity()
   * @generated
   */
  void setInteractionEntity(EntityName value);

} // InteractionAction
