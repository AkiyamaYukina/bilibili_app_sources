package com.bilibili.ship.theseus.united.page.tab;

import com.bilibili.app.gemini.ui.UIComponent;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$setTabUiComponent$2.class */
final class TheseusTabPagerService$setTabUiComponent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $selectedIndex;
    final List<UIComponent<?>> $tabUiComponent;
    final TabLayout $this_setTabUiComponent;
    private Object L$0;
    int label;
    final TheseusTabPagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusTabPagerService$setTabUiComponent$2(List<? extends UIComponent<?>> list, TheseusTabPagerService theseusTabPagerService, TabLayout tabLayout, int i7, Continuation<? super TheseusTabPagerService$setTabUiComponent$2> continuation) {
        super(2, continuation);
        this.$tabUiComponent = list;
        this.this$0 = theseusTabPagerService;
        this.$this_setTabUiComponent = tabLayout;
        this.$selectedIndex = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusTabPagerService$setTabUiComponent$2 theseusTabPagerService$setTabUiComponent$2 = new TheseusTabPagerService$setTabUiComponent$2(this.$tabUiComponent, this.this$0, this.$this_setTabUiComponent, this.$selectedIndex, continuation);
        theseusTabPagerService$setTabUiComponent$2.L$0 = obj;
        return theseusTabPagerService$setTabUiComponent$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        List<UIComponent<?>> list = this.$tabUiComponent;
        List<UIComponent<?>> list2 = list;
        TheseusTabPagerService theseusTabPagerService = this.this$0;
        TabLayout tabLayout = this.$this_setTabUiComponent;
        int i7 = this.$selectedIndex;
        int i8 = 0;
        for (Object obj2 : list2) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new TheseusTabPagerService$setTabUiComponent$2$1$1(theseusTabPagerService, i8, list, (UIComponent) obj2, tabLayout, i7, null), 1, (Object) null);
            i8++;
        }
        return Unit.INSTANCE;
    }
}
