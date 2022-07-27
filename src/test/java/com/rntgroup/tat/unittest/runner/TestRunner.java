package com.rntgroup.tat.unittest.runner;

import com.rntgroup.tat.unittest.listeners.MyTestListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG tng = new TestNG();
        tng.addListener(tla);
        tng.addListener(new MyTestListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("Calculator");

        List<String> files = new ArrayList<>(new ArrayList<>() {
            {
                add("./src/test/resources/suites/calculator.xml");
            }
        });
        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.run();
    }
}
