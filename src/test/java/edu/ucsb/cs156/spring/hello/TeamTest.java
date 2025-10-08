package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    // Case 1: same object 
    @Test
    public void equals_returns_true_for_equal_teams() {
        assert(team.equals(team));
    }

    // Case 2: different class
    @Test
    public void equals_returns_false_for_different_class() {
        assert(!team.equals("not-a-team"));
        assert(!team.equals(null));
    }

    // Case 3: different name or members
    @Test
    public void equals_returns_false_for_different_teams() {
        Team team2 = new Team("different-team-name");
        assert(!team.equals(team2));

        Team team3 = new Team("test-team");
        assert(team.equals(team3));

        Team team4 = new Team("test-team");
        team4.addMember("member1");
        assert(!team.equals(team4));

        team.addMember("Jin");
        Team team5 = new Team("test-team");
        team5.addMember("Jin");
        assert(team.equals(team5));

    }

    // Test for hashCode
    @Test 
    public void hashCode_is_same_for_equal_teams() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

}
