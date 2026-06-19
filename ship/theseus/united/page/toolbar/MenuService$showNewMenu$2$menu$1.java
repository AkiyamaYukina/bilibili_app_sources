package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$showNewMenu$2$menu$1.class */
public final class MenuService$showNewMenu$2$menu$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final List<RunningUIComponent> $list;
    final CompletableDeferred<Unit> $shareDeferred;
    Object L$0;
    int label;
    final MenuService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$showNewMenu$2$menu$1(List<RunningUIComponent> list, MenuService menuService, CompletableDeferred<Unit> completableDeferred, Continuation<? super MenuService$showNewMenu$2$menu$1> continuation) {
        super(2, continuation);
        this.$list = list;
        this.this$0 = menuService;
        this.$shareDeferred = completableDeferred;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuService$showNewMenu$2$menu$1(this.$list, this.this$0, this.$shareDeferred, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        List<RunningUIComponent> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                List<RunningUIComponent> list2 = this.$list;
                MenuService menuService = this.this$0;
                this.L$0 = list2;
                this.label = 1;
                objB = MenuService.b(menuService, this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = list2;
            }
            return Boxing.boxBoolean(this.$shareDeferred.complete(Unit.INSTANCE));
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) this.L$0;
        ResultKt.throwOnFailure(obj);
        objB = obj;
        list.add(objB);
        this.$list.add(new RunningUIComponent(new com.bilibili.playerbizcommonv2.widget.setting.channel.w(4), 0, (Function1) null, 6));
        return Boxing.boxBoolean(this.$shareDeferred.complete(Unit.INSTANCE));
    }
}
