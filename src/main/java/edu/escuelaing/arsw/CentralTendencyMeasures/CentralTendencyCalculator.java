package edu.escuelaing.arsw.CentralTendencyMeasures;

import edu.escuelaing.arsw.LinkedList.LinkedList;

public class CentralTendencyCalculator {
    private final LinkedList<Double> list;

    /**
     * Constructor of the class CentralTendencyCalculator
     * @param list linked list with the numbers to operate
     */
    public CentralTendencyCalculator(LinkedList<Double> list){
        this.list = list;
    }

    /**
     * Method that calculates the mean of the list
     * @return mean
     */
    public double calculateMean(){
        double acum = 0;
        for(Double i: list){
            acum+=i;
        }
        return acum/list.size();
    }

    /**
     * Method that calculates the standard deviation
     * @return standard deviation
     */
    public double standardDeviation(){
        double acum = 0;
        for (Double i : list){
            acum += Math.pow(i - calculateMean(),2);
        }
        double temp = acum/(list.size()-1);
        return Math.sqrt(temp);
    }
}
