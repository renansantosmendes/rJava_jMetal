/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.problem.multiobjective.dtlz.DTLZ5;

/**
 *
 * @author renansantos
 */
public class MainClass {

    public static void main(String[] args) {
        /*
        args[0]: problem name
        args[1]: number of objectives
        args[2]: numter of variables
         */

        String problemName = "";
        int numberOfObjectives = 1;
        int numberOfVariables = 10;

        try {
            problemName = args[0];
            numberOfObjectives = Integer.parseInt(args[1]);
            numberOfVariables = Integer.parseInt(args[2]);
        } catch (Exception e) {
            System.out.println("Invalid parameters!");
        }
        if (problemName == "DTLZ") {
            Problem problem = new DTLZ5(numberOfVariables, numberOfObjectives);
        }

        Problem problem = new DTLZ5(numberOfVariables, numberOfObjectives);

        System.out.println("You choosed the problem: " + problemName);
        System.out.println("With: " + numberOfObjectives + " objectives");
    }
}
