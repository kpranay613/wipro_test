package trieprefixcheking;

public class Trie {
	private TrieNode root;
	public Trie() {
		root = new TrieNode();
	}
	public void insert(String word) {
		TrieNode node = root;
		for(char ch : word.toCharArray()) {
			int index = ch - 'a';
			if(node.children[index] == null) {
				node.children[index] = new TrieNode();
			}
			node = node.children[index];
		}
		node.isEndofWord = true;
	}
	
	public boolean isPrefix(String prefix) {
		TrieNode node = root;
		for(char ch : prefix.toCharArray()) {
			int index = ch - 'a';
			if(node.children[index] == null) {
				return false;
			}
			node = node.children[index];
		}
		return true;
	}
	
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("app");
		trie.insert("bat");
		trie.insert("ball");
		
		System.out.println("Is 'ap' a prefix : "+trie.isPrefix("ap"));
		System.out.println("Is 'ba' a prefix : "+trie.isPrefix("ba"));
		System.out.println("Is 'ca' a prefix : "+trie.isPrefix("ca"));
	}
}
