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
    
    public static String getPPIconPath(){
        return projectPath + "\\assets\\pp.jpg";
    }
    
    public static String getLogoutIconPath(){
        return projectPath + "\\assets\\logout.png";
    }
    
    public static String getUserIconPath(){
        return projectPath + "\\assets\\user.png";
    }
    
    public static String getLoginIconPath(){
        return projectPath + "\\assets\\login.png";
    }
}
