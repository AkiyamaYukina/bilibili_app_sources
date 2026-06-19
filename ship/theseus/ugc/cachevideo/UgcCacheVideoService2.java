package com.bilibili.ship.theseus.ugc.cachevideo;

import K3.m;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.view.d;
import java.util.List;
import javax.inject.Inject;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoService2.class */
@StabilityInferred(parameters = 0)
public final class UgcCacheVideoService2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f96354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f96355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f96356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f96357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<C6353o> f96358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f96359g;

    @NotNull
    public final d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final UgcCacheVideoDialogService f96360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f96361j = LazyKt.lazy(new m(6));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoService2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoService2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcCacheVideoService2 this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoService2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoService2$1$1.class */
        public static final class C08151 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UgcCacheVideoService2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08151(UgcCacheVideoService2 ugcCacheVideoService2, Continuation<? super C08151> continuation) {
                super(2, continuation);
                this.this$0 = ugcCacheVideoService2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08151(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcCacheVideoService2 ugcCacheVideoService2 = this.this$0;
                    this.label = 1;
                    ugcCacheVideoService2.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcCacheVideoService2$showDownload$2(ugcCacheVideoService2, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcCacheVideoService2 ugcCacheVideoService2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcCacheVideoService2;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UgcCacheVideoService2 ugcCacheVideoService2 = this.this$0;
                SharedFlow<Unit> sharedFlow = ugcCacheVideoService2.f96356d.f96364b;
                C08151 c08151 = new C08151(ugcCacheVideoService2, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c08151, this) == coroutine_suspended) {
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

    @Inject
    public UgcCacheVideoService2(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull b bVar, @NotNull List<Av0.a> list, @NotNull List<C6353o> list2, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull d dVar, @NotNull UgcCacheVideoDialogService ugcCacheVideoDialogService) {
        this.f96353a = coroutineScope;
        this.f96354b = fragmentActivity;
        this.f96355c = aVar;
        this.f96356d = bVar;
        this.f96357e = list;
        this.f96358f = list2;
        this.f96359g = unitedSeasonDetailRepository;
        this.h = dVar;
        this.f96360i = ugcCacheVideoDialogService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
