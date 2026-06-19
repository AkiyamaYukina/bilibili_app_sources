package com.bilibili.ship.theseus.united.player.widget;

import com.bilibili.app.comment3.CommentV3Fragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/widget/TheseusLandscapeCommentFunctionWidget$startFragmentMonitor$1.class */
final class TheseusLandscapeCommentFunctionWidget$startFragmentMonitor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CommentV3Fragment $fragment;
    final Ref.BooleanRef $hasPaused;
    int label;
    final com.bilibili.ship.theseus.united.player.widget.a this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/widget/TheseusLandscapeCommentFunctionWidget$startFragmentMonitor$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.united.player.widget.a f104814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.BooleanRef f104815b;

        public a(com.bilibili.ship.theseus.united.player.widget.a aVar, Ref.BooleanRef booleanRef) {
            this.f104814a = aVar;
            this.f104815b = booleanRef;
        }

        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Ref.BooleanRef booleanRef = this.f104815b;
            com.bilibili.ship.theseus.united.player.widget.a aVar = this.f104814a;
            if (zBooleanValue) {
                IPlayerCoreService iPlayerCoreService = aVar.f104817b;
                IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
                if (iPlayerCoreService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                    iPlayerCoreService2 = null;
                }
                if (iPlayerCoreService2.getState() == 4) {
                    IPlayerCoreService iPlayerCoreService3 = aVar.f104817b;
                    if (iPlayerCoreService3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                        iPlayerCoreService3 = null;
                    }
                    iPlayerCoreService3.pause();
                    booleanRef.element = true;
                }
            } else if (booleanRef.element) {
                IPlayerCoreService iPlayerCoreService4 = aVar.f104817b;
                IPlayerCoreService iPlayerCoreService5 = iPlayerCoreService4;
                if (iPlayerCoreService4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                    iPlayerCoreService5 = null;
                }
                if (iPlayerCoreService5.getState() == 5) {
                    IPlayerCoreService iPlayerCoreService6 = aVar.f104817b;
                    if (iPlayerCoreService6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                        iPlayerCoreService6 = null;
                    }
                    iPlayerCoreService6.resume();
                    booleanRef.element = false;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusLandscapeCommentFunctionWidget$startFragmentMonitor$1(CommentV3Fragment commentV3Fragment, com.bilibili.ship.theseus.united.player.widget.a aVar, Ref.BooleanRef booleanRef, Continuation<? super TheseusLandscapeCommentFunctionWidget$startFragmentMonitor$1> continuation) {
        super(2, continuation);
        this.$fragment = commentV3Fragment;
        this.this$0 = aVar;
        this.$hasPaused = booleanRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusLandscapeCommentFunctionWidget$startFragmentMonitor$1(this.$fragment, this.this$0, this.$hasPaused, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = (Flow) this.$fragment.of().b.e.getValue();
            a aVar = new a(this.this$0, this.$hasPaused);
            this.label = 1;
            if (flow.collect(aVar, this) == coroutine_suspended) {
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
