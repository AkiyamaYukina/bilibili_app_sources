package com.bilibili.ship.theseus.playlist.di.page;

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
import zv0.C9268a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/Q.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class Q implements Factory<Flow<C9268a.C1396a>> {
    public static Flow<C9268a.C1396a> a(final B b7) {
        final StateFlow<Boolean> stateFlow = b7.f95586e;
        return (Flow) Preconditions.checkNotNullFromProvides(new Flow<C9268a.C1396a>(stateFlow, b7) { // from class: com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f95675a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final B f95676b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f95677a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final B f95678b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1$2$1.class */
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
                    this.f95677a = flowCollector;
                    this.f95678b = b7;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        r0 = r9
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r9
                        com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r11 = r0
                        r0 = r11
                        int r0 = r0.label
                        r10 = r0
                        r0 = r10
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r11
                        r1 = r10
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r11
                        r9 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r7
                        r3 = r9
                        r1.<init>(r2, r3)
                        r9 = r0
                    L33:
                        r0 = r9
                        java.lang.Object r0 = r0.result
                        r12 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r11 = r0
                        r0 = r9
                        int r0 = r0.label
                        r10 = r0
                        r0 = r10
                        if (r0 == 0) goto L5e
                        r0 = r10
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r12
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto Lb3
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r12
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r8
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        if (r0 == 0) goto L72
                        r0 = 0
                        r8 = r0
                        goto L9b
                    L72:
                        r0 = r7
                        com.bilibili.ship.theseus.playlist.di.page.B r0 = r0.f95678b
                        r8 = r0
                        zv0.a$a r0 = new zv0.a$a
                        r1 = r0
                        r2 = r8
                        Qu0.a r2 = r2.a()
                        com.google.android.material.appbar.AppBarLayout r2 = r2.f20172d
                        r3 = r8
                        Qu0.a r3 = r3.a()
                        com.bilibili.ship.theseus.united.widget.LockableCollapsingToolbarLayout r3 = r3.f20173e
                        r4 = r8
                        Qu0.a r4 = r4.a()
                        android.widget.FrameLayout r4 = r4.f20168A
                        r5 = r8
                        Qu0.a r5 = r5.a()
                        android.widget.FrameLayout r5 = r5.f20191x
                        r1.<init>(r2, r3, r4, r5)
                        r8 = r0
                    L9b:
                        r0 = r9
                        r1 = 1
                        r0.label = r1
                        r0 = r7
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f95677a
                        r1 = r8
                        r2 = r9
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r11
                        if (r0 != r1) goto Lb3
                        r0 = r11
                        return r0
                    Lb3:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.page.PlaylistLayoutBackedModule$provideUnderPlayerFeatureViews$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f95675a = stateFlow;
                this.f95676b = b7;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f95675a.collect(new AnonymousClass2(flowCollector, this.f95676b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}
