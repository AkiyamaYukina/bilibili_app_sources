package com.bilibili.ship.theseus.united.page.playingarea;

import Vn.A;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C;
import com.bilibili.ship.theseus.united.widget.AppBarScrollObserverBehavior;
import com.bilibili.ship.theseus.united.widget.LockableCollapsingToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectSpecifiedHeight$2.class */
final class PageNestedScrollFusionRepository$collectSpecifiedHeight$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final AppBarLayout $appbarLayout;
    final CoordinatorLayout.Behavior $behavior;
    final CoordinatorLayout $coordinatorLayout;
    final LockableCollapsingToolbarLayout $toolBar;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNestedScrollFusionRepository$collectSpecifiedHeight$2(LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout, AppBarLayout appBarLayout, CoordinatorLayout.Behavior behavior, CoordinatorLayout coordinatorLayout, Continuation<? super PageNestedScrollFusionRepository$collectSpecifiedHeight$2> continuation) {
        super(2, continuation);
        this.$toolBar = lockableCollapsingToolbarLayout;
        this.$appbarLayout = appBarLayout;
        this.$behavior = behavior;
        this.$coordinatorLayout = coordinatorLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageNestedScrollFusionRepository$collectSpecifiedHeight$2 pageNestedScrollFusionRepository$collectSpecifiedHeight$2 = new PageNestedScrollFusionRepository$collectSpecifiedHeight$2(this.$toolBar, this.$appbarLayout, this.$behavior, this.$coordinatorLayout, continuation);
        pageNestedScrollFusionRepository$collectSpecifiedHeight$2.I$0 = ((Number) obj).intValue();
        return pageNestedScrollFusionRepository$collectSpecifiedHeight$2;
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
        int minimumHeight = this.$toolBar.getMinimumHeight();
        int height = this.$appbarLayout.getHeight();
        int totalScrollRange = this.$appbarLayout.getTotalScrollRange();
        if (i7 < minimumHeight || totalScrollRange <= 0 || i7 > height) {
            defpackage.a.b("[theseus-united-PageNestedScrollFusionRepository$collectSpecifiedHeight$2-invokeSuspend] ", androidx.constraintlayout.widget.d.a(height, totalScrollRange, " totalScrollRange:", ", ignore", A.b(i7, minimumHeight, "specified height ", " less than min: ", " max:")), "PageNestedScrollFusionRepository$collectSpecifiedHeight$2-invokeSuspend");
            return Unit.INSTANCE;
        }
        defpackage.a.b("[theseus-united-PageNestedScrollFusionRepository$collectSpecifiedHeight$2-invokeSuspend] ", C.a(height, totalScrollRange, " appbar total scroll range: ", A.b(i7, minimumHeight, "scroll to specified height: ", "  min:", " max:")), "PageNestedScrollFusionRepository$collectSpecifiedHeight$2-invokeSuspend");
        AppBarScrollObserverBehavior.animateOffsetToByReflection$default((AppBarScrollObserverBehavior) this.$behavior, this.$coordinatorLayout, this.$appbarLayout, -(height - i7), 0.0f, 8, null);
        return Unit.INSTANCE;
    }
}
