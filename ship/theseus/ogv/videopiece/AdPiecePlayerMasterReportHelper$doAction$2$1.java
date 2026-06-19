package com.bilibili.ship.theseus.ogv.videopiece;

import androidx.constraintlayout.widget.e;
import androidx.room.B;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.adcommon.data.model.AdBrandData;
import com.bilibili.gripper.api.ad.biz.videodetail.piece.IAdPieceReport;
import com.bilibili.ship.theseus.keel.player.q;
import com.bilibili.ship.theseus.ogv.videopiece.c;
import com.bilibili.ship.theseus.ogv.videopiece.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayerMasterReportHelper$doAction$2$1.class */
final class AdPiecePlayerMasterReportHelper$doAction$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final IAdPieceReport $reporter;
    final q<?> $this_run;
    final List<c.a> $triggerEvents;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayerMasterReportHelper$doAction$2$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayerMasterReportHelper$doAction$2$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IAdPieceReport $reporter;
        final q<?> $this_run;
        final List<c.a> $triggerEvents;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayerMasterReportHelper$doAction$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayerMasterReportHelper$doAction$2$1$1$1.class */
        public static final class C07511 extends SuspendLambda implements Function2<Duration, Continuation<? super Flow<? extends d>>, Object> {
            final List<c.a> $triggerEvents;
            long J$0;
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07511(c cVar, List<c.a> list, Continuation<? super C07511> continuation) {
                super(2, continuation);
                this.this$0 = cVar;
                this.$triggerEvents = list;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07511 c07511 = new C07511(this.this$0, this.$triggerEvents, continuation);
                c07511.J$0 = ((Duration) obj).unbox-impl();
                return c07511;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m9165invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
            }

            /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
            public final Object m9165invokeVtjQ1oo(long j7, Continuation<? super Flow<? extends d>> continuation) {
                return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long j7 = this.J$0;
                c cVar = this.this$0;
                List<c.a> list = this.$triggerEvents;
                cVar.getClass();
                for (c.a aVar : list) {
                    if (!c.a(cVar, j7, aVar.f94812b)) {
                        aVar.f94811a = false;
                    }
                }
                c cVar2 = this.this$0;
                List<c.a> list2 = this.$triggerEvents;
                cVar2.getClass();
                List<c.a> list3 = list2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (c.a(cVar2, j7, ((c.a) obj2).f94812b)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new d.C0756d(((c.a) it.next()).f94812b, j7));
                }
                return FlowKt.asFlow(arrayList2);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPiecePlayerMasterReportHelper$doAction$2$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPiecePlayerMasterReportHelper$doAction$2$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<d, Continuation<? super Unit>, Object> {
            final IAdPieceReport $reporter;
            final q<?> $this_run;
            final List<c.a> $triggerEvents;
            Object L$0;
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(c cVar, List<c.a> list, IAdPieceReport iAdPieceReport, q<?> qVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cVar;
                this.$triggerEvents = list;
                this.$reporter = iAdPieceReport;
                this.$this_run = qVar;
            }

            private static final Unit invokeSuspend$lambda$0(c.a aVar) {
                aVar.f94811a = true;
                aVar.f94813c++;
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$triggerEvents, this.$reporter, this.$this_run, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(d dVar, Continuation<? super Unit> continuation) {
                return create(dVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object next;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                d dVar = (d) this.L$0;
                if (dVar instanceof d.C0756d) {
                    AdBrandData adBrandData = ((d.C0756d) dVar).f94815b;
                    c cVar = this.this$0;
                    List<c.a> list = this.$triggerEvents;
                    cVar.getClass();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        c.a aVar = (c.a) next;
                        if (Intrinsics.areEqual(adBrandData, aVar.f94812b) && !aVar.f94811a) {
                            break;
                        }
                    }
                    c.a aVar2 = (c.a) next;
                    c.a aVar3 = null;
                    if (aVar2 != null) {
                        invokeSuspend$lambda$0(aVar2);
                        aVar3 = aVar2;
                    }
                    if (aVar3 != null) {
                        String brandName = adBrandData.getBrandName();
                        int i7 = aVar3.f94813c;
                        String str = Duration.toString-impl(dVar.f94814a);
                        String startTime = adBrandData.getStartTime();
                        String endTime = adBrandData.getEndTime();
                        StringBuilder sbA = e.a(i7, "doReport====>>>brandName==", brandName, "，第", "次,position:");
                        B.a(str, ",TimeRange:[", startTime, ",", sbA);
                        sbA.append(endTime);
                        sbA.append("]");
                        BLog.d("AdPiecePlayerMasterReportHelper", sbA.toString());
                        this.$reporter.reportMasterTime(adBrandData);
                    }
                    long j7 = this.$this_run.f91142c;
                    String str2 = Duration.toString-impl(dVar.f94814a);
                    String brandName2 = adBrandData.getBrandName();
                    String startTime2 = adBrandData.getStartTime();
                    String endTime2 = adBrandData.getEndTime();
                    StringBuilder sbA2 = n.a(j7, "cid:", ",position:", str2);
                    B.a(",brandName==", brandName2, ",TimeRange:[", startTime2, sbA2);
                    sbA2.append(",");
                    sbA2.append(endTime2);
                    sbA2.append("]");
                    BLog.d("AdPiecePlayerMasterReportHelper", sbA2.toString());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q<?> qVar, c cVar, List<c.a> list, IAdPieceReport iAdPieceReport, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_run = qVar;
            this.this$0 = cVar;
            this.$triggerEvents = list;
            this.$reporter = iAdPieceReport;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_run, this.this$0, this.$triggerEvents, this.$reporter, continuation);
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
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flatMapConcat(this.$this_run.f91144e.J(), new C07511(this.this$0, this.$triggerEvents, null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$triggerEvents, this.$reporter, this.$this_run, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdPiecePlayerMasterReportHelper$doAction$2$1(q<?> qVar, c cVar, List<c.a> list, IAdPieceReport iAdPieceReport, Continuation<? super AdPiecePlayerMasterReportHelper$doAction$2$1> continuation) {
        super(2, continuation);
        this.$this_run = qVar;
        this.this$0 = cVar;
        this.$triggerEvents = list;
        this.$reporter = iAdPieceReport;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdPiecePlayerMasterReportHelper$doAction$2$1 adPiecePlayerMasterReportHelper$doAction$2$1 = new AdPiecePlayerMasterReportHelper$doAction$2$1(this.$this_run, this.this$0, this.$triggerEvents, this.$reporter, continuation);
        adPiecePlayerMasterReportHelper$doAction$2$1.L$0 = obj;
        return adPiecePlayerMasterReportHelper$doAction$2$1;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$this_run, this.this$0, this.$triggerEvents, this.$reporter, null), 3, (Object) null);
    }
}
