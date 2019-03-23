package com.projects;

import com.projects.annotations.Processor;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

    static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Processor processor = new Processor();
        processor.process();
    }
}
