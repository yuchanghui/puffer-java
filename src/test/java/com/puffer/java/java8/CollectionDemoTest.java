package com.puffer.java.java8;

import com.puffer.java.common.User;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

public class CollectionDemoTest {

    @Test
    public void testListToGroupMap() {
        int size = 17;

        List<User> users = User.newList(size);
        Map<String, List<User>> stringListMap = CollectionDemo.listToGroupMap(users);
        System.out.println(stringListMap);
    }

    @Test
    public void testMultipleListToGroupMap() {
    }

    @Test
    public void testListToMap() {
    }

    @Test
    public void testListId() {
    }

    @Test
    public void testFilterList() {
    }

    @Test
    public void testRemoveDuplicate1() {
    }

    @Test
    public void testRemoveDuplicate2() {
    }

    @Test
    public void testForList() {
    }
}