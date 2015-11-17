/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>custom Computational Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.customComputationalService#getCustomComputationalServiceName <em>Custom Computational Service Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.customComputationalService#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.customComputationalService#getRequests <em>Requests</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.customComputationalService#getGenerateInfo <em>Generate Info</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.customComputationalService#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcustomComputationalService()
 * @model
 * @generated
 */
public interface customComputationalService extends EObject
{
  /**
   * Returns the value of the '<em><b>Custom Computational Service Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Computational Service Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Computational Service Name</em>' containment reference.
   * @see #setCustomComputationalServiceName(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcustomComputationalService_CustomComputationalServiceName()
   * @model containment="true"
   * @generated
   */
  EntityName getCustomComputationalServiceName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.customComputationalService#getCustomComputationalServiceName <em>Custom Computational Service Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Computational Service Name</em>' containment reference.
   * @see #getCustomComputationalServiceName()
   * @generated
   */
  void setCustomComputationalServiceName(EntityName value);

  /**
   * Returns the value of the '<em><b>Consumes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Consume}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consumes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consumes</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcustomComputationalService_Consumes()
   * @model containment="true"
   * @generated
   */
  EList<Consume> getConsumes();

  /**
   * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Request}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requests</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requests</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcustomComputationalService_Requests()
   * @model containment="true"
   * @generated
   */
  EList<Request> getRequests();

  /**
   * Returns the value of the '<em><b>Generate Info</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Generate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Info</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate Info</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcustomComputationalService_GenerateInfo()
   * @model containment="true"
   * @generated
   */
  EList<Generate> getGenerateInfo();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getcustomComputationalService_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // customComputationalService
