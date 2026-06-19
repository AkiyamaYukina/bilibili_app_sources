package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/ComicChapterInfo.class */
@Keep
public final class ComicChapterInfo {

    @JSONField(name = "ep_count")
    private int chapterEpisodesCount;

    @JSONField(name = "expected_eps")
    private int expectedEps;

    @JSONField(name = "is_locked")
    private boolean isLocked;

    @JSONField(name = "id")
    private int id = -1;

    @JSONField(name = "title")
    @NotNull
    private String title = "";

    @JSONField(name = "short_title")
    @NotNull
    private String shortTitle = "";

    @JSONField(name = "pay_mode")
    private int payMode = -1;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status = -1;

    @JSONField(name = "is_finished")
    private int chapterIsFinish = -1;

    @JSONField(name = "cover")
    @NotNull
    private String cover = "";

    @JSONField(name = "pay_gold")
    private float payGold = -1.0f;

    @JSONField(name = "real_gold")
    private float preferentialPrice = -1.0f;

    @JSONField(name = "ord")
    private float ord = -1.0f;

    @JSONField(name = NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private String msg = "";

    @JSONField(name = "deadline")
    @NotNull
    private String preSaleDeadline = "";

    @JSONField(name = "is_pre")
    private int isPre = -1;

    @JSONField(name = "unlock_type")
    private int unlockType = -1;

    @NotNull
    public final ChapterFinishStatus chapterIsFinish() {
        int i7 = this.chapterIsFinish;
        ChapterFinishStatus chapterFinishStatus = ChapterFinishStatus.Finish;
        if (i7 != chapterFinishStatus.getStatus()) {
            chapterFinishStatus = ChapterFinishStatus.Serialization;
            if (i7 != chapterFinishStatus.getStatus()) {
                chapterFinishStatus = ChapterFinishStatus.Unopened;
                if (i7 != chapterFinishStatus.getStatus()) {
                    chapterFinishStatus = ChapterFinishStatus.Unknown;
                }
            }
        }
        return chapterFinishStatus;
    }

    @NotNull
    public final ChapterOnlineStatus chapterOnlineState() {
        int i7 = this.status;
        ChapterOnlineStatus chapterOnlineStatus = ChapterOnlineStatus.Online;
        if (i7 != chapterOnlineStatus.getStatus()) {
            chapterOnlineStatus = ChapterOnlineStatus.TimeOnline;
            if (i7 != chapterOnlineStatus.getStatus()) {
                chapterOnlineStatus = ChapterOnlineStatus.Offline;
                if (i7 != chapterOnlineStatus.getStatus()) {
                    chapterOnlineStatus = ChapterOnlineStatus.Unknown;
                }
            }
        }
        return chapterOnlineStatus;
    }

    @NotNull
    public final PayMode chapterPayMode() {
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
    public final ChapterUnlockType chapterUnlockType() {
        int i7 = this.unlockType;
        ChapterUnlockType chapterUnlockType = ChapterUnlockType.PurchaseUnlocked;
        if (i7 != chapterUnlockType.getType()) {
            chapterUnlockType = ChapterUnlockType.FreeOfChargeForEntireVolume;
            if (i7 != chapterUnlockType.getType()) {
                chapterUnlockType = ChapterUnlockType.OrdinaryRollsExempted;
                if (i7 != chapterUnlockType.getType()) {
                    chapterUnlockType = ChapterUnlockType.FreeReadingCards;
                    if (i7 != chapterUnlockType.getType()) {
                        chapterUnlockType = ChapterUnlockType.EntireVolumeOfAllAidCardFree;
                        if (i7 != chapterUnlockType.getType()) {
                            chapterUnlockType = ChapterUnlockType.Unknown;
                        }
                    }
                }
            }
        }
        return chapterUnlockType;
    }

    public final int getChapterEpisodesCount() {
        return this.chapterEpisodesCount;
    }

    public final int getChapterIsFinish() {
        return this.chapterIsFinish;
    }

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    public final int getExpectedEps() {
        return this.expectedEps;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
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
    public final String getPreSaleDeadline() {
        return this.preSaleDeadline;
    }

    public final float getPreferentialPrice() {
        return this.preferentialPrice;
    }

    @NotNull
    public final String getShortTitle() {
        return this.shortTitle;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUnlockType() {
        return this.unlockType;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final int isPre() {
        return this.isPre;
    }

    public final void setChapterEpisodesCount(int i7) {
        this.chapterEpisodesCount = i7;
    }

    public final void setChapterIsFinish(int i7) {
        this.chapterIsFinish = i7;
    }

    public final void setCover(@NotNull String str) {
        this.cover = str;
    }

    public final void setExpectedEps(int i7) {
        this.expectedEps = i7;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setLocked(boolean z6) {
        this.isLocked = z6;
    }

    public final void setMsg(@NotNull String str) {
        this.msg = str;
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

    public final void setPre(int i7) {
        this.isPre = i7;
    }

    public final void setPreSaleDeadline(@NotNull String str) {
        this.preSaleDeadline = str;
    }

    public final void setPreferentialPrice(float f7) {
        this.preferentialPrice = f7;
    }

    public final void setShortTitle(@NotNull String str) {
        this.shortTitle = str;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setUnlockType(int i7) {
        this.unlockType = i7;
    }
}
