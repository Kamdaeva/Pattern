public class Adaptateur implements Stack {
    private DList dlist;

    public Adaptateur(DList dlist) {
        
    }
    @Override
    public void push(Object o){
        // return dlist.insertTail(1);
    }
    @Override
    public Object pop(){
        return dlist.removeTail();
    }
    @Override
    public Object top(){
        return dlist.getHead();
    }
}
