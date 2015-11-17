/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consume For In Built</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConsumeForInBuilt#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConsumeForInBuilt#getSensorForConsume <em>Sensor For Consume</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConsumeForInBuilt()
 * @model
 * @generated
 */
public interface ConsumeForInBuilt extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(SourceName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConsumeForInBuilt_Name()
   * @model
   * @generated
   */
  SourceName getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ConsumeForInBuilt#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(SourceName value);

  /**
   * Returns the value of the '<em><b>Sensor For Consume</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor For Consume</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor For Consume</em>' reference.
   * @see #setSensorForConsume(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConsumeForInBuilt_SensorForConsume()
   * @model
   * @generated
   */
  EntityName getSensorForConsume();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ConsumeForInBuilt#getSensorForConsume <em>Sensor For Consume</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor For Consume</em>' reference.
   * @see #getSensorForConsume()
   * @generated
   */
  void setSensorForConsume(EntityName value);

} // ConsumeForInBuilt
