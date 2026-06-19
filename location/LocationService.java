package com.bilibili.location;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/LocationService.class */
public interface LocationService {
    public static final int LOC_ERR = 1;
    public static final int LOC_ERR_MISS_CITY = 5;
    public static final int LOC_ERR_NET = 2;
    public static final int LOC_ERR_UNKNOWN = 4;
    public static final int LOC_ERR_UNKNOWN_LOCATION = -1;
    public static final int LOC_ERR_WGS84TOGCJ02 = 3;
    public static final int LOC_SUC = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/LocationService$LocationListaner.class */
    public interface LocationListaner {
        void onLocationChanged(BLLocation bLLocation, int i7, String str);
    }

    BLLocation getLastLocation();

    void requestLocation(LocationListaner locationListaner);

    void requestLocation(LocationListaner locationListaner, Boolean bool, String str);

    void requestSingleFreshLocation(LocationListaner locationListaner);

    void requestSingleFreshLocation(LocationListaner locationListaner, Boolean bool, String str);

    void setForceRequestListener(ForceRequestListener forceRequestListener);

    void startLocate(LocationListaner locationListaner);

    void stopLocate(LocationListaner locationListaner);
}
