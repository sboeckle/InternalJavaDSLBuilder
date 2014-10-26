package de.htwg.javaDSLBuilder.creator.emf.creation;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.Paths;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({ EMFCreation_SingleBuilder.class, EMFCreation_MultipleBuilder.class })
public class EMFCreation {
	
	public static final String projectPath = Paths.get(".").toAbsolutePath()
			.normalize().toString();
	
	public static void fileExists(String string) {
		String modelPath =  projectPath + "\\src\\" +string.replace('.', '\\');
		try {
			File file = new File(modelPath);
			assertTrue(file.exists());
		} catch(Exception e) {
			System.err.println("Class at "+modelPath+" doesnt exist");
		    fail();
		}
	}

}