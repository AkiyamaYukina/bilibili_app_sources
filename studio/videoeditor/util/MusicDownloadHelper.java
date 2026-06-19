package com.bilibili.studio.videoeditor.util;

import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import com.bilibili.studio.videoeditor.download.DownloadRequest;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/MusicDownloadHelper.class */
public final class MusicDownloadHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f110208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.aistory.manager.r f110209b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/MusicDownloadHelper$a.class */
    public interface a {
        void a(long j7, @Nullable String str, @Nullable String str2);
    }

    public static final Object a(MusicDownloadHelper musicDownloadHelper, String str, String str2, String str3, Continuation continuation) {
        musicDownloadHelper.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception())));
        } else {
            DownloadRequest.a aVar = new DownloadRequest.a();
            aVar.f109435b = str;
            aVar.f109436c = str2;
            aVar.f109437d = str3;
            DownloadRequest downloadRequestA = aVar.a();
            UB0.b.a(downloadRequestA, new N(cancellableContinuationImpl));
            UB0.b.f(downloadRequestA.taskId);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r3
  0x0032: PHI (r3v2 java.io.File) = (r3v1 java.io.File), (r3v4 java.io.File) binds: [B:6:0x001f, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String b(com.bilibili.studio.videoeditor.util.MusicDownloadHelper r3) {
        /*
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r6 = r0
            r0 = 0
            r4 = r0
            r0 = r6
            if (r0 != 0) goto L14
            r0 = r4
            r3 = r0
            goto L3d
        L14:
            r0 = r6
            java.lang.String r1 = android.os.Environment.DIRECTORY_MUSIC
            java.io.File r0 = r0.getExternalFilesDir(r1)
            r5 = r0
            r0 = r5
            r3 = r0
            r0 = r5
            if (r0 != 0) goto L32
            r0 = r6
            java.io.File r0 = r0.getCacheDir()
            r5 = r0
            r0 = r5
            r3 = r0
            r0 = r5
            if (r0 != 0) goto L32
            r0 = r4
            r3 = r0
            goto L3d
        L32:
            r0 = r3
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = java.io.File.separator
            java.lang.String r0 = G.p.a(r0, r1)
            r3 = r0
        L3d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.MusicDownloadHelper.b(com.bilibili.studio.videoeditor.util.MusicDownloadHelper):java.lang.String");
    }

    public static final Object c(MusicDownloadHelper musicDownloadHelper, long j7, Continuation continuation) {
        musicDownloadHelper.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        String accessKey = BiliAccounts.get(BiliContext.application()).getAccessKey();
        HashMap map = new HashMap();
        map.put(EditCustomizeSticker.TAG_MID, String.valueOf(BiliAccounts.get(BiliContext.application()).mid()));
        map.put("songid", String.valueOf(j7));
        map.put("privilege", "1");
        map.put("quality", "1");
        map.put("platform", Constant.SDK_OS);
        TC0.h.b(accessKey, map, new O(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final void d(@NotNull MusicInfo musicInfo) {
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new MusicDownloadHelper$downloadMusic$1(musicInfo, this, null), 3, (Object) null);
    }
}
