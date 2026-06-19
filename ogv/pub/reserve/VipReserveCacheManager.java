package com.bilibili.ogv.pub.reserve;

import M3.C2577f;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.base.BiliContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager.class */
public final class VipReserveCacheManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PendingIntent f71647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AlarmManager f71648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f71649c = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final MutableSharedFlow<Long> f71650d = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy f71651e = LazyKt.lazy(new C2577f(4));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f71652f;

    /* JADX INFO: renamed from: com.bilibili.ogv.pub.reserve.VipReserveCacheManager$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.ogv.pub.reserve.VipReserveCacheManager$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<T> f71653a = (a<T>) new Object();

            public final Object emit(Object obj, Continuation continuation) {
                VipReserveCacheManager.b();
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCatch = FlowKt.catch(VipReserveDatabase.f71657a.e().i(), new VipReserveCacheStorage$watchAll$1(null));
                FlowCollector flowCollector = a.f71653a;
                this.label = 1;
                if (flowCatch.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$a.class */
    public static final class a extends BiliContext.ActivityStateCallback {
        public final void onForegroundActivitiesChanged(Activity activity, int i7, int i8) {
            super.onForegroundActivitiesChanged(activity, i7, i8);
            if (i7 <= 0 || i8 != 0) {
                return;
            }
            VipReserveCacheManager.a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$b.class */
    public static final class b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (Intrinsics.areEqual("com.bilibili.bangumi_reserve_timer_finish_action", intent.getAction())) {
                VipReserveCacheManager.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.base.BiliContext$ActivityStateCallback, com.bilibili.ogv.pub.reserve.VipReserveCacheManager$a] */
    static {
        PendingIntent broadcast;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver();
        f71652f = new BiliContext.ActivityStateCallback();
        Application application = Aj0.a.f317a;
        ContextCompat.registerReceiver(application, broadcastReceiver, new IntentFilter("com.bilibili.bangumi_reserve_timer_finish_action"), 2);
        Object systemService = ContextCompat.getSystemService(application, AlarmManager.class);
        if (systemService == null) {
            throw new IllegalArgumentException("Can not find system service for type ".concat(AlarmManager.class.getName()).toString());
        }
        f71648b = (AlarmManager) systemService;
        Intent intent = new Intent("com.bilibili.bangumi_reserve_timer_finish_action");
        intent.setPackage(application.getPackageName());
        Unit unit = Unit.INSTANCE;
        E00.e.a(intent, 335544320, application);
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                broadcast = PendingIntent.getBroadcast(application, 0, intent, 335544320);
            } catch (IllegalArgumentException e7) {
                broadcast = PendingIntent.getBroadcast(application, 0, intent, 369098752);
            }
        } else {
            broadcast = PendingIntent.getBroadcast(application, 0, intent, 335544320);
        }
        f71647a = broadcast;
        GlobalScope globalScope = GlobalScope.INSTANCE;
        BuildersKt.launch$default(globalScope, (CoroutineContext) null, (CoroutineStart) null, new VipReserveCacheManager$notifySubscribeCheckInterval$1(1000L, null), 3, (Object) null);
        BiliContext.registerActivityStateCallback(f71652f);
        BuildersKt.launch$default(globalScope, Dispatchers.getIO(), (CoroutineStart) null, new AnonymousClass2(null), 2, (Object) null);
    }

    public static void a() {
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new VipReserveCacheManager$checkCanDownloadFromReserveCache$2(null), 3, (Object) null);
    }

    public static void b() {
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new VipReserveCacheManager$checkStorageToStartReserveCacheCountdown$2(null), 3, (Object) null);
    }

    public static Pair c(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.f71680c == 1 && lVar.a() < d()) {
                    arrayList.add(lVar);
                    arrayList2.add(Long.valueOf(lVar.f71679b));
                }
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    public static long d() {
        long jNow = ServerClock.now();
        if (jNow <= 0) {
            jNow = System.currentTimeMillis();
        }
        return jNow;
    }
}
