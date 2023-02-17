public class Nodo {

    int data;
    Nodo next;


    public Nodo(int data) {
        this.data = data;
        this.next = null;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }


}
