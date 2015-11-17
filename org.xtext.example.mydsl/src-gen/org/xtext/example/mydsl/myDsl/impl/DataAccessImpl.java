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
import org.xtext.example.mydsl.myDsl.DataAccess;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SourceName;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessImpl#getDataAccessType <em>Data Access Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessImpl#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataAccessImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAccessImpl extends MinimalEObjectImpl.Container implements DataAccess
{
  /**
   * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceName()
   * @generated
   * @ordered
   */
  protected SourceName sourceName;

  /**
   * The cached value of the '{@link #getDataAccessType() <em>Data Access Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataAccessType()
   * @generated
   * @ordered
   */
  protected Type dataAccessType;

  /**
   * The default value of the '{@link #getDataItem() <em>Data Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataItem()
   * @generated
   * @ordered
   */
  protected static final String DATA_ITEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDataItem() <em>Data Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataItem()
   * @generated
   * @ordered
   */
  protected String dataItem = DATA_ITEM_EDEFAULT;

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
  protected DataAccessImpl()
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
    return MyDslPackage.Literals.DATA_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceName getSourceName()
  {
    return sourceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceName(SourceName newSourceName, NotificationChain msgs)
  {
    SourceName oldSourceName = sourceName;
    sourceName = newSourceName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS__SOURCE_NAME, oldSourceName, newSourceName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceName(SourceName newSourceName)
  {
    if (newSourceName != sourceName)
    {
      NotificationChain msgs = null;
      if (sourceName != null)
        msgs = ((InternalEObject)sourceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS__SOURCE_NAME, null, msgs);
      if (newSourceName != null)
        msgs = ((InternalEObject)newSourceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS__SOURCE_NAME, null, msgs);
      msgs = basicSetSourceName(newSourceName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS__SOURCE_NAME, newSourceName, newSourceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getDataAccessType()
  {
    return dataAccessType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataAccessType(Type newDataAccessType, NotificationChain msgs)
  {
    Type oldDataAccessType = dataAccessType;
    dataAccessType = newDataAccessType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE, oldDataAccessType, newDataAccessType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataAccessType(Type newDataAccessType)
  {
    if (newDataAccessType != dataAccessType)
    {
      NotificationChain msgs = null;
      if (dataAccessType != null)
        msgs = ((InternalEObject)dataAccessType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE, null, msgs);
      if (newDataAccessType != null)
        msgs = ((InternalEObject)newDataAccessType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE, null, msgs);
      msgs = basicSetDataAccessType(newDataAccessType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE, newDataAccessType, newDataAccessType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDataItem()
  {
    return dataItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataItem(String newDataItem)
  {
    String oldDataItem = dataItem;
    dataItem = newDataItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS__DATA_ITEM, oldDataItem, dataItem));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATA_ACCESS__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_ACCESS__TYPE, newType, newType));
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
      actions = new EObjectContainmentEList<Action>(Action.class, this, MyDslPackage.DATA_ACCESS__ACTIONS);
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
      case MyDslPackage.DATA_ACCESS__SOURCE_NAME:
        return basicSetSourceName(null, msgs);
      case MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE:
        return basicSetDataAccessType(null, msgs);
      case MyDslPackage.DATA_ACCESS__TYPE:
        return basicSetType(null, msgs);
      case MyDslPackage.DATA_ACCESS__ACTIONS:
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
      case MyDslPackage.DATA_ACCESS__SOURCE_NAME:
        return getSourceName();
      case MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE:
        return getDataAccessType();
      case MyDslPackage.DATA_ACCESS__DATA_ITEM:
        return getDataItem();
      case MyDslPackage.DATA_ACCESS__TYPE:
        return getType();
      case MyDslPackage.DATA_ACCESS__ACTIONS:
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
      case MyDslPackage.DATA_ACCESS__SOURCE_NAME:
        setSourceName((SourceName)newValue);
        return;
      case MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE:
        setDataAccessType((Type)newValue);
        return;
      case MyDslPackage.DATA_ACCESS__DATA_ITEM:
        setDataItem((String)newValue);
        return;
      case MyDslPackage.DATA_ACCESS__TYPE:
        setType((Type)newValue);
        return;
      case MyDslPackage.DATA_ACCESS__ACTIONS:
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
      case MyDslPackage.DATA_ACCESS__SOURCE_NAME:
        setSourceName((SourceName)null);
        return;
      case MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE:
        setDataAccessType((Type)null);
        return;
      case MyDslPackage.DATA_ACCESS__DATA_ITEM:
        setDataItem(DATA_ITEM_EDEFAULT);
        return;
      case MyDslPackage.DATA_ACCESS__TYPE:
        setType((Type)null);
        return;
      case MyDslPackage.DATA_ACCESS__ACTIONS:
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
      case MyDslPackage.DATA_ACCESS__SOURCE_NAME:
        return sourceName != null;
      case MyDslPackage.DATA_ACCESS__DATA_ACCESS_TYPE:
        return dataAccessType != null;
      case MyDslPackage.DATA_ACCESS__DATA_ITEM:
        return DATA_ITEM_EDEFAULT == null ? dataItem != null : !DATA_ITEM_EDEFAULT.equals(dataItem);
      case MyDslPackage.DATA_ACCESS__TYPE:
        return type != null;
      case MyDslPackage.DATA_ACCESS__ACTIONS:
        return actions != null && !actions.isEmpty();
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
    result.append(" (dataItem: ");
    result.append(dataItem);
    result.append(')');
    return result.toString();
  }

} //DataAccessImpl
