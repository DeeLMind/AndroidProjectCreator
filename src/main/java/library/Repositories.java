/*
 * Copyright (C) 2018 Max 'Libra'
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package library;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.Repository;

/**
 * All repositories are created in this class. To obtain a specific repository,
 * one has to call that specific function. To obtain all repositories in a list,
 * use the <code>getAll</code> function.
 *
 * @author Max 'Libra' Kersten
 */
public class Repositories {

    /**
     * Get all repositories that are included within this project
     *
     * @return all repositories in a list
     */
    public static List<Repository> getAll() {
        List<Repository> repositories = new ArrayList<>();
        repositories.add(getAndroidProject());
        repositories.add(getApkTool());
        repositories.add(getDex2Jar());
        repositories.add(getFernflower());
        repositories.add(getJadX());
        repositories.add(getJdCmd());
        return repositories;
    }

    /**
     * Get the Dex2Jar repository
     *
     * @return the Dex2Jar repository
     */
    public static Repository getDex2Jar() {
        //Set the information for the repository
        String name = "dex2jar";
        String url = "https://github.com/pxb1988/dex2jar.git";
        File directory = new File(Constants.DEX2JAR_REPOSITORY_FOLDER);
        String branch = "2.x";
        return new Repository(name, url, directory, branch);
    }

    /**
     * Get the JadX repository
     *
     * @return the JadX repository
     */
    public static Repository getJadX() {
        //Set the information for the repository
        String name = "jadx";
        String url = "https://github.com/skylot/jadx.git";
        File directory = new File(Constants.JADX_REPOSITORY_FOLDER);
        String branch = "master";

        return new Repository(name, url, directory, branch);
    }

    /**
     * Get the JD-CMD repository
     *
     * @return the JD-CMD repository
     */
    public static Repository getJdCmd() {
        String name = "jdcmd";
        String url = "https://github.com/kwart/jd-cmd.git";
        File directory = new File(Constants.JDCMD_REPOSITORY_FOLDER);
        String branch = "master";
        return new Repository(name, url, directory, branch);
    }

    /**
     * Get the Fernflower repository
     *
     * @return the Fernflower repository
     */
    public static Repository getFernflower() {
        String name = "fernflower";
        String url = "https://github.com/fesh0r/fernflower.git";
        File directory = new File(Constants.FERNFLOWER_REPOSITORY_FOLDER);
        String branch = "master";
        return new Repository(name, url, directory, branch);
    }

    /**
     * Get the APKTool repository
     *
     * @return the APKTool repository
     */
    public static Repository getApkTool() {
        String name = "apktool";
        String url = "https://github.com/iBotPeaches/Apktool.git";
        File directory = new File(Constants.APKTOOL_REPOSITORY_FOLDER);
        String branch = "master";
        return new Repository(name, url, directory, branch);
    }

    /**
     * Get the Android Studio template project
     *
     * @return the Android Studio template project
     */
    public static Repository getAndroidProject() {
        String name = "androidstudioproject";
        String url = "https://github.com/ThisIsLibra/AndroidStudioProject.git";
        File directory = new File(Constants.ANDROIDPROJECT_REPOSITORY_FOLDER);
        String branch = "master";
        return new Repository(name, url, directory, branch);
    }
}
