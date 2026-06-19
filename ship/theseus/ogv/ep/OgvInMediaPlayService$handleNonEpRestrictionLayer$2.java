package com.bilibili.ship.theseus.ogv.ep;

import com.bilibili.ship.theseus.united.page.restrictionlayer.G;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvInMediaPlayService$handleNonEpRestrictionLayer$2.class */
final class OgvInMediaPlayService$handleNonEpRestrictionLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final RestrictionLayerVo $restrictionLayerVo;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvInMediaPlayService$handleNonEpRestrictionLayer$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvInMediaPlayService$handleNonEpRestrictionLayer$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
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
                ToolbarRepository toolbarRepository = this.this$0.h;
                this.label = 1;
                if (toolbarRepository.i(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvInMediaPlayService$handleNonEpRestrictionLayer$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvInMediaPlayService$handleNonEpRestrictionLayer$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RestrictionLayerVo $restrictionLayerVo;
        int label;
        final c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, RestrictionLayerVo restrictionLayerVo, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$restrictionLayerVo = restrictionLayerVo;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$restrictionLayerVo, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = this.this$0;
                G g7 = cVar.f92163f;
                RestrictionLayerVo restrictionLayerVo = this.$restrictionLayerVo;
                String str = cVar.f92164g.f94465r;
                this.label = 1;
                if (G.c(g7, restrictionLayerVo, true, false, str, false, null, this, 52) == coroutine_suspended) {
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
    public OgvInMediaPlayService$handleNonEpRestrictionLayer$2(c cVar, RestrictionLayerVo restrictionLayerVo, Continuation<? super OgvInMediaPlayService$handleNonEpRestrictionLayer$2> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$restrictionLayerVo = restrictionLayerVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvInMediaPlayService$handleNonEpRestrictionLayer$2 ogvInMediaPlayService$handleNonEpRestrictionLayer$2 = new OgvInMediaPlayService$handleNonEpRestrictionLayer$2(this.this$0, this.$restrictionLayerVo, continuation);
        ogvInMediaPlayService$handleNonEpRestrictionLayer$2.L$0 = obj;
        return ogvInMediaPlayService$handleNonEpRestrictionLayer$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$restrictionLayerVo, null), 3, (Object) null);
    }
}
