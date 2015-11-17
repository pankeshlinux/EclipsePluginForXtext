/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.SPEC: return createSpec();
      case MyDslPackage.DEPLOYMENT_SPEC: return createDeploymentSpec();
      case MyDslPackage.DEVICE: return createDevice();
      case MyDslPackage.DEVICE_DESCRIPTION: return createDeviceDescription();
      case MyDslPackage.DEVICE_LOCATION: return createDeviceLocation();
      case MyDslPackage.PLATFORM_TYPE: return createPlatformType();
      case MyDslPackage.DATABASE_NAME: return createDatabaseName();
      case MyDslPackage.DEVICE_PROTOCOL: return createDeviceProtocol();
      case MyDslPackage.DEVICE_ABILITIES: return createDeviceAbilities();
      case MyDslPackage.INTERACTION_SPEC: return createInteractionSpec();
      case MyDslPackage.INTERACTION_ACTION: return createInteractionAction();
      case MyDslPackage.ARCH_SPEC: return createArchSpec();
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE: return createInBuiltComputationalService();
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE: return createcustomComputationalService();
      case MyDslPackage.REQUEST: return createRequest();
      case MyDslPackage.CONSUME_FOR_IN_BUILT: return createConsumeForInBuilt();
      case MyDslPackage.CONSUME: return createConsume();
      case MyDslPackage.COMMAND: return createCommand();
      case MyDslPackage.COMMAND_PARAMETER: return createCommandParameter();
      case MyDslPackage.VOC_SPEC: return createVocSpec();
      case MyDslPackage.REGION: return createRegion();
      case MyDslPackage.REGION_LABEL: return createRegionLabel();
      case MyDslPackage.STRUCT: return createStruct();
      case MyDslPackage.FIELD: return createField();
      case MyDslPackage.PERIODIC_SENSORS: return createPeriodicSensors();
      case MyDslPackage.EVENT_SENSORS: return createEventSensors();
      case MyDslPackage.EVENT_CONDITIONS: return createEventConditions();
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE_NAME: return createInBuiltComputationalServiceName();
      case MyDslPackage.ENTITY_NAME: return createEntityName();
      case MyDslPackage.GENERATE: return createGenerate();
      case MyDslPackage.SOURCE_NAME: return createSourceName();
      case MyDslPackage.ACTUATOR: return createActuator();
      case MyDslPackage.ACTION: return createAction();
      case MyDslPackage.ACTION_NAME: return createActionName();
      case MyDslPackage.PARAMETERS: return createParameters();
      case MyDslPackage.PARAMETER_NAME: return createParameterName();
      case MyDslPackage.STORAGE_SERVICE: return createStorageService();
      case MyDslPackage.DATA_ACCESS: return createDataAccess();
      case MyDslPackage.TYPE: return createType();
      case MyDslPackage.OPERATION_NAME: return createOperationName();
      case MyDslPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spec createSpec()
  {
    SpecImpl spec = new SpecImpl();
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentSpec createDeploymentSpec()
  {
    DeploymentSpecImpl deploymentSpec = new DeploymentSpecImpl();
    return deploymentSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceDescription createDeviceDescription()
  {
    DeviceDescriptionImpl deviceDescription = new DeviceDescriptionImpl();
    return deviceDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceLocation createDeviceLocation()
  {
    DeviceLocationImpl deviceLocation = new DeviceLocationImpl();
    return deviceLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformType createPlatformType()
  {
    PlatformTypeImpl platformType = new PlatformTypeImpl();
    return platformType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseName createDatabaseName()
  {
    DatabaseNameImpl databaseName = new DatabaseNameImpl();
    return databaseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceProtocol createDeviceProtocol()
  {
    DeviceProtocolImpl deviceProtocol = new DeviceProtocolImpl();
    return deviceProtocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceAbilities createDeviceAbilities()
  {
    DeviceAbilitiesImpl deviceAbilities = new DeviceAbilitiesImpl();
    return deviceAbilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionSpec createInteractionSpec()
  {
    InteractionSpecImpl interactionSpec = new InteractionSpecImpl();
    return interactionSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionAction createInteractionAction()
  {
    InteractionActionImpl interactionAction = new InteractionActionImpl();
    return interactionAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchSpec createArchSpec()
  {
    ArchSpecImpl archSpec = new ArchSpecImpl();
    return archSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InBuiltComputationalService createInBuiltComputationalService()
  {
    InBuiltComputationalServiceImpl inBuiltComputationalService = new InBuiltComputationalServiceImpl();
    return inBuiltComputationalService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public customComputationalService createcustomComputationalService()
  {
    customComputationalServiceImpl customComputationalService = new customComputationalServiceImpl();
    return customComputationalService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Request createRequest()
  {
    RequestImpl request = new RequestImpl();
    return request;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsumeForInBuilt createConsumeForInBuilt()
  {
    ConsumeForInBuiltImpl consumeForInBuilt = new ConsumeForInBuiltImpl();
    return consumeForInBuilt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Consume createConsume()
  {
    ConsumeImpl consume = new ConsumeImpl();
    return consume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandParameter createCommandParameter()
  {
    CommandParameterImpl commandParameter = new CommandParameterImpl();
    return commandParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VocSpec createVocSpec()
  {
    VocSpecImpl vocSpec = new VocSpecImpl();
    return vocSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region createRegion()
  {
    RegionImpl region = new RegionImpl();
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegionLabel createRegionLabel()
  {
    RegionLabelImpl regionLabel = new RegionLabelImpl();
    return regionLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct createStruct()
  {
    StructImpl struct = new StructImpl();
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PeriodicSensors createPeriodicSensors()
  {
    PeriodicSensorsImpl periodicSensors = new PeriodicSensorsImpl();
    return periodicSensors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSensors createEventSensors()
  {
    EventSensorsImpl eventSensors = new EventSensorsImpl();
    return eventSensors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventConditions createEventConditions()
  {
    EventConditionsImpl eventConditions = new EventConditionsImpl();
    return eventConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InBuiltComputationalServiceName createInBuiltComputationalServiceName()
  {
    InBuiltComputationalServiceNameImpl inBuiltComputationalServiceName = new InBuiltComputationalServiceNameImpl();
    return inBuiltComputationalServiceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityName createEntityName()
  {
    EntityNameImpl entityName = new EntityNameImpl();
    return entityName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generate createGenerate()
  {
    GenerateImpl generate = new GenerateImpl();
    return generate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceName createSourceName()
  {
    SourceNameImpl sourceName = new SourceNameImpl();
    return sourceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actuator createActuator()
  {
    ActuatorImpl actuator = new ActuatorImpl();
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionName createActionName()
  {
    ActionNameImpl actionName = new ActionNameImpl();
    return actionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters createParameters()
  {
    ParametersImpl parameters = new ParametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterName createParameterName()
  {
    ParameterNameImpl parameterName = new ParameterNameImpl();
    return parameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StorageService createStorageService()
  {
    StorageServiceImpl storageService = new StorageServiceImpl();
    return storageService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAccess createDataAccess()
  {
    DataAccessImpl dataAccess = new DataAccessImpl();
    return dataAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationName createOperationName()
  {
    OperationNameImpl operationName = new OperationNameImpl();
    return operationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveDataType createPrimitiveDataType()
  {
    PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
    return primitiveDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
