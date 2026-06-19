package com.bilibili.ogv.infra.tempfile;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/tempfile/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f67942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lj0.a f67943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f67944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, a> f67945d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/tempfile/e$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final d f67946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public volatile Result<? extends File> f67947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Job f67948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f67949d;

        public a(@NotNull e eVar, d dVar) {
            this.f67949d = eVar;
            this.f67946a = dVar;
            this.f67948c = BuildersKt.launch$default(eVar.f67944c, Dispatchers.getIO(), (CoroutineStart) null, new TempFileManager$State$job$1(this, eVar, null), 2, (Object) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
            /*
                r6 = this;
                r0 = r7
                boolean r0 = r0 instanceof com.bilibili.ogv.infra.tempfile.TempFileManager$State$run$1
                if (r0 == 0) goto L25
                r0 = r7
                com.bilibili.ogv.infra.tempfile.TempFileManager$State$run$1 r0 = (com.bilibili.ogv.infra.tempfile.TempFileManager$State$run$1) r0
                r9 = r0
                r0 = r9
                int r0 = r0.label
                r8 = r0
                r0 = r8
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L25
                r0 = r9
                r1 = r8
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r9
                r7 = r0
                goto L2f
            L25:
                com.bilibili.ogv.infra.tempfile.TempFileManager$State$run$1 r0 = new com.bilibili.ogv.infra.tempfile.TempFileManager$State$run$1
                r1 = r0
                r2 = r6
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L2f:
                r0 = r7
                java.lang.Object r0 = r0.result
                r9 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.label
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L5a
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L50
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r9
                r7 = r0
                goto L89
            L50:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L5a:
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
                r9 = r0
                com.bilibili.ogv.infra.tempfile.TempFileManager$State$run$2 r0 = new com.bilibili.ogv.infra.tempfile.TempFileManager$State$run$2
                r1 = r0
                r2 = r6
                com.bilibili.ogv.infra.tempfile.e r2 = r2.f67949d
                r3 = r6
                r4 = 0
                r1.<init>(r2, r3, r4)
                r11 = r0
                r0 = r7
                r1 = 1
                r0.label = r1
                r0 = r9
                r1 = r11
                r2 = r7
                java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
                r9 = r0
                r0 = r9
                r7 = r0
                r0 = r9
                r1 = r10
                if (r0 != r1) goto L89
                r0 = r10
                return r0
            L89:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.tempfile.e.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public e(@NotNull File file, long j7) {
        this.f67942a = file;
        FileSystem fileSystem = FileSystem.SYSTEM;
        Pattern pattern = Lj0.a.f14687u;
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f67943b = new Lj0.a(fileSystem, file, j7, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        this.f67944c = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.f67945d = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.ogv.infra.tempfile.d r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ogv.infra.tempfile.TempFileManager$awaitTempFile$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ogv.infra.tempfile.TempFileManager$awaitTempFile$1 r0 = (com.bilibili.ogv.infra.tempfile.TempFileManager$awaitTempFile$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.ogv.infra.tempfile.TempFileManager$awaitTempFile$1 r0 = new com.bilibili.ogv.infra.tempfile.TempFileManager$awaitTempFile$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L66
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5c
            r0 = r7
            java.lang.Object r0 = r0.L$0
            com.bilibili.ogv.infra.tempfile.e$a r0 = (com.bilibili.ogv.infra.tempfile.e.a) r0
            r6 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L97
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            com.bilibili.ogv.infra.tempfile.e$a r0 = r0.b(r1)
            r0 = r5
            r1 = r6
            com.bilibili.ogv.infra.tempfile.e$a r0 = r0.b(r1)
            r6 = r0
            r0 = r6
            kotlinx.coroutines.Job r0 = r0.f67948c
            r10 = r0
            r0 = r7
            r1 = r6
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r7
            java.lang.Object r0 = r0.join(r1)
            r1 = r9
            if (r0 != r1) goto L97
            r0 = r9
            return r0
        L97:
            r0 = r6
            kotlin.Result<? extends java.io.File> r0 = r0.f67947b
            java.lang.Object r0 = r0.unbox-impl()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.tempfile.e.a(com.bilibili.ogv.infra.tempfile.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final a b(d dVar) {
        String strA = dVar.a();
        ConcurrentHashMap<String, a> concurrentHashMap = this.f67945d;
        a aVar = concurrentHashMap.get(strA);
        a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = new a(this, dVar);
            a aVarPutIfAbsent = concurrentHashMap.putIfAbsent(strA, aVar2);
            if (aVarPutIfAbsent != null) {
                aVar2 = aVarPutIfAbsent;
            }
        }
        return aVar2;
    }
}
