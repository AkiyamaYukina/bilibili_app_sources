package com.bilibili.ship.theseus.united.page.playingarea;

import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectAppBarAction$2.class */
final class PageNestedScrollFusionRepository$collectAppBarAction$2 extends SuspendLambda implements Function2<PageNestedScrollFusionRepository.a, Continuation<? super Unit>, Object> {
    final AppBarLayout $appBarLayout;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNestedScrollFusionRepository$collectAppBarAction$2(AppBarLayout appBarLayout, Continuation<? super PageNestedScrollFusionRepository$collectAppBarAction$2> continuation) {
        super(2, continuation);
        this.$appBarLayout = appBarLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageNestedScrollFusionRepository$collectAppBarAction$2 pageNestedScrollFusionRepository$collectAppBarAction$2 = new PageNestedScrollFusionRepository$collectAppBarAction$2(this.$appBarLayout, continuation);
        pageNestedScrollFusionRepository$collectAppBarAction$2.L$0 = obj;
        return pageNestedScrollFusionRepository$collectAppBarAction$2;
    }

    public final Object invoke(PageNestedScrollFusionRepository.a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PageNestedScrollFusionRepository.a aVar = (PageNestedScrollFusionRepository.a) this.L$0;
        if (aVar instanceof PageNestedScrollFusionRepository.a.C1087a) {
            PageNestedScrollFusionRepository.a.C1087a c1087a = (PageNestedScrollFusionRepository.a.C1087a) aVar;
            defpackage.a.b("[theseus-united-PageNestedScrollFusionRepository$collectAppBarAction$2-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("appbarLayout set expand, animate: ", c1087a.f102269a), "PageNestedScrollFusionRepository$collectAppBarAction$2-invokeSuspend");
            this.$appBarLayout.setExpanded(true, c1087a.f102269a);
        } else {
            if (!(aVar instanceof PageNestedScrollFusionRepository.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            PageNestedScrollFusionRepository.a.b bVar = (PageNestedScrollFusionRepository.a.b) aVar;
            defpackage.a.b("[theseus-united-PageNestedScrollFusionRepository$collectAppBarAction$2-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("appbarLayout set shrink, animate: ", bVar.f102270a), "PageNestedScrollFusionRepository$collectAppBarAction$2-invokeSuspend");
            this.$appBarLayout.setExpanded(false, bVar.f102270a);
        }
        this.$appBarLayout.requestLayout();
        return Unit.INSTANCE;
    }
}
