# SE441-HW4

## Ant+Ivy
Ant is the eldest of the various Java build automation frameworks and it is still very much in use today. There are extensions to Ant for a variety of languages, Java-based and non-Java-based alike. We'll focus only on Java for this assignment.

### Setup

#### Install Ant
Download and install Apache Ant (version 1.10.10) from:

https://ant.apache.org/bindownload.cgi

To verify that Ant has been installed correctly, run the following command on the command line to verify that the version is correct:

```
ant -v
```

#### Install Ivy
Unlike Ant, we don't generally use Ivy as a standalone tool. Instead, we use it as a plugin for Ant, which means that it extends Ant's existing capabilities. This means that it requires a little bit of work to deploy, although that work is fairly painless:

1. Change into the [tools](tools) directory that was included in the cloned Git repository.
2. Run the Ant script with the default target: `ant`
3. Copy the [ivy.jar](tools/ivy/ivy.jar) file from the [tools/ivy](tools/ivy) directory to your `<ANT-HOME>/lib` directory.
4. Run the ant script with the `go-nodeps` target to confirm that Ivy works:
  `ant go-nodeps`

### Complete the Build Script
In this section, you will get some basic experience in writing Ant scripts. You will focus on completing the sections of the files -- `build.xml` and `ivy.xml` -- marked with **TODO** comments.

_**Note:** The scripts will work as long as the TODOs are addressed -- you should not need to modify any other part of the script._

To test the build script, just use the default ant target:

```
ant
```

To execute the packaged JAR, you can use the following command:

```
java -jar target/hello-world-all-1.0-SNAPSHOT.jar
```

## Maven
### Setup
Download and install Apache Maven (version 3.8.4) from:

https://maven.apache.org/download.cgi

To verify that Maven has been installed correctly, run the following command on the command line to verify that the version is correct:

```
mvn -v
```

### Complete the Build Script
In this section, you will get some basic experience in writing Maven scripts. You will focus on completing the sections of the scripts -- `pom.xml` -- marked with **TODO** comments.

_**Note:** The scripts will work as long as the TODOs are addressed -- you should not need to modify any other part of the script._

To test the build script, just use the following Maven command (we're not using the `install` goal since we don't really need this installed into our local repository):

```
mvn clean package
```

To execute the packaged JAR, you can use the following command:

```
java -jar target/hello-world-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Gradle
### Setup
Download and install Gradle (version 7.3.3) from:

https://gradle.org/releases/

_**Note:** You can use either the "binary-only" or the "complete" release. The complete is bigger but provides lots of samples. I'm partial to Gradle so that's the one I choose. My biases don't need to affect your behavior in this case._

To verify that Gradle has been installed correctly, run the following command on the command line to verify that the version is correct:

```
gradle -v
```

### Complete the Build Script
In this section, you will get some basic experience in writing Maven scripts. You will focus on completing the sections of the scripts -- `build.gradle` -- marked with **TODO** comments.

_**Note:** The scripts will work as long as the TODOs are addressed -- you should not need to modify any other part of the script._

To test the build script, just use the following Maven command (we're not using the `install` goal since we don't really need this installed into our local repository):

```
gradle jar
```

To execute the packaged JAR, you can use the following command:

```
java -jar build/libs/hello-world-all-1.0-SNAPSHOT.jar
```


## Deliverables
1. Add your screen captures to a new [images](images) directory.
2. Update the file, [SUBMISSION.md](SUBMISSION.md).
3. Commit all of your code changes, the [images](images) directory, and the updated [SUBMISSION.md](SUBMISSION.md) to your remote Github repository.
4. Verify that all of your images are displaying in the [SUBMISSION.md](SUBMISSION.md) page. I want to see the images, not the links to the images.
