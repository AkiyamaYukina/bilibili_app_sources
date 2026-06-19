package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.bilibili.api.base.Config;
import com.bilibili.droid.ToastHelper;
import com.bilibili.opd.app.bizcommon.radar.data.MaCouponVO;
import com.bilibili.opd.app.bizcommon.radar.data.RightsReleaseRequest;
import com.bilibili.opd.app.bizcommon.radar.data.RightsReleaseResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/RadarCouponView$handleCouponClick$1.class */
final class RadarCouponView$handleCouponClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Activity $activity;
    final MaCouponVO $couponData;
    final fn0.a $radarRepo;
    int label;
    final t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarCouponView$handleCouponClick$1(MaCouponVO maCouponVO, t tVar, fn0.a aVar, Activity activity, Continuation<? super RadarCouponView$handleCouponClick$1> continuation) {
        super(2, continuation);
        this.$couponData = maCouponVO;
        this.this$0 = tVar;
        this.$radarRepo = aVar;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(RightsReleaseResponse rightsReleaseResponse, Activity activity, t tVar) {
        if (rightsReleaseResponse == null || !rightsReleaseResponse.getReceiveSuccess()) {
            String toastMessage = rightsReleaseResponse != null ? rightsReleaseResponse.getToastMessage() : null;
            if (toastMessage == null || toastMessage.length() == 0) {
                return;
            }
            String toastMessage2 = null;
            if (rightsReleaseResponse != null) {
                toastMessage2 = rightsReleaseResponse.getToastMessage();
            }
            ToastHelper.showToastShort(activity, toastMessage2);
            return;
        }
        String toastMessage3 = rightsReleaseResponse.getToastMessage();
        if (toastMessage3 != null && toastMessage3.length() != 0) {
            ToastHelper.showToastShort(activity, rightsReleaseResponse.getToastMessage());
        }
        MaCouponVO maCouponVO = rightsReleaseResponse.getMaCouponVO();
        if (maCouponVO != null) {
            tVar.f74416a.setMaCouponVO(maCouponVO);
            MutableState<Integer> mutableState = tVar.f74426l;
            mutableState.setValue(Integer.valueOf(mutableState.getValue().intValue() + 1));
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarCouponView$handleCouponClick$1(this.$couponData, this.this$0, this.$radarRepo, this.$activity, continuation);
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
                String rightsId = this.$couponData.getRightsId();
                String str = rightsId;
                if (rightsId == null) {
                    str = "";
                }
                String id = this.this$0.f74416a.getId();
                RightsReleaseRequest rightsReleaseRequest = new RightsReleaseRequest(str, id != null ? id : "");
                fn0.a aVar = this.$radarRepo;
                this.label = 1;
                Object objB = aVar.b(rightsReleaseRequest, this);
                obj = objB;
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final RightsReleaseResponse rightsReleaseResponse = (RightsReleaseResponse) obj;
            final Activity activity = this.$activity;
            final t tVar = this.this$0;
            activity.runOnUiThread(new Runnable(rightsReleaseResponse, activity, tVar) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final RightsReleaseResponse f74412a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Activity f74413b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final t f74414c;

                {
                    this.f74412a = rightsReleaseResponse;
                    this.f74413b = activity;
                    this.f74414c = tVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RadarCouponView$handleCouponClick$1.invokeSuspend$lambda$0(this.f74412a, this.f74413b, this.f74414c);
                }
            });
        } catch (Exception e7) {
            String strA = N4.a.a("领取券失败: ", e7);
            if (Config.isDebuggable()) {
                String str2 = strA;
                if (strA == null) {
                    str2 = "null";
                }
                BLog.d("nov_test", str2);
            }
            final Activity activity2 = this.$activity;
            activity2.runOnUiThread(new Runnable(activity2) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Activity f74415a;

                {
                    this.f74415a = activity2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ToastHelper.showToastShort(this.f74415a, "领取失败，请稍后重试");
                }
            });
        }
        return Unit.INSTANCE;
    }
}
