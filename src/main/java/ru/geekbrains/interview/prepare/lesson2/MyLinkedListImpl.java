package ru.geekbrains.interview.prepare.lesson2;

public class MyLinkedListImpl<E> implements MyLinkedList<E> {

    protected int size;

    protected Node<E> firstElement;

    @Override
    public void insertFirst(E value) {
        firstElement = new Node<>(value, firstElement);
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> removedNode = firstElement;
        E data = removedNode.item;

        firstElement = firstElement.next;
        removedNode.next = null;
        removedNode.item = null;

        size--;
        return data;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = firstElement;
        Node<E> previous = null;
        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }
        if (current == firstElement) {
            firstElement = firstElement.next;
        } else {
            previous.next = current.next;
        }
        current.next = null;
        current.item = null;
        size--;
        return true;
    }

    @Override
    public boolean contains(E value) {
        Node<E> current = firstElement;
        while (current != null) {
            if (current.item.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void display() {
        Node<E> current = firstElement;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }

}
