/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationControllerPattern;

/**
 *
 * Rob Johnson
 */
public class toCentimeters implements convertionFormula {
        @Override
	public void execute(Integer engineSize){
            float newSize = Math.round(engineSize * 16.387);
		System.out.println( newSize + " cubic centimeters");
	}
}
