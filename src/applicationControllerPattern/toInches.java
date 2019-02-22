/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationControllerPattern;

public class toInches implements convertionFormula {
        @Override
	public void execute(Integer engineSize){
            float newSize = Math.round(engineSize/16.387064);
		System.out.println( newSize + " cubic inches");
	}
}
