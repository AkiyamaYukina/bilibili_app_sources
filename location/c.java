package com.bilibili.location;

import android.content.Context;
import android.os.Looper;
import androidx.appcompat.app.v;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.location.LocationService;
import com.bilibili.location.api.MapInfo;
import com.bilibili.privacy.PrivacyHelper;
import com.tencent.map.geolocation.TencentLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/c.class */
public final class c implements LocationService, LocationService.LocationListaner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Context f65467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f65468b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f65470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ForceRequestListener f65471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f65472f = d.f65473c.c() * ((long) 1000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<LocationService.LocationListaner> f65469c = new ArrayList();

    public c(@Nullable Context context) {
        this.f65467a = context;
        this.f65468b = new b(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.bilibili.location.api.MapInfo r2) {
        /*
            r0 = r2
            if (r0 == 0) goto L30
            r0 = r2
            com.bilibili.location.api.AdInfo r0 = r0.adInfo
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L15
            r0 = r4
            java.lang.String r0 = r0.cityCode
            r4 = r0
            goto L17
        L15:
            r0 = 0
            r4 = r0
        L17:
            r0 = r4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L30
            r0 = r2
            com.bilibili.location.api.AddressComponent r0 = r0.addressComponent
            java.lang.String r0 = r0.city
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L30
            r0 = 1
            r3 = r0
            goto L32
        L30:
            r0 = 0
            r3 = r0
        L32:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.location.c.a(com.bilibili.location.api.MapInfo):boolean");
    }

    @Override // com.bilibili.location.LocationService
    @Nullable
    public final BLLocation getLastLocation() {
        MapInfo mapInfoB = this.f65468b.b();
        return mapInfoB != null ? Og0.b.b(mapInfoB) : null;
    }

    @Override // com.bilibili.location.LocationService.LocationListaner
    public final void onLocationChanged(@Nullable BLLocation bLLocation, int i7, @Nullable String str) {
        synchronized (this.f65469c) {
            Iterator it = ((ArrayList) this.f65469c).iterator();
            while (it.hasNext()) {
                ((LocationService.LocationListaner) it.next()).onLocationChanged(bLLocation, i7, str);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestLocation(@NotNull LocationService.LocationListaner locationListaner) {
        MapInfo mapInfoB = this.f65468b.b();
        if (mapInfoB != null && System.currentTimeMillis() - mapInfoB.generateTime < this.f65472f && a(mapInfoB)) {
            locationListaner.onLocationChanged(mapInfoB != null ? Og0.b.b(mapInfoB) : null, 0, null);
        } else {
            this.f65468b.c(this.f65467a, locationListaner);
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestLocation(LocationService.LocationListaner locationListaner, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            requestLocation(locationListaner);
            return;
        }
        ForceRequestListener forceRequestListener = this.f65471e;
        if (forceRequestListener != null) {
            forceRequestListener.onForceRequest(str, Long.valueOf(System.currentTimeMillis()));
        }
        this.f65468b.c(this.f65467a, locationListaner);
    }

    @Override // com.bilibili.location.LocationService
    public final void requestSingleFreshLocation(@NotNull LocationService.LocationListaner locationListaner) {
        MapInfo mapInfoB = this.f65468b.b();
        if (mapInfoB != null && System.currentTimeMillis() - mapInfoB.generateTime < this.f65472f && a(mapInfoB)) {
            locationListaner.onLocationChanged(mapInfoB != null ? Og0.b.b(mapInfoB) : null, 0, null);
        } else {
            this.f65468b.c(this.f65467a, locationListaner);
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void requestSingleFreshLocation(LocationService.LocationListaner locationListaner, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            requestSingleFreshLocation(locationListaner);
            return;
        }
        ForceRequestListener forceRequestListener = this.f65471e;
        if (forceRequestListener != null) {
            forceRequestListener.onForceRequest(str, Long.valueOf(System.currentTimeMillis()));
        }
        this.f65468b.c(this.f65467a, locationListaner);
    }

    @Override // com.bilibili.location.LocationService
    public final void setForceRequestListener(@NotNull ForceRequestListener forceRequestListener) {
        this.f65471e = forceRequestListener;
    }

    @Override // com.bilibili.location.LocationService
    public final void startLocate(@NotNull LocationService.LocationListaner locationListaner) {
        if (!this.f65470d) {
            this.f65470d = true;
            b bVar = this.f65468b;
            Looper mainLooper = Looper.getMainLooper();
            Context context = bVar.f65460a;
            if (context == null || ContextCompat.checkSelfPermission(context, PermissionsChecker.ACCESS_FINE_LOCATION) == 0 || ContextCompat.checkSelfPermission(context, PermissionsChecker.ACCESS_COARSE_LOCATION) == 0) {
                bVar.f65463d = this;
                android.location.LocationManager locationManager = bVar.f65461b;
                if (locationManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSystemLocationManager");
                    locationManager = null;
                }
                PrivacyHelper.b bVar2 = PrivacyHelper.b.f85844c;
                try {
                    PrivacyHelper privacyHelper = PrivacyHelper.INSTANCE;
                    if (!privacyHelper.hookEnable$privacy_release("lm_request_location_updates_2")) {
                        PrivacyHelper.f85841g.i("hook disable, tag: [lm_request_location_updates_2]", null);
                        locationManager.requestLocationUpdates(TencentLocation.NETWORK_PROVIDER, 5000L, 0.0f, bVar, mainLooper);
                    } else if (!privacyHelper.checkPrivacy$privacy_release("lm_request_location_updates_2")) {
                        PrivacyHelper.f85841g.i("user deny, tag: [lm_request_location_updates_2] defaultReturnValue = [null]", null);
                    } else if (privacyHelper.forbiddenUse$privacy_release("lm_request_location_updates_2")) {
                        PrivacyHelper.f85841g.i("use forbidden, tag: [lm_request_location_updates_2] defaultReturnValue = [null]", null);
                    } else if (PrivacyHelper.access$hitPrivacyCache(privacyHelper, "lm_request_location_updates_2") == null) {
                        locationManager.requestLocationUpdates(TencentLocation.NETWORK_PROVIDER, 5000L, 0.0f, bVar, mainLooper);
                        privacyHelper.getPrivacyCache().put("lm_request_location_updates_2", new PrivacyHelper.a(Unit.INSTANCE, PrivacyHelper.access$getDDCacheTime(privacyHelper, "lm_request_location_updates_2", bVar2)));
                        PrivacyHelper.f85841g.i("runOnPrivacyControl tag: lm_request_location_updates_2", null);
                    }
                } catch (Throwable th) {
                    if (PrivacyHelper.f85837c) {
                        v.b("catch error. tag: lm_request_location_updates_2, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", th);
                    } else {
                        v.b("catch error. tag: lm_request_location_updates_2, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", null);
                    }
                }
            }
        }
        synchronized (this.f65469c) {
            ((ArrayList) this.f65469c).add(locationListaner);
        }
    }

    @Override // com.bilibili.location.LocationService
    public final void stopLocate(@NotNull LocationService.LocationListaner locationListaner) {
        synchronized (this.f65469c) {
            ((ArrayList) this.f65469c).remove(locationListaner);
            if (((ArrayList) this.f65469c).size() == 0) {
                this.f65470d = false;
                b bVar = this.f65468b;
                android.location.LocationManager locationManager = bVar.f65461b;
                android.location.LocationManager locationManager2 = locationManager;
                if (locationManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSystemLocationManager");
                    locationManager2 = null;
                }
                locationManager2.removeUpdates(bVar);
                bVar.f65463d = null;
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
