##Fetch Rewards Coding Exercise - SDET 

This is a mock BDD UI Framework applying POM pattern. I created couple simple tests just as an example in BasicValidation.feature and implemented them in the 
step_defs in BasicValidation class. Three steps algorithm to resolve the challenge was identefied in the ThreeStepsAlgorithm.feature file and was implemented in the ThreeStepsAlgorithmSteps class.
Also, I created a simple utils package for a driver implementation(a Chrome is being used but other drivers could be added easily), and a helper class with a couple of additional methods. 
 
####Prerequisites
 You must have java and maven installed on your machine. 

####To run the regression tests
Clone the project from the GitHub using the following command 
```shell script
git clone "......"
```

In oder to run regression test you need to run the following maven command 

```shell script
mvn install -Dcucumber.options="--tags @regression"
```
hen mvn clean install is run maven triggers maven surefire plugin below

 ```xml
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.21.0</version>
                <configuration>
                    <includes>
                        <include>**/Runner.java</include>
                    </includes>
                    <testFailureIgnore>true</testFailureIgnore>
                </configuration>
            </plugin>
```

The surefire plugin triggers the Cucumber runner class below

 ```java
@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"classpath:features"},
        glue = {"steps"},
        tags = {}, 
        plugin = {"json:target/cucumber.json"},
        format = {"pretty", "html:target/reports"}
)
public class RegressionRunner {
    }
}
```

The Regression runner class scans all feature files under features folder and executes all scenarios with @regression tag
on

#### To run the best algorithm to resolve the fake gold bar challenge

In oder to run the best algorithm to resolve the gold bar challenge you need to run the following maven command 

```shell script
mvn install -Dcucumber.options="--tags @algorithm"
```

"# FakeGoldBar" 
