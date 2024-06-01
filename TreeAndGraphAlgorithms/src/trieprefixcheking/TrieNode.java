package trieprefixcheking;

public class TrieNode {
	TrieNode[] children;
	boolean isEndofWord;
	public TrieNode() {
		children = new TrieNode[26];
	}
}
