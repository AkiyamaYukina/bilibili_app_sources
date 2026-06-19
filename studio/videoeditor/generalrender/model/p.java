package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import M3.C2610q;
import android.app.Activity;
import com.bilibili.lib.okdownloader.BiliDownloader;
import com.bilibili.lib.okdownloader.DownloadRequest;
import com.bilibili.lib.okdownloader.TaskFactory;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo;
import com.bilibili.studio.videoeditor.generalrender.model.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/p.class */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy<p> f109641c = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new C2610q(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f109642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SA0.b f109643b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/p$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f109644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f109645b;

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i7) {
            this(0, null);
        }

        public a(int i7, @Nullable String str) {
            this.f109644a = i7;
            this.f109645b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f109644a == aVar.f109644a && Intrinsics.areEqual(this.f109645b, aVar.f109645b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f109644a);
            String str = this.f109645b;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DownloadResourceWrapper(errorCode=");
            sb.append(this.f109644a);
            sb.append(", errorMessage=");
            return C8770a.a(sb, this.f109645b, ")");
        }
    }

    public static void b(@NotNull CancellableContinuationImpl cancellableContinuationImpl, a aVar, @NotNull GRResourceInfo gRResourceInfo, @NotNull InterfaceC2297a interfaceC2297a) {
        Object obj;
        try {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(aVar));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, (Throwable) null, 1, (Object) null);
            interfaceC2297a.a(k.g(gRResourceInfo, -600, th2.getMessage(), null, 56));
            M.b("resumeCatchException", th2.getMessage(), "GRUrlDownloadManager");
        }
    }

    public final Object a(Activity activity, GRResourceInfo gRResourceInfo, InterfaceC2297a interfaceC2297a, String str, SuspendLambda suspendLambda) {
        List list;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(suspendLambda), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new q(cancellableContinuationImpl));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = gRResourceInfo.getHash();
        TaskFactory taskFactory = BiliDownloader.Companion.get(activity);
        String source = gRResourceInfo.getSource();
        String str2 = source;
        if (source == null) {
            str2 = "";
        }
        DownloadRequest downloadRequestCreate = taskFactory.create(str2, "studio_videoeditor");
        if (str != null && str.length() != 0) {
            downloadRequestCreate.addHeader("Range", "bytes=".concat(str));
            String str3 = f.f109601c;
            objectRef.element = B0.a.a(str, "-", gRResourceInfo.getHash());
        }
        String str4 = f.f109601c;
        File fileC = f.a.c(activity, gRResourceInfo);
        String absolutePath = fileC != null ? fileC.getAbsolutePath() : null;
        BLog.i("GRUrlDownloadManager", "innerDownload:" + Thread.currentThread() + " url:" + gRResourceInfo.getSource() + " it:" + cancellableContinuationImpl.hashCode() + " dir:" + absolutePath);
        SA0.b bVar = this.f109643b;
        if (bVar != null) {
            String str5 = (String) objectRef.element;
            r rVar = new r(gRResourceInfo, cancellableContinuationImpl, absolutePath, this, interfaceC2297a, objectRef);
            if (absolutePath == null || absolutePath.length() == 0 || str5 == null || str5.length() == 0) {
                rVar.onError(CaptureSchema.OLD_INVALID_ID_STRING, CollectionsKt.mutableListOf(new Integer[]{-1}), 0L, 0L);
            } else {
                String strConcat = absolutePath.concat(str5);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar.f22752a;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                if (concurrentHashMap == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mObservers");
                    concurrentHashMap2 = null;
                }
                if (concurrentHashMap2.containsKey(strConcat)) {
                    ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) bVar.f22752a;
                    ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                    if (concurrentHashMap3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mObservers");
                        concurrentHashMap4 = null;
                    }
                    list = (List) concurrentHashMap4.get(strConcat);
                    BLog.v("BDownloader", "Task(" + strConcat + ") already exits, add observer: " + (list.size() + 1));
                } else {
                    BLog.v("BDownloader", "Trigger request: " + strConcat);
                    BLog.d("BDownloader", "add:" + Thread.currentThread() + " request" + downloadRequestCreate.hashCode() + " downloadListener" + rVar.hashCode());
                    ArrayList arrayList = new ArrayList();
                    downloadRequestCreate.fileName(str5);
                    downloadRequestCreate.into(absolutePath);
                    downloadRequestCreate.addListener(new SA0.a(arrayList, downloadRequestCreate, bVar, strConcat)).build().enqueue();
                    list = arrayList;
                }
                list.add(rVar);
                ConcurrentHashMap concurrentHashMap5 = (ConcurrentHashMap) bVar.f22752a;
                if (concurrentHashMap5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mObservers");
                    concurrentHashMap5 = null;
                }
                concurrentHashMap5.put(strConcat, list);
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return result;
    }
}
