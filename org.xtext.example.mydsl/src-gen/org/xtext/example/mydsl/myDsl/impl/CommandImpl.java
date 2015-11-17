/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ActionName;
import org.xtext.example.mydsl.myDsl.Command;
import org.xtext.example.mydsl.myDsl.CommandParameter;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandImpl#getCommandName <em>Command Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandImpl#getCommandparameter <em>Commandparameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandImpl#getActuatorForCommand <em>Actuator For Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
{
  /**
   * The cached value of the '{@link #getCommandName() <em>Command Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandName()
   * @generated
   * @ordered
   */
  protected ActionName commandName;

  /**
   * The cached value of the '{@link #getCommandparameter() <em>Commandparameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandparameter()
   * @generated
   * @ordered
   */
  protected CommandParameter commandparameter;

  /**
   * The cached value of the '{@link #getActuatorForCommand() <em>Actuator For Command</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuatorForCommand()
   * @generated
   * @ordered
   */
  protected EntityName actuatorForCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionName getCommandName()
  {
    if (commandName != null && commandName.eIsProxy())
    {
      InternalEObject oldCommandName = (InternalEObject)commandName;
      commandName = (ActionName)eResolveProxy(oldCommandName);
      if (commandName != oldCommandName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMMAND__COMMAND_NAME, oldCommandName, commandName));
      }
    }
    return commandName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionName basicGetCommandName()
  {
    return commandName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommandName(ActionName newCommandName)
  {
    ActionName oldCommandName = commandName;
    commandName = newCommandName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__COMMAND_NAME, oldCommandName, commandName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandParameter getCommandparameter()
  {
    return commandparameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommandparameter(CommandParameter newCommandparameter, NotificationChain msgs)
  {
    CommandParameter oldCommandparameter = commandparameter;
    commandparameter = newCommandparameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__COMMANDPARAMETER, oldCommandparameter, newCommandparameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommandparameter(CommandParameter newCommandparameter)
  {
    if (newCommandparameter != commandparameter)
    {
      NotificationChain msgs = null;
      if (commandparameter != null)
        msgs = ((InternalEObject)commandparameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMAND__COMMANDPARAMETER, null, msgs);
      if (newCommandparameter != null)
        msgs = ((InternalEObject)newCommandparameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMAND__COMMANDPARAMETER, null, msgs);
      msgs = basicSetCommandparameter(newCommandparameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__COMMANDPARAMETER, newCommandparameter, newCommandparameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getActuatorForCommand()
  {
    if (actuatorForCommand != null && actuatorForCommand.eIsProxy())
    {
      InternalEObject oldActuatorForCommand = (InternalEObject)actuatorForCommand;
      actuatorForCommand = (EntityName)eResolveProxy(oldActuatorForCommand);
      if (actuatorForCommand != oldActuatorForCommand)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMMAND__ACTUATOR_FOR_COMMAND, oldActuatorForCommand, actuatorForCommand));
      }
    }
    return actuatorForCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName basicGetActuatorForCommand()
  {
    return actuatorForCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActuatorForCommand(EntityName newActuatorForCommand)
  {
    EntityName oldActuatorForCommand = actuatorForCommand;
    actuatorForCommand = newActuatorForCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMAND__ACTUATOR_FOR_COMMAND, oldActuatorForCommand, actuatorForCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND__COMMANDPARAMETER:
        return basicSetCommandparameter(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND__COMMAND_NAME:
        if (resolve) return getCommandName();
        return basicGetCommandName();
      case MyDslPackage.COMMAND__COMMANDPARAMETER:
        return getCommandparameter();
      case MyDslPackage.COMMAND__ACTUATOR_FOR_COMMAND:
        if (resolve) return getActuatorForCommand();
        return basicGetActuatorForCommand();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND__COMMAND_NAME:
        setCommandName((ActionName)newValue);
        return;
      case MyDslPackage.COMMAND__COMMANDPARAMETER:
        setCommandparameter((CommandParameter)newValue);
        return;
      case MyDslPackage.COMMAND__ACTUATOR_FOR_COMMAND:
        setActuatorForCommand((EntityName)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND__COMMAND_NAME:
        setCommandName((ActionName)null);
        return;
      case MyDslPackage.COMMAND__COMMANDPARAMETER:
        setCommandparameter((CommandParameter)null);
        return;
      case MyDslPackage.COMMAND__ACTUATOR_FOR_COMMAND:
        setActuatorForCommand((EntityName)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND__COMMAND_NAME:
        return commandName != null;
      case MyDslPackage.COMMAND__COMMANDPARAMETER:
        return commandparameter != null;
      case MyDslPackage.COMMAND__ACTUATOR_FOR_COMMAND:
        return actuatorForCommand != null;
    }
    return super.eIsSet(featureID);
  }

} //CommandImpl
