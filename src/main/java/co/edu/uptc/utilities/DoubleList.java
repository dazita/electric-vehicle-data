package co.edu.uptc.utilities;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * DoubleList
 */
public class DoubleList implements List<Integer>{
    
    private Node header;
    private Node last;
    
    @Override
    public boolean contains(Object o) {
        Node tempNode = header;
        while(tempNode != null){
            if(tempNode.getInfo() == o){
                return true;
            } else {
                tempNode = tempNode.getNext();
            }
        }
        return false;
    }
    
    @Override
    public boolean add(Integer o) {
        Node newNode = new Node();
        newNode.setInfo(o);
        newNode.setNext(null);
        if(header == null){
            newNode.setBack(null);
            header = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            newNode.setBack(last);
            last = newNode;
        }
        return true;
    }

    @Override
    public int size() {
        int counter = 0;
        Node tempNode = header;
        while(tempNode != null){
            counter++;
            tempNode = tempNode.getNext();
        }
        return counter;
    }

    @Override
    public boolean isEmpty() {
        if (header == null) {
            return true;
        } else {
            return false;
        }
    }

    
    // TODO: refactorizar.
    @Override
    public boolean remove(Object o) {
        if (header.getInfo() == o){
            header.getNext().setBack(null);
            header = header.getNext();
            return true;
        } else {   
            Node tempNode = header.getNext();
            while (tempNode != null) {
                if(tempNode.getInfo() == o){
                    tempNode.getBack().setNext(tempNode.getNext());
                    tempNode.getNext().setBack(tempNode.getBack());
                    return true;
                } else {
                    tempNode = tempNode.getNext();
                }
            }
            return false;
        }
    }

    
    public String showList(){
        String list = "";
        Node actualNode = header;
        while (actualNode != null){
            list += (actualNode.getInfo() + " ");
            actualNode = actualNode.getNext();
        }
        return list;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Integer get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Integer set(int index, Integer element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, Integer element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Integer remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<Integer> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

    @Override
    public Iterator<Integer> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

   
}