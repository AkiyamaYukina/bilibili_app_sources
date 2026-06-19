package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.okretro.BiliApiParseException;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.features.interactvideo.InteractVideoApiService;
import com.bilibili.playerbizcommon.features.interactvideo.model.InteractNode;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$loadNodeInfo$infoResult$1.class */
final class TheseusInteractVideoService$loadNodeInfo$infoResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TheseusInteractVideoService.b>, Object> {
    final Video.b $interactParams;
    final com.bilibili.app.gemini.ugc.feature.interactivevideo.j $pointer;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$loadNodeInfo$infoResult$1(com.bilibili.app.gemini.ugc.feature.interactivevideo.j jVar, Video.b bVar, TheseusInteractVideoService theseusInteractVideoService, Continuation<? super TheseusInteractVideoService$loadNodeInfo$infoResult$1> continuation) {
        super(2, continuation);
        this.$pointer = jVar;
        this.$interactParams = bVar;
        this.this$0 = theseusInteractVideoService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusInteractVideoService$loadNodeInfo$infoResult$1(this.$pointer, this.$interactParams, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TheseusInteractVideoService.b> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws IOException, BiliApiParseException {
        Object aVar;
        InteractNode interactNode;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InteractVideoApiService interactVideoApiService = (InteractVideoApiService) ServiceGenerator.createService(InteractVideoApiService.class);
        String strA = com.bilibili.ad.adview.space.brand.ui.viewmodel.a.a();
        long j7 = this.$pointer.a;
        Video.b bVar = this.$interactParams;
        long j8 = bVar.a;
        long j9 = bVar.e;
        long j10 = this.$pointer.c;
        int i7 = this.this$0.f99901r.h().f102988b ? 6 : 5;
        com.bilibili.app.gemini.ugc.feature.interactivevideo.j jVar = this.$pointer;
        Response<GeneralResponse<InteractNode>> responseExecute = interactVideoApiService.getNodeInfo(strA, String.valueOf(j7), j8, j9, j10, i7, jVar.d, jVar.e, jVar.f).execute();
        int i8 = -1;
        if (!responseExecute.isSuccessful()) {
            BLog.i("TheseusInteractVideoService$loadNodeInfo$infoResult$1-invokeSuspend", "[theseus-united-TheseusInteractVideoService$loadNodeInfo$infoResult$1-invokeSuspend] load node info fail");
            return new TheseusInteractVideoService.b.a(-1, "");
        }
        GeneralResponse generalResponse = (GeneralResponse) responseExecute.body();
        if (generalResponse != null && generalResponse.code == 0) {
            BLog.i("TheseusInteractVideoService$loadNodeInfo$infoResult$1-invokeSuspend", "[theseus-united-TheseusInteractVideoService$loadNodeInfo$infoResult$1-invokeSuspend] load node success");
            GeneralResponse generalResponse2 = (GeneralResponse) responseExecute.body();
            if (generalResponse2 == null || (interactNode = (InteractNode) generalResponse2.data) == null) {
                aVar = new TheseusInteractVideoService.b.a(-1, "");
            } else {
                BLog.i("TheseusInteractVideoService$loadNodeInfo$infoResult$1-invokeSuspend", "[theseus-united-TheseusInteractVideoService$loadNodeInfo$infoResult$1-invokeSuspend] load node info data");
                aVar = new TheseusInteractVideoService.b.C0995b(interactNode);
            }
            return aVar;
        }
        BLog.i("TheseusInteractVideoService$loadNodeInfo$infoResult$1-invokeSuspend", "[theseus-united-TheseusInteractVideoService$loadNodeInfo$infoResult$1-invokeSuspend] " + com.bilibili.app.comm.rubick.common.g.b(generalResponse != null ? Boxing.boxInt(generalResponse.code) : null, "load node info fail:"));
        if (generalResponse != null) {
            i8 = generalResponse.code;
        }
        String str = "";
        if (generalResponse != null) {
            str = generalResponse.message;
            if (str == null) {
                str = "";
            }
        }
        return new TheseusInteractVideoService.b.a(i8, str);
    }
}
