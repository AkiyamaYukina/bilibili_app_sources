package com.bilibili.biligame.business.pegasus.view;

import com.alibaba.fastjson.JSON;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.utils.BiliCallGameExsKt;
import com.bilibili.game.service.bean.DownloadInfo;
import com.bilibili.okretro.call.BiliCall;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/GamePanelDownloadDialogV2$loadGameInfo$1.class */
final class GamePanelDownloadDialogV2$loadGameInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePanelDownloadDialogV2$loadGameInfo$1(f fVar, Continuation<? super GamePanelDownloadDialogV2$loadGameInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GamePanelDownloadDialogV2$loadGameInfo$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Map linkedHashMap;
        Integer intOrNull;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                linkedHashMap = new LinkedHashMap();
                int i8 = 0;
                for (Object obj2 : this.this$0.f62747i) {
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    DownloadInfo downloadInfo = (DownloadInfo) obj2;
                    Integer numBoxInt = Boxing.boxInt(downloadInfo.gameId);
                    String str = downloadInfo.channelId;
                    linkedHashMap.put(numBoxInt, Boxing.boxInt((str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue()));
                    i8++;
                }
                BiliCall<BiligameApiResponse<List<BiligameMainGame>>> downloadGameInfoListV2 = this.this$0.getApiService().getDownloadGameInfoListV2(JSON.toJSONString(linkedHashMap));
                this.L$0 = linkedHashMap;
                this.label = 1;
                obj = BiliCallGameExsKt.gameAwait(downloadGameInfoListV2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkedHashMap = (Map) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (BiligameMainGame biligameMainGame : (List) obj) {
                Integer num = (Integer) linkedHashMap.get(Boxing.boxInt(biligameMainGame.gameBaseId));
                if (num != null) {
                    biligameMainGame.channelId = String.valueOf(num.intValue());
                }
                linkedHashMap2.put(Boxing.boxInt(biligameMainGame.gameBaseId), biligameMainGame);
            }
            this.this$0.f62762x = linkedHashMap2;
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
