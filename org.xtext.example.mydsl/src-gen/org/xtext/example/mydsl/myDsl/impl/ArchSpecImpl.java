/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.ArchSpec;
import org.xtext.example.mydsl.myDsl.InBuiltComputationalService;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Struct;
import org.xtext.example.mydsl.myDsl.customComputationalService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arch Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ArchSpecImpl#getStructs <em>Structs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ArchSpecImpl#getInbuiltComputationalService <em>Inbuilt Computational Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ArchSpecImpl#getCustomComputationalService <em>Custom Computational Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchSpecImpl extends MinimalEObjectImpl.Container implements ArchSpec
{
  /**
   * The cached value of the '{@link #getStructs() <em>Structs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructs()
   * @generated
   * @ordered
   */
  protected EList<Struct> structs;

  /**
   * The cached value of the '{@link #getInbuiltComputationalService() <em>Inbuilt Computational Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInbuiltComputationalService()
   * @generated
   * @ordered
   */
  protected EList<InBuiltComputationalService> inbuiltComputationalService;

  /**
   * The cached value of the '{@link #getCustomComputationalService() <em>Custom Computational Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomComputationalService()
   * @generated
   * @ordered
   */
  protected EList<customComputationalService> customComputationalService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchSpecImpl()
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
    return MyDslPackage.Literals.ARCH_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Struct> getStructs()
  {
    if (structs == null)
    {
      structs = new EObjectContainmentEList<Struct>(Struct.class, this, MyDslPackage.ARCH_SPEC__STRUCTS);
    }
    return structs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InBuiltComputationalService> getInbuiltComputationalService()
  {
    if (inbuiltComputationalService == null)
    {
      inbuiltComputationalService = new EObjectContainmentEList<InBuiltComputationalService>(InBuiltComputationalService.class, this, MyDslPackage.ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE);
    }
    return inbuiltComputationalService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<customComputationalService> getCustomComputationalService()
  {
    if (customComputationalService == null)
    {
      customComputationalService = new EObjectContainmentEList<customComputationalService>(customComputationalService.class, this, MyDslPackage.ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE);
    }
    return customComputationalService;
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
      case MyDslPackage.ARCH_SPEC__STRUCTS:
        return ((InternalEList<?>)getStructs()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE:
        return ((InternalEList<?>)getInbuiltComputationalService()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE:
        return ((InternalEList<?>)getCustomComputationalService()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ARCH_SPEC__STRUCTS:
        return getStructs();
      case MyDslPackage.ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE:
        return getInbuiltComputationalService();
      case MyDslPackage.ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE:
        return getCustomComputationalService();
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
      case MyDslPackage.ARCH_SPEC__STRUCTS:
        getStructs().clear();
        getStructs().addAll((Collection<? extends Struct>)newValue);
        return;
      case MyDslPackage.ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE:
        getInbuiltComputationalService().clear();
        getInbuiltComputationalService().addAll((Collection<? extends InBuiltComputationalService>)newValue);
        return;
      case MyDslPackage.ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE:
        getCustomComputationalService().clear();
        getCustomComputationalService().addAll((Collection<? extends customComputationalService>)newValue);
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
      case MyDslPackage.ARCH_SPEC__STRUCTS:
        getStructs().clear();
        return;
      case MyDslPackage.ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE:
        getInbuiltComputationalService().clear();
        return;
      case MyDslPackage.ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE:
        getCustomComputationalService().clear();
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
      case MyDslPackage.ARCH_SPEC__STRUCTS:
        return structs != null && !structs.isEmpty();
      case MyDslPackage.ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE:
        return inbuiltComputationalService != null && !inbuiltComputationalService.isEmpty();
      case MyDslPackage.ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE:
        return customComputationalService != null && !customComputationalService.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArchSpecImpl
