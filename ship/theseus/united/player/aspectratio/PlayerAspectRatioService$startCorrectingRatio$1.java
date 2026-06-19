package com.bilibili.ship.theseus.united.player.aspectratio;

import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/aspectratio/PlayerAspectRatioService$startCorrectingRatio$1.class */
public final class PlayerAspectRatioService$startCorrectingRatio$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlayerAspectRatioService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/aspectratio/PlayerAspectRatioService$startCorrectingRatio$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;
        final PlayerAspectRatioService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayerAspectRatioService playerAspectRatioService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playerAspectRatioService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r0 = r4
                int r0 = r0.label
                if (r0 != 0) goto L6c
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r4
                com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService r0 = r0.this$0
                r8 = r0
                r0 = r8
                tv.danmaku.biliplayerv2.service.IRenderContainerService r0 = r0.f104382e
                r7 = r0
                r0 = r7
                tv.danmaku.videoplayer.core.videoview.AspectRatio r0 = r0.getAspectRatio()
                r6 = r0
                r0 = r8
                lv0.a r0 = r0.f104379b
                com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription r0 = r0.a()
                r9 = r0
                r0 = r6
                r5 = r0
                r0 = r9
                if (r0 == 0) goto L61
                r0 = r6
                r5 = r0
                r0 = r9
                boolean r0 = r0.a()
                if (r0 == 0) goto L61
                r0 = r8
                com.bilibili.ship.theseus.united.page.screenstate.c r0 = r0.f104380c
                com.bilibili.ship.theseus.united.page.screenstate.c$a r0 = r0.h()
                boolean r0 = r0.f102988b
                if (r0 == 0) goto L5d
                r0 = r6
                tv.danmaku.videoplayer.core.videoview.AspectRatio r1 = tv.danmaku.videoplayer.core.videoview.AspectRatio.RATIO_4_3_INSIDE
                if (r0 == r1) goto L5d
                r0 = r6
                r5 = r0
                r0 = r6
                tv.danmaku.videoplayer.core.videoview.AspectRatio r1 = tv.danmaku.videoplayer.core.videoview.AspectRatio.RATIO_16_9_INSIDE
                if (r0 != r1) goto L61
            L5d:
                tv.danmaku.videoplayer.core.videoview.AspectRatio r0 = tv.danmaku.videoplayer.core.videoview.AspectRatio.RATIO_ADJUST_CONTENT
                r5 = r0
            L61:
                r0 = r7
                r1 = r5
                r0.setAspectRatio(r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L6c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerAspectRatioService$startCorrectingRatio$1(PlayerAspectRatioService playerAspectRatioService, Continuation<? super PlayerAspectRatioService$startCorrectingRatio$1> continuation) {
        super(2, continuation);
        this.this$0 = playerAspectRatioService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerAspectRatioService$startCorrectingRatio$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final StateFlow<PlayingAreaDescription> stateFlow = this.this$0.f104379b.f123389b;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>(stateFlow) { // from class: com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f104384a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/aspectratio/PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f104385a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/aspectratio/PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1$2$1.class */
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

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f104385a = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            r0 = r7
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            r11 = r0
                            r0 = r11
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r0 & r1
                            if (r0 == 0) goto L29
                            r0 = r11
                            r1 = r8
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            int r1 = r1 + r2
                            r0.label = r1
                            r0 = r11
                            r7 = r0
                            goto L33
                        L29:
                            com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r12 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r11 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r12
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto La0
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r12
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription r0 = (com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription) r0
                            r6 = r0
                            r0 = 0
                            r10 = r0
                            r0 = r10
                            r9 = r0
                            r0 = r6
                            if (r0 == 0) goto L82
                            r0 = r10
                            r9 = r0
                            r0 = r6
                            boolean r0 = r0.a()
                            r1 = 1
                            if (r0 != r1) goto L82
                            r0 = 1
                            r9 = r0
                        L82:
                            r0 = r9
                            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                            r6 = r0
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f104385a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r11
                            if (r0 != r1) goto La0
                            r0 = r11
                            return r0
                        La0:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService$startCorrectingRatio$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f104384a = stateFlow;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f104384a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
