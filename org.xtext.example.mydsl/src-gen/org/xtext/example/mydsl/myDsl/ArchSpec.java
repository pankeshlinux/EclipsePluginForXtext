/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arch Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ArchSpec#getStructs <em>Structs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ArchSpec#getInbuiltComputationalService <em>Inbuilt Computational Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ArchSpec#getCustomComputationalService <em>Custom Computational Service</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArchSpec()
 * @model
 * @generated
 */
public interface ArchSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Structs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Struct}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structs</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArchSpec_Structs()
   * @model containment="true"
   * @generated
   */
  EList<Struct> getStructs();

  /**
   * Returns the value of the '<em><b>Inbuilt Computational Service</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inbuilt Computational Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inbuilt Computational Service</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArchSpec_InbuiltComputationalService()
   * @model containment="true"
   * @generated
   */
  EList<InBuiltComputationalService> getInbuiltComputationalService();

  /**
   * Returns the value of the '<em><b>Custom Computational Service</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.customComputationalService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Computational Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Computational Service</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArchSpec_CustomComputationalService()
   * @model containment="true"
   * @generated
   */
  EList<customComputationalService> getCustomComputationalService();

} // ArchSpec
