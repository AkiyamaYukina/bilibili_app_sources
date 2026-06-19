package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2$2$onSpecialTagUpdate$1.class */
public final class UgcIntroductionComponent$bindToView$2$2$onSpecialTagUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CoroutineScope $$this$coroutineScope;
    final TextView $avid;
    final Context $context;
    final TintTextView $danmakus;
    final ExpandableTextView $desc;
    final TintTextView $forbidden;
    final TextView $historyRank;
    final TintTextView $online;
    final ConstraintLayout $root;
    final TintTextView $score;
    final TintTextView $time;
    final TintTextView $views;
    int label;
    final UgcIntroductionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroductionComponent$bindToView$2$2$onSpecialTagUpdate$1(TextView textView, UgcIntroductionComponent ugcIntroductionComponent, TintTextView tintTextView, TextView textView2, ConstraintLayout constraintLayout, Context context, CoroutineScope coroutineScope, TintTextView tintTextView2, TintTextView tintTextView3, TintTextView tintTextView4, TintTextView tintTextView5, TintTextView tintTextView6, ExpandableTextView expandableTextView, Continuation<? super UgcIntroductionComponent$bindToView$2$2$onSpecialTagUpdate$1> continuation) {
        super(2, continuation);
        this.$avid = textView;
        this.this$0 = ugcIntroductionComponent;
        this.$forbidden = tintTextView;
        this.$historyRank = textView2;
        this.$root = constraintLayout;
        this.$context = context;
        this.$$this$coroutineScope = coroutineScope;
        this.$online = tintTextView2;
        this.$score = tintTextView3;
        this.$views = tintTextView4;
        this.$danmakus = tintTextView5;
        this.$time = tintTextView6;
        this.$desc = expandableTextView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcIntroductionComponent$bindToView$2$2$onSpecialTagUpdate$1(this.$avid, this.this$0, this.$forbidden, this.$historyRank, this.$root, this.$context, this.$$this$coroutineScope, this.$online, this.$score, this.$views, this.$danmakus, this.$time, this.$desc, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TextView textView = this.$avid;
            UgcIntroductionComponent ugcIntroductionComponent = this.this$0;
            TintTextView tintTextView = this.$forbidden;
            TextView textView2 = this.$historyRank;
            ConstraintLayout constraintLayout = this.$root;
            Context context = this.$context;
            CoroutineScope coroutineScope = this.$$this$coroutineScope;
            TintTextView tintTextView2 = this.$online;
            TintTextView tintTextView3 = this.$score;
            TintTextView tintTextView4 = this.$views;
            TintTextView tintTextView5 = this.$danmakus;
            TintTextView tintTextView6 = this.$time;
            ExpandableTextView expandableTextView = this.$desc;
            this.label = 1;
            if (UgcIntroductionComponent.AnonymousClass2.invokeSuspend$updateIcons(textView, ugcIntroductionComponent, tintTextView, textView2, constraintLayout, context, coroutineScope, tintTextView2, tintTextView3, tintTextView4, tintTextView5, tintTextView6, expandableTextView, this) == coroutine_suspended) {
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
