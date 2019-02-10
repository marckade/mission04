package edu.isu.cs.cs3308.structures.impl;


import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

public class RedBlueDoubleStackImpl<E> implements  RedBlueDoubleStack<E> {


    //Red on top

    // Blue on bottom.


    //Create the class vars to operate the double stack.
    private LinkedDeque<E> listRedBlue = new LinkedDeque<>();
    private int redSize = 0;
    private boolean redIsEmpty = true;
    private int blueSize = 0;
    private boolean blueIsEmpty = true;

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
            //Iterate red size up.
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

        //Checks if the element parameter is null.
        if(element == null)
        {
            //Do nothing.
        }
        else
        {
            //Iterate blue size up.
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

        //Check if the size of the entire list is greater than 0.
        if(listRedBlue.size() < 0)
        {
            return null;
        }
        else
        {
            //Iterate red size down.
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

        //Checks if blueSize has any elements before continuing.
        if(blueSize < 0)
        {
            return null;
        }
        else
        {

            //Iterate size down.
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

        //Checks if redSize has any elements before continuing.
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

        //Checks if blueSize has any elements before continuing.
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

        //Return blueSize class var we have on top.
        return blueSize;
    }

    /**
     * @return Current size of the Red Stack
     */
    @Override
    public int sizeRed() {

        //Return redSize class var we have on top.
        return redSize;
    }

    /**
     * @return True if the Blue Stack is empty, false otherwise
     */
    @Override
    public boolean isBlueEmpty() {

        //Checks if the blue stack has any elements.
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

        //Checks if the red stack has any elements.
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
