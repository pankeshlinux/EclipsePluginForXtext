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

import org.xtext.example.mydsl.myDsl.DataAccess;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.StorageService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StorageServiceImpl#getStorageServiceName <em>Storage Service Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StorageServiceImpl#getDataAccesses <em>Data Accesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageServiceImpl extends MinimalEObjectImpl.Container implements StorageService
{
  /**
   * The cached value of the '{@link #getStorageServiceName() <em>Storage Service Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageServiceName()
   * @generated
   * @ordered
   */
  protected EntityName storageServiceName;

  /**
   * The cached value of the '{@link #getDataAccesses() <em>Data Accesses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataAccesses()
   * @generated
   * @ordered
   */
  protected EList<DataAccess> dataAccesses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StorageServiceImpl()
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
    return MyDslPackage.Literals.STORAGE_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName getStorageServiceName()
  {
    return storageServiceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStorageServiceName(EntityName newStorageServiceName, NotificationChain msgs)
  {
    EntityName oldStorageServiceName = storageServiceName;
    storageServiceName = newStorageServiceName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME, oldStorageServiceName, newStorageServiceName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorageServiceName(EntityName newStorageServiceName)
  {
    if (newStorageServiceName != storageServiceName)
    {
      NotificationChain msgs = null;
      if (storageServiceName != null)
        msgs = ((InternalEObject)storageServiceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME, null, msgs);
      if (newStorageServiceName != null)
        msgs = ((InternalEObject)newStorageServiceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME, null, msgs);
      msgs = basicSetStorageServiceName(newStorageServiceName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME, newStorageServiceName, newStorageServiceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataAccess> getDataAccesses()
  {
    if (dataAccesses == null)
    {
      dataAccesses = new EObjectContainmentEList<DataAccess>(DataAccess.class, this, MyDslPackage.STORAGE_SERVICE__DATA_ACCESSES);
    }
    return dataAccesses;
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
      case MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME:
        return basicSetStorageServiceName(null, msgs);
      case MyDslPackage.STORAGE_SERVICE__DATA_ACCESSES:
        return ((InternalEList<?>)getDataAccesses()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME:
        return getStorageServiceName();
      case MyDslPackage.STORAGE_SERVICE__DATA_ACCESSES:
        return getDataAccesses();
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
      case MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME:
        setStorageServiceName((EntityName)newValue);
        return;
      case MyDslPackage.STORAGE_SERVICE__DATA_ACCESSES:
        getDataAccesses().clear();
        getDataAccesses().addAll((Collection<? extends DataAccess>)newValue);
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
      case MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME:
        setStorageServiceName((EntityName)null);
        return;
      case MyDslPackage.STORAGE_SERVICE__DATA_ACCESSES:
        getDataAccesses().clear();
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
      case MyDslPackage.STORAGE_SERVICE__STORAGE_SERVICE_NAME:
        return storageServiceName != null;
      case MyDslPackage.STORAGE_SERVICE__DATA_ACCESSES:
        return dataAccesses != null && !dataAccesses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StorageServiceImpl
