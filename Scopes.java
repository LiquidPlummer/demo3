package demo3;

public class Scopes {
    /*
    Scoping or Scopes is a concept in most programming languages where declared or initialized resources are not
    available in all locations of code, instead there are rules which place boundaries on the "scope". The scoping
    rules.

    Block: a block of code is code located within {curly braces}, blocks can be nested within other blocks.
    That means: A class definition has a scope, and all of the methods inside that scope have their own scope.
    Loops, if statements, switches, these also use {curly braces} these are also code blocks.

    The scoping rules:
    1. Things are not available outside the block of code in which they are declared.
    2. Nested scopes, where one block of code is inside another the inner scope is part of, is contained within, the
    outer scope. This means that things declared in the outer scope ARE available in the inner scope.
    3. Invoking a method LEAVES THE CURRENT SCOPE - we jump right out of our scope and into that class and method scope.
        This is why we have: parameters, returns.


    Interesting point about methods: sending data to the method scope, you can send many pieces of data, a parameter list
    can contain 0, 1, or many parameters. You can only return one thing.




    Scoping availability always goes deeper, never goes shallower.
     */

    public static void main(String[] args) {
        int outer = 3; //this is scoped to the main method block
        //Block A
        {
            int innerA = 1;
            outer = 3;


        }

        //block b
        {
            int innerB = 2;
        }
    }
}

