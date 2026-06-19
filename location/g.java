package com.bilibili.location;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bilibili.location.LocationService;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/g.class */
public class g implements LocationService, TencentLocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TencentLocationManager f65483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TencentLocationRequest f65484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<LocationService.LocationListaner> f65485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f65486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ForceRequestListener f65487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile int f65488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f65489g;

    public g(Context context) {
        TencentLocationManager.setUserAgreePrivacy(true);
        TencentLocationManager tencentLocationManager = TencentLocationManager.getInstance(context);
        this.f65483a = tencentLocationManager;
        tencentLocationManager.setCoordinateType(1);
        TencentLocationRequest tencentLocationRequestCreate = TencentLocationRequest.create();
        this.f65484b = tencentLocationRequestCreate;
        tencentLocationRequestCreate.setInterval(5000L);
        tencentLocationRequestCreate.setRequestLevel(3);
        this.f65485c = new ArrayList();
    }

    public static boolean a(TencentLocation tencentLocation) {
        return (tencentLocation == null || TextUtils.isEmpty(tencentLocation.getCityCode()) || TextUtils.isEmpty(tencentLocation.getCity())) ? false : true;
    }

    @Override // com.bilibili.location.LocationService
    public final BLLocation getLastLocation() {
        return Og0.b.c(this.f65483a.getLastKnownLocation());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[PHI: r9
  0x004a: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:10:0x002a, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.tencent.map.geolocation.TencentLocationListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLocationChanged(com.tencent.map.geolocation.TencentLocation r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r0 = r0.getCityCode()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lae
            r0 = r6
            java.lang.String r0 = r0.getCity()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r7
            if (r0 == 0) goto L63
            r0 = 2
            r9 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L4a
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L5b
            r0 = 4
            r9 = r0
            r0 = r7
            r1 = 4
            if (r0 == r1) goto L53
            r0 = r7
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L4a
            r0 = r10
            r7 = r0
            r0 = r11
            r6 = r0
            goto L6d
        L4a:
            r0 = r9
            r7 = r0
            r0 = r11
            r6 = r0
            goto L6d
        L53:
            r0 = 3
            r7 = r0
            r0 = r11
            r6 = r0
            goto L6d
        L5b:
            r0 = 1
            r7 = r0
            r0 = r11
            r6 = r0
            goto L6d
        L63:
            r0 = r6
            com.bilibili.location.BLLocation r0 = Og0.b.c(r0)
            r6 = r0
            r0 = 0
            r8 = r0
            r0 = r10
            r7 = r0
        L6d:
            r0 = r5
            java.util.List<com.bilibili.location.LocationService$LocationListaner> r0 = r0.f65485c
            r11 = r0
            r0 = r11
            monitor-enter(r0)
            r0 = r5
            java.util.List<com.bilibili.location.LocationService$LocationListaner> r0 = r0.f65485c     // Catch: java.lang.Throwable -> La1
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La1
            r12 = r0
        L82:
            r0 = r12
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto La5
            r0 = r12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> La1
            com.bilibili.location.LocationService$LocationListaner r0 = (com.bilibili.location.LocationService.LocationListaner) r0     // Catch: java.lang.Throwable -> La1
            r1 = r6
            r2 = r7
            r3 = r8
            r0.onLocationChanged(r1, r2, r3)     // Catch: java.lang.Throwable -> La1
            goto L82
        La1:
            r6 = move-exception
            goto La9
        La5:
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            return
        La9:
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            r0 = r6
            throw r0
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.location.g.onLocationChanged(com.tencent.map.geolocation.TencentLocation, int, java.lang.String):void");
    }

    @Override // com.tencent.map.geolocation.TencentLocationListener
    public final void onStatusUpdate(String str, int i7, String str2) {
    }

    @Override // com.bilibili.location.LocationService
    public final void requestLocation(LocationService.LocationListaner locationListaner) {
        TencentLocation lastKnownLocation = this.f65483a.getLastKnownLocation();
        if (SystemClock.elapsedRealtime() - this.f65489g < 60000 && a(lastKnownLocation)) {
            locationListaner.onLocationChanged(Og0.b.c(lastKnownLocation), 0, null);
        } else {
            this.f65488f = 0;
            this.f65483a.requestLocationUpdates(this.f65484b, new e(this, locationListaner));
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestLocation(LocationService.LocationListaner locationListaner, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            requestLocation(locationListaner);
            return;
        }
        ForceRequestListener forceRequestListener = this.f65487e;
        if (forceRequestListener != null) {
            forceRequestListener.onForceRequest(str, Long.valueOf(System.currentTimeMillis()));
        }
        this.f65488f = 0;
        this.f65483a.requestLocationUpdates(this.f65484b, new e(this, locationListaner));
    }

    @Override // com.bilibili.location.LocationService
    public final void requestSingleFreshLocation(LocationService.LocationListaner locationListaner) {
        TencentLocation lastKnownLocation = this.f65483a.getLastKnownLocation();
        if (SystemClock.elapsedRealtime() - this.f65489g < 60000 && a(lastKnownLocation)) {
            locationListaner.onLocationChanged(Og0.b.c(lastKnownLocation), 0, null);
        } else {
            this.f65483a.requestLocationUpdates(this.f65484b, new f(this, locationListaner));
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestSingleFreshLocation(LocationService.LocationListaner locationListaner, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            requestSingleFreshLocation(locationListaner);
            return;
        }
        ForceRequestListener forceRequestListener = this.f65487e;
        if (forceRequestListener != null) {
            forceRequestListener.onForceRequest(str, Long.valueOf(System.currentTimeMillis()));
        }
        this.f65483a.requestLocationUpdates(this.f65484b, new f(this, locationListaner));
    }

    @Override // com.bilibili.location.LocationService
    public final void setForceRequestListener(ForceRequestListener forceRequestListener) {
        this.f65487e = forceRequestListener;
    }

    @Override // com.bilibili.location.LocationService
    public final void startLocate(LocationService.LocationListaner locationListaner) {
        if (!this.f65486d) {
            this.f65486d = true;
            this.f65483a.requestLocationUpdates(this.f65484b, this, Looper.getMainLooper());
        }
        synchronized (this.f65485c) {
            ((ArrayList) this.f65485c).add(locationListaner);
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void stopLocate(LocationService.LocationListaner locationListaner) {
        synchronized (this.f65485c) {
            ((ArrayList) this.f65485c).remove(locationListaner);
            if (((ArrayList) this.f65485c).size() == 0) {
                this.f65486d = false;
                this.f65483a.removeUpdates(this);
            }
        }
    }
}
