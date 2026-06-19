package com.bilibili.playerbizcommonv2.widget.dowanload;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$1.class */
final class VideoDownloadDialog$combineSeasonDownloadView$1 extends ContinuationImpl {
    int label;
    Object result;
    final VideoDownloadDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloadDialog$combineSeasonDownloadView$1(VideoDownloadDialog videoDownloadDialog, Continuation<? super VideoDownloadDialog$combineSeasonDownloadView$1> continuation) {
        super(continuation);
        this.this$0 = videoDownloadDialog;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return VideoDownloadDialog.k(this.this$0, null, null, null, this);
    }
}
