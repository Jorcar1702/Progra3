package pilaint;

import java.util.Stack;

public class PilaInt {
    Stack<Integer> numeros;

    public PilaInt(){
        numeros= new Stack<Integer>();
    }
    public boolean isEmpty(){
        return numeros.isEmpty();
    }
    public void push(Integer dato){
        numeros.push(dato);
    }
    public Integer pop() throws Exception{
        if (!isEmpty()) {
            return numeros.pop();
        }
        throw new Exception("La pila esta vacia");
    }
    public Integer peek() throws Exception{
        if (!isEmpty()) {
            return numeros.peek();
        }
        throw new Exception("La pila esta vacia");
    }
    public int search(Integer i) throws Exception {
        if (!isEmpty()) {
            return numeros.search(i);
        }
        throw new Exception("La pila esta vacia");
    }
    public String sacarPila(){

        String resultado ="";
        for(int i=numeros.size()-1;i>=0;i--){
            resultado= resultado+numeros.get(i)+"\n";
        }
        return resultado;
    }

}

