package com.bilibili.studio.videoeditor.generalrender.model;

import android.app.Activity;
import android.view.Window;
import com.bilibili.base.MainThread;
import com.bilibili.lib.blconfig.ConfigManager;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/v.class */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f109656a = new Object();

    public static void a(@Nullable Activity activity, final boolean z6) {
        Object obj;
        final Window window;
        try {
            Result.Companion companion = Result.Companion;
            Lazy lazy = zw0.b.f130950a;
            if (!ConfigManager.Companion.ab2().getWithDefault("uper.enable_screen_aod", false) || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            MainThread.runOnMainThread(new Function0(window, z6) { // from class: com.bilibili.studio.videoeditor.generalrender.model.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f109654a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Window f109655b;

                {
                    this.f109654a = z6;
                    this.f109655b = window;
                }

                public final Object invoke() {
                    Window window2 = this.f109655b;
                    if (this.f109654a) {
                        window2.clearFlags(128);
                    } else {
                        window2.addFlags(128);
                    }
                    return Unit.INSTANCE;
                }
            });
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            M.b("exception is ", th2.getMessage(), "ScreenUtils");
        }
    }
}
