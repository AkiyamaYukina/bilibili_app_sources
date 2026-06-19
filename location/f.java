package com.bilibili.location;

import android.os.SystemClock;
import com.bilibili.location.LocationService;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/f.class */
public final class f implements TencentLocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationService.LocationListaner f65481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f65482b;

    public f(g gVar, LocationService.LocationListaner locationListaner) {
        this.f65482b = gVar;
        this.f65481a = locationListaner;
    }

    @Override // com.tencent.map.geolocation.TencentLocationListener
    public final void onLocationChanged(TencentLocation tencentLocation, int i7, String str) {
        this.f65482b.f65483a.removeUpdates(this);
        if (i7 == 0) {
            this.f65482b.f65489g = SystemClock.elapsedRealtime();
            this.f65481a.onLocationChanged(Og0.b.c(tencentLocation), 0, null);
        } else {
            if (i7 == 1) {
                this.f65481a.onLocationChanged(null, 2, str);
                return;
            }
            if (i7 == 2) {
                this.f65481a.onLocationChanged(null, 1, str);
            } else if (i7 == 4) {
                this.f65481a.onLocationChanged(null, 3, str);
            } else {
                if (i7 != 404) {
                    return;
                }
                this.f65481a.onLocationChanged(null, 4, str);
            }
        }
    }

    @Override // com.tencent.map.geolocation.TencentLocationListener
    public final void onStatusUpdate(String str, int i7, String str2) {
    }
}
