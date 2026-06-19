package com.bilibili.mall;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/IMallCommentLinkService.class */
public interface IMallCommentLinkService {
    void onClick(@NotNull Context context, @NotNull MallCommentLinkSourceType mallCommentLinkSourceType, @Nullable Object obj, @Nullable String str);
}
