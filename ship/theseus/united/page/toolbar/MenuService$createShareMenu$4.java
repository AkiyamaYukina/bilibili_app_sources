package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.app.comm.supermenu.core.MenuView;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createShareMenu$4.class */
final class MenuService$createShareMenu$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MenuView $menuView;
    int label;
    final MenuService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createShareMenu$4$a.class */
    public static final class a implements OnMenuVisibilityChangeListenerV2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuService f103272a;

        public a(MenuService menuService) {
            this.f103272a = menuService;
        }

        public final void onDismiss() {
            this.f103272a.e();
        }

        public final void onShow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$createShareMenu$4(MenuView menuView, MenuService menuService, Continuation<? super MenuService$createShareMenu$4> continuation) {
        super(1, continuation);
        this.$menuView = menuView;
        this.this$0 = menuService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MenuService$createShareMenu$4(this.$menuView, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$menuView.setOnMenuVisibilityChangeListener(new a(this.this$0));
        return Unit.INSTANCE;
    }
}
