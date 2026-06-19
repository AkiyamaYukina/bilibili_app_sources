package com.bilibili.lib.riskcontrol;

import af0.C3208g;
import af0.SharedPreferencesOnSharedPreferenceChangeListenerC3206e;
import android.util.Base64;
import bf0.C5098a;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.riskcontrol.RiskControlReporter;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/a.class */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static RiskControl f64337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static SharedPreferencesOnSharedPreferenceChangeListenerC3206e f64338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f64339d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f64340e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f64341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f64342g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f64336a = new Object();

    @NotNull
    public static final HashMap<String, BiliRiskControlCallback> h = new HashMap<>();

    @NotNull
    public static Pair a(@NotNull String str, boolean z6) {
        Pair pair;
        byte[] bArrDoFinal;
        Lazy lazy = C5098a.f56533a;
        try {
            String strL = StringsKt.L(new Regex("-----BEGIN PUBLIC KEY-----\n").replaceFirst(z6 ? (String) C5098a.f56534b.getValue() : (String) C5098a.f56533a.getValue(), ""), "\n-----END PUBLIC KEY-----\n", "");
            Charset charset = Charsets.UTF_8;
            Pair pairA = C5098a.a(str.getBytes(charset), z6);
            String str2 = (String) pairA.component1();
            String str3 = (String) pairA.component2();
            String strEncodeToString = null;
            try {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(strL.getBytes(charset), 0)));
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
                cipher.init(1, publicKeyGeneratePublic);
                bArrDoFinal = cipher.doFinal(str2.getBytes(charset));
            } catch (Exception e7) {
                bArrDoFinal = null;
            }
            if (bArrDoFinal != null) {
                strEncodeToString = Base64.encodeToString(bArrDoFinal, 0);
            }
            pair = (strEncodeToString == null || StringsKt.isBlank(strEncodeToString) || str3 == null || StringsKt.isBlank(str3)) ? new Pair("", "") : new Pair(strEncodeToString, str3);
        } catch (Exception e8) {
            LogDelegate log = BiliRiskControlConfig.INSTANCE.getLog();
            if (log != null) {
                String message = e8.getMessage();
                String str4 = message;
                if (message == null) {
                    str4 = "encrypt error";
                }
                log.e("risk_encrypt", str4);
            }
            pair = new Pair("", "");
        }
        return pair;
    }

    public static void c(String str, String str2, BiliRiskException biliRiskException, int i7) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            biliRiskException = null;
        }
        d(str, str2, biliRiskException, (i7 & 8) != 0);
        f64339d++;
        BLKV.getBLSharedPreferences$default(BiliRiskControlConfig.INSTANCE.getParams().fapp(), "bili_risk", true, 0, 4, (Object) null).get("key_risk_version", Integer.valueOf(f64339d));
    }

    public static void d(String str, String str2, BiliRiskException biliRiskException, boolean z6) {
        for (Map.Entry<String, BiliRiskControlCallback> entry : h.entrySet()) {
            BiliRiskControlCallback value = entry.getValue();
            if (z6) {
                RiskControlReporter.c(RiskControlReporter.EventType.RISK_CALLBACK_TOKEN, entry.getKey(), str, null, null, (str2 == null || str2.length() == 0) ? "0" : "1", str2, biliRiskException != null ? biliRiskException.getErrorCode() : null, biliRiskException != null ? biliRiskException.getErrorMsg() : null, 536);
            }
            value.onRiskComplete(str2, biliRiskException);
            String errorMsg = null;
            if (biliRiskException != null) {
                errorMsg = biliRiskException.getErrorMsg();
            }
            value.onRiskComplete(str2, errorMsg);
        }
        h.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0003, B:6:0x0004, B:25:0x002d, B:27:0x002f, B:28:0x0030, B:39:0x0064, B:40:0x0065, B:42:0x0075, B:56:0x0091, B:60:0x0095, B:8:0x000a, B:10:0x0010, B:11:0x0015, B:15:0x001b, B:16:0x001c, B:23:0x002b, B:13:0x0017, B:30:0x0036, B:32:0x003c, B:34:0x004c, B:37:0x005f), top: B:66:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(int r5) {
        /*
            r4 = this;
            r0 = r4
            monitor-enter(r0)
            r0 = r4
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L83
            boolean r0 = com.bilibili.lib.riskcontrol.a.f64342g     // Catch: java.lang.Throwable -> L23 java.lang.Throwable -> L83
            if (r0 != 0) goto L2c
            boolean r0 = com.bilibili.droid.ProcessUtils.isMainProcess()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L2c
            af0.j r0 = af0.j.f31144a     // Catch: java.lang.Throwable -> L23
            r6 = r0
            r0 = r6
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L23
            r0 = r6
            r0.a()     // Catch: java.lang.Throwable -> L27
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            r0 = 1
            com.bilibili.lib.riskcontrol.a.f64342g = r0     // Catch: java.lang.Throwable -> L23
            goto L2c
        L23:
            r6 = move-exception
            goto L92
        L27:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> L23
        L2c:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            r0 = r4
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L83
            boolean r0 = com.bilibili.lib.riskcontrol.a.f64341f     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L83
            if (r0 != 0) goto L63
            boolean r0 = com.bilibili.droid.ProcessUtils.isMainProcess()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L63
            r0 = r4
            r1 = 0
            r0.e(r1)     // Catch: java.lang.Throwable -> L5b
            com.bilibili.lib.riskcontrol.BiliRiskControlConfig r0 = com.bilibili.lib.riskcontrol.BiliRiskControlConfig.INSTANCE     // Catch: java.lang.Throwable -> L5b
            com.bilibili.lib.riskcontrol.LogDelegate r0 = r0.getLog()     // Catch: java.lang.Throwable -> L5b
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L5f
            r0 = r6
            java.lang.String r1 = "BiliRiskControl"
            java.lang.String r2 = "resetDialogShowing success"
            r0.i(r1, r2)     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r6 = move-exception
            goto L8e
        L5f:
            r0 = 1
            com.bilibili.lib.riskcontrol.a.f64341f = r0     // Catch: java.lang.Throwable -> L5b
        L63:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            r0 = r5
            com.bilibili.lib.riskcontrol.a.f64340e = r0     // Catch: java.lang.Throwable -> L83
            af0.j r0 = af0.j.f31144a     // Catch: java.lang.Throwable -> L83
            r1 = r5
            com.bilibili.lib.riskcontrol.RiskToken r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L83
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L87
            r0 = r6
            java.lang.String r0 = r0.getToken()     // Catch: java.lang.Throwable -> L83
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L8a
            goto L87
        L83:
            r6 = move-exception
            goto L96
        L87:
            java.lang.String r0 = ""
            r6 = r0
        L8a:
            r0 = r4
            monitor-exit(r0)
            r0 = r6
            return r0
        L8e:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L83
        L92:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L83
        L96:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.riskcontrol.a.b(int):java.lang.String");
    }

    public final void e(boolean z6) {
        synchronized (this) {
            C3208g.a().putInt("KEY_SHOWING", z6 ? 1 : 0);
        }
    }
}
