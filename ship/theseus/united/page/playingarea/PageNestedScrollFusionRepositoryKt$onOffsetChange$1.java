package com.bilibili.ship.theseus.united.page.playingarea;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepositoryKt$onOffsetChange$1.class */
final class PageNestedScrollFusionRepositoryKt$onOffsetChange$1 extends SuspendLambda implements Function2<ProducerScope<? super Integer>, Continuation<? super Unit>, Object> {
    final AppBarLayout $this_onOffsetChange;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNestedScrollFusionRepositoryKt$onOffsetChange$1(AppBarLayout appBarLayout, Continuation<? super PageNestedScrollFusionRepositoryKt$onOffsetChange$1> continuation) {
        super(2, continuation);
        this.$this_onOffsetChange = appBarLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, AppBarLayout appBarLayout, int i7) {
        Object objTrySendBlocking = ChannelsKt.trySendBlocking(producerScope, Integer.valueOf(i7));
        if (objTrySendBlocking instanceof ChannelResult.Failed) {
            ChannelResult.exceptionOrNull-impl(objTrySendBlocking);
            BLog.w("PageNestedScrollFusionRepositoryKt$onOffsetChange$1-invokeSuspend$lambda$0", "[theseus-united-PageNestedScrollFusionRepositoryKt$onOffsetChange$1-invokeSuspend$lambda$0] appbar layout send change failure", (Throwable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AppBarLayout appBarLayout, AppBarLayout.OnOffsetChangedListener onOffsetChangedListener) {
        appBarLayout.removeOnOffsetChangedListener(onOffsetChangedListener);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageNestedScrollFusionRepositoryKt$onOffsetChange$1 pageNestedScrollFusionRepositoryKt$onOffsetChange$1 = new PageNestedScrollFusionRepositoryKt$onOffsetChange$1(this.$this_onOffsetChange, continuation);
        pageNestedScrollFusionRepositoryKt$onOffsetChange$1.L$0 = obj;
        return pageNestedScrollFusionRepositoryKt$onOffsetChange$1;
    }

    public final Object invoke(ProducerScope<? super Integer> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.ship.theseus.united.page.playingarea.d, com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final ?? r02 = new AppBarLayout.OnOffsetChangedListener(producerScope) { // from class: com.bilibili.ship.theseus.united.page.playingarea.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProducerScope f102359a;

                {
                    this.f102359a = producerScope;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout, int i8) {
                    PageNestedScrollFusionRepositoryKt$onOffsetChange$1.invokeSuspend$lambda$0(this.f102359a, appBarLayout, i8);
                }
            };
            this.$this_onOffsetChange.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) r02);
            final AppBarLayout appBarLayout = this.$this_onOffsetChange;
            Function0 function0 = new Function0(appBarLayout, r02) { // from class: com.bilibili.ship.theseus.united.page.playingarea.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AppBarLayout f102360a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final d f102361b;

                {
                    this.f102360a = appBarLayout;
                    this.f102361b = r02;
                }

                public final Object invoke() {
                    return PageNestedScrollFusionRepositoryKt$onOffsetChange$1.invokeSuspend$lambda$1(this.f102360a, this.f102361b);
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
