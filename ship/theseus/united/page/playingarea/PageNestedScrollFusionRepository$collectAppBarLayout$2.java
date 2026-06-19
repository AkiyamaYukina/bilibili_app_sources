package com.bilibili.ship.theseus.united.page.playingarea;

import android.graphics.Matrix;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.widget.TheseusAncestorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectAppBarLayout$2.class */
final class PageNestedScrollFusionRepository$collectAppBarLayout$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PageNestedScrollFusionRepository.c $views;
    private Object L$0;
    int label;
    final PageNestedScrollFusionRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$collectAppBarLayout$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectAppBarLayout$2$1.class */
    public static final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PageNestedScrollFusionRepository f102277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusAncestorLayout f102278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AppBarLayout f102279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CoroutineScope f102280d;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$collectAppBarLayout$2$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectAppBarLayout$2$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final AppBarLayout $appBarLayout;
            final PageNestedScrollFusionRepository.b $cur;
            final int $offset;
            int label;
            final PageNestedScrollFusionRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, AppBarLayout appBarLayout, PageNestedScrollFusionRepository.b bVar, int i7, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = pageNestedScrollFusionRepository;
                this.$appBarLayout = appBarLayout;
                this.$cur = bVar;
                this.$offset = i7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$appBarLayout, this.$cur, this.$offset, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
                    AppBarLayout appBarLayout = this.$appBarLayout;
                    PageNestedScrollFusionRepository.b bVar = ((PageNestedScrollFusionRepository.b.C1088b) this.$cur).f102272a;
                    int i8 = this.$offset;
                    this.label = 1;
                    if (PageNestedScrollFusionRepository.a(pageNestedScrollFusionRepository, appBarLayout, bVar, i8, this) == coroutine_suspended) {
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

        public AnonymousClass1(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, TheseusAncestorLayout theseusAncestorLayout, AppBarLayout appBarLayout, CoroutineScope coroutineScope) {
            this.f102277a = pageNestedScrollFusionRepository;
            this.f102278b = theseusAncestorLayout;
            this.f102279c = appBarLayout;
            this.f102280d = coroutineScope;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(int r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            /*
                Method dump skipped, instruction units count: 698
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$collectAppBarLayout$2.AnonymousClass1.a(int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNestedScrollFusionRepository$collectAppBarLayout$2(PageNestedScrollFusionRepository.c cVar, PageNestedScrollFusionRepository pageNestedScrollFusionRepository, Continuation<? super PageNestedScrollFusionRepository$collectAppBarLayout$2> continuation) {
        super(2, continuation);
        this.$views = cVar;
        this.this$0 = pageNestedScrollFusionRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageNestedScrollFusionRepository$collectAppBarLayout$2 pageNestedScrollFusionRepository$collectAppBarLayout$2 = new PageNestedScrollFusionRepository$collectAppBarLayout$2(this.$views, this.this$0, continuation);
        pageNestedScrollFusionRepository$collectAppBarLayout$2.L$0 = obj;
        return pageNestedScrollFusionRepository$collectAppBarLayout$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PageNestedScrollFusionRepository.c cVar = this.$views;
            AppBarLayout appBarLayout = cVar.f102275b;
            ThreadLocal<Matrix> threadLocal = f.f102362a;
            Flow flowBuffer$default = FlowKt.buffer$default(FlowKt.callbackFlow(new PageNestedScrollFusionRepositoryKt$onOffsetChange$1(appBarLayout, null)), 0, BufferOverflow.DROP_OLDEST, 1, (Object) null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar.f102274a, appBarLayout, coroutineScope);
            this.label = 1;
            if (flowBuffer$default.collect(anonymousClass1, this) == coroutine_suspended) {
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
