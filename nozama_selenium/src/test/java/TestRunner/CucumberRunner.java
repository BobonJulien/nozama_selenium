package TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// Permet de dire qu'on le lance avec le selenium.junit.cucumber
@RunWith(Cucumber.class)
// features = "features" => R�cup�re l'int�gralit� du dossier Features et nous interpr�te le gherkin dans le cucumber dans la console
// glue = "TestCase" => permet de lier les .features au cas de test dans le package test case TestCase
@CucumberOptions(features="AppFeatures", glue="StepDefinition")
public class CucumberRunner {

}