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

import org.xtext.example.mydsl.myDsl.ActionName;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.InteractionAction;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Parameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionActionImpl#getActionName <em>Action Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionActionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionActionImpl#getInteractionEntity <em>Interaction Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionActionImpl extends MinimalEObjectImpl.Container implements InteractionAction
{
  /**
   * The cached value of the '{@link #getActionName() <em>Action Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionName()
   * @generated
   * @ordered
   */
  protected ActionName actionName;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameters> parameters;

  /**
   * The cached value of the '{@link #getInteractionEntity() <em>Interaction Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionEntity()
   * @generated
   * @ordered
   */
  protected EntityName interactionEntity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionActionImpl()
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
    return MyDslPackage.Literals.INTERACTION_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionName getActionName()
  {
    return actionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionName(ActionName newActionName, NotificationChain msgs)
  {
    ActionName oldActionName = actionName;
    actionName = newActionName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERACTION_ACTION__ACTION_NAME, oldActionName, newActionName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionName(ActionName newActionName)
  {
    if (newActionName != actionName)
    {
      NotificationChain msgs = null;
      if (actionName != null)
        msgs = ((InternalEObject)actionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERACTION_ACTION__ACTION_NAME, null, msgs);
      if (newActionName != null)
        msgs = ((InternalEObject)newActionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERACTION_ACTION__ACTION_NAME, null, msgs);
      msgs = basicSetActionName(newActionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERACTION_ACTION__ACTION_NAME, newActionName, newActionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameters> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this, MyDslPackage.INTERACTION_ACTION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getInteractionEntity()
  {
    if (interactionEntity != null && interactionEntity.eIsProxy())
    {
      InternalEObject oldInteractionEntity = (InternalEObject)interactionEntity;
      interactionEntity = (EntityName)eResolveProxy(oldInteractionEntity);
      if (interactionEntity != oldInteractionEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.INTERACTION_ACTION__INTERACTION_ENTITY, oldInteractionEntity, interactionEntity));
      }
    }
    return interactionEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName basicGetInteractionEntity()
  {
    return interactionEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractionEntity(EntityName newInteractionEntity)
  {
    EntityName oldInteractionEntity = interactionEntity;
    interactionEntity = newInteractionEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERACTION_ACTION__INTERACTION_ENTITY, oldInteractionEntity, interactionEntity));
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
      case MyDslPackage.INTERACTION_ACTION__ACTION_NAME:
        return basicSetActionName(null, msgs);
      case MyDslPackage.INTERACTION_ACTION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.INTERACTION_ACTION__ACTION_NAME:
        return getActionName();
      case MyDslPackage.INTERACTION_ACTION__PARAMETERS:
        return getParameters();
      case MyDslPackage.INTERACTION_ACTION__INTERACTION_ENTITY:
        if (resolve) return getInteractionEntity();
        return basicGetInteractionEntity();
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
      case MyDslPackage.INTERACTION_ACTION__ACTION_NAME:
        setActionName((ActionName)newValue);
        return;
      case MyDslPackage.INTERACTION_ACTION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameters>)newValue);
        return;
      case MyDslPackage.INTERACTION_ACTION__INTERACTION_ENTITY:
        setInteractionEntity((EntityName)newValue);
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
      case MyDslPackage.INTERACTION_ACTION__ACTION_NAME:
        setActionName((ActionName)null);
        return;
      case MyDslPackage.INTERACTION_ACTION__PARAMETERS:
        getParameters().clear();
        return;
      case MyDslPackage.INTERACTION_ACTION__INTERACTION_ENTITY:
        setInteractionEntity((EntityName)null);
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
      case MyDslPackage.INTERACTION_ACTION__ACTION_NAME:
        return actionName != null;
      case MyDslPackage.INTERACTION_ACTION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MyDslPackage.INTERACTION_ACTION__INTERACTION_ENTITY:
        return interactionEntity != null;
    }
    return super.eIsSet(featureID);
  }

} //InteractionActionImpl
