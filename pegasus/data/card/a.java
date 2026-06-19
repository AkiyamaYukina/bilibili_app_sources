package com.bilibili.pegasus.data.card;

import com.bilibili.app.comm.list.common.data.DislikeReason;
import com.bilibili.pegasus.data.FeedbackType;
import com.bilibili.pegasus.data.card.DislikeRequestRecord;
import fp0.e;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/a.class */
public final class a {
    @NotNull
    public static final DislikeRequestRecord.c a(@NotNull DislikeReason dislikeReason, @NotNull FeedbackType feedbackType) {
        return feedbackType == FeedbackType.DISLIKE ? new DislikeRequestRecord.a(dislikeReason) : new DislikeRequestRecord.b(dislikeReason);
    }

    @NotNull
    public static final DislikeRequestRecord.d b(@NotNull DislikeReason dislikeReason, boolean z6, boolean z7) {
        return new DislikeRequestRecord.d(!z6 ? CollectionsKt.listOf(new e(dislikeReason.id, z7 ? 1 : 0)) : CollectionsKt.emptyList(), z6 ? CollectionsKt.listOf(new e(dislikeReason.id, z7 ? 1 : 0)) : CollectionsKt.emptyList(), dislikeReason.toast, dislikeReason.extra);
    }
}
