/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SpecImpl <em>Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SpecImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSpec()
   * @generated
   */
  int SPEC = 0;

  /**
   * The feature id for the '<em><b>Voc Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__VOC_SPEC = 0;

  /**
   * The feature id for the '<em><b>Interaction Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__INTERACTION_SPEC = 1;

  /**
   * The feature id for the '<em><b>Arch Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__ARCH_SPEC = 2;

  /**
   * The feature id for the '<em><b>Network Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__NETWORK_SPEC = 3;

  /**
   * The number of structural features of the '<em>Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeploymentSpecImpl <em>Deployment Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeploymentSpecImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeploymentSpec()
   * @generated
   */
  int DEPLOYMENT_SPEC = 1;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SPEC__DEVICES = 0;

  /**
   * The number of structural features of the '<em>Deployment Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SPEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeviceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 2;

  /**
   * The feature id for the '<em><b>Device Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICE_NAME = 0;

  /**
   * The feature id for the '<em><b>Device Location</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICE_LOCATION = 1;

  /**
   * The feature id for the '<em><b>Platform Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__PLATFORM_TYPE = 2;

  /**
   * The feature id for the '<em><b>Device Abilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICE_ABILITIES = 3;

  /**
   * The feature id for the '<em><b>Device Protocol</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICE_PROTOCOL = 4;

  /**
   * The feature id for the '<em><b>Database Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DATABASE_NAME = 5;

  /**
   * The feature id for the '<em><b>Device Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICE_DESCRIPTION = 6;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceDescriptionImpl <em>Device Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeviceDescriptionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeviceDescription()
   * @generated
   */
  int DEVICE_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Devicedescription Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DESCRIPTION__DEVICEDESCRIPTION_TEXT = 0;

  /**
   * The number of structural features of the '<em>Device Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceLocationImpl <em>Device Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeviceLocationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeviceLocation()
   * @generated
   */
  int DEVICE_LOCATION = 4;

  /**
   * The feature id for the '<em><b>Region Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_LOCATION__REGION_LABEL = 0;

  /**
   * The feature id for the '<em><b>Region Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_LOCATION__REGION_VALUE = 1;

  /**
   * The number of structural features of the '<em>Device Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_LOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PlatformTypeImpl <em>Platform Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PlatformTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlatformType()
   * @generated
   */
  int PLATFORM_TYPE = 5;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_TYPE__DEVICE_TYPE = 0;

  /**
   * The number of structural features of the '<em>Platform Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DatabaseNameImpl <em>Database Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DatabaseNameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDatabaseName()
   * @generated
   */
  int DATABASE_NAME = 6;

  /**
   * The feature id for the '<em><b>Installed Database</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_NAME__INSTALLED_DATABASE = 0;

  /**
   * The number of structural features of the '<em>Database Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceProtocolImpl <em>Device Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeviceProtocolImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeviceProtocol()
   * @generated
   */
  int DEVICE_PROTOCOL = 7;

  /**
   * The feature id for the '<em><b>Protocol Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_PROTOCOL__PROTOCOL_NAME = 0;

  /**
   * The number of structural features of the '<em>Device Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_PROTOCOL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceAbilitiesImpl <em>Device Abilities</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeviceAbilitiesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeviceAbilities()
   * @generated
   */
  int DEVICE_ABILITIES = 8;

  /**
   * The feature id for the '<em><b>Device Entity Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_ABILITIES__DEVICE_ENTITY_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_ABILITIES__NAME = 1;

  /**
   * The number of structural features of the '<em>Device Abilities</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_ABILITIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl <em>Interaction Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInteractionSpec()
   * @generated
   */
  int INTERACTION_SPEC = 9;

  /**
   * The feature id for the '<em><b>Interaction Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_SPEC__INTERACTION_NAME = 0;

  /**
   * The feature id for the '<em><b>Interaction Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_SPEC__INTERACTION_COMMAND = 1;

  /**
   * The feature id for the '<em><b>Interaction Request</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_SPEC__INTERACTION_REQUEST = 2;

  /**
   * The feature id for the '<em><b>Interaction Notify</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_SPEC__INTERACTION_NOTIFY = 3;

  /**
   * The number of structural features of the '<em>Interaction Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_SPEC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InteractionActionImpl <em>Interaction Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InteractionActionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInteractionAction()
   * @generated
   */
  int INTERACTION_ACTION = 10;

  /**
   * The feature id for the '<em><b>Action Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ACTION__ACTION_NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ACTION__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Interaction Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ACTION__INTERACTION_ENTITY = 2;

  /**
   * The number of structural features of the '<em>Interaction Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ArchSpecImpl <em>Arch Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ArchSpecImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArchSpec()
   * @generated
   */
  int ARCH_SPEC = 11;

  /**
   * The feature id for the '<em><b>Structs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCH_SPEC__STRUCTS = 0;

  /**
   * The feature id for the '<em><b>Inbuilt Computational Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE = 1;

  /**
   * The feature id for the '<em><b>Custom Computational Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE = 2;

  /**
   * The number of structural features of the '<em>Arch Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCH_SPEC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceImpl <em>In Built Computational Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInBuiltComputationalService()
   * @generated
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE = 12;

  /**
   * The feature id for the '<em><b>In Built Computational Service Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME = 0;

  /**
   * The feature id for the '<em><b>Consumes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES = 1;

  /**
   * The feature id for the '<em><b>Operation Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE__OPERATION_NAME = 2;

  /**
   * The feature id for the '<em><b>Operation Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE__OPERATION_PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Generate Info</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO = 4;

  /**
   * The number of structural features of the '<em>In Built Computational Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl <em>custom Computational Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getcustomComputationalService()
   * @generated
   */
  int CUSTOM_COMPUTATIONAL_SERVICE = 13;

  /**
   * The feature id for the '<em><b>Custom Computational Service Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME = 0;

  /**
   * The feature id for the '<em><b>Consumes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES = 1;

  /**
   * The feature id for the '<em><b>Requests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS = 2;

  /**
   * The feature id for the '<em><b>Generate Info</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO = 3;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS = 4;

  /**
   * The number of structural features of the '<em>custom Computational Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COMPUTATIONAL_SERVICE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RequestImpl <em>Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RequestImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRequest()
   * @generated
   */
  int REQUEST = 14;

  /**
   * The feature id for the '<em><b>Requestname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__REQUESTNAME = 0;

  /**
   * The feature id for the '<em><b>Storage For Request</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__STORAGE_FOR_REQUEST = 1;

  /**
   * The number of structural features of the '<em>Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ConsumeForInBuiltImpl <em>Consume For In Built</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ConsumeForInBuiltImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConsumeForInBuilt()
   * @generated
   */
  int CONSUME_FOR_IN_BUILT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUME_FOR_IN_BUILT__NAME = 0;

  /**
   * The feature id for the '<em><b>Sensor For Consume</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME = 1;

  /**
   * The number of structural features of the '<em>Consume For In Built</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUME_FOR_IN_BUILT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ConsumeImpl <em>Consume</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ConsumeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConsume()
   * @generated
   */
  int CONSUME = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUME__NAME = 0;

  /**
   * The feature id for the '<em><b>From Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUME__FROM_NAME = 1;

  /**
   * The number of structural features of the '<em>Consume</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CommandImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 17;

  /**
   * The feature id for the '<em><b>Command Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__COMMAND_NAME = 0;

  /**
   * The feature id for the '<em><b>Commandparameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__COMMANDPARAMETER = 1;

  /**
   * The feature id for the '<em><b>Actuator For Command</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ACTUATOR_FOR_COMMAND = 2;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CommandParameterImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommandParameter()
   * @generated
   */
  int COMMAND_PARAMETER = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__PARAMETER = 1;

  /**
   * The number of structural features of the '<em>Command Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VocSpecImpl <em>Voc Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VocSpecImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVocSpec()
   * @generated
   */
  int VOC_SPEC = 19;

  /**
   * The feature id for the '<em><b>Structs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOC_SPEC__STRUCTS = 0;

  /**
   * The feature id for the '<em><b>Periodic Sensors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOC_SPEC__PERIODIC_SENSORS = 1;

  /**
   * The feature id for the '<em><b>Event Sensors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOC_SPEC__EVENT_SENSORS = 2;

  /**
   * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOC_SPEC__ACTUATORS = 3;

  /**
   * The feature id for the '<em><b>Storage Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOC_SPEC__STORAGE_SERVICE = 4;

  /**
   * The number of structural features of the '<em>Voc Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOC_SPEC_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RegionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRegion()
   * @generated
   */
  int REGION = 20;

  /**
   * The feature id for the '<em><b>Region Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__REGION_LABEL = 0;

  /**
   * The feature id for the '<em><b>Region Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__REGION_TYPE = 1;

  /**
   * The number of structural features of the '<em>Region</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RegionLabelImpl <em>Region Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RegionLabelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRegionLabel()
   * @generated
   */
  int REGION_LABEL = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_LABEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Region Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StructImpl <em>Struct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StructImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStruct()
   * @generated
   */
  int STRUCT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Struct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FieldImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getField()
   * @generated
   */
  int FIELD = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PeriodicSensorsImpl <em>Periodic Sensors</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PeriodicSensorsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPeriodicSensors()
   * @generated
   */
  int PERIODIC_SENSORS = 24;

  /**
   * The feature id for the '<em><b>Sensor Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIODIC_SENSORS__SENSOR_NAME = 0;

  /**
   * The feature id for the '<em><b>Generate Info</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIODIC_SENSORS__GENERATE_INFO = 1;

  /**
   * The number of structural features of the '<em>Periodic Sensors</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIODIC_SENSORS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EventSensorsImpl <em>Event Sensors</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EventSensorsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEventSensors()
   * @generated
   */
  int EVENT_SENSORS = 25;

  /**
   * The feature id for the '<em><b>Sensor Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SENSORS__SENSOR_NAME = 0;

  /**
   * The feature id for the '<em><b>Generate Info</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SENSORS__GENERATE_INFO = 1;

  /**
   * The feature id for the '<em><b>Event Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SENSORS__EVENT_CONDITIONS = 2;

  /**
   * The number of structural features of the '<em>Event Sensors</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SENSORS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EventConditionsImpl <em>Event Conditions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EventConditionsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEventConditions()
   * @generated
   */
  int EVENT_CONDITIONS = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITIONS__NAME = 0;

  /**
   * The feature id for the '<em><b>Event Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITIONS__EVENT_CONDITIONS = 1;

  /**
   * The number of structural features of the '<em>Event Conditions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceNameImpl <em>In Built Computational Service Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceNameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInBuiltComputationalServiceName()
   * @generated
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE_NAME = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>In Built Computational Service Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_BUILT_COMPUTATIONAL_SERVICE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EntityNameImpl <em>Entity Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EntityNameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEntityName()
   * @generated
   */
  int ENTITY_NAME = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Entity Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.GenerateImpl <em>Generate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.GenerateImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGenerate()
   * @generated
   */
  int GENERATE = 29;

  /**
   * The feature id for the '<em><b>Source Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE__SOURCE_NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Generate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SourceNameImpl <em>Source Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SourceNameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSourceName()
   * @generated
   */
  int SOURCE_NAME = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Source Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActuatorImpl <em>Actuator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActuatorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActuator()
   * @generated
   */
  int ACTUATOR = 31;

  /**
   * The feature id for the '<em><b>Actuator Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUATOR__ACTUATOR_NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUATOR__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Actuator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
   * @generated
   */
  int ACTION = 32;

  /**
   * The feature id for the '<em><b>Action Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION_NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionNameImpl <em>Action Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActionNameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionName()
   * @generated
   */
  int ACTION_NAME = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Action Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParametersImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 34;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__PARAMETER_NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__TYPE = 1;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterNameImpl <em>Parameter Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParameterNameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameterName()
   * @generated
   */
  int PARAMETER_NAME = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StorageServiceImpl <em>Storage Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StorageServiceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStorageService()
   * @generated
   */
  int STORAGE_SERVICE = 36;

  /**
   * The feature id for the '<em><b>Storage Service Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE_SERVICE__STORAGE_SERVICE_NAME = 0;

  /**
   * The feature id for the '<em><b>Data Accesses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE_SERVICE__DATA_ACCESSES = 1;

  /**
   * The number of structural features of the '<em>Storage Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE_SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DataAccessImpl <em>Data Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DataAccessImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataAccess()
   * @generated
   */
  int DATA_ACCESS = 37;

  /**
   * The feature id for the '<em><b>Source Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS__SOURCE_NAME = 0;

  /**
   * The feature id for the '<em><b>Data Access Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS__DATA_ACCESS_TYPE = 1;

  /**
   * The feature id for the '<em><b>Data Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS__DATA_ITEM = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS__TYPE = 3;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS__ACTIONS = 4;

  /**
   * The number of structural features of the '<em>Data Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 38;

  /**
   * The feature id for the '<em><b>Primitive Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PRIMITIVE_DATA_TYPE = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OperationNameImpl <em>Operation Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OperationNameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOperationName()
   * @generated
   */
  int OPERATION_NAME = 39;

  /**
   * The feature id for the '<em><b>OPERATION NAME</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_NAME__OPERATION_NAME = 0;

  /**
   * The number of structural features of the '<em>Operation Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrimitiveDataType()
   * @generated
   */
  int PRIMITIVE_DATA_TYPE = 40;

  /**
   * The feature id for the '<em><b>INTEGER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE__INTEGER = 0;

  /**
   * The feature id for the '<em><b>BOOLEAN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE__BOOLEAN = 1;

  /**
   * The feature id for the '<em><b>STRING</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE__STRING = 2;

  /**
   * The feature id for the '<em><b>LONG</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE__LONG = 3;

  /**
   * The feature id for the '<em><b>DOUBLE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE__DOUBLE = 4;

  /**
   * The feature id for the '<em><b>Struct Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE__STRUCT_DEF = 5;

  /**
   * The number of structural features of the '<em>Primitive Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = 6;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Spec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Spec
   * @generated
   */
  EClass getSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Spec#getVocSpec <em>Voc Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Voc Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Spec#getVocSpec()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_VocSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Spec#getInteractionSpec <em>Interaction Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interaction Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Spec#getInteractionSpec()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_InteractionSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Spec#getArchSpec <em>Arch Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arch Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Spec#getArchSpec()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_ArchSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Spec#getNetworkSpec <em>Network Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Network Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Spec#getNetworkSpec()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_NetworkSpec();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeploymentSpec <em>Deployment Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeploymentSpec
   * @generated
   */
  EClass getDeploymentSpec();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DeploymentSpec#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeploymentSpec#getDevices()
   * @see #getDeploymentSpec()
   * @generated
   */
  EReference getDeploymentSpec_Devices();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see org.xtext.example.mydsl.myDsl.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Device#getDeviceName <em>Device Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Device#getDeviceName()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_DeviceName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Device#getDeviceLocation <em>Device Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Location</em>'.
   * @see org.xtext.example.mydsl.myDsl.Device#getDeviceLocation()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DeviceLocation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Device#getPlatformType <em>Platform Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Platform Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Device#getPlatformType()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_PlatformType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Device#getDeviceAbilities <em>Device Abilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Abilities</em>'.
   * @see org.xtext.example.mydsl.myDsl.Device#getDeviceAbilities()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DeviceAbilities();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Device#getDeviceProtocol <em>Device Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Protocol</em>'.
   * @see org.xtext.example.mydsl.myDsl.Device#getDeviceProtocol()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DeviceProtocol();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Device#getDatabaseName <em>Database Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Database Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Device#getDatabaseName()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DatabaseName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Device#getDeviceDescription <em>Device Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Device#getDeviceDescription()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DeviceDescription();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeviceDescription <em>Device Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceDescription
   * @generated
   */
  EClass getDeviceDescription();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeviceDescription#getDevicedescriptionText <em>Devicedescription Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Devicedescription Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceDescription#getDevicedescriptionText()
   * @see #getDeviceDescription()
   * @generated
   */
  EAttribute getDeviceDescription_DevicedescriptionText();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeviceLocation <em>Device Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Location</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceLocation
   * @generated
   */
  EClass getDeviceLocation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeviceLocation#getRegionLabel <em>Region Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Region Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceLocation#getRegionLabel()
   * @see #getDeviceLocation()
   * @generated
   */
  EAttribute getDeviceLocation_RegionLabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeviceLocation#getRegionValue <em>Region Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Region Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceLocation#getRegionValue()
   * @see #getDeviceLocation()
   * @generated
   */
  EAttribute getDeviceLocation_RegionValue();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PlatformType <em>Platform Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.PlatformType
   * @generated
   */
  EClass getPlatformType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PlatformType#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.PlatformType#getDeviceType()
   * @see #getPlatformType()
   * @generated
   */
  EAttribute getPlatformType_DeviceType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DatabaseName <em>Database Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DatabaseName
   * @generated
   */
  EClass getDatabaseName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DatabaseName#getInstalledDatabase <em>Installed Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Installed Database</em>'.
   * @see org.xtext.example.mydsl.myDsl.DatabaseName#getInstalledDatabase()
   * @see #getDatabaseName()
   * @generated
   */
  EAttribute getDatabaseName_InstalledDatabase();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeviceProtocol <em>Device Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Protocol</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceProtocol
   * @generated
   */
  EClass getDeviceProtocol();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DeviceProtocol#getProtocolName <em>Protocol Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceProtocol#getProtocolName()
   * @see #getDeviceProtocol()
   * @generated
   */
  EAttribute getDeviceProtocol_ProtocolName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DeviceAbilities <em>Device Abilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Abilities</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceAbilities
   * @generated
   */
  EClass getDeviceAbilities();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DeviceAbilities#getDeviceEntityName <em>Device Entity Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Device Entity Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceAbilities#getDeviceEntityName()
   * @see #getDeviceAbilities()
   * @generated
   */
  EReference getDeviceAbilities_DeviceEntityName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DeviceAbilities#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DeviceAbilities#getName()
   * @see #getDeviceAbilities()
   * @generated
   */
  EReference getDeviceAbilities_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.InteractionSpec <em>Interaction Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionSpec
   * @generated
   */
  EClass getInteractionSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionName <em>Interaction Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interaction Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionName()
   * @see #getInteractionSpec()
   * @generated
   */
  EReference getInteractionSpec_InteractionName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionCommand <em>Interaction Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interaction Command</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionCommand()
   * @see #getInteractionSpec()
   * @generated
   */
  EReference getInteractionSpec_InteractionCommand();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionRequest <em>Interaction Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interaction Request</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionRequest()
   * @see #getInteractionSpec()
   * @generated
   */
  EReference getInteractionSpec_InteractionRequest();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionNotify <em>Interaction Notify</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interaction Notify</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionSpec#getInteractionNotify()
   * @see #getInteractionSpec()
   * @generated
   */
  EReference getInteractionSpec_InteractionNotify();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.InteractionAction <em>Interaction Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Action</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionAction
   * @generated
   */
  EClass getInteractionAction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.InteractionAction#getActionName <em>Action Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionAction#getActionName()
   * @see #getInteractionAction()
   * @generated
   */
  EReference getInteractionAction_ActionName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.InteractionAction#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionAction#getParameters()
   * @see #getInteractionAction()
   * @generated
   */
  EReference getInteractionAction_Parameters();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.InteractionAction#getInteractionEntity <em>Interaction Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interaction Entity</em>'.
   * @see org.xtext.example.mydsl.myDsl.InteractionAction#getInteractionEntity()
   * @see #getInteractionAction()
   * @generated
   */
  EReference getInteractionAction_InteractionEntity();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ArchSpec <em>Arch Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arch Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.ArchSpec
   * @generated
   */
  EClass getArchSpec();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ArchSpec#getStructs <em>Structs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structs</em>'.
   * @see org.xtext.example.mydsl.myDsl.ArchSpec#getStructs()
   * @see #getArchSpec()
   * @generated
   */
  EReference getArchSpec_Structs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ArchSpec#getInbuiltComputationalService <em>Inbuilt Computational Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inbuilt Computational Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.ArchSpec#getInbuiltComputationalService()
   * @see #getArchSpec()
   * @generated
   */
  EReference getArchSpec_InbuiltComputationalService();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ArchSpec#getCustomComputationalService <em>Custom Computational Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Custom Computational Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.ArchSpec#getCustomComputationalService()
   * @see #getArchSpec()
   * @generated
   */
  EReference getArchSpec_CustomComputationalService();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService <em>In Built Computational Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Built Computational Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.InBuiltComputationalService
   * @generated
   */
  EClass getInBuiltComputationalService();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getInBuiltComputationalServiceName <em>In Built Computational Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In Built Computational Service Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getInBuiltComputationalServiceName()
   * @see #getInBuiltComputationalService()
   * @generated
   */
  EReference getInBuiltComputationalService_InBuiltComputationalServiceName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getConsumes <em>Consumes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Consumes</em>'.
   * @see org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getConsumes()
   * @see #getInBuiltComputationalService()
   * @generated
   */
  EReference getInBuiltComputationalService_Consumes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getOperationName <em>Operation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getOperationName()
   * @see #getInBuiltComputationalService()
   * @generated
   */
  EReference getInBuiltComputationalService_OperationName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getOperationParameter <em>Operation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getOperationParameter()
   * @see #getInBuiltComputationalService()
   * @generated
   */
  EAttribute getInBuiltComputationalService_OperationParameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getGenerateInfo <em>Generate Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generate Info</em>'.
   * @see org.xtext.example.mydsl.myDsl.InBuiltComputationalService#getGenerateInfo()
   * @see #getInBuiltComputationalService()
   * @generated
   */
  EReference getInBuiltComputationalService_GenerateInfo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.customComputationalService <em>custom Computational Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>custom Computational Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.customComputationalService
   * @generated
   */
  EClass getcustomComputationalService();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.customComputationalService#getCustomComputationalServiceName <em>Custom Computational Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Custom Computational Service Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.customComputationalService#getCustomComputationalServiceName()
   * @see #getcustomComputationalService()
   * @generated
   */
  EReference getcustomComputationalService_CustomComputationalServiceName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.customComputationalService#getConsumes <em>Consumes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Consumes</em>'.
   * @see org.xtext.example.mydsl.myDsl.customComputationalService#getConsumes()
   * @see #getcustomComputationalService()
   * @generated
   */
  EReference getcustomComputationalService_Consumes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.customComputationalService#getRequests <em>Requests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requests</em>'.
   * @see org.xtext.example.mydsl.myDsl.customComputationalService#getRequests()
   * @see #getcustomComputationalService()
   * @generated
   */
  EReference getcustomComputationalService_Requests();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.customComputationalService#getGenerateInfo <em>Generate Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generate Info</em>'.
   * @see org.xtext.example.mydsl.myDsl.customComputationalService#getGenerateInfo()
   * @see #getcustomComputationalService()
   * @generated
   */
  EReference getcustomComputationalService_GenerateInfo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.customComputationalService#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.xtext.example.mydsl.myDsl.customComputationalService#getCommands()
   * @see #getcustomComputationalService()
   * @generated
   */
  EReference getcustomComputationalService_Commands();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Request <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request</em>'.
   * @see org.xtext.example.mydsl.myDsl.Request
   * @generated
   */
  EClass getRequest();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Request#getRequestname <em>Requestname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Requestname</em>'.
   * @see org.xtext.example.mydsl.myDsl.Request#getRequestname()
   * @see #getRequest()
   * @generated
   */
  EReference getRequest_Requestname();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Request#getStorageForRequest <em>Storage For Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Storage For Request</em>'.
   * @see org.xtext.example.mydsl.myDsl.Request#getStorageForRequest()
   * @see #getRequest()
   * @generated
   */
  EReference getRequest_StorageForRequest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ConsumeForInBuilt <em>Consume For In Built</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Consume For In Built</em>'.
   * @see org.xtext.example.mydsl.myDsl.ConsumeForInBuilt
   * @generated
   */
  EClass getConsumeForInBuilt();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ConsumeForInBuilt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ConsumeForInBuilt#getName()
   * @see #getConsumeForInBuilt()
   * @generated
   */
  EReference getConsumeForInBuilt_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ConsumeForInBuilt#getSensorForConsume <em>Sensor For Consume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sensor For Consume</em>'.
   * @see org.xtext.example.mydsl.myDsl.ConsumeForInBuilt#getSensorForConsume()
   * @see #getConsumeForInBuilt()
   * @generated
   */
  EReference getConsumeForInBuilt_SensorForConsume();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Consume <em>Consume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Consume</em>'.
   * @see org.xtext.example.mydsl.myDsl.Consume
   * @generated
   */
  EClass getConsume();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Consume#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Consume#getName()
   * @see #getConsume()
   * @generated
   */
  EReference getConsume_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Consume#getFromName <em>From Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Consume#getFromName()
   * @see #getConsume()
   * @generated
   */
  EReference getConsume_FromName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.example.mydsl.myDsl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Command#getCommandName <em>Command Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Command Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Command#getCommandName()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_CommandName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Command#getCommandparameter <em>Commandparameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Commandparameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Command#getCommandparameter()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Commandparameter();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Command#getActuatorForCommand <em>Actuator For Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actuator For Command</em>'.
   * @see org.xtext.example.mydsl.myDsl.Command#getActuatorForCommand()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_ActuatorForCommand();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CommandParameter <em>Command Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.CommandParameter
   * @generated
   */
  EClass getCommandParameter();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.CommandParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.CommandParameter#getName()
   * @see #getCommandParameter()
   * @generated
   */
  EReference getCommandParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.CommandParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.CommandParameter#getParameter()
   * @see #getCommandParameter()
   * @generated
   */
  EReference getCommandParameter_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.VocSpec <em>Voc Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Voc Spec</em>'.
   * @see org.xtext.example.mydsl.myDsl.VocSpec
   * @generated
   */
  EClass getVocSpec();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.VocSpec#getStructs <em>Structs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structs</em>'.
   * @see org.xtext.example.mydsl.myDsl.VocSpec#getStructs()
   * @see #getVocSpec()
   * @generated
   */
  EReference getVocSpec_Structs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.VocSpec#getPeriodicSensors <em>Periodic Sensors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Periodic Sensors</em>'.
   * @see org.xtext.example.mydsl.myDsl.VocSpec#getPeriodicSensors()
   * @see #getVocSpec()
   * @generated
   */
  EReference getVocSpec_PeriodicSensors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.VocSpec#getEventSensors <em>Event Sensors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event Sensors</em>'.
   * @see org.xtext.example.mydsl.myDsl.VocSpec#getEventSensors()
   * @see #getVocSpec()
   * @generated
   */
  EReference getVocSpec_EventSensors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.VocSpec#getActuators <em>Actuators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actuators</em>'.
   * @see org.xtext.example.mydsl.myDsl.VocSpec#getActuators()
   * @see #getVocSpec()
   * @generated
   */
  EReference getVocSpec_Actuators();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.VocSpec#getStorageService <em>Storage Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Storage Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.VocSpec#getStorageService()
   * @see #getVocSpec()
   * @generated
   */
  EReference getVocSpec_StorageService();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see org.xtext.example.mydsl.myDsl.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Region#getRegionLabel <em>Region Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Region Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.Region#getRegionLabel()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_RegionLabel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Region#getRegionType <em>Region Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Region Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Region#getRegionType()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_RegionType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RegionLabel <em>Region Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.RegionLabel
   * @generated
   */
  EClass getRegionLabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RegionLabel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.RegionLabel#getName()
   * @see #getRegionLabel()
   * @generated
   */
  EAttribute getRegionLabel_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Struct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct</em>'.
   * @see org.xtext.example.mydsl.myDsl.Struct
   * @generated
   */
  EClass getStruct();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Struct#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Struct#getName()
   * @see #getStruct()
   * @generated
   */
  EAttribute getStruct_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Struct#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.xtext.example.mydsl.myDsl.Struct#getFields()
   * @see #getStruct()
   * @generated
   */
  EReference getStruct_Fields();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PeriodicSensors <em>Periodic Sensors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Periodic Sensors</em>'.
   * @see org.xtext.example.mydsl.myDsl.PeriodicSensors
   * @generated
   */
  EClass getPeriodicSensors();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.PeriodicSensors#getSensorName <em>Sensor Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sensor Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.PeriodicSensors#getSensorName()
   * @see #getPeriodicSensors()
   * @generated
   */
  EReference getPeriodicSensors_SensorName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.PeriodicSensors#getGenerateInfo <em>Generate Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generate Info</em>'.
   * @see org.xtext.example.mydsl.myDsl.PeriodicSensors#getGenerateInfo()
   * @see #getPeriodicSensors()
   * @generated
   */
  EReference getPeriodicSensors_GenerateInfo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EventSensors <em>Event Sensors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Sensors</em>'.
   * @see org.xtext.example.mydsl.myDsl.EventSensors
   * @generated
   */
  EClass getEventSensors();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EventSensors#getSensorName <em>Sensor Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sensor Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.EventSensors#getSensorName()
   * @see #getEventSensors()
   * @generated
   */
  EReference getEventSensors_SensorName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.EventSensors#getGenerateInfo <em>Generate Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generate Info</em>'.
   * @see org.xtext.example.mydsl.myDsl.EventSensors#getGenerateInfo()
   * @see #getEventSensors()
   * @generated
   */
  EReference getEventSensors_GenerateInfo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.EventSensors#getEventConditions <em>Event Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event Conditions</em>'.
   * @see org.xtext.example.mydsl.myDsl.EventSensors#getEventConditions()
   * @see #getEventSensors()
   * @generated
   */
  EReference getEventSensors_EventConditions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EventConditions <em>Event Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Conditions</em>'.
   * @see org.xtext.example.mydsl.myDsl.EventConditions
   * @generated
   */
  EClass getEventConditions();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.EventConditions#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.EventConditions#getName()
   * @see #getEventConditions()
   * @generated
   */
  EAttribute getEventConditions_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.EventConditions#getEventConditions <em>Event Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event Conditions</em>'.
   * @see org.xtext.example.mydsl.myDsl.EventConditions#getEventConditions()
   * @see #getEventConditions()
   * @generated
   */
  EReference getEventConditions_EventConditions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalServiceName <em>In Built Computational Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Built Computational Service Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InBuiltComputationalServiceName
   * @generated
   */
  EClass getInBuiltComputationalServiceName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.InBuiltComputationalServiceName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InBuiltComputationalServiceName#getName()
   * @see #getInBuiltComputationalServiceName()
   * @generated
   */
  EAttribute getInBuiltComputationalServiceName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EntityName <em>Entity Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.EntityName
   * @generated
   */
  EClass getEntityName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.EntityName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.EntityName#getName()
   * @see #getEntityName()
   * @generated
   */
  EAttribute getEntityName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Generate <em>Generate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generate</em>'.
   * @see org.xtext.example.mydsl.myDsl.Generate
   * @generated
   */
  EClass getGenerate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Generate#getSourceName <em>Source Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Generate#getSourceName()
   * @see #getGenerate()
   * @generated
   */
  EReference getGenerate_SourceName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Generate#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Generate#getType()
   * @see #getGenerate()
   * @generated
   */
  EReference getGenerate_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SourceName <em>Source Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.SourceName
   * @generated
   */
  EClass getSourceName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.SourceName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.SourceName#getName()
   * @see #getSourceName()
   * @generated
   */
  EAttribute getSourceName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Actuator <em>Actuator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actuator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Actuator
   * @generated
   */
  EClass getActuator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Actuator#getActuatorName <em>Actuator Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actuator Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Actuator#getActuatorName()
   * @see #getActuator()
   * @generated
   */
  EReference getActuator_ActuatorName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Actuator#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.xtext.example.mydsl.myDsl.Actuator#getActions()
   * @see #getActuator()
   * @generated
   */
  EReference getActuator_Actions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Action#getActionName <em>Action Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action#getActionName()
   * @see #getAction()
   * @generated
   */
  EReference getAction_ActionName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Action#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action#getParameters()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ActionName <em>Action Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionName
   * @generated
   */
  EClass getActionName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ActionName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActionName#getName()
   * @see #getActionName()
   * @generated
   */
  EAttribute getActionName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parameters#getParameterName <em>Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameters#getParameterName()
   * @see #getParameters()
   * @generated
   */
  EReference getParameters_ParameterName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parameters#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameters#getType()
   * @see #getParameters()
   * @generated
   */
  EReference getParameters_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ParameterName <em>Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ParameterName
   * @generated
   */
  EClass getParameterName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ParameterName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ParameterName#getName()
   * @see #getParameterName()
   * @generated
   */
  EAttribute getParameterName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StorageService <em>Storage Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Storage Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.StorageService
   * @generated
   */
  EClass getStorageService();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.StorageService#getStorageServiceName <em>Storage Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Storage Service Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.StorageService#getStorageServiceName()
   * @see #getStorageService()
   * @generated
   */
  EReference getStorageService_StorageServiceName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.StorageService#getDataAccesses <em>Data Accesses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Accesses</em>'.
   * @see org.xtext.example.mydsl.myDsl.StorageService#getDataAccesses()
   * @see #getStorageService()
   * @generated
   */
  EReference getStorageService_DataAccesses();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DataAccess <em>Data Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Access</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccess
   * @generated
   */
  EClass getDataAccess();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccess#getSourceName <em>Source Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccess#getSourceName()
   * @see #getDataAccess()
   * @generated
   */
  EReference getDataAccess_SourceName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccess#getDataAccessType <em>Data Access Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Access Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccess#getDataAccessType()
   * @see #getDataAccess()
   * @generated
   */
  EReference getDataAccess_DataAccessType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DataAccess#getDataItem <em>Data Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Item</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccess#getDataItem()
   * @see #getDataAccess()
   * @generated
   */
  EAttribute getDataAccess_DataItem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.DataAccess#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccess#getType()
   * @see #getDataAccess()
   * @generated
   */
  EReference getDataAccess_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DataAccess#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataAccess#getActions()
   * @see #getDataAccess()
   * @generated
   */
  EReference getDataAccess_Actions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Type#getPrimitiveDataType <em>Primitive Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitive Data Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type#getPrimitiveDataType()
   * @see #getType()
   * @generated
   */
  EReference getType_PrimitiveDataType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.OperationName <em>Operation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.OperationName
   * @generated
   */
  EClass getOperationName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.OperationName#getOPERATION_NAME <em>OPERATION NAME</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>OPERATION NAME</em>'.
   * @see org.xtext.example.mydsl.myDsl.OperationName#getOPERATION_NAME()
   * @see #getOperationName()
   * @generated
   */
  EAttribute getOperationName_OPERATION_NAME();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType <em>Primitive Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Data Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrimitiveDataType
   * @generated
   */
  EClass getPrimitiveDataType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getINTEGER <em>INTEGER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>INTEGER</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrimitiveDataType#getINTEGER()
   * @see #getPrimitiveDataType()
   * @generated
   */
  EAttribute getPrimitiveDataType_INTEGER();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getBOOLEAN <em>BOOLEAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>BOOLEAN</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrimitiveDataType#getBOOLEAN()
   * @see #getPrimitiveDataType()
   * @generated
   */
  EAttribute getPrimitiveDataType_BOOLEAN();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getSTRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>STRING</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrimitiveDataType#getSTRING()
   * @see #getPrimitiveDataType()
   * @generated
   */
  EAttribute getPrimitiveDataType_STRING();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getLONG <em>LONG</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LONG</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrimitiveDataType#getLONG()
   * @see #getPrimitiveDataType()
   * @generated
   */
  EAttribute getPrimitiveDataType_LONG();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getDOUBLE <em>DOUBLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>DOUBLE</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrimitiveDataType#getDOUBLE()
   * @see #getPrimitiveDataType()
   * @generated
   */
  EAttribute getPrimitiveDataType_DOUBLE();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.PrimitiveDataType#getStructDef <em>Struct Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Struct Def</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrimitiveDataType#getStructDef()
   * @see #getPrimitiveDataType()
   * @generated
   */
  EReference getPrimitiveDataType_StructDef();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SpecImpl <em>Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SpecImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSpec()
     * @generated
     */
    EClass SPEC = eINSTANCE.getSpec();

    /**
     * The meta object literal for the '<em><b>Voc Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__VOC_SPEC = eINSTANCE.getSpec_VocSpec();

    /**
     * The meta object literal for the '<em><b>Interaction Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__INTERACTION_SPEC = eINSTANCE.getSpec_InteractionSpec();

    /**
     * The meta object literal for the '<em><b>Arch Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__ARCH_SPEC = eINSTANCE.getSpec_ArchSpec();

    /**
     * The meta object literal for the '<em><b>Network Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__NETWORK_SPEC = eINSTANCE.getSpec_NetworkSpec();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeploymentSpecImpl <em>Deployment Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeploymentSpecImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeploymentSpec()
     * @generated
     */
    EClass DEPLOYMENT_SPEC = eINSTANCE.getDeploymentSpec();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_SPEC__DEVICES = eINSTANCE.getDeploymentSpec_Devices();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeviceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDevice()
     * @generated
     */
    EClass DEVICE = eINSTANCE.getDevice();

    /**
     * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__DEVICE_NAME = eINSTANCE.getDevice_DeviceName();

    /**
     * The meta object literal for the '<em><b>Device Location</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__DEVICE_LOCATION = eINSTANCE.getDevice_DeviceLocation();

    /**
     * The meta object literal for the '<em><b>Platform Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__PLATFORM_TYPE = eINSTANCE.getDevice_PlatformType();

    /**
     * The meta object literal for the '<em><b>Device Abilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__DEVICE_ABILITIES = eINSTANCE.getDevice_DeviceAbilities();

    /**
     * The meta object literal for the '<em><b>Device Protocol</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__DEVICE_PROTOCOL = eINSTANCE.getDevice_DeviceProtocol();

    /**
     * The meta object literal for the '<em><b>Database Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__DATABASE_NAME = eINSTANCE.getDevice_DatabaseName();

    /**
     * The meta object literal for the '<em><b>Device Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__DEVICE_DESCRIPTION = eINSTANCE.getDevice_DeviceDescription();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceDescriptionImpl <em>Device Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeviceDescriptionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeviceDescription()
     * @generated
     */
    EClass DEVICE_DESCRIPTION = eINSTANCE.getDeviceDescription();

    /**
     * The meta object literal for the '<em><b>Devicedescription Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_DESCRIPTION__DEVICEDESCRIPTION_TEXT = eINSTANCE.getDeviceDescription_DevicedescriptionText();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceLocationImpl <em>Device Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeviceLocationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeviceLocation()
     * @generated
     */
    EClass DEVICE_LOCATION = eINSTANCE.getDeviceLocation();

    /**
     * The meta object literal for the '<em><b>Region Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_LOCATION__REGION_LABEL = eINSTANCE.getDeviceLocation_RegionLabel();

    /**
     * The meta object literal for the '<em><b>Region Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_LOCATION__REGION_VALUE = eINSTANCE.getDeviceLocation_RegionValue();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PlatformTypeImpl <em>Platform Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PlatformTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlatformType()
     * @generated
     */
    EClass PLATFORM_TYPE = eINSTANCE.getPlatformType();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLATFORM_TYPE__DEVICE_TYPE = eINSTANCE.getPlatformType_DeviceType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DatabaseNameImpl <em>Database Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DatabaseNameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDatabaseName()
     * @generated
     */
    EClass DATABASE_NAME = eINSTANCE.getDatabaseName();

    /**
     * The meta object literal for the '<em><b>Installed Database</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_NAME__INSTALLED_DATABASE = eINSTANCE.getDatabaseName_InstalledDatabase();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceProtocolImpl <em>Device Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeviceProtocolImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeviceProtocol()
     * @generated
     */
    EClass DEVICE_PROTOCOL = eINSTANCE.getDeviceProtocol();

    /**
     * The meta object literal for the '<em><b>Protocol Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_PROTOCOL__PROTOCOL_NAME = eINSTANCE.getDeviceProtocol_ProtocolName();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeviceAbilitiesImpl <em>Device Abilities</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeviceAbilitiesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeviceAbilities()
     * @generated
     */
    EClass DEVICE_ABILITIES = eINSTANCE.getDeviceAbilities();

    /**
     * The meta object literal for the '<em><b>Device Entity Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_ABILITIES__DEVICE_ENTITY_NAME = eINSTANCE.getDeviceAbilities_DeviceEntityName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_ABILITIES__NAME = eINSTANCE.getDeviceAbilities_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl <em>Interaction Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InteractionSpecImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInteractionSpec()
     * @generated
     */
    EClass INTERACTION_SPEC = eINSTANCE.getInteractionSpec();

    /**
     * The meta object literal for the '<em><b>Interaction Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_SPEC__INTERACTION_NAME = eINSTANCE.getInteractionSpec_InteractionName();

    /**
     * The meta object literal for the '<em><b>Interaction Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_SPEC__INTERACTION_COMMAND = eINSTANCE.getInteractionSpec_InteractionCommand();

    /**
     * The meta object literal for the '<em><b>Interaction Request</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_SPEC__INTERACTION_REQUEST = eINSTANCE.getInteractionSpec_InteractionRequest();

    /**
     * The meta object literal for the '<em><b>Interaction Notify</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_SPEC__INTERACTION_NOTIFY = eINSTANCE.getInteractionSpec_InteractionNotify();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InteractionActionImpl <em>Interaction Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InteractionActionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInteractionAction()
     * @generated
     */
    EClass INTERACTION_ACTION = eINSTANCE.getInteractionAction();

    /**
     * The meta object literal for the '<em><b>Action Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_ACTION__ACTION_NAME = eINSTANCE.getInteractionAction_ActionName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_ACTION__PARAMETERS = eINSTANCE.getInteractionAction_Parameters();

    /**
     * The meta object literal for the '<em><b>Interaction Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_ACTION__INTERACTION_ENTITY = eINSTANCE.getInteractionAction_InteractionEntity();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ArchSpecImpl <em>Arch Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ArchSpecImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArchSpec()
     * @generated
     */
    EClass ARCH_SPEC = eINSTANCE.getArchSpec();

    /**
     * The meta object literal for the '<em><b>Structs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCH_SPEC__STRUCTS = eINSTANCE.getArchSpec_Structs();

    /**
     * The meta object literal for the '<em><b>Inbuilt Computational Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE = eINSTANCE.getArchSpec_InbuiltComputationalService();

    /**
     * The meta object literal for the '<em><b>Custom Computational Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE = eINSTANCE.getArchSpec_CustomComputationalService();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceImpl <em>In Built Computational Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInBuiltComputationalService()
     * @generated
     */
    EClass IN_BUILT_COMPUTATIONAL_SERVICE = eINSTANCE.getInBuiltComputationalService();

    /**
     * The meta object literal for the '<em><b>In Built Computational Service Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME = eINSTANCE.getInBuiltComputationalService_InBuiltComputationalServiceName();

    /**
     * The meta object literal for the '<em><b>Consumes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES = eINSTANCE.getInBuiltComputationalService_Consumes();

    /**
     * The meta object literal for the '<em><b>Operation Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_BUILT_COMPUTATIONAL_SERVICE__OPERATION_NAME = eINSTANCE.getInBuiltComputationalService_OperationName();

    /**
     * The meta object literal for the '<em><b>Operation Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_BUILT_COMPUTATIONAL_SERVICE__OPERATION_PARAMETER = eINSTANCE.getInBuiltComputationalService_OperationParameter();

    /**
     * The meta object literal for the '<em><b>Generate Info</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO = eINSTANCE.getInBuiltComputationalService_GenerateInfo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl <em>custom Computational Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.customComputationalServiceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getcustomComputationalService()
     * @generated
     */
    EClass CUSTOM_COMPUTATIONAL_SERVICE = eINSTANCE.getcustomComputationalService();

    /**
     * The meta object literal for the '<em><b>Custom Computational Service Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME = eINSTANCE.getcustomComputationalService_CustomComputationalServiceName();

    /**
     * The meta object literal for the '<em><b>Consumes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES = eINSTANCE.getcustomComputationalService_Consumes();

    /**
     * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS = eINSTANCE.getcustomComputationalService_Requests();

    /**
     * The meta object literal for the '<em><b>Generate Info</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO = eINSTANCE.getcustomComputationalService_GenerateInfo();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS = eINSTANCE.getcustomComputationalService_Commands();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RequestImpl <em>Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RequestImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRequest()
     * @generated
     */
    EClass REQUEST = eINSTANCE.getRequest();

    /**
     * The meta object literal for the '<em><b>Requestname</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST__REQUESTNAME = eINSTANCE.getRequest_Requestname();

    /**
     * The meta object literal for the '<em><b>Storage For Request</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST__STORAGE_FOR_REQUEST = eINSTANCE.getRequest_StorageForRequest();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ConsumeForInBuiltImpl <em>Consume For In Built</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ConsumeForInBuiltImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConsumeForInBuilt()
     * @generated
     */
    EClass CONSUME_FOR_IN_BUILT = eINSTANCE.getConsumeForInBuilt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSUME_FOR_IN_BUILT__NAME = eINSTANCE.getConsumeForInBuilt_Name();

    /**
     * The meta object literal for the '<em><b>Sensor For Consume</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME = eINSTANCE.getConsumeForInBuilt_SensorForConsume();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ConsumeImpl <em>Consume</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ConsumeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConsume()
     * @generated
     */
    EClass CONSUME = eINSTANCE.getConsume();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSUME__NAME = eINSTANCE.getConsume_Name();

    /**
     * The meta object literal for the '<em><b>From Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSUME__FROM_NAME = eINSTANCE.getConsume_FromName();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CommandImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Command Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__COMMAND_NAME = eINSTANCE.getCommand_CommandName();

    /**
     * The meta object literal for the '<em><b>Commandparameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__COMMANDPARAMETER = eINSTANCE.getCommand_Commandparameter();

    /**
     * The meta object literal for the '<em><b>Actuator For Command</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__ACTUATOR_FOR_COMMAND = eINSTANCE.getCommand_ActuatorForCommand();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CommandParameterImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommandParameter()
     * @generated
     */
    EClass COMMAND_PARAMETER = eINSTANCE.getCommandParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_PARAMETER__NAME = eINSTANCE.getCommandParameter_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_PARAMETER__PARAMETER = eINSTANCE.getCommandParameter_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VocSpecImpl <em>Voc Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VocSpecImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVocSpec()
     * @generated
     */
    EClass VOC_SPEC = eINSTANCE.getVocSpec();

    /**
     * The meta object literal for the '<em><b>Structs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOC_SPEC__STRUCTS = eINSTANCE.getVocSpec_Structs();

    /**
     * The meta object literal for the '<em><b>Periodic Sensors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOC_SPEC__PERIODIC_SENSORS = eINSTANCE.getVocSpec_PeriodicSensors();

    /**
     * The meta object literal for the '<em><b>Event Sensors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOC_SPEC__EVENT_SENSORS = eINSTANCE.getVocSpec_EventSensors();

    /**
     * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOC_SPEC__ACTUATORS = eINSTANCE.getVocSpec_Actuators();

    /**
     * The meta object literal for the '<em><b>Storage Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOC_SPEC__STORAGE_SERVICE = eINSTANCE.getVocSpec_StorageService();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RegionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRegion()
     * @generated
     */
    EClass REGION = eINSTANCE.getRegion();

    /**
     * The meta object literal for the '<em><b>Region Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__REGION_LABEL = eINSTANCE.getRegion_RegionLabel();

    /**
     * The meta object literal for the '<em><b>Region Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__REGION_TYPE = eINSTANCE.getRegion_RegionType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RegionLabelImpl <em>Region Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RegionLabelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRegionLabel()
     * @generated
     */
    EClass REGION_LABEL = eINSTANCE.getRegionLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGION_LABEL__NAME = eINSTANCE.getRegionLabel_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StructImpl <em>Struct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StructImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStruct()
     * @generated
     */
    EClass STRUCT = eINSTANCE.getStruct();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT__NAME = eINSTANCE.getStruct_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT__FIELDS = eINSTANCE.getStruct_Fields();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FieldImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PeriodicSensorsImpl <em>Periodic Sensors</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PeriodicSensorsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPeriodicSensors()
     * @generated
     */
    EClass PERIODIC_SENSORS = eINSTANCE.getPeriodicSensors();

    /**
     * The meta object literal for the '<em><b>Sensor Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERIODIC_SENSORS__SENSOR_NAME = eINSTANCE.getPeriodicSensors_SensorName();

    /**
     * The meta object literal for the '<em><b>Generate Info</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERIODIC_SENSORS__GENERATE_INFO = eINSTANCE.getPeriodicSensors_GenerateInfo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EventSensorsImpl <em>Event Sensors</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EventSensorsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEventSensors()
     * @generated
     */
    EClass EVENT_SENSORS = eINSTANCE.getEventSensors();

    /**
     * The meta object literal for the '<em><b>Sensor Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_SENSORS__SENSOR_NAME = eINSTANCE.getEventSensors_SensorName();

    /**
     * The meta object literal for the '<em><b>Generate Info</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_SENSORS__GENERATE_INFO = eINSTANCE.getEventSensors_GenerateInfo();

    /**
     * The meta object literal for the '<em><b>Event Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_SENSORS__EVENT_CONDITIONS = eINSTANCE.getEventSensors_EventConditions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EventConditionsImpl <em>Event Conditions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EventConditionsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEventConditions()
     * @generated
     */
    EClass EVENT_CONDITIONS = eINSTANCE.getEventConditions();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_CONDITIONS__NAME = eINSTANCE.getEventConditions_Name();

    /**
     * The meta object literal for the '<em><b>Event Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_CONDITIONS__EVENT_CONDITIONS = eINSTANCE.getEventConditions_EventConditions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceNameImpl <em>In Built Computational Service Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InBuiltComputationalServiceNameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInBuiltComputationalServiceName()
     * @generated
     */
    EClass IN_BUILT_COMPUTATIONAL_SERVICE_NAME = eINSTANCE.getInBuiltComputationalServiceName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_BUILT_COMPUTATIONAL_SERVICE_NAME__NAME = eINSTANCE.getInBuiltComputationalServiceName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EntityNameImpl <em>Entity Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EntityNameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEntityName()
     * @generated
     */
    EClass ENTITY_NAME = eINSTANCE.getEntityName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_NAME__NAME = eINSTANCE.getEntityName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.GenerateImpl <em>Generate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.GenerateImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGenerate()
     * @generated
     */
    EClass GENERATE = eINSTANCE.getGenerate();

    /**
     * The meta object literal for the '<em><b>Source Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATE__SOURCE_NAME = eINSTANCE.getGenerate_SourceName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATE__TYPE = eINSTANCE.getGenerate_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SourceNameImpl <em>Source Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SourceNameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSourceName()
     * @generated
     */
    EClass SOURCE_NAME = eINSTANCE.getSourceName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE_NAME__NAME = eINSTANCE.getSourceName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActuatorImpl <em>Actuator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActuatorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActuator()
     * @generated
     */
    EClass ACTUATOR = eINSTANCE.getActuator();

    /**
     * The meta object literal for the '<em><b>Actuator Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUATOR__ACTUATOR_NAME = eINSTANCE.getActuator_ActuatorName();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUATOR__ACTIONS = eINSTANCE.getActuator_Actions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Action Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ACTION_NAME = eINSTANCE.getAction_ActionName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActionNameImpl <em>Action Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActionNameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActionName()
     * @generated
     */
    EClass ACTION_NAME = eINSTANCE.getActionName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_NAME__NAME = eINSTANCE.getActionName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParametersImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getParameters();

    /**
     * The meta object literal for the '<em><b>Parameter Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS__PARAMETER_NAME = eINSTANCE.getParameters_ParameterName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS__TYPE = eINSTANCE.getParameters_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterNameImpl <em>Parameter Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParameterNameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameterName()
     * @generated
     */
    EClass PARAMETER_NAME = eINSTANCE.getParameterName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_NAME__NAME = eINSTANCE.getParameterName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StorageServiceImpl <em>Storage Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StorageServiceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStorageService()
     * @generated
     */
    EClass STORAGE_SERVICE = eINSTANCE.getStorageService();

    /**
     * The meta object literal for the '<em><b>Storage Service Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORAGE_SERVICE__STORAGE_SERVICE_NAME = eINSTANCE.getStorageService_StorageServiceName();

    /**
     * The meta object literal for the '<em><b>Data Accesses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORAGE_SERVICE__DATA_ACCESSES = eINSTANCE.getStorageService_DataAccesses();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DataAccessImpl <em>Data Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DataAccessImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataAccess()
     * @generated
     */
    EClass DATA_ACCESS = eINSTANCE.getDataAccess();

    /**
     * The meta object literal for the '<em><b>Source Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS__SOURCE_NAME = eINSTANCE.getDataAccess_SourceName();

    /**
     * The meta object literal for the '<em><b>Data Access Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS__DATA_ACCESS_TYPE = eINSTANCE.getDataAccess_DataAccessType();

    /**
     * The meta object literal for the '<em><b>Data Item</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ACCESS__DATA_ITEM = eINSTANCE.getDataAccess_DataItem();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS__TYPE = eINSTANCE.getDataAccess_Type();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS__ACTIONS = eINSTANCE.getDataAccess_Actions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Primitive Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__PRIMITIVE_DATA_TYPE = eINSTANCE.getType_PrimitiveDataType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OperationNameImpl <em>Operation Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OperationNameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOperationName()
     * @generated
     */
    EClass OPERATION_NAME = eINSTANCE.getOperationName();

    /**
     * The meta object literal for the '<em><b>OPERATION NAME</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_NAME__OPERATION_NAME = eINSTANCE.getOperationName_OPERATION_NAME();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PrimitiveDataTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrimitiveDataType()
     * @generated
     */
    EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

    /**
     * The meta object literal for the '<em><b>INTEGER</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DATA_TYPE__INTEGER = eINSTANCE.getPrimitiveDataType_INTEGER();

    /**
     * The meta object literal for the '<em><b>BOOLEAN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DATA_TYPE__BOOLEAN = eINSTANCE.getPrimitiveDataType_BOOLEAN();

    /**
     * The meta object literal for the '<em><b>STRING</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DATA_TYPE__STRING = eINSTANCE.getPrimitiveDataType_STRING();

    /**
     * The meta object literal for the '<em><b>LONG</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DATA_TYPE__LONG = eINSTANCE.getPrimitiveDataType_LONG();

    /**
     * The meta object literal for the '<em><b>DOUBLE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DATA_TYPE__DOUBLE = eINSTANCE.getPrimitiveDataType_DOUBLE();

    /**
     * The meta object literal for the '<em><b>Struct Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_DATA_TYPE__STRUCT_DEF = eINSTANCE.getPrimitiveDataType_StructDef();

  }

} //MyDslPackage
