package com.bilibili.ogv.misc.reserve;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.snapshots.C4340n;
import com.bilibili.ogv.pub.reserve.ReserveVerify;
import com.bilibili.ogv.pub.reserve.VipReserveCacheStorage;
import com.bilibili.ogv.pub.reserve.VipReserveDatabase;
import com.bilibili.okretro.ServiceGenerator;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/ReserveListActivity$initData$1.class */
final class ReserveListActivity$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ReserveListActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReserveListActivity$initData$1(ReserveListActivity reserveListActivity, Continuation<? super ReserveListActivity$initData$1> continuation) {
        super(2, continuation);
        this.this$0 = reserveListActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ReserveListActivity reserveListActivity) {
        int i7 = ReserveListActivity.f69165O;
        reserveListActivity.R6();
        reserveListActivity.T6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(ReserveListActivity reserveListActivity) {
        int i7 = ReserveListActivity.f69165O;
        reserveListActivity.R6();
        reserveListActivity.T6();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReserveListActivity$initData$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objA = VipReserveCacheStorage.a(this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final List list = (List) obj;
        if (list.isEmpty()) {
            final ReserveListActivity reserveListActivity = this.this$0;
            FrameLayout frameLayout = reserveListActivity.f69170H;
            if (frameLayout != null) {
                Boxing.boxBoolean(frameLayout.post(new Runnable(reserveListActivity) { // from class: com.bilibili.ogv.misc.reserve.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ReserveListActivity f69189a;

                    {
                        this.f69189a = reserveListActivity;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ReserveListActivity$initData$1.invokeSuspend$lambda$0(this.f69189a);
                    }
                }));
            }
            return Unit.INSTANCE;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((com.bilibili.ogv.pub.reserve.l) it.next()).f71679b + ",");
        }
        if (sb.length() == 0) {
            final ReserveListActivity reserveListActivity2 = this.this$0;
            ViewGroup viewGroup = reserveListActivity2.f69167E;
            if (viewGroup != null) {
                Boxing.boxBoolean(viewGroup.post(new Runnable(reserveListActivity2) { // from class: com.bilibili.ogv.misc.reserve.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ReserveListActivity f69190a;

                    {
                        this.f69190a = reserveListActivity2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ReserveListActivity$initData$1.invokeSuspend$lambda$2(this.f69190a);
                    }
                }));
            }
            return Unit.INSTANCE;
        }
        M4.a.a(1, sb);
        final ReserveListActivity reserveListActivity3 = this.this$0;
        String string = sb.toString();
        int i8 = ReserveListActivity.f69165O;
        reserveListActivity3.getClass();
        Single singleObserveOn = ((com.bilibili.ogv.pub.reserve.b) ServiceGenerator.createService(com.bilibili.ogv.pub.reserve.b.class)).reserveVerifyRx(string).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(singleObserveOn.subscribe(new Consumer(reserveListActivity3, list) { // from class: com.bilibili.ogv.misc.reserve.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ReserveListActivity f69186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f69187b;

            {
                this.f69186a = reserveListActivity3;
                this.f69187b = list;
            }

            public final void accept(Object obj2) {
                String message;
                StringBuilder sb2;
                Throwable th;
                List<com.bilibili.ogv.pub.reserve.l> list2 = this.f69187b;
                List list3 = (List) obj2;
                int i9 = ReserveListActivity.f69165O;
                if (list3.isEmpty()) {
                    return;
                }
                ReserveListActivity reserveListActivity4 = this.f69186a;
                reserveListActivity4.R6();
                List list4 = list3;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C4340n.a(list4, 10, 16));
                for (Object obj3 : list4) {
                    linkedHashMap.put(Long.valueOf(((ReserveVerify) obj3).b()), obj3);
                }
                for (com.bilibili.ogv.pub.reserve.l lVar : list2) {
                    ReserveVerify reserveVerify = (ReserveVerify) linkedHashMap.get(Long.valueOf(lVar.f71679b));
                    if (reserveVerify != null) {
                        lVar.b(reserveVerify);
                    }
                }
                try {
                    VipReserveDatabase.f71657a.e().e(list2);
                } catch (SQLiteCantOpenDatabaseException e7) {
                    message = e7.getMessage();
                    sb2 = new StringBuilder("[ogv-pub-VipReserveCacheStorage-update] ");
                    th = e7;
                    sb2.append(message);
                    BLog.e("VipReserveCacheStorage-update", sb2.toString(), th);
                } catch (SQLiteDiskIOException e8) {
                    message = e8.getMessage();
                    sb2 = new StringBuilder("[ogv-pub-VipReserveCacheStorage-update] ");
                    th = e8;
                    sb2.append(message);
                    BLog.e("VipReserveCacheStorage-update", sb2.toString(), th);
                }
                ((ArrayList) reserveListActivity4.f69173K).clear();
                List<com.bilibili.ogv.pub.reserve.l> list5 = reserveListActivity4.f69173K;
                ((ArrayList) list5).addAll(list2);
                l lVar2 = reserveListActivity4.f69169G;
                if (lVar2 != null) {
                    lVar2.notifyDataSetChanged();
                }
                reserveListActivity4.S6(true);
            }
        }, new Consumer(reserveListActivity3) { // from class: com.bilibili.ogv.misc.reserve.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ReserveListActivity f69188a;

            {
                this.f69188a = reserveListActivity3;
            }

            public final void accept(Object obj2) {
                int i9 = ReserveListActivity.f69165O;
                ReserveListActivity reserveListActivity4 = this.f69188a;
                reserveListActivity4.R6();
                reserveListActivity4.T6();
                reserveListActivity4.S6(false);
            }
        }), reserveListActivity3.getLifecycle());
        return Unit.INSTANCE;
    }
}
