package com.bilibili.location;

import Hx.p;
import android.text.TextUtils;
import android.util.Log;
import com.bilibili.gripper.api.log.GLog;
import com.bilibili.gripper.api.neuron.GNeurons;
import com.bilibili.location.LocationService;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/d.class */
public final class d implements LocationService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Og0.c f65473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static GNeurons f65474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static GLog f65475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f65476f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f65477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocationService f65478b;

    public static boolean a(BLLocation bLLocation) {
        boolean z6 = true;
        if (bLLocation == null) {
            return true;
        }
        if (bLLocation.getCityId() != null || bLLocation.getCityName() != null || bLLocation.getLon() > 0.0d || bLLocation.getLat() > 0.0d) {
            z6 = false;
        }
        return z6;
    }

    public static void b(String str, String str2) {
        HashMap map = new HashMap();
        map.put("type", f65476f ? "bili_location" : "tencent");
        if (!TextUtils.isEmpty(str2)) {
            map.put("request_type", str2);
        }
        String stackTraceString = Log.getStackTraceString(new Throwable());
        map.put("caller", stackTraceString.substring(0, Math.min(stackTraceString.length(), 600)));
        f65474d.trackT(true, str, map, 1, new M8.a(1));
    }

    @Override // com.bilibili.location.LocationService
    public final BLLocation getLastLocation() {
        g gVar;
        f65475e.i("location.debug", "location manager getLastLocation");
        try {
            BLLocation lastLocation = this.f65478b.getLastLocation();
            boolean zA = a(lastLocation);
            HashMap map = new HashMap();
            map.put("type", f65476f ? "bili_location" : "tencent");
            map.put("success", Boolean.valueOf(!zA).toString());
            f65474d.trackT(true, "bili-location.sdk.manager.request-location-sync", map, 1, new p(2));
            f65475e.i("location.debug", "getLastLocation : enable :" + f65476f + ": loc:" + lastLocation);
            if (a(lastLocation) && f65473c.a() && (gVar = this.f65477a) != null && f65473c.b()) {
                this.f65478b = gVar;
                gVar.getLastLocation();
                b("bili-location.sdk.manager.downgrade-tx", null);
                f65476f = false;
                f65475e.i("location.debug", "downgrade to TX");
            }
            return lastLocation;
        } catch (Exception e7) {
            return null;
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestLocation(LocationService.LocationListaner locationListaner) {
        try {
            f65475e.i("location.debug", "location manager requestLocation");
            this.f65478b.requestLocation(locationListaner);
            b("bili-location.sdk.manager.request-location", "normal");
        } catch (Exception e7) {
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestLocation(LocationService.LocationListaner locationListaner, Boolean bool, String str) {
        try {
            f65475e.i("location.debug", "location manager requestLocation " + bool);
            this.f65478b.requestLocation(locationListaner, bool, str);
            b("bili-location.sdk.manager.request-location", "normal");
        } catch (Exception e7) {
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestSingleFreshLocation(LocationService.LocationListaner locationListaner) {
        try {
            this.f65478b.requestSingleFreshLocation(locationListaner);
            b("bili-location.sdk.manager.request-location", "single_fresh");
        } catch (Exception e7) {
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestSingleFreshLocation(LocationService.LocationListaner locationListaner, Boolean bool, String str) {
        try {
            this.f65478b.requestSingleFreshLocation(locationListaner, bool, str);
            b("bili-location.sdk.manager.request-location", "single_fresh");
        } catch (Exception e7) {
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void setForceRequestListener(ForceRequestListener forceRequestListener) {
        try {
            this.f65478b.setForceRequestListener(forceRequestListener);
        } catch (Exception e7) {
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void startLocate(LocationService.LocationListaner locationListaner) {
        f65475e.i("location.debug", "location manager startLocate");
        try {
            this.f65478b.startLocate(locationListaner);
            b("bili-location.sdk.manager.request-location", "location_listener");
        } catch (Exception e7) {
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void stopLocate(LocationService.LocationListaner locationListaner) {
        f65475e.i("location.debug", "location manager stopLocate");
        try {
            this.f65478b.stopLocate(locationListaner);
        } catch (Exception e7) {
        }
    }
}
