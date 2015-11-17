/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Spec#getVocSpec <em>Voc Spec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Spec#getInteractionSpec <em>Interaction Spec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Spec#getArchSpec <em>Arch Spec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Spec#getNetworkSpec <em>Network Spec</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSpec()
 * @model
 * @generated
 */
public interface Spec extends EObject
{
  /**
   * Returns the value of the '<em><b>Voc Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Voc Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Voc Spec</em>' containment reference.
   * @see #setVocSpec(VocSpec)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSpec_VocSpec()
   * @model containment="true"
   * @generated
   */
  VocSpec getVocSpec();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Spec#getVocSpec <em>Voc Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Voc Spec</em>' containment reference.
   * @see #getVocSpec()
   * @generated
   */
  void setVocSpec(VocSpec value);

  /**
   * Returns the value of the '<em><b>Interaction Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Spec</em>' containment reference.
   * @see #setInteractionSpec(InteractionSpec)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSpec_InteractionSpec()
   * @model containment="true"
   * @generated
   */
  InteractionSpec getInteractionSpec();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Spec#getInteractionSpec <em>Interaction Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction Spec</em>' containment reference.
   * @see #getInteractionSpec()
   * @generated
   */
  void setInteractionSpec(InteractionSpec value);

  /**
   * Returns the value of the '<em><b>Arch Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arch Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arch Spec</em>' containment reference.
   * @see #setArchSpec(ArchSpec)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSpec_ArchSpec()
   * @model containment="true"
   * @generated
   */
  ArchSpec getArchSpec();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Spec#getArchSpec <em>Arch Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arch Spec</em>' containment reference.
   * @see #getArchSpec()
   * @generated
   */
  void setArchSpec(ArchSpec value);

  /**
   * Returns the value of the '<em><b>Network Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Network Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Network Spec</em>' containment reference.
   * @see #setNetworkSpec(DeploymentSpec)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSpec_NetworkSpec()
   * @model containment="true"
   * @generated
   */
  DeploymentSpec getNetworkSpec();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Spec#getNetworkSpec <em>Network Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Network Spec</em>' containment reference.
   * @see #getNetworkSpec()
   * @generated
   */
  void setNetworkSpec(DeploymentSpec value);

} // Spec
