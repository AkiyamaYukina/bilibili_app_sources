package com.bilibili.privacy;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.provider.Settings;
import androidx.appcompat.app.v;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.privacy.PrivacyHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/privacy/AppManager.class */
public final class AppManager {

    @NotNull
    public static final AppManager INSTANCE = new AppManager();

    @JvmStatic
    public static final Set<ApplicationInfo> a(PackageManager packageManager, Intent intent) {
        HashSet hashSet = new HashSet();
        new ArrayList();
        Iterator<T> it = packageManager.queryIntentActivities(intent, 131072).iterator();
        while (it.hasNext()) {
            ApplicationInfo applicationInfo = ((ResolveInfo) it.next()).activityInfo.applicationInfo;
            if (applicationInfo != null) {
                hashSet.add(applicationInfo);
            }
        }
        return hashSet;
    }

    @JvmStatic
    @NotNull
    public static final List<ApplicationInfo> getInstalledApplications(@NotNull PackageManager packageManager, int i7) {
        Object installedApplications;
        List listEmptyList = CollectionsKt.emptyList();
        PrivacyHelper.b bVar = PrivacyHelper.b.f85845d;
        try {
            PrivacyHelper privacyHelper = PrivacyHelper.INSTANCE;
            if (!privacyHelper.hookEnable$privacy_release("pm_get_installed_application")) {
                PrivacyHelper.f85841g.i("hook disable, tag: [pm_get_installed_application]", null);
                installedApplications = packageManager.getInstalledApplications(i7);
                if (!(installedApplications instanceof List)) {
                    installedApplications = null;
                }
            } else if (!privacyHelper.checkPrivacy$privacy_release("pm_get_installed_application")) {
                PrivacyHelper.f85841g.i("user deny, tag: [pm_get_installed_application] defaultReturnValue = [" + listEmptyList + "]", null);
                installedApplications = listEmptyList;
            } else if (privacyHelper.forbiddenUse$privacy_release("pm_get_installed_application")) {
                PrivacyHelper.f85841g.i("use forbidden, tag: [pm_get_installed_application] defaultReturnValue = [" + listEmptyList + "]", null);
                installedApplications = listEmptyList;
            } else {
                Object objAccess$hitPrivacyCache = PrivacyHelper.access$hitPrivacyCache(privacyHelper, "pm_get_installed_application");
                if (objAccess$hitPrivacyCache != null) {
                    installedApplications = objAccess$hitPrivacyCache;
                } else {
                    installedApplications = packageManager.getInstalledApplications(i7);
                    if (!(installedApplications instanceof List)) {
                        installedApplications = null;
                    }
                    if (installedApplications != null) {
                        privacyHelper.getPrivacyCache().put("pm_get_installed_application", new PrivacyHelper.a(installedApplications, PrivacyHelper.access$getDDCacheTime(privacyHelper, "pm_get_installed_application", bVar)));
                    }
                    PrivacyHelper.f85841g.i("runOnPrivacyControl tag: pm_get_installed_application", null);
                }
            }
        } catch (Throwable th) {
            if (PrivacyHelper.f85837c) {
                v.b("catch error. tag: pm_get_installed_application, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", th);
                installedApplications = listEmptyList;
            } else {
                v.b("catch error. tag: pm_get_installed_application, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", null);
                installedApplications = listEmptyList;
            }
        }
        return (List) installedApplications;
    }

    @JvmStatic
    @NotNull
    public static final HashSet<ApplicationInfo> getInstalledApplicationsFromIntent(@NotNull PackageManager packageManager) {
        HashSet<ApplicationInfo> hashSet = new HashSet<>();
        hashSet.addAll(a(packageManager, new Intent("android.intent.action.MAIN")));
        hashSet.addAll(a(packageManager, new Intent("android.intent.action.VIEW")));
        return hashSet;
    }

    @JvmStatic
    @NotNull
    public static final List<PackageInfo> getInstalledPackages(@NotNull PackageManager packageManager, int i7) {
        Object installedPackages;
        List listEmptyList = CollectionsKt.emptyList();
        PrivacyHelper.b bVar = PrivacyHelper.b.f85845d;
        try {
            PrivacyHelper privacyHelper = PrivacyHelper.INSTANCE;
            if (!privacyHelper.hookEnable$privacy_release("pm_get_installed_package")) {
                PrivacyHelper.f85841g.i("hook disable, tag: [pm_get_installed_package]", null);
                installedPackages = packageManager.getInstalledPackages(i7);
                if (!(installedPackages instanceof List)) {
                    installedPackages = null;
                }
            } else if (!privacyHelper.checkPrivacy$privacy_release("pm_get_installed_package")) {
                PrivacyHelper.f85841g.i("user deny, tag: [pm_get_installed_package] defaultReturnValue = [" + listEmptyList + "]", null);
                installedPackages = listEmptyList;
            } else if (privacyHelper.forbiddenUse$privacy_release("pm_get_installed_package")) {
                PrivacyHelper.f85841g.i("use forbidden, tag: [pm_get_installed_package] defaultReturnValue = [" + listEmptyList + "]", null);
                installedPackages = listEmptyList;
            } else {
                Object objAccess$hitPrivacyCache = PrivacyHelper.access$hitPrivacyCache(privacyHelper, "pm_get_installed_package");
                if (objAccess$hitPrivacyCache != null) {
                    installedPackages = objAccess$hitPrivacyCache;
                } else {
                    installedPackages = packageManager.getInstalledPackages(i7);
                    if (!(installedPackages instanceof List)) {
                        installedPackages = null;
                    }
                    if (installedPackages != null) {
                        privacyHelper.getPrivacyCache().put("pm_get_installed_package", new PrivacyHelper.a(installedPackages, PrivacyHelper.access$getDDCacheTime(privacyHelper, "pm_get_installed_package", bVar)));
                    }
                    PrivacyHelper.f85841g.i("runOnPrivacyControl tag: pm_get_installed_package", null);
                }
            }
        } catch (Throwable th) {
            if (PrivacyHelper.f85837c) {
                v.b("catch error. tag: pm_get_installed_package, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", th);
                installedPackages = listEmptyList;
            } else {
                v.b("catch error. tag: pm_get_installed_package, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", null);
                installedPackages = listEmptyList;
            }
        }
        return (List) installedPackages;
    }

    @JvmStatic
    public static final boolean hasComGetInstallAppPermission() {
        return ContextCompat.checkSelfPermission(FoundationAlias.getFapp(), "com.android.permission.GET_INSTALLED_APPS") == 0;
    }

    @JvmStatic
    public static final boolean isOemRuntimeApp() {
        boolean z6 = false;
        if (Settings.Secure.getInt(FoundationAlias.getFapp().getContentResolver(), "oem_installed_apps_runtime_permission_enable", 0) == 1) {
            z6 = true;
        }
        return z6;
    }

    @JvmStatic
    public static final boolean isSystemApp(@NotNull ApplicationInfo applicationInfo) {
        boolean z6 = true;
        if ((applicationInfo.flags & 1) == 0) {
            z6 = false;
        }
        return z6;
    }
}
