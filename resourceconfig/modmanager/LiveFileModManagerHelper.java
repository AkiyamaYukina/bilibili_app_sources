package com.bilibili.resourceconfig.modmanager;

import Js0.a;
import androidx.compose.runtime.I0;
import androidx.compose.ui.input.pointer.k;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveFileModManagerHelper.class */
public final class LiveFileModManagerHelper {

    @NotNull
    public static final LiveFileModManagerHelper INSTANCE = new LiveFileModManagerHelper();

    @NotNull
    public static final String LIVE_CNY_VOICE_OFFLINE_MOD_NAME = "cny_voice";

    @NotNull
    public static final String LIVE_CNY_VOICE_OFFLINE_MOD_NAME_C = "_c";

    @NotNull
    public static final String LIVE_CNY_VOICE_OFFLINE_POOL_NAME = "feOffline";

    @NotNull
    public static final String TAG = "LiveFileModManagerHelper";

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkModResource$default(LiveFileModManagerHelper liveFileModManagerHelper, String str, Function0 function0, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            function0 = null;
        }
        liveFileModManagerHelper.checkModResource(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFilePath$default(LiveFileModManagerHelper liveFileModManagerHelper, String str, String str2, Function1 function1, Function0 function0, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            function0 = new a(0);
        }
        liveFileModManagerHelper.getFilePath(str, str2, function1, function0);
    }

    public final void checkModResource(@NotNull String str, @Nullable Function0<Unit> function0) {
        if (ModResourceClient.getInstance().get(BiliContext.application(), "live", str).isAvailable()) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            ModResourceClient.getInstance().update(BiliContext.application(), I0.a("live", str, true), (ModResourceClient.OnUpdateCallback) null);
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.lib.mod.ModResourceClient$OnUpdateCallback, java.lang.Object] */
    public final void checkVoiceModResource(long j7) {
        String strA = k.a(j7, LIVE_CNY_VOICE_OFFLINE_MOD_NAME, LIVE_CNY_VOICE_OFFLINE_MOD_NAME_C);
        BLog.i(TAG, "checkVoiceModResource modName = " + strA);
        ModResourceClient.getInstance().update(BiliContext.application(), new ModUpdateRequest.Builder(LIVE_CNY_VOICE_OFFLINE_POOL_NAME, strA).isImmediate(true).build(), (ModResourceClient.OnUpdateCallback) new Object());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAssetsFilePath(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.resourceconfig.modmanager.LiveFileModManagerHelper.getAssetsFilePath(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getFilePath(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r9) {
        /*
            r5 = this;
            com.bilibili.lib.mod.ModResourceClient r0 = com.bilibili.lib.mod.ModResourceClient.getInstance()
            android.app.Application r1 = com.bilibili.base.BiliContext.application()
            java.lang.String r2 = "live"
            r3 = r6
            com.bilibili.lib.mod.ModResource r0 = r0.get(r1, r2, r3)
            r1 = r7
            java.io.File r0 = r0.retrieveFile(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L20
            r0 = r6
            java.lang.String r0 = r0.getAbsolutePath()
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L23
        L20:
            java.lang.String r0 = ""
            r6 = r0
        L23:
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto L37
            r0 = r9
            java.lang.Object r0 = r0.invoke()
            goto L4a
        L37:
            java.lang.String r0 = "LiveFileModManagerHelper"
            java.lang.String r1 = "getFilePath: "
            r2 = r6
            java.lang.String r1 = r1.concat(r2)
            tv.danmaku.android.log.BLog.i(r0, r1)
            r0 = r8
            r1 = r6
            java.lang.Object r0 = r0.invoke(r1)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.resourceconfig.modmanager.LiveFileModManagerHelper.getFilePath(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }

    public final boolean hasFile(@NotNull String str, @NotNull String str2) {
        return ModResourceClient.getInstance().get(BiliContext.application(), "live", str).retrieveFile(str2) != null;
    }

    public final void synRes(@NotNull String str) {
        ModResourceClient.getInstance().update(BiliContext.application(), I0.a("live", str, true), (ModResourceClient.OnUpdateCallback) null);
    }
}
