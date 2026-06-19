package com.bilibili.ship.theseus.playlist.di.page;

import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/M.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.page.tab.RawTabPagerServiceViews"})
public final class M implements Factory<Flow<TheseusTabPagerService.c>> {
    public static Flow<TheseusTabPagerService.c> a(final B b7) {
        final StateFlow<Boolean> stateFlow = b7.f95586e;
        return (Flow) Preconditions.checkNotNullFromProvides(new Flow<TheseusTabPagerService.c>(stateFlow, b7) { // from class: com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideTabPagerViews$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f95659a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final B f95660b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideTabPagerViews$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistLayoutBackedModule$provideTabPagerViews$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f95661a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final B f95662b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideTabPagerViews$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistLayoutBackedModule$provideTabPagerViews$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, B b7) {
                    this.f95661a = flowCollector;
                    this.f95662b = b7;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        Method dump skipped, instruction units count: 207
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideTabPagerViews$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f95659a = stateFlow;
                this.f95660b = b7;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f95659a.collect(new AnonymousClass2(flowCollector, this.f95660b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}
