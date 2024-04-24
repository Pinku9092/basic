/*
 * package com.pinku; //case 1 class Parent{ void msg() {
 * System.out.println("Parent"); } }
 * 
 * class Child extends Parent{
 * 
 * void msg() throws IOException { //Checked Exception Not allowed
 * System.out.println("In Child"); }
 * 
 * void msg() throws NullPointerException { //Unchecked Exception works fine if
 * parent class does not declare a exception
 * 
 * System.out.println("In Child"); } } //case 2 class Parent1{ void msg() throws
 * ArithmeticException { System.out.println("Parent1"); } } class Child1 extends
 * Parent1{
 * 
 * void msg() throws ArithmeticException{ // if super class declare exception
 * then child class can declare same exception,no exception //sub class
 * exception but not parent exception System.out.println("In Child1"); }
 * 
 * 
 * 
 * void msg() throws Exception{ System.out.println("In Child1"); }
 * 
 * } public class InheritanceException {
 * 
 * public static void main(String[] args) { Parent p = new Child(); p.msg();
 * 
 * Parent1 p1 = new Child1(); p1.msg(); }
 * 
 * }
 */