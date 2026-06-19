package com.bilibili.ship.theseus.ugc.ad;

import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.IAdUnderPlayerCallback;
import com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$4;
import com.bilibili.ship.theseus.united.page.ad.AdPanelRepository;
import com.bilibili.ship.theseus.united.page.ad.AdRepository;
import com.bilibili.ship.theseus.united.widget.LockableCollapsingToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import zv0.C9268a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$4.class */
final class DetailAdService$onViewsCreated$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C9268a.C1396a $views;
    int label;
    final DetailAdService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super Integer>, Continuation<? super Unit>, Object> {
        final AppBarLayout $appBarLayout;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppBarLayout appBarLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$appBarLayout = appBarLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ProducerScope producerScope, AppBarLayout appBarLayout, int i7) {
            producerScope.trySend-JP2dKIU(Integer.valueOf(i7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(AppBarLayout appBarLayout, AppBarLayout.OnOffsetChangedListener onOffsetChangedListener) {
            appBarLayout.removeOnOffsetChangedListener(onOffsetChangedListener);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$appBarLayout, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ProducerScope<? super Integer> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.ship.theseus.ugc.ad.f, com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener] */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final ?? r02 = new AppBarLayout.OnOffsetChangedListener(producerScope) { // from class: com.bilibili.ship.theseus.ugc.ad.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ProducerScope f96295a;

                    {
                        this.f96295a = producerScope;
                    }

                    public final void onOffsetChanged(AppBarLayout appBarLayout, int i8) {
                        DetailAdService$onViewsCreated$4.AnonymousClass1.invokeSuspend$lambda$0(this.f96295a, appBarLayout, i8);
                    }
                };
                this.$appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) r02);
                final AppBarLayout appBarLayout = this.$appBarLayout;
                Function0 function0 = new Function0(appBarLayout, r02) { // from class: com.bilibili.ship.theseus.ugc.ad.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final AppBarLayout f96296a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final f f96297b;

                    {
                        this.f96296a = appBarLayout;
                        this.f96297b = r02;
                    }

                    public final Object invoke() {
                        return DetailAdService$onViewsCreated$4.AnonymousClass1.invokeSuspend$lambda$1(this.f96296a, this.f96297b);
                    }
                };
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$4$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$4$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final AppBarLayout $appBarLayout;
        final CollapsingToolbarLayout $collapsingToolbar;
        final Ref.BooleanRef $toolbarScrimsShown;
        int I$0;
        int label;
        final DetailAdService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DetailAdService detailAdService, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = detailAdService;
            this.$appBarLayout = appBarLayout;
            this.$collapsingToolbar = collapsingToolbarLayout;
            this.$toolbarScrimsShown = booleanRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$appBarLayout, this.$collapsingToolbar, this.$toolbarScrimsShown, continuation);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
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
            AdRepository adRepository = this.this$0.f96254c;
            AppBarLayout appBarLayout = this.$appBarLayout;
            AdPanelRepository adPanelRepository = adRepository.f98927b;
            adPanelRepository.f98915o = appBarLayout;
            AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = adPanelRepository.f98914n;
            if (onOffsetChangedListener != null) {
                onOffsetChangedListener.onOffsetChanged(appBarLayout, i7);
            }
            boolean z6 = this.$collapsingToolbar.getHeight() + i7 < this.$collapsingToolbar.getScrimVisibleHeightTrigger();
            if (this.$toolbarScrimsShown.element != z6) {
                IAdUnderPlayerCallback iAdUnderPlayerCallback = this.this$0.f96270t;
                if (iAdUnderPlayerCallback != null) {
                    iAdUnderPlayerCallback.onToolbarScrimsShown(z6);
                }
                this.$toolbarScrimsShown.element = z6;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$onViewsCreated$4(C9268a.C1396a c1396a, DetailAdService detailAdService, Continuation<? super DetailAdService$onViewsCreated$4> continuation) {
        super(2, continuation);
        this.$views = c1396a;
        this.this$0 = detailAdService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$onViewsCreated$4(this.$views, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C9268a.C1396a c1396a = this.$views;
            AppBarLayout appBarLayout = c1396a.f130936a;
            if (appBarLayout != null && (lockableCollapsingToolbarLayout = c1396a.f130937b) != null) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                Flow flowCallbackFlow = FlowKt.callbackFlow(new AnonymousClass1(appBarLayout, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, appBarLayout, lockableCollapsingToolbarLayout, booleanRef, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCallbackFlow, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
