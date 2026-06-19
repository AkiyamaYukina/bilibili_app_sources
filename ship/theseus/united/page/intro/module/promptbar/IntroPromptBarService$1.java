package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import android.widget.FrameLayout;
import com.bilibili.app.gemini.ui.UIComponentKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.intro.module.promptbar.c;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$1.class */
final class IntroPromptBarService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Flow<c.a> $viewsFlow;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function4<FrameLayout, PromptBarVo, PlayerAvailability, Continuation<? super Pair<? extends FrameLayout, ? extends PromptBarVo>>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass2(Continuation<AnonymousClass2> continuation) {
            super(4, continuation);
        }

        public final Object invoke(FrameLayout frameLayout, PromptBarVo promptBarVo, PlayerAvailability playerAvailability, Continuation<Pair<FrameLayout, PromptBarVo>> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = frameLayout;
            anonymousClass2.L$1 = promptBarVo;
            anonymousClass2.L$2 = playerAvailability;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FrameLayout frameLayout = (FrameLayout) this.L$0;
            PromptBarVo promptBarVo = (PromptBarVo) this.L$1;
            PlayerAvailability playerAvailability = (PlayerAvailability) this.L$2;
            boolean z6 = true;
            if (playerAvailability != PlayerAvailability.READY) {
                z6 = true;
                if (playerAvailability != PlayerAvailability.LOADING) {
                    z6 = playerAvailability == PlayerAvailability.FORBIDDEN && promptBarVo != null && promptBarVo.h();
                }
            }
            if (frameLayout == null || promptBarVo == null || !z6) {
                return null;
            }
            return TuplesKt.to(frameLayout, promptBarVo);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Pair<? extends FrameLayout, ? extends PromptBarVo>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$1$3$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f100683a;

            static {
                int[] iArr = new int[PromptBarVo.Type.values().length];
                try {
                    iArr[PromptBarVo.Type.Pay.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[PromptBarVo.Type.Activation.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f100683a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, Continuation<AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(Pair<FrameLayout, PromptBarVo> pair, Continuation<Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                if (pair == null) {
                    return Unit.INSTANCE;
                }
                FrameLayout frameLayout = (FrameLayout) pair.component1();
                PromptBarVo promptBarVo = (PromptBarVo) pair.component2();
                int i8 = a.f100683a[promptBarVo.l().ordinal()];
                if (i8 == 1) {
                    c cVar = this.this$0;
                    this.label = 1;
                    if (c.a(cVar, frameLayout, promptBarVo, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c cVar2 = this.this$0;
                    this.label = 2;
                    cVar2.getClass();
                    Object objB = UIComponentKt.b(new w(promptBarVo, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new b(promptBarVo, cVar2)), new He.k(cVar2, 2)), frameLayout.getContext(), frameLayout, new IntroPromptBarService$keepPromptActiveBarDisplaying$2(frameLayout, null), this, 4);
                    if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objB = Unit.INSTANCE;
                    }
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPromptBarService$1(Flow<c.a> flow, c cVar, Continuation<IntroPromptBarService$1> continuation) {
        super(2, continuation);
        this.$viewsFlow = flow;
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IntroPromptBarService$1(this.$viewsFlow, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow<c.a> flow = this.$viewsFlow;
            Flow<FrameLayout> flow2 = new Flow<FrameLayout>(flow) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f100684a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$1$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f100685a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$1$invokeSuspend$$inlined$map$1$2$1.class */
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
                        this.f100685a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            r9 = r0
                            r0 = r9
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r0 & r1
                            if (r0 == 0) goto L29
                            r0 = r9
                            r1 = r8
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            int r1 = r1 + r2
                            r0.label = r1
                            r0 = r9
                            r7 = r0
                            goto L33
                        L29:
                            com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r10 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r9 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r10
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L8e
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r10
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            com.bilibili.ship.theseus.united.page.intro.module.promptbar.c$a r0 = (com.bilibili.ship.theseus.united.page.intro.module.promptbar.c.a) r0
                            r6 = r0
                            r0 = r6
                            if (r0 == 0) goto L74
                            r0 = r6
                            android.widget.FrameLayout r0 = r0.f100710a
                            r6 = r0
                            goto L76
                        L74:
                            r0 = 0
                            r6 = r0
                        L76:
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f100685a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r9
                            if (r0 != r1) goto L8e
                            r0 = r9
                            return r0
                        L8e:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f100684a = flow;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f100684a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            c cVar = this.this$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(flow2, cVar.f100708l, cVar.f100705i.f91107a.f79286c, new AnonymousClass2(null)));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
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
