package com.bilibili.ship.theseus.ugc.pages;

import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$special$$inlined$map$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesService$create$1.class */
public final class UgcPagesService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<g> $pagesView;
    int label;
    final UgcPagesService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Av0.a, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<g> $pagesView;
        Object L$0;
        int label;
        final UgcPagesService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcPagesService ugcPagesService, Ref.ObjectRef<g> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcPagesService;
            this.$pagesView = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pagesView, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Av0.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[EDGE_INSN: B:34:0x0090->B:20:0x0090 BREAK  A[LOOP:0: B:13:0x0060->B:36:0x0060], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.pages.UgcPagesService$create$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcPagesService$create$1(UgcPagesService ugcPagesService, Ref.ObjectRef<g> objectRef, Continuation<? super UgcPagesService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcPagesService;
        this.$pagesView = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcPagesService$create$1(this.this$0, this.$pagesView, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UgcPagesService ugcPagesService = this.this$0;
            UGCPlaybackRepository$special$$inlined$map$1 uGCPlaybackRepository$special$$inlined$map$1 = ugcPagesService.f98002d.f98076u;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcPagesService, this.$pagesView, null);
            this.label = 1;
            if (FlowKt.collectLatest(uGCPlaybackRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
