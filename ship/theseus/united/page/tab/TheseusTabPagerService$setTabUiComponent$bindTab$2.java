package com.bilibili.ship.theseus.united.page.tab;

import android.content.Context;
import androidx.core.view.ViewCompat;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponentKt;
import com.google.android.material.tabs.TabLayout;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$setTabUiComponent$bindTab$2.class */
public final class TheseusTabPagerService$setTabUiComponent$bindTab$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final int $index;
    final int $minWidth;
    final int $selectedIndex;
    final TabLayout.Tab $tab;
    final StateFlow<Integer> $tabPaddingHorizontalFlow;
    final TabLayout $this_setTabUiComponent;
    final UIComponent<T> $uiComponent;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$setTabUiComponent$bindTab$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$setTabUiComponent$bindTab$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final int $index;
        final int $minWidth;
        final int $selectedIndex;
        final TabLayout.Tab $tab;
        final TabLayout $this_setTabUiComponent;
        final UIComponent<T> $uiComponent;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$setTabUiComponent$bindTab$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$setTabUiComponent$bindTab$2$1$1.class */
        public static final class C11241 extends SuspendLambda implements Function2<UIComponent.ViewEntry, Continuation<? super Unit>, Object> {
            final int $index;
            final int $minWidth;
            final int $selectedIndex;
            final TabLayout.Tab $tab;
            final TabLayout $this_setTabUiComponent;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11241(TabLayout.Tab tab, int i7, TabLayout tabLayout, int i8, int i9, Continuation<? super C11241> continuation) {
                super(2, continuation);
                this.$tab = tab;
                this.$minWidth = i7;
                this.$this_setTabUiComponent = tabLayout;
                this.$index = i8;
                this.$selectedIndex = i9;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11241 c11241 = new C11241(this.$tab, this.$minWidth, this.$this_setTabUiComponent, this.$index, this.$selectedIndex, continuation);
                c11241.L$0 = obj;
                return c11241;
            }

            public final Object invoke(UIComponent.ViewEntry viewEntry, Continuation<? super Unit> continuation) {
                return create(viewEntry, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$tab.setCustomView(((UIComponent.ViewEntry) this.L$0).getRoot());
                int i7 = this.$minWidth;
                if (i7 > 0) {
                    this.$tab.view.setMinimumWidth(i7);
                }
                this.$this_setTabUiComponent.addTab(this.$tab, this.$index == this.$selectedIndex);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UIComponent<T> uIComponent, TabLayout tabLayout, TabLayout.Tab tab, int i7, int i8, int i9, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uiComponent = uIComponent;
            this.$this_setTabUiComponent = tabLayout;
            this.$tab = tab;
            this.$minWidth = i7;
            this.$index = i8;
            this.$selectedIndex = i9;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$uiComponent, this.$this_setTabUiComponent, this.$tab, this.$minWidth, this.$index, this.$selectedIndex, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UIComponent<T> uIComponent = this.$uiComponent;
                Context context = this.$this_setTabUiComponent.getContext();
                TabLayout.Tab tab = this.$tab;
                TabLayout.TabView tabView = tab.view;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                C11241 c11241 = new C11241(tab, this.$minWidth, this.$this_setTabUiComponent, this.$index, this.$selectedIndex, null);
                this.label = 1;
                if (UIComponentKt.a(uIComponent, context, tabView, coroutineStart, c11241, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$setTabUiComponent$bindTab$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$setTabUiComponent$bindTab$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TabLayout.Tab $tab;
        final StateFlow<Integer> $tabPaddingHorizontalFlow;
        final TabLayout $this_setTabUiComponent;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$setTabUiComponent$bindTab$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$setTabUiComponent$bindTab$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TabLayout.Tab f103161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TabLayout f103162b;

            public a(TabLayout.Tab tab, TabLayout tabLayout) {
                this.f103161a = tab;
                this.f103162b = tabLayout;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                TabLayout.TabView tabView = this.f103161a.view;
                TabLayout tabLayout = this.f103162b;
                Context context = tabLayout.getContext();
                float f7 = iIntValue;
                ViewCompat.setPaddingRelative(tabView, (int) Uj0.c.a(f7, context), 0, (int) Uj0.c.a(f7, tabLayout.getContext()), 0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StateFlow<Integer> stateFlow, TabLayout.Tab tab, TabLayout tabLayout, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$tabPaddingHorizontalFlow = stateFlow;
            this.$tab = tab;
            this.$this_setTabUiComponent = tabLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$tabPaddingHorizontalFlow, this.$tab, this.$this_setTabUiComponent, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.$tabPaddingHorizontalFlow;
                a aVar = new a(this.$tab, this.$this_setTabUiComponent);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusTabPagerService$setTabUiComponent$bindTab$2(UIComponent<T> uIComponent, TabLayout tabLayout, TabLayout.Tab tab, int i7, int i8, int i9, StateFlow<Integer> stateFlow, Continuation<? super TheseusTabPagerService$setTabUiComponent$bindTab$2> continuation) {
        super(2, continuation);
        this.$uiComponent = uIComponent;
        this.$this_setTabUiComponent = tabLayout;
        this.$tab = tab;
        this.$minWidth = i7;
        this.$index = i8;
        this.$selectedIndex = i9;
        this.$tabPaddingHorizontalFlow = stateFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusTabPagerService$setTabUiComponent$bindTab$2 theseusTabPagerService$setTabUiComponent$bindTab$2 = new TheseusTabPagerService$setTabUiComponent$bindTab$2(this.$uiComponent, this.$this_setTabUiComponent, this.$tab, this.$minWidth, this.$index, this.$selectedIndex, this.$tabPaddingHorizontalFlow, continuation);
        theseusTabPagerService$setTabUiComponent$bindTab$2.L$0 = obj;
        return theseusTabPagerService$setTabUiComponent$bindTab$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$uiComponent, this.$this_setTabUiComponent, this.$tab, this.$minWidth, this.$index, this.$selectedIndex, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$tabPaddingHorizontalFlow, this.$tab, this.$this_setTabUiComponent, null), 3, (Object) null);
    }
}
