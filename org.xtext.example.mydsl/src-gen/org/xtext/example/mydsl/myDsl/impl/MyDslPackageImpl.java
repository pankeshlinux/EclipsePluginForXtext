/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.ActionName;
import org.xtext.example.mydsl.myDsl.Actuator;
import org.xtext.example.mydsl.myDsl.ArchSpec;
import org.xtext.example.mydsl.myDsl.Command;
import org.xtext.example.mydsl.myDsl.CommandParameter;
import org.xtext.example.mydsl.myDsl.Consume;
import org.xtext.example.mydsl.myDsl.ConsumeForInBuilt;
import org.xtext.example.mydsl.myDsl.DataAccess;
import org.xtext.example.mydsl.myDsl.DatabaseName;
import org.xtext.example.mydsl.myDsl.DeploymentSpec;
import org.xtext.example.mydsl.myDsl.Device;
import org.xtext.example.mydsl.myDsl.DeviceAbilities;
import org.xtext.example.mydsl.myDsl.DeviceDescription;
import org.xtext.example.mydsl.myDsl.DeviceLocation;
import org.xtext.example.mydsl.myDsl.DeviceProtocol;
import org.xtext.example.mydsl.myDsl.EntityName;
import org.xtext.example.mydsl.myDsl.EventConditions;
import org.xtext.example.mydsl.myDsl.EventSensors;
import org.xtext.example.mydsl.myDsl.Field;
import org.xtext.example.mydsl.myDsl.Generate;
import org.xtext.example.mydsl.myDsl.InBuiltComputationalService;
import org.xtext.example.mydsl.myDsl.InBuiltComputationalServiceName;
import org.xtext.example.mydsl.myDsl.InteractionAction;
import org.xtext.example.mydsl.myDsl.InteractionSpec;
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.OperationName;
import org.xtext.example.mydsl.myDsl.ParameterName;
import org.xtext.example.mydsl.myDsl.Parameters;
import org.xtext.example.mydsl.myDsl.PeriodicSensors;
import org.xtext.example.mydsl.myDsl.PlatformType;
import org.xtext.example.mydsl.myDsl.PrimitiveDataType;
import org.xtext.example.mydsl.myDsl.Region;
import org.xtext.example.mydsl.myDsl.RegionLabel;
import org.xtext.example.mydsl.myDsl.Request;
import org.xtext.example.mydsl.myDsl.SourceName;
import org.xtext.example.mydsl.myDsl.Spec;
import org.xtext.example.mydsl.myDsl.StorageService;
import org.xtext.example.mydsl.myDsl.Struct;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.VocSpec;
import org.xtext.example.mydsl.myDsl.customComputationalService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceLocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass platformTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceProtocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceAbilitiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass archSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inBuiltComputationalServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customComputationalServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass consumeForInBuiltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass consumeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vocSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regionLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass periodicSensorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventSensorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventConditionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inBuiltComputationalServiceNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actuatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storageServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveDataTypeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    MyDslPackageImpl theMyDslPackage = (MyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpec()
  {
    return specEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpec_VocSpec()
  {
    return (EReference)specEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpec_InteractionSpec()
  {
    return (EReference)specEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpec_ArchSpec()
  {
    return (EReference)specEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpec_NetworkSpec()
  {
    return (EReference)specEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentSpec()
  {
    return deploymentSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentSpec_Devices()
  {
    return (EReference)deploymentSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevice()
  {
    return deviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_DeviceName()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_DeviceLocation()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_PlatformType()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_DeviceAbilities()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_DeviceProtocol()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_DatabaseName()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_DeviceDescription()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceDescription()
  {
    return deviceDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceDescription_DevicedescriptionText()
  {
    return (EAttribute)deviceDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceLocation()
  {
    return deviceLocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceLocation_RegionLabel()
  {
    return (EAttribute)deviceLocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceLocation_RegionValue()
  {
    return (EAttribute)deviceLocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlatformType()
  {
    return platformTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlatformType_DeviceType()
  {
    return (EAttribute)platformTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseName()
  {
    return databaseNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseName_InstalledDatabase()
  {
    return (EAttribute)databaseNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceProtocol()
  {
    return deviceProtocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceProtocol_ProtocolName()
  {
    return (EAttribute)deviceProtocolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceAbilities()
  {
    return deviceAbilitiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceAbilities_DeviceEntityName()
  {
    return (EReference)deviceAbilitiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceAbilities_Name()
  {
    return (EReference)deviceAbilitiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionSpec()
  {
    return interactionSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionSpec_InteractionName()
  {
    return (EReference)interactionSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionSpec_InteractionCommand()
  {
    return (EReference)interactionSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionSpec_InteractionRequest()
  {
    return (EReference)interactionSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionSpec_InteractionNotify()
  {
    return (EReference)interactionSpecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionAction()
  {
    return interactionActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionAction_ActionName()
  {
    return (EReference)interactionActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionAction_Parameters()
  {
    return (EReference)interactionActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionAction_InteractionEntity()
  {
    return (EReference)interactionActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchSpec()
  {
    return archSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchSpec_Structs()
  {
    return (EReference)archSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchSpec_InbuiltComputationalService()
  {
    return (EReference)archSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchSpec_CustomComputationalService()
  {
    return (EReference)archSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInBuiltComputationalService()
  {
    return inBuiltComputationalServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInBuiltComputationalService_InBuiltComputationalServiceName()
  {
    return (EReference)inBuiltComputationalServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInBuiltComputationalService_Consumes()
  {
    return (EReference)inBuiltComputationalServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInBuiltComputationalService_OperationName()
  {
    return (EReference)inBuiltComputationalServiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInBuiltComputationalService_OperationParameter()
  {
    return (EAttribute)inBuiltComputationalServiceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInBuiltComputationalService_GenerateInfo()
  {
    return (EReference)inBuiltComputationalServiceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcustomComputationalService()
  {
    return customComputationalServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcustomComputationalService_CustomComputationalServiceName()
  {
    return (EReference)customComputationalServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcustomComputationalService_Consumes()
  {
    return (EReference)customComputationalServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcustomComputationalService_Requests()
  {
    return (EReference)customComputationalServiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcustomComputationalService_GenerateInfo()
  {
    return (EReference)customComputationalServiceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcustomComputationalService_Commands()
  {
    return (EReference)customComputationalServiceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequest()
  {
    return requestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequest_Requestname()
  {
    return (EReference)requestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequest_StorageForRequest()
  {
    return (EReference)requestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConsumeForInBuilt()
  {
    return consumeForInBuiltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConsumeForInBuilt_Name()
  {
    return (EReference)consumeForInBuiltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConsumeForInBuilt_SensorForConsume()
  {
    return (EReference)consumeForInBuiltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConsume()
  {
    return consumeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConsume_Name()
  {
    return (EReference)consumeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConsume_FromName()
  {
    return (EReference)consumeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_CommandName()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Commandparameter()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_ActuatorForCommand()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommandParameter()
  {
    return commandParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandParameter_Name()
  {
    return (EReference)commandParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandParameter_Parameter()
  {
    return (EReference)commandParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVocSpec()
  {
    return vocSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVocSpec_Structs()
  {
    return (EReference)vocSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVocSpec_PeriodicSensors()
  {
    return (EReference)vocSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVocSpec_EventSensors()
  {
    return (EReference)vocSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVocSpec_Actuators()
  {
    return (EReference)vocSpecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVocSpec_StorageService()
  {
    return (EReference)vocSpecEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegion()
  {
    return regionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegion_RegionLabel()
  {
    return (EReference)regionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegion_RegionType()
  {
    return (EReference)regionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegionLabel()
  {
    return regionLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegionLabel_Name()
  {
    return (EAttribute)regionLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct()
  {
    return structEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStruct_Name()
  {
    return (EAttribute)structEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Fields()
  {
    return (EReference)structEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Name()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Type()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPeriodicSensors()
  {
    return periodicSensorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPeriodicSensors_SensorName()
  {
    return (EReference)periodicSensorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPeriodicSensors_GenerateInfo()
  {
    return (EReference)periodicSensorsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventSensors()
  {
    return eventSensorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventSensors_SensorName()
  {
    return (EReference)eventSensorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventSensors_GenerateInfo()
  {
    return (EReference)eventSensorsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventSensors_EventConditions()
  {
    return (EReference)eventSensorsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventConditions()
  {
    return eventConditionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventConditions_Name()
  {
    return (EAttribute)eventConditionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventConditions_EventConditions()
  {
    return (EReference)eventConditionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInBuiltComputationalServiceName()
  {
    return inBuiltComputationalServiceNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInBuiltComputationalServiceName_Name()
  {
    return (EAttribute)inBuiltComputationalServiceNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityName()
  {
    return entityNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityName_Name()
  {
    return (EAttribute)entityNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenerate()
  {
    return generateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenerate_SourceName()
  {
    return (EReference)generateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenerate_Type()
  {
    return (EReference)generateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSourceName()
  {
    return sourceNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSourceName_Name()
  {
    return (EAttribute)sourceNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActuator()
  {
    return actuatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActuator_ActuatorName()
  {
    return (EReference)actuatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActuator_Actions()
  {
    return (EReference)actuatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_ActionName()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Parameters()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionName()
  {
    return actionNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionName_Name()
  {
    return (EAttribute)actionNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameters()
  {
    return parametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameters_ParameterName()
  {
    return (EReference)parametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameters_Type()
  {
    return (EReference)parametersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterName()
  {
    return parameterNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterName_Name()
  {
    return (EAttribute)parameterNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStorageService()
  {
    return storageServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStorageService_StorageServiceName()
  {
    return (EReference)storageServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStorageService_DataAccesses()
  {
    return (EReference)storageServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataAccess()
  {
    return dataAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAccess_SourceName()
  {
    return (EReference)dataAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAccess_DataAccessType()
  {
    return (EReference)dataAccessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAccess_DataItem()
  {
    return (EAttribute)dataAccessEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAccess_Type()
  {
    return (EReference)dataAccessEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAccess_Actions()
  {
    return (EReference)dataAccessEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_PrimitiveDataType()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationName()
  {
    return operationNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationName_OPERATION_NAME()
  {
    return (EAttribute)operationNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveDataType()
  {
    return primitiveDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveDataType_INTEGER()
  {
    return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveDataType_BOOLEAN()
  {
    return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveDataType_STRING()
  {
    return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveDataType_LONG()
  {
    return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveDataType_DOUBLE()
  {
    return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveDataType_StructDef()
  {
    return (EReference)primitiveDataTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    specEClass = createEClass(SPEC);
    createEReference(specEClass, SPEC__VOC_SPEC);
    createEReference(specEClass, SPEC__INTERACTION_SPEC);
    createEReference(specEClass, SPEC__ARCH_SPEC);
    createEReference(specEClass, SPEC__NETWORK_SPEC);

    deploymentSpecEClass = createEClass(DEPLOYMENT_SPEC);
    createEReference(deploymentSpecEClass, DEPLOYMENT_SPEC__DEVICES);

    deviceEClass = createEClass(DEVICE);
    createEAttribute(deviceEClass, DEVICE__DEVICE_NAME);
    createEReference(deviceEClass, DEVICE__DEVICE_LOCATION);
    createEReference(deviceEClass, DEVICE__PLATFORM_TYPE);
    createEReference(deviceEClass, DEVICE__DEVICE_ABILITIES);
    createEReference(deviceEClass, DEVICE__DEVICE_PROTOCOL);
    createEReference(deviceEClass, DEVICE__DATABASE_NAME);
    createEReference(deviceEClass, DEVICE__DEVICE_DESCRIPTION);

    deviceDescriptionEClass = createEClass(DEVICE_DESCRIPTION);
    createEAttribute(deviceDescriptionEClass, DEVICE_DESCRIPTION__DEVICEDESCRIPTION_TEXT);

    deviceLocationEClass = createEClass(DEVICE_LOCATION);
    createEAttribute(deviceLocationEClass, DEVICE_LOCATION__REGION_LABEL);
    createEAttribute(deviceLocationEClass, DEVICE_LOCATION__REGION_VALUE);

    platformTypeEClass = createEClass(PLATFORM_TYPE);
    createEAttribute(platformTypeEClass, PLATFORM_TYPE__DEVICE_TYPE);

    databaseNameEClass = createEClass(DATABASE_NAME);
    createEAttribute(databaseNameEClass, DATABASE_NAME__INSTALLED_DATABASE);

    deviceProtocolEClass = createEClass(DEVICE_PROTOCOL);
    createEAttribute(deviceProtocolEClass, DEVICE_PROTOCOL__PROTOCOL_NAME);

    deviceAbilitiesEClass = createEClass(DEVICE_ABILITIES);
    createEReference(deviceAbilitiesEClass, DEVICE_ABILITIES__DEVICE_ENTITY_NAME);
    createEReference(deviceAbilitiesEClass, DEVICE_ABILITIES__NAME);

    interactionSpecEClass = createEClass(INTERACTION_SPEC);
    createEReference(interactionSpecEClass, INTERACTION_SPEC__INTERACTION_NAME);
    createEReference(interactionSpecEClass, INTERACTION_SPEC__INTERACTION_COMMAND);
    createEReference(interactionSpecEClass, INTERACTION_SPEC__INTERACTION_REQUEST);
    createEReference(interactionSpecEClass, INTERACTION_SPEC__INTERACTION_NOTIFY);

    interactionActionEClass = createEClass(INTERACTION_ACTION);
    createEReference(interactionActionEClass, INTERACTION_ACTION__ACTION_NAME);
    createEReference(interactionActionEClass, INTERACTION_ACTION__PARAMETERS);
    createEReference(interactionActionEClass, INTERACTION_ACTION__INTERACTION_ENTITY);

    archSpecEClass = createEClass(ARCH_SPEC);
    createEReference(archSpecEClass, ARCH_SPEC__STRUCTS);
    createEReference(archSpecEClass, ARCH_SPEC__INBUILT_COMPUTATIONAL_SERVICE);
    createEReference(archSpecEClass, ARCH_SPEC__CUSTOM_COMPUTATIONAL_SERVICE);

    inBuiltComputationalServiceEClass = createEClass(IN_BUILT_COMPUTATIONAL_SERVICE);
    createEReference(inBuiltComputationalServiceEClass, IN_BUILT_COMPUTATIONAL_SERVICE__IN_BUILT_COMPUTATIONAL_SERVICE_NAME);
    createEReference(inBuiltComputationalServiceEClass, IN_BUILT_COMPUTATIONAL_SERVICE__CONSUMES);
    createEReference(inBuiltComputationalServiceEClass, IN_BUILT_COMPUTATIONAL_SERVICE__OPERATION_NAME);
    createEAttribute(inBuiltComputationalServiceEClass, IN_BUILT_COMPUTATIONAL_SERVICE__OPERATION_PARAMETER);
    createEReference(inBuiltComputationalServiceEClass, IN_BUILT_COMPUTATIONAL_SERVICE__GENERATE_INFO);

    customComputationalServiceEClass = createEClass(CUSTOM_COMPUTATIONAL_SERVICE);
    createEReference(customComputationalServiceEClass, CUSTOM_COMPUTATIONAL_SERVICE__CUSTOM_COMPUTATIONAL_SERVICE_NAME);
    createEReference(customComputationalServiceEClass, CUSTOM_COMPUTATIONAL_SERVICE__CONSUMES);
    createEReference(customComputationalServiceEClass, CUSTOM_COMPUTATIONAL_SERVICE__REQUESTS);
    createEReference(customComputationalServiceEClass, CUSTOM_COMPUTATIONAL_SERVICE__GENERATE_INFO);
    createEReference(customComputationalServiceEClass, CUSTOM_COMPUTATIONAL_SERVICE__COMMANDS);

    requestEClass = createEClass(REQUEST);
    createEReference(requestEClass, REQUEST__REQUESTNAME);
    createEReference(requestEClass, REQUEST__STORAGE_FOR_REQUEST);

    consumeForInBuiltEClass = createEClass(CONSUME_FOR_IN_BUILT);
    createEReference(consumeForInBuiltEClass, CONSUME_FOR_IN_BUILT__NAME);
    createEReference(consumeForInBuiltEClass, CONSUME_FOR_IN_BUILT__SENSOR_FOR_CONSUME);

    consumeEClass = createEClass(CONSUME);
    createEReference(consumeEClass, CONSUME__NAME);
    createEReference(consumeEClass, CONSUME__FROM_NAME);

    commandEClass = createEClass(COMMAND);
    createEReference(commandEClass, COMMAND__COMMAND_NAME);
    createEReference(commandEClass, COMMAND__COMMANDPARAMETER);
    createEReference(commandEClass, COMMAND__ACTUATOR_FOR_COMMAND);

    commandParameterEClass = createEClass(COMMAND_PARAMETER);
    createEReference(commandParameterEClass, COMMAND_PARAMETER__NAME);
    createEReference(commandParameterEClass, COMMAND_PARAMETER__PARAMETER);

    vocSpecEClass = createEClass(VOC_SPEC);
    createEReference(vocSpecEClass, VOC_SPEC__STRUCTS);
    createEReference(vocSpecEClass, VOC_SPEC__PERIODIC_SENSORS);
    createEReference(vocSpecEClass, VOC_SPEC__EVENT_SENSORS);
    createEReference(vocSpecEClass, VOC_SPEC__ACTUATORS);
    createEReference(vocSpecEClass, VOC_SPEC__STORAGE_SERVICE);

    regionEClass = createEClass(REGION);
    createEReference(regionEClass, REGION__REGION_LABEL);
    createEReference(regionEClass, REGION__REGION_TYPE);

    regionLabelEClass = createEClass(REGION_LABEL);
    createEAttribute(regionLabelEClass, REGION_LABEL__NAME);

    structEClass = createEClass(STRUCT);
    createEAttribute(structEClass, STRUCT__NAME);
    createEReference(structEClass, STRUCT__FIELDS);

    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__NAME);
    createEReference(fieldEClass, FIELD__TYPE);

    periodicSensorsEClass = createEClass(PERIODIC_SENSORS);
    createEReference(periodicSensorsEClass, PERIODIC_SENSORS__SENSOR_NAME);
    createEReference(periodicSensorsEClass, PERIODIC_SENSORS__GENERATE_INFO);

    eventSensorsEClass = createEClass(EVENT_SENSORS);
    createEReference(eventSensorsEClass, EVENT_SENSORS__SENSOR_NAME);
    createEReference(eventSensorsEClass, EVENT_SENSORS__GENERATE_INFO);
    createEReference(eventSensorsEClass, EVENT_SENSORS__EVENT_CONDITIONS);

    eventConditionsEClass = createEClass(EVENT_CONDITIONS);
    createEAttribute(eventConditionsEClass, EVENT_CONDITIONS__NAME);
    createEReference(eventConditionsEClass, EVENT_CONDITIONS__EVENT_CONDITIONS);

    inBuiltComputationalServiceNameEClass = createEClass(IN_BUILT_COMPUTATIONAL_SERVICE_NAME);
    createEAttribute(inBuiltComputationalServiceNameEClass, IN_BUILT_COMPUTATIONAL_SERVICE_NAME__NAME);

    entityNameEClass = createEClass(ENTITY_NAME);
    createEAttribute(entityNameEClass, ENTITY_NAME__NAME);

    generateEClass = createEClass(GENERATE);
    createEReference(generateEClass, GENERATE__SOURCE_NAME);
    createEReference(generateEClass, GENERATE__TYPE);

    sourceNameEClass = createEClass(SOURCE_NAME);
    createEAttribute(sourceNameEClass, SOURCE_NAME__NAME);

    actuatorEClass = createEClass(ACTUATOR);
    createEReference(actuatorEClass, ACTUATOR__ACTUATOR_NAME);
    createEReference(actuatorEClass, ACTUATOR__ACTIONS);

    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__ACTION_NAME);
    createEReference(actionEClass, ACTION__PARAMETERS);

    actionNameEClass = createEClass(ACTION_NAME);
    createEAttribute(actionNameEClass, ACTION_NAME__NAME);

    parametersEClass = createEClass(PARAMETERS);
    createEReference(parametersEClass, PARAMETERS__PARAMETER_NAME);
    createEReference(parametersEClass, PARAMETERS__TYPE);

    parameterNameEClass = createEClass(PARAMETER_NAME);
    createEAttribute(parameterNameEClass, PARAMETER_NAME__NAME);

    storageServiceEClass = createEClass(STORAGE_SERVICE);
    createEReference(storageServiceEClass, STORAGE_SERVICE__STORAGE_SERVICE_NAME);
    createEReference(storageServiceEClass, STORAGE_SERVICE__DATA_ACCESSES);

    dataAccessEClass = createEClass(DATA_ACCESS);
    createEReference(dataAccessEClass, DATA_ACCESS__SOURCE_NAME);
    createEReference(dataAccessEClass, DATA_ACCESS__DATA_ACCESS_TYPE);
    createEAttribute(dataAccessEClass, DATA_ACCESS__DATA_ITEM);
    createEReference(dataAccessEClass, DATA_ACCESS__TYPE);
    createEReference(dataAccessEClass, DATA_ACCESS__ACTIONS);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__PRIMITIVE_DATA_TYPE);

    operationNameEClass = createEClass(OPERATION_NAME);
    createEAttribute(operationNameEClass, OPERATION_NAME__OPERATION_NAME);

    primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
    createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__INTEGER);
    createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__BOOLEAN);
    createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__STRING);
    createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__LONG);
    createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__DOUBLE);
    createEReference(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__STRUCT_DEF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(specEClass, Spec.class, "Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpec_VocSpec(), this.getVocSpec(), null, "vocSpec", null, 0, 1, Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpec_InteractionSpec(), this.getInteractionSpec(), null, "interactionSpec", null, 0, 1, Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpec_ArchSpec(), this.getArchSpec(), null, "archSpec", null, 0, 1, Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpec_NetworkSpec(), this.getDeploymentSpec(), null, "networkSpec", null, 0, 1, Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentSpecEClass, DeploymentSpec.class, "DeploymentSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeploymentSpec_Devices(), this.getDevice(), null, "devices", null, 0, -1, DeploymentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDevice_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_DeviceLocation(), this.getDeviceLocation(), null, "deviceLocation", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_PlatformType(), this.getPlatformType(), null, "platformType", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_DeviceAbilities(), this.getDeviceAbilities(), null, "deviceAbilities", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_DeviceProtocol(), this.getDeviceProtocol(), null, "deviceProtocol", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_DatabaseName(), this.getDatabaseName(), null, "databaseName", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_DeviceDescription(), this.getDeviceDescription(), null, "deviceDescription", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceDescriptionEClass, DeviceDescription.class, "DeviceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceDescription_DevicedescriptionText(), ecorePackage.getEString(), "devicedescriptionText", null, 0, 1, DeviceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceLocationEClass, DeviceLocation.class, "DeviceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceLocation_RegionLabel(), ecorePackage.getEString(), "regionLabel", null, 0, 1, DeviceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceLocation_RegionValue(), ecorePackage.getEInt(), "regionValue", null, 0, 1, DeviceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(platformTypeEClass, PlatformType.class, "PlatformType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlatformType_DeviceType(), ecorePackage.getEString(), "deviceType", null, 0, 1, PlatformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseNameEClass, DatabaseName.class, "DatabaseName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseName_InstalledDatabase(), ecorePackage.getEString(), "installedDatabase", null, 0, 1, DatabaseName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceProtocolEClass, DeviceProtocol.class, "DeviceProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceProtocol_ProtocolName(), ecorePackage.getEString(), "protocolName", null, 0, 1, DeviceProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceAbilitiesEClass, DeviceAbilities.class, "DeviceAbilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeviceAbilities_DeviceEntityName(), this.getEntityName(), null, "deviceEntityName", null, 0, 1, DeviceAbilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceAbilities_Name(), this.getDeviceAbilities(), null, "name", null, 0, 1, DeviceAbilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionSpecEClass, InteractionSpec.class, "InteractionSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractionSpec_InteractionName(), this.getEntityName(), null, "interactionName", null, 0, 1, InteractionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractionSpec_InteractionCommand(), this.getCommand(), null, "interactionCommand", null, 0, -1, InteractionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractionSpec_InteractionRequest(), this.getRequest(), null, "interactionRequest", null, 0, -1, InteractionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractionSpec_InteractionNotify(), this.getInteractionAction(), null, "interactionNotify", null, 0, -1, InteractionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionActionEClass, InteractionAction.class, "InteractionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractionAction_ActionName(), this.getActionName(), null, "actionName", null, 0, 1, InteractionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractionAction_Parameters(), this.getParameters(), null, "parameters", null, 0, -1, InteractionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractionAction_InteractionEntity(), this.getEntityName(), null, "interactionEntity", null, 0, 1, InteractionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(archSpecEClass, ArchSpec.class, "ArchSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArchSpec_Structs(), this.getStruct(), null, "structs", null, 0, -1, ArchSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchSpec_InbuiltComputationalService(), this.getInBuiltComputationalService(), null, "inbuiltComputationalService", null, 0, -1, ArchSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchSpec_CustomComputationalService(), this.getcustomComputationalService(), null, "customComputationalService", null, 0, -1, ArchSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inBuiltComputationalServiceEClass, InBuiltComputationalService.class, "InBuiltComputationalService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInBuiltComputationalService_InBuiltComputationalServiceName(), this.getEntityName(), null, "inBuiltComputationalServiceName", null, 0, 1, InBuiltComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInBuiltComputationalService_Consumes(), this.getConsumeForInBuilt(), null, "consumes", null, 0, -1, InBuiltComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInBuiltComputationalService_OperationName(), this.getOperationName(), null, "operationName", null, 0, 1, InBuiltComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInBuiltComputationalService_OperationParameter(), ecorePackage.getEInt(), "operationParameter", null, 0, 1, InBuiltComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInBuiltComputationalService_GenerateInfo(), this.getGenerate(), null, "generateInfo", null, 0, -1, InBuiltComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customComputationalServiceEClass, customComputationalService.class, "customComputationalService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcustomComputationalService_CustomComputationalServiceName(), this.getEntityName(), null, "customComputationalServiceName", null, 0, 1, customComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcustomComputationalService_Consumes(), this.getConsume(), null, "consumes", null, 0, -1, customComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcustomComputationalService_Requests(), this.getRequest(), null, "requests", null, 0, -1, customComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcustomComputationalService_GenerateInfo(), this.getGenerate(), null, "generateInfo", null, 0, -1, customComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcustomComputationalService_Commands(), this.getCommand(), null, "commands", null, 0, -1, customComputationalService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequest_Requestname(), this.getSourceName(), null, "requestname", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequest_StorageForRequest(), this.getEntityName(), null, "storageForRequest", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(consumeForInBuiltEClass, ConsumeForInBuilt.class, "ConsumeForInBuilt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConsumeForInBuilt_Name(), this.getSourceName(), null, "name", null, 0, 1, ConsumeForInBuilt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConsumeForInBuilt_SensorForConsume(), this.getEntityName(), null, "SensorForConsume", null, 0, 1, ConsumeForInBuilt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(consumeEClass, Consume.class, "Consume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConsume_Name(), this.getSourceName(), null, "name", null, 0, 1, Consume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConsume_FromName(), this.getEntityName(), null, "fromName", null, 0, 1, Consume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommand_CommandName(), this.getActionName(), null, "commandName", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Commandparameter(), this.getCommandParameter(), null, "commandparameter", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_ActuatorForCommand(), this.getEntityName(), null, "actuatorForCommand", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandParameterEClass, CommandParameter.class, "CommandParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommandParameter_Name(), this.getParameterName(), null, "name", null, 0, 1, CommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommandParameter_Parameter(), this.getCommandParameter(), null, "parameter", null, 0, 1, CommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vocSpecEClass, VocSpec.class, "VocSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVocSpec_Structs(), this.getStruct(), null, "structs", null, 0, -1, VocSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVocSpec_PeriodicSensors(), this.getPeriodicSensors(), null, "periodicSensors", null, 0, -1, VocSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVocSpec_EventSensors(), this.getEventSensors(), null, "eventSensors", null, 0, -1, VocSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVocSpec_Actuators(), this.getActuator(), null, "actuators", null, 0, -1, VocSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVocSpec_StorageService(), this.getStorageService(), null, "storageService", null, 0, -1, VocSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegion_RegionLabel(), this.getRegionLabel(), null, "regionLabel", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegion_RegionType(), this.getType(), null, "regionType", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regionLabelEClass, RegionLabel.class, "RegionLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegionLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, RegionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStruct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Fields(), this.getField(), null, "fields", null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_Type(), this.getType(), null, "type", null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(periodicSensorsEClass, PeriodicSensors.class, "PeriodicSensors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPeriodicSensors_SensorName(), this.getEntityName(), null, "sensorName", null, 0, 1, PeriodicSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPeriodicSensors_GenerateInfo(), this.getGenerate(), null, "generateInfo", null, 0, -1, PeriodicSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventSensorsEClass, EventSensors.class, "EventSensors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventSensors_SensorName(), this.getEntityName(), null, "sensorName", null, 0, 1, EventSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventSensors_GenerateInfo(), this.getGenerate(), null, "generateInfo", null, 0, -1, EventSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventSensors_EventConditions(), this.getEventConditions(), null, "eventConditions", null, 0, -1, EventSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventConditionsEClass, EventConditions.class, "EventConditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventConditions_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventConditions_EventConditions(), this.getEventConditions(), null, "eventConditions", null, 0, -1, EventConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inBuiltComputationalServiceNameEClass, InBuiltComputationalServiceName.class, "InBuiltComputationalServiceName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInBuiltComputationalServiceName_Name(), ecorePackage.getEString(), "name", null, 0, 1, InBuiltComputationalServiceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityNameEClass, EntityName.class, "EntityName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityName_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generateEClass, Generate.class, "Generate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenerate_SourceName(), this.getSourceName(), null, "sourceName", null, 0, 1, Generate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenerate_Type(), this.getType(), null, "type", null, 0, 1, Generate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceNameEClass, SourceName.class, "SourceName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSourceName_Name(), ecorePackage.getEString(), "name", null, 0, 1, SourceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActuator_ActuatorName(), this.getEntityName(), null, "actuatorName", null, 0, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActuator_Actions(), this.getAction(), null, "actions", null, 0, -1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAction_ActionName(), this.getActionName(), null, "actionName", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Parameters(), this.getParameters(), null, "parameters", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionNameEClass, ActionName.class, "ActionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionName_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parametersEClass, Parameters.class, "Parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameters_ParameterName(), this.getParameterName(), null, "parameterName", null, 0, 1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameters_Type(), this.getType(), null, "type", null, 0, 1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterNameEClass, ParameterName.class, "ParameterName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterName_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storageServiceEClass, StorageService.class, "StorageService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStorageService_StorageServiceName(), this.getEntityName(), null, "storageServiceName", null, 0, 1, StorageService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStorageService_DataAccesses(), this.getDataAccess(), null, "dataAccesses", null, 0, -1, StorageService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataAccessEClass, DataAccess.class, "DataAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataAccess_SourceName(), this.getSourceName(), null, "sourceName", null, 0, 1, DataAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataAccess_DataAccessType(), this.getType(), null, "dataAccessType", null, 0, 1, DataAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataAccess_DataItem(), ecorePackage.getEString(), "dataItem", null, 0, 1, DataAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataAccess_Type(), this.getType(), null, "type", null, 0, 1, DataAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataAccess_Actions(), this.getAction(), null, "actions", null, 0, -1, DataAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_PrimitiveDataType(), this.getPrimitiveDataType(), null, "primitiveDataType", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationNameEClass, OperationName.class, "OperationName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationName_OPERATION_NAME(), ecorePackage.getEString(), "OPERATION_NAME", null, 0, 1, OperationName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveDataType_INTEGER(), ecorePackage.getEString(), "INTEGER", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitiveDataType_BOOLEAN(), ecorePackage.getEString(), "BOOLEAN", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitiveDataType_STRING(), ecorePackage.getEString(), "STRING", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitiveDataType_LONG(), ecorePackage.getEString(), "LONG", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitiveDataType_DOUBLE(), ecorePackage.getEString(), "DOUBLE", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveDataType_StructDef(), this.getStruct(), null, "structDef", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
