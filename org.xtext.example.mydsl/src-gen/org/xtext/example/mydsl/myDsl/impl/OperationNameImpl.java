/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.OperationName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OperationNameImpl#getOPERATION_NAME <em>OPERATION NAME</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationNameImpl extends MinimalEObjectImpl.Container implements OperationName
{
  /**
   * The default value of the '{@link #getOPERATION_NAME() <em>OPERATION NAME</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOPERATION_NAME()
   * @generated
   * @ordered
   */
  protected static final String OPERATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOPERATION_NAME() <em>OPERATION NAME</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOPERATION_NAME()
   * @generated
   * @ordered
   */
  protected String operatioN_NAME = OPERATION_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationNameImpl()
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
    return MyDslPackage.Literals.OPERATION_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOPERATION_NAME()
  {
    return operatioN_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOPERATION_NAME(String newOPERATION_NAME)
  {
    String oldOPERATION_NAME = operatioN_NAME;
    operatioN_NAME = newOPERATION_NAME;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPERATION_NAME__OPERATION_NAME, oldOPERATION_NAME, operatioN_NAME));
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
      case MyDslPackage.OPERATION_NAME__OPERATION_NAME:
        return getOPERATION_NAME();
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
      case MyDslPackage.OPERATION_NAME__OPERATION_NAME:
        setOPERATION_NAME((String)newValue);
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
      case MyDslPackage.OPERATION_NAME__OPERATION_NAME:
        setOPERATION_NAME(OPERATION_NAME_EDEFAULT);
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
      case MyDslPackage.OPERATION_NAME__OPERATION_NAME:
        return OPERATION_NAME_EDEFAULT == null ? operatioN_NAME != null : !OPERATION_NAME_EDEFAULT.equals(operatioN_NAME);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (OPERATION_NAME: ");
    result.append(operatioN_NAME);
    result.append(')');
    return result.toString();
  }

} //OperationNameImpl
