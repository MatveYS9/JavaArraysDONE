/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgx.javaarraysdone;

/**
 *
 * @author Matvey
 */
public class JavaArraysDONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] demoArray = new String[3][3];
        String[] row1 = {"X","O","O"};        
        demoArray[0] = row1;
        
        String[] row2 = {"O","O","X"};
        demoArray[1] = row2;
        
        String[] row3 = {"O","X","X"};
        demoArray[2] = row3;
        
        for (int i = 0; i < demoArray.length; i++) {
            for (int j = 0; j < demoArray[i].length; j++) {
                System.out.printf("%3s", demoArray[i][j]);
            }
            System.out.println();
        }
    }
    
}
