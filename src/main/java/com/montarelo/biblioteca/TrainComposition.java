package com.montarelo.biblioteca;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition<Integer> {
	Deque queue = new LinkedList<Integer>();
    public void attachWagonFromLeft(int wagonId) {
        queue.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        queue.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        int wagonRemoved=(int) queue.removeFirst();
        return wagonRemoved;
    }

    public int detachWagonFromRight() {
    	int wagonRemoved=(int) queue.removeLast();
        return wagonRemoved;
    }

    public static void main(String[] args) {
        TrainComposition<?> tree = new TrainComposition<>();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
