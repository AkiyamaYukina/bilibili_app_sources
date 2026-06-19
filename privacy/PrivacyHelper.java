package com.bilibili.privacy;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.app.v;
import androidx.fragment.app.z;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/privacy/PrivacyHelper.class */
public final class PrivacyHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f85837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f85838d;

    @NotNull
    public static final PrivacyHelper INSTANCE = new PrivacyHelper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ConcurrentLinkedDeque<Map<String, String>> f85835a = new ConcurrentLinkedDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, a> f85836b = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static Function0<Boolean> f85839e = new As0.b(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static Function2<? super String, ? super Map<String, String>, Unit> f85840f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final c f85841g = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/privacy/PrivacyHelper$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Object f85842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final b f85843b;

        public a(@Nullable Object obj, @NotNull b bVar) {
            this.f85842a = obj;
            this.f85843b = bVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f85842a, aVar.f85842a) && Intrinsics.areEqual(this.f85843b, aVar.f85843b);
        }

        public final int hashCode() {
            Object obj = this.f85842a;
            return Long.hashCode(this.f85843b.f85846a) + ((obj == null ? 0 : obj.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "Cache(data=" + this.f85842a + ", duration=" + this.f85843b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/privacy/PrivacyHelper$b.class */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f85844c = new b(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final b f85845d = new b(-1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f85846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f85847b = SystemClock.elapsedRealtime();

        public b(long j7) {
            this.f85846a = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f85846a == ((b) obj).f85846a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f85846a);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.session.a.a(new StringBuilder("CacheDuration(duration="), this.f85846a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/privacy/PrivacyHelper$c.class */
    public static final class c implements As0.a {
        @Override // As0.a
        public final void e(String str, String str2, Throwable th) {
            if (PrivacyHelper.f85837c) {
                Log.e(str, str2, th);
            } else {
                BLog.e(str, str2, th);
            }
        }

        @Override // As0.a
        public final void i(String str, Throwable th) {
            if (PrivacyHelper.f85837c) {
                Log.i("privacy_", str, th);
            } else {
                BLog.i("privacy_", str, th);
            }
        }
    }

    @JvmStatic
    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "getMacAddress", owner = {"android.net.wifi.WifiInfo"})
    @Nullable
    public static String a(@Nullable WifiInfo wifiInfo) {
        Object macAddress;
        PrivacyHelper privacyHelper;
        b bVar = b.f85845d;
        try {
            privacyHelper = INSTANCE;
        } catch (Throwable th) {
            if (f85837c) {
                v.b("catch error. tag: wifi_info_get_mac_address, message = ", th.getMessage(), f85841g, "privacy_", th);
            } else {
                v.b("catch error. tag: wifi_info_get_mac_address, message = ", th.getMessage(), f85841g, "privacy_", null);
            }
        }
        if (privacyHelper.hookEnable$privacy_release("wifi_info_get_mac_address")) {
            if (!privacyHelper.checkPrivacy$privacy_release("wifi_info_get_mac_address")) {
                f85841g.i("user deny, tag: [wifi_info_get_mac_address] defaultReturnValue = []", null);
            } else if (privacyHelper.forbiddenUse$privacy_release("wifi_info_get_mac_address")) {
                f85841g.i("use forbidden, tag: [wifi_info_get_mac_address] defaultReturnValue = []", null);
            } else {
                Object objAccess$hitPrivacyCache = access$hitPrivacyCache(privacyHelper, "wifi_info_get_mac_address");
                if (objAccess$hitPrivacyCache != null) {
                    macAddress = objAccess$hitPrivacyCache;
                } else {
                    macAddress = wifiInfo.getMacAddress();
                    if (macAddress == null) {
                        macAddress = null;
                    }
                    if (macAddress != null) {
                        privacyHelper.getPrivacyCache().put("wifi_info_get_mac_address", new a(macAddress, access$getDDCacheTime(privacyHelper, "wifi_info_get_mac_address", bVar)));
                    }
                    f85841g.i("runOnPrivacyControl tag: wifi_info_get_mac_address", null);
                }
            }
            macAddress = "";
        } else {
            f85841g.i("hook disable, tag: [wifi_info_get_mac_address]", null);
            String macAddress2 = wifiInfo.getMacAddress();
            macAddress = null;
            if (macAddress2 != null) {
                macAddress = macAddress2;
            }
        }
        return (String) macAddress;
    }

    public static final b access$getDDCacheTime(PrivacyHelper privacyHelper, String str, b bVar) {
        privacyHelper.getClass();
        Long longOrNull = null;
        String strDd = DeviceDecision.INSTANCE.dd("ff.privacy.hook.cache_time." + str, (String) null);
        if (strDd != null) {
            longOrNull = StringsKt.toLongOrNull(strDd);
        }
        if (longOrNull != null) {
            bVar = new b(longOrNull.longValue());
        }
        return bVar;
    }

    public static final Object access$hitPrivacyCache(PrivacyHelper privacyHelper, String str) {
        privacyHelper.getClass();
        a aVar = (a) ((LinkedHashMap) f85836b).get(str);
        Object obj = null;
        if (aVar != null) {
            b bVar = aVar.f85843b;
            bVar.getClass();
            if (!Intrinsics.areEqual(bVar, b.f85845d) && (Intrinsics.areEqual(bVar, b.f85844c) || SystemClock.elapsedRealtime() > TimeUnit.MINUTES.toMillis(bVar.f85846a) + bVar.f85847b)) {
                obj = null;
            } else {
                f85841g.i("hit cache, tag: [" + str + "] cache value = [" + aVar + "]", null);
                obj = aVar.f85842a;
                if (obj == null) {
                    obj = null;
                }
            }
        }
        return obj;
    }

    public static void b(HashSet hashSet, HashSet hashSet2, HashSet hashSet3, HashSet hashSet4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_appinfo_sys", hashSet.toString());
        linkedHashMap.put("from_appinfo_app", hashSet2.toString());
        linkedHashMap.put("from_appinfo_queryIntent", hashSet3.toString());
        linkedHashMap.put("from_appinfo_query_missing", hashSet4.toString());
        linkedHashMap.put("oem_runtime_permission", String.valueOf(AppManager.isOemRuntimeApp()));
        linkedHashMap.put("has_oem_runtime_permission", String.valueOf(AppManager.hasComGetInstallAppPermission()));
        f85840f.invoke("privacy.applist", linkedHashMap);
    }

    public static void c(List list) {
        if (DeviceDecision.INSTANCE.getBoolean("dd.privacy.strip_app_info", false)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApplicationInfo applicationInfo = (ApplicationInfo) it.next();
                if (Build.VERSION.SDK_INT >= 26) {
                    applicationInfo.splitNames = null;
                    applicationInfo.splitSourceDirs = null;
                    applicationInfo.splitPublicSourceDirs = null;
                    applicationInfo.sharedLibraryFiles = null;
                    try {
                        Field fieldA = com.bilibili.lib.breflect.restrictionbypass.a.a(ApplicationInfo.class, "splitDependencies");
                        if (fieldA != null) {
                            fieldA.set(applicationInfo, null);
                        }
                        Field fieldA2 = com.bilibili.lib.breflect.restrictionbypass.a.a(ApplicationInfo.class, "sharedLibraryInfos");
                        if (fieldA2 != null) {
                            fieldA2.set(applicationInfo, null);
                        }
                    } catch (Exception e7) {
                    }
                }
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final List<ApplicationInfo> getApplicationsInfoForPrivacy(@NotNull PackageManager packageManager, int i7) {
        Object obj;
        List listEmptyList = CollectionsKt.emptyList();
        b bVar = b.f85845d;
        try {
            PrivacyHelper privacyHelper = INSTANCE;
            boolean zHookEnable$privacy_release = privacyHelper.hookEnable$privacy_release("get_applications_info_privacy");
            c cVar = f85841g;
            if (!zHookEnable$privacy_release) {
                f85841g.i("hook disable, tag: [get_applications_info_privacy]", null);
                ArrayList arrayList = new ArrayList();
                ConfigManager.Companion companion = ConfigManager.Companion;
                boolean withDefault = companion.ab2().getWithDefault("ff_open_oem_adjust_runtime_permission_ap", true);
                boolean withDefault2 = companion.ab2().getWithDefault("ff_open_method_installed_application", true);
                boolean withDefault3 = companion.ab2().getWithDefault("ff_open_method_query_intent_fallback_ap", true);
                boolean withDefault4 = companion.ab2().getWithDefault("ff_app_list_methods_report_ap", true);
                String str = (String) companion.config().get("privacy.query_intent_fallback_number", "4");
                Integer numValueOf = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
                ArrayList<ApplicationInfo> arrayList2 = new ArrayList();
                if (withDefault && AppManager.hasComGetInstallAppPermission()) {
                    arrayList2.addAll(AppManager.getInstalledApplications(packageManager, i7));
                    arrayList.addAll(arrayList2);
                    cVar.i("getApplicationsInfoForPrivacy call  api : oem ", null);
                } else if (withDefault2) {
                    arrayList2.addAll(AppManager.getInstalledApplications(packageManager, i7));
                    arrayList.addAll(arrayList2);
                    cVar.i("getApplicationsInfoForPrivacy call  api : method allow ", null);
                }
                if (withDefault3) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!StringsKt.equals(((ApplicationInfo) obj2).packageName, FoundationAlias.getFapp().getPackageName(), true)) {
                            arrayList3.add(obj2);
                        }
                    }
                    if (arrayList3.size() <= numValueOf.intValue()) {
                        arrayList.addAll(AppManager.getInstalledApplicationsFromIntent(packageManager));
                        cVar.i("getApplicationsInfoForPrivacy call  intent api : fallback ", null);
                    }
                }
                if (!f85838d && withDefault4) {
                    f85838d = true;
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator<T> it = AppManager.getInstalledApplicationsFromIntent(packageManager).iterator();
                    while (it.hasNext()) {
                        hashSet3.add(((ApplicationInfo) it.next()).packageName);
                    }
                    HashSet hashSet4 = new HashSet();
                    for (ApplicationInfo applicationInfo : arrayList2) {
                        if ((applicationInfo.flags & 1) == 0) {
                            hashSet2.add(applicationInfo.packageName);
                        } else {
                            hashSet.add(applicationInfo.packageName);
                        }
                    }
                    hashSet4.addAll(hashSet2);
                    hashSet4.removeAll(hashSet3);
                    INSTANCE.getClass();
                    b(hashSet, hashSet2, hashSet3, hashSet4);
                }
                INSTANCE.getClass();
                c(arrayList);
                obj = arrayList;
            } else if (!privacyHelper.checkPrivacy$privacy_release("get_applications_info_privacy")) {
                f85841g.i("user deny, tag: [get_applications_info_privacy] defaultReturnValue = [" + listEmptyList + "]", null);
                obj = listEmptyList;
            } else if (privacyHelper.forbiddenUse$privacy_release("get_applications_info_privacy")) {
                f85841g.i("use forbidden, tag: [get_applications_info_privacy] defaultReturnValue = [" + listEmptyList + "]", null);
                obj = listEmptyList;
            } else {
                Object objAccess$hitPrivacyCache = access$hitPrivacyCache(privacyHelper, "get_applications_info_privacy");
                if (objAccess$hitPrivacyCache != null) {
                    obj = objAccess$hitPrivacyCache;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    ConfigManager.Companion companion2 = ConfigManager.Companion;
                    boolean withDefault5 = companion2.ab2().getWithDefault("ff_open_oem_adjust_runtime_permission_ap", true);
                    boolean withDefault6 = companion2.ab2().getWithDefault("ff_open_method_installed_application", true);
                    boolean withDefault7 = companion2.ab2().getWithDefault("ff_open_method_query_intent_fallback_ap", true);
                    boolean withDefault8 = companion2.ab2().getWithDefault("ff_app_list_methods_report_ap", true);
                    String str2 = (String) companion2.config().get("privacy.query_intent_fallback_number", "4");
                    Integer numValueOf2 = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
                    ArrayList<ApplicationInfo> arrayList5 = new ArrayList();
                    if (withDefault5 && AppManager.hasComGetInstallAppPermission()) {
                        arrayList5.addAll(AppManager.getInstalledApplications(packageManager, i7));
                        arrayList4.addAll(arrayList5);
                        cVar.i("getApplicationsInfoForPrivacy call  api : oem ", null);
                    } else if (withDefault6) {
                        arrayList5.addAll(AppManager.getInstalledApplications(packageManager, i7));
                        arrayList4.addAll(arrayList5);
                        cVar.i("getApplicationsInfoForPrivacy call  api : method allow ", null);
                    }
                    if (withDefault7) {
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            if (!StringsKt.equals(((ApplicationInfo) obj3).packageName, FoundationAlias.getFapp().getPackageName(), true)) {
                                arrayList6.add(obj3);
                            }
                        }
                        if (arrayList6.size() <= numValueOf2.intValue()) {
                            arrayList4.addAll(AppManager.getInstalledApplicationsFromIntent(packageManager));
                            cVar.i("getApplicationsInfoForPrivacy call  intent api : fallback ", null);
                        }
                    }
                    if (!f85838d && withDefault8) {
                        f85838d = true;
                        HashSet hashSet5 = new HashSet();
                        HashSet hashSet6 = new HashSet();
                        HashSet hashSet7 = new HashSet();
                        Iterator<T> it2 = AppManager.getInstalledApplicationsFromIntent(packageManager).iterator();
                        while (it2.hasNext()) {
                            hashSet7.add(((ApplicationInfo) it2.next()).packageName);
                        }
                        HashSet hashSet8 = new HashSet();
                        for (ApplicationInfo applicationInfo2 : arrayList5) {
                            if ((applicationInfo2.flags & 1) == 0) {
                                hashSet6.add(applicationInfo2.packageName);
                            } else {
                                hashSet5.add(applicationInfo2.packageName);
                            }
                        }
                        hashSet8.addAll(hashSet6);
                        hashSet8.removeAll(hashSet7);
                        INSTANCE.getClass();
                        b(hashSet5, hashSet6, hashSet7, hashSet8);
                    }
                    PrivacyHelper privacyHelper2 = INSTANCE;
                    privacyHelper2.getClass();
                    c(arrayList4);
                    privacyHelper2.getPrivacyCache().put("get_applications_info_privacy", new a(arrayList4, access$getDDCacheTime(privacyHelper2, "get_applications_info_privacy", bVar)));
                    f85841g.i("runOnPrivacyControl tag: get_applications_info_privacy", null);
                    obj = arrayList4;
                }
            }
        } catch (Throwable th) {
            if (f85837c) {
                v.b("catch error. tag: get_applications_info_privacy, message = ", th.getMessage(), f85841g, "privacy_", th);
                obj = listEmptyList;
            } else {
                v.b("catch error. tag: get_applications_info_privacy, message = ", th.getMessage(), f85841g, "privacy_", null);
                obj = listEmptyList;
            }
        }
        return (List) obj;
    }

    @JvmStatic
    @NotNull
    public static final List<PackageInfo> getInstalledPackagesForPrivacy(@NotNull PackageManager packageManager, int i7) {
        Object obj;
        List listEmptyList = CollectionsKt.emptyList();
        b bVar = b.f85845d;
        try {
            PrivacyHelper privacyHelper = INSTANCE;
            boolean zHookEnable$privacy_release = privacyHelper.hookEnable$privacy_release("get_installed_package_info_privacy");
            c cVar = f85841g;
            if (!zHookEnable$privacy_release) {
                f85841g.i("hook disable, tag: [get_installed_package_info_privacy]", null);
                ConfigManager.Companion companion = ConfigManager.Companion;
                Contract contractAb = companion.ab();
                Boolean bool = Boolean.TRUE;
                boolean zBooleanValue = ((Boolean) contractAb.get("ff_open_oem_adjust_runtime_permission_pk", bool)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) companion.ab().get("ff_open_method_installed_packages", bool)).booleanValue();
                ArrayList arrayList = new ArrayList();
                if (zBooleanValue && AppManager.hasComGetInstallAppPermission()) {
                    arrayList.addAll(AppManager.getInstalledPackages(packageManager, i7));
                    cVar.i("getInstalledPackagesForPrivacy call  api : oem ", null);
                } else if (zBooleanValue2) {
                    arrayList.addAll(AppManager.getInstalledPackages(packageManager, i7));
                    cVar.i("getInstalledPackagesForPrivacy call sys api:method allow ", null);
                } else {
                    cVar.i("getInstalledPackagesForPrivacy skip", null);
                }
                obj = arrayList;
            } else if (!privacyHelper.checkPrivacy$privacy_release("get_installed_package_info_privacy")) {
                f85841g.i("user deny, tag: [get_installed_package_info_privacy] defaultReturnValue = [" + listEmptyList + "]", null);
                obj = listEmptyList;
            } else if (privacyHelper.forbiddenUse$privacy_release("get_installed_package_info_privacy")) {
                f85841g.i("use forbidden, tag: [get_installed_package_info_privacy] defaultReturnValue = [" + listEmptyList + "]", null);
                obj = listEmptyList;
            } else {
                Object objAccess$hitPrivacyCache = access$hitPrivacyCache(privacyHelper, "get_installed_package_info_privacy");
                if (objAccess$hitPrivacyCache != null) {
                    obj = objAccess$hitPrivacyCache;
                } else {
                    ConfigManager.Companion companion2 = ConfigManager.Companion;
                    Contract contractAb2 = companion2.ab();
                    Boolean bool2 = Boolean.TRUE;
                    boolean zBooleanValue3 = ((Boolean) contractAb2.get("ff_open_oem_adjust_runtime_permission_pk", bool2)).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) companion2.ab().get("ff_open_method_installed_packages", bool2)).booleanValue();
                    ArrayList arrayList2 = new ArrayList();
                    if (zBooleanValue3 && AppManager.hasComGetInstallAppPermission()) {
                        arrayList2.addAll(AppManager.getInstalledPackages(packageManager, i7));
                        cVar.i("getInstalledPackagesForPrivacy call  api : oem ", null);
                    } else if (zBooleanValue4) {
                        arrayList2.addAll(AppManager.getInstalledPackages(packageManager, i7));
                        cVar.i("getInstalledPackagesForPrivacy call sys api:method allow ", null);
                    } else {
                        cVar.i("getInstalledPackagesForPrivacy skip", null);
                    }
                    privacyHelper.getPrivacyCache().put("get_installed_package_info_privacy", new a(arrayList2, access$getDDCacheTime(privacyHelper, "get_installed_package_info_privacy", bVar)));
                    f85841g.i("runOnPrivacyControl tag: get_installed_package_info_privacy", null);
                    obj = arrayList2;
                }
            }
        } catch (Throwable th) {
            if (f85837c) {
                v.b("catch error. tag: get_installed_package_info_privacy, message = ", th.getMessage(), f85841g, "privacy_", th);
                obj = listEmptyList;
            } else {
                v.b("catch error. tag: get_installed_package_info_privacy, message = ", th.getMessage(), f85841g, "privacy_", null);
                obj = listEmptyList;
            }
        }
        return (List) obj;
    }

    @JvmStatic
    @NotNull
    public static final String getMacAddressDirect() {
        try {
            return a(((WifiManager) FoundationAlias.getFapp().getSystemService("wifi")).getConnectionInfo());
        } catch (Exception e7) {
            f85841g.e("oaid_privacy", "getMacAddressDirect fail", null);
            return "";
        }
    }

    @JvmStatic
    public static final <T> T runOn$privacy_release(@NotNull String str, T t7, @NotNull b bVar, @NotNull Function0<? extends T> function0) {
        try {
            PrivacyHelper privacyHelper = INSTANCE;
            if (!privacyHelper.hookEnable$privacy_release(str)) {
                f85841g.i("hook disable, tag: [" + str + "]", null);
                return (T) function0.invoke();
            }
            if (!privacyHelper.checkPrivacy$privacy_release(str)) {
                f85841g.i("user deny, tag: [" + str + "] defaultReturnValue = [" + t7 + "]", null);
                return t7;
            }
            if (privacyHelper.forbiddenUse$privacy_release(str)) {
                f85841g.i("use forbidden, tag: [" + str + "] defaultReturnValue = [" + t7 + "]", null);
                return t7;
            }
            T t8 = (T) access$hitPrivacyCache(privacyHelper, str);
            if (t8 != null) {
                return t8;
            }
            T t9 = (T) function0.invoke();
            if (t9 != null) {
                privacyHelper.getPrivacyCache().put(str, new a(t9, access$getDDCacheTime(privacyHelper, str, bVar)));
            }
            f85841g.i("runOnPrivacyControl tag: " + str, null);
            return t9;
        } catch (Throwable th) {
            if (f85837c) {
                f85841g.e("privacy_", z.a("catch error. tag: ", str, ", message = ", th.getMessage()), th);
            } else {
                f85841g.e("privacy_", z.a("catch error. tag: ", str, ", message = ", th.getMessage()), null);
            }
            return t7;
        }
    }

    public static Object runOn$privacy_release$default(String str, Object obj, b bVar, Function0 function0, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            bVar = b.f85844c;
        }
        try {
            PrivacyHelper privacyHelper = INSTANCE;
            if (!privacyHelper.hookEnable$privacy_release(str)) {
                f85841g.i("hook disable, tag: [" + str + "]", null);
                return function0.invoke();
            }
            if (!privacyHelper.checkPrivacy$privacy_release(str)) {
                f85841g.i("user deny, tag: [" + str + "] defaultReturnValue = [" + obj + "]", null);
                return obj;
            }
            if (privacyHelper.forbiddenUse$privacy_release(str)) {
                f85841g.i("use forbidden, tag: [" + str + "] defaultReturnValue = [" + obj + "]", null);
                return obj;
            }
            Object objAccess$hitPrivacyCache = access$hitPrivacyCache(privacyHelper, str);
            if (objAccess$hitPrivacyCache != null) {
                return objAccess$hitPrivacyCache;
            }
            Object objInvoke = function0.invoke();
            if (objInvoke != null) {
                privacyHelper.getPrivacyCache().put(str, new a(objInvoke, access$getDDCacheTime(privacyHelper, str, bVar)));
            }
            f85841g.i("runOnPrivacyControl tag: " + str, null);
            return objInvoke;
        } catch (Throwable th) {
            if (f85837c) {
                f85841g.e("privacy_", z.a("catch error. tag: ", str, ", message = ", th.getMessage()), th);
            } else {
                f85841g.e("privacy_", z.a("catch error. tag: ", str, ", message = ", th.getMessage()), null);
            }
            return obj;
        }
    }

    public final void bindReporter(@NotNull Function2<? super String, ? super Map<String, String>, Unit> function2) {
        f85840f = function2;
        if (f85837c) {
            ConcurrentLinkedDeque<Map<String, String>> concurrentLinkedDeque = f85835a;
            if (concurrentLinkedDeque.isEmpty()) {
                return;
            }
            Iterator<T> it = concurrentLinkedDeque.iterator();
            while (it.hasNext()) {
                f85840f.invoke("infra.privacy", (Map) it.next());
            }
            f85835a.clear();
        }
    }

    public final boolean checkPrivacy$privacy_release(@NotNull String str) {
        boolean zBooleanValue = ((Boolean) f85839e.invoke()).booleanValue();
        if (!zBooleanValue) {
            LinkedHashMap linkedHashMapA = lh.c.a("privacy_type", str);
            linkedHashMapA.put("privacy_stack", ExceptionsKt.stackTraceToString(new Exception()));
            f85835a.add(linkedHashMapA);
        }
        return zBooleanValue;
    }

    public final boolean forbiddenUse$privacy_release(@NotNull String str) {
        boolean withDefault;
        try {
            withDefault = ConfigManager.Companion.ab2().getWithDefault("ff.privacy.forbidden." + str, false);
        } catch (Exception e7) {
            f85841g.i("forbidden error", e7);
            withDefault = true;
        }
        return withDefault;
    }

    @NotNull
    public final Map<String, a> getPrivacyCache() {
        return f85836b;
    }

    @NotNull
    public final Function0<Boolean> getPrivacyFun$privacy_release() {
        return f85839e;
    }

    public final boolean hookEnable$privacy_release(@NotNull String str) {
        boolean withDefault = true;
        try {
            withDefault = ConfigManager.Companion.ab2().getWithDefault("ff.privacy.hook.enable." + str, true);
        } catch (Exception e7) {
            f85841g.i("checkPrivacyEnable error", e7);
        }
        return withDefault;
    }

    public final void init(boolean z6, boolean z7, @NotNull Function0<Boolean> function0) {
        f85837c = z6;
        f85839e = function0;
    }

    public final void setPrivacyFun$privacy_release(@NotNull Function0<Boolean> function0) {
        f85839e = function0;
    }
}
