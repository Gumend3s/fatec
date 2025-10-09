import java.util.LinkedList;
import java.util.List;
import java.util.EmptyStackException;


public class pilha<T> {
    private List<T> elementos = new LinkedList<>();

    public void push(T elemento){
        elementos.add(elemento);
    }

    public boolean isEmpty(){
        return elementos.isEmpty();
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size()-1);
    }

    public int size(){
        return elementos.size();
    }

    @Override
    public String toString(){
        return "Pilha: "+ elementos.toString();
    }

}
