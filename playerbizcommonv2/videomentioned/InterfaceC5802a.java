package com.bilibili.playerbizcommonv2.videomentioned;

import com.bapis.bilibili.app.viewunite.common.Mention;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.VideoMentionedDialogService$componentDelegate$1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.videomentioned.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/a.class */
public interface InterfaceC5802a {
    void a(boolean z6);

    boolean b(@NotNull Mention mention);

    void c(@NotNull VideoMentionedDialogService$componentDelegate$1 videoMentionedDialogService$componentDelegate$1);

    <E extends UIComponent.ViewEntry> void d(@NotNull MentionedCardItem<E> mentionedCardItem);

    @NotNull
    MentionedSectionItem e(@NotNull Mention mention);

    boolean f(@NotNull Mention mention);

    @Nullable
    MentionedCardItem g(@NotNull Mention mention);
}
