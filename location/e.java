package com.bilibili.location;

import android.os.SystemClock;
import com.bilibili.location.LocationService;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/e.class */
public final class e implements TencentLocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationService.LocationListaner f65479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f65480b;

    public e(g gVar, LocationService.LocationListaner locationListaner) {
        this.f65480b = gVar;
        this.f65479a = locationListaner;
    }

    @Override // com.tencent.map.geolocation.TencentLocationListener
    public final void onLocationChanged(TencentLocation tencentLocation, int i7, String str) {
        if (i7 == 0) {
            this.f65480b.getClass();
            if (g.a(tencentLocation)) {
                this.f65480b.f65488f = 0;
                this.f65480b.f65489g = SystemClock.elapsedRealtime();
                this.f65480b.f65483a.removeUpdates(this);
                this.f65479a.onLocationChanged(Og0.b.c(tencentLocation), 0, null);
                return;
            }
            this.f65480b.f65488f++;
            if (this.f65480b.f65488f >= 5) {
                this.f65480b.f65488f = 0;
                this.f65480b.f65483a.removeUpdates(this);
                this.f65479a.onLocationChanged(Og0.b.c(tencentLocation), 5, null);
                return;
            }
            return;
        }
        if (i7 == 1) {
            this.f65480b.f65483a.removeUpdates(this);
            this.f65479a.onLocationChanged(null, 2, str);
            return;
        }
        if (i7 == 2) {
            this.f65480b.f65483a.removeUpdates(this);
            this.f65479a.onLocationChanged(null, 1, str);
        } else if (i7 == 4) {
            this.f65480b.f65483a.removeUpdates(this);
            this.f65479a.onLocationChanged(null, 3, str);
        } else if (i7 != 404) {
            this.f65480b.f65483a.removeUpdates(this);
        } else {
            this.f65480b.f65483a.removeUpdates(this);
            this.f65479a.onLocationChanged(null, 4, str);
        }
    }

    @Override // com.tencent.map.geolocation.TencentLocationListener
    public final void onStatusUpdate(String str, int i7, String str2) {
    }
}
