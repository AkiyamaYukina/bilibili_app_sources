package com.bilibili.ogv.pub.reserve;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.videodownloader.ui.VideoDownloadWarningDialog;
import java.util.List;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.ConnectivityManagerHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheManager$handleDownload$1.class */
final class VipReserveCacheManager$handleDownload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<l> $eps;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipReserveCacheManager$handleDownload$1(List<l> list, Continuation<? super VipReserveCacheManager$handleDownload$1> continuation) {
        super(2, continuation);
        this.$eps = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveCacheManager$handleDownload$1(this.$eps, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        NetworkInfo activeNetworkInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = (a) VipReserveCacheManager.f71651e.getValue();
            if (aVar != null) {
                Application application = Aj0.a.f317a;
                List<l> list = this.$eps;
                this.label = 1;
                if (list == null) {
                    objA = Unit.INSTANCE;
                } else {
                    int networkWithoutCache = ConnectivityMonitor.getInstance().getNetworkWithoutCache();
                    int i8 = networkWithoutCache;
                    if (FreeDataManager.getInstance().isTf()) {
                        i8 = networkWithoutCache;
                        if (networkWithoutCache == 2) {
                            i8 = 10010;
                        }
                    }
                    VideoDownloadWarningDialog.NetWorkWarningType netWorkWarningType = new VideoDownloadWarningDialog.NetWorkWarningType();
                    if (ConnectivityManagerHelper.isActiveNetworkMetered(application) && (activeNetworkInfo = Connectivity.getActiveNetworkInfo(application)) != null) {
                        if (Intrinsics.areEqual(activeNetworkInfo.getTypeName().toLowerCase(Locale.ROOT), "wifi")) {
                            netWorkWarningType.b = activeNetworkInfo.getExtraInfo();
                            netWorkWarningType.a = 2;
                        } else {
                            netWorkWarningType.b = "bili_safe_mobile_network_0f26185990023e8b";
                            netWorkWarningType.a = 1;
                        }
                    }
                    int i9 = netWorkWarningType.a;
                    boolean z6 = false;
                    if (i9 != 1) {
                        if (i9 != 2) {
                            z6 = true;
                        } else {
                            SharedPreferences sharedPreferences = cK0.a.a;
                            if (cK0.a.a(netWorkWarningType.a())) {
                                z6 = true;
                            }
                            i8 = 2;
                        }
                    } else if (FreeDataManager.getInstance().isTf()) {
                        z6 = true;
                        i8 = 1;
                    } else {
                        i8 = 1;
                        z6 = false;
                    }
                    objA = aVar.a(list, i8, z6, this);
                    if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objA = Unit.INSTANCE;
                    }
                }
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
