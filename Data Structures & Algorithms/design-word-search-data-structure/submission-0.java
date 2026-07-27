class WordDictionary {
    private WordDictionary[] child;
    private boolean endOfWord;


    public WordDictionary() {
        child = new WordDictionary[26];
        endOfWord = false;
    }

    public void addWord(String word) {
        WordDictionary current = this;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';

            if (current.child[index] == null) current.child[index] = new WordDictionary();

            current = current.child[index];
        }

        current.endOfWord = true;
    }

    public boolean search(String word) {
        return searchInNode(this, word, 0);
    }

    private boolean searchInNode(WordDictionary node, String word, int index) {
        if (index == word.length()) {
            return node.endOfWord;
        }

        char c = word.charAt(index);
        if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.child[i] != null) {
                    if (searchInNode(node.child[i], word, index + 1)) {
                        return true;
                    }
                }
            }

            return false;
        } else {
            int childIndex = c - 'a';
            if (node.child[childIndex] == null) {
                return false;
            }
            return searchInNode(node.child[childIndex], word, index + 1);
        }
    }
}
