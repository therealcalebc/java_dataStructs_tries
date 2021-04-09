/**
 * 
 */
package com.javaoopdata.tries;
import java.util.HashMap;

/**
 * @author ccomstock
 *
 */
public class Node {
	public HashMap<Character, Node> children;
    public boolean isCompleteWord;
    
    public Node() {
        this.children = new HashMap<Character, Node>();
        this.isCompleteWord = false;
    }
}
