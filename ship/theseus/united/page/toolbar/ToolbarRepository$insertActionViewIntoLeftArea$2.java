package com.bilibili.ship.theseus.united.page.toolbar;

import android.view.View;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$insertActionViewIntoLeftArea$2.class */
final class ToolbarRepository$insertActionViewIntoLeftArea$2 extends SuspendLambda implements Function2<ToolbarRepository.a, Continuation<? super Unit>, Object> {
    final List<View> $viewsList;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarRepository$insertActionViewIntoLeftArea$2(List<? extends View> list, Continuation<? super ToolbarRepository$insertActionViewIntoLeftArea$2> continuation) {
        super(2, continuation);
        this.$viewsList = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ToolbarRepository$insertActionViewIntoLeftArea$2 toolbarRepository$insertActionViewIntoLeftArea$2 = new ToolbarRepository$insertActionViewIntoLeftArea$2(this.$viewsList, continuation);
        toolbarRepository$insertActionViewIntoLeftArea$2.L$0 = obj;
        return toolbarRepository$insertActionViewIntoLeftArea$2;
    }

    public final Object invoke(ToolbarRepository.a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4 A[LOOP:0: B:46:0x00ea->B:48:0x00f4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$insertActionViewIntoLeftArea$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
