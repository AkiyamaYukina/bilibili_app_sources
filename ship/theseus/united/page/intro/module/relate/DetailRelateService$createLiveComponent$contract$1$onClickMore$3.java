package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bapis.bilibili.app.viewunite.common.TranslateButton;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createLiveComponent$contract$1$onClickMore$3.class */
public final class DetailRelateService$createLiveComponent$contract$1$onClickMore$3 extends SuspendLambda implements Function2<TranslateButton, Continuation<? super Unit>, Object> {
    final p0 $basicInfo;
    final o0 $card;
    final MutableStateFlow<String> $titleFlow;
    Object L$0;
    int label;
    final DetailRelateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createLiveComponent$contract$1$onClickMore$3(o0 o0Var, p0 p0Var, DetailRelateService detailRelateService, MutableStateFlow<String> mutableStateFlow, Continuation<? super DetailRelateService$createLiveComponent$contract$1$onClickMore$3> continuation) {
        super(2, continuation);
        this.$card = o0Var;
        this.$basicInfo = p0Var;
        this.this$0 = detailRelateService;
        this.$titleFlow = mutableStateFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailRelateService$createLiveComponent$contract$1$onClickMore$3 detailRelateService$createLiveComponent$contract$1$onClickMore$3 = new DetailRelateService$createLiveComponent$contract$1$onClickMore$3(this.$card, this.$basicInfo, this.this$0, this.$titleFlow, continuation);
        detailRelateService$createLiveComponent$contract$1$onClickMore$3.L$0 = obj;
        return detailRelateService$createLiveComponent$contract$1$onClickMore$3;
    }

    public final Object invoke(TranslateButton translateButton, Continuation<? super Unit> continuation) {
        return create(translateButton, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r0) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createLiveComponent$contract$1$onClickMore$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
