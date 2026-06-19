package com.bilibili.playerbizcommon.widget.control.seekbar;

import androidx.fragment.app.FragmentActivity;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarSpriteThumb$refreshThumb$1.class */
public final class PlayerSeekbarSpriteThumb$refreshThumb$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final File $dragFile;
    final File $finishFile;
    int label;
    final PlayerSeekbarSpriteThumb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarSpriteThumb$refreshThumb$1(PlayerSeekbarSpriteThumb playerSeekbarSpriteThumb, FragmentActivity fragmentActivity, File file, File file2, Continuation<? super PlayerSeekbarSpriteThumb$refreshThumb$1> continuation) {
        super(2, continuation);
        this.this$0 = playerSeekbarSpriteThumb;
        this.$activity = fragmentActivity;
        this.$dragFile = file;
        this.$finishFile = file2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerSeekbarSpriteThumb$refreshThumb$1(this.this$0, this.$activity, this.$dragFile, this.$finishFile, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PlayerSeekbarSpriteThumb playerSeekbarSpriteThumb = this.this$0;
            FragmentActivity fragmentActivity = this.$activity;
            File file = this.$dragFile;
            File file2 = this.$finishFile;
            this.label = 1;
            if (PlayerSeekbarSpriteThumb.i(playerSeekbarSpriteThumb, fragmentActivity, file, file2, this) == coroutine_suspended) {
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
