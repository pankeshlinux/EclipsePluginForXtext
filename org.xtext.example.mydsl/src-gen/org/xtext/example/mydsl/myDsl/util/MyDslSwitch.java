/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.SPEC:
      {
        Spec spec = (Spec)theEObject;
        T result = caseSpec(spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DEPLOYMENT_SPEC:
      {
        DeploymentSpec deploymentSpec = (DeploymentSpec)theEObject;
        T result = caseDeploymentSpec(deploymentSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DEVICE:
      {
        Device device = (Device)theEObject;
        T result = caseDevice(device);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DEVICE_DESCRIPTION:
      {
        DeviceDescription deviceDescription = (DeviceDescription)theEObject;
        T result = caseDeviceDescription(deviceDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DEVICE_LOCATION:
      {
        DeviceLocation deviceLocation = (DeviceLocation)theEObject;
        T result = caseDeviceLocation(deviceLocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PLATFORM_TYPE:
      {
        PlatformType platformType = (PlatformType)theEObject;
        T result = casePlatformType(platformType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DATABASE_NAME:
      {
        DatabaseName databaseName = (DatabaseName)theEObject;
        T result = caseDatabaseName(databaseName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DEVICE_PROTOCOL:
      {
        DeviceProtocol deviceProtocol = (DeviceProtocol)theEObject;
        T result = caseDeviceProtocol(deviceProtocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DEVICE_ABILITIES:
      {
        DeviceAbilities deviceAbilities = (DeviceAbilities)theEObject;
        T result = caseDeviceAbilities(deviceAbilities);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INTERACTION_SPEC:
      {
        InteractionSpec interactionSpec = (InteractionSpec)theEObject;
        T result = caseInteractionSpec(interactionSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INTERACTION_ACTION:
      {
        InteractionAction interactionAction = (InteractionAction)theEObject;
        T result = caseInteractionAction(interactionAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARCH_SPEC:
      {
        ArchSpec archSpec = (ArchSpec)theEObject;
        T result = caseArchSpec(archSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE:
      {
        InBuiltComputationalService inBuiltComputationalService = (InBuiltComputationalService)theEObject;
        T result = caseInBuiltComputationalService(inBuiltComputationalService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CUSTOM_COMPUTATIONAL_SERVICE:
      {
        customComputationalService customComputationalService = (customComputationalService)theEObject;
        T result = casecustomComputationalService(customComputationalService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REQUEST:
      {
        Request request = (Request)theEObject;
        T result = caseRequest(request);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONSUME_FOR_IN_BUILT:
      {
        ConsumeForInBuilt consumeForInBuilt = (ConsumeForInBuilt)theEObject;
        T result = caseConsumeForInBuilt(consumeForInBuilt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONSUME:
      {
        Consume consume = (Consume)theEObject;
        T result = caseConsume(consume);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMMAND_PARAMETER:
      {
        CommandParameter commandParameter = (CommandParameter)theEObject;
        T result = caseCommandParameter(commandParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VOC_SPEC:
      {
        VocSpec vocSpec = (VocSpec)theEObject;
        T result = caseVocSpec(vocSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REGION:
      {
        Region region = (Region)theEObject;
        T result = caseRegion(region);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REGION_LABEL:
      {
        RegionLabel regionLabel = (RegionLabel)theEObject;
        T result = caseRegionLabel(regionLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STRUCT:
      {
        Struct struct = (Struct)theEObject;
        T result = caseStruct(struct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PERIODIC_SENSORS:
      {
        PeriodicSensors periodicSensors = (PeriodicSensors)theEObject;
        T result = casePeriodicSensors(periodicSensors);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EVENT_SENSORS:
      {
        EventSensors eventSensors = (EventSensors)theEObject;
        T result = caseEventSensors(eventSensors);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EVENT_CONDITIONS:
      {
        EventConditions eventConditions = (EventConditions)theEObject;
        T result = caseEventConditions(eventConditions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IN_BUILT_COMPUTATIONAL_SERVICE_NAME:
      {
        InBuiltComputationalServiceName inBuiltComputationalServiceName = (InBuiltComputationalServiceName)theEObject;
        T result = caseInBuiltComputationalServiceName(inBuiltComputationalServiceName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ENTITY_NAME:
      {
        EntityName entityName = (EntityName)theEObject;
        T result = caseEntityName(entityName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.GENERATE:
      {
        Generate generate = (Generate)theEObject;
        T result = caseGenerate(generate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SOURCE_NAME:
      {
        SourceName sourceName = (SourceName)theEObject;
        T result = caseSourceName(sourceName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ACTUATOR:
      {
        Actuator actuator = (Actuator)theEObject;
        T result = caseActuator(actuator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ACTION_NAME:
      {
        ActionName actionName = (ActionName)theEObject;
        T result = caseActionName(actionName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETERS:
      {
        Parameters parameters = (Parameters)theEObject;
        T result = caseParameters(parameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER_NAME:
      {
        ParameterName parameterName = (ParameterName)theEObject;
        T result = caseParameterName(parameterName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STORAGE_SERVICE:
      {
        StorageService storageService = (StorageService)theEObject;
        T result = caseStorageService(storageService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DATA_ACCESS:
      {
        DataAccess dataAccess = (DataAccess)theEObject;
        T result = caseDataAccess(dataAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OPERATION_NAME:
      {
        OperationName operationName = (OperationName)theEObject;
        T result = caseOperationName(operationName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PRIMITIVE_DATA_TYPE:
      {
        PrimitiveDataType primitiveDataType = (PrimitiveDataType)theEObject;
        T result = casePrimitiveDataType(primitiveDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpec(Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentSpec(DeploymentSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDevice(Device object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceDescription(DeviceDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Location</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Location</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceLocation(DeviceLocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Platform Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Platform Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlatformType(PlatformType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseName(DatabaseName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceProtocol(DeviceProtocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Abilities</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Abilities</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceAbilities(DeviceAbilities object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionSpec(InteractionSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionAction(InteractionAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arch Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arch Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArchSpec(ArchSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Built Computational Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Built Computational Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInBuiltComputationalService(InBuiltComputationalService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>custom Computational Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>custom Computational Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecustomComputationalService(customComputationalService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequest(Request object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Consume For In Built</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Consume For In Built</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsumeForInBuilt(ConsumeForInBuilt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Consume</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Consume</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsume(Consume object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandParameter(CommandParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Voc Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Voc Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVocSpec(VocSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegion(Region object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegionLabel(RegionLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct(Struct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Periodic Sensors</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Periodic Sensors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePeriodicSensors(PeriodicSensors object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Sensors</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Sensors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventSensors(EventSensors object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Conditions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Conditions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventConditions(EventConditions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Built Computational Service Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Built Computational Service Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInBuiltComputationalServiceName(InBuiltComputationalServiceName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityName(EntityName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenerate(Generate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSourceName(SourceName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActuator(Actuator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionName(ActionName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameters(Parameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterName(ParameterName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Storage Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Storage Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStorageService(StorageService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataAccess(DataAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationName(OperationName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveDataType(PrimitiveDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
