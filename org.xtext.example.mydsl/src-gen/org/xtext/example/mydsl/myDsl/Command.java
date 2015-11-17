/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Command#getCommandName <em>Command Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Command#getCommandparameter <em>Commandparameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Command#getActuatorForCommand <em>Actuator For Command</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Command Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command Name</em>' reference.
   * @see #setCommandName(ActionName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommand_CommandName()
   * @model
   * @generated
   */
  ActionName getCommandName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Command#getCommandName <em>Command Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command Name</em>' reference.
   * @see #getCommandName()
   * @generated
   */
  void setCommandName(ActionName value);

  /**
   * Returns the value of the '<em><b>Commandparameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commandparameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commandparameter</em>' containment reference.
   * @see #setCommandparameter(CommandParameter)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommand_Commandparameter()
   * @model containment="true"
   * @generated
   */
  CommandParameter getCommandparameter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Command#getCommandparameter <em>Commandparameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commandparameter</em>' containment reference.
   * @see #getCommandparameter()
   * @generated
   */
  void setCommandparameter(CommandParameter value);

  /**
   * Returns the value of the '<em><b>Actuator For Command</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actuator For Command</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuator For Command</em>' reference.
   * @see #setActuatorForCommand(EntityName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommand_ActuatorForCommand()
   * @model
   * @generated
   */
  EntityName getActuatorForCommand();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Command#getActuatorForCommand <em>Actuator For Command</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actuator For Command</em>' reference.
   * @see #getActuatorForCommand()
   * @generated
   */
  void setActuatorForCommand(EntityName value);

} // Command
