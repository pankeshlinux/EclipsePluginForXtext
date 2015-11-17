/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ParameterName;
import org.xtext.example.mydsl.myDsl.Parameters;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ParametersImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ParametersImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametersImpl extends MinimalEObjectImpl.Container implements Parameters
{
  /**
   * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterName()
   * @generated
   * @ordered
   */
  protected ParameterName parameterName;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParametersImpl()
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
    return MyDslPackage.Literals.PARAMETERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterName getParameterName()
  {
    return parameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterName(ParameterName newParameterName, NotificationChain msgs)
  {
    ParameterName oldParameterName = parameterName;
    parameterName = newParameterName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETERS__PARAMETER_NAME, oldParameterName, newParameterName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterName(ParameterName newParameterName)
  {
    if (newParameterName != parameterName)
    {
      NotificationChain msgs = null;
      if (parameterName != null)
        msgs = ((InternalEObject)parameterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETERS__PARAMETER_NAME, null, msgs);
      if (newParameterName != null)
        msgs = ((InternalEObject)newParameterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETERS__PARAMETER_NAME, null, msgs);
      msgs = basicSetParameterName(newParameterName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETERS__PARAMETER_NAME, newParameterName, newParameterName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETERS__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETERS__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETERS__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETERS__TYPE, newType, newType));
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
      case MyDslPackage.PARAMETERS__PARAMETER_NAME:
        return basicSetParameterName(null, msgs);
      case MyDslPackage.PARAMETERS__TYPE:
        return basicSetType(null, msgs);
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
      case MyDslPackage.PARAMETERS__PARAMETER_NAME:
        return getParameterName();
      case MyDslPackage.PARAMETERS__TYPE:
        return getType();
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
      case MyDslPackage.PARAMETERS__PARAMETER_NAME:
        setParameterName((ParameterName)newValue);
        return;
      case MyDslPackage.PARAMETERS__TYPE:
        setType((Type)newValue);
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
      case MyDslPackage.PARAMETERS__PARAMETER_NAME:
        setParameterName((ParameterName)null);
        return;
      case MyDslPackage.PARAMETERS__TYPE:
        setType((Type)null);
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
      case MyDslPackage.PARAMETERS__PARAMETER_NAME:
        return parameterName != null;
      case MyDslPackage.PARAMETERS__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //ParametersImpl
