package com.bilibili.ship.theseus.united.page.playingarea;

import com.bilibili.ship.theseus.united.widget.LockableCollapsingToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectScrollEnable$2.class */
final class PageNestedScrollFusionRepository$collectScrollEnable$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final LockableCollapsingToolbarLayout $toolBar;
    boolean Z$0;
    int label;
    final PageNestedScrollFusionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNestedScrollFusionRepository$collectScrollEnable$2(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout, Continuation<? super PageNestedScrollFusionRepository$collectScrollEnable$2> continuation) {
        super(2, continuation);
        this.this$0 = pageNestedScrollFusionRepository;
        this.$toolBar = lockableCollapsingToolbarLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageNestedScrollFusionRepository$collectScrollEnable$2 pageNestedScrollFusionRepository$collectScrollEnable$2 = new PageNestedScrollFusionRepository$collectScrollEnable$2(this.this$0, this.$toolBar, continuation);
        pageNestedScrollFusionRepository$collectScrollEnable$2.Z$0 = ((Boolean) obj).booleanValue();
        return pageNestedScrollFusionRepository$collectScrollEnable$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z6 = this.Z$0;
        defpackage.a.b("[theseus-united-PageNestedScrollFusionRepository$collectScrollEnable$2-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("tool bar scroll enabled: ", z6), "PageNestedScrollFusionRepository$collectScrollEnable$2-invokeSuspend");
        PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
        CollapsingToolbarLayout collapsingToolbarLayout = this.$toolBar;
        pageNestedScrollFusionRepository.getClass();
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) collapsingToolbarLayout.getLayoutParams();
        if (z6) {
            layoutParams.setScrollFlags(3);
        } else {
            layoutParams.setScrollFlags(0);
        }
        collapsingToolbarLayout.requestLayout();
        return Unit.INSTANCE;
    }
}
