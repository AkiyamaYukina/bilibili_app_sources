package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bapis.bilibili.app.viewunite.common.TranslateButton;
import com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createAvComponent$contract$1$onClickMore$3.class */
public final class DetailRelateService$createAvComponent$contract$1$onClickMore$3 extends SuspendLambda implements Function2<TranslateButton, Continuation<? super Unit>, Object> {
    final p0 $basicInfo;
    final Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> $bindView;
    final o0 $card;
    final Ref.ObjectRef<String> $displayTitle;
    Object L$0;
    int label;
    final DetailRelateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createAvComponent$contract$1$onClickMore$3(o0 o0Var, p0 p0Var, DetailRelateService detailRelateService, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> objectRef2, Continuation<? super DetailRelateService$createAvComponent$contract$1$onClickMore$3> continuation) {
        super(2, continuation);
        this.$card = o0Var;
        this.$basicInfo = p0Var;
        this.this$0 = detailRelateService;
        this.$displayTitle = objectRef;
        this.$bindView = objectRef2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailRelateService$createAvComponent$contract$1$onClickMore$3 detailRelateService$createAvComponent$contract$1$onClickMore$3 = new DetailRelateService$createAvComponent$contract$1$onClickMore$3(this.$card, this.$basicInfo, this.this$0, this.$displayTitle, this.$bindView, continuation);
        detailRelateService$createAvComponent$contract$1$onClickMore$3.L$0 = obj;
        return detailRelateService$createAvComponent$contract$1$onClickMore$3;
    }

    public final Object invoke(TranslateButton translateButton, Continuation<? super Unit> continuation) {
        return create(translateButton, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r0) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createAvComponent$contract$1$onClickMore$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
