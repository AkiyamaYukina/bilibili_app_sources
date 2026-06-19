package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.BiliSenseMeModManager;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/BiliSenseMeModManager$Companion$awaitModReady$1.class */
public final class BiliSenseMeModManager$Companion$awaitModReady$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final BiliSenseMeModManager.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliSenseMeModManager$Companion$awaitModReady$1(BiliSenseMeModManager.Companion companion, Continuation<? super BiliSenseMeModManager$Companion$awaitModReady$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitModReady(null, this);
    }
}
