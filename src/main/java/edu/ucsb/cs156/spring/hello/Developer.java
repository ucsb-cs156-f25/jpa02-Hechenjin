package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {

        return "Hechenjin Y.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "Hechenjin Y.";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-05");
        team.addMember("Melvin Anthony");
        team.addMember("Brian Patrick");
        team.addMember("Jasmine");
        team.addMember("Kennedy");
        team.addMember("Hechenjin");
        team.addMember("Mon Raphael");
        return team;
    }
}
