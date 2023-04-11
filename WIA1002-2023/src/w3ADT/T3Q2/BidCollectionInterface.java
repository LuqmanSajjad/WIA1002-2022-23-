/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package w3ADT.T3Q2;

import java.util.List;

/**
 * An interface representing a collection of bids for installing air conditioning units.
 */
public interface BidCollectionInterface {

  /**
   * Adds a bid to this collection.
   * @param bid the bid to add
   * @throws NullPointerException if the bid is null
   */
  public void addBid(BidInterface bid);

  /**
   * Returns the bid in this collection with the best yearly cost.
   * 
   * @return the bid with the best yearly cost, or null if this collection is empty
   */
  public BidInterface getBestYearlyCostBid();

  /**
   * Returns the bid in this collection with the best initial cost.
   * The initial cost will be defined as the unit cost plus the installation cost.
   * @return the bid with the best initial cost, or null if this collection is empty
   */
  public BidInterface getBestInitialCostBid();

  /**
   * Clears all of the bids from this collection.
   */
  public void clearBids();

  /**
   * Gets the number of bids in this collection.
   * 
   * @return the number of bids in this collection
   */
  public int getBidCount();

  /**
   * Checks whether this collection is empty.
   * 
   * @return true if this collection contains no bids, false otherwise
   */
  public boolean isEmpty();

  /**
   * Searches for bids in this collection based on price.
   * Returns a list of bids that have a unit cost within the specified range (inclusive).
   * 
   * @param minPrice the minimum unit cost to search for
   * @param maxPrice the maximum unit cost to search for
   * @return a list of bids with a unit cost within the specified range, or an empty list if none found
   */
  public List<BidInterface> searchBidsByPrice(double minPrice, double maxPrice);

  /**
   * Searches for bids in this collection based on performance.
   * Returns a list of bids that have a seasonal efficiency (SEER) within the specified range (inclusive).
   * 
   * @param minSEER the minimum SEER to search for
   * @param maxSEER the maximum SEER to search for
   * @return a list of bids with a SEER within the specified range, or an empty list if none found
   */
  public List<BidInterface> searchBidsByPerformance(double minSEER, double maxSEER);

}
