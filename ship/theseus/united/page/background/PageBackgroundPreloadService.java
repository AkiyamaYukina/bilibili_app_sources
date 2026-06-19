package com.bilibili.ship.theseus.united.page.background;

import M3.W;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService.class */
@StabilityInferred(parameters = 0)
public final class PageBackgroundPreloadService {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Lazy<Long> f99015l = LazyKt.lazy(new W(5));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f99017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f99018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BackgroundPlayService f99019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final h f99020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C7893a f99021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PreloadRepository f99022g;

    @Nullable
    public Job h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f99023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public b f99024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public GeminiCommonResolverParams f99025k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageBackgroundPreloadService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$1$1.class */
        public static final class C09471<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PageBackgroundPreloadService f99026a;

            public C09471(PageBackgroundPreloadService pageBackgroundPreloadService) {
                this.f99026a = pageBackgroundPreloadService;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
                /*
                    Method dump skipped, instruction units count: 267
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService.AnonymousClass1.C09471.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
            }

            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PageBackgroundPreloadService pageBackgroundPreloadService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pageBackgroundPreloadService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageBackgroundPreloadService pageBackgroundPreloadService = this.this$0;
                StateFlow<Boolean> stateFlow = pageBackgroundPreloadService.f99017b.f99007q;
                C09471 c09471 = new C09471(pageBackgroundPreloadService);
                this.label = 1;
                if (stateFlow.collect(c09471, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageBackgroundPreloadService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PageBackgroundPreloadService f99027a;

            public a(PageBackgroundPreloadService pageBackgroundPreloadService) {
                this.f99027a = pageBackgroundPreloadService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objA;
                PageBackgroundPreloadService pageBackgroundPreloadService = this.f99027a;
                PageBackgroundPlayRepository pageBackgroundPlayRepository = pageBackgroundPreloadService.f99017b;
                pageBackgroundPlayRepository.getClass();
                if (((Boolean) com.bilibili.ship.theseus.united.page.preload.d.f102469a.getValue()).booleanValue() && pageBackgroundPlayRepository.d()) {
                    defpackage.a.b("[theseus-united-PageBackgroundPreloadService$2$1-emit] ", com.bilibili.app.comm.bh.x5.b.a("AI relates loaded, check if need preload :", pageBackgroundPreloadService.f99025k == null), "PageBackgroundPreloadService$2$1-emit");
                    if (pageBackgroundPreloadService.f99025k == null) {
                        objA = PageBackgroundPreloadService.a(pageBackgroundPreloadService, continuation);
                        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objA = Unit.INSTANCE;
                        }
                    } else {
                        objA = Unit.INSTANCE;
                    }
                } else {
                    objA = Unit.INSTANCE;
                }
                return objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PageBackgroundPreloadService pageBackgroundPreloadService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pageBackgroundPreloadService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageBackgroundPreloadService pageBackgroundPreloadService = this.this$0;
                SharedFlow<Unit> sharedFlow = pageBackgroundPreloadService.f99017b.f99009s;
                a aVar = new a(pageBackgroundPreloadService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public PageBackgroundPreloadService(@NotNull CoroutineScope coroutineScope, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull BackgroundPlayService backgroundPlayService, @NotNull h hVar, @NotNull C7893a c7893a, @NotNull PreloadRepository preloadRepository) {
        this.f99016a = coroutineScope;
        this.f99017b = pageBackgroundPlayRepository;
        this.f99018c = iPlayerCoreService;
        this.f99019d = backgroundPlayService;
        this.f99020e = hVar;
        this.f99021f = c7893a;
        this.f99022g = preloadRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService.a(com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$releasePreload$1
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$releasePreload$1 r0 = (com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$releasePreload$1) r0
            r14 = r0
            r0 = r14
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r14
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r14
            r8 = r0
        L26:
            goto L36
        L29:
            com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$releasePreload$1 r0 = new com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$releasePreload$1
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
            goto L26
        L36:
            r0 = r8
            java.lang.Object r0 = r0.result
            r15 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r14 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L61
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r15
            kotlin.ResultKt.throwOnFailure(r0)
            goto L96
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r15
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            com.bilibili.app.gemini.base.player.GeminiCommonResolverParams r0 = r0.f99025k
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L96
            r0 = r15
            long r0 = r0.getAvid()
            r12 = r0
            r0 = r15
            long r0 = r0.getCid()
            r10 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r7
            com.bilibili.ship.theseus.united.page.preload.PreloadRepository r0 = r0.f99022g
            r1 = r12
            r2 = r10
            r3 = r8
            java.lang.Object r0 = r0.c(r1, r2, r3)
            r1 = r14
            if (r0 != r1) goto L96
            r0 = r14
            return r0
        L96:
            r0 = r7
            r1 = 0
            r0.f99025k = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
