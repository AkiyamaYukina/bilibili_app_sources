package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$layoutSpecialTag$4$1$2.class */
public final class UgcIntroductionComponent$layoutSpecialTag$4$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $iconTint;
    final int $leftIconWidth;
    final String $leftUrl;
    final int $rightIconWidth;
    final String $rightUrl;
    final yh1.b $specialTagSpan;
    final TextView $textView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroductionComponent$layoutSpecialTag$4$1$2(String str, TextView textView, int i7, String str2, int i8, yh1.b bVar, int i9, Continuation<? super UgcIntroductionComponent$layoutSpecialTag$4$1$2> continuation) {
        super(2, continuation);
        this.$leftUrl = str;
        this.$textView = textView;
        this.$iconTint = i7;
        this.$rightUrl = str2;
        this.$leftIconWidth = i8;
        this.$specialTagSpan = bVar;
        this.$rightIconWidth = i9;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcIntroductionComponent$layoutSpecialTag$4$1$2(this.$leftUrl, this.$textView, this.$iconTint, this.$rightUrl, this.$leftIconWidth, this.$specialTagSpan, this.$rightIconWidth, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$layoutSpecialTag$4$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
