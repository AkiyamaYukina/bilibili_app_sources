package com.bilibili.upper.module.honour.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.studio.videoeditor.download.DownloadRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.honour.utils.a f113339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.honour.utils.a f113340c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f113338a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f113341d = new LinkedHashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/c$a.class */
    public static final class a implements CoroutineScope {

        /* JADX INFO: renamed from: com.bilibili.upper.module.honour.utils.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/c$a$a.class */
        public static final class C1228a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
            public final void handleException(CoroutineContext coroutineContext, Throwable th) {
                BLog.w("Upper MusicDownloadScope Coroutine", ExceptionsKt.stackTraceToString(th));
            }
        }

        @NotNull
        public final CoroutineContext getCoroutineContext() {
            return SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()).plus(new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key));
        }
    }

    public static final Object a(c cVar, String str, String str2, String str3, Continuation continuation) {
        cVar.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception())));
        } else if (cn.com.chinatelecom.account.api.d.m.b(str2.concat(str3))) {
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boxing.boxBoolean(true)));
            BLog.e("KingHonourDownloaderHelper", "file exist");
        } else {
            DownloadRequest.a aVar = new DownloadRequest.a();
            aVar.f109435b = str;
            aVar.f109436c = str2;
            aVar.f109437d = str3;
            aVar.f109439f = "bili_glory_of_king";
            DownloadRequest downloadRequestA = aVar.a();
            ConcurrentHashMap<Long, DownloadRequest> concurrentHashMap = UB0.a.f24586a;
            UB0.a.a(downloadRequestA).a(downloadRequestA, new d(cancellableContinuationImpl));
            ConcurrentHashMap<Long, DownloadRequest> concurrentHashMap2 = UB0.a.f24586a;
            concurrentHashMap2.put(Long.valueOf(downloadRequestA.taskId), downloadRequestA);
            UB0.a.f24587b.put(downloadRequestA.url, downloadRequestA);
            long j7 = downloadRequestA.taskId;
            UB0.a.a(concurrentHashMap2.get(Long.valueOf(j7))).b(j7);
            cVar.f113341d.put("downloadId", Boxing.boxLong(downloadRequestA.taskId));
            cVar.f113341d.put("downloadUrl", str);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final String b(c cVar, String str) {
        cVar.getClass();
        String strSubstring = "";
        if (str != null) {
            if (str.length() == 0) {
                strSubstring = "";
            } else {
                strSubstring = "";
                if (StringsKt.n(str, "/")) {
                    strSubstring = str.substring(StringsKt.D(str, "/", 0, 6) + 1);
                }
            }
        }
        return strSubstring;
    }

    public final void c() {
        this.f113339b = null;
        this.f113340c = null;
        Object obj = ((LinkedHashMap) this.f113341d).get("downloadId");
        if (obj instanceof Long) {
            ConcurrentHashMap<Long, DownloadRequest> concurrentHashMap = UB0.a.f24586a;
            long jLongValue = ((Number) obj).longValue();
            UB0.a.a(UB0.a.f24586a.get(Long.valueOf(jLongValue))).c(jLongValue);
        }
        this.f113341d.put("downloadUrl", "");
        ((LinkedHashMap) this.f113341d).clear();
        CoroutineScopeKt.cancel$default(this.f113338a, (CancellationException) null, 1, (Object) null);
    }
}
