/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author willian
 */
public class BrazilInterestService implements InterestService{
    
    private final double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }    

    @Override
    public double getInterestRate() {
        return interestRate;
    }
        
}
