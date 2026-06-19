package com.bilibili.playerbizcommon.widget.control;

import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import q4.C8397q;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$loadIcon$1.class */
final class PlayerSeekWidget$loadIcon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Video.DisplayParams $displayParams;
    final File $dragFile;
    final String $dragSpritePath;
    final File $finishFile;
    final String $finishSpritePath;
    final WeakReference<PlayerContainer> $weakContainer;
    private Object L$0;
    int label;
    final PlayerSeekWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekWidget$loadIcon$1(WeakReference<PlayerContainer> weakReference, Video.DisplayParams displayParams, File file, File file2, PlayerSeekWidget playerSeekWidget, String str, String str2, Continuation<? super PlayerSeekWidget$loadIcon$1> continuation) {
        super(2, continuation);
        this.$weakContainer = weakReference;
        this.$displayParams = displayParams;
        this.$dragFile = file;
        this.$finishFile = file2;
        this.this$0 = playerSeekWidget;
        this.$dragSpritePath = str;
        this.$finishSpritePath = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerSeekWidget$loadIcon$1 playerSeekWidget$loadIcon$1 = new PlayerSeekWidget$loadIcon$1(this.$weakContainer, this.$displayParams, this.$dragFile, this.$finishFile, this.this$0, this.$dragSpritePath, this.$finishSpritePath, continuation);
        playerSeekWidget$loadIcon$1.L$0 = obj;
        return playerSeekWidget$loadIcon$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                Deferred deferredAsync$default = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerSeekWidget$loadIcon$1$dragSprite$1(this.this$0, this.$displayParams, this.$dragSpritePath, null), 3, (Object) null);
                Deferred deferredAsync$default2 = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerSeekWidget$loadIcon$1$finishSprite$1(this.this$0, this.$displayParams, this.$finishSpritePath, null), 3, (Object) null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (AwaitKt.awaitAll(new Deferred[]{deferredAsync$default, deferredAsync$default2}, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e7) {
                e = e7;
                coroutineScope2 = coroutineScope;
                C8397q.a("download sprite failed, ", "PlayerSeekWidget", e);
                coroutineScope3 = coroutineScope2;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            coroutineScope2 = coroutineScope4;
            try {
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope4;
            } catch (Exception e8) {
                e = e8;
                C8397q.a("download sprite failed, ", "PlayerSeekWidget", e);
                coroutineScope3 = coroutineScope2;
            }
        }
        PlayerContainer playerContainer = this.$weakContainer.get();
        Video.DisplayParams displayParams = null;
        if (playerContainer != null) {
            IVideosPlayDirectorService videoPlayDirectorService = playerContainer.getVideoPlayDirectorService();
            displayParams = null;
            if (videoPlayDirectorService != null) {
                Video.PlayableParams currentPlayableParams = videoPlayDirectorService.getCurrentPlayableParams();
                displayParams = null;
                if (currentPlayableParams != null) {
                    displayParams = currentPlayableParams.getDisplayParams();
                }
            }
        }
        coroutineScope3 = coroutineScope;
        if (displayParams != null) {
            coroutineScope3 = coroutineScope;
            if (Intrinsics.areEqual(displayParams.getDragSpriteImg(), this.$displayParams.getDragSpriteImg())) {
                coroutineScope3 = coroutineScope;
                if (Intrinsics.areEqual(displayParams.getFinishSpriteImg(), this.$displayParams.getFinishSpriteImg())) {
                    coroutineScope3 = coroutineScope;
                    if (this.$dragFile.exists()) {
                        coroutineScope3 = coroutineScope;
                        if (this.$finishFile.exists()) {
                            coroutineScope2 = coroutineScope;
                            this.this$0.f80532n = true;
                            coroutineScope3 = coroutineScope;
                        }
                    }
                }
            }
        }
        this.this$0.f80533o = false;
        if (CoroutineScopeKt.isActive(coroutineScope3) && this.this$0.f80532n) {
            this.this$0.F();
        }
        return Unit.INSTANCE;
    }
}
