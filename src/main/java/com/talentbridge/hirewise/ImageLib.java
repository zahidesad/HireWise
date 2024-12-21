package com.talentbridge.hirewise;

/**
 *
 * @author emirs
 */
public class ImageLib {
    public static String projectPath = System.getProperty("user.dir");
    
    public static String getWelcomeIconPath(){
        return projectPath + "\\assets\\gesture.png";
    }
    
    public static String getDepartmentIconPath(){
        return projectPath + "\\assets\\corporation.png";
    }
}
