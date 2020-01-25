# EffectiveJava (from: Joshua Bloch) - Second Edition

Effective java book practice programs-

Direct illustrations provided in the book OR explanations are covered here. Few are yet to be completed as below:

1. Generics based examples
2. Service provider framework
3. Synchronization and concurrency based examples
4. Type inference / Reflectivity examples
5. Serializable usage examples
6. Annotations based examples


Project specifications:

-> main() methods to execute the code are provided in "*Client.java" class.

-> Alternate behaviors for same functionality are mentioned with the name: "Non compliant code" and "Compliant code". Switch between the codes 
	and observe the difference. 

-> Maven: Maven structure built with version-3.6.3

-> Java: Project configured for Java 10. Expected java version (7 and above) can be updated in pom.xml file. 

		-> Even after importing, if project doesn't compile, change java compiler specifications manually from project properties:
			
				1. Properties -> Java compiler -> Compiler compliance level 
				2. Properties -> Java Build path -> JRE library version