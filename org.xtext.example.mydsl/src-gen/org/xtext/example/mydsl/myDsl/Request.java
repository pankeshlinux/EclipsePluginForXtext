/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Request#getRequestname <em>Requestname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Request#getStorageForRequest <em>Storage For Request</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject
{
  /**
   * Returns the value of the '<em><b>Requestname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requestname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requestname</em>' reference.
   * @see #setRequestname(SourceName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRequest_Requestname()
   * @model
   * @generated
   */
  SourceName getRequestname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Request#getRequestname <em>Requestname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requestname</em>' reference.
   * @see #getRequestname()
   * @generated
   */
  void setRequestname(SourceName value);

  /**
   * Returns the value of the '<em><b>Storage For Request</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage For Request</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage For Request</em>' reference.
   * @see #setStorageForRequest(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRequest_StorageForRequest()
   * @model
   * @generated
   */
  EntityName getStorageForRequest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Request#getStorageForRequest <em>Storage For Request</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storage For Request</em>' reference.
   * @see #getStorageForRequest()
   * @generated
   */
  void setStorageForRequest(EntityName value);

} // Request
