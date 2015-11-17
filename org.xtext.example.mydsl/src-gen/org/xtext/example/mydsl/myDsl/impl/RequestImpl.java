/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Request;
import org.xtext.example.mydsl.myDsl.SourceName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RequestImpl#getRequestname <em>Requestname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RequestImpl#getStorageForRequest <em>Storage For Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request
{
  /**
   * The cached value of the '{@link #getRequestname() <em>Requestname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestname()
   * @generated
   * @ordered
   */
  protected SourceName requestname;

  /**
   * The cached value of the '{@link #getStorageForRequest() <em>Storage For Request</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageForRequest()
   * @generated
   * @ordered
   */
  protected EntityName storageForRequest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequestImpl()
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
    return MyDslPackage.Literals.REQUEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceName getRequestname()
  {
    if (requestname != null && requestname.eIsProxy())
    {
      InternalEObject oldRequestname = (InternalEObject)requestname;
      requestname = (SourceName)eResolveProxy(oldRequestname);
      if (requestname != oldRequestname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.REQUEST__REQUESTNAME, oldRequestname, requestname));
      }
    }
    return requestname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceName basicGetRequestname()
  {
    return requestname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequestname(SourceName newRequestname)
  {
    SourceName oldRequestname = requestname;
    requestname = newRequestname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REQUEST__REQUESTNAME, oldRequestname, requestname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getStorageForRequest()
  {
    if (storageForRequest != null && storageForRequest.eIsProxy())
    {
      InternalEObject oldStorageForRequest = (InternalEObject)storageForRequest;
      storageForRequest = (EntityName)eResolveProxy(oldStorageForRequest);
      if (storageForRequest != oldStorageForRequest)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.REQUEST__STORAGE_FOR_REQUEST, oldStorageForRequest, storageForRequest));
      }
    }
    return storageForRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName basicGetStorageForRequest()
  {
    return storageForRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorageForRequest(EntityName newStorageForRequest)
  {
    EntityName oldStorageForRequest = storageForRequest;
    storageForRequest = newStorageForRequest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REQUEST__STORAGE_FOR_REQUEST, oldStorageForRequest, storageForRequest));
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
      case MyDslPackage.REQUEST__REQUESTNAME:
        if (resolve) return getRequestname();
        return basicGetRequestname();
      case MyDslPackage.REQUEST__STORAGE_FOR_REQUEST:
        if (resolve) return getStorageForRequest();
        return basicGetStorageForRequest();
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
      case MyDslPackage.REQUEST__REQUESTNAME:
        setRequestname((SourceName)newValue);
        return;
      case MyDslPackage.REQUEST__STORAGE_FOR_REQUEST:
        setStorageForRequest((EntityName)newValue);
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
      case MyDslPackage.REQUEST__REQUESTNAME:
        setRequestname((SourceName)null);
        return;
      case MyDslPackage.REQUEST__STORAGE_FOR_REQUEST:
        setStorageForRequest((EntityName)null);
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
      case MyDslPackage.REQUEST__REQUESTNAME:
        return requestname != null;
      case MyDslPackage.REQUEST__STORAGE_FOR_REQUEST:
        return storageForRequest != null;
    }
    return super.eIsSet(featureID);
  }

} //RequestImpl
