package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ComicEpisodesInfo.class */
@Keep
public final class ComicEpisodesInfo {

    @JSONField(name = "is_in_free")
    private boolean currentChapterHasInFree;

    @JSONField(name = "is_locked")
    private boolean isLocked;

    @JSONField(name = "id")
    private int epId = -1;

    @JSONField(name = "ord")
    private float ord = -1.0f;

    @JSONField(name = "read")
    private int isRead = -1;

    @JSONField(name = "pay_mode")
    private int payMode = -1;

    @JSONField(name = "pay_gold")
    private float payGold = -1.0f;

    @JSONField(name = TextSource.CFG_SIZE)
    private int size = -1;

    @JSONField(name = "short_title")
    @NotNull
    private String shortTitle = "";

    @JSONField(name = "title")
    @NotNull
    private String title = "";

    @JSONField(name = "chapter_id")
    private int chapterId = -1;

    @JSONField(name = "index_last_modified")
    @NotNull
    private String indexLastModified = "";

    @NotNull
    public final PayMode episodePayMode() {
        int i7 = this.payMode;
        PayMode payMode = PayMode.Free;
        if (i7 != payMode.getMode()) {
            payMode = PayMode.NeedPay;
            if (i7 != payMode.getMode()) {
                payMode = PayMode.Unknown;
            }
        }
        return payMode;
    }

    @NotNull
    public final ReadStatus episodeReadState() {
        int i7 = this.isRead;
        ReadStatus readStatus = ReadStatus.Read;
        if (i7 != readStatus.getStatus()) {
            readStatus = ReadStatus.Unread;
            if (i7 != readStatus.getStatus()) {
                readStatus = ReadStatus.Unknown;
            }
        }
        return readStatus;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final boolean getCurrentChapterHasInFree() {
        return this.currentChapterHasInFree;
    }

    public final int getEpId() {
        return this.epId;
    }

    @NotNull
    public final String getIndexLastModified() {
        return this.indexLastModified;
    }

    public final float getOrd() {
        return this.ord;
    }

    public final float getPayGold() {
        return this.payGold;
    }

    public final int getPayMode() {
        return this.payMode;
    }

    @NotNull
    public final String getShortTitle() {
        return this.shortTitle;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final int isRead() {
        return this.isRead;
    }

    public final void setChapterId(int i7) {
        this.chapterId = i7;
    }

    public final void setCurrentChapterHasInFree(boolean z6) {
        this.currentChapterHasInFree = z6;
    }

    public final void setEpId(int i7) {
        this.epId = i7;
    }

    public final void setIndexLastModified(@NotNull String str) {
        this.indexLastModified = str;
    }

    public final void setLocked(boolean z6) {
        this.isLocked = z6;
    }

    public final void setOrd(float f7) {
        this.ord = f7;
    }

    public final void setPayGold(float f7) {
        this.payGold = f7;
    }

    public final void setPayMode(int i7) {
        this.payMode = i7;
    }

    public final void setRead(int i7) {
        this.isRead = i7;
    }

    public final void setShortTitle(@NotNull String str) {
        this.shortTitle = str;
    }

    public final void setSize(int i7) {
        this.size = i7;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }
}
