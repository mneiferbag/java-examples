import groovy.xml.MarkupBuilder 

/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */

/**
 * Output XML dependencies element to be used in Apacha Maven POM file from
 * list of files in directory given as first argument to main method.
 */
class MavenDependencyBuilder {
    static void main(String[] args) {
        def dir = new File(args[0])
        def mB = new MarkupBuilder()
/*
<dependency>
    <groupId>com.sample</groupId>
    <artifactId>sample</artifactId>
    <version>1.0</version>
    <scope>system</scope>
    <systemPath>${project.basedir}/src/main/resources/Name_Your_JAR.jar</systemPath>
</dependency>
*/
        def deps = mB.project { dependencies {
            dir.eachFile {
                file ->
                mB.dependency {  
                    groupId('your.group.id')
                    artifactId(file.name.length() > 4 ? file.name.getAt(0..-5) : file.name)
                    version('1.0.0') 
                    scope('system')
                    systemPath('${project.basedir}/lib/' + file.name) 
                }
            }
        }}
    }
}
