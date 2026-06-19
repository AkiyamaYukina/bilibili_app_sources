package com.bilibili.ship.theseus.united.player.charge;

import android.widget.FrameLayout;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$runToast$2.class */
final class TheseusChargeToastService$runToast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $duration;
    final FullPromptBarVo $fullPromptBarVo;
    private Object L$0;
    int label;
    final TheseusChargeToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusChargeToastService$runToast$2(TheseusChargeToastService theseusChargeToastService, FullPromptBarVo fullPromptBarVo, long j7, Continuation<? super TheseusChargeToastService$runToast$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusChargeToastService;
        this.$fullPromptBarVo = fullPromptBarVo;
        this.$duration = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusChargeToastService$runToast$2 theseusChargeToastService$runToast$2 = new TheseusChargeToastService$runToast$2(this.this$0, this.$fullPromptBarVo, this.$duration, continuation);
        theseusChargeToastService$runToast$2.L$0 = obj;
        return theseusChargeToastService$runToast$2;
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
            long jF = this.this$0.f104399d.F();
            TheseusChargeToastService theseusChargeToastService = this.this$0;
            FullPromptBarVo fullPromptBarVo = this.$fullPromptBarVo;
            long j7 = Duration.minus-LRDsOJo(this.$duration, jF);
            b bVar = theseusChargeToastService.f104398c;
            bVar.f104415a.setValue(bVar.f104421g.b(fullPromptBarVo, theseusChargeToastService.a(Duration.getInWholeSeconds-impl(j7), fullPromptBarVo.f102383e)));
            TheseusChargeToastService theseusChargeToastService2 = this.this$0;
            FullPromptBarVo fullPromptBarVo2 = this.$fullPromptBarVo;
            long j8 = this.$duration;
            theseusChargeToastService2.getClass();
            Job jobLaunch$default = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusChargeToastService$startRefreshJob$1(fullPromptBarVo2, j8, theseusChargeToastService2, null), 3, (Object) null);
            TheseusChargeToastService theseusChargeToastService3 = this.this$0;
            FullPromptBarVo fullPromptBarVo3 = this.$fullPromptBarVo;
            long j9 = this.$duration;
            theseusChargeToastService3.getClass();
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusChargeToastService$startFoldJob$1(fullPromptBarVo3, jobLaunch$default, j9, theseusChargeToastService3, null), 3, (Object) null);
            TheseusChargeToastService theseusChargeToastService4 = this.this$0;
            this.label = 1;
            theseusChargeToastService4.getClass();
            FrameLayout frameLayout = new FrameLayout(theseusChargeToastService4.f104397b);
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusChargeToastService$showToast$2(theseusChargeToastService4, frameLayout, new PlayerToast.Builder().location(32).level(3).toastItemType(19).duration(UpperTimeline.MIN_CLIP_DURATION).setCustomView(frameLayout).build(), null), this);
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
