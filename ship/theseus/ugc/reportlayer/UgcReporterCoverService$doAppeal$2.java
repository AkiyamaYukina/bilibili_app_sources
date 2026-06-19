package com.bilibili.ship.theseus.ugc.reportlayer;

import android.net.Uri;
import androidx.activity.ComponentActivity;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.Runtime;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import sh1.o;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$doAppeal$2.class */
final class UgcReporterCoverService$doAppeal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UgcReporterCoverService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcReporterCoverService$doAppeal$2(UgcReporterCoverService ugcReporterCoverService, Continuation<? super UgcReporterCoverService$doAppeal$2> continuation) {
        super(2, continuation);
        this.this$0 = ugcReporterCoverService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcReporterCoverService$doAppeal$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UgcReporterCoverService ugcReporterCoverService = this.this$0;
        ComponentActivity componentActivity = ugcReporterCoverService.f98470c;
        String strB = ugcReporterCoverService.f98472e.b();
        String str = (String) this.this$0.f98472e.f104040e.getValue();
        if (componentActivity != null && o.b(componentActivity, "", "player.player.option-more.half.player", 24, (String) null)) {
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("https://www.bilibili.com/appeal/").buildUpon().appendQueryParameter(GameCardButton.extraAvid, strB).appendQueryParameter("bvid", str).build()).runtime(CollectionsKt.listOf(Runtime.WEB)).build(), componentActivity);
        }
        return Unit.INSTANCE;
    }
}
