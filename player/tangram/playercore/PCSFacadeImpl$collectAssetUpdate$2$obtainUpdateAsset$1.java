package com.bilibili.player.tangram.playercore;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$collectAssetUpdate$2$obtainUpdateAsset$1.class */
public final class PCSFacadeImpl$collectAssetUpdate$2$obtainUpdateAsset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MediaResource>, Object> {
    final int $codecType;
    final int $format;
    final int $reason;
    final Function2<C, Continuation<? super MediaResource>, Object> $updater;
    int label;
    final PCSFacadeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PCSFacadeImpl$collectAssetUpdate$2$obtainUpdateAsset$1(Function2<? super C, ? super Continuation<? super MediaResource>, ? extends Object> function2, int i7, int i8, int i9, PCSFacadeImpl pCSFacadeImpl, Continuation<? super PCSFacadeImpl$collectAssetUpdate$2$obtainUpdateAsset$1> continuation) {
        super(2, continuation);
        this.$updater = function2;
        this.$codecType = i7;
        this.$format = i8;
        this.$reason = i9;
        this.this$0 = pCSFacadeImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PCSFacadeImpl$collectAssetUpdate$2$obtainUpdateAsset$1(this.$updater, this.$codecType, this.$format, this.$reason, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MediaResource> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MediaResource mediaResource;
        com.bilibili.player.tangram.basic.a aVarA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<C, Continuation<? super MediaResource>, Object> function2 = this.$updater;
                int i8 = this.$codecType;
                int i9 = this.$format;
                int i10 = this.$reason;
                boolean z6 = false;
                boolean z7 = i10 == 4;
                if (i10 == 5) {
                    z6 = true;
                }
                C c7 = new C(i8, i9, z7, Boxing.boxBoolean(z6));
                this.label = 1;
                Object objInvoke = function2.invoke(c7, this);
                obj = objInvoke;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MediaResource mediaResource2 = (MediaResource) obj;
            mediaResource = mediaResource2;
            if (mediaResource2 != null) {
                u uVarO = this.this$0.o();
                PlayIndex playIndex = uVarO.f79460c.getPlayIndex();
                if (playIndex != null && (aVarA = C5774b.a(playIndex)) != null) {
                    y.c(aVarA.f79320a, mediaResource2);
                }
                this.this$0.f79393k.setValue(new u(uVarO.f79458a, uVarO.f79459b, mediaResource2, uVarO.f79461d, uVarO.f79462e, uVarO.f79463f, uVarO.h, uVarO.f79465i, 64));
                mediaResource = mediaResource2;
            }
        } catch (Exception e7) {
            BLog.e("PCSFacadeImpl$collectAssetUpdate$2$obtainUpdateAsset$1-invokeSuspend", "[tangram-player-core-PCSFacadeImpl$collectAssetUpdate$2$obtainUpdateAsset$1-invokeSuspend] Error when updating asset.", e7);
            mediaResource = null;
        }
        return mediaResource;
    }
}
