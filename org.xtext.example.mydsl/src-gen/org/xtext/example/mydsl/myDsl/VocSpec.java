/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voc Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VocSpec#getStructs <em>Structs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VocSpec#getPeriodicSensors <em>Periodic Sensors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VocSpec#getEventSensors <em>Event Sensors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VocSpec#getActuators <em>Actuators</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VocSpec#getStorageService <em>Storage Service</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVocSpec()
 * @model
 * @generated
 */
public interface VocSpec extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVocSpec_Structs()
   * @model containment="true"
   * @generated
   */
  EList<Struct> getStructs();

  /**
   * Returns the value of the '<em><b>Periodic Sensors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.PeriodicSensors}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Periodic Sensors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Periodic Sensors</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVocSpec_PeriodicSensors()
   * @model containment="true"
   * @generated
   */
  EList<PeriodicSensors> getPeriodicSensors();

  /**
   * Returns the value of the '<em><b>Event Sensors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.EventSensors}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Sensors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Sensors</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVocSpec_EventSensors()
   * @model containment="true"
   * @generated
   */
  EList<EventSensors> getEventSensors();

  /**
   * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Actuator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actuators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuators</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVocSpec_Actuators()
   * @model containment="true"
   * @generated
   */
  EList<Actuator> getActuators();

  /**
   * Returns the value of the '<em><b>Storage Service</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.StorageService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage Service</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVocSpec_StorageService()
   * @model containment="true"
   * @generated
   */
  EList<StorageService> getStorageService();

} // VocSpec
