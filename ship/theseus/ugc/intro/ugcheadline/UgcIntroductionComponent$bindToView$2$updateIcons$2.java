package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2$updateIcons$2.class */
public final class UgcIntroductionComponent$bindToView$2$updateIcons$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final ExpandableTextView $desc;
    final String $drawableUrl;
    final TextView $historyRank;
    final int $size;
    int label;
    final UgcIntroductionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroductionComponent$bindToView$2$updateIcons$2(UgcIntroductionComponent ugcIntroductionComponent, TextView textView, String str, int i7, Context context, ExpandableTextView expandableTextView, Continuation<? super UgcIntroductionComponent$bindToView$2$updateIcons$2> continuation) {
        super(2, continuation);
        this.this$0 = ugcIntroductionComponent;
        this.$historyRank = textView;
        this.$drawableUrl = str;
        this.$size = i7;
        this.$context = context;
        this.$desc = expandableTextView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcIntroductionComponent$bindToView$2$updateIcons$2(this.this$0, this.$historyRank, this.$drawableUrl, this.$size, this.$context, this.$desc, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2$updateIcons$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
