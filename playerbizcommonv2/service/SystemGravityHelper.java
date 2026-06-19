package com.bilibili.playerbizcommonv2.service;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/SystemGravityHelper.class */
@StabilityInferred(parameters = 0)
public final class SystemGravityHelper extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ContentResolver f81818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WeakReference<OnSystemGravityChangedListener> f81819b;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/SystemGravityHelper$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getGravityOpenStatus(@NotNull Context context) {
            int i7;
            boolean z6 = true;
            try {
                i7 = Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation");
            } catch (Settings.SettingNotFoundException e7) {
                BLog.e("SystemGravityHelper", e7);
                i7 = 1;
            }
            if (i7 == 0) {
                z6 = false;
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/SystemGravityHelper$OnSystemGravityChangedListener.class */
    public interface OnSystemGravityChangedListener {
        void onClose();

        void onOpen();
    }

    public SystemGravityHelper(@NotNull Context context, @NotNull Handler handler) {
        super(handler);
        this.f81818a = context.getApplicationContext().getContentResolver();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z6) {
        Application application;
        Context applicationContext;
        OnSystemGravityChangedListener onSystemGravityChangedListener;
        OnSystemGravityChangedListener onSystemGravityChangedListener2;
        super.onChange(z6);
        if (this.f81819b == null || (application = BiliContext.application()) == null || (applicationContext = application.getApplicationContext()) == null) {
            return;
        }
        if (Companion.getGravityOpenStatus(applicationContext)) {
            WeakReference<OnSystemGravityChangedListener> weakReference = this.f81819b;
            if (weakReference == null || (onSystemGravityChangedListener2 = weakReference.get()) == null) {
                return;
            }
            onSystemGravityChangedListener2.onOpen();
            return;
        }
        WeakReference<OnSystemGravityChangedListener> weakReference2 = this.f81819b;
        if (weakReference2 == null || (onSystemGravityChangedListener = weakReference2.get()) == null) {
            return;
        }
        onSystemGravityChangedListener.onClose();
    }

    public final void setChangedListener(@Nullable OnSystemGravityChangedListener onSystemGravityChangedListener) {
        this.f81819b = onSystemGravityChangedListener == null ? null : new WeakReference<>(onSystemGravityChangedListener);
    }

    public final void startObserver() {
        this.f81818a.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this);
    }

    public final void stopObserver() {
        this.f81818a.unregisterContentObserver(this);
    }
}
