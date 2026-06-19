package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.relation.utils.FollowFlowHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicFollowButton.class */
public final class MusicFollowButton extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public FollowFlowHelper f67094l;

    public MusicFollowButton(@NotNull Context context) {
        super(context, null, 0);
    }

    public MusicFollowButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.bilibili.music.podcast.view.k
    public final void a(boolean z6) {
        FollowFlowHelper followFlowHelper = this.f67094l;
        if (followFlowHelper != null) {
            followFlowHelper.setIsAttention(true);
        }
        super.a(z6);
    }

    @Override // com.bilibili.music.podcast.view.k
    public final void b(boolean z6) {
        FollowFlowHelper followFlowHelper = this.f67094l;
        if (followFlowHelper != null) {
            followFlowHelper.setIsAttention(false);
        }
        super.b(z6);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FollowFlowHelper followFlowHelper = this.f67094l;
        if (followFlowHelper != null) {
            followFlowHelper.unRegisterFollowChangeListener();
        }
        this.f67094l = null;
    }
}
