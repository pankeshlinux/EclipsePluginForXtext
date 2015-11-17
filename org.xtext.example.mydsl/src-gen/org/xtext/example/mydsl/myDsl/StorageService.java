/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.StorageService#getStorageServiceName <em>Storage Service Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.StorageService#getDataAccesses <em>Data Accesses</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStorageService()
 * @model
 * @generated
 */
public interface StorageService extends EObject
{
  /**
   * Returns the value of the '<em><b>Storage Service Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage Service Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage Service Name</em>' containment reference.
   * @see #setStorageServiceName(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStorageService_StorageServiceName()
   * @model containment="true"
   * @generated
   */
  EntityName getStorageServiceName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.StorageService#getStorageServiceName <em>Storage Service Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storage Service Name</em>' containment reference.
   * @see #getStorageServiceName()
   * @generated
   */
  void setStorageServiceName(EntityName value);

  /**
   * Returns the value of the '<em><b>Data Accesses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DataAccess}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Accesses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Accesses</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStorageService_DataAccesses()
   * @model containment="true"
   * @generated
   */
  EList<DataAccess> getDataAccesses();

} // StorageService
