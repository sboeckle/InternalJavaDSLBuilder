package de.htwg.javafluentdsl.creator.emf.creation;

import org.junit.Test;

import de.htwg.javafluentdsl.generator.Generator;
import de.htwg.javafluentdsl.main.StartEMF;

public class EMFCreation_SingleBuilder {
	
	public static final String EMFGenModelPath = EMFCreation.projectPath + "/emfmodel/";
	
	public final static String PACKAGE_DEST = "de.htwg.generated.emf.dsl";
	public final static String FORUM_DEST = PACKAGE_DEST+".forum";
	public final static String TESTMODEL_DEST = PACKAGE_DEST+".testmodel";
	public final static String SIMPLE_FORUM_DEST = PACKAGE_DEST+".simpleForum";
	
	
	@Test
	public void simpleForum_SingleBuilderTest() {
		String genModelPath = EMFGenModelPath + "SimpleForum.genmodel";
		new StartEMF().startDSLGenerationProcess(genModelPath, Generator.SINGLE_BUILDER_OPTION, SIMPLE_FORUM_DEST +".singleBuilder");
		EMFCreation.fileExists(SIMPLE_FORUM_DEST + ".singleBuilder.SimpleForumBuilder","java");
	}
	
	@Test
	public void forum_SingleBuilderTest() {
		String genModelPath = EMFGenModelPath + "Forum.genmodel";
		new StartEMF().startDSLGenerationProcess(genModelPath, Generator.SINGLE_BUILDER_OPTION, FORUM_DEST+".singleBuilder");
		EMFCreation.fileExists(FORUM_DEST+".singleBuilder.ForumBuilder","java");
	}
	
	@Test
	public void testModel_SINGLEBuilderTest() {
		String genModelPath = EMFGenModelPath + "TestModel.genmodel";
		new StartEMF().startDSLGenerationProcess(genModelPath, Generator.SINGLE_BUILDER_OPTION, TESTMODEL_DEST+".singleBuilder");
		EMFCreation.fileExists(TESTMODEL_DEST+".singleBuilder.TestModelBuilder","java");
	}
}