package com.bilibili.live.crypto;

import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/crypto/CryptoJni.class */
public final class CryptoJni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CryptoJni f65151a = new CryptoJni();

    static {
        try {
            System.loadLibrary("crypto_c");
        } catch (Throwable th) {
            LiveLog.Companion companion = LiveLog.Companion;
            if (companion.matchLevel(1)) {
                String str = "loadLibrary failed" == 0 ? "" : "loadLibrary failed";
                LiveLogDelegate logDelegate = companion.getLogDelegate();
                if (logDelegate != null) {
                    logDelegate.onLog(1, "CryptoJni", str, th);
                }
                BLog.e("CryptoJni", str, th);
            }
        }
    }

    @NotNull
    public final String a(@NotNull String str, @NotNull List<Integer> list) {
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                try {
                    String strCompute = f65151a.compute(str, ((Number) it.next()).intValue());
                    String str5 = strCompute;
                    if (strCompute == null) {
                        str5 = "";
                    }
                    str2 = str5;
                } catch (Throwable th) {
                    LiveLog.Companion companion = LiveLog.Companion;
                    if (companion.matchLevel(2)) {
                        String str6 = "getSign spyder error" == 0 ? "" : "getSign spyder error";
                        LiveLogDelegate logDelegate = companion.getLogDelegate();
                        if (logDelegate != null) {
                            LiveLogDelegate.onLog$default(logDelegate, 2, "CryptoJni", str6, (Throwable) null, 8, (Object) null);
                        }
                        BLog.w("CryptoJni", str6, th);
                        str2 = str;
                    } else {
                        str2 = str;
                    }
                }
                LiveLog.Companion companion2 = LiveLog.Companion;
                if (companion2.isDebug()) {
                    try {
                        str4 = "getSign: " + ((Object) str2);
                    } catch (Exception e7) {
                        BLog.e("LiveLog", "getLogMessage", e7);
                        str4 = null;
                    }
                    String str7 = str4;
                    if (str4 == null) {
                        str7 = "";
                    }
                    BLog.d("CryptoJni", str7);
                    LiveLogDelegate logDelegate2 = companion2.getLogDelegate();
                    str = str2;
                    if (logDelegate2 != null) {
                        LiveLogDelegate.onLog$default(logDelegate2, 4, "CryptoJni", str7, (Throwable) null, 8, (Object) null);
                        str = str2;
                    }
                } else {
                    str = str2;
                    if (companion2.matchLevel(4)) {
                        if (companion2.matchLevel(3)) {
                            try {
                                str3 = "getSign: " + ((Object) str2);
                            } catch (Exception e8) {
                                BLog.e("LiveLog", "getLogMessage", e8);
                                str3 = null;
                            }
                            String str8 = str3;
                            if (str3 == null) {
                                str8 = "";
                            }
                            LiveLogDelegate logDelegate3 = companion2.getLogDelegate();
                            if (logDelegate3 != null) {
                                LiveLogDelegate.onLog$default(logDelegate3, 3, "CryptoJni", str8, (Throwable) null, 8, (Object) null);
                            }
                            BLog.i("CryptoJni", str8);
                            str = str2;
                        } else {
                            str = str2;
                        }
                    }
                }
            }
        }
        return str;
    }

    @Nullable
    public final native String compute(@NotNull String str, int i7);
}
