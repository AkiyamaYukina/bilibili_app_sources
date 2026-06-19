package com.bilibili.mediastreaming.audio;

import android.util.Log;
import com.bilibili.live.streaming.AudioSessionV2;
import com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static AudioSessionV2.AnonymousClass1 f65700a;

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/a$a.class */
    public static final /* synthetic */ class C0368a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f65701a;

        static {
            int[] iArr = new int[IBiliAudioLoggerObserver.Severity.values().length];
            try {
                iArr[IBiliAudioLoggerObserver.Severity.LS_VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[IBiliAudioLoggerObserver.Severity.LS_DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[IBiliAudioLoggerObserver.Severity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[IBiliAudioLoggerObserver.Severity.LS_WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[IBiliAudioLoggerObserver.Severity.LS_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f65701a = iArr;
        }
    }

    @JvmStatic
    public static final void a(@NotNull IBiliAudioLoggerObserver.Severity severity, @Nullable String str, @NotNull String str2, @Nullable Throwable th) {
        String strConcat = str == null ? "BiliAudioLog" : "BiliAudioLog:".concat(str);
        AudioSessionV2.AnonymousClass1 anonymousClass1 = f65700a;
        if (anonymousClass1 != null) {
            anonymousClass1.onLogMessage(severity, strConcat, str2, th);
            return;
        }
        int i7 = C0368a.f65701a[severity.ordinal()];
        if (i7 == 1 || i7 == 2) {
            return;
        }
        if (i7 == 3) {
            Log.i(strConcat, str2, th);
            return;
        }
        if (i7 == 4) {
            Log.w(strConcat, str2, th);
        } else if (i7 != 5) {
            Log.i(strConcat, str2, th);
        } else {
            Log.e(strConcat, str2, th);
        }
    }
}
