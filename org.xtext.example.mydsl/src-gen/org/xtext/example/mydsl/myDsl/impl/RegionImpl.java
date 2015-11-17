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
import org.xtext.example.mydsl.myDsl.Region;
import org.xtext.example.mydsl.myDsl.RegionLabel;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RegionImpl#getRegionLabel <em>Region Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RegionImpl#getRegionType <em>Region Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region
{
  /**
   * The cached value of the '{@link #getRegionLabel() <em>Region Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegionLabel()
   * @generated
   * @ordered
   */
  protected RegionLabel regionLabel;

  /**
   * The cached value of the '{@link #getRegionType() <em>Region Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegionType()
   * @generated
   * @ordered
   */
  protected Type regionType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegionImpl()
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
    return MyDslPackage.Literals.REGION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegionLabel getRegionLabel()
  {
    return regionLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegionLabel(RegionLabel newRegionLabel, NotificationChain msgs)
  {
    RegionLabel oldRegionLabel = regionLabel;
    regionLabel = newRegionLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.REGION__REGION_LABEL, oldRegionLabel, newRegionLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegionLabel(RegionLabel newRegionLabel)
  {
    if (newRegionLabel != regionLabel)
    {
      NotificationChain msgs = null;
      if (regionLabel != null)
        msgs = ((InternalEObject)regionLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGION__REGION_LABEL, null, msgs);
      if (newRegionLabel != null)
        msgs = ((InternalEObject)newRegionLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGION__REGION_LABEL, null, msgs);
      msgs = basicSetRegionLabel(newRegionLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REGION__REGION_LABEL, newRegionLabel, newRegionLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getRegionType()
  {
    return regionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegionType(Type newRegionType, NotificationChain msgs)
  {
    Type oldRegionType = regionType;
    regionType = newRegionType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.REGION__REGION_TYPE, oldRegionType, newRegionType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegionType(Type newRegionType)
  {
    if (newRegionType != regionType)
    {
      NotificationChain msgs = null;
      if (regionType != null)
        msgs = ((InternalEObject)regionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGION__REGION_TYPE, null, msgs);
      if (newRegionType != null)
        msgs = ((InternalEObject)newRegionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REGION__REGION_TYPE, null, msgs);
      msgs = basicSetRegionType(newRegionType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REGION__REGION_TYPE, newRegionType, newRegionType));
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
      case MyDslPackage.REGION__REGION_LABEL:
        return basicSetRegionLabel(null, msgs);
      case MyDslPackage.REGION__REGION_TYPE:
        return basicSetRegionType(null, msgs);
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
      case MyDslPackage.REGION__REGION_LABEL:
        return getRegionLabel();
      case MyDslPackage.REGION__REGION_TYPE:
        return getRegionType();
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
      case MyDslPackage.REGION__REGION_LABEL:
        setRegionLabel((RegionLabel)newValue);
        return;
      case MyDslPackage.REGION__REGION_TYPE:
        setRegionType((Type)newValue);
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
      case MyDslPackage.REGION__REGION_LABEL:
        setRegionLabel((RegionLabel)null);
        return;
      case MyDslPackage.REGION__REGION_TYPE:
        setRegionType((Type)null);
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
      case MyDslPackage.REGION__REGION_LABEL:
        return regionLabel != null;
      case MyDslPackage.REGION__REGION_TYPE:
        return regionType != null;
    }
    return super.eIsSet(featureID);
  }

} //RegionImpl
