package com.bilibili.ship.theseus.united.page.tab;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$setTabUiComponent$2$1$1.class */
public final class TheseusTabPagerService$setTabUiComponent$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $index;
    final int $selectedIndex;
    final List<UIComponent<?>> $tabUiComponent;
    final TabLayout $this_setTabUiComponent;
    final UIComponent<?> $uiComponent;
    int label;
    final TheseusTabPagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusTabPagerService$setTabUiComponent$2$1$1(TheseusTabPagerService theseusTabPagerService, int i7, List<? extends UIComponent<?>> list, UIComponent<?> uIComponent, TabLayout tabLayout, int i8, Continuation<? super TheseusTabPagerService$setTabUiComponent$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusTabPagerService;
        this.$index = i7;
        this.$tabUiComponent = list;
        this.$uiComponent = uIComponent;
        this.$this_setTabUiComponent = tabLayout;
        this.$selectedIndex = i8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusTabPagerService$setTabUiComponent$2$1$1(this.this$0, this.$index, this.$tabUiComponent, this.$uiComponent, this.$this_setTabUiComponent, this.$selectedIndex, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TabPage tabPage = (TabPage) CollectionsKt.getOrNull(this.this$0.f103137g.f103191a, this.$index);
            if ((tabPage != null ? tabPage.b() : null) == TabPage.LocatableTag.Comment) {
                int i8 = this.$tabUiComponent.size() > 2 ? 78 : 104;
                TabLayout tabLayout = this.$this_setTabUiComponent;
                int i9 = this.$selectedIndex;
                int i10 = this.$index;
                UIComponent<?> uIComponent = this.$uiComponent;
                StateFlow<Integer> stateFlow = this.this$0.f103141l.f100020a;
                int iA = (int) Uj0.c.a(i8, tabLayout.getContext());
                this.label = 1;
                if (TheseusTabPagerService.b(tabLayout, i9, i10, uIComponent, stateFlow, iA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                TabLayout tabLayout2 = this.$this_setTabUiComponent;
                int i11 = this.$selectedIndex;
                int i12 = this.$index;
                UIComponent<?> uIComponent2 = this.$uiComponent;
                StateFlow<Integer> stateFlow2 = this.this$0.f103141l.f100020a;
                this.label = 2;
                if (TheseusTabPagerService.b(tabLayout2, i11, i12, uIComponent2, stateFlow2, 0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
