package com.bilibili.location;

import Pg0.InterfaceC2777a;
import Qg0.C2828a;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.appcompat.app.v;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.gripper.api.log.GLog;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.location.LocationService;
import com.bilibili.location.api.Gps;
import com.bilibili.location.api.MapInfo;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.BiliApiParseException;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.privacy.PrivacyHelper;
import com.tencent.map.geolocation.TencentLocation;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/b.class */
public final class b implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Context f65460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.location.LocationManager f65461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MapInfo f65462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f65463d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/b$a.class */
    public static final class a extends BiliApiDataCallback<MapInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f65464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocationService.LocationListaner f65465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Location f65466d;

        public a(b bVar, LocationService.LocationListaner locationListaner, Location location) {
            this.f65464b = bVar;
            this.f65465c = locationListaner;
            this.f65466d = location;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(MapInfo mapInfo) {
            MapInfo mapInfo2 = mapInfo;
            if (mapInfo2 != null) {
                mapInfo2.localGps = new Gps(this.f65466d.getLatitude(), this.f65466d.getLongitude());
            }
            if (mapInfo2 != null) {
                mapInfo2.generateTime = System.currentTimeMillis();
            }
            LocationService.LocationListaner locationListaner = this.f65465c;
            if (locationListaner != null) {
                locationListaner.onLocationChanged(mapInfo2 != null ? Og0.b.b(mapInfo2) : null, 0, null);
            }
            this.f65464b.f(mapInfo2);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            b bVar = this.f65464b;
            MapInfo mapInfoD = bVar.d();
            LocationService.LocationListaner locationListaner = this.f65465c;
            if (mapInfoD != null) {
                if (locationListaner != null) {
                    locationListaner.onLocationChanged(Og0.b.b(bVar.d()), 0, null);
                }
            } else if (locationListaner != null) {
                locationListaner.onLocationChanged(Og0.b.a(this.f65466d), 5, null);
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onFailure(Call<GeneralResponse<MapInfo>> call, Throwable th) {
            b bVar = this.f65464b;
            MapInfo mapInfoD = bVar.d();
            LocationService.LocationListaner locationListaner = this.f65465c;
            if (mapInfoD == null) {
                if (locationListaner != null) {
                    locationListaner.onLocationChanged(Og0.b.a(this.f65466d), 5, null);
                }
            } else if (locationListaner != null) {
                MapInfo mapInfoD2 = bVar.d();
                locationListaner.onLocationChanged(mapInfoD2 != null ? Og0.b.b(mapInfoD2) : null, 0, null);
            }
        }
    }

    public b(@Nullable Context context) {
        this.f65460a = context;
    }

    @JvmStatic
    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "getLastKnownLocation", owner = {"android.location.LocationManager"})
    @Nullable
    public static Location a(@NotNull android.location.LocationManager locationManager, @NotNull String str) {
        Object lastKnownLocation;
        PrivacyHelper.b bVar = PrivacyHelper.b.f85844c;
        try {
            PrivacyHelper privacyHelper = PrivacyHelper.INSTANCE;
            if (!privacyHelper.hookEnable$privacy_release("lm_get_last_known_location")) {
                PrivacyHelper.f85841g.i("hook disable, tag: [lm_get_last_known_location]", null);
                Location lastKnownLocation2 = locationManager.getLastKnownLocation(str);
                lastKnownLocation = null;
                if (lastKnownLocation2 != null) {
                    lastKnownLocation = lastKnownLocation2;
                }
            } else if (!privacyHelper.checkPrivacy$privacy_release("lm_get_last_known_location")) {
                PrivacyHelper.f85841g.i("user deny, tag: [lm_get_last_known_location] defaultReturnValue = [null]", null);
                lastKnownLocation = null;
            } else if (privacyHelper.forbiddenUse$privacy_release("lm_get_last_known_location")) {
                PrivacyHelper.f85841g.i("use forbidden, tag: [lm_get_last_known_location] defaultReturnValue = [null]", null);
                lastKnownLocation = null;
            } else {
                Object objAccess$hitPrivacyCache = PrivacyHelper.access$hitPrivacyCache(privacyHelper, "lm_get_last_known_location");
                if (objAccess$hitPrivacyCache != null) {
                    lastKnownLocation = objAccess$hitPrivacyCache;
                } else {
                    lastKnownLocation = locationManager.getLastKnownLocation(str);
                    if (lastKnownLocation == null) {
                        lastKnownLocation = null;
                    }
                    if (lastKnownLocation != null) {
                        privacyHelper.getPrivacyCache().put("lm_get_last_known_location", new PrivacyHelper.a(lastKnownLocation, PrivacyHelper.access$getDDCacheTime(privacyHelper, "lm_get_last_known_location", bVar)));
                    }
                    PrivacyHelper.f85841g.i("runOnPrivacyControl tag: lm_get_last_known_location", null);
                }
            }
        } catch (Throwable th) {
            if (PrivacyHelper.f85837c) {
                v.b("catch error. tag: lm_get_last_known_location, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", th);
                lastKnownLocation = null;
            } else {
                v.b("catch error. tag: lm_get_last_known_location, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", null);
                lastKnownLocation = null;
            }
        }
        return (Location) lastKnownLocation;
    }

    @Nullable
    public final MapInfo b() {
        MapInfo mapInfoD = d();
        if (mapInfoD != null) {
            return mapInfoD;
        }
        Context context = this.f65460a;
        android.location.LocationManager locationManager = (android.location.LocationManager) (context != null ? context.getSystemService(Constant.IN_KEY_LOCATION) : null);
        this.f65461b = locationManager;
        android.location.LocationManager locationManager2 = locationManager;
        if (locationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSystemLocationManager");
            locationManager2 = null;
        }
        Iterator<String> it = locationManager2.getProviders(true).iterator();
        Location location = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Context context2 = this.f65460a;
            if (context2 != null && ContextCompat.checkSelfPermission(context2, PermissionsChecker.ACCESS_FINE_LOCATION) != 0 && ContextCompat.checkSelfPermission(context2, PermissionsChecker.ACCESS_COARSE_LOCATION) != 0) {
                location = null;
                break;
            }
            GLog gLog = d.f65475e;
            android.location.LocationManager locationManager3 = this.f65461b;
            android.location.LocationManager locationManager4 = locationManager3;
            if (locationManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSystemLocationManager");
                locationManager4 = null;
            }
            gLog.i("location.debug", "provider " + next + " " + a(locationManager4, next));
            android.location.LocationManager locationManager5 = this.f65461b;
            android.location.LocationManager locationManager6 = locationManager5;
            if (locationManager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSystemLocationManager");
                locationManager6 = null;
            }
            Location locationA = a(locationManager6, next);
            if (locationA != null && (location == null || locationA.getAccuracy() < location.getAccuracy())) {
                location = locationA;
            }
        }
        d.f65475e.i("location.debug", "systemLastKnowLocation " + location);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (location != null) {
            final Location location2 = location;
            HandlerThreads.runOnBlocking(2, new Runnable(location2, objectRef, this) { // from class: Og0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Location f17861a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.ObjectRef f17862b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.location.b f17863c;

                {
                    this.f17861a = location2;
                    this.f17862b = objectRef;
                    this.f17863c = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws IOException, BiliApiParseException {
                    GeneralResponse generalResponse;
                    Location location3 = this.f17861a;
                    Ref.ObjectRef objectRef2 = this.f17862b;
                    com.bilibili.location.b bVar = this.f17863c;
                    Response<GeneralResponse<MapInfo>> responseExecute = ((InterfaceC2777a) ServiceGenerator.createService(InterfaceC2777a.class)).getLocationInfo(String.valueOf(location3.getLatitude()), String.valueOf(location3.getLongitude())).execute();
                    if (responseExecute.isSuccessful() && (generalResponse = (GeneralResponse) responseExecute.body()) != null && generalResponse.code == 0) {
                        GeneralResponse generalResponse2 = (GeneralResponse) responseExecute.body();
                        MapInfo mapInfo = generalResponse2 != null ? (MapInfo) generalResponse2.data : null;
                        objectRef2.element = mapInfo;
                        if (mapInfo != null) {
                            mapInfo.generateTime = System.currentTimeMillis();
                        }
                        MapInfo mapInfo2 = (MapInfo) objectRef2.element;
                        if (mapInfo2 != null) {
                            mapInfo2.localGps = new Gps(location3.getLatitude(), location3.getLongitude());
                        }
                        com.bilibili.location.d.f65475e.i("location.debug", "requestLocation sync SUCCESS " + objectRef2.element);
                        bVar.f((MapInfo) objectRef2.element);
                    }
                }
            });
        }
        return (MapInfo) objectRef.element;
    }

    public final void c(@Nullable Context context, @NotNull LocationService.LocationListaner locationListaner) {
        this.f65461b = (android.location.LocationManager) (context != null ? context.getSystemService(Constant.IN_KEY_LOCATION) : null);
        if (ContextCompat.checkSelfPermission(context, PermissionsChecker.ACCESS_FINE_LOCATION) == 0 || ContextCompat.checkSelfPermission(context, PermissionsChecker.ACCESS_COARSE_LOCATION) == 0) {
            android.location.LocationManager locationManager = this.f65461b;
            if (locationManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSystemLocationManager");
                locationManager = null;
            }
            com.bilibili.location.a aVar = new com.bilibili.location.a(this, locationListaner);
            PrivacyHelper.b bVar = PrivacyHelper.b.f85844c;
            try {
                PrivacyHelper privacyHelper = PrivacyHelper.INSTANCE;
                if (!privacyHelper.hookEnable$privacy_release("lm_request_location_updates_1")) {
                    PrivacyHelper.f85841g.i("hook disable, tag: [lm_request_location_updates_1]", null);
                    locationManager.requestLocationUpdates(TencentLocation.NETWORK_PROVIDER, 5000L, 0.0f, aVar);
                } else if (!privacyHelper.checkPrivacy$privacy_release("lm_request_location_updates_1")) {
                    PrivacyHelper.f85841g.i("user deny, tag: [lm_request_location_updates_1] defaultReturnValue = [null]", null);
                } else if (privacyHelper.forbiddenUse$privacy_release("lm_request_location_updates_1")) {
                    PrivacyHelper.f85841g.i("use forbidden, tag: [lm_request_location_updates_1] defaultReturnValue = [null]", null);
                } else if (PrivacyHelper.access$hitPrivacyCache(privacyHelper, "lm_request_location_updates_1") == null) {
                    locationManager.requestLocationUpdates(TencentLocation.NETWORK_PROVIDER, 5000L, 0.0f, aVar);
                    privacyHelper.getPrivacyCache().put("lm_request_location_updates_1", new PrivacyHelper.a(Unit.INSTANCE, PrivacyHelper.access$getDDCacheTime(privacyHelper, "lm_request_location_updates_1", bVar)));
                    PrivacyHelper.f85841g.i("runOnPrivacyControl tag: lm_request_location_updates_1", null);
                }
            } catch (Throwable th) {
                if (PrivacyHelper.f85837c) {
                    v.b("catch error. tag: lm_request_location_updates_1, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", th);
                } else {
                    v.b("catch error. tag: lm_request_location_updates_1, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", null);
                }
            }
        }
    }

    public final MapInfo d() {
        MapInfo mapInfo;
        if (this.f65462c == null) {
            Context context = this.f65460a;
            if (context == null) {
                mapInfo = null;
            } else {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("bili_location", 0);
                    String string = sharedPreferences != null ? sharedPreferences.getString("cache_location", "") : null;
                    mapInfo = null;
                    if (string != null) {
                        mapInfo = StringsKt.isBlank(string) ? null : (MapInfo) JSON.parseObject(string, MapInfo.class);
                    }
                } catch (Exception e7) {
                    mapInfo = null;
                }
            }
            this.f65462c = mapInfo;
        }
        return this.f65462c;
    }

    public final void e(@Nullable Location location, @Nullable LocationService.LocationListaner locationListaner) {
        if (location != null) {
            ((InterfaceC2777a) ServiceGenerator.createService(InterfaceC2777a.class)).getLocationInfo(String.valueOf(location.getLatitude()), String.valueOf(location.getLongitude())).enqueue(new a(this, locationListaner, location));
        } else if (locationListaner != null) {
            locationListaner.onLocationChanged(null, 1, null);
        }
    }

    public final void f(MapInfo mapInfo) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        if (mapInfo != null) {
            this.f65462c = mapInfo;
            Context context = this.f65460a;
            if (context == null || (sharedPreferences = context.getSharedPreferences("bili_location", 0)) == null || (editorEdit = sharedPreferences.edit()) == null) {
                return;
            }
            editorEdit.putString("cache_location", JSON.toJSONString(mapInfo));
            editorEdit.apply();
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(@NotNull Location location) {
        Gps gps;
        String strA = C2828a.a(location.getLatitude(), location.getLongitude());
        MapInfo mapInfoD = d();
        if (mapInfoD == null || (gps = mapInfoD.localGps) == null || !Intrinsics.areEqual(strA, C2828a.a(gps.lat, gps.lng))) {
            c cVar = this.f65463d;
            if (cVar != null) {
                e(location, cVar);
                return;
            }
            return;
        }
        d.f65475e.i("location.debug", "GEO CACHE SUCCESS");
        c cVar2 = this.f65463d;
        if (cVar2 != null) {
            MapInfo mapInfoD2 = d();
            cVar2.onLocationChanged(mapInfoD2 != null ? Og0.b.b(mapInfoD2) : null, 0, null);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(@NotNull String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(@NotNull String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(@Nullable String str, int i7, @Nullable Bundle bundle) {
    }
}
