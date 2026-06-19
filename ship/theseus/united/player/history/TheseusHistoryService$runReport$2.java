package com.bilibili.ship.theseus.united.player.history;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2.class */
final class TheseusHistoryService$runReport$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.Z$0);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $backgroundReportInterval;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$2$2.class */
        public static final class C11652 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final long $backgroundReportInterval;
            long J$0;
            Object L$0;
            boolean Z$0;
            int label;
            final b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11652(long j7, b bVar, Continuation<? super C11652> continuation) {
                super(2, continuation);
                this.$backgroundReportInterval = j7;
                this.this$0 = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11652 c11652 = new C11652(this.$backgroundReportInterval, this.this$0, continuation);
                c11652.Z$0 = ((Boolean) obj).booleanValue();
                return c11652;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:18:0x006e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r12 = r0
                    r0 = r4
                    int r0 = r0.label
                    r6 = r0
                    r0 = r6
                    if (r0 == 0) goto L36
                    r0 = r6
                    r1 = 1
                    if (r0 != r1) goto L2c
                    r0 = r4
                    long r0 = r0.J$0
                    r9 = r0
                    r0 = r4
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.ship.theseus.united.player.history.b r0 = (com.bilibili.ship.theseus.united.player.history.b) r0
                    r11 = r0
                    r0 = r5
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r11
                    r5 = r0
                    goto L6e
                L2c:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L36:
                    r0 = r5
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r4
                    boolean r0 = r0.Z$0
                    if (r0 != 0) goto L45
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L45:
                    r0 = r4
                    long r0 = r0.$backgroundReportInterval
                    r7 = r0
                    r0 = r4
                    com.bilibili.ship.theseus.united.player.history.b r0 = r0.this$0
                    r5 = r0
                L4f:
                    r0 = r4
                    r1 = r5
                    r0.L$0 = r1
                    r0 = r4
                    r1 = r7
                    r0.J$0 = r1
                    r0 = r4
                    r1 = 1
                    r0.label = r1
                    r0 = r7
                    r9 = r0
                    r0 = r7
                    r1 = r4
                    java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
                    r1 = r12
                    if (r0 != r1) goto L6e
                    r0 = r12
                    return r0
                L6e:
                    java.lang.String r0 = "TheseusHistoryService$runReport$2$2$2-invokeSuspend"
                    java.lang.String r1 = "[theseus-united-TheseusHistoryService$runReport$2$2$2-invokeSuspend] Interval when playing in background."
                    tv.danmaku.android.log.BLog.i(r0, r1)
                    r0 = r5
                    com.bilibili.ship.theseus.united.player.history.b.b(r0)
                    r0 = r9
                    r7 = r0
                    goto L4f
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass2.C11652.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, long j7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$backgroundReportInterval = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$backgroundReportInterval, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<Lifecycle.State> currentStateFlow = this.this$0.f104473b.getCurrentStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>(currentStateFlow) { // from class: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final StateFlow f104464a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f104465a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f104465a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r10 = r0
                                r0 = r10
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r10
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r10
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r11 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r10 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r11
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L97
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r11
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
                                int r0 = r0.compareTo(r1)
                                if (r0 >= 0) goto L76
                                r0 = 1
                                r9 = r0
                                goto L79
                            L76:
                                r0 = 0
                                r9 = r0
                            L79:
                                r0 = r9
                                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                                r6 = r0
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f104465a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r10
                                if (r0 != r1) goto L97
                                r0 = r10
                                return r0
                            L97:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f104464a = currentStateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f104464a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                C11652 c11652 = new C11652(this.$backgroundReportInterval, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, c11652, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$3$1.class */
        public static final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f104466a;

            public AnonymousClass1(b bVar) {
                this.f104466a = bVar;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(androidx.lifecycle.Lifecycle.Event r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws kotlin.NoWhenBranchMatchedException {
                /*
                    r5 = this;
                    r0 = r7
                    boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1
                    if (r0 == 0) goto L29
                    r0 = r7
                    com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1 r0 = (com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1) r0
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
                    com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1 r0 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$3$1$emit$1
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r2, r3)
                    r7 = r0
                L33:
                    r0 = r7
                    java.lang.Object r0 = r0.result
                    r9 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r10 = r0
                    r0 = r7
                    int r0 = r0.label
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto L5e
                    r0 = r8
                    r1 = 1
                    if (r0 != r1) goto L54
                    r0 = r9
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L7b
                L54:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L5e:
                    r0 = r9
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r6
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                    if (r0 != r1) goto L89
                    r0 = r7
                    r1 = 1
                    r0.label = r1
                    r0 = r7
                    java.lang.Object r0 = kotlinx.coroutines.YieldKt.yield(r0)
                    r1 = r10
                    if (r0 != r1) goto L7b
                    r0 = r10
                    return r0
                L7b:
                    java.lang.String r0 = "TheseusHistoryService$runReport$2$3$1-emit"
                    java.lang.String r1 = "[theseus-united-TheseusHistoryService$runReport$2$3$1-emit] Lifecycle onPause."
                    tv.danmaku.android.log.BLog.i(r0, r1)
                    r0 = r5
                    com.bilibili.ship.theseus.united.player.history.b r0 = r0.f104466a
                    com.bilibili.ship.theseus.united.player.history.b.b(r0)
                L89:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2.AnonymousClass3.AnonymousClass1.emit(androidx.lifecycle.Lifecycle$Event, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(b bVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f104473b);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                if (eventFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f104467a;

            public a(b bVar) {
                this.f104467a = bVar;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                PlayerAvailability playerAvailability = (PlayerAvailability) obj;
                if (playerAvailability == PlayerAvailability.COMPLETED || playerAvailability == PlayerAvailability.FORBIDDEN) {
                    defpackage.a.b("[theseus-united-TheseusHistoryService$runReport$2$4$1-emit] ", "Availability " + playerAvailability, "TheseusHistoryService$runReport$2$4$1-emit");
                    this.f104467a.a(Long.MIN_VALUE);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(b bVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<PlayerAvailability> flowD = this.this$0.f104477f.d();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowD.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            boolean Z$1;
            int label;
            final b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(b bVar, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
            }

            public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = z6;
                anonymousClass1.Z$1 = z7;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                boolean z7 = this.Z$1;
                if (this.this$0.f104476e.isBackgroundRunning() && z6 && !z7 && this.this$0.f104473b.getCurrentState() == Lifecycle.State.CREATED) {
                    this.this$0.a(4L);
                }
                return Boxing.boxBoolean(z7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(b bVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowD = CompoundPlayStateProviderKt.d(this.this$0.f104472a);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.reduce(flowD, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/TheseusHistoryService$runReport$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(b bVar, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                BLog.i("TheseusHistoryService$runReport$2$6-invokeSuspend", "[theseus-united-TheseusHistoryService$runReport$2$6-invokeSuspend] Leaving.");
                this.this$0.a(Long.MIN_VALUE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusHistoryService$runReport$2(b bVar, Continuation<? super TheseusHistoryService$runReport$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusHistoryService$runReport$2 theseusHistoryService$runReport$2 = new TheseusHistoryService$runReport$2(this.this$0, continuation);
        theseusHistoryService$runReport$2.L$0 = obj;
        return theseusHistoryService$runReport$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Flow<Boolean> flowD = CompoundPlayStateProviderKt.d(this.this$0.f104472a);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (FlowKt.first(flowD, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
        }
        long j7 = 1000;
        Long longOrNull = StringsKt.toLongOrNull(ConfigManager.Companion.getConfig("videodetail.player_history_report_interval", "0"));
        long jLongValue = j7 * (longOrNull != null ? longOrNull.longValue() : 0L);
        if (jLongValue > 0) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, jLongValue, null), 3, (Object) null);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, null), 3, (Object) null);
    }
}
