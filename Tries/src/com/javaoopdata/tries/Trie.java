/**
 * 
 */
package com.javaoopdata.tries;

/**
 * @author ccomstock
 *
 */
public class Trie {
public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }
    
    public boolean isPrefixValid(String prefix) {
    	if(prefix.length() == 0) return false;
    	Node currentNode = this.root;
    	for(int i = 0; i < prefix.length(); i++) {
    		Character currentLetter = prefix.charAt(i);
    		Node child = currentNode.children.get(currentLetter);
    		if(child == null) return false;
    		currentNode = child;
    	}
    	return true;
    }
    
    public boolean isWordValid(String word) {
    	if(word.length() == 0) return false;
    	Node currentNode = this.root;
    	for(int i = 0; i < word.length(); i++) {
    		Character currentLetter = word.charAt(i);
    		Node child = currentNode.children.get(currentLetter);
    		if(child == null) return false;
    		currentNode = child;
    	}
    	return true;
    }
    
    public void printAllKeys() {
    	printChildren(this.root);
    }
    private void printChildren(Node node) {
    	if(node == null) return;
    	node.children.forEach((k, v) -> {
    		System.out.println(k);
    		printChildren(v);
    	});
    }
    
}
