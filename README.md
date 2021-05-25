##Puppies Herokuapp

This is a mock BDD UI Framework applying POM pattern. I created a couple simple tests in AdoptAvailablePuppy.feature and MainElementsAreDisplayed.feature and implemented them in the 
step_defs package. A simple utils package was created for a driver implementation(a Chrome is being used but other drivers could be added easily), and a helper class with a couple of additional methods. 

####Prerequisites
 You must have java and maven installed on your machine. 

####To run the tests
Clone the project from the GitHub using the following command 
```shell script
git clone https://github.com/LiudmylaStrokan/PuppiesHerokuapp.git
```

In oder to run first priority test you need to run the following maven command 

```shell script
mvn install -Dcucumber.options="--tags @priority_1"
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

In oder to run other tests you change priority to 2,3 in tag and use the following maven command. Otherwise, the tests will run according to tags priority.  

```shell script
mvn install -Dcucumber.options="--tags @priority_2"
```


