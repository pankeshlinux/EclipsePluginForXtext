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
import org.xtext.example.mydsl.myDsl.Consume;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.Generate;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Request;
import org.xtext.example.mydsl.myDsl.customComputationalService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>custom Computational Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl#getCustomComputationalServiceName <em>Custom Computational Service Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl#getGenerateInfo <em>Generate Info</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class customComputationalServiceImpl extends MinimalEObjectImpl.Container implements customComputationalService
{
  /**
   * The cached value of the '{@link #getCustomComputationalServiceName() <em>Custom Computational Service Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomComputationalServiceName()
   * @generated
   * @ordered
   */
  protected EntityName customComputationalServiceName;

  /**
   * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsumes()
   * @generated
   * @ordered
   */
  protected EList<Consume> consumes;

  /**
   * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequests()
   * @generated
   * @ordered
   */
  protected EList<Request> requests;

  /**
   * The cached value of the '{@link #getGenerateInfo() <em>Generate Info</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerateInfo()
   * @generated
   * @ordered
   */
  protected EList<Generate> generateInfo;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected customComputationalServiceImpl()
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
    return MyDslPackage.Literals.CUSTOM_COMPUTATIONAL_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getCustomComputationalServiceName()
  {
    return customComputationalServiceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCustomComputationalServiceName(EntityName newCustomComputationalServiceName, NotificationChain msgs)
  {
    EntityName oldCustomComputationalServiceName = customComputationalServiceName;
    customComputationalServiceName = newCustomComputationalServiceName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME, oldCustomComputationalServiceName, newCustomComputationalServiceName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomComputationalServiceName(EntityName newCustomComputationalServiceName)
  {
    if (newCustomComputationalServiceName != customComputationalServiceName)
    {
      NotificationChain msgs = null;
      if (customComputationalServiceName != null)
        msgs = ((InternalEObject)customComputationalServiceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME, null, msgs);
      if (newCustomComputationalServiceName != null)
        msgs = ((InternalEObject)newCustomComputationalServiceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME, null, msgs);
      msgs = basicSetCustomComputationalServiceName(newCustomComputationalServiceName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME, newCustomComputationalServiceName, newCustomComputationalServiceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Consume> getConsumes()
  {
    if (consumes == null)
    {
      consumes = new EObjectContainmentEList<Consume>(Consume.class, this, MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES);
    }
    return consumes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Request> getRequests()
  {
    if (requests == null)
    {
      requests = new EObjectContainmentEList<Request>(Request.class, this, MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS);
    }
    return requests;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Generate> getGenerateInfo()
  {
    if (generateInfo == null)
    {
      generateInfo = new EObjectContainmentEList<Generate>(Generate.class, this, MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO);
    }
    return generateInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS);
    }
    return commands;
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
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME:
        return basicSetCustomComputationalServiceName(null, msgs);
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES:
        return ((InternalEList<?>)getConsumes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS:
        return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        return ((InternalEList<?>)getGenerateInfo()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME:
        return getCustomComputationalServiceName();
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES:
        return getConsumes();
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS:
        return getRequests();
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        return getGenerateInfo();
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS:
        return getCommands();
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
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME:
        setCustomComputationalServiceName((EntityName)newValue);
        return;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES:
        getConsumes().clear();
        getConsumes().addAll((Collection<? extends Consume>)newValue);
        return;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS:
        getRequests().clear();
        getRequests().addAll((Collection<? extends Request>)newValue);
        return;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        getGenerateInfo().clear();
        getGenerateInfo().addAll((Collection<? extends Generate>)newValue);
        return;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
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
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME:
        setCustomComputationalServiceName((EntityName)null);
        return;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES:
        getConsumes().clear();
        return;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS:
        getRequests().clear();
        return;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        getGenerateInfo().clear();
        return;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS:
        getCommands().clear();
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
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME:
        return customComputationalServiceName != null;
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES:
        return consumes != null && !consumes.isEmpty();
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS:
        return requests != null && !requests.isEmpty();
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO:
        return generateInfo != null && !generateInfo.isEmpty();
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS:
        return commands != null && !commands.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //customComputationalServiceImpl
