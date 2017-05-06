package com.phillips.phillipsgallerymap;

import com.google.android.gms.maps.LocationSource;
import com.indooratlas.android.sdk.IALocation;

public class LocationEvent {

    /**
     * Origin of this location event.
     */
    public final LocationSource source;

    /**
     * Actual location shared.
     */
    public final IALocation location;

    public LocationEvent(LocationSource source, IALocation location) {
        this.source = source;
        this.location = location;
    }
}
