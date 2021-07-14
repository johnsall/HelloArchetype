This is a simple maven archetype project. 

Once this project has been installed (`mvn install`), you can use `mvn archetype:generate -DarchetypeGroupId='com.amido' -DarchetypeArtifactId='helloArchetype' -DarchetypeVersion='1.0-SNAPSHOT' -DgroupId='com.amido' -DartifactId='helloArchetypeImpl'`
in a folder different from this project's to generate a simple hello world project with a test class (junit 4.12). 
The first three parameters in the command above specify the archetype to be used, while the last two the generated project's
details. Feel free to change them as you see fit, but remember, the first 3 need to be the same as in this project's root folder pom.xml file.
In the folder where you run the second maven command there should be a helloArchetypeImpl folder, or, whatever you used for the 
`-DartifactId` parameter. From there you can use the project like normal