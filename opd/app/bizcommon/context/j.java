package com.bilibili.opd.app.bizcommon.context;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.opd.app.bizcommon.biliapm.MallTaskRunner;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.opd.app.bizcommon.context.utils.TraceLog;
import com.bilibili.studio.material.util.UtilsKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/j.class */
public final class j extends BiliContext.AppActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f73544a = new BiliContext.AppActivityLifecycleListener();

    public static Uri a(ActivityInfo activityInfo) {
        return MallProviderParamsHelper.access$getBaseUriBuilder(MallProviderParamsHelper.INSTANCE).path("/activity/check").appendQueryParameter("hashCode", String.valueOf(activityInfo.getHashCode())).appendQueryParameter("activityName", activityInfo.getActivityName()).appendQueryParameter("packageName", activityInfo.getPackageName()).build();
    }

    public static ActivityInfo c(int i7, String str) {
        if (str == null || str.length() == 0 || !StringsKt.n(str, UtilsKt.DOT)) {
            return null;
        }
        return new ActivityInfo(Integer.valueOf(i7), str.substring(0, StringsKt.D(str, UtilsKt.DOT, 0, 6)), (String) CollectionsKt.lastOrNull(StringsKt.R(str, new String[]{UtilsKt.DOT}, 0, 6)));
    }

    public final void onActivityCreated(@NotNull Activity activity) {
        super/*com.bilibili.base.BiliContext.ActivityStateCallback*/.onActivityCreated(activity);
        ComponentName componentName = activity.getComponentName();
        String className = componentName != null ? componentName.getClassName() : null;
        final int iHashCode = activity.hashCode();
        final String str = className;
        MallTaskRunner.getInstance().submit(new Runnable(str, iHashCode) { // from class: com.bilibili.opd.app.bizcommon.context.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f73542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f73543b;

            {
                this.f73542a = str;
                this.f73543b = iHashCode;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ContentResolver contentResolver;
                String str2 = this.f73542a;
                int i7 = this.f73543b;
                j.f73544a.getClass();
                ActivityInfo activityInfoC = j.c(i7, str2);
                if (activityInfoC != null) {
                    TraceLog.i("MallActivityLifecycle isMainProcess: " + ProcessUtils.isMainProcess() + " activityInfo: " + activityInfoC);
                    Uri uriA = j.a(activityInfoC);
                    TraceLog.i("MallActivityLifecycle MallActivityLifecycle isMainProcess: " + ProcessUtils.isMainProcess() + " insert uri: " + uriA);
                    Application application = BiliContext.application();
                    if (application == null || (contentResolver = application.getContentResolver()) == null) {
                        return;
                    }
                    contentResolver.insert(uriA, new ContentValues());
                }
            }
        });
    }

    public final void onActivityDestroyed(@NotNull Activity activity) {
        super/*com.bilibili.base.BiliContext.ActivityStateCallback*/.onActivityDestroyed(activity);
        ComponentName componentName = activity.getComponentName();
        String className = componentName != null ? componentName.getClassName() : null;
        final int iHashCode = activity.hashCode();
        final String str = className;
        MallTaskRunner.getInstance().submit(new Runnable(str, iHashCode) { // from class: com.bilibili.opd.app.bizcommon.context.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f73540a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f73541b;

            {
                this.f73540a = str;
                this.f73541b = iHashCode;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ContentResolver contentResolver;
                String str2 = this.f73540a;
                int i7 = this.f73541b;
                j.f73544a.getClass();
                ActivityInfo activityInfoC = j.c(i7, str2);
                if (activityInfoC != null) {
                    TraceLog.i("MallActivityLifecycle isMainProcess: " + ProcessUtils.isMainProcess() + " activityInfo: " + activityInfoC);
                    Uri uriA = j.a(activityInfoC);
                    TraceLog.i("MallActivityLifecycle isMainProcess: " + ProcessUtils.isMainProcess() + " delete uri: " + uriA);
                    Application application = BiliContext.application();
                    if (application == null || (contentResolver = application.getContentResolver()) == null) {
                        return;
                    }
                    contentResolver.delete(uriA, null, null);
                }
            }
        });
    }
}
