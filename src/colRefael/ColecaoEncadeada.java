package colRefael;

public class ColecaoEncadeada {
    private Node refHead = null;
    private int qtdElem = 0;

    public void addFirst(String str) {
        Node novo = new Node();
        novo.setItem(str);
        novo.setRefNext(refHead);
        refHead = novo;
        qtdElem++;
    }

    public String get(int pos) {
        String res = null;
        Node aux;
        int i;
        if ((pos >= 0) && (pos < qtdElem)) {
            if (refHead != null) {
                aux = refHead;
                for (i = 1; i <= pos; i++)
                    aux = aux.getRefNext();
                res = aux.getItem();
            }
        } else
            throw (new IndexOutOfBoundsException());
        return res;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < qtdElem; i++)
            s = s + get(i) + " ";
        return s;
    }

    private class Node {
        private Node refNext;
        private String item;

        public Node getRefNext() {
            return refNext;
        }

        public void setRefNext(Node refNext) {
            this.refNext = refNext;
        }

        public String getItem() {
            return this.item;
        }

        public void setItem(String item) {
            this.item = item;
        }
    }


}