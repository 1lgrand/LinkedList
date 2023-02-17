public class Lista {

    Nodo testa;
    Nodo coda;

    int nElementi = 0;

    public Lista(){

    }

    public boolean isEmpty(){
        return testa == null;
    }

    public void enqueue(int data){
        Nodo tmp = new Nodo(data);

        if (isEmpty()){
            testa = tmp;
            nElementi++;
        }else{
            tmp.setNext(testa);
            testa = tmp;
            nElementi++;
        }
    }

    public void dequeue() {

        Nodo curr = testa;
        Nodo last;

        if (isEmpty()) {
            System.out.println("La lista è vuota");
        } else {
            do {
                last = curr;
                curr = curr.getNext();
            } while (curr.getNext() != null);

            last.setNext(null);

            System.out.println("Ultimo elemento eliminato con successo");
        }
    }

    public void svuotaLista(){
        testa = null;
    }

    public void stampa(){

        if (isEmpty()){
            System.out.println("La lista è vuota");
        }else{
            Nodo current = testa;

            while (current != null){
                System.out.print("->" + current.getData());
                current = current.getNext();
            }
            System.out.println();
        }

    }

    public int getnElementi() {
        return nElementi;
    }
}
