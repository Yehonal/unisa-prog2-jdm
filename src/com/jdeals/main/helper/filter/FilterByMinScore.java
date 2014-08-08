package com.jdeals.main.helper.filter;

import com.jdeals.main.entity.catalogue.Item;
import com.jdeals.main.entity.catalogue.Supply;

/**
 * The Class FilterByMinScore.
 */
public class FilterByMinScore implements Predicate<Item>{
	
	/** The min score. */
	private byte minScore;
	
	/**
	 * Instantiates a new filter by min score.
	 *
	 * @param minScore the min score
	 */
	public FilterByMinScore(byte minScore) {
		this.minScore=minScore;
	}

	/**
	 * Apply the filter
	 * @see Supply
	 * @see Item
	 * @see com.jdeals.main.helper.filter.Predicate#apply(java.lang.Object)
	 */
	@Override
	public boolean apply(Item item) {
		return item instanceof Supply && ((Supply)item).getSupplier().getScoreAverage()>=this.minScore;
	}

}
