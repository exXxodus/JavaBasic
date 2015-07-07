package com.sourceit.java.basic.bohuslavskyi.lesson26;

class DebuggingExercise2
{ 
    public static void main(String[] args) 
    { 
        Account a = new Account(null); 
        a.deposit(100); 
        System.out.println(a.getOwner() + " has $" + a.getBalance()); 
    } 
}
