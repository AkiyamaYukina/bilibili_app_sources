package com.bilibili.ship.theseus.ogv.videopiece;

import com.bilibili.gripper.api.ad.biz.videodetail.piece.IAdPieceReport;
import com.bilibili.ship.theseus.keel.player.q;
import com.bilibili.ship.theseus.ogv.videopiece.d;
import java.util.ArrayList;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayReportModule$provide$1$3.class */
final class AdPiecePlayReportModule$provide$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IPlayerCoreService $playerCoreService;
    final IAdPieceReport $reporter;
    final Set<d> $targetBucket;
    final q<?> $this_RunWithVideoPiece;
    final Set<Pair<d, Integer>> $triggeredSet;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayReportModule$provide$1$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IPlayerCoreService $playerCoreService;
        final IAdPieceReport $reporter;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayReportModule$provide$1$3$1$1.class */
        public static final class C07501 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final IAdPieceReport $reporter;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07501(IAdPieceReport iAdPieceReport, Continuation<? super C07501> continuation) {
                super(2, continuation);
                this.$reporter = iAdPieceReport;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07501 c07501 = new C07501(this.$reporter, continuation);
                c07501.I$0 = ((Number) obj).intValue();
                return c07501;
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
                if (i7 == 4) {
                    this.$reporter.startRecordStayTime();
                } else if (i7 == 5) {
                    this.$reporter.reportStayTime();
                }
                bilibili.live.app.service.resolver.c.a(i7, "PlayerState==>state:", "AdPiecePlayReportModule");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IPlayerCoreService iPlayerCoreService, IAdPieceReport iAdPieceReport, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playerCoreService = iPlayerCoreService;
            this.$reporter = iAdPieceReport;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playerCoreService, this.$reporter, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowE = IPlayerCoreServiceKtxKt.e(this.$playerCoreService);
                C07501 c07501 = new C07501(this.$reporter, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowE, c07501, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayReportModule$provide$1$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IAdPieceReport $reporter;
        final Set<d> $targetBucket;
        final q<?> $this_RunWithVideoPiece;
        final Set<Pair<d, Integer>> $triggeredSet;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayReportModule$provide$1$3$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Duration, Continuation<? super Flow<? extends d>>, Object> {
            final Set<d> $targetBucket;
            long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Set<d> set, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$targetBucket = set;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetBucket, continuation);
                anonymousClass1.J$0 = ((Duration) obj).unbox-impl();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m9164invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
            }

            /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
            public final Object m9164invokeVtjQ1oo(long j7, Continuation<? super Flow<? extends d>> continuation) {
                return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long j7 = this.J$0;
                Set<d> set = this.$targetBucket;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    long j8 = ((d) obj2).f94814a;
                    Duration.Companion companion = Duration.Companion;
                    DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                    if (Duration.compareTo-LRDsOJo(j7, Duration.minus-LRDsOJo(j8, DurationKt.toDuration(500L, durationUnit))) >= 0 && Duration.compareTo-LRDsOJo(j7, Duration.plus-LRDsOJo(j8, DurationKt.toDuration(500L, durationUnit))) < 0) {
                        arrayList.add(obj2);
                    }
                }
                return FlowKt.asFlow(CollectionsKt.toSet(arrayList));
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayReportModule$provide$1$3$2$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<d, Continuation<? super Unit>, Object> {
            final IAdPieceReport $reporter;
            final q<?> $this_RunWithVideoPiece;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(IAdPieceReport iAdPieceReport, q<?> qVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$reporter = iAdPieceReport;
                this.$this_RunWithVideoPiece = qVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reporter, this.$this_RunWithVideoPiece, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            public final Object invoke(d dVar, Continuation<? super Unit> continuation) {
                return create(dVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                d dVar = (d) this.L$0;
                if (dVar instanceof d.b) {
                    d.b bVar = (d.b) dVar;
                    if (bVar instanceof d.b.e) {
                        this.$reporter.startRecordStayTime();
                        this.$reporter.reportShow();
                        this.$reporter.reportVideoPlay();
                        this.$reporter.reportVideoP0();
                    } else if (bVar instanceof d.b.c) {
                        this.$reporter.reportVideoS3();
                    } else if (bVar instanceof d.b.C0753d) {
                        this.$reporter.reportVideoS5();
                    } else if (bVar instanceof d.b.a) {
                        this.$reporter.reportVideoS10();
                    } else {
                        if (!(bVar instanceof d.b.C0752b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.$reporter.reportVideoS15();
                    }
                }
                if (dVar instanceof d.c) {
                    d.c cVar = (d.c) dVar;
                    if (cVar instanceof d.c.b) {
                        this.$reporter.reportVideoP25();
                    } else if (cVar instanceof d.c.C0754c) {
                        this.$reporter.reportVideoP50();
                    } else if (cVar instanceof d.c.C0755d) {
                        this.$reporter.reportVideoP75();
                    } else {
                        if (!(cVar instanceof d.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.$reporter.reportVideoP100();
                    }
                }
                if (dVar instanceof d.a) {
                    this.$reporter.reportVideoCustomTime(Duration.toInt-impl(dVar.f94814a, DurationUnit.SECONDS));
                }
                long j7 = this.$this_RunWithVideoPiece.f91142c;
                String str = Duration.toString-impl(dVar.f94814a);
                StringBuilder sb = new StringBuilder("stage:");
                sb.append(dVar);
                sb.append(" ===> cid:");
                sb.append(j7);
                com.bilibili.app.dialogmanager2.b.b(",position:", str, "AdPiecePlayReportModule", sb);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(q<?> qVar, IAdPieceReport iAdPieceReport, Set<d> set, Set<Pair<d, Integer>> set2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_RunWithVideoPiece = qVar;
            this.$reporter = iAdPieceReport;
            this.$targetBucket = set;
            this.$triggeredSet = set2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_RunWithVideoPiece, this.$reporter, this.$targetBucket, this.$triggeredSet, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flatMapConcat(this.$this_RunWithVideoPiece.f91144e.J(), new AnonymousClass1(this.$targetBucket, null)));
                    final Set<Pair<d, Integer>> set = this.$triggeredSet;
                    final q<?> qVar = this.$this_RunWithVideoPiece;
                    Flow<d> flow = new Flow<d>(flowDistinctUntilChanged, set, qVar) { // from class: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Flow f94769a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Set f94770b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final q f94771c;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1$2.class */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final FlowCollector f94772a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Set f94773b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final q f94774c;

                            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1$2$1.class */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
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

                            public AnonymousClass2(FlowCollector flowCollector, Set set, q qVar) {
                                this.f94772a = flowCollector;
                                this.f94773b = set;
                                this.f94774c = qVar;
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
                                    boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L29
                                    r0 = r7
                                    com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                                    com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1$2$1
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
                                    goto L9c
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
                                    com.bilibili.ship.theseus.ogv.videopiece.d r0 = (com.bilibili.ship.theseus.ogv.videopiece.d) r0
                                    r10 = r0
                                    r0 = r5
                                    java.util.Set r0 = r0.f94773b
                                    r1 = r10
                                    r2 = r5
                                    com.bilibili.ship.theseus.keel.player.q r2 = r2.f94774c
                                    int r2 = r2.f91140a
                                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
                                    kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
                                    boolean r0 = r0.add(r1)
                                    if (r0 == 0) goto L9c
                                    r0 = r7
                                    r1 = 1
                                    r0.label = r1
                                    r0 = r5
                                    kotlinx.coroutines.flow.FlowCollector r0 = r0.f94772a
                                    r1 = r6
                                    r2 = r7
                                    java.lang.Object r0 = r0.emit(r1, r2)
                                    r1 = r9
                                    if (r0 != r1) goto L9c
                                    r0 = r9
                                    return r0
                                L9c:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayReportModule$provide$1$3$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        {
                            this.f94769a = flowDistinctUntilChanged;
                            this.f94770b = set;
                            this.f94771c = qVar;
                        }

                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = this.f94769a.collect(new AnonymousClass2(flowCollector, this.f94770b, this.f94771c), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reporter, qVar, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.label = 2;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.$reporter.reportStayTime();
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdPiecePlayReportModule$provide$1$3(IPlayerCoreService iPlayerCoreService, IAdPieceReport iAdPieceReport, q<?> qVar, Set<d> set, Set<Pair<d, Integer>> set2, Continuation<? super AdPiecePlayReportModule$provide$1$3> continuation) {
        super(2, continuation);
        this.$playerCoreService = iPlayerCoreService;
        this.$reporter = iAdPieceReport;
        this.$this_RunWithVideoPiece = qVar;
        this.$targetBucket = set;
        this.$triggeredSet = set2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdPiecePlayReportModule$provide$1$3 adPiecePlayReportModule$provide$1$3 = new AdPiecePlayReportModule$provide$1$3(this.$playerCoreService, this.$reporter, this.$this_RunWithVideoPiece, this.$targetBucket, this.$triggeredSet, continuation);
        adPiecePlayReportModule$provide$1$3.L$0 = obj;
        return adPiecePlayReportModule$provide$1$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$playerCoreService, this.$reporter, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$this_RunWithVideoPiece, this.$reporter, this.$targetBucket, this.$triggeredSet, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
