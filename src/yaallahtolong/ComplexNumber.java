/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaallahtolong;

/**
 *
 * @author ROG
 */
public class ComplexNumber {

    private int re, im;

    // Constructor 1
    public ComplexNumber(double r, double i) {
        this.re = (int) r;
        this.im = (int) i;
    }

    // Get complex number real part.
    public double getReal() {
        return this.re;
    }

    // Get complex number imaginary part.
    public double getImaginary() {
        return this.im;
    }

    // Complex number reciprocal.
    // Complex number subtraction.
    // Complex number multiplication.
    public ComplexNumber multiply(ComplexNumber cn) {
        double comnum1 = re * cn.getReal() - im * cn.getImaginary();
        double comnum2 = im * cn.getReal() + re * cn.getImaginary();
        return new ComplexNumber(comnum1, comnum2);
    }

    // Complex number division.
    // Complex number conjugation.
    public String toString() {
        String result;
        if (im == 0) {
            result = re + "";
        } else if (re == 0) {
            result = im + "i";
        } else if (im < 0) {
            result = re + "-" + (im * (-1)) + "i";
        } else {
            result = re + "+" + im + "i";
        }
        return result;
    }
} // End od class

