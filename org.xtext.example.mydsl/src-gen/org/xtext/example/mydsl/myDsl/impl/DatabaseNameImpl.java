/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.DatabaseName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DatabaseNameImpl#getInstalledDatabase <em>Installed Database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseNameImpl extends MinimalEObjectImpl.Container implements DatabaseName
{
  /**
   * The default value of the '{@link #getInstalledDatabase() <em>Installed Database</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstalledDatabase()
   * @generated
   * @ordered
   */
  protected static final String INSTALLED_DATABASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstalledDatabase() <em>Installed Database</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstalledDatabase()
   * @generated
   * @ordered
   */
  protected String installedDatabase = INSTALLED_DATABASE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabaseNameImpl()
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
    return MyDslPackage.Literals.DATABASE_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstalledDatabase()
  {
    return installedDatabase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstalledDatabase(String newInstalledDatabase)
  {
    String oldInstalledDatabase = installedDatabase;
    installedDatabase = newInstalledDatabase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATABASE_NAME__INSTALLED_DATABASE, oldInstalledDatabase, installedDatabase));
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
      case MyDslPackage.DATABASE_NAME__INSTALLED_DATABASE:
        return getInstalledDatabase();
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
      case MyDslPackage.DATABASE_NAME__INSTALLED_DATABASE:
        setInstalledDatabase((String)newValue);
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
      case MyDslPackage.DATABASE_NAME__INSTALLED_DATABASE:
        setInstalledDatabase(INSTALLED_DATABASE_EDEFAULT);
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
      case MyDslPackage.DATABASE_NAME__INSTALLED_DATABASE:
        return INSTALLED_DATABASE_EDEFAULT == null ? installedDatabase != null : !INSTALLED_DATABASE_EDEFAULT.equals(installedDatabase);
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
    result.append(" (installedDatabase: ");
    result.append(installedDatabase);
    result.append(')');
    return result.toString();
  }

} //DatabaseNameImpl
