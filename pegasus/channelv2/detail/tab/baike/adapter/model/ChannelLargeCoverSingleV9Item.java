package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model;

import Dp0.b;
import Fn0.c;
import Fn0.g;
import I00.d;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.service.CoverStatDisplay;
import com.bilibili.app.comm.list.common.inline.service.InlineCoverBadge;
import com.bilibili.app.comm.list.common.inline.service.InlinePendantAvatar;
import com.bilibili.app.comm.list.common.inline.view.InlineProgressBar;
import com.bilibili.bililive.listplayer.videonew.player.InlineUgcPlayableParams;
import com.bilibili.droid.StringUtil;
import com.bilibili.inline.biz.card.ChronosData;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Avatar;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.api.modelv2.MultiplyDesc;
import com.bilibili.pegasus.api.modelv2.Tag;
import com.bilibili.pegasus.card.base.H;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import eo0.AbstractC6962a;
import fo0.C7134d;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/model/ChannelLargeCoverSingleV9Item.class */
@Keep
public class ChannelLargeCoverSingleV9Item extends AbstractC6962a implements g, d, c, C7134d.a {

    @Nullable
    @JSONField(name = "avatar")
    public Avatar avatar;

    @JSONField(name = "cover_left_icon_1")
    public int coverLeftIcon1;

    @JSONField(name = "cover_left_icon_2")
    public int coverLeftIcon2;

    @Nullable
    @JSONField(name = "cover_left_text_1")
    public String coverLeftText1;

    @Nullable
    @JSONField(name = "cover_left_text_2")
    public String coverLeftText2;

    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;

    @Nullable
    @JSONField(name = "desc")
    public String desc;

    @Nullable
    @JSONField(name = "inline_progress_bar")
    public InlineProgressBar inlineProgressBar;

    @JSONField(deserialize = false, serialize = false)
    public final IInlineProperty internalInlineProperty = new SingleColumnInlineProperty();

    @JSONField(name = "is_hot")
    public boolean isHot;

    @Nullable
    @JSONField(name = "multiply_desc")
    public MultiplyDesc multiplyDesc;

    @JSONField(name = "official_icon_v2")
    public int officialIconV2;

    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReasonStyle;

    @Nullable
    @JSONField(name = "share_plane")
    public SharePlane sharePlane;

    @Nullable
    @JSONField(name = "goto_icon")
    public StoryCardIcon storyCardIcon;

    @Override // fo0.C7134d.a
    public boolean filter() {
        return !TextUtils.isEmpty(((BasicIndexItem) this).title);
    }

    @JSONField(deserialize = false, serialize = false)
    public long getAid() {
        LikeButtonItemV2 likeButtonItemV2 = ((BasePlayerItem) this).likeButton;
        long j7 = likeButtonItemV2 == null ? 0L : likeButtonItemV2.aid;
        long j8 = j7;
        if (j7 == 0) {
            PlayerArgs playerArgs = ((BasicIndexItem) this).playerArgs;
            j8 = playerArgs == null ? 0L : playerArgs.aid;
        }
        return j8;
    }

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public Avatar getAvatar() {
        return this.avatar;
    }

    @NonNull
    public IInlineProperty getCardPlayProperty() {
        return this.internalInlineProperty;
    }

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public ChronosData getChronosData() {
        boolean z6 = this.isAtten;
        LikeButtonItemV2 likeButtonItemV2 = ((BasePlayerItem) this).likeButton;
        boolean z7 = likeButtonItemV2 != null && likeButtonItemV2.isSelected();
        boolean z8 = ((BasePlayerItem) this).isFavorite;
        boolean z9 = ((BasePlayerItem) this).isCoin;
        LikeButtonItemV2 likeButtonItemV22 = ((BasePlayerItem) this).likeButton;
        return new ChronosData(z6, z7, z8, z9, likeButtonItemV22 != null ? likeButtonItemV22.count : 0L);
    }

    public long getCid() {
        PlayerArgs playerArgs = ((BasicIndexItem) this).playerArgs;
        if (playerArgs != null) {
            return playerArgs.cid;
        }
        return 0L;
    }

    public long getCoinCount() {
        return 0L;
    }

    public boolean getCoinState() {
        return ((BasePlayerItem) this).isCoin;
    }

    public long getCommentCount() {
        return 0L;
    }

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public InlineCoverBadge getCoverBadge() {
        return null;
    }

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public ArrayList<CoverStatDisplay> getInlineStatArgsList() {
        ArrayList<CoverStatDisplay> arrayList = new ArrayList<>(2);
        arrayList.add(StringUtil.isBlank(this.coverLeftText1) ? null : new CoverStatDisplay(this.coverLeftIcon1, this.coverLeftText1));
        arrayList.add(StringUtil.isBlank(this.coverLeftText2) ? null : new CoverStatDisplay(this.coverLeftIcon2, this.coverLeftText2));
        return arrayList;
    }

    @Nullable
    public InlineThreePointPanel getInlineThreePointPanel() {
        return ((BasePlayerItem) this).inlineThreePointPanel;
    }

    @Nullable
    public Video.PlayableParams getInternalInlinePlayableParams() {
        InlineUgcPlayableParams inlineUgcPlayableParams = new InlineUgcPlayableParams();
        b.a(inlineUgcPlayableParams, this, 99, 4);
        b.c(inlineUgcPlayableParams, this);
        inlineUgcPlayableParams.setSpmid("traffic.new-channel-detail-baike.0.0");
        inlineUgcPlayableParams.setFromSpmid("traffic.new-channel-detail-baike.0.0");
        inlineUgcPlayableParams.setJumpFrom("");
        inlineUgcPlayableParams.setShareJumpFrom("");
        return inlineUgcPlayableParams;
    }

    @JSONField(deserialize = false, serialize = false)
    public long getLikeCount() {
        LikeButtonItemV2 likeButtonItemV2 = ((BasePlayerItem) this).likeButton;
        return likeButtonItemV2 == null ? 0L : likeButtonItemV2.count;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean getLikeState() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.app.comm.list.common.data.LikeButtonItemV2 r0 = r0.likeButton
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L18
            r0 = r6
            int r0 = r0.selected
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L18
            goto L1a
        L18:
            r0 = 0
            r5 = r0
        L1a:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelLargeCoverSingleV9Item.getLikeState():boolean");
    }

    public long getOid() {
        return getAid();
    }

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public InlinePendantAvatar getPendantAvatar() {
        return null;
    }

    public int getShareBusiness() {
        return 1;
    }

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public SharePlane getSharePanel() {
        return this.sharePlane;
    }

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public List<ThreePointItem> getThreePoint() {
        return ((BasicIndexItem) this).threePoint;
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getUriQueryParameter(@NonNull String str) {
        return super.getUriQueryParameter(str);
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean hasTripleLike() {
        LikeButtonItemV2 likeButtonItemV2 = ((BasePlayerItem) this).likeButton;
        boolean z6 = false;
        if (likeButtonItemV2 != null) {
            z6 = false;
            if (((BasePlayerItem) this).isCoin) {
                z6 = false;
                if (((BasePlayerItem) this).isFavorite) {
                    z6 = false;
                    if (likeButtonItemV2.isSelected()) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    public /* bridge */ /* synthetic */ void initCache() {
        super.initCache();
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isFavorite() {
        return ((BasePlayerItem) this).isFavorite;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isHot() {
        return this.isHot;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isTripleLikeCoin() {
        return ((BasePlayerItem) this).isCoin;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isTripleLikeFav() {
        return ((BasePlayerItem) this).isFavorite;
    }

    public int repeatCount() {
        return ((Boolean) H.a.getValue()).booleanValue() ? -1 : 1;
    }

    public /* bridge */ /* synthetic */ void safeInitCache() {
        super.safeInitCache();
    }

    public /* bridge */ /* synthetic */ boolean sendDislikeIfOnlyOneTitle() {
        return true;
    }

    public void setCommentCount(long j7) {
    }

    @JSONField(deserialize = false, serialize = false)
    public void setFavorite(boolean z6) {
        ((BasePlayerItem) this).isFavorite = z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setTripleLikeCoin(boolean z6) {
        ((BasePlayerItem) this).isCoin = z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setTripleLikeFav(boolean z6) {
        ((BasePlayerItem) this).isFavorite = z6;
    }

    public boolean shareMenuEnable() {
        InlineThreePointPanel inlineThreePointPanel = ((BasePlayerItem) this).inlineThreePointPanel;
        return inlineThreePointPanel != null && inlineThreePointPanel.isPanelEnable();
    }

    public void updateByMsg(VideoStatusMessage videoStatusMessage) {
        updateCoinStatus(videoStatusMessage.getCoinState(), videoStatusMessage.getCoinCount());
        updateLikeState(videoStatusMessage.getLikeState(), videoStatusMessage.getLikeCount());
        setCommentCount(videoStatusMessage.getCommentCount());
        ((BasePlayerItem) this).isFavorite = videoStatusMessage.getFavState();
    }

    public void updateCoinStatus(boolean z6, long j7) {
        ((BasePlayerItem) this).isCoin = z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public void updateLikeState(boolean z6, long j7) {
        LikeButtonItemV2 likeButtonItemV2 = ((BasePlayerItem) this).likeButton;
        if (likeButtonItemV2 != null) {
            if (j7 >= 0) {
                likeButtonItemV2.updateSelected(z6, j7);
            } else {
                likeButtonItemV2.updateSelected(z6);
            }
        }
    }
}
