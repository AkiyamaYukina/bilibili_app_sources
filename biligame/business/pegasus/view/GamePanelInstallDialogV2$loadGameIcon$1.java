package com.bilibili.biligame.business.pegasus.view;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.utils.BiliCallGameExsKt;
import com.bilibili.biligame.utils.GameImageExtensionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.okretro.call.BiliCall;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/GamePanelInstallDialogV2$loadGameIcon$1.class */
final class GamePanelInstallDialogV2$loadGameIcon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $pkg;
    final BiliImageView $view;
    int label;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePanelInstallDialogV2$loadGameIcon$1(String str, j jVar, BiliImageView biliImageView, Continuation<? super GamePanelInstallDialogV2$loadGameIcon$1> continuation) {
        super(2, continuation);
        this.$pkg = str;
        this.this$0 = jVar;
        this.$view = biliImageView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GamePanelInstallDialogV2$loadGameIcon$1(this.$pkg, this.this$0, this.$view, continuation);
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
                BiliCall<BiligameApiResponse<List<BiligameMainGame>>> downloadGameInfoList = this.this$0.getApiService().getDownloadGameInfoList("[" + this.$pkg + "]");
                this.label = 1;
                Object objGameAwait = BiliCallGameExsKt.gameAwait(downloadGameInfoList, this);
                obj = objGameAwait;
                if (objGameAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            if (list.size() > 0) {
                GameImageExtensionsKt.displayGameImage(this.$view, ((BiligameMainGame) list.get(0)).icon);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
