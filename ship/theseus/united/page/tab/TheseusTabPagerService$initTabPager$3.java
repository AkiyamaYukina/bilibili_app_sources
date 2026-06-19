package com.bilibili.ship.theseus.united.page.tab;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.widget.UnitedTabLayout;
import com.bilibili.ship.theseus.united.widget.UnitedViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$initTabPager$3.class */
final class TheseusTabPagerService$initTabPager$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final q $onPageChange;
    final r $onTabSelected;
    final UnitedTabLayout $tabLayout;
    final UnitedViewPager $viewPager;
    private Object L$0;
    int label;
    final TheseusTabPagerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$initTabPager$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$initTabPager$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UnitedTabLayout $tabLayout;
        int label;
        final TheseusTabPagerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$initTabPager$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$initTabPager$3$1$1.class */
        public static final class C11231 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final UnitedTabLayout $tabLayout;
            int I$0;
            int label;
            final TheseusTabPagerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11231(UnitedTabLayout unitedTabLayout, TheseusTabPagerService theseusTabPagerService, Continuation<? super C11231> continuation) {
                super(2, continuation);
                this.$tabLayout = unitedTabLayout;
                this.this$0 = theseusTabPagerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11231 c11231 = new C11231(this.$tabLayout, this.this$0, continuation);
                c11231.I$0 = ((Number) obj).intValue();
                return c11231;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                if (i7 != -1) {
                    TabLayout.Tab tabAt = this.$tabLayout.getTabAt(i7);
                    if (tabAt != null) {
                        tabAt.select();
                    }
                    this.this$0.f103136f.f103215e.setValue(-1);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusTabPagerService theseusTabPagerService, UnitedTabLayout unitedTabLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusTabPagerService;
            this.$tabLayout = unitedTabLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$tabLayout, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusTabPagerService theseusTabPagerService = this.this$0;
                StateFlow<Integer> stateFlow = theseusTabPagerService.f103136f.f103216f;
                C11231 c11231 = new C11231(this.$tabLayout, theseusTabPagerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c11231, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusTabPagerService$initTabPager$3(TheseusTabPagerService theseusTabPagerService, UnitedTabLayout unitedTabLayout, UnitedViewPager unitedViewPager, r rVar, q qVar, Continuation<? super TheseusTabPagerService$initTabPager$3> continuation) {
        super(2, continuation);
        this.this$0 = theseusTabPagerService;
        this.$tabLayout = unitedTabLayout;
        this.$viewPager = unitedViewPager;
        this.$onTabSelected = rVar;
        this.$onPageChange = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusTabPagerService$initTabPager$3 theseusTabPagerService$initTabPager$3 = new TheseusTabPagerService$initTabPager$3(this.this$0, this.$tabLayout, this.$viewPager, this.$onTabSelected, this.$onPageChange, continuation);
        theseusTabPagerService$initTabPager$3.L$0 = obj;
        return theseusTabPagerService$initTabPager$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$tabLayout, null), 3, (Object) null);
                TheseusTabPagerService theseusTabPagerService = this.this$0;
                UnitedTabLayout unitedTabLayout = this.$tabLayout;
                List<UIComponent<?>> list = theseusTabPagerService.f103143n;
                int iIntValue = ((Number) theseusTabPagerService.f103136f.f103214d.getValue()).intValue();
                this.label = 1;
                unitedTabLayout.removeAllTabs();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusTabPagerService$setTabUiComponent$2(list, theseusTabPagerService, unitedTabLayout, iIntValue, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$viewPager.setAdapter(null);
            BLog.i("TheseusTabPagerService$initTabPager$3-invokeSuspend", "[theseus-united-TheseusTabPagerService$initTabPager$3-invokeSuspend] -------adapter released-------");
            this.$tabLayout.removeOnTabSelectedListener(this.$onTabSelected);
            this.$viewPager.removeOnPageChangeListener(this.$onPageChange);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$viewPager.setAdapter(null);
            BLog.i("TheseusTabPagerService$initTabPager$3-invokeSuspend", "[theseus-united-TheseusTabPagerService$initTabPager$3-invokeSuspend] -------adapter released-------");
            this.$tabLayout.removeOnTabSelectedListener(this.$onTabSelected);
            this.$viewPager.removeOnPageChangeListener(this.$onPageChange);
            throw th;
        }
    }
}
