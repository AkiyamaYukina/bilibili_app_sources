package com.bilibili.ship.theseus.united.page.toolbar;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createShareMenu$1.class */
final class MenuService$createShareMenu$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final MenuService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$createShareMenu$1(MenuService menuService, Continuation<? super MenuService$createShareMenu$1> continuation) {
        super(continuation);
        this.this$0 = menuService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MenuService.b(this.this$0, this);
    }
}
