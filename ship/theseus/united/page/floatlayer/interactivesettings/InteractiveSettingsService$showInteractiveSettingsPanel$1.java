package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$showInteractiveSettingsPanel$1.class */
final class InteractiveSettingsService$showInteractiveSettingsPanel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final InteractiveSettingsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveSettingsService$showInteractiveSettingsPanel$1(InteractiveSettingsService interactiveSettingsService, Continuation<? super InteractiveSettingsService$showInteractiveSettingsPanel$1> continuation) {
        super(2, continuation);
        this.this$0 = interactiveSettingsService;
    }

    private static final Unit invokeSuspend$lambda$0(InteractiveSettingsService interactiveSettingsService, View view, Ref.ObjectRef objectRef, CoroutineScope coroutineScope, Ref.ObjectRef objectRef2, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1(interactiveSettingsService, view, objectRef, coroutineScope, objectRef2, null));
        cVar.b(new InteractiveSettingsService$showInteractiveSettingsPanel$1$1$2(interactiveSettingsService, objectRef, null));
        cVar.b(new InteractiveSettingsService$showInteractiveSettingsPanel$1$1$3(interactiveSettingsService, objectRef, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InteractiveSettingsService$showInteractiveSettingsPanel$1 interactiveSettingsService$showInteractiveSettingsPanel$1 = new InteractiveSettingsService$showInteractiveSettingsPanel$1(this.this$0, continuation);
        interactiveSettingsService$showInteractiveSettingsPanel$1.L$0 = obj;
        return interactiveSettingsService$showInteractiveSettingsPanel$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$showInteractiveSettingsPanel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
