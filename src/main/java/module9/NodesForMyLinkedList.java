package module9;

class NodesForMyLinkedList<E> {
    NodesForMyLinkedList<E> next;
    NodesForMyLinkedList<E> prev;
    E item;

    NodesForMyLinkedList(E item) {
        this.item = item;
        next = null;
        prev = null;
    }
}
