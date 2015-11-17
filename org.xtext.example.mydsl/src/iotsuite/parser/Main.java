package iotsuite.parser;

import iotsuite.codegenerator.GenFiller;
import iotsuite.common.GlobalVariable;
import iotsuite.compiler.LinkerCompiler;
import iotsuite.compiler.MapperCompiler;
import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {

	public static void main(String[] args) throws Exception {

		GlobalVariable.activity = args[0];
		GlobalVariable.templatePath = args[1];

		// Constructing the Vocabulary Specification Path
		GlobalVariable.vocabSpec = GlobalVariable.templatePath + "/IoTSuiteSpecification/src/" + "vocab.mydsl";

		// Constructing the Architecture Specification Path
		GlobalVariable.archSpec = GlobalVariable.templatePath + "/IoTSuiteSpecification/src/" + "arch.mydsl";

		// Constructing the User Interaction Specification Path
		GlobalVariable.interactionSpec = GlobalVariable.templatePath + "/IoTSuiteSpecification/src/" + "userinteraction.mydsl";

		// Constructing the Deployment Specification Path
		GlobalVariable.deploymentSpec = GlobalVariable.templatePath + "/IoTSuiteSpecification/src/" + "deploy.mydsl";

		// Constructing the StringTemplate Path
		GlobalVariable.stringTemplatePath = GlobalVariable.templatePath + "/" + "StringTemplateFiles";

		if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();
			// GenFiller.copyDeviceDrivers();

		}

		if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_USERINTERACTION)) {

			ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();

			ANTLRFileStream interactionStream = new ANTLRFileStream(GlobalVariable.interactionSpec);
			InteractionSpecLexer interactionLexer = new InteractionSpecLexer(interactionStream);
			CommonTokenStream interactionTokens = new CommonTokenStream(interactionLexer);
			InteractionSpecParser interactionParser = new InteractionSpecParser(interactionTokens);
			interactionParser.interactionSpec();

			// GenFiller.copyDeviceDrivers();

		}

		if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_ARCHITECTUREFRAMEWORK)) {

			ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();

			ANTLRFileStream interactionStream = new ANTLRFileStream(GlobalVariable.interactionSpec);
			InteractionSpecLexer interactionLexer = new InteractionSpecLexer(interactionStream);
			CommonTokenStream interactionTokens = new CommonTokenStream(interactionLexer);
			InteractionSpecParser interactionParser = new InteractionSpecParser(interactionTokens);
			interactionParser.interactionSpec();

			ANTLRFileStream archStream = new ANTLRFileStream(GlobalVariable.archSpec);
			ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
			CommonTokenStream archTokens = new CommonTokenStream(archLexer);
			ArchSpecParser archParser = new ArchSpecParser(archTokens);
			archParser.archSpec();
			// GenFiller.copyApplicationLogic();
		}

		if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_MAPPING)) {

			ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();

			ANTLRFileStream archStream = new ANTLRFileStream(GlobalVariable.archSpec);
			ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
			CommonTokenStream archTokens = new CommonTokenStream(archLexer);
			ArchSpecParser archParser = new ArchSpecParser(archTokens);
			archParser.archSpec();

			List<Device> deviceList;
			List<DeploymentScope> mappingConstraintList;

			mappingConstraintList = SymbolTable.getDeploymentConstrainsList();

			ANTLRFileStream deploymentStream = new ANTLRFileStream(GlobalVariable.deploymentSpec);
			NetworkSpecLexer deploymentLexer = new NetworkSpecLexer(deploymentStream);
			CommonTokenStream deploymentTokens = new CommonTokenStream(deploymentLexer);
			NetworkSpecParser deploymentParser = new NetworkSpecParser(deploymentTokens);
			deploymentParser.networkspec();
			deviceList = SymbolTable.getDeviceList();

			MapperCompiler.mappingFileGenerator(deviceList, mappingConstraintList);
			LinkerCompiler.linkerAlgo();
			GenFiller.copyLinking();

		}

	}
}
