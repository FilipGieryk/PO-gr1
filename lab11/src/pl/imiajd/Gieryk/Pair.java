package pl.imiajd.Gieryk;

public class Pair<T> {

    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void swap(){
        T tmp=first;
        first=second;
        second=first;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }

    private T first;
    private T second;
}
