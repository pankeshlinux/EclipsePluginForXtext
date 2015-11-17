package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.semanticmodel.PrimitiveType;
import iotsuite.semanticmodel.StructField;
import iotsuite.semanticmodel.Struct;

import java.util.ArrayList;
import java.util.List;

public class StructCompiler {

	private Struct createdStructure;
	private List<StructField> StructFieldSet = new ArrayList<StructField>();
	private String structName;

	public StructCompiler() {
	}

	public StructCompiler(String structName) {
		this.structName = structName;
		createdStructure = new Struct(structName, getStructFieldSet());
	}

	public void addField(String fieldName, String fieldType) {
		StructField Field = new StructField(fieldName, new PrimitiveType(
				fieldType));
		StructFieldSet.add(Field);

	}

	public List<StructField> getStructFieldSet() {
		return StructFieldSet;
	}

	public String getStructName() {
		return structName;
	}

	public void generateStructureCode() {

		JavaFrameworkFromST generatedStruct = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedStruct
				.generateDataStructure(createdStructure);
		SourceFileDumper dumpGeneratedStruct = new SourceFileDumper();
		dumpGeneratedStruct.dumpCompilationUnit(generatedCU);
	}

}
