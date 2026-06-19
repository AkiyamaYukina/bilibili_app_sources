package com.bilibili.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.bilibili.location.LocationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/a.class */
public final class a implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f65458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationService.LocationListaner f65459b;

    public a(b bVar, LocationService.LocationListaner locationListaner) {
        this.f65458a = bVar;
        this.f65459b = locationListaner;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        d.f65475e.i("location.debug", "onLocationChanged :: " + Double.valueOf(location.getLongitude()) + " latitude " + Double.valueOf(location.getLatitude()) + " " + location);
        this.f65458a.e(location, this.f65459b);
        android.location.LocationManager locationManager = this.f65458a.f65461b;
        android.location.LocationManager locationManager2 = locationManager;
        if (locationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSystemLocationManager");
            locationManager2 = null;
        }
        locationManager2.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i7, Bundle bundle) {
    }
}
