package com.bilibili.playerbizcommon.widget.control;

import com.bilibili.playerbizcommon.utils.SpriteManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$loadIcon$1$finishSprite$1.class */
public final class PlayerSeekWidget$loadIcon$1$finishSprite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Video.DisplayParams $displayParams;
    final String $finishSpritePath;
    int label;
    final PlayerSeekWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekWidget$loadIcon$1$finishSprite$1(PlayerSeekWidget playerSeekWidget, Video.DisplayParams displayParams, String str, Continuation<? super PlayerSeekWidget$loadIcon$1$finishSprite$1> continuation) {
        super(2, continuation);
        this.this$0 = playerSeekWidget;
        this.$displayParams = displayParams;
        this.$finishSpritePath = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerSeekWidget$loadIcon$1$finishSprite$1(this.this$0, this.$displayParams, this.$finishSpritePath, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SpriteManager mSpriteManager = this.this$0.getMSpriteManager();
            String finishSpriteImg = this.$displayParams.getFinishSpriteImg();
            String finishSpriteMeta = this.$displayParams.getFinishSpriteMeta();
            String str = this.$finishSpritePath;
            this.label = 1;
            if (mSpriteManager.download(finishSpriteImg, finishSpriteMeta, str, this) == coroutine_suspended) {
                return coroutine_suspended;
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
