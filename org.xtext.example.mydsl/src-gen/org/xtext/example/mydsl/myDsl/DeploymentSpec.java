/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeploymentSpec#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploymentSpec()
 * @model
 * @generated
 */
public interface DeploymentSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Device}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploymentSpec_Devices()
   * @model containment="true"
   * @generated
   */
  EList<Device> getDevices();

} // DeploymentSpec
