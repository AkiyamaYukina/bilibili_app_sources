package com.bilibili.playerbizcommon.widget.control.seekbar;

import com.bilibili.playerbizcommon.utils.SpriteManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarSpriteThumb$load$2$finishSprite$1.class */
public final class PlayerSeekbarSpriteThumb$load$2$finishSprite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $finish;
    final e $info;
    int label;
    final PlayerSeekbarSpriteThumb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarSpriteThumb$load$2$finishSprite$1(PlayerSeekbarSpriteThumb playerSeekbarSpriteThumb, e eVar, String str, Continuation<? super PlayerSeekbarSpriteThumb$load$2$finishSprite$1> continuation) {
        super(2, continuation);
        this.this$0 = playerSeekbarSpriteThumb;
        this.$info = eVar;
        this.$finish = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerSeekbarSpriteThumb$load$2$finishSprite$1(this.this$0, this.$info, this.$finish, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SpriteManager spriteManager = (SpriteManager) this.this$0.f80611a.getValue();
            e eVar = this.$info;
            String str = eVar.f80641i;
            String str2 = this.$finish;
            this.label = 1;
            if (spriteManager.download(str, eVar.f80642j, str2, this) == coroutine_suspended) {
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
