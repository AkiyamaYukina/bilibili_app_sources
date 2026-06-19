package com.bilibili.ship.theseus.detail.di;

import com.bilibili.ship.theseus.united.page.playingarea.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$providePlayingAreaViews$$inlined$map$1.class */
public final class TheseusLayoutBackedModule$providePlayingAreaViews$$inlined$map$1 implements Flow<a.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f90960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6143c f90961b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$providePlayingAreaViews$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$providePlayingAreaViews$$inlined$map$1$2.class */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector f90962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6143c f90963b;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$providePlayingAreaViews$$inlined$map$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$providePlayingAreaViews$$inlined$map$1$2$1.class */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            Object result;
            final AnonymousClass2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                super(continuation);
                this.this$0 = anonymousClass2;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, C6143c c6143c) {
            this.f90962a = flowCollector;
            this.f90963b = c6143c;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$providePlayingAreaViews$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public TheseusLayoutBackedModule$providePlayingAreaViews$$inlined$map$1(Flow flow, C6143c c6143c) {
        this.f90960a = flow;
        this.f90961b = c6143c;
    }

    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f90960a.collect(new AnonymousClass2(flowCollector, this.f90961b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
