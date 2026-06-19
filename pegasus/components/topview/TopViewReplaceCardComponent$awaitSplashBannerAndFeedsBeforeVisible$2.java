package com.bilibili.pegasus.components.topview;

import com.bilibili.lib.homepage.splash.model.SelectedSplashTopViewIdInfo;
import com.bilibili.lib.homepage.splash.model.SplashState;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2.class */
final class TopViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2 extends SuspendLambda implements Function4<Boolean, SplashState, List<? extends PegasusHolderData>, Continuation<? super Triple<? extends Boolean, ? extends String, ? extends List<? extends PegasusHolderData>>>, Object> {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;

    public TopViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2(Continuation<? super TopViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2> continuation) {
        super(4, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(((Boolean) obj).booleanValue(), (SplashState) obj2, (List<? extends PegasusHolderData>) obj3, (Continuation<? super Triple<Boolean, String, ? extends List<? extends PegasusHolderData>>>) obj4);
    }

    public final Object invoke(boolean z6, SplashState splashState, List<? extends PegasusHolderData> list, Continuation<? super Triple<Boolean, String, ? extends List<? extends PegasusHolderData>>> continuation) {
        TopViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2 topViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2 = new TopViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2(continuation);
        topViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2.Z$0 = z6;
        topViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2.L$0 = splashState;
        topViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2.L$1 = list;
        return topViewReplaceCardComponent$awaitSplashBannerAndFeedsBeforeVisible$2.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z6 = this.Z$0;
        SplashState splashState = (SplashState) this.L$0;
        List list = (List) this.L$1;
        Boolean boolBoxBoolean = Boxing.boxBoolean(z6);
        SelectedSplashTopViewIdInfo selectedSplashTopViewIdInfo = splashState.getSelectedSplashTopViewIdInfo();
        return new Triple(boolBoxBoolean, selectedSplashTopViewIdInfo != null ? selectedSplashTopViewIdInfo.getBanner() : null, list);
    }
}
