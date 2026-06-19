package com.bilibili.ship.theseus.ugc.play;

import androidx.compose.runtime.snapshots.z;
import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import ev0.i;
import java.util.Iterator;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$collectCastScreenAction$2.class */
final class UGCPlaybackRepository$collectCastScreenAction$2 extends SuspendLambda implements Function2<TheseusCastScreenRepository.a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final UGCPlaybackRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$collectCastScreenAction$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$collectCastScreenAction$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusCastScreenRepository.a $action;
        int label;
        final UGCPlaybackRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$collectCastScreenAction$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$collectCastScreenAction$2$1$1.class */
        public static final class C09041 extends SuspendLambda implements Function2<Lifecycle.State, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C09041(Continuation<? super C09041> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09041 c09041 = new C09041(continuation);
                c09041.L$0 = obj;
                return c09041;
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
        public AnonymousClass1(UGCPlaybackRepository uGCPlaybackRepository, TheseusCastScreenRepository.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCPlaybackRepository;
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
                StateFlow<Lifecycle.State> currentStateFlow = this.this$0.f98071p.getCurrentStateFlow();
                C09041 c09041 = new C09041(null);
                this.label = 1;
                if (FlowKt.first(currentStateFlow, c09041, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Av0.a aVarC = this.this$0.c();
            if (aVarC == null) {
                BLog.w("UGCPlaybackRepository$collectCastScreenAction$2$1-invokeSuspend", "[theseus-ugc-UGCPlaybackRepository$collectCastScreenAction$2$1-invokeSuspend] quit cast screen ,but current ep is null, idle ep", (Throwable) null);
                this.this$0.i(UGCPlaybackRepository.a.b.f98079a);
            } else {
                defpackage.a.b("[theseus-ugc-UGCPlaybackRepository$collectCastScreenAction$2$1-invokeSuspend] ", "quit cast screen, switch to ep avid:" + aVarC.f590a + ", cid:" + aVarC.f591b, "UGCPlaybackRepository$collectCastScreenAction$2$1-invokeSuspend");
                this.this$0.f(aVarC, new i(((TheseusCastScreenRepository.a.b) this.$action).f99135a, false), null, 0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCPlaybackRepository$collectCastScreenAction$2(UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super UGCPlaybackRepository$collectCastScreenAction$2> continuation) {
        super(2, continuation);
        this.this$0 = uGCPlaybackRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCPlaybackRepository$collectCastScreenAction$2 uGCPlaybackRepository$collectCastScreenAction$2 = new UGCPlaybackRepository$collectCastScreenAction$2(this.this$0, continuation);
        uGCPlaybackRepository$collectCastScreenAction$2.L$0 = obj;
        return uGCPlaybackRepository$collectCastScreenAction$2;
    }

    public final Object invoke(TheseusCastScreenRepository.a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TheseusCastScreenRepository.a aVar = (TheseusCastScreenRepository.a) this.L$0;
        if (aVar instanceof TheseusCastScreenRepository.a.C0954a) {
            if (this.this$0.f98071p.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                Av0.a aVarC = this.this$0.c();
                ProjectionItemData projectionItemData = ((TheseusCastScreenRepository.a.C0954a) aVar).f99134a;
                if (projectionItemData != null) {
                    Iterator<T> it = this.this$0.f98063g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((Av0.a) next).f591b == projectionItemData.f63477d) {
                            break;
                        }
                    }
                    Av0.a aVar2 = (Av0.a) next;
                    if (aVar2 == null) {
                        f.a("[theseus-ugc-UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend] ", android.support.v4.media.session.a.a(z.a(projectionItemData.f63477d, "can not find ep from cast screen with cid:", " avid:"), projectionItemData.f63475b, ", leave media scope, and idle ep"), "UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend", (Throwable) null);
                        return Unit.INSTANCE;
                    }
                    StringBuilder sb = new StringBuilder("use cast screen ep data, enter cast screen switch to ep avid:");
                    long j7 = aVar2.f590a;
                    sb.append(j7);
                    sb.append(", cid:");
                    long j8 = aVar2.f591b;
                    sb.append(j8);
                    defpackage.a.b("[theseus-ugc-UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend] ", sb.toString(), "UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend");
                    this.this$0.e(j7, j8);
                } else {
                    if (aVarC == null) {
                        BLog.w("UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend", "[theseus-ugc-UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend] enter cast screen but current ep is null, leave media scope, and idle ep", (Throwable) null);
                        return Unit.INSTANCE;
                    }
                    StringBuilder sb2 = new StringBuilder("use current ep data, enter cast screen switch to ep avid:");
                    long j9 = aVarC.f590a;
                    sb2.append(j9);
                    sb2.append(", cid:");
                    long j10 = aVarC.f591b;
                    sb2.append(j10);
                    defpackage.a.b("[theseus-ugc-UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend] ", sb2.toString(), "UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend");
                    this.this$0.e(j9, j10);
                }
            } else {
                BLog.i("UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend", "[theseus-ugc-UGCPlaybackRepository$collectCastScreenAction$2-invokeSuspend] lifecycle.currentState is less than RESUMED [Enter]");
            }
        } else {
            if (!(aVar instanceof TheseusCastScreenRepository.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            UGCPlaybackRepository uGCPlaybackRepository = this.this$0;
            BuildersKt.launch$default(uGCPlaybackRepository.f98057a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(uGCPlaybackRepository, aVar, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
