package de.htwg.javafluentdsl.main;

/**
 * Interface for declaring starting Method
 *
 */
public interface IStart {
	
	/**
	 * Starts the DSL generation process. With some kind of source ({@code source})
	 * for dsl model description (e.g. File, description string...) and a defined template ({@code templateOption}).
	 * The classes generated are saved via the given targetPackage ({@code targetPackgage}) path.
	 * @param source the source for the dsl model description
	 * @param templateOption the template which should be used for generation
	 * @param targetPackage the relative target package. Preferred with typical package naming conventions
	 * 	domains seperated by '.' and all in small letters.
	 * @throws IllegalArgumentException if one of the parameter
	 */
	void startDSLGenerationProcess(String source, String templateOption, String targetPackage);

}