/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Sensors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PeriodicSensors#getSensorName <em>Sensor Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PeriodicSensors#getGenerateInfo <em>Generate Info</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPeriodicSensors()
 * @model
 * @generated
 */
public interface PeriodicSensors extends EObject
{
  /**
   * Returns the value of the '<em><b>Sensor Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor Name</em>' containment reference.
   * @see #setSensorName(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPeriodicSensors_SensorName()
   * @model containment="true"
   * @generated
   */
  EntityName getSensorName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PeriodicSensors#getSensorName <em>Sensor Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor Name</em>' containment reference.
   * @see #getSensorName()
   * @generated
   */
  void setSensorName(EntityName value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPeriodicSensors_GenerateInfo()
   * @model containment="true"
   * @generated
   */
  EList<Generate> getGenerateInfo();

} // PeriodicSensors
