package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PaySDKComicView.class */
@Keep
public final class PaySDKComicView {

    @JSONField(name = "chapterInfo")
    @Nullable
    private ComicChapterInfo chapterInfo;

    @JSONField(name = "epInfo")
    @Nullable
    private ComicEpisodesInfo episodesInfo;

    @JSONField(name = "last_ord")
    private float lastOrd;

    @JSONField(name = "banner")
    @Nullable
    private MangaBanner topBanner;

    @JSONField(name = "id")
    private int comicId = -1;

    @JSONField(name = "title")
    @NotNull
    private String title = "";

    @JSONField(name = "comic_type")
    private int comicType = -1;

    @JSONField(name = "horizontal_cover")
    @NotNull
    private String horizontalCover = "";

    @JSONField(name = "square_cover")
    @NotNull
    private String squareCover = "";

    @JSONField(name = "vertical_cover")
    @NotNull
    private String verticalCover = "";

    @JSONField(name = "is_finish")
    private int isFinish = -2;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status = -1;

    @JSONField(name = "total")
    private int totalEpisodes = -1;

    @JSONField(name = "batch_buy")
    @NotNull
    private List<BatchBuy> batchBuy = CollectionsKt.emptyList();

    @JSONField(name = "ep_chapter_id")
    private int epChapterId = -1;

    @JSONField(name = "pay_mode_chapter")
    private int payModeChapter = -1;

    @JSONField(name = "protocol_info")
    @NotNull
    private List<PaySDKProtocol> protocolList = CollectionsKt.emptyList();

    @JSONField(name = "fragment_top_tips")
    @NotNull
    private String fragmentTopTips = "";

    @JSONField(name = "fragment_bottom_tips")
    @NotNull
    private String fragmentBottomTips = "";

    @NotNull
    public final List<BatchBuy> getBatchBuy() {
        return this.batchBuy;
    }

    @Nullable
    public final ComicChapterInfo getChapterInfo() {
        return this.chapterInfo;
    }

    @NotNull
    public final ComicFinishState getComicFinishState() {
        int i7 = this.isFinish;
        ComicFinishState comicFinishState = ComicFinishState.NotPublished;
        if (i7 != comicFinishState.getState()) {
            comicFinishState = ComicFinishState.Serialized;
            if (i7 != comicFinishState.getState()) {
                comicFinishState = ComicFinishState.End;
                if (i7 != comicFinishState.getState()) {
                    comicFinishState = ComicFinishState.NewPowerProject;
                    if (i7 != comicFinishState.getState()) {
                        comicFinishState = ComicFinishState.Unknown;
                    }
                }
            }
        }
        return comicFinishState;
    }

    public final int getComicId() {
        return this.comicId;
    }

    public final int getComicType() {
        return this.comicType;
    }

    public final int getEpChapterId() {
        return this.epChapterId;
    }

    @Nullable
    public final ComicEpisodesInfo getEpisodesInfo() {
        return this.episodesInfo;
    }

    @NotNull
    public final String getFragmentBottomTips() {
        return this.fragmentBottomTips;
    }

    @NotNull
    public final String getFragmentTopTips() {
        return this.fragmentTopTips;
    }

    @NotNull
    public final String getHorizontalCover() {
        return this.horizontalCover;
    }

    public final float getLastOrd() {
        return this.lastOrd;
    }

    public final int getPayModeChapter() {
        return this.payModeChapter;
    }

    @NotNull
    public final List<PaySDKProtocol> getProtocolList() {
        return this.protocolList;
    }

    @NotNull
    public final ComicShowUiStatus getSDKViewPayMode() {
        int i7 = this.payModeChapter;
        ComicShowUiStatus comicShowUiStatus = ComicShowUiStatus.OnlyVolumePurchase;
        if (i7 != comicShowUiStatus.getStatus()) {
            comicShowUiStatus = ComicShowUiStatus.SingleStoryPurchaseWithBulk;
            if (i7 != comicShowUiStatus.getStatus()) {
                comicShowUiStatus = ComicShowUiStatus.SingleStoryPurchaseWithVolume;
                if (i7 != comicShowUiStatus.getStatus()) {
                    comicShowUiStatus = ComicShowUiStatus.VolumePurchaseWithSingleStory;
                    if (i7 != comicShowUiStatus.getStatus()) {
                        comicShowUiStatus = ComicShowUiStatus.OnlySingleStoryPurchase;
                    }
                }
            }
        }
        return comicShowUiStatus;
    }

    @NotNull
    public final String getSquareCover() {
        return this.squareCover;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final MangaBanner getTopBanner() {
        return this.topBanner;
    }

    public final int getTotalEpisodes() {
        return this.totalEpisodes;
    }

    @NotNull
    public final String getVerticalCover() {
        return this.verticalCover;
    }

    public final int isFinish() {
        return this.isFinish;
    }

    public final void setBatchBuy(@NotNull List<BatchBuy> list) {
        this.batchBuy = list;
    }

    public final void setChapterInfo(@Nullable ComicChapterInfo comicChapterInfo) {
        this.chapterInfo = comicChapterInfo;
    }

    public final void setComicId(int i7) {
        this.comicId = i7;
    }

    public final void setComicType(int i7) {
        this.comicType = i7;
    }

    public final void setEpChapterId(int i7) {
        this.epChapterId = i7;
    }

    public final void setEpisodesInfo(@Nullable ComicEpisodesInfo comicEpisodesInfo) {
        this.episodesInfo = comicEpisodesInfo;
    }

    public final void setFinish(int i7) {
        this.isFinish = i7;
    }

    public final void setFragmentBottomTips(@NotNull String str) {
        this.fragmentBottomTips = str;
    }

    public final void setFragmentTopTips(@NotNull String str) {
        this.fragmentTopTips = str;
    }

    public final void setHorizontalCover(@NotNull String str) {
        this.horizontalCover = str;
    }

    public final void setLastOrd(float f7) {
        this.lastOrd = f7;
    }

    public final void setPayModeChapter(int i7) {
        this.payModeChapter = i7;
    }

    public final void setProtocolList(@NotNull List<PaySDKProtocol> list) {
        this.protocolList = list;
    }

    public final void setSquareCover(@NotNull String str) {
        this.squareCover = str;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setTopBanner(@Nullable MangaBanner mangaBanner) {
        this.topBanner = mangaBanner;
    }

    public final void setTotalEpisodes(int i7) {
        this.totalEpisodes = i7;
    }

    public final void setVerticalCover(@NotNull String str) {
        this.verticalCover = str;
    }
}
