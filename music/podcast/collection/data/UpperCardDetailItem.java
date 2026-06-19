package com.bilibili.music.podcast.collection.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bilibili.music.podcast.utils.InterfaceC5425e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/data/UpperCardDetailItem.class */
@Keep
public final class UpperCardDetailItem implements InterfaceC5425e {
    private long duration;
    private boolean isVt;

    @Nullable
    private PlayItem item;
    private boolean mIsReported;
    private int parts;
    private long playCounts;
    private long replyCounts;
    private int reportPosition;
    private int state;
    private long upperMid;

    @NotNull
    private String title = "";

    @NotNull
    private String cover = "";

    @NotNull
    private String upperName = "";

    @NotNull
    private String message = "";

    @NotNull
    private String viewContent = "";

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final PlayItem getItem() {
        return this.item;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getParts() {
        return this.parts;
    }

    public final long getPlayCounts() {
        return this.playCounts;
    }

    public final long getReplyCounts() {
        return this.replyCounts;
    }

    public final int getReportPosition() {
        return this.reportPosition;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getUpperMid() {
        return this.upperMid;
    }

    @NotNull
    public final String getUpperName() {
        return this.upperName;
    }

    @NotNull
    public final String getViewContent() {
        return this.viewContent;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public boolean isReported() {
        return this.mIsReported;
    }

    public final boolean isVt() {
        return this.isVt;
    }

    public final void setCover(@NotNull String str) {
        this.cover = str;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setItem(@Nullable PlayItem playItem) {
        this.item = playItem;
    }

    public final void setMessage(@NotNull String str) {
        this.message = str;
    }

    public final void setParts(int i7) {
        this.parts = i7;
    }

    public final void setPlayCounts(long j7) {
        this.playCounts = j7;
    }

    public final void setReplyCounts(long j7) {
        this.replyCounts = j7;
    }

    public final void setReportPosition(int i7) {
        this.reportPosition = i7;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public void setReported(boolean z6) {
        this.mIsReported = z6;
    }

    public final void setState(int i7) {
        this.state = i7;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setUpperMid(long j7) {
        this.upperMid = j7;
    }

    public final void setUpperName(@NotNull String str) {
        this.upperName = str;
    }

    public final void setViewContent(@NotNull String str) {
        this.viewContent = str;
    }

    public final void setVt(boolean z6) {
        this.isVt = z6;
    }
}
