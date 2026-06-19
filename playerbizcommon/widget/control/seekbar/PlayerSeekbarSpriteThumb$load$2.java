package com.bilibili.playerbizcommon.widget.control.seekbar;

import com.bilibili.playerbizcommon.utils.SpriteManager;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import q4.C8397q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarSpriteThumb$load$2.class */
public final class PlayerSeekbarSpriteThumb$load$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final e $info;
    private Object L$0;
    Object L$1;
    int label;
    final PlayerSeekbarSpriteThumb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarSpriteThumb$load$2(PlayerSeekbarSpriteThumb playerSeekbarSpriteThumb, e eVar, Continuation<? super PlayerSeekbarSpriteThumb$load$2> continuation) {
        super(2, continuation);
        this.this$0 = playerSeekbarSpriteThumb;
        this.$info = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerSeekbarSpriteThumb$load$2 playerSeekbarSpriteThumb$load$2 = new PlayerSeekbarSpriteThumb$load$2(this.this$0, this.$info, continuation);
        playerSeekbarSpriteThumb$load$2.L$0 = obj;
        return playerSeekbarSpriteThumb$load$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        File file;
        File file2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                if (PlayerSeekbarSpriteThumb.f80610j) {
                    BLog.i("SeekbarThumb-sprite", "download sprite failed, disable");
                    return Boxing.boxBoolean(false);
                }
                BLog.i("SeekbarThumb-sprite", "load start");
                SpriteManager spriteManager = (SpriteManager) this.this$0.f80611a.getValue();
                e eVar = this.$info;
                String spritePath = spriteManager.getSpritePath(eVar.f80640g, eVar.h);
                PlayerSeekbarSpriteThumb playerSeekbarSpriteThumb = this.this$0;
                playerSeekbarSpriteThumb.f80613c = spritePath;
                if (spritePath == null) {
                    BLog.i("SeekbarThumb-sprite", "download sprite failed, dragSpritePath is null");
                    return Boxing.boxBoolean(false);
                }
                SpriteManager spriteManager2 = (SpriteManager) playerSeekbarSpriteThumb.f80611a.getValue();
                e eVar2 = this.$info;
                String spritePath2 = spriteManager2.getSpritePath(eVar2.f80641i, eVar2.f80642j);
                this.this$0.f80614d = spritePath2;
                if (spritePath2 == null) {
                    BLog.i("SeekbarThumb-sprite", "download sprite failed, finishSpritePath is null");
                    return Boxing.boxBoolean(false);
                }
                file = new File(spritePath);
                file2 = new File(spritePath2);
                if (file.exists() && file2.exists()) {
                    BLog.i("SeekbarThumb-sprite", "download sprite success, files exist");
                    return Boxing.boxBoolean(true);
                }
                Deferred deferredAsync$default = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerSeekbarSpriteThumb$load$2$dragSprite$1(this.this$0, this.$info, spritePath, null), 3, (Object) null);
                Deferred deferredAsync$default2 = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerSeekbarSpriteThumb$load$2$finishSprite$1(this.this$0, this.$info, spritePath2, null), 3, (Object) null);
                this.L$0 = file;
                this.L$1 = file2;
                this.label = 1;
                if (AwaitKt.awaitAll(new Deferred[]{deferredAsync$default, deferredAsync$default2}, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                File file3 = (File) this.L$1;
                file = (File) this.L$0;
                ResultKt.throwOnFailure(obj);
                file2 = file3;
            }
            f fVar = this.this$0.f80612b;
            if (fVar != null && fVar.a() == this.$info.f80634a && file.exists() && file2.exists()) {
                BLog.i("SeekbarThumb-sprite", "load success");
                return Boxing.boxBoolean(true);
            }
        } catch (Exception e7) {
            C8397q.a("download sprite failed, ", "SeekbarThumb-sprite", e7);
        }
        return Boxing.boxBoolean(false);
    }
}
