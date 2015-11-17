/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionName <em>Interaction Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionCommand <em>Interaction Command</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionRequest <em>Interaction Request</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionNotify <em>Interaction Notify</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionSpec()
 * @model
 * @generated
 */
public interface InteractionSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Interaction Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Name</em>' containment reference.
   * @see #setInteractionName(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionSpec_InteractionName()
   * @model containment="true"
   * @generated
   */
  EntityName getInteractionName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionName <em>Interaction Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction Name</em>' containment reference.
   * @see #getInteractionName()
   * @generated
   */
  void setInteractionName(EntityName value);

  /**
   * Returns the value of the '<em><b>Interaction Command</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Command</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Command</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionSpec_InteractionCommand()
   * @model containment="true"
   * @generated
   */
  EList<Command> getInteractionCommand();

  /**
   * Returns the value of the '<em><b>Interaction Request</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Request}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Request</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Request</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionSpec_InteractionRequest()
   * @model containment="true"
   * @generated
   */
  EList<Request> getInteractionRequest();

  /**
   * Returns the value of the '<em><b>Interaction Notify</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.InteractionAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Notify</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Notify</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInteractionSpec_InteractionNotify()
   * @model containment="true"
   * @generated
   */
  EList<InteractionAction> getInteractionNotify();

} // InteractionSpec
