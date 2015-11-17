/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ArchSpec;
import org.xtext.example.mydsl.myDsl.DeploymentSpec;
import org.xtext.example.mydsl.myDsl.InteractionSpec;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Spec;
import org.xtext.example.mydsl.myDsl.VocSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SpecImpl#getVocSpec <em>Voc Spec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SpecImpl#getInteractionSpec <em>Interaction Spec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SpecImpl#getArchSpec <em>Arch Spec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SpecImpl#getNetworkSpec <em>Network Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecImpl extends MinimalEObjectImpl.Container implements Spec
{
  /**
   * The cached value of the '{@link #getVocSpec() <em>Voc Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVocSpec()
   * @generated
   * @ordered
   */
  protected VocSpec vocSpec;

  /**
   * The cached value of the '{@link #getInteractionSpec() <em>Interaction Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionSpec()
   * @generated
   * @ordered
   */
  protected InteractionSpec interactionSpec;

  /**
   * The cached value of the '{@link #getArchSpec() <em>Arch Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchSpec()
   * @generated
   * @ordered
   */
  protected ArchSpec archSpec;

  /**
   * The cached value of the '{@link #getNetworkSpec() <em>Network Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetworkSpec()
   * @generated
   * @ordered
   */
  protected DeploymentSpec networkSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecImpl()
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
    return MyDslPackage.Literals.SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VocSpec getVocSpec()
  {
    return vocSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVocSpec(VocSpec newVocSpec, NotificationChain msgs)
  {
    VocSpec oldVocSpec = vocSpec;
    vocSpec = newVocSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__VOC_SPEC, oldVocSpec, newVocSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVocSpec(VocSpec newVocSpec)
  {
    if (newVocSpec != vocSpec)
    {
      NotificationChain msgs = null;
      if (vocSpec != null)
        msgs = ((InternalEObject)vocSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__VOC_SPEC, null, msgs);
      if (newVocSpec != null)
        msgs = ((InternalEObject)newVocSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__VOC_SPEC, null, msgs);
      msgs = basicSetVocSpec(newVocSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__VOC_SPEC, newVocSpec, newVocSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionSpec getInteractionSpec()
  {
    return interactionSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteractionSpec(InteractionSpec newInteractionSpec, NotificationChain msgs)
  {
    InteractionSpec oldInteractionSpec = interactionSpec;
    interactionSpec = newInteractionSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__INTERACTION_SPEC, oldInteractionSpec, newInteractionSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractionSpec(InteractionSpec newInteractionSpec)
  {
    if (newInteractionSpec != interactionSpec)
    {
      NotificationChain msgs = null;
      if (interactionSpec != null)
        msgs = ((InternalEObject)interactionSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__INTERACTION_SPEC, null, msgs);
      if (newInteractionSpec != null)
        msgs = ((InternalEObject)newInteractionSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__INTERACTION_SPEC, null, msgs);
      msgs = basicSetInteractionSpec(newInteractionSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__INTERACTION_SPEC, newInteractionSpec, newInteractionSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchSpec getArchSpec()
  {
    return archSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArchSpec(ArchSpec newArchSpec, NotificationChain msgs)
  {
    ArchSpec oldArchSpec = archSpec;
    archSpec = newArchSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__ARCH_SPEC, oldArchSpec, newArchSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchSpec(ArchSpec newArchSpec)
  {
    if (newArchSpec != archSpec)
    {
      NotificationChain msgs = null;
      if (archSpec != null)
        msgs = ((InternalEObject)archSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__ARCH_SPEC, null, msgs);
      if (newArchSpec != null)
        msgs = ((InternalEObject)newArchSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__ARCH_SPEC, null, msgs);
      msgs = basicSetArchSpec(newArchSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__ARCH_SPEC, newArchSpec, newArchSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentSpec getNetworkSpec()
  {
    return networkSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNetworkSpec(DeploymentSpec newNetworkSpec, NotificationChain msgs)
  {
    DeploymentSpec oldNetworkSpec = networkSpec;
    networkSpec = newNetworkSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__NETWORK_SPEC, oldNetworkSpec, newNetworkSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNetworkSpec(DeploymentSpec newNetworkSpec)
  {
    if (newNetworkSpec != networkSpec)
    {
      NotificationChain msgs = null;
      if (networkSpec != null)
        msgs = ((InternalEObject)networkSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__NETWORK_SPEC, null, msgs);
      if (newNetworkSpec != null)
        msgs = ((InternalEObject)newNetworkSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SPEC__NETWORK_SPEC, null, msgs);
      msgs = basicSetNetworkSpec(newNetworkSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPEC__NETWORK_SPEC, newNetworkSpec, newNetworkSpec));
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
      case MyDslPackage.SPEC__VOC_SPEC:
        return basicSetVocSpec(null, msgs);
      case MyDslPackage.SPEC__INTERACTION_SPEC:
        return basicSetInteractionSpec(null, msgs);
      case MyDslPackage.SPEC__ARCH_SPEC:
        return basicSetArchSpec(null, msgs);
      case MyDslPackage.SPEC__NETWORK_SPEC:
        return basicSetNetworkSpec(null, msgs);
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
      case MyDslPackage.SPEC__VOC_SPEC:
        return getVocSpec();
      case MyDslPackage.SPEC__INTERACTION_SPEC:
        return getInteractionSpec();
      case MyDslPackage.SPEC__ARCH_SPEC:
        return getArchSpec();
      case MyDslPackage.SPEC__NETWORK_SPEC:
        return getNetworkSpec();
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
      case MyDslPackage.SPEC__VOC_SPEC:
        setVocSpec((VocSpec)newValue);
        return;
      case MyDslPackage.SPEC__INTERACTION_SPEC:
        setInteractionSpec((InteractionSpec)newValue);
        return;
      case MyDslPackage.SPEC__ARCH_SPEC:
        setArchSpec((ArchSpec)newValue);
        return;
      case MyDslPackage.SPEC__NETWORK_SPEC:
        setNetworkSpec((DeploymentSpec)newValue);
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
      case MyDslPackage.SPEC__VOC_SPEC:
        setVocSpec((VocSpec)null);
        return;
      case MyDslPackage.SPEC__INTERACTION_SPEC:
        setInteractionSpec((InteractionSpec)null);
        return;
      case MyDslPackage.SPEC__ARCH_SPEC:
        setArchSpec((ArchSpec)null);
        return;
      case MyDslPackage.SPEC__NETWORK_SPEC:
        setNetworkSpec((DeploymentSpec)null);
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
      case MyDslPackage.SPEC__VOC_SPEC:
        return vocSpec != null;
      case MyDslPackage.SPEC__INTERACTION_SPEC:
        return interactionSpec != null;
      case MyDslPackage.SPEC__ARCH_SPEC:
        return archSpec != null;
      case MyDslPackage.SPEC__NETWORK_SPEC:
        return networkSpec != null;
    }
    return super.eIsSet(featureID);
  }

} //SpecImpl
