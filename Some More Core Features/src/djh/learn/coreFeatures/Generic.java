public class Generic<T> {
    T obj;

    void addItem(T obj){
        this.obj = obj;
    }
    
    T getItem(){
        return obj;
    }
}
