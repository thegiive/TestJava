package algorithm.tree;

import junit.framework.TestCase;

public class TrieNodeTest extends TestCase {

    boolean debug ;
    TrieNode n1 ;
    protected  void setUp(){
        n1 = new TrieNode() ;
//        debug = true ;
    }

    public void testToString1(){
        n1.insert('c');
        n1.insert('b');
        n1.insert('c');

        if(debug) System.out.println(n1);
        assertEquals("1 b:1 c:2 " , n1.toString());
    }


    public void testToString2(){
        n1.insert('c');
        n1.insert('b');
        n1.insert('c');
        n1.getNode('c').insert('a');

        if(debug) System.out.println(n1);
        assertEquals("1 b:1 c:2 " , n1.toString());
    }

    public void testGetString1(){
        n1.insert('c');
        n1.insert('b');
        n1.insert('c');
        n1.getNode('c').insert('a');
        assertEquals(1 , n1.getCount("ca"));
        assertEquals(0 , n1.getCount("cd"));
        assertEquals(0 , n1.getCount("abc"));

    }

    public void testGetString2(){
        n1.insert('c');
        n1.insert('b');
        n1.insert('c');
        n1.getNode('c').insert('a');
        assertEquals(1 , n1.getNode("ca").count);
    }


    public void testInsertAndGetString(){
        n1.insert('c');
        n1.insert('b');
        n1.insert('c');
        n1.getNode('c').insert('a');
        assertEquals(null, n1.getNode("abc"));
        n1.insert("abc");
        assertEquals(1, n1.getCount("abc"));
        if(debug) System.out.println(n1);
        assertEquals("1 a:1 b:1 c:2 " , n1.toString());
        if(debug) System.out.println(n1.getNode('a'));
        assertEquals("1 b:1 " , n1.getNode('a').toString());
        assertEquals("1 c:1 " , n1.getNode('a').getNode('b').toString());
    }

    public void testAll(){
        n1.insert("abc");
        n1.insert("bcd");
        n1.insert("apple");
        n1.insert("abcdf");
        n1.insert("kafka");
        assertEquals(3 , n1.getCount("a"));
        assertEquals(2 , n1.getCount("abc"));
        assertEquals(1 , n1.getCount("abcdf"));
        assertEquals(1 , n1.getCount("kafka"));
        assertEquals(0 , n1.getCount("abcdff"));

    }

}