package com.bilibili.ship.theseus.united.page.weblayer;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$keepLayoutStateSynced$2.class */
final class TheseusV3WebService$keepLayoutStateSynced$2 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
    final l.a $displayMode;
    final PlayerV3WebGeneralUIComponent $webUiComponent;
    Object L$0;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusV3WebService$keepLayoutStateSynced$2(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, l lVar, l.a aVar, Continuation<? super TheseusV3WebService$keepLayoutStateSynced$2> continuation) {
        super(2, continuation);
        this.$webUiComponent = playerV3WebGeneralUIComponent;
        this.this$0 = lVar;
        this.$displayMode = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusV3WebService$keepLayoutStateSynced$2 theseusV3WebService$keepLayoutStateSynced$2 = new TheseusV3WebService$keepLayoutStateSynced$2(this.$webUiComponent, this.this$0, this.$displayMode, continuation);
        theseusV3WebService$keepLayoutStateSynced$2.L$0 = obj;
        return theseusV3WebService$keepLayoutStateSynced$2;
    }

    public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
        return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.$webUiComponent;
        playerV3WebGeneralUIComponent.f82107p.setValue(Integer.valueOf(this.this$0.d(this.$displayMode, windowSizeClass)));
        MutableStateFlow<Integer> mutableStateFlow = playerV3WebGeneralUIComponent.f82109r;
        mutableStateFlow.setValue(Integer.valueOf(((Number) mutableStateFlow.getValue()).intValue() + 1));
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent2 = this.$webUiComponent;
        this.this$0.getClass();
        playerV3WebGeneralUIComponent2.f82106o.setValue(Integer.valueOf(DimenUtilsKt.dpToPx(com.bilibili.ship.theseus.united.page.intro.a.b(windowSizeClass))));
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent3 = this.$webUiComponent;
        this.this$0.getClass();
        playerV3WebGeneralUIComponent3.f82108q.setValue(Boolean.TRUE);
        MutableStateFlow<Integer> mutableStateFlow2 = this.$webUiComponent.f82109r;
        mutableStateFlow2.setValue(Integer.valueOf(((Number) mutableStateFlow2.getValue()).intValue() + 1));
        return Unit.INSTANCE;
    }
}
