/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DatabaseName#getInstalledDatabase <em>Installed Database</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDatabaseName()
 * @model
 * @generated
 */
public interface DatabaseName extends EObject
{
  /**
   * Returns the value of the '<em><b>Installed Database</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Installed Database</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Installed Database</em>' attribute.
   * @see #setInstalledDatabase(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDatabaseName_InstalledDatabase()
   * @model
   * @generated
   */
  String getInstalledDatabase();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DatabaseName#getInstalledDatabase <em>Installed Database</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Installed Database</em>' attribute.
   * @see #getInstalledDatabase()
   * @generated
   */
  void setInstalledDatabase(String value);

} // DatabaseName
