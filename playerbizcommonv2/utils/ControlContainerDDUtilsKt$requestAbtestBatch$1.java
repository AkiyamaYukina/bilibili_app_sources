package com.bilibili.playerbizcommonv2.utils;

import android.util.Log;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.playerbizcommonv2.abtest.AbtestBatchData;
import com.bilibili.playerbizcommonv2.abtest.AbtestBatchResult;
import com.bilibili.playerbizcommonv2.abtest.IntExpData;
import com.bilibili.playerbizcommonv2.abtest.StringExpData;
import jr0.InterfaceC7718a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/ControlContainerDDUtilsKt$requestAbtestBatch$1.class */
final class ControlContainerDDUtilsKt$requestAbtestBatch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public ControlContainerDDUtilsKt$requestAbtestBatch$1(Continuation<? super ControlContainerDDUtilsKt$requestAbtestBatch$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ControlContainerDDUtilsKt$requestAbtestBatch$1(continuation);
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
                InterfaceC7718a interfaceC7718a = (InterfaceC7718a) ServiceGenerator.createService(InterfaceC7718a.class);
                this.label = 1;
                Object objAbtestBatch = interfaceC7718a.abtestBatch(this);
                obj = objAbtestBatch;
                if (objAbtestBatch == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                Log.e("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + ("onBusinessFailure, " + businessFailure.getCode() + " " + businessFailure.getMessage()), null);
            } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
                Log.e("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + ("onServiceUnavailable, " + ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException().getMessage()), null);
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbtestBatchData abtestBatchData = (AbtestBatchData) ((BiliApiResponse.Success) biliApiResponse).getData();
                AbtestBatchResult abtestBatchResultA = abtestBatchData != null ? abtestBatchData.a() : null;
                IntExpData intExpDataF = abtestBatchResultA != null ? abtestBatchResultA.f() : null;
                if (intExpDataF != null) {
                    int iA = intExpDataF.a();
                    new tv.danmaku.bili.widget.preference.a(0).n("sp_united_855_detail_ui_style", iA);
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + ("loadAbtest, style is " + iA));
                } else {
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] loadAbtest, style is null");
                }
                IntExpData intExpDataB = abtestBatchResultA != null ? abtestBatchResultA.b() : null;
                if (intExpDataB != null) {
                    int iA2 = intExpDataB.a();
                    new tv.danmaku.bili.widget.preference.a(0).n("sp_play_speed_experiment", iA2);
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + ("loadAbtest, longPressSpeedExp is " + iA2));
                } else {
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] loadAbtest, longPressSpeedExp is null");
                }
                StringExpData stringExpDataA = abtestBatchResultA != null ? abtestBatchResultA.a() : null;
                if (stringExpDataA != null) {
                    String strA = stringExpDataA.a();
                    new tv.danmaku.bili.widget.preference.a(0).p("sp_listen_experiment", strA == null ? "" : strA);
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + ("loadAbtest, backgroundExp is " + strA));
                } else {
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] loadAbtest, backgroundExp is null");
                }
                StringExpData stringExpDataE = abtestBatchResultA != null ? abtestBatchResultA.e() : null;
                if (stringExpDataE != null) {
                    String strA2 = stringExpDataE.a();
                    new tv.danmaku.bili.widget.preference.a(0).p("sp_story_listen_experiment", strA2 == null ? "" : strA2);
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + ("loadAbtest, storyBackgroundExp is " + strA2));
                } else {
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] loadAbtest, storyBackgroundExp is null");
                }
                IntExpData intExpDataC = abtestBatchResultA != null ? abtestBatchResultA.c() : null;
                if (intExpDataC != null) {
                    int iA3 = intExpDataC.a();
                    new tv.danmaku.bili.widget.preference.a(0).n("sp_player_comment_fav_exp", iA3);
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + ("loadAbtest, player comment/fav exp is " + iA3));
                } else {
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] loadAbtest, player comment/fav exp is null");
                }
                IntExpData intExpDataD = abtestBatchResultA != null ? abtestBatchResultA.d() : null;
                if (intExpDataD != null) {
                    int iA4 = intExpDataD.a();
                    new tv.danmaku.bili.widget.preference.a(0).n("sp_player_heat_peak_exp", iA4);
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + ("loadAbtest, player heat peak exp is " + iA4));
                } else {
                    Log.i("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] loadAbtest, player heat peak exp is null");
                }
            }
        } catch (Exception e7) {
            Log.e("ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend", "[playerbizcommonv2-ControlContainerDDUtilsKt$requestAbtestBatch$1-invokeSuspend] " + N4.a.a("onServiceUnavailable, ", e7), null);
        }
        return Unit.INSTANCE;
    }
}
