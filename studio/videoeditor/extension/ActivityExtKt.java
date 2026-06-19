package com.bilibili.studio.videoeditor.extension;

import android.app.Activity;
import com.bilibili.base.BiliContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.garb.T;
import tv.danmaku.bili.ui.garb.api.BiliDrawCard;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/ActivityExtKt.class */
public final class ActivityExtKt {
    public static final boolean isActive(@Nullable Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static final void post(@Nullable Activity activity, @NotNull Function0<Unit> function0) {
        BiliContext.getMainHandler().post(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.g(activity, function0));
    }

    public static final void postDelay(@Nullable final Activity activity, long j7, @NotNull final Function0<Unit> function0) {
        final int i7 = 0;
        BiliContext.getMainHandler().postDelayed(new Runnable(i7, activity, function0) { // from class: com.bilibili.studio.videoeditor.extension.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f109563a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f109564b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f109565c;

            {
                this.f109563a = i7;
                this.f109564b = activity;
                this.f109565c = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f109563a) {
                    case 0:
                        Activity activity2 = (Activity) this.f109564b;
                        Function0 function02 = (Function0) this.f109565c;
                        if (ActivityExtKt.isActive(activity2)) {
                            function02.invoke();
                        }
                        break;
                    default:
                        ((T) this.f109564b).h((BiliDrawCard) this.f109565c);
                        break;
                }
            }
        }, j7);
    }
}
