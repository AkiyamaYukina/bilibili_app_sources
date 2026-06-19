package com.bilibili.ship.theseus.ogv.ep;

import androidx.compose.runtime.snapshots.z;
import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import ev0.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvInMediaPlayService$collectCastScreenAction$2.class */
final class OgvInMediaPlayService$collectCastScreenAction$2 extends SuspendLambda implements Function2<TheseusCastScreenRepository.a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvInMediaPlayService$collectCastScreenAction$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvInMediaPlayService$collectCastScreenAction$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusCastScreenRepository.a $action;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvInMediaPlayService$collectCastScreenAction$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvInMediaPlayService$collectCastScreenAction$2$1$1.class */
        public static final class C06841 extends SuspendLambda implements Function2<Lifecycle.State, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C06841(Continuation<? super C06841> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06841 c06841 = new C06841(continuation);
                c06841.L$0 = obj;
                return c06841;
            }

            public final Object invoke(Lifecycle.State state, Continuation<? super Boolean> continuation) {
                return create(state, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((Lifecycle.State) this.L$0) == Lifecycle.State.RESUMED);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, TheseusCastScreenRepository.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$action = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$action, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Lifecycle.State> currentStateFlow = this.this$0.f92165i.getCurrentStateFlow();
                C06841 c06841 = new C06841(null);
                this.label = 1;
                if (FlowKt.first(currentStateFlow, c06841, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OgvEpisode ogvEpisodeC = this.this$0.f92161d.c();
            if (ogvEpisodeC == null) {
                BLog.w("OgvInMediaPlayService$collectCastScreenAction$2$1-invokeSuspend", "[theseus-ogv-OgvInMediaPlayService$collectCastScreenAction$2$1-invokeSuspend] quit cast screen ,but current ep is null, idle ep", (Throwable) null);
                this.this$0.f92161d.p(OgvCurrentEpisodeRepository.b.C0683b.f92126a);
            } else {
                defpackage.a.b("[theseus-ogv-OgvInMediaPlayService$collectCastScreenAction$2$1-invokeSuspend] ", "quit cast screen, switch to ep epid:" + ogvEpisodeC.f93555a + ", cid:" + ogvEpisodeC.f93561g, "OgvInMediaPlayService$collectCastScreenAction$2$1-invokeSuspend");
                this.this$0.f92161d.j(ogvEpisodeC, new i(((TheseusCastScreenRepository.a.b) this.$action).f99135a, false), null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvInMediaPlayService$collectCastScreenAction$2(c cVar, Continuation<? super OgvInMediaPlayService$collectCastScreenAction$2> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvInMediaPlayService$collectCastScreenAction$2 ogvInMediaPlayService$collectCastScreenAction$2 = new OgvInMediaPlayService$collectCastScreenAction$2(this.this$0, continuation);
        ogvInMediaPlayService$collectCastScreenAction$2.L$0 = obj;
        return ogvInMediaPlayService$collectCastScreenAction$2;
    }

    public final Object invoke(TheseusCastScreenRepository.a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        OgvEpisode ogvEpisodeH;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TheseusCastScreenRepository.a aVar = (TheseusCastScreenRepository.a) this.L$0;
        if (aVar instanceof TheseusCastScreenRepository.a.C0954a) {
            if (this.this$0.f92165i.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                OgvEpisode ogvEpisodeC = this.this$0.f92161d.c();
                ProjectionItemData projectionItemData = ((TheseusCastScreenRepository.a.C0954a) aVar).f99134a;
                if (projectionItemData != null) {
                    long j7 = projectionItemData.f63478e;
                    if (j7 > 0) {
                        ogvEpisodeH = this.this$0.f92162e.i(j7);
                    } else {
                        long j8 = projectionItemData.f63477d;
                        ogvEpisodeH = j8 > 0 ? this.this$0.f92162e.h(j8) : null;
                    }
                    if (ogvEpisodeH != null) {
                        this.this$0.f92161d.a(ogvEpisodeH);
                    } else {
                        long j9 = projectionItemData.f63477d;
                        long j10 = projectionItemData.f63478e;
                        StringBuilder sbA = z.a(j9, "Cannot find episode for cast screen data cid: ", "!, epid: ");
                        sbA.append(j10);
                        f.a("[theseus-ogv-OgvInMediaPlayService$collectCastScreenAction$2-invokeSuspend] ", sbA.toString(), "OgvInMediaPlayService$collectCastScreenAction$2-invokeSuspend", (Throwable) null);
                    }
                } else if (ogvEpisodeC != null) {
                    this.this$0.f92161d.a(ogvEpisodeC);
                } else {
                    BLog.w("OgvInMediaPlayService$collectCastScreenAction$2-invokeSuspend", "[theseus-ogv-OgvInMediaPlayService$collectCastScreenAction$2-invokeSuspend] current ep is null, do nothing", (Throwable) null);
                }
            } else {
                BLog.i("OgvInMediaPlayService$collectCastScreenAction$2-invokeSuspend", "[theseus-ogv-OgvInMediaPlayService$collectCastScreenAction$2-invokeSuspend] lifecycle.currentState is less than RESUMED [Enter]");
            }
        } else {
            if (!(aVar instanceof TheseusCastScreenRepository.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar = this.this$0;
            BuildersKt.launch$default(cVar.f92158a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(cVar, aVar, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
