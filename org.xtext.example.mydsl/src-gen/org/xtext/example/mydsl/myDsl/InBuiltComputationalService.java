/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Built Computational Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getInBuiltComputationalServiceName <em>In Built Computational Service Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getGenerateInfo <em>Generate Info</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInBuiltComputationalService()
 * @model
 * @generated
 */
public interface InBuiltComputationalService extends EObject
{
  /**
   * Returns the value of the '<em><b>In Built Computational Service Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Built Computational Service Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Built Computational Service Name</em>' containment reference.
   * @see #setInBuiltComputationalServiceName(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInBuiltComputationalService_InBuiltComputationalServiceName()
   * @model containment="true"
   * @generated
   */
  EntityName getInBuiltComputationalServiceName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getInBuiltComputationalServiceName <em>In Built Computational Service Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Built Computational Service Name</em>' containment reference.
   * @see #getInBuiltComputationalServiceName()
   * @generated
   */
  void setInBuiltComputationalServiceName(EntityName value);

  /**
   * Returns the value of the '<em><b>Consumes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ConsumeForInBuilt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consumes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consumes</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInBuiltComputationalService_Consumes()
   * @model containment="true"
   * @generated
   */
  EList<ConsumeForInBuilt> getConsumes();

  /**
   * Returns the value of the '<em><b>Operation Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Name</em>' containment reference.
   * @see #setOperationName(OperationName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInBuiltComputationalService_OperationName()
   * @model containment="true"
   * @generated
   */
  OperationName getOperationName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getOperationName <em>Operation Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Name</em>' containment reference.
   * @see #getOperationName()
   * @generated
   */
  void setOperationName(OperationName value);

  /**
   * Returns the value of the '<em><b>Operation Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Parameter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Parameter</em>' attribute.
   * @see #setOperationParameter(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInBuiltComputationalService_OperationParameter()
   * @model
   * @generated
   */
  int getOperationParameter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getOperationParameter <em>Operation Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Parameter</em>' attribute.
   * @see #getOperationParameter()
   * @generated
   */
  void setOperationParameter(int value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInBuiltComputationalService_GenerateInfo()
   * @model containment="true"
   * @generated
   */
  EList<Generate> getGenerateInfo();

} // InBuiltComputationalService
