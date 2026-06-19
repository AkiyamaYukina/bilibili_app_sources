package com.bilibili.mediastreaming.audio;

import com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver;
import kotlin.jvm.functions.Function0;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/b.class */
public final class b implements InterfaceC8094b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f65702a;

    public b(@Nullable String str) {
        this.f65702a = str;
    }

    public final void d(@NotNull Function0<String> function0, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        String strA = str2;
        if (str2 == null) {
            String str3 = this.f65702a;
            strA = str3;
            if (str != null) {
                strA = B0.a.a(str3, ":", str);
            }
        }
        a.a(IBiliAudioLoggerObserver.Severity.LS_DEBUG, strA, (String) function0.invoke(), th);
    }

    public final void e(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.f65702a;
            strA = str4;
            if (str2 != null) {
                strA = B0.a.a(str4, ":", str2);
            }
        }
        a.a(IBiliAudioLoggerObserver.Severity.LS_VERBOSE, strA, str, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.f65702a;
            strA = str4;
            if (str2 != null) {
                strA = B0.a.a(str4, ":", str2);
            }
        }
        a.a(IBiliAudioLoggerObserver.Severity.LS_ERROR, strA, str, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.f65702a;
            strA = str4;
            if (str2 != null) {
                strA = B0.a.a(str4, ":", str2);
            }
        }
        a.a(IBiliAudioLoggerObserver.Severity.LS_INFO, strA, str, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.f65702a;
            strA = str4;
            if (str2 != null) {
                strA = B0.a.a(str4, ":", str2);
            }
        }
        a.a(IBiliAudioLoggerObserver.Severity.LS_WARNING, strA, str, th);
    }
}
