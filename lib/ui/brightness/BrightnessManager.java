package com.bilibili.lib.ui.brightness;

import G0.g;
import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bilibili.app.comm.bh.x5.b;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.ui.brightness.BrightnessManager;
import j4.t;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import vp.w;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/brightness/BrightnessManager.class */
public final class BrightnessManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f64833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f64834c;

    @NotNull
    public static final BrightnessManager INSTANCE = new BrightnessManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f64832a = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f64835d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f64836e = "BrightnessManager";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/brightness/BrightnessManager$a.class */
    public static final class a implements LifecycleObserver {
        public a(@NotNull Context context) {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        private final void onAppBackground() {
            BrightnessManager.access$setOnBackground(BrightnessManager.INSTANCE, true);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        private final void onAppForeground() {
            BrightnessManager.f64834c = true;
            BrightnessManager.access$setOnBackground(BrightnessManager.INSTANCE, false);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        private final void onAppResume() {
            BrightnessManager.f64834c = true;
            BrightnessManager.access$setOnBackground(BrightnessManager.INSTANCE, false);
        }
    }

    public static float a() throws Settings.SettingNotFoundException {
        float f7 = Settings.System.getFloat(FoundationAlias.getFapp().getContentResolver(), "screen_brightness");
        BLog.i(f64836e, g.a(f7, "get SystemAppBrightness: "));
        return f7 / 255.0f;
    }

    public static final void access$setOnBackground(BrightnessManager brightnessManager, boolean z6) {
        brightnessManager.getClass();
        f64833b = z6;
        BLog.i(f64836e, b.a("setOnBackground: ", z6));
    }

    public final void aglinSystemBrightness(@Nullable Activity activity) {
        boolean z6 = f64833b;
        String str = f64836e;
        if (z6 || f64834c) {
            f64834c = false;
            BLog.i(str, "isBackground: " + z6 + ", return ");
            return;
        }
        if (!z6) {
            f64832a = -1.0f;
        }
        BLog.i(str, "System Brightness Changed");
        if (activity != null) {
            INSTANCE.setAppBrightness(activity);
        }
    }

    public final boolean getBrightnessEnable() {
        boolean z6 = false;
        if (ConfigManager.Companion.ab2().getWithDefault("ff_enable_app_brightness", false)) {
            z6 = true;
        }
        return z6;
    }

    public final float getCurAppBrightness(@NotNull Activity activity) {
        if (getBrightnessEnable()) {
            float f7 = f64832a;
            if (f7 != -1.0f) {
                return f7;
            }
        }
        return a();
    }

    @JvmName(name = "setAppBrightness")
    public final void setAppBrightness(@NotNull final Activity activity) {
        final int i7 = 0;
        HandlerThreads.runOn(0, new Runnable(activity, i7) { // from class: Pf0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f18905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f18906b;

            {
                this.f18905a = i7;
                this.f18906b = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f18905a) {
                    case 0:
                        Activity activity2 = (Activity) this.f18906b;
                        boolean z6 = BrightnessManager.f64835d;
                        String str = BrightnessManager.f64836e;
                        if (!z6) {
                            if (BrightnessManager.f64832a == -1.0f) {
                                try {
                                    BrightnessManager.INSTANCE.getClass();
                                    float fA = BrightnessManager.a();
                                    if (fA > 255.0f) {
                                        BLog.i(str, "systemBrightness > 255: " + fA);
                                    } else {
                                        BrightnessManager.f64832a = BrightnessManager.a();
                                    }
                                } catch (Settings.SettingNotFoundException e7) {
                                    e7.printStackTrace();
                                }
                            }
                            Window window = activity2.getWindow();
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.screenBrightness = Math.max(BrightnessManager.f64832a, 0.01f);
                            window.setAttributes(attributes);
                            BLog.i(str, "setAppBrightness: " + BrightnessManager.f64832a);
                        } else {
                            t.a("noModify: ", str, z6);
                        }
                        break;
                    default:
                        w.a aVar = (w.a) this.f18906b;
                        if (aVar.g.getLineCount() >= 3) {
                            ReporterV3.reportExposure("game-detail-page", "recent-update", "fold-unfold", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("game_base_id", String.valueOf(w.h)), TuplesKt.to("type", aVar.g.isExpand() ? "收起" : "展开")}));
                        }
                        break;
                }
            }
        });
    }

    public final void updateAppBrightness(@NotNull Activity activity, float f7) {
        if (f7 < 0.0f) {
            f64832a = -1.0f;
        } else if (f7 > 1.0f) {
            f64832a = Math.min(f7, 1.0f);
        } else {
            f64832a = f7;
        }
        f64832a = f7;
        f64835d = false;
        setAppBrightness(activity);
    }
}
