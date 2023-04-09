/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tutorial.w3ADT.T3Q2;

/**
 * @author chatGPT
 * An interface representing a bid for installing an air conditioning unit.
 */
public interface BidInterface {
  /**
   * Returns the name of the company making this bid.
   * @return the name of the company
   */
  public String getCompanyName();

  /**
   * Returns the description of the air conditioner that this bid is for.
   * @return the description of the air conditioner
   */
  public String getACDescription();

  /**
   * @return the capacity of the AC in tons
   */
  public double getACCapacity();

  /**
   * Returns the seasonal efficiency of this bid's AC (SEER).
   * @return the SEER of the AC
   */
  public double getACSEER();

  /**
   * Returns the cost of this bid's AC.
   * @return the cost of the AC
   */
  public double getACCost();

  /**
   * Returns the cost of installing this bid's AC.
   * @return the cost of installation
   */
  public double getInstallationCost();

  /**
   * Returns the yearly cost of operating this bid's AC.
   * @return the yearly cost of operation
   */
  public double getYearlyOperatingCost();

}
