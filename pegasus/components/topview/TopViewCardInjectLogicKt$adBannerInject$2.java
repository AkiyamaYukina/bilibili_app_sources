package com.bilibili.pegasus.components.topview;

import com.bilibili.adcommon.utils.GsonKtKt;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import gp0.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewCardInjectLogicKt$adBannerInject$2.class */
final class TopViewCardInjectLogicKt$adBannerInject$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TimedValue<b>>, Object> {
    final String $banner;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewCardInjectLogicKt$adBannerInject$2$a.class */
    public static final class a extends TypeToken<b> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopViewCardInjectLogicKt$adBannerInject$2(String str, Continuation<? super TopViewCardInjectLogicKt$adBannerInject$2> continuation) {
        super(2, continuation);
        this.$banner = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopViewCardInjectLogicKt$adBannerInject$2(this.$banner, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TimedValue<b>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objFromJson;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$banner;
        long j7 = TimeSource.Monotonic.INSTANCE.markNow-z9LOYto();
        try {
            objFromJson = GsonKtKt.getGson().fromJson(str, new a().getType());
        } catch (JsonSyntaxException e7) {
            BLog.e(e7.getMessage());
            objFromJson = null;
        }
        return new TimedValue((b) objFromJson, TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(j7), (DefaultConstructorMarker) null);
    }
}
