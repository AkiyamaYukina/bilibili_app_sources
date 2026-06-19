package com.bilibili.playerbizcommon.widget.control;

import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$loadIcon$2.class */
final class PlayerSeekWidget$loadIcon$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final File $file1;
    final File $file2;
    final String $url1;
    final String $url2;
    final WeakReference<PlayerContainer> $weakContainer;
    private Object L$0;
    int label;
    final PlayerSeekWidget this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget$loadIcon$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$loadIcon$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final File $file1;
        final File $file2;
        final String $url1;
        final String $url2;
        final WeakReference<PlayerContainer> $weakContainer;
        private Object L$0;
        int label;
        final PlayerSeekWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WeakReference<PlayerContainer> weakReference, String str, File file, String str2, File file2, PlayerSeekWidget playerSeekWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$weakContainer = weakReference;
            this.$url1 = str;
            this.$file1 = file;
            this.$url2 = str2;
            this.$file2 = file2;
            this.this$0 = playerSeekWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$weakContainer, this.$url1, this.$file1, this.$url2, this.$file2, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x01a1 A[PHI: r5
  0x01a1: PHI (r5v2 okhttp3.Response) = (r5v3 okhttp3.Response), (r5v22 okhttp3.Response) binds: [B:86:0x01ce, B:80:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 505
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget$loadIcon$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekWidget$loadIcon$2(PlayerSeekWidget playerSeekWidget, WeakReference<PlayerContainer> weakReference, String str, String str2, File file, File file2, Continuation<? super PlayerSeekWidget$loadIcon$2> continuation) {
        super(2, continuation);
        this.this$0 = playerSeekWidget;
        this.$weakContainer = weakReference;
        this.$url1 = str;
        this.$url2 = str2;
        this.$file1 = file;
        this.$file2 = file2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerSeekWidget$loadIcon$2 playerSeekWidget$loadIcon$2 = new PlayerSeekWidget$loadIcon$2(this.this$0, this.$weakContainer, this.$url1, this.$url2, this.$file1, this.$file2, continuation);
        playerSeekWidget$loadIcon$2.L$0 = obj;
        return playerSeekWidget$loadIcon$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        IVideosPlayDirectorService videoPlayDirectorService;
        Video.PlayableParams currentPlayableParams;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$weakContainer, this.$url1, this.$file1, this.$url2, this.$file2, this.this$0, null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f80533o = false;
        PlayerContainer playerContainer = this.$weakContainer.get();
        Video.DisplayParams displayParams = (playerContainer == null || (videoPlayDirectorService = playerContainer.getVideoPlayDirectorService()) == null || (currentPlayableParams = videoPlayDirectorService.getCurrentPlayableParams()) == null) ? null : currentPlayableParams.getDisplayParams();
        if (CoroutineScopeKt.isActive(coroutineScope) && this.this$0.f80532n) {
            if (TextUtils.equals(this.$url1, displayParams != null ? displayParams.getSeekIconUrl1() : null)) {
                if (TextUtils.equals(this.$url2, displayParams != null ? displayParams.getSeekIconUrl2() : null)) {
                    this.this$0.F();
                }
            }
        }
        this.this$0.f80517A = null;
        return Unit.INSTANCE;
    }
}
