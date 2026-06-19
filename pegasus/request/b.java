package com.bilibili.pegasus.request;

import M3.A0;
import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.lib.oaid.MsaHelper;
import com.bilibili.lib.performance.BootOpt;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.pegasus.components.l0;
import com.google.gson.reflect.TypeToken;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kp0.C7782e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f78804a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f78805b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile String f78806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f78807d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile int f78808e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile int f78809f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Lazy f78810g = LazyKt.lazy(new A0(6));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f78811a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f78811a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.request.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/b$b.class */
    public static final class C0508b extends TypeToken<GeneralResponse<C7782e>> {
    }

    public static final f a(lp0.c cVar, String str, String str2, long j7, int i7, String str3, String str4) {
        return new f(cVar.f123309a, cVar.f123310b, i7, str3, str4, str, cVar.f123311c.getValue(), cVar.f123319l, cVar.f123320m, j7, cVar.f123312d, cVar.f123313e, cVar.f123314f, str2, cVar.f123317j, cVar.f123316i);
    }

    @Nullable
    public static final Unit b(@NotNull d dVar, @NotNull lp0.c cVar, @NotNull com.bilibili.gripper.main.g gVar) {
        String str;
        kp0.f fVar = cVar.f123315g;
        String strB = fVar != null ? fVar.b() : null;
        if (fVar != null) {
            String str2 = fVar.f122937c;
            str = str2;
            if (str2 == null) {
                str = "";
            }
        } else {
            str = null;
        }
        f fVarA = a(cVar, strB, str, fVar != null ? fVar.f122935a : 0L, !C0.b() ? 1 : 2, l0.f77078a, l0.f77080c.getValue());
        BootOpt.INSTANCE.record();
        fVarA.toString();
        BLog.v("ApiManager", "cacheIndexFeed: " + fVarA + " ");
        CoroutineScope coroutineScope = m.f78841e;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TMPCache$cache$1(fVarA, BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ApiManagerKt$cacheIndexFeed$job$1(fVarA, cVar, dVar, gVar, null), 3, (Object) null), null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull lp0.c r24, @org.jetbrains.annotations.NotNull com.bilibili.pegasus.request.i r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.request.b.c(lp0.c, com.bilibili.pegasus.request.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    public static Object d(int i7, String str, SuspendLambda suspendLambda, int i8) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        return BiliCallExtKt.getResult(((d) f78810g.getValue()).getInterestChoose(MsaHelper.getOaid(), str, i7).setParser(new Object()), suspendLambda);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    public static final void e(long j7, @Nullable String str, @Nullable String str2, @NotNull BiliApiDataCallback<C7782e> biliApiDataCallback) {
        ((d) f78810g.getValue()).getSecondInterestChoose(MsaHelper.getOaid(), j7, str, str2, (EnvironmentManager.getInstance().isFirstStart() && f78804a) ? 1L : 0L).setParser(new Object()).enqueue(biliApiDataCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v112, types: [com.bilibili.okretro.converter.IParser, com.bilibili.pegasus.request.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v117, types: [com.bilibili.pegasus.request.PegasusResponseTypeAdapter, com.google.gson.TypeAdapter, java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(@org.jetbrains.annotations.NotNull lp0.c r24, @org.jetbrains.annotations.NotNull com.bilibili.pegasus.request.i r25, @org.jetbrains.annotations.NotNull com.bilibili.pegasus.vm.C r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 1268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.request.b.f(lp0.c, com.bilibili.pegasus.request.i, com.bilibili.pegasus.vm.C, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final boolean g() {
        return EnvironmentManager.getInstance().isFirstStart() && f78804a;
    }
}
