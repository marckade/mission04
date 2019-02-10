package edu.isu.cs.cs3308.structures.impl;


import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

public class RedBlueDoubleStackImpl<E> implements  RedBlueDoubleStack<E> {


    //Red on top

    // Blue on bottom.


    protected LinkedDeque<E> listRedBlue = new LinkedDeque<>();
    protected int redSize = 0;
    protected boolean redIsEmpty = true;
    protected int blueSize = 0;
    protected boolean blueIsEmpty = true;

    /**
     * Adds the element to the top of the Red Stack, unless the element is null.
     *
     * @param element Element to add.
     */
    @Override
    public void pushRed(E element) {

        if(element == null)
        {
             //Do nothing.
        }
        else
        {
            redSize++;
            //Add the element to the top of the que (the red portion.)
            listRedBlue.offerFirst(element);
        }

    }


    /**
     * Adds the element to the top of the Blue Stack, unless the element is
     * null.
     *
     * @param element Element to add.
     */
    @Override
    public void pushBlue(E element) {

        if(element == null)
        {
            //Do nothing.
        }
        else
        {
            blueSize++;
            listRedBlue.offer(element);
        }
    }

    /**
     * Removes the element at the top of the Red Stack and returns its value,
     * unless the Red Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Red Stack is
     * empty
     */
    @Override
    public E popRed() {
        if(listRedBlue.size() < 0)
        {
            return null;
        }
        else
        {
            redSize--;
            return listRedBlue.poll();
        }
    }

    /**
     * Removes the element at the top of the Blue Stack and returns its value,
     * unless the Blue Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Blue Stack is
     * empty
     */
    @Override
    public E popBlue() {
        if(blueSize < 0)
        {
            return null;
        }
        else
        {
            blueSize--;
            return listRedBlue.pollLast();
        }
    }

    /**
     * Returns the value at the top of the Red Stack.
     *
     * @return The value at the top of the Red Stack, or null if the Red Stack
     * is emtpy
     */
    @Override
    public E peekRed() {
        if(redSize < 0)
        {
            return null;
        }
        else
        {
            return listRedBlue.peek();
        }
    }

    /**
     * Returns the value at the top of the Blue Stack.
     *
     * @return The value at the top of the Blue Stack, or null if the Blue Stack
     * is emtpy
     */
    @Override
    public E peekBlue() {
        if(blueSize < 0)
        {
            return null;
        }
        else
        {
            return listRedBlue.peekLast();
        }
    }

    /**
     * @return Current size of the Blue Stack
     */
    @Override
    public int sizeBlue() {
        return blueSize;
    }

    /**
     * @return Current size of the Red Stack
     */
    @Override
    public int sizeRed() {
        return redSize;
    }

    /**
     * @return True if the Blue Stack is empty, false otherwise
     */
    @Override
    public boolean isBlueEmpty() {
        if(blueSize == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * @return True if the Red Stack is empty, false otherwise
     */
    @Override
    public boolean isRedEmpty() {
        if(redSize == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
