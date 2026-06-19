package com.bilibili.pegasus.holders.bannerv8;

import java.util.concurrent.CancellationException;
import kotlin.Result;
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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/AdTopBannerSelector$collectSelectedSplashId$1.class */
final class AdTopBannerSelector$collectSelectedSplashId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdTopBannerSelector$collectSelectedSplashId$1(c cVar, Continuation<? super AdTopBannerSelector$collectSelectedSplashId$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdTopBannerSelector$collectSelectedSplashId$1 adTopBannerSelector$collectSelectedSplashId$1 = new AdTopBannerSelector$collectSelectedSplashId$1(this.this$0, continuation);
        adTopBannerSelector$collectSelectedSplashId$1.L$0 = obj;
        return adTopBannerSelector$collectSelectedSplashId$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = this.this$0;
                Result.Companion companion = Result.Companion;
                final StateFlow state = cVar.f77726b.getState();
                final Flow flowTakeWhile = FlowKt.takeWhile(new Flow<Long>(state) { // from class: com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final StateFlow f77678a;

                    /* JADX INFO: renamed from: com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f77679a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.class */
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
                            this.f77679a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                Method dump skipped, instruction units count: 338
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f77678a = state;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f77678a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new AdTopBannerSelector$collectSelectedSplashId$1$1$2(cVar, null));
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Long>(flowTakeWhile) { // from class: com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f77676a;

                    /* JADX INFO: renamed from: com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f77677a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1.class */
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

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f77677a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1 r0 = (com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1 r0 = new com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1
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
                                goto L87
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
                                java.lang.Number r0 = (java.lang.Number) r0
                                long r0 = r0.longValue()
                                r1 = 0
                                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                if (r0 <= 0) goto L87
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f77677a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L87
                                r0 = r9
                                return r0
                            L87:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.AdTopBannerSelector$collectSelectedSplashId$1$invokeSuspend$lambda$0$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f77676a = flowTakeWhile;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f77676a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AdTopBannerSelector$collectSelectedSplashId$1$1$4 adTopBannerSelector$collectSelectedSplashId$1$1$4 = new AdTopBannerSelector$collectSelectedSplashId$1$1$4(cVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, adTopBannerSelector$collectSelectedSplashId$1$1$4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj2);
        if (th2 != null && !(th2 instanceof CancellationException)) {
            BLog.e("AdTopBannerSelector", "collectSelectedSplashId error: ", th2);
        }
        return Unit.INSTANCE;
    }
}
