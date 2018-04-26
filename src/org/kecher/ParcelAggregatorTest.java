package org.kecher;

import org.junit.Test;

/**
 * Created by kev on 4/3/17.
 */
public class ParcelAggregatorTest {

    @Test
    public void addParcelToAggregator() {
        Parcel p = new Parcel("ParcelName", "ParcelDependency");
        ParcelAggregator pa = new ParcelAggregator();
        pa.addParcels(p);
    }
}