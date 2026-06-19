package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$showNewMenu$2$setting$1.class */
public final class MenuService$showNewMenu$2$setting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final List<RunningUIComponent> $list;
    final CompletableDeferred<Unit> $shareDeferred;
    Object L$0;
    int label;
    final MenuService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$showNewMenu$2$setting$1(MenuService menuService, CompletableDeferred<Unit> completableDeferred, List<RunningUIComponent> list, Continuation<? super MenuService$showNewMenu$2$setting$1> continuation) {
        super(2, continuation);
        this.this$0 = menuService;
        this.$shareDeferred = completableDeferred;
        this.$list = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuService$showNewMenu$2$setting$1(this.this$0, this.$shareDeferred, this.$list, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MenuService menuService = this.this$0;
            this.label = 1;
            Object objA = MenuService.a(menuService, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                list = list2;
                return Boxing.boxBoolean(this.$list.addAll(list));
            }
            ResultKt.throwOnFailure(obj);
        }
        list = (List) obj;
        CompletableDeferred<Unit> completableDeferred = this.$shareDeferred;
        this.L$0 = list;
        this.label = 2;
        if (completableDeferred.await(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Boxing.boxBoolean(this.$list.addAll(list));
    }
}
