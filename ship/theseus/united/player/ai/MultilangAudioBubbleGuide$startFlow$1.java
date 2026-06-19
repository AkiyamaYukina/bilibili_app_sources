package com.bilibili.ship.theseus.united.player.ai;

import android.view.View;
import com.bilibili.lib.media.resource.Languages;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.playercore.u;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.player.ai.d;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/MultilangAudioBubbleGuide$startFlow$1.class */
final class MultilangAudioBubbleGuide$startFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final d this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.MultilangAudioBubbleGuide$startFlow$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/MultilangAudioBubbleGuide$startFlow$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function4<d.a, c.a, j, Continuation<? super Triple<? extends d.a, ? extends c.a, ? extends j>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(d.a aVar, c.a aVar2, j jVar, Continuation<? super Triple<d.a, c.a, ? extends j>> continuation) {
            return MultilangAudioBubbleGuide$startFlow$1.invokeSuspend$lambda$0(aVar, aVar2, jVar, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.MultilangAudioBubbleGuide$startFlow$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/MultilangAudioBubbleGuide$startFlow$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Triple<? extends d.a, ? extends c.a, ? extends j>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.MultilangAudioBubbleGuide$startFlow$1$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/MultilangAudioBubbleGuide$startFlow$1$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<u, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(u uVar, Continuation<? super Boolean> continuation) {
                return create(uVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                MediaResource mediaResource;
                Languages language;
                List listH;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                u uVar = (u) this.L$0;
                boolean z6 = false;
                if (((uVar == null || (mediaResource = uVar.f79460c) == null || (language = mediaResource.getLanguage()) == null || (listH = language.h()) == null) ? 0 : listH.size()) > 0) {
                    z6 = true;
                }
                return Boxing.boxBoolean(z6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(d dVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Triple<d.a, c.a, ? extends j> triple, Continuation<? super Unit> continuation) {
            return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            d.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Triple triple = (Triple) this.L$0;
                aVar = (d.a) triple.component1();
                c.a aVar2 = (c.a) triple.component2();
                j jVar = (j) triple.component3();
                if (!aVar2.f102988b && aVar != null && jVar != null) {
                    Flow<u> flowB = jVar.b();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                    this.L$0 = aVar;
                    this.label = 1;
                    Object objFirst = FlowKt.first(flowB, anonymousClass1, this);
                    obj = objFirst;
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            aVar = (d.a) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (((u) obj) == null) {
                return Unit.INSTANCE;
            }
            d dVar = this.this$0;
            View view = aVar.f104368a;
            this.L$0 = null;
            this.label = 2;
            if (d.a(dVar, view, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultilangAudioBubbleGuide$startFlow$1(d dVar, Continuation<? super MultilangAudioBubbleGuide$startFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(d.a aVar, c.a aVar2, j jVar, Continuation continuation) {
        return new Triple(aVar, aVar2, jVar);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultilangAudioBubbleGuide$startFlow$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (YieldKt.yield(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        d dVar = this.this$0;
        Flow flowCombine = FlowKt.combine(dVar.f104360c, dVar.f104362e.c(), FlowKt.asStateFlow(this.this$0.f104364g.f91111e), AnonymousClass3.INSTANCE);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
        this.label = 2;
        if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
