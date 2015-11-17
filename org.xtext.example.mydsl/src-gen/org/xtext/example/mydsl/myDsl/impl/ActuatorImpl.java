/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.Actuator;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActuatorImpl#getActuatorName <em>Actuator Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActuatorImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends MinimalEObjectImpl.Container implements Actuator
{
  /**
   * The cached value of the '{@link #getActuatorName() <em>Actuator Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuatorName()
   * @generated
   * @ordered
   */
  protected EntityName actuatorName;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActuatorImpl()
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
    return MyDslPackage.Literals.ACTUATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getActuatorName()
  {
    return actuatorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActuatorName(EntityName newActuatorName, NotificationChain msgs)
  {
    EntityName oldActuatorName = actuatorName;
    actuatorName = newActuatorName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTUATOR__ACTUATOR_NAME, oldActuatorName, newActuatorName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActuatorName(EntityName newActuatorName)
  {
    if (newActuatorName != actuatorName)
    {
      NotificationChain msgs = null;
      if (actuatorName != null)
        msgs = ((InternalEObject)actuatorName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTUATOR__ACTUATOR_NAME, null, msgs);
      if (newActuatorName != null)
        msgs = ((InternalEObject)newActuatorName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTUATOR__ACTUATOR_NAME, null, msgs);
      msgs = basicSetActuatorName(newActuatorName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTUATOR__ACTUATOR_NAME, newActuatorName, newActuatorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, MyDslPackage.ACTUATOR__ACTIONS);
    }
    return actions;
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
      case MyDslPackage.ACTUATOR__ACTUATOR_NAME:
        return basicSetActuatorName(null, msgs);
      case MyDslPackage.ACTUATOR__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ACTUATOR__ACTUATOR_NAME:
        return getActuatorName();
      case MyDslPackage.ACTUATOR__ACTIONS:
        return getActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ACTUATOR__ACTUATOR_NAME:
        setActuatorName((EntityName)newValue);
        return;
      case MyDslPackage.ACTUATOR__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
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
      case MyDslPackage.ACTUATOR__ACTUATOR_NAME:
        setActuatorName((EntityName)null);
        return;
      case MyDslPackage.ACTUATOR__ACTIONS:
        getActions().clear();
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
      case MyDslPackage.ACTUATOR__ACTUATOR_NAME:
        return actuatorName != null;
      case MyDslPackage.ACTUATOR__ACTIONS:
        return actions != null && !actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActuatorImpl
