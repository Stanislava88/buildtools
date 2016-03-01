package com.clouway;

import org.apache.log4j.Logger;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class MyProject {


    private static Logger logger = Logger.getLogger(MyProject.class);

    public static void main(String[] args) {
        logger.warn("This is warn : ");
        logger.error("This is error : ");
        logger.fatal("This is fatal : ");

    }
}
