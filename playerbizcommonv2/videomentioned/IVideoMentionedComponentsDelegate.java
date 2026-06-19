package com.bilibili.playerbizcommonv2.videomentioned;

import com.bapis.bilibili.app.viewunite.common.MentionCard;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/IVideoMentionedComponentsDelegate.class */
public interface IVideoMentionedComponentsDelegate {
    void onMentionCardClick(@NotNull MentionCard mentionCard);

    void onMentionCardMoreClick(@NotNull MentionCard mentionCard);

    @Nullable
    default VideoMentionAdParams provideAdParams() {
        return null;
    }

    @NotNull
    Map<String, String> provideCommonReportParams();
}
