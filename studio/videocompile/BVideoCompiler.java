package com.bilibili.studio.videocompile;

import LA0.d;
import OA0.a;
import QA0.b;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;
import com.bilibili.studio.videocompile.data.BVideoCompileDataManager;
import com.bilibili.studio.videocompile.data.d;
import com.bilibili.studio.videocompile.define.BVideoCompileBizConfig;
import com.bilibili.studio.videocompile.define.BVideoCompileCancelFrom;
import com.bilibili.studio.videocompile.define.BVideoCompileContext;
import com.bilibili.studio.videocompile.internal.sdk.meicam.g;
import com.bilibili.studio.videocompile.internal.strategy.H265Strategy;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/BVideoCompiler.class */
public final class BVideoCompiler implements a {

    @NotNull
    public static final BVideoCompiler INSTANCE = new BVideoCompiler();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f108692a = "BVideoCompiler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f108693b;

    /* JADX INFO: renamed from: com.bilibili.studio.videocompile.BVideoCompiler$init$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/BVideoCompiler$init$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Application $application;
        final IBVideoCompileGlobalSetting $settingConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Application application, IBVideoCompileGlobalSetting iBVideoCompileGlobalSetting, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$application = application;
            this.$settingConfig = iBVideoCompileGlobalSetting;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$application, this.$settingConfig, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Context applicationContext = this.$application.getApplicationContext();
                String buvid = this.$settingConfig.getBuvid();
                this.label = 1;
                if (H265Strategy.a(applicationContext, buvid, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void addCompileCallback(@NotNull String str, @NotNull IBVideoCompileCallback iBVideoCompileCallback) {
        d dVar = d.f14467l;
        if (dVar != null) {
            dVar.a(str, iBVideoCompileCallback);
            return;
        }
        QA0.a.b("please call BVideoCompiler.init() first!!!", null);
        IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
        if (iBVideoCompileLogger != null) {
            iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
        }
        throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
    }

    @JvmStatic
    public static final void cancel() {
        if (INSTANCE.a("cancel")) {
            QA0.d.a();
            d dVar = d.f14467l;
            if (dVar != null) {
                dVar.b();
                return;
            }
            QA0.a.b("please call BVideoCompiler.init() first!!!", null);
            IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
            if (iBVideoCompileLogger != null) {
                iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
            }
            throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
        }
    }

    @JvmStatic
    @Nullable
    public static final com.bilibili.studio.videocompile.data.d getData() {
        return BVideoCompileDataManager.f108694c.a().b();
    }

    @JvmStatic
    @Nullable
    public static final String getOutputDir() {
        if (!INSTANCE.a("release")) {
            return null;
        }
        d dVar = d.f14467l;
        if (dVar != null) {
            return dVar.d().getOutputFileDir();
        }
        QA0.a.b("please call BVideoCompiler.init() first!!!", null);
        IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
        if (iBVideoCompileLogger != null) {
            iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
        }
        throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
    }

    @JvmStatic
    public static final void init(@NotNull Application application, @NotNull IBVideoCompileGlobalSetting iBVideoCompileGlobalSetting) {
        d dVar;
        synchronized (BVideoCompiler.class) {
            try {
                if (f108693b) {
                    OA0.b.c(INSTANCE, "sdk has been initialized just return");
                    return;
                }
                BVideoCompiler bVideoCompiler = INSTANCE;
                OA0.b.c(bVideoCompiler, "init start");
                b.f19715a = iBVideoCompileGlobalSetting.getLogger();
                QA0.a.f19713b = iBVideoCompileGlobalSetting.getDataReport();
                d.a aVar = d.f14466k;
                Context applicationContext = application.getApplicationContext();
                synchronized (aVar) {
                    d dVar2 = d.f14467l;
                    dVar = dVar2;
                    if (dVar2 == null) {
                        dVar = new d();
                        d.f14467l = dVar;
                    }
                }
                dVar.f14468a = applicationContext.getApplicationContext();
                dVar.f14469b = iBVideoCompileGlobalSetting;
                BVideoCompileDataManager.f108694c.a().c();
                BuildersKt.async$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(application, iBVideoCompileGlobalSetting, null), 3, (Object) null);
                ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new PA0.b(application));
                f108693b = true;
                OA0.b.c(bVideoCompiler, "init success");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JvmStatic
    public static final boolean isInit() {
        return f108693b;
    }

    @JvmStatic
    public static final boolean isVideoCompiling() {
        boolean zB = false;
        if (!INSTANCE.a("isVideoCompiling")) {
            return false;
        }
        QA0.d.a();
        d dVar = d.f14467l;
        if (dVar != null) {
            g gVar = dVar.f14473f;
            if (gVar != null) {
                zB = gVar.b();
            }
            return zB;
        }
        QA0.a.b("please call BVideoCompiler.init() first!!!", null);
        IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
        if (iBVideoCompileLogger != null) {
            iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
        }
        throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
    }

    @JvmStatic
    public static final void onCrashHandleStart(boolean z6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (INSTANCE.a("onCrashHandleStart")) {
            d dVar = d.f14467l;
            if (dVar == null) {
                QA0.a.b("please call BVideoCompiler.init() first!!!", null);
                IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
                if (iBVideoCompileLogger != null) {
                    iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
                }
                throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
            }
            com.bilibili.studio.videocompile.data.d dVarB = BVideoCompileDataManager.f108694c.a().b();
            if (dVarB == null) {
                OA0.b.c(dVar, "onCrashHandleStart techData is null just return");
                return;
            }
            if (dVarB.f108720a.f108736f) {
                OA0.b.c(dVar, "onCrashHandleStart techData hasResult just return");
                return;
            }
            g gVar = dVar.f14473f;
            if (gVar == null || !gVar.b()) {
                OA0.b.c(dVar, "onCrashHandleStart is not video-compiling just return");
                return;
            }
            int i7 = z6 ? 307 : ((str == null || !StringsKt.n(str, "OutOfMemoryError")) && (str2 == null || !StringsKt.n(str2, "OutOfMemoryError"))) ? 306 : 308;
            d.c cVar = new d.c();
            cVar.f108743f = str4;
            dVarB.f108724e = cVar;
            StringBuilder sbA = G0.b.a("errorType : ", str, " errorMessage : ", str2, " errorStack : ");
            sbA.append(str3);
            dVar.e().g(i7, sbA.toString(), dVarB);
        }
    }

    @JvmStatic
    public static final void release() {
        if (INSTANCE.a("release")) {
            QA0.d.a();
            LA0.d dVar = LA0.d.f14467l;
            if (dVar == null) {
                QA0.a.b("please call BVideoCompiler.init() first!!!", null);
                IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
                if (iBVideoCompileLogger != null) {
                    iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
                }
                throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
            }
            OA0.b.a(dVar, "release:");
            dVar.f14470c.clear();
            dVar.g(BVideoCompileCancelFrom.BizRelease, true);
            g gVar = dVar.f14473f;
            if (gVar != null) {
                gVar.d(true);
                gVar.f108784f.set(false);
                gVar.f108785g = false;
                StreamingContext streamingContext = gVar.f108780b;
                streamingContext.setCompileFloatProgressCallback(null);
                streamingContext.setHardwareErrorCallback(null);
                streamingContext.setCompileCallback3(null);
                streamingContext.setCompileCallback4(null);
            }
            dVar.f14473f = null;
        }
    }

    @JvmStatic
    public static final void removeCompileCallback(@NotNull String str, @NotNull IBVideoCompileCallback iBVideoCompileCallback) {
        LA0.d dVar = LA0.d.f14467l;
        if (dVar == null) {
            QA0.a.b("please call BVideoCompiler.init() first!!!", null);
            IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
            if (iBVideoCompileLogger != null) {
                iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
            }
            throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
        }
        ConcurrentLinkedQueue<IBVideoCompileCallback> concurrentLinkedQueue = dVar.f14470c.get(str);
        if (concurrentLinkedQueue == null || !concurrentLinkedQueue.contains(iBVideoCompileCallback)) {
            return;
        }
        concurrentLinkedQueue.remove(iBVideoCompileCallback);
    }

    @JvmStatic
    public static final void removeCompileParams(@NotNull String str) {
        LA0.d dVar = LA0.d.f14467l;
        if (dVar != null) {
            dVar.f14471d.put(str, null);
            return;
        }
        QA0.a.b("please call BVideoCompiler.init() first!!!", null);
        IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
        if (iBVideoCompileLogger != null) {
            iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
        }
        throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
    }

    @JvmStatic
    @NotNull
    public static final String start(@NotNull BVideoCompileContext bVideoCompileContext, @NotNull BVideoCompileBizConfig bVideoCompileBizConfig, @NotNull IBVideoCompileCallback iBVideoCompileCallback) {
        QA0.d.a();
        LA0.d dVar = LA0.d.f14467l;
        if (dVar != null) {
            return dVar.i(f108693b, bVideoCompileContext, bVideoCompileBizConfig, iBVideoCompileCallback);
        }
        QA0.a.b("please call BVideoCompiler.init() first!!!", null);
        IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
        if (iBVideoCompileLogger != null) {
            iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
        }
        throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @JvmStatic
    public static final void start(@NotNull String str, @NotNull IBVideoCompileCallback iBVideoCompileCallback) throws NoWhenBranchMatchedException {
        QA0.d.a();
        LA0.d dVar = LA0.d.f14467l;
        if (dVar == null) {
            QA0.a.b("please call BVideoCompiler.init() first!!!", null);
            IBVideoCompileLogger iBVideoCompileLogger = b.f19715a;
            if (iBVideoCompileLogger != null) {
                iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
            }
            throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
        }
        boolean z6 = f108693b;
        Pair<BVideoCompileContext, BVideoCompileBizConfig> pair = dVar.f14471d.get(str);
        if (pair != null) {
            dVar.i(z6, (BVideoCompileContext) pair.getFirst(), (BVideoCompileBizConfig) pair.getSecond(), iBVideoCompileCallback);
        }
    }

    public final boolean a(String str) {
        if (f108693b) {
            return true;
        }
        OA0.b.c(this, str.concat(" sdk uninitialized just return"));
        return false;
    }

    @Override // OA0.a
    @NotNull
    public String getClassTag() {
        return f108692a;
    }
}
