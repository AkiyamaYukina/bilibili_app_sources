package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.collection.LongSparseArray;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ogv.pub.reserve.VipReserveCacheStorage;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2.class */
final class DownloadFloatLayerService$driveState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final OgvEpisode $firstAllowDownloadEpisode;
    final n0 $vm;
    private Object L$0;
    int label;
    final DownloadFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final OgvEpisode $firstAllowDownloadEpisode;
        final n0 $vm;
        int label;
        final DownloadFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var, OgvEpisode ogvEpisode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = downloadFloatLayerService;
            this.$vm = n0Var;
            this.$firstAllowDownloadEpisode = ogvEpisode;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$vm, this.$firstAllowDownloadEpisode, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                DownloadFloatLayerService downloadFloatLayerService = this.this$0;
                b0 b0Var = this.$vm.f92606a;
                OgvEpisode ogvEpisode = this.$firstAllowDownloadEpisode;
                this.label = 1;
                if (DownloadFloatLayerService.a(downloadFloatLayerService, b0Var, ogvEpisode, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            DownloadFloatLayerService downloadFloatLayerService2 = this.this$0;
            n0 n0Var = this.$vm;
            this.label = 2;
            if (DownloadFloatLayerService.b(downloadFloatLayerService2, n0Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final n0 $vm;
        int label;
        final DownloadFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DownloadFloatLayerService f92451a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final n0 f92452b;

            public a(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var) {
                this.f92451a = downloadFloatLayerService;
                this.f92452b = n0Var;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objB = DownloadFloatLayerService.b(this.f92451a, this.f92452b, continuation);
                if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objB = Unit.INSTANCE;
                }
                return objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = downloadFloatLayerService;
            this.$vm = n0Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$vm, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowC = VipReserveCacheStorage.c();
                a aVar = new a(this.this$0, this.$vm);
                this.label = 1;
                if (flowC.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final n0 $vm;
        int label;
        final DownloadFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n0 f92453a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DownloadFloatLayerService f92454b;

            public a(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var) {
                this.f92453a = n0Var;
                this.f92454b = downloadFloatLayerService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (((Lifecycle.State) obj) == Lifecycle.State.RESUMED) {
                    Iterator<d0> it = this.f92453a.f92611f.iterator();
                    while (it.hasNext()) {
                        c0 c0Var = it.next().f92545c;
                        if (c0Var != null) {
                            this.f92454b.d(c0Var);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = downloadFloatLayerService;
            this.$vm = n0Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$vm, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Lifecycle.State> currentStateFlow = this.this$0.f92433f.getCurrentStateFlow();
                a aVar = new a(this.this$0, this.$vm);
                this.label = 1;
                if (currentStateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final n0 $vm;
        int label;
        final DownloadFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<LongSparseArray<com.bilibili.ship.theseus.ogv.intro.download.service.b>, Continuation<? super Unit>, Object> {
            final n0 $vm;
            Object L$0;
            int label;
            final DownloadFloatLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = downloadFloatLayerService;
                this.$vm = n0Var;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(LongSparseArray<com.bilibili.ship.theseus.ogv.intro.download.service.b> longSparseArray, Continuation<? super Unit> continuation) {
                return create(longSparseArray, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    Method dump skipped, instruction units count: 215
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = downloadFloatLayerService;
            this.$vm = n0Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$vm, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                DownloadFloatLayerService downloadFloatLayerService = this.this$0;
                com.bilibili.ship.theseus.ogv.intro.download.service.f fVar = downloadFloatLayerService.f92439m;
                final long j7 = downloadFloatLayerService.f92431d.f94449a;
                final StateFlow<com.bilibili.ship.theseus.ogv.intro.download.service.c> stateFlowA = fVar.f92409b.a();
                Flow<LongSparseArray<com.bilibili.ship.theseus.ogv.intro.download.service.b>> flow = new Flow<LongSparseArray<com.bilibili.ship.theseus.ogv.intro.download.service.b>>(stateFlowA, j7) { // from class: com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final StateFlow f92375a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final long f92376b;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f92377a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final long f92378b;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1$2$1.class */
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

                        public AnonymousClass2(FlowCollector flowCollector, long j7) {
                            this.f92377a = flowCollector;
                            this.f92378b = j7;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                            /*
                                r6 = this;
                                r0 = r8
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r8
                                com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r10 = r0
                                r0 = r10
                                int r0 = r0.label
                                r9 = r0
                                r0 = r9
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r10
                                r1 = r9
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r10
                                r8 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r6
                                r3 = r8
                                r1.<init>(r2, r3)
                                r8 = r0
                            L33:
                                r0 = r8
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r11 = r0
                                r0 = r8
                                int r0 = r0.label
                                r9 = r0
                                r0 = r9
                                if (r0 == 0) goto L5e
                                r0 = r9
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto La4
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r7
                                com.bilibili.ship.theseus.ogv.intro.download.service.c r0 = (com.bilibili.ship.theseus.ogv.intro.download.service.c) r0
                                java.util.HashMap<java.lang.String, androidx.collection.LongSparseArray<com.bilibili.ship.theseus.ogv.intro.download.service.b>> r0 = r0.f92403a
                                r1 = r6
                                long r1 = r1.f92378b
                                java.lang.String r1 = java.lang.String.valueOf(r1)
                                java.lang.Object r0 = r0.get(r1)
                                androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0
                                r10 = r0
                                r0 = r10
                                r7 = r0
                                r0 = r10
                                if (r0 != 0) goto L8c
                                androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
                                r1 = r0
                                r2 = 0
                                r3 = 1
                                r4 = 0
                                r1.<init>(r2, r3, r4)
                                r7 = r0
                            L8c:
                                r0 = r8
                                r1 = 1
                                r0.label = r1
                                r0 = r6
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f92377a
                                r1 = r7
                                r2 = r8
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r11
                                if (r0 != r1) goto La4
                                r0 = r11
                                return r0
                            La4:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadManager$getSeasonDownloadStateFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f92375a = stateFlowA;
                        this.f92376b = j7;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f92375a.collect(new AnonymousClass2(flowCollector, this.f92376b), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$driveState$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$driveState$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        Object L$1;
        int label;
        final DownloadFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(DownloadFloatLayerService downloadFloatLayerService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = downloadFloatLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            com.bilibili.ship.theseus.keel.player.h hVar;
            com.bilibili.player.tangram.basic.d dVar;
            com.bilibili.player.tangram.basic.d dVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                com.bilibili.ship.theseus.keel.player.h hVar2 = this.this$0.f92434g;
                hVar2.h(coroutineScope3);
                try {
                    this.L$0 = hVar2;
                    this.L$1 = coroutineScope3;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope3;
                    dVar2 = hVar2;
                } catch (Throwable th) {
                    th = th;
                    coroutineScope = coroutineScope3;
                    hVar = hVar2;
                    hVar.i(coroutineScope);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$1;
                com.bilibili.player.tangram.basic.d dVar3 = (com.bilibili.player.tangram.basic.d) this.L$0;
                coroutineScope = coroutineScope2;
                dVar = dVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    dVar2 = dVar3;
                } catch (Throwable th2) {
                    th = th2;
                    hVar = dVar == true ? 1 : 0;
                    hVar.i(coroutineScope);
                    throw th;
                }
            }
            KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
            coroutineScope = coroutineScope2;
            dVar = dVar2 == true ? 1 : 0;
            throw kotlinNothingValueException;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$driveState$2(DownloadFloatLayerService downloadFloatLayerService, n0 n0Var, OgvEpisode ogvEpisode, Continuation<? super DownloadFloatLayerService$driveState$2> continuation) {
        super(2, continuation);
        this.this$0 = downloadFloatLayerService;
        this.$vm = n0Var;
        this.$firstAllowDownloadEpisode = ogvEpisode;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DownloadFloatLayerService$driveState$2 downloadFloatLayerService$driveState$2 = new DownloadFloatLayerService$driveState$2(this.this$0, this.$vm, this.$firstAllowDownloadEpisode, continuation);
        downloadFloatLayerService$driveState$2.L$0 = obj;
        return downloadFloatLayerService$driveState$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$vm, this.$firstAllowDownloadEpisode, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$vm, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$vm, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$vm, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, null), 3, (Object) null);
    }
}
