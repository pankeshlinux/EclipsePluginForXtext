/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PrimitiveDataType;
import org.xtext.example.mydsl.myDsl.Struct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl#getINTEGER <em>INTEGER</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl#getBOOLEAN <em>BOOLEAN</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl#getSTRING <em>STRING</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl#getLONG <em>LONG</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl#getDOUBLE <em>DOUBLE</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl#getStructDef <em>Struct Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveDataTypeImpl extends MinimalEObjectImpl.Container implements PrimitiveDataType
{
  /**
   * The default value of the '{@link #getINTEGER() <em>INTEGER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getINTEGER()
   * @generated
   * @ordered
   */
  protected static final String INTEGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getINTEGER() <em>INTEGER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getINTEGER()
   * @generated
   * @ordered
   */
  protected String integer = INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #getBOOLEAN() <em>BOOLEAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBOOLEAN()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBOOLEAN() <em>BOOLEAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBOOLEAN()
   * @generated
   * @ordered
   */
  protected String boolean_ = BOOLEAN_EDEFAULT;

  /**
   * The default value of the '{@link #getSTRING() <em>STRING</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSTRING()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSTRING() <em>STRING</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSTRING()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getLONG() <em>LONG</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLONG()
   * @generated
   * @ordered
   */
  protected static final String LONG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLONG() <em>LONG</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLONG()
   * @generated
   * @ordered
   */
  protected String long_ = LONG_EDEFAULT;

  /**
   * The default value of the '{@link #getDOUBLE() <em>DOUBLE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDOUBLE()
   * @generated
   * @ordered
   */
  protected static final String DOUBLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDOUBLE() <em>DOUBLE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDOUBLE()
   * @generated
   * @ordered
   */
  protected String double_ = DOUBLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStructDef() <em>Struct Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructDef()
   * @generated
   * @ordered
   */
  protected Struct structDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveDataTypeImpl()
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
    return MyDslPackage.Literals.PRIMITIVE_DATA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getINTEGER()
  {
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setINTEGER(String newINTEGER)
  {
    String oldINTEGER = integer;
    integer = newINTEGER;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMITIVE_DATA_TYPE__INTEGER, oldINTEGER, integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBOOLEAN()
  {
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBOOLEAN(String newBOOLEAN)
  {
    String oldBOOLEAN = boolean_;
    boolean_ = newBOOLEAN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMITIVE_DATA_TYPE__BOOLEAN, oldBOOLEAN, boolean_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSTRING()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSTRING(String newSTRING)
  {
    String oldSTRING = string;
    string = newSTRING;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMITIVE_DATA_TYPE__STRING, oldSTRING, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLONG()
  {
    return long_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLONG(String newLONG)
  {
    String oldLONG = long_;
    long_ = newLONG;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMITIVE_DATA_TYPE__LONG, oldLONG, long_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDOUBLE()
  {
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDOUBLE(String newDOUBLE)
  {
    String oldDOUBLE = double_;
    double_ = newDOUBLE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMITIVE_DATA_TYPE__DOUBLE, oldDOUBLE, double_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct getStructDef()
  {
    if (structDef != null && structDef.eIsProxy())
    {
      InternalEObject oldStructDef = (InternalEObject)structDef;
      structDef = (Struct)eResolveProxy(oldStructDef);
      if (structDef != oldStructDef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.PRIMITIVE_DATA_TYPE__STRUCT_DEF, oldStructDef, structDef));
      }
    }
    return structDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct basicGetStructDef()
  {
    return structDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructDef(Struct newStructDef)
  {
    Struct oldStructDef = structDef;
    structDef = newStructDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMITIVE_DATA_TYPE__STRUCT_DEF, oldStructDef, structDef));
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
      case MyDslPackage.PRIMITIVE_DATA_TYPE__INTEGER:
        return getINTEGER();
      case MyDslPackage.PRIMITIVE_DATA_TYPE__BOOLEAN:
        return getBOOLEAN();
      case MyDslPackage.PRIMITIVE_DATA_TYPE__STRING:
        return getSTRING();
      case MyDslPackage.PRIMITIVE_DATA_TYPE__LONG:
        return getLONG();
      case MyDslPackage.PRIMITIVE_DATA_TYPE__DOUBLE:
        return getDOUBLE();
      case MyDslPackage.PRIMITIVE_DATA_TYPE__STRUCT_DEF:
        if (resolve) return getStructDef();
        return basicGetStructDef();
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
      case MyDslPackage.PRIMITIVE_DATA_TYPE__INTEGER:
        setINTEGER((String)newValue);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__BOOLEAN:
        setBOOLEAN((String)newValue);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__STRING:
        setSTRING((String)newValue);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__LONG:
        setLONG((String)newValue);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__DOUBLE:
        setDOUBLE((String)newValue);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__STRUCT_DEF:
        setStructDef((Struct)newValue);
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
      case MyDslPackage.PRIMITIVE_DATA_TYPE__INTEGER:
        setINTEGER(INTEGER_EDEFAULT);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__BOOLEAN:
        setBOOLEAN(BOOLEAN_EDEFAULT);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__STRING:
        setSTRING(STRING_EDEFAULT);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__LONG:
        setLONG(LONG_EDEFAULT);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__DOUBLE:
        setDOUBLE(DOUBLE_EDEFAULT);
        return;
      case MyDslPackage.PRIMITIVE_DATA_TYPE__STRUCT_DEF:
        setStructDef((Struct)null);
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
      case MyDslPackage.PRIMITIVE_DATA_TYPE__INTEGER:
        return INTEGER_EDEFAULT == null ? integer != null : !INTEGER_EDEFAULT.equals(integer);
      case MyDslPackage.PRIMITIVE_DATA_TYPE__BOOLEAN:
        return BOOLEAN_EDEFAULT == null ? boolean_ != null : !BOOLEAN_EDEFAULT.equals(boolean_);
      case MyDslPackage.PRIMITIVE_DATA_TYPE__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case MyDslPackage.PRIMITIVE_DATA_TYPE__LONG:
        return LONG_EDEFAULT == null ? long_ != null : !LONG_EDEFAULT.equals(long_);
      case MyDslPackage.PRIMITIVE_DATA_TYPE__DOUBLE:
        return DOUBLE_EDEFAULT == null ? double_ != null : !DOUBLE_EDEFAULT.equals(double_);
      case MyDslPackage.PRIMITIVE_DATA_TYPE__STRUCT_DEF:
        return structDef != null;
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
    result.append(" (INTEGER: ");
    result.append(integer);
    result.append(", BOOLEAN: ");
    result.append(boolean_);
    result.append(", STRING: ");
    result.append(string);
    result.append(", LONG: ");
    result.append(long_);
    result.append(", DOUBLE: ");
    result.append(double_);
    result.append(')');
    return result.toString();
  }

} //PrimitiveDataTypeImpl
