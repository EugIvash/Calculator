/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

public class Calculator {

private double a;
private double b;

public double get_a()
{
    return a;
}
public double get_b()
{
    return b;
}
public void set_a(double a)
{
    this.a = a;
}
public void set_b(double b)
{
    this.b = b;
}

public double minus ()
{
    double c = a - b;
    return c;
}

public double plus ()
{
    double c = a + b;
    return c;
}

public double divison ()
{
    double c = a / b;
    return c;
}

public double multiply ()
{
    double c = a * b;
    return c;
}
}
