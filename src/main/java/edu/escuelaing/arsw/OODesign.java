package edu.escuelaing.arsw;

import edu.escuelaing.arsw.CentralTendencyMeasures.CentralTendencyCalculator;
import edu.escuelaing.arsw.LinkedList.LinkedList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OODesign
{
    public static Double mean;
    public static Double standardDeviation;

    public static void main( String[] args ) {
        String fileName = args[0];
        Path path = Paths.get(fileName);
        LinkedList<Double> list = new LinkedList<>();
        try(Stream<String> stream = Files.lines(path)){
            for (String i: stream.collect(Collectors.toList())){
                list.add(Double.parseDouble(i.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        CentralTendencyCalculator calculator = new CentralTendencyCalculator(list);
        mean = calculator.calculateMean();
        standardDeviation = calculator.standardDeviation();
        System.out.println(mean);
        System.out.println(standardDeviation);
    }
}
