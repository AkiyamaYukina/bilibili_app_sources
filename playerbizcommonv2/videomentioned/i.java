package com.bilibili.playerbizcommonv2.videomentioned;

import com.bapis.bilibili.app.viewunite.common.VideoMentionButton;
import com.bapis.bilibili.app.viewunite.common.VideoMentions;
import com.bilibili.app.gemini.ui.UIComponent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/i.class */
public final class i {
    @NotNull
    public static final <E extends UIComponent.ViewEntry> A<E> a(@NotNull VideoMentions videoMentions) {
        VideoMentionButton button = videoMentions.getButton();
        return new A<>(videoMentions.getTitle(), button != null ? new h(button.getTitle(), button.getIcon()) : null, videoMentions.getVideoReq());
    }
}
