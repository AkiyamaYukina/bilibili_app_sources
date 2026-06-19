package com.bilibili.ship.theseus.united.page.preload;

import L3.k0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.keel.player.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayer.preload.repository.e;
import tv.danmaku.biliplayerv2.PlayerParamsV2;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/preload/PreloadRepository.class */
@StabilityInferred(parameters = 0)
public final class PreloadRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f102456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerParamsV2 f102457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f102458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f102459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f102460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<GeminiCommonPlayableParams> f102461g = new LinkedList();

    @NotNull
    public final Lazy h = LazyKt.lazy(new k0(7));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.preload.PreloadRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/preload/PreloadRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PreloadRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PreloadRepository preloadRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = preloadRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                if (((Boolean) d.f102469a.getValue()).booleanValue()) {
                    PreloadRepository preloadRepository = this.this$0;
                    if (!preloadRepository.f102461g.isEmpty()) {
                        BLog.i("PreloadRepository-releasePreload", "[theseus-united-PreloadRepository-releasePreload] Release preload");
                        ((e) preloadRepository.h.getValue()).h("united_preload");
                    }
                }
                throw th;
            }
        }
    }

    @Inject
    public PreloadRepository(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull PlayerParamsV2 playerParamsV2, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull BiliAccounts biliAccounts, @NotNull h hVar) {
        this.f102455a = coroutineScope;
        this.f102456b = iPlayerCoreService;
        this.f102457c = playerParamsV2;
        this.f102458d = cVar;
        this.f102459e = biliAccounts;
        this.f102460f = hVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r9, long r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.preload.PreloadRepository.a(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final GeminiCommonPlayableParams b(long j7, long j8) {
        Object next;
        Iterator<T> it = this.f102461g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GeminiCommonPlayableParams geminiCommonPlayableParams = (GeminiCommonPlayableParams) next;
            if (geminiCommonPlayableParams.getAvid() == j7 && geminiCommonPlayableParams.getCid() == j8) {
                break;
            }
        }
        return (GeminiCommonPlayableParams) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r8, long r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.preload.PreloadRepository.c(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
