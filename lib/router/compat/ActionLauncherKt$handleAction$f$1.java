package com.bilibili.lib.router.compat;

import com.bilibili.lib.router.Action;
import com.bilibili.lib.router.RouteParams;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/compat/ActionLauncherKt$handleAction$f$1.class */
final /* synthetic */ class ActionLauncherKt$handleAction$f$1 extends FunctionReferenceImpl implements Function1<RouteParams, Object> {
    public ActionLauncherKt$handleAction$f$1(Object obj) {
        super(1, obj, Action.class, "act", "act(Lcom/bilibili/lib/router/RouteParams;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(RouteParams routeParams) {
        return ((Action) ((CallableReference) this).receiver).act(routeParams);
    }
}
