package com.bilibili.ogv.pub.reserve;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import android.os.SystemClock;
import java.util.List;
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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$notifySubscribeCheckInterval$1.class */
final class VipReserveCacheManager$notifySubscribeCheckInterval$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $checkInterval;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ogv.pub.reserve.VipReserveCacheManager$notifySubscribeCheckInterval$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$notifySubscribeCheckInterval$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends l>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(List<l> list, Continuation<? super Unit> continuation) {
            return create(list, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            if (!list.isEmpty()) {
                long jA = ((l) list.get(0)).a();
                long jD = VipReserveCacheManager.d();
                AlarmManager alarmManager = VipReserveCacheManager.f71648b;
                PendingIntent pendingIntent = VipReserveCacheManager.f71647a;
                alarmManager.cancel(pendingIntent);
                long jElapsedRealtime = SystemClock.elapsedRealtime() + (jA - jD);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && !alarmManager.canScheduleExactAlarms()) {
                    alarmManager.set(2, jElapsedRealtime, pendingIntent);
                } else if (i7 < 31 || alarmManager.canScheduleExactAlarms()) {
                    alarmManager.setExactAndAllowWhileIdle(2, jElapsedRealtime, pendingIntent);
                } else {
                    BLog.i("SetExactAlarmHook", "setExactAndAllowWhileIdle(): can not schedule exact alarms");
                    alarmManager.setAndAllowWhileIdle(2, jElapsedRealtime, pendingIntent);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipReserveCacheManager$notifySubscribeCheckInterval$1(long j7, Continuation<? super VipReserveCacheManager$notifySubscribeCheckInterval$1> continuation) {
        super(2, continuation);
        this.$checkInterval = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveCacheManager$notifySubscribeCheckInterval$1(this.$checkInterval, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow flowDebounce = FlowKt.debounce(VipReserveCacheManager.f71650d, this.$checkInterval);
            Flow<List<? extends l>> flow = new Flow<List<? extends l>>(flowDebounce) { // from class: com.bilibili.ogv.pub.reserve.VipReserveCacheManager$notifySubscribeCheckInterval$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f71654a;

                /* JADX INFO: renamed from: com.bilibili.ogv.pub.reserve.VipReserveCacheManager$notifySubscribeCheckInterval$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$notifySubscribeCheckInterval$1$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f71655a;

                    /* JADX INFO: renamed from: com.bilibili.ogv.pub.reserve.VipReserveCacheManager$notifySubscribeCheckInterval$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$notifySubscribeCheckInterval$1$invokeSuspend$$inlined$map$1$2$1.class */
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
                        this.f71655a = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            Method dump skipped, instruction units count: 205
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.pub.reserve.VipReserveCacheManager$notifySubscribeCheckInterval$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f71654a = flowDebounce;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f71654a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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
