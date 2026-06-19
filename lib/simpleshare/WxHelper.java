package com.bilibili.lib.simpleshare;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/simpleshare/WxHelper.class */
public final class WxHelper {

    @NotNull
    public static final WxHelper INSTANCE = new WxHelper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static WxHelperDelegate f64462a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/simpleshare/WxHelper$SimpleActivityLifecycleCallbacks.class */
    public static class SimpleActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/simpleshare/WxHelper$WxHelperDelegate.class */
    public interface WxHelperDelegate {
        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void openWXMiniProgram$default(WxHelperDelegate wxHelperDelegate, Activity activity, String str, String str2, int i7, String str3, Function1 function1, Function1 function12, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openWXMiniProgram");
            }
            if ((i8 & 32) != 0) {
                function1 = null;
            }
            if ((i8 & 64) != 0) {
                function12 = null;
            }
            wxHelperDelegate.openWXMiniProgram(activity, str, str2, i7, str3, function1, function12);
        }

        void openWXMiniProgram(@NotNull Activity activity, @NotNull String str, @Nullable String str2, int i7, @Nullable String str3, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super String, Unit> function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openWXMiniProgram$default(WxHelper wxHelper, Activity activity, String str, String str2, int i7, String str3, Function1 function1, Function1 function12, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = 0;
        }
        if ((i8 & 16) != 0) {
            str3 = "";
        }
        if ((i8 & 32) != 0) {
            function1 = null;
        }
        if ((i8 & 64) != 0) {
            function12 = null;
        }
        wxHelper.openWXMiniProgram(activity, str, str2, i7, str3, function1, function12);
    }

    public final void openWXMiniProgram(@NotNull Activity activity, @NotNull String str, @Nullable String str2, int i7, @Nullable String str3, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super String, Unit> function12) {
        WxHelperDelegate wxHelperDelegate = f64462a;
        if (wxHelperDelegate != null) {
            wxHelperDelegate.openWXMiniProgram(activity, str, str2, i7, str3, function1, function12);
        }
    }

    public final void setWxHelperImpl(@NotNull WxHelperDelegate wxHelperDelegate) {
        f64462a = wxHelperDelegate;
    }
}
