package com.bilibili.studio.videocompile.data;

import android.app.Application;
import android.util.Log;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blkv.BLKV;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileDataManager.class */
public final class BVideoCompileDataManager implements OA0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f108694c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile BVideoCompileDataManager f108695d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public LinkedHashMap<String, d> f108696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d f108697b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileDataManager$a.class */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [com.bilibili.studio.videocompile.data.BVideoCompileDataManager] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5, types: [com.bilibili.studio.videocompile.data.BVideoCompileDataManager, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        @NotNull
        public final BVideoCompileDataManager a() {
            BVideoCompileDataManager bVideoCompileDataManager = BVideoCompileDataManager.f108695d;
            ?? r42 = bVideoCompileDataManager;
            if (bVideoCompileDataManager == null) {
                synchronized (this) {
                    BVideoCompileDataManager bVideoCompileDataManager2 = BVideoCompileDataManager.f108695d;
                    ?? r43 = bVideoCompileDataManager2;
                    if (bVideoCompileDataManager2 == null) {
                        ?? obj = new Object();
                        obj.f108696a = new LinkedHashMap<>(2);
                        BVideoCompileDataManager.f108695d = obj;
                        r43 = obj;
                    }
                    r42 = r43;
                }
            }
            return r42;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileDataManager$b.class */
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BVideoCompileDataManager f108698a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, BVideoCompileDataManager bVideoCompileDataManager) {
            super(key);
            this.f108698a = bVideoCompileDataManager;
        }

        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            String stackTraceString = Log.getStackTraceString(th);
            QA0.a.b(stackTraceString, null);
            OA0.b.b(this.f108698a, "readCancelData fail " + stackTraceString);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileDataManager$c.class */
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BVideoCompileDataManager f108699a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, BVideoCompileDataManager bVideoCompileDataManager) {
            super(key);
            this.f108699a = bVideoCompileDataManager;
        }

        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            String str = "saveCancelData fail" + Log.getStackTraceString(th);
            QA0.a.b(str, null);
            OA0.b.b(this.f108699a, str);
        }
    }

    public final void a() {
        synchronized (this) {
            OA0.b.c(this, "clear mData size is " + this.f108696a.size());
            Application application = BiliContext.application();
            if (application != null) {
                BLKV.getKvs$default(application, "BVideoCompileDataGroup", false, 0, 6, (Object) null).clear();
            }
            this.f108696a.clear();
        }
    }

    @Nullable
    public final d b() {
        synchronized (this) {
            Iterator<d> it = this.f108696a.values().iterator();
            if (!it.hasNext()) {
                return null;
            }
            return it.next();
        }
    }

    public final void c() {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(gA0.a.c), new b(CoroutineExceptionHandler.Key, this), (CoroutineStart) null, new BVideoCompileDataManager$reportCacheDataAndClean$1(this, null), 2, (Object) null);
    }

    public final void d(@NotNull BVideoCompileCancelData bVideoCompileCancelData, boolean z6) {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(z6 ? gA0.a.b : gA0.a.c), new c(CoroutineExceptionHandler.Key, this), (CoroutineStart) null, new BVideoCompileDataManager$saveCancelData$1(this, z6, bVideoCompileCancelData, null), 2, (Object) null);
    }

    @Override // OA0.a
    @NotNull
    public final String getClassTag() {
        return "BVideoCompileDataManager";
    }
}
