package com.telran;

import org.junit.Assert;
import org.junit.Test;




public class CasinoTest  {

    @Test
    public void testCasino(){
        Casino casino = new Casino("peter",20,2);
     int res = CasinoCount.countMinimumNumberOfMoves(20,2);

       Assert.assertEquals(casino,res);
      System.out.println(res);


    }
    }

