/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getINTEGER <em>INTEGER</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getBOOLEAN <em>BOOLEAN</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getSTRING <em>STRING</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getLONG <em>LONG</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getDOUBLE <em>DOUBLE</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getStructDef <em>Struct Def</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends EObject
{
  /**
   * Returns the value of the '<em><b>INTEGER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>INTEGER</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>INTEGER</em>' attribute.
   * @see #setINTEGER(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveDataType_INTEGER()
   * @model
   * @generated
   */
  String getINTEGER();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getINTEGER <em>INTEGER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>INTEGER</em>' attribute.
   * @see #getINTEGER()
   * @generated
   */
  void setINTEGER(String value);

  /**
   * Returns the value of the '<em><b>BOOLEAN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BOOLEAN</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BOOLEAN</em>' attribute.
   * @see #setBOOLEAN(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveDataType_BOOLEAN()
   * @model
   * @generated
   */
  String getBOOLEAN();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getBOOLEAN <em>BOOLEAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BOOLEAN</em>' attribute.
   * @see #getBOOLEAN()
   * @generated
   */
  void setBOOLEAN(String value);

  /**
   * Returns the value of the '<em><b>STRING</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STRING</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING</em>' attribute.
   * @see #setSTRING(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveDataType_STRING()
   * @model
   * @generated
   */
  String getSTRING();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getSTRING <em>STRING</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING</em>' attribute.
   * @see #getSTRING()
   * @generated
   */
  void setSTRING(String value);

  /**
   * Returns the value of the '<em><b>LONG</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LONG</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LONG</em>' attribute.
   * @see #setLONG(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveDataType_LONG()
   * @model
   * @generated
   */
  String getLONG();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getLONG <em>LONG</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LONG</em>' attribute.
   * @see #getLONG()
   * @generated
   */
  void setLONG(String value);

  /**
   * Returns the value of the '<em><b>DOUBLE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DOUBLE</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DOUBLE</em>' attribute.
   * @see #setDOUBLE(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveDataType_DOUBLE()
   * @model
   * @generated
   */
  String getDOUBLE();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getDOUBLE <em>DOUBLE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DOUBLE</em>' attribute.
   * @see #getDOUBLE()
   * @generated
   */
  void setDOUBLE(String value);

  /**
   * Returns the value of the '<em><b>Struct Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Def</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Def</em>' reference.
   * @see #setStructDef(Struct)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveDataType_StructDef()
   * @model
   * @generated
   */
  Struct getStructDef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getStructDef <em>Struct Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct Def</em>' reference.
   * @see #getStructDef()
   * @generated
   */
  void setStructDef(Struct value);

} // PrimitiveDataType
