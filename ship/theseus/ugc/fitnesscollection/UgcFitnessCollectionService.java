package com.bilibili.ship.theseus.ugc.fitnesscollection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.w;
import com.bilibili.ship.theseus.ugc.x;
import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/fitnesscollection/UgcFitnessCollectionService.class */
@StabilityInferred(parameters = 0)
public final class UgcFitnessCollectionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final w f96911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final E f96912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f96913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f96914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f96915f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.fitnesscollection.UgcFitnessCollectionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/fitnesscollection/UgcFitnessCollectionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcFitnessCollectionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.fitnesscollection.UgcFitnessCollectionService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/fitnesscollection/UgcFitnessCollectionService$1$1.class */
        public static final class C08291 extends SuspendLambda implements Function2<x, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcFitnessCollectionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08291(UgcFitnessCollectionService ugcFitnessCollectionService, Continuation<? super C08291> continuation) {
                super(2, continuation);
                this.this$0 = ugcFitnessCollectionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08291 c08291 = new C08291(this.this$0, continuation);
                c08291.L$0 = obj;
                return c08291;
            }

            public final Object invoke(x xVar, Continuation<? super Unit> continuation) {
                return create(xVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    x xVar = (x) this.L$0;
                    Boolean boolBoxBoolean = xVar != null ? Boxing.boxBoolean(xVar.f98722a) : null;
                    Long lBoxLong = xVar != null ? Boxing.boxLong(xVar.f98723b) : null;
                    if (Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(true)) && !this.this$0.f96913d.h().f102988b) {
                        BLog.i("UgcFitnessCollectionService$1$1-invokeSuspend", "[theseus-ugc-UgcFitnessCollectionService$1$1-invokeSuspend] show season panel");
                        a aVar = this.this$0.f96914e;
                        aVar.getClass();
                        BuildersKt.launch$default(aVar.f96916a, (CoroutineContext) null, (CoroutineStart) null, new UgcFitnessCollectionRepository$showSeasonLayer$1(aVar, null), 3, (Object) null);
                        UgcFitnessCollectionService ugcFitnessCollectionService = this.this$0;
                        this.label = 1;
                        ugcFitnessCollectionService.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcFitnessCollectionService$cancelSeasonPanel$2(ugcFitnessCollectionService, lBoxLong, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass1(UgcFitnessCollectionService ugcFitnessCollectionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcFitnessCollectionService;
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
                UgcFitnessCollectionService ugcFitnessCollectionService = this.this$0;
                SharedFlow<x> sharedFlow = ugcFitnessCollectionService.f96911b.f98565g;
                C08291 c08291 = new C08291(ugcFitnessCollectionService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c08291, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.fitnesscollection.UgcFitnessCollectionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/fitnesscollection/UgcFitnessCollectionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final UgcFitnessCollectionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.fitnesscollection.UgcFitnessCollectionService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/fitnesscollection/UgcFitnessCollectionService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            boolean Z$0;
            int label;
            final UgcFitnessCollectionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcFitnessCollectionService ugcFitnessCollectionService, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcFitnessCollectionService;
                this.$$this$launch = coroutineScope;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    Job job = this.this$0.f96915f;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new UgcFitnessCollectionService$2$1$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcFitnessCollectionService ugcFitnessCollectionService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcFitnessCollectionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                UgcFitnessCollectionService ugcFitnessCollectionService = this.this$0;
                StateFlow<Boolean> stateFlow = ugcFitnessCollectionService.f96912c.f101462l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcFitnessCollectionService, coroutineScope, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public UgcFitnessCollectionService(@NotNull CoroutineScope coroutineScope, @NotNull w wVar, @NotNull E e7, @NotNull c cVar, @NotNull a aVar) {
        this.f96910a = coroutineScope;
        this.f96911b = wVar;
        this.f96912c = e7;
        this.f96913d = cVar;
        this.f96914e = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
