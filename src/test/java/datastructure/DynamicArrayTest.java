package datastructure;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DynamicArrayTest extends TestCase {


    protected void setUp(){
    }

    public void test1(){
        List<List<Integer>> queries = new ArrayList<List<Integer>>();

        List<Integer> query = new ArrayList<Integer>();
        for(String s : "1 0 5".split(" ")){  query.add(Integer.parseInt(s)); }
        queries.add(query);

        query = new ArrayList<Integer>();
        for(String s : "1 1 7".split(" ")){  query.add(Integer.parseInt(s)); }
        queries.add(query);

        query = new ArrayList<Integer>();
        for(String s : "1 0 3".split(" ")){  query.add(Integer.parseInt(s)); }
        queries.add(query);

        query = new ArrayList<Integer>();
        for(String s : "2 1 0".split(" ")){  query.add(Integer.parseInt(s)); }
        queries.add(query);

        query = new ArrayList<Integer>();
        for(String s : "2 1 1".split(" ")){  query.add(Integer.parseInt(s)); }
        queries.add(query);

        List<Integer> list = DynamicArray.dynamicArray(2 , queries);
        assertEquals((Integer)list.get(0) , (Integer)7 );
        assertEquals((Integer)list.get(1) , (Integer)3 );

    }

}