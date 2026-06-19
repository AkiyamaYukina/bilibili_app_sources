package com.bilibili.music.podcast.collection.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.FavItem;
import com.bapis.bilibili.app.listener.v1.FavItemAuthor;
import com.bapis.bilibili.app.listener.v1.FavItemStat;
import com.bilibili.music.podcast.utils.InterfaceC5425e;
import li0.C7858a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/data/FavFolderDetailItem.class */
@Keep
public final class FavFolderDetailItem extends C7858a implements InterfaceC5425e {

    @Nullable
    private String cover;
    private long duration;
    private boolean isReported;

    @Nullable
    private FavItem item;

    @NotNull
    private String message = "";

    @Nullable
    private String name;

    @Nullable
    private FavItemAuthor owner;
    private int parts;
    private int reportPosition;

    @Nullable
    private FavItemStat stat;
    private int state;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getAuthorName() {
        /*
            r2 = this;
            r0 = r2
            com.bapis.bilibili.app.listener.v1.FavItemAuthor r0 = r0.owner
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            java.lang.String r0 = r0.getName()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L17
        L14:
            java.lang.String r0 = ""
            r3 = r0
        L17:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.collection.data.FavFolderDetailItem.getAuthorName():java.lang.String");
    }

    public int getCommentCounts() {
        FavItemStat favItemStat = this.stat;
        return favItemStat != null ? favItemStat.getReply() : 0;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @NotNull
    public String getCoverUrl() {
        String str = this.cover;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final FavItem getItem() {
        return this.item;
    }

    public long getItemDuration() {
        return this.duration;
    }

    public int getItemParts() {
        return this.parts;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final FavItemAuthor getOwner() {
        return this.owner;
    }

    public final int getParts() {
        return this.parts;
    }

    public int getPlayCounts() {
        FavItemStat favItemStat = this.stat;
        return favItemStat != null ? favItemStat.getView() : 0;
    }

    public final int getReportPosition() {
        return this.reportPosition;
    }

    @Nullable
    public final FavItemStat getStat() {
        return this.stat;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public String getTitle() {
        String str = this.name;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public boolean isReported() {
        return this.isReported;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setItem(@Nullable FavItem favItem) {
        this.item = favItem;
    }

    public final void setMessage(@NotNull String str) {
        this.message = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOwner(@Nullable FavItemAuthor favItemAuthor) {
        this.owner = favItemAuthor;
    }

    public final void setParts(int i7) {
        this.parts = i7;
    }

    public final void setReportPosition(int i7) {
        this.reportPosition = i7;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public void setReported(boolean z6) {
        this.isReported = z6;
    }

    public final void setStat(@Nullable FavItemStat favItemStat) {
        this.stat = favItemStat;
    }

    public final void setState(int i7) {
        this.state = i7;
    }
}
