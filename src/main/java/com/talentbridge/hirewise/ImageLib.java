package com.talentbridge.hirewise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author emirs
 */
public class ImageLib {

    public static String projectPath = System.getProperty("user.dir");

    public static String getWelcomeIconPath() {
        return projectPath + "\\assets\\gesture.png";
    }

    public static String getDepartmentIconPath() {
        return projectPath + "\\assets\\corporation.png";
    }

    public static String getPPIconPath() {
        return projectPath + "\\assets\\pp.jpg";
    }

    public static String getLogoutIconPath() {
        return projectPath + "\\assets\\logout.png";
    }

    public static String getUserIconPath() {
        return projectPath + "\\assets\\user.png";
    }

    public static String getLoginIconPath() {
        return projectPath + "\\assets\\login.png";
    }

    public static String getRegisterIconPath() {
        return projectPath + "\\assets\\register.png";
    }

    public static String getPositionIconPath() {
        return projectPath + "\\assets\\position.png";
    }

    /*public static String getTaskIconPath() {
        return projectPath + "\\assets\\clipboard.png";
    }*/
    public static String getPPIconPath(String username) {
        File destinationDir = new File(projectPath + "\\assets\\");
        File destinationFilePng = new File(destinationDir, username + ".png");
        File destinationFileJpg = new File(destinationDir, username + ".jpg");

        if (destinationFilePng.exists()) {
            return destinationFilePng.getAbsolutePath();
        } else if (destinationFileJpg.exists()) {
            return destinationFileJpg.getAbsolutePath();
        }
        return getUserIconPath();
    }

    public static String setProfilePicture(File selectedFile, String username) throws IOException {
        String newFileName = username + (selectedFile.getName().endsWith(".png") ? ".png" : ".jpg");
        File destinationDir = new File(projectPath + "\\assets\\");
        File destinationFile = new File(destinationDir, newFileName);

        // Ensure destination directory exists
        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
        }

        Files.copy(selectedFile.toPath(), destinationFile.toPath());
        return destinationFile.getAbsolutePath();
    }

    public static String getHomeIconPath() {
        return projectPath + "\\assets\\home.png";
    }

    public static String getLeaveIconPath() {
        return projectPath + "\\assets\\leave.png";
    }

    public static String getBudgetIconPath() {
        return projectPath + "\\assets\\budget.png";
    }

    public static String getPositionsIconPath() {
        return projectPath + "\\assets\\positions.png";
    }

    public static String getTaskIconPath() {
        return projectPath + "\\assets\\task.png";
    }

    public static String getReviewIconPath() {
        return projectPath + "\\assets\\review.png";
    }

    public static String getBackArrowPath() {
        return projectPath + "\\assets\\back-arrow.png";
    }
}
