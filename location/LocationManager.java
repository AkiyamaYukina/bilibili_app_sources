package com.bilibili.location;

import android.content.Context;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.location.LocationService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/LocationManager.class */
public class LocationManager implements LocationService {
    public static String[] LOCATION_PERMISSION = {PermissionsChecker.ACCESS_FINE_LOCATION, PermissionsChecker.ACCESS_COARSE_LOCATION};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LocationManager f65456b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocationService f65457a;

    public static LocationManager getInstanse(Context context) {
        LocationManager locationManager;
        synchronized (LocationManager.class) {
            try {
                if (f65456b == null) {
                    f65456b = new LocationManager();
                }
                locationManager = f65456b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return locationManager;
    }

    public final void a() {
        if (this.f65457a == null) {
            throw new IllegalArgumentException("init LocationManager first");
        }
    }

    @Override // com.bilibili.location.LocationService
    @Nullable
    public BLLocation getLastLocation() {
        a();
        return this.f65457a.getLastLocation();
    }

    public void injectDelegate(LocationService locationService) {
        this.f65457a = locationService;
    }

    @Override // com.bilibili.location.LocationService
    public void requestLocation(@NotNull LocationService.LocationListaner locationListaner) {
        a();
        this.f65457a.requestLocation(locationListaner);
    }

    @Override // com.bilibili.location.LocationService
    public void requestLocation(LocationService.LocationListaner locationListaner, Boolean bool, String str) {
        a();
        this.f65457a.requestLocation(locationListaner, bool, str);
    }

    @Override // com.bilibili.location.LocationService
    public void requestSingleFreshLocation(@NotNull LocationService.LocationListaner locationListaner) {
        a();
        this.f65457a.requestSingleFreshLocation(locationListaner);
    }

    @Override // com.bilibili.location.LocationService
    public void requestSingleFreshLocation(LocationService.LocationListaner locationListaner, Boolean bool, String str) {
        a();
        this.f65457a.requestSingleFreshLocation(locationListaner, bool, str);
    }

    @Override // com.bilibili.location.LocationService
    public void setForceRequestListener(@NotNull ForceRequestListener forceRequestListener) {
        a();
        this.f65457a.setForceRequestListener(forceRequestListener);
    }

    @Override // com.bilibili.location.LocationService
    public void startLocate(@NotNull LocationService.LocationListaner locationListaner) {
        a();
        this.f65457a.startLocate(locationListaner);
    }

    @Override // com.bilibili.location.LocationService
    public void stopLocate(@NotNull LocationService.LocationListaner locationListaner) {
        a();
        this.f65457a.stopLocate(locationListaner);
    }
}
