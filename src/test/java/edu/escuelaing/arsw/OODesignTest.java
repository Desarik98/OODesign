package edu.escuelaing.arsw;

import org.junit.Assert;
import org.junit.Test;

public class OODesignTest
{
    private final String path = "/home/daniel/Escritorio/ARSW/OODesign/OODesign/numbers";
    private final String path2 = "/home/daniel/Escritorio/ARSW/OODesign/OODesign/double.txt";
    @Test
    public void deberiaCalcularMediaPath1(){
        OODesign.main(new String[]{path});
        Assert.assertEquals(550.6, OODesign.mean,0);
    }

    @Test
    public void deberiaCalcularDesviacionEstandarPath1(){
        OODesign.main(new String[]{path});
        Assert.assertEquals(572.03, OODesign.standardDeviation,0.1);
    }

    @Test
    public void deberiaCalcularMediaPath2(){
        OODesign.main(new String[]{path2});
        Assert.assertEquals(60.32, OODesign.mean,0.1);
    }

    @Test
    public void deberiaCalcularDesviacionEstandarPath2(){
        OODesign.main(new String[]{path2});
        Assert.assertEquals(62.26, OODesign.standardDeviation,0.1);
    }
}