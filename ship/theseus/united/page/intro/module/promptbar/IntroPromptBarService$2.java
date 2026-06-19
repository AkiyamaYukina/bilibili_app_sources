package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import android.widget.FrameLayout;
import com.bilibili.ship.theseus.united.page.intro.module.promptbar.c;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$2.class */
final class IntroPromptBarService$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Flow<c.a> $viewsFlow;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$2$4.class */
    public static final /* synthetic */ class AnonymousClass4 extends AdaptedFunctionReference implements Function3<FrameLayout, Boolean, Continuation<? super Pair<? extends FrameLayout, ? extends Boolean>>, Object>, SuspendFunction {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(FrameLayout frameLayout, boolean z6, Continuation<Pair<FrameLayout, Boolean>> continuation) {
            return IntroPromptBarService$2.invokeSuspend$lambda$1(frameLayout, z6, continuation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((FrameLayout) obj, ((Boolean) obj2).booleanValue(), (Continuation<Pair<FrameLayout, Boolean>>) obj3);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f100686a = (a<T>) new Object();

        public final Object emit(Object obj, Continuation continuation) {
            Unit unit;
            Pair pair = (Pair) obj;
            FrameLayout frameLayout = (FrameLayout) pair.component1();
            boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
            if (frameLayout == null) {
                unit = Unit.INSTANCE;
            } else {
                frameLayout.setVisibility(zBooleanValue ? 0 : 8);
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPromptBarService$2(Flow<c.a> flow, c cVar, Continuation<IntroPromptBarService$2> continuation) {
        super(2, continuation);
        this.$viewsFlow = flow;
        this.this$0 = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$1(FrameLayout frameLayout, boolean z6, Continuation continuation) {
        return new Pair(frameLayout, Boxing.boxBoolean(z6));
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IntroPromptBarService$2(this.$viewsFlow, this.this$0, continuation);
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
            Flow flowCombine = FlowKt.combine(new Flow<FrameLayout>(flow) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f100687a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$2$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f100688a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$2$invokeSuspend$$inlined$map$1$2$1.class */
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
                        this.f100688a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1$2$1
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
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f100688a
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
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarService$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f100687a = flow;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f100687a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, this.this$0.f100709m, AnonymousClass4.INSTANCE);
            FlowCollector flowCollector = a.f100686a;
            this.label = 1;
            if (flowCombine.collect(flowCollector, this) == coroutine_suspended) {
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
