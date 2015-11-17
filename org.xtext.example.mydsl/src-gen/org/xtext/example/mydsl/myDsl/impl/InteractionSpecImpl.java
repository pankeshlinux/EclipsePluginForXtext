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

import org.xtext.example.mydsl.myDsl.Command;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.InteractionAction;
import org.xtext.example.mydsl.myDsl.InteractionSpec;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Request;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl#getInteractionName <em>Interaction Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl#getInteractionCommand <em>Interaction Command</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl#getInteractionRequest <em>Interaction Request</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl#getInteractionNotify <em>Interaction Notify</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionSpecImpl extends MinimalEObjectImpl.Container implements InteractionSpec
{
  /**
   * The cached value of the '{@link #getInteractionName() <em>Interaction Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionName()
   * @generated
   * @ordered
   */
  protected EntityName interactionName;

  /**
   * The cached value of the '{@link #getInteractionCommand() <em>Interaction Command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionCommand()
   * @generated
   * @ordered
   */
  protected EList<Command> interactionCommand;

  /**
   * The cached value of the '{@link #getInteractionRequest() <em>Interaction Request</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionRequest()
   * @generated
   * @ordered
   */
  protected EList<Request> interactionRequest;

  /**
   * The cached value of the '{@link #getInteractionNotify() <em>Interaction Notify</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionNotify()
   * @generated
   * @ordered
   */
  protected EList<InteractionAction> interactionNotify;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionSpecImpl()
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
    return MyDslPackage.Literals.INTERACTION_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getInteractionName()
  {
    return interactionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteractionName(EntityName newInteractionName, NotificationChain msgs)
  {
    EntityName oldInteractionName = interactionName;
    interactionName = newInteractionName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME, oldInteractionName, newInteractionName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractionName(EntityName newInteractionName)
  {
    if (newInteractionName != interactionName)
    {
      NotificationChain msgs = null;
      if (interactionName != null)
        msgs = ((InternalEObject)interactionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME, null, msgs);
      if (newInteractionName != null)
        msgs = ((InternalEObject)newInteractionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME, null, msgs);
      msgs = basicSetInteractionName(newInteractionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME, newInteractionName, newInteractionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getInteractionCommand()
  {
    if (interactionCommand == null)
    {
      interactionCommand = new EObjectContainmentEList<Command>(Command.class, this, MyDslPackage.INTERACTION_SPEC__INTERACTION_COMMAND);
    }
    return interactionCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Request> getInteractionRequest()
  {
    if (interactionRequest == null)
    {
      interactionRequest = new EObjectContainmentEList<Request>(Request.class, this, MyDslPackage.INTERACTION_SPEC__INTERACTION_REQUEST);
    }
    return interactionRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionAction> getInteractionNotify()
  {
    if (interactionNotify == null)
    {
      interactionNotify = new EObjectContainmentEList<InteractionAction>(InteractionAction.class, this, MyDslPackage.INTERACTION_SPEC__INTERACTION_NOTIFY);
    }
    return interactionNotify;
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
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        return basicSetInteractionName(null, msgs);
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_COMMAND:
        return ((InternalEList<?>)getInteractionCommand()).basicRemove(otherEnd, msgs);
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_REQUEST:
        return ((InternalEList<?>)getInteractionRequest()).basicRemove(otherEnd, msgs);
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NOTIFY:
        return ((InternalEList<?>)getInteractionNotify()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        return getInteractionName();
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_COMMAND:
        return getInteractionCommand();
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_REQUEST:
        return getInteractionRequest();
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NOTIFY:
        return getInteractionNotify();
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
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        setInteractionName((EntityName)newValue);
        return;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_COMMAND:
        getInteractionCommand().clear();
        getInteractionCommand().addAll((Collection<? extends Command>)newValue);
        return;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_REQUEST:
        getInteractionRequest().clear();
        getInteractionRequest().addAll((Collection<? extends Request>)newValue);
        return;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NOTIFY:
        getInteractionNotify().clear();
        getInteractionNotify().addAll((Collection<? extends InteractionAction>)newValue);
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
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        setInteractionName((EntityName)null);
        return;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_COMMAND:
        getInteractionCommand().clear();
        return;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_REQUEST:
        getInteractionRequest().clear();
        return;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NOTIFY:
        getInteractionNotify().clear();
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
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NAME:
        return interactionName != null;
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_COMMAND:
        return interactionCommand != null && !interactionCommand.isEmpty();
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_REQUEST:
        return interactionRequest != null && !interactionRequest.isEmpty();
      case MyDslPackage.INTERACTION_SPEC__INTERACTION_NOTIFY:
        return interactionNotify != null && !interactionNotify.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InteractionSpecImpl
