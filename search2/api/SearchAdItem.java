package com.bilibili.search2.api;

import Ps0.G;
import Ps0.r;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.adcommon.basic.AdEmptyCardData;
import com.bilibili.adcommon.data.model.AdSearchBean;
import com.bilibili.adcommon.data.model.AdSearchInlineLive;
import com.bilibili.adcommon.data.model.AdSearchLikeButtonItem;
import com.bilibili.adcommon.data.model.AdSearchUgcInline;
import com.bilibili.adcommon.data.model.BaseAdSearchInlineData;
import com.bilibili.adcommon.data.model.FeedAdInfo;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import com.bilibili.search2.result.n;
import dt0.AbstractC6840c;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchAdItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchAdItem extends AbstractC6840c implements I00.a, n, G {
    public static final int $stable = 8;

    @JSONField(name = "brand_ad_account")
    @Nullable
    private AdSearchBean.AdAccount adAccount;

    @JSONField(name = "brand_ad", serialize = false)
    @Nullable
    private FeedAdInfo adBrand;

    @JSONField(name = "game_ad", serialize = false)
    @Nullable
    private FeedAdInfo adGame;

    @JSONField(name = "banner_ad_108", serialize = false)
    @Nullable
    private FeedAdInfo adHot;

    @JSONField(name = "brand_ad_av", serialize = false)
    @Nullable
    private FeedAdInfo adInlineAv;

    @JSONField(name = "brand_ad_live", serialize = false)
    @Nullable
    private FeedAdInfo adInlineLive;

    @JSONField(name = "brand_ad_local_av", serialize = false)
    @Nullable
    private FeedAdInfo adInlineUrl;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private AdSearchBean adSearchItem;

    @JSONField(name = "brand_ad_arcs")
    @Nullable
    private List<AdSearchBean.AdVideo> adVideos;

    @NotNull
    private final Lazy emptyCardData$delegate = LazyKt.lazy(new M3.G(1));

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private IInlineCardData inlineCardDataProxy;

    @JSONField(name = "live_room_inline")
    @Nullable
    private AdSearchInlineLive inlineLive;

    @JSONField(name = "inline_type")
    @Nullable
    private String inlineType;

    @JSONField(name = "picture_ad_147", serialize = false)
    @Nullable
    private FeedAdInfo pictureAd147;

    @JSONField(name = "ugc_inline")
    @Nullable
    private AdSearchUgcInline ugcInline;

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdEmptyCardData emptyCardData_delegate$lambda$0() {
        return new AdEmptyCardData();
    }

    private final AdEmptyCardData getEmptyCardData() {
        return (AdEmptyCardData) this.emptyCardData$delegate.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f2  */
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getImmerseColor() {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.getImmerseColor():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isBrand155SimplifyMode(com.bilibili.adcommon.data.model.Card r4) {
        /*
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.getGoTo()
            java.lang.String r1 = "brand_ad_155"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3b
            r0 = r4
            if (r0 == 0) goto L1c
            r0 = r4
            int r0 = r0.getEnableSearchWeaken()
            r1 = 99
            if (r0 != r1) goto L1c
            goto L3b
        L1c:
            r0 = r4
            if (r0 == 0) goto L3b
            r0 = r4
            java.lang.Integer r0 = r0.getSimplifyMode()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L2c
            goto L3b
        L2c:
            r0 = r4
            int r0 = r0.intValue()
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            r1 = 1
            if (r0 != r1) goto L3b
            goto L3d
        L3b:
            r0 = 0
            r6 = r0
        L3d:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.isBrand155SimplifyMode(com.bilibili.adcommon.data.model.Card):boolean");
    }

    @JSONField(deserialize = false, serialize = false)
    private final boolean isEmptyHolder() {
        return GAdBizKt.getGAdSearch().isEmptyAdView(((K90.c) this).viewType);
    }

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public final AdSearchBean convertToAdSearchItem() {
        if (this.adSearchItem == null) {
            try {
                AdSearchBean adSearchBean = (AdSearchBean) JSON.parseObject(JSON.toJSONString(this), AdSearchBean.class);
                if (adSearchBean != null) {
                    adSearchBean.setAdInfo(r.a(this));
                } else {
                    adSearchBean = null;
                }
                this.adSearchItem = adSearchBean;
            } catch (JSONException e7) {
                this.adSearchItem = new AdSearchBean();
            }
        }
        return this.adSearchItem;
    }

    @Override // Ps0.G
    @JSONField(deserialize = false, serialize = false)
    public boolean drawBgColor() {
        String immerseColor = getImmerseColor();
        return !(immerseColor == null || StringsKt.isBlank(immerseColor));
    }

    @Nullable
    public final AdSearchBean.AdAccount getAdAccount() {
        return this.adAccount;
    }

    @Nullable
    public final FeedAdInfo getAdBrand() {
        return this.adBrand;
    }

    @Nullable
    public final FeedAdInfo getAdGame() {
        return this.adGame;
    }

    @Nullable
    public final FeedAdInfo getAdHot() {
        return this.adHot;
    }

    @Nullable
    public final FeedAdInfo getAdInlineAv() {
        return this.adInlineAv;
    }

    @Nullable
    public final FeedAdInfo getAdInlineLive() {
        return this.adInlineLive;
    }

    @Nullable
    public final FeedAdInfo getAdInlineUrl() {
        return this.adInlineUrl;
    }

    @Nullable
    public final List<AdSearchBean.AdVideo> getAdVideos() {
        return this.adVideos;
    }

    public long getAid() {
        long aid;
        PlayerArgs playerArgs;
        AdSearchLikeButtonItem likeButton;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        if (adSearchUgcInline == null || (likeButton = adSearchUgcInline.getLikeButton()) == null) {
            AdSearchUgcInline adSearchUgcInline2 = this.ugcInline;
            aid = (adSearchUgcInline2 == null || (playerArgs = adSearchUgcInline2.getPlayerArgs()) == null) ? 0L : playerArgs.aid;
        } else {
            aid = likeButton.getAid();
        }
        return aid;
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    @JSONField(deserialize = false, serialize = false)
    public long getAvId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.aid : 0L;
    }

    @Override // Ps0.G
    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public String getBgColor() {
        return getImmerseColor();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    @Override // Ps0.G
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getBgCoverUrl() {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.getBgCoverUrl():java.lang.String");
    }

    @Override // Ps0.G
    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public String getBgTopColor() {
        return getImmerseColor();
    }

    @Override // Ps0.G
    @ColorInt
    @Nullable
    public /* bridge */ /* synthetic */ Integer getBlackCoverColor() {
        return null;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ long getCId() {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.inline.card.IInlineProperty getCardPlayProperty() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.inline.card.IInlineCardData r0 = r0.inlineCardDataProxy
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            com.bilibili.inline.card.IInlineProperty r0 = r0.getCardPlayProperty()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1e
        L16:
            r0 = r2
            com.bilibili.adcommon.basic.AdEmptyCardData r0 = r0.getEmptyCardData()
            com.bilibili.inline.card.IInlineProperty r0 = r0.getCardPlayProperty()
            r3 = r0
        L1e:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.getCardPlayProperty():com.bilibili.inline.card.IInlineProperty");
    }

    @Nullable
    public Long getDuration() {
        PlayerArgs playerArgs;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (playerArgs = adSearchUgcInline.getPlayerArgs()) == null) ? null : Long.valueOf(playerArgs.fakeDuration);
    }

    public /* bridge */ /* synthetic */ long getEpId() {
        return 0L;
    }

    @Override // dt0.AbstractC6841d
    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public String getExtraUri() {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return adSearchUgcInline != null ? adSearchUgcInline.getExtraUri() : null;
    }

    @NotNull
    public String getFrom() {
        return "3";
    }

    @NotNull
    public String getFromSpmid() {
        return "search.search-result.0.0";
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.inline.card.IInlineBehavior getInlineBehavior() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.inline.card.IInlineCardData r0 = r0.inlineCardDataProxy
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            com.bilibili.inline.card.IInlineBehavior r0 = r0.getInlineBehavior()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1e
        L16:
            r0 = r2
            com.bilibili.adcommon.basic.AdEmptyCardData r0 = r0.getEmptyCardData()
            com.bilibili.inline.card.IInlineBehavior r0 = r0.getInlineBehavior()
            r3 = r0
        L1e:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.getInlineBehavior():com.bilibili.inline.card.IInlineBehavior");
    }

    @Nullable
    public final AdSearchInlineLive getInlineLive() {
        return this.inlineLive;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.inline.card.IInlinePlayItem getInlinePlayerItem() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.inline.card.IInlineCardData r0 = r0.inlineCardDataProxy
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            com.bilibili.inline.card.IInlinePlayItem r0 = r0.getInlinePlayerItem()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1e
        L16:
            r0 = r2
            com.bilibili.adcommon.basic.AdEmptyCardData r0 = r0.getEmptyCardData()
            com.bilibili.inline.card.IInlinePlayItem r0 = r0.getInlinePlayerItem()
            r3 = r0
        L1e:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.getInlinePlayerItem():com.bilibili.inline.card.IInlinePlayItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.inline.utils.InlineReportParam getInlineReportParams() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.inline.card.IInlineCardData r0 = r0.inlineCardDataProxy
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            com.bilibili.inline.utils.InlineReportParam r0 = r0.getInlineReportParams()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1e
        L16:
            r0 = r2
            com.bilibili.adcommon.basic.AdEmptyCardData r0 = r0.getEmptyCardData()
            com.bilibili.inline.utils.InlineReportParam r0 = r0.getInlineReportParams()
            r3 = r0
        L1e:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.getInlineReportParams():com.bilibili.inline.utils.InlineReportParam");
    }

    @Nullable
    public final String getInlineType() {
        return this.inlineType;
    }

    public long getLikeCount() {
        AdSearchLikeButtonItem likeButton;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (likeButton = adSearchUgcInline.getLikeButton()) == null) ? 0L : likeButton.getCount();
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean getLikeState() {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        boolean z6 = false;
        if (adSearchUgcInline != null) {
            AdSearchLikeButtonItem likeButton = adSearchUgcInline.getLikeButton();
            z6 = false;
            if (likeButton != null) {
                z6 = false;
                if (likeButton.isSelected()) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getOgvSubType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ long getOid() {
        return 0L;
    }

    @Nullable
    public final FeedAdInfo getPictureAd147() {
        return this.pictureAd147;
    }

    @Override // dt0.AbstractC6841d
    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public PlayerArgs getPlayerArgs() {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return adSearchUgcInline != null ? adSearchUgcInline.getPlayerArgs() : null;
    }

    @Nullable
    public Boolean getRelationCoinState() {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return adSearchUgcInline != null ? Boolean.valueOf(adSearchUgcInline.isCoin()) : null;
    }

    @Nullable
    public Boolean getRelationFavoriteState() {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return adSearchUgcInline != null ? Boolean.valueOf(adSearchUgcInline.isFavorite()) : null;
    }

    @NotNull
    public Boolean getRelationFollowState() {
        AdSearchBean.AdAccount adAccount = this.adAccount;
        boolean z6 = false;
        if (adAccount != null) {
            AdSearchBean.AdAccount.Relation relation = adAccount.getRelation();
            z6 = false;
            if (relation != null) {
                z6 = false;
                if (relation.isUserFollowUp()) {
                    z6 = true;
                }
            }
        }
        return Boolean.valueOf(z6);
    }

    @Nullable
    public Long getRelationLikeNum() {
        AdSearchLikeButtonItem likeButton;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (likeButton = adSearchUgcInline.getLikeButton()) == null) ? null : Long.valueOf(likeButton.getCount());
    }

    @Nullable
    public Boolean getRelationLikeState() {
        AdSearchLikeButtonItem likeButton;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (likeButton = adSearchUgcInline.getLikeButton()) == null) ? null : Boolean.valueOf(likeButton.isSelected());
    }

    public /* bridge */ /* synthetic */ long getRoomId() {
        return 0L;
    }

    public /* bridge */ /* synthetic */ long getSeasonId() {
        return 0L;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getShareBusiness() {
        return 1;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getShareFrom() {
        return super.getShareFrom();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getShareId() {
        return super.getShareId();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getShareOrigin() {
        return super.getShareOrigin();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ SharePlane getSharePanel() {
        return null;
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getShareSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getShareType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getSid() {
        return null;
    }

    @NotNull
    public String getSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.AbstractC6841d
    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public String getTargetUri() {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return adSearchUgcInline != null ? adSearchUgcInline.getUri() : null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ InlineThreePointPanel getThreePointMeta() {
        return null;
    }

    @Nullable
    public final AdSearchUgcInline getUgcInline() {
        return this.ugcInline;
    }

    @Override // com.bilibili.search2.result.k
    @JSONField(deserialize = false, serialize = false)
    public long getUpMid() {
        BaseAdSearchInlineData.UpArgs upArgs;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (upArgs = adSearchUgcInline.getUpArgs()) == null) ? -1L : upArgs.getUpId();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getUpName() {
        return null;
    }

    @Nullable
    public String getUpperAvatar() {
        BaseAdSearchInlineData.UpArgs upArgs;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (upArgs = adSearchUgcInline.getUpArgs()) == null) ? null : upArgs.getUpFace();
    }

    @Nullable
    public String[] getUpperId() {
        BaseAdSearchInlineData.UpArgs upArgs;
        String strValueOf;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (upArgs = adSearchUgcInline.getUpArgs()) == null || (strValueOf = String.valueOf(upArgs.getUpId())) == null) ? null : new String[]{strValueOf};
    }

    @Nullable
    public String getUpperName() {
        BaseAdSearchInlineData.UpArgs upArgs;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (upArgs = adSearchUgcInline.getUpArgs()) == null) ? null : upArgs.getUpName();
    }

    @Nullable
    public String getVideoId() {
        PlayerArgs playerArgs;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (playerArgs = adSearchUgcInline.getPlayerArgs()) == null) ? null : String.valueOf(playerArgs.cid);
    }

    @Nullable
    public String[] getVideoList() {
        PlayerArgs playerArgs;
        String strValueOf;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (playerArgs = adSearchUgcInline.getPlayerArgs()) == null || (strValueOf = String.valueOf(playerArgs.cid)) == null) ? null : new String[]{strValueOf};
    }

    @Nullable
    public String getVideoTitle() {
        return null;
    }

    @Nullable
    public String getWorkId() {
        PlayerArgs playerArgs;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return (adSearchUgcInline == null || (playerArgs = adSearchUgcInline.getPlayerArgs()) == null) ? null : String.valueOf(playerArgs.aid);
    }

    @Nullable
    public String getWorkTitle() {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        return adSearchUgcInline != null ? adSearchUgcInline.getTitle() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    @Override // Ps0.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isBlackOver() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.isEmptyHolder()
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = r3
            java.lang.String r0 = r0.getGoTo()
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L69
            r0 = r7
            int r0 = r0.hashCode()
            r4 = r0
            r0 = r4
            r1 = -1306255263(0xffffffffb2242061, float:-9.5534185E-9)
            if (r0 == r1) goto L58
            r0 = r4
            r1 = 1294199292(0x4d23e9fc, float:1.7187629E8)
            if (r0 == r1) goto L49
            r0 = r4
            r1 = 1705847853(0x65ad2c2d, float:1.0222304E23)
            if (r0 == r1) goto L3a
            r0 = r6
            r5 = r0
            goto L69
        L3a:
            r0 = r7
            java.lang.String r1 = "brand_ad_155"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            r0 = r6
            r5 = r0
            goto L69
        L49:
            r0 = r6
            r5 = r0
            r0 = r7
            java.lang.String r1 = "brand_ad_giant_triple"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            goto L67
        L58:
            r0 = r7
            java.lang.String r1 = "brand_ad_giant"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            r0 = r6
            r5 = r0
            goto L69
        L67:
            r0 = 0
            r5 = r0
        L69:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.isBlackOver():boolean");
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isFavorite() {
        return false;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isHot() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // Ps0.G
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean needCover() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.isEmptyHolder()
            r6 = r0
            r0 = 1
            r5 = r0
            r0 = r6
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = r3
            java.lang.String r0 = r0.getGoTo()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L79
            r0 = r7
            int r0 = r0.hashCode()
            r4 = r0
            r0 = r4
            r1 = -1306255263(0xffffffffb2242061, float:-9.5534185E-9)
            if (r0 == r1) goto L8b
            r0 = r4
            r1 = 1294199292(0x4d23e9fc, float:1.7187629E8)
            if (r0 == r1) goto L7e
            r0 = r4
            r1 = 1705847853(0x65ad2c2d, float:1.0222304E23)
            if (r0 == r1) goto L36
            goto L95
        L36:
            r0 = r7
            java.lang.String r1 = "brand_ad_155"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L95
        L43:
            r0 = r3
            com.bilibili.adcommon.data.model.FeedAdInfo r0 = Ps0.r.a(r0)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L64
            r0 = r7
            com.bilibili.adcommon.data.model.FeedExtra r0 = r0.getExtra()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L64
            r0 = r7
            com.bilibili.adcommon.data.model.Card r0 = r0.card
            r7 = r0
            goto L67
        L64:
            r0 = 0
            r7 = r0
        L67:
            r0 = r7
            if (r0 == 0) goto L79
            r0 = r7
            int r0 = r0.getEnableSearchWeaken()
            r1 = 99
            if (r0 != r1) goto L79
            goto L98
        L79:
            r0 = 0
            r5 = r0
            goto L98
        L7e:
            r0 = r7
            java.lang.String r1 = "brand_ad_giant_triple"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L79
            goto L98
        L8b:
            r0 = r7
            java.lang.String r1 = "brand_ad_giant"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L98
        L95:
            goto L79
        L98:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAdItem.needCover():boolean");
    }

    public final void setAdAccount(@Nullable AdSearchBean.AdAccount adAccount) {
        this.adAccount = adAccount;
    }

    public final void setAdBrand(@Nullable FeedAdInfo feedAdInfo) {
        this.adBrand = feedAdInfo;
    }

    public final void setAdGame(@Nullable FeedAdInfo feedAdInfo) {
        this.adGame = feedAdInfo;
    }

    public final void setAdHot(@Nullable FeedAdInfo feedAdInfo) {
        this.adHot = feedAdInfo;
    }

    public final void setAdInlineAv(@Nullable FeedAdInfo feedAdInfo) {
        this.adInlineAv = feedAdInfo;
    }

    public final void setAdInlineLive(@Nullable FeedAdInfo feedAdInfo) {
        this.adInlineLive = feedAdInfo;
    }

    public final void setAdInlineUrl(@Nullable FeedAdInfo feedAdInfo) {
        this.adInlineUrl = feedAdInfo;
    }

    public final void setAdVideos(@Nullable List<AdSearchBean.AdVideo> list) {
        this.adVideos = list;
    }

    @Override // com.bilibili.search2.result.n
    @JSONField(deserialize = false, serialize = false)
    public void setCoined(boolean z6) {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        if (adSearchUgcInline != null) {
            adSearchUgcInline.setCoin(z6);
        }
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ void setFavorite(boolean z6) {
    }

    @JSONField(deserialize = false, serialize = false)
    public final void setInlineCardData(@Nullable IInlineCardData iInlineCardData) {
        this.inlineCardDataProxy = iInlineCardData;
    }

    public final void setInlineLive(@Nullable AdSearchInlineLive adSearchInlineLive) {
        this.inlineLive = adSearchInlineLive;
    }

    public final void setInlineType(@Nullable String str) {
        this.inlineType = str;
    }

    @Override // com.bilibili.search2.result.n
    @JSONField(deserialize = false, serialize = false)
    public void setIsFav(boolean z6) {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        if (adSearchUgcInline != null) {
            adSearchUgcInline.setFavorite(z6);
        }
    }

    @Override // com.bilibili.search2.result.k
    @JSONField(deserialize = false, serialize = false)
    public void setIsFollow(boolean z6) {
        AdSearchBean.AdAccount.Relation relation;
        AdSearchBean.AdAccount adAccount = this.adAccount;
        if (adAccount == null || (relation = adAccount.getRelation()) == null) {
            return;
        }
        relation.setStatusWithFollow(z6);
    }

    @Override // com.bilibili.search2.result.n
    @JSONField(deserialize = false, serialize = false)
    public void setIsLike(boolean z6) {
        AdSearchLikeButtonItem likeButton;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        if (adSearchUgcInline == null || (likeButton = adSearchUgcInline.getLikeButton()) == null) {
            return;
        }
        likeButton.setSelected(z6 ? 1 : 0);
    }

    @Override // com.bilibili.search2.result.n
    @JSONField(deserialize = false, serialize = false)
    public void setLikeCount(long j7) {
        AdSearchLikeButtonItem likeButton;
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        if (adSearchUgcInline == null || (likeButton = adSearchUgcInline.getLikeButton()) == null) {
            return;
        }
        likeButton.setCount(j7);
    }

    public final void setPictureAd147(@Nullable FeedAdInfo feedAdInfo) {
        this.pictureAd147 = feedAdInfo;
    }

    public final void setUgcInline(@Nullable AdSearchUgcInline adSearchUgcInline) {
        this.ugcInline = adSearchUgcInline;
    }

    @JSONField(deserialize = false, serialize = false)
    public final void updateByMsg(@NotNull VideoStatusMessage videoStatusMessage) {
        AdSearchUgcInline adSearchUgcInline = this.ugcInline;
        if (adSearchUgcInline != null) {
            adSearchUgcInline.setFavorite(videoStatusMessage.getFavState());
        }
        updateLikeState(videoStatusMessage.getLikeState(), videoStatusMessage.getLikeCount());
        setCoined(videoStatusMessage.getCoinState());
    }

    @JSONField(deserialize = false, serialize = false)
    public void updateLikeState(boolean z6, long j7) {
        AdSearchLikeButtonItem likeButton;
        AdSearchLikeButtonItem likeButton2;
        if (j7 >= 0) {
            AdSearchUgcInline adSearchUgcInline = this.ugcInline;
            if (adSearchUgcInline == null || (likeButton2 = adSearchUgcInline.getLikeButton()) == null) {
                return;
            }
            likeButton2.updateSelected(z6, j7);
            return;
        }
        AdSearchUgcInline adSearchUgcInline2 = this.ugcInline;
        if (adSearchUgcInline2 == null || (likeButton = adSearchUgcInline2.getLikeButton()) == null) {
            return;
        }
        likeButton.updateSelected(z6);
    }

    @Override // Ps0.G
    @JSONField(deserialize = false, serialize = false)
    public boolean whenSuggestShowResetColor() {
        int iHashCode;
        boolean z6 = true;
        if (isEmptyHolder()) {
            return true;
        }
        String goTo = getGoTo();
        if (goTo == null || ((iHashCode = goTo.hashCode()) == -1306255263 ? !goTo.equals("brand_ad_giant") : !(iHashCode == 1294199292 ? goTo.equals("brand_ad_giant_triple") : !(iHashCode != 1705847853 || !goTo.equals("brand_ad_155"))))) {
            z6 = false;
        }
        return z6;
    }
}
