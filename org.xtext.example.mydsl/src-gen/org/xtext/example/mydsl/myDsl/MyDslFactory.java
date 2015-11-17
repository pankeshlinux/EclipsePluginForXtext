/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spec</em>'.
   * @generated
   */
  Spec createSpec();

  /**
   * Returns a new object of class '<em>Deployment Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Spec</em>'.
   * @generated
   */
  DeploymentSpec createDeploymentSpec();

  /**
   * Returns a new object of class '<em>Device</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device</em>'.
   * @generated
   */
  Device createDevice();

  /**
   * Returns a new object of class '<em>Device Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Description</em>'.
   * @generated
   */
  DeviceDescription createDeviceDescription();

  /**
   * Returns a new object of class '<em>Device Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Location</em>'.
   * @generated
   */
  DeviceLocation createDeviceLocation();

  /**
   * Returns a new object of class '<em>Platform Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Platform Type</em>'.
   * @generated
   */
  PlatformType createPlatformType();

  /**
   * Returns a new object of class '<em>Database Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Name</em>'.
   * @generated
   */
  DatabaseName createDatabaseName();

  /**
   * Returns a new object of class '<em>Device Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Protocol</em>'.
   * @generated
   */
  DeviceProtocol createDeviceProtocol();

  /**
   * Returns a new object of class '<em>Device Abilities</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Abilities</em>'.
   * @generated
   */
  DeviceAbilities createDeviceAbilities();

  /**
   * Returns a new object of class '<em>Interaction Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction Spec</em>'.
   * @generated
   */
  InteractionSpec createInteractionSpec();

  /**
   * Returns a new object of class '<em>Interaction Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction Action</em>'.
   * @generated
   */
  InteractionAction createInteractionAction();

  /**
   * Returns a new object of class '<em>Arch Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arch Spec</em>'.
   * @generated
   */
  ArchSpec createArchSpec();

  /**
   * Returns a new object of class '<em>In Built Computational Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Built Computational Service</em>'.
   * @generated
   */
  InBuiltComputationalService createInBuiltComputationalService();

  /**
   * Returns a new object of class '<em>custom Computational Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>custom Computational Service</em>'.
   * @generated
   */
  customComputationalService createcustomComputationalService();

  /**
   * Returns a new object of class '<em>Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Request</em>'.
   * @generated
   */
  Request createRequest();

  /**
   * Returns a new object of class '<em>Consume For In Built</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Consume For In Built</em>'.
   * @generated
   */
  ConsumeForInBuilt createConsumeForInBuilt();

  /**
   * Returns a new object of class '<em>Consume</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Consume</em>'.
   * @generated
   */
  Consume createConsume();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Command Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command Parameter</em>'.
   * @generated
   */
  CommandParameter createCommandParameter();

  /**
   * Returns a new object of class '<em>Voc Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Voc Spec</em>'.
   * @generated
   */
  VocSpec createVocSpec();

  /**
   * Returns a new object of class '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Region</em>'.
   * @generated
   */
  Region createRegion();

  /**
   * Returns a new object of class '<em>Region Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Region Label</em>'.
   * @generated
   */
  RegionLabel createRegionLabel();

  /**
   * Returns a new object of class '<em>Struct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct</em>'.
   * @generated
   */
  Struct createStruct();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Periodic Sensors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Periodic Sensors</em>'.
   * @generated
   */
  PeriodicSensors createPeriodicSensors();

  /**
   * Returns a new object of class '<em>Event Sensors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Sensors</em>'.
   * @generated
   */
  EventSensors createEventSensors();

  /**
   * Returns a new object of class '<em>Event Conditions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Conditions</em>'.
   * @generated
   */
  EventConditions createEventConditions();

  /**
   * Returns a new object of class '<em>In Built Computational Service Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Built Computational Service Name</em>'.
   * @generated
   */
  InBuiltComputationalServiceName createInBuiltComputationalServiceName();

  /**
   * Returns a new object of class '<em>Entity Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Name</em>'.
   * @generated
   */
  EntityName createEntityName();

  /**
   * Returns a new object of class '<em>Generate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generate</em>'.
   * @generated
   */
  Generate createGenerate();

  /**
   * Returns a new object of class '<em>Source Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Name</em>'.
   * @generated
   */
  SourceName createSourceName();

  /**
   * Returns a new object of class '<em>Actuator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actuator</em>'.
   * @generated
   */
  Actuator createActuator();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Action Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Name</em>'.
   * @generated
   */
  ActionName createActionName();

  /**
   * Returns a new object of class '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameters</em>'.
   * @generated
   */
  Parameters createParameters();

  /**
   * Returns a new object of class '<em>Parameter Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Name</em>'.
   * @generated
   */
  ParameterName createParameterName();

  /**
   * Returns a new object of class '<em>Storage Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Storage Service</em>'.
   * @generated
   */
  StorageService createStorageService();

  /**
   * Returns a new object of class '<em>Data Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Access</em>'.
   * @generated
   */
  DataAccess createDataAccess();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Operation Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Name</em>'.
   * @generated
   */
  OperationName createOperationName();

  /**
   * Returns a new object of class '<em>Primitive Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Data Type</em>'.
   * @generated
   */
  PrimitiveDataType createPrimitiveDataType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
