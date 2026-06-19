package com.bilibili.search2.component;

import G0.g;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.search2.eastereggs.h;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import com.bilibili.search2.result.base.t;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.widget.AlignLeftAndRightPagerSlidingTabStrip;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchResultCompatibleComponent$onCreate$1.class */
public final class SearchResultCompatibleComponent$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Fragment $fragment;
    int label;

    /* JADX INFO: renamed from: com.bilibili.search2.component.SearchResultCompatibleComponent$onCreate$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchResultCompatibleComponent$onCreate$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Fragment $fragment;
        final Ref.ObjectRef<WindowSizeClass> $lastWindowSize;
        int label;

        /* JADX INFO: renamed from: com.bilibili.search2.component.SearchResultCompatibleComponent$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchResultCompatibleComponent$onCreate$1$1$1.class */
        public static final class C05761 extends SuspendLambda implements Function2<FlowCollector<? super WindowSizeClass>, Continuation<? super Unit>, Object> {
            final FragmentActivity $activity;
            private Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05761(FragmentActivity fragmentActivity, Continuation<? super C05761> continuation) {
                super(2, continuation);
                this.$activity = fragmentActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05761 c05761 = new C05761(this.$activity, continuation);
                c05761.L$0 = obj;
                return c05761;
            }

            public final Object invoke(FlowCollector<? super WindowSizeClass> flowCollector, Continuation<? super Unit> continuation) {
                return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.$activity);
                    this.label = 1;
                    if (flowCollector.emit(windowSizeClassWindowSize, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.search2.component.SearchResultCompatibleComponent$onCreate$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchResultCompatibleComponent$onCreate$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.ObjectRef<WindowSizeClass> f86392a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Fragment f86393b;

            public a(Ref.ObjectRef<WindowSizeClass> objectRef, Fragment fragment) {
                this.f86392a = objectRef;
                this.f86393b = fragment;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
                Ref.ObjectRef<WindowSizeClass> objectRef = this.f86392a;
                BLog.i("SearchResultCompatibleComponent", "onCreate -> windowSize = " + windowSizeClass + ", last = " + objectRef.element);
                Object obj2 = objectRef.element;
                if (obj2 != null && !Intrinsics.areEqual(obj2, windowSizeClass)) {
                    Fragment fragment = this.f86393b;
                    BiliMainSearchResultFragment biliMainSearchResultFragment = fragment instanceof BiliMainSearchResultFragment ? (BiliMainSearchResultFragment) fragment : null;
                    if (biliMainSearchResultFragment != null) {
                        boolean zIsNormal = KScreenAdjustUtilsKt.isNormal(windowSizeClass);
                        OgvThemeColorHelper ogvThemeColorHelperVf = biliMainSearchResultFragment.vf();
                        if (ogvThemeColorHelperVf != null) {
                            ogvThemeColorHelperVf.a();
                        }
                        biliMainSearchResultFragment.Df();
                        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip = biliMainSearchResultFragment.f87090n;
                        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = alignLeftAndRightPagerSlidingTabStrip;
                        if (alignLeftAndRightPagerSlidingTabStrip == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
                            alignLeftAndRightPagerSlidingTabStrip2 = null;
                        }
                        alignLeftAndRightPagerSlidingTabStrip2.setTabLayoutPaddingLeftAndRight(ListExtentionsKt.toPx(e.c(biliMainSearchResultFragment.getContext())));
                        biliMainSearchResultFragment.sf(!zIsNormal);
                        t tVar = biliMainSearchResultFragment.f87083S;
                        biliMainSearchResultFragment.f87083S = tVar != null ? t.a(tVar, biliMainSearchResultFragment.xf().f87498e.incrementAndGet(), null, 130495) : null;
                        biliMainSearchResultFragment.Ef(zIsNormal ? null : biliMainSearchResultFragment.xf().L0());
                        com.bilibili.search2.eastereggs.a aVar = ((h) biliMainSearchResultFragment.f87099w.getValue()).f86517a;
                        if (aVar != null) {
                            aVar.b();
                        }
                        FrameLayout frameLayout = biliMainSearchResultFragment.f87097u;
                        FrameLayout frameLayout2 = frameLayout;
                        if (frameLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mParentLayout");
                            frameLayout2 = null;
                        }
                        if (!frameLayout2.isLaidOut() || frameLayout2.isLayoutRequested()) {
                            frameLayout2.addOnLayoutChangeListener(new com.bilibili.search2.result.h(biliMainSearchResultFragment));
                        } else {
                            biliMainSearchResultFragment.f87075K = frameLayout2.getHeight();
                            biliMainSearchResultFragment.Cf();
                        }
                    }
                    e.f86399a = null;
                }
                objectRef.element = windowSizeClass;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, Ref.ObjectRef<WindowSizeClass> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.$lastWindowSize = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$fragment, this.$lastWindowSize, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FragmentActivity fragmentActivityP3 = this.$fragment.p3();
                if (fragmentActivityP3 == null) {
                    return Unit.INSTANCE;
                }
                Flow flowOnStart = FlowKt.onStart(ScreenAdjustUtilsKt.windowSizeFlow(fragmentActivityP3), new C05761(fragmentActivityP3, null));
                a aVar = new a(this.$lastWindowSize, this.$fragment);
                this.label = 1;
                if (flowOnStart.collect(aVar, this) == coroutine_suspended) {
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
    public SearchResultCompatibleComponent$onCreate$1(Fragment fragment, Continuation<? super SearchResultCompatibleComponent$onCreate$1> continuation) {
        super(2, continuation);
        this.$fragment = fragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultCompatibleComponent$onCreate$1(this.$fragment, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.ObjectRef objectRefB = g.b(obj);
            Fragment fragment = this.$fragment;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(fragment, objectRefB, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(fragment, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
