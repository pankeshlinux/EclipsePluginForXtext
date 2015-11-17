/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccess#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccess#getDataAccessType <em>Data Access Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccess#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccess#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataAccess#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccess()
 * @model
 * @generated
 */
public interface DataAccess extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Name</em>' containment reference.
   * @see #setSourceName(SourceName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccess_SourceName()
   * @model containment="true"
   * @generated
   */
  SourceName getSourceName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccess#getSourceName <em>Source Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Name</em>' containment reference.
   * @see #getSourceName()
   * @generated
   */
  void setSourceName(SourceName value);

  /**
   * Returns the value of the '<em><b>Data Access Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Access Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Access Type</em>' containment reference.
   * @see #setDataAccessType(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccess_DataAccessType()
   * @model containment="true"
   * @generated
   */
  Type getDataAccessType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccess#getDataAccessType <em>Data Access Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Access Type</em>' containment reference.
   * @see #getDataAccessType()
   * @generated
   */
  void setDataAccessType(Type value);

  /**
   * Returns the value of the '<em><b>Data Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Item</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Item</em>' attribute.
   * @see #setDataItem(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccess_DataItem()
   * @model
   * @generated
   */
  String getDataItem();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccess#getDataItem <em>Data Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Item</em>' attribute.
   * @see #getDataItem()
   * @generated
   */
  void setDataItem(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccess_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataAccess#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataAccess_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // DataAccess
