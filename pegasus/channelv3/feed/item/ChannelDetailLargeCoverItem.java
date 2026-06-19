package com.bilibili.pegasus.channelv3.feed.item;

import Dp0.b;
import Fn0.g;
import I00.d;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.view.InlineProgressBar;
import com.bilibili.bililive.listplayer.videonew.player.InlineUgcPlayableParams;
import com.bilibili.bplus.followingpublish.fragments.publish.c;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.card.base.H;
import com.bilibili.pegasus.channelv3.movie.ChannelMovieSpmid;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo0.AbstractC8906a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/item/ChannelDetailLargeCoverItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelDetailLargeCoverItem extends AbstractC8906a implements g, d {
    public static final int $stable = 8;
    private final long avId;
    private final int coverLeftIcon1;
    private final int coverLeftIcon2;

    @Nullable
    private final String coverLeftText1;

    @Nullable
    private final String coverLeftText2;

    @Nullable
    private final String coverRightText;

    @Nullable
    private final InlineProgressBar inlineProgressBar;

    @NotNull
    private final IInlineProperty inlineProperty;
    private boolean isFav;

    @Nullable
    private final SharePlane sharePlane;

    @Nullable
    private final InlineThreePointPanel threePointPanel;

    @Nullable
    private final ChannelDetailCardUserInfo userInfo;

    public ChannelDetailLargeCoverItem() {
        this(null, null, 0, null, 0, null, 0L, false, null, null, null, null, 4095, null);
    }

    public ChannelDetailLargeCoverItem(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3, int i8, @Nullable ChannelDetailCardUserInfo channelDetailCardUserInfo, long j7, boolean z6, @Nullable SharePlane sharePlane, @Nullable InlineThreePointPanel inlineThreePointPanel, @Nullable InlineProgressBar inlineProgressBar, @NotNull IInlineProperty iInlineProperty) {
        this.coverRightText = str;
        this.coverLeftText1 = str2;
        this.coverLeftIcon1 = i7;
        this.coverLeftText2 = str3;
        this.coverLeftIcon2 = i8;
        this.userInfo = channelDetailCardUserInfo;
        this.avId = j7;
        this.isFav = z6;
        this.sharePlane = sharePlane;
        this.threePointPanel = inlineThreePointPanel;
        this.inlineProgressBar = inlineProgressBar;
        this.inlineProperty = iInlineProperty;
        ((BasicIndexItem) this).cardType = "channel_detail_large_cover";
    }

    public /* synthetic */ ChannelDetailLargeCoverItem(String str, String str2, int i7, String str3, int i8, ChannelDetailCardUserInfo channelDetailCardUserInfo, long j7, boolean z6, SharePlane sharePlane, InlineThreePointPanel inlineThreePointPanel, InlineProgressBar inlineProgressBar, IInlineProperty iInlineProperty, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? 0 : i7, (i9 & 8) != 0 ? null : str3, (i9 & 16) != 0 ? 0 : i8, (i9 & 32) != 0 ? null : channelDetailCardUserInfo, (i9 & 64) != 0 ? 0L : j7, (i9 & 128) != 0 ? false : z6, (i9 & 256) != 0 ? null : sharePlane, (i9 & 512) != 0 ? null : inlineThreePointPanel, (i9 & 1024) != 0 ? null : inlineProgressBar, (i9 & 2048) != 0 ? new SingleColumnInlineProperty() : iInlineProperty);
    }

    public static /* synthetic */ ChannelDetailLargeCoverItem copy$default(ChannelDetailLargeCoverItem channelDetailLargeCoverItem, String str, String str2, int i7, String str3, int i8, ChannelDetailCardUserInfo channelDetailCardUserInfo, long j7, boolean z6, SharePlane sharePlane, InlineThreePointPanel inlineThreePointPanel, InlineProgressBar inlineProgressBar, IInlineProperty iInlineProperty, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = channelDetailLargeCoverItem.coverRightText;
        }
        if ((i9 & 2) != 0) {
            str2 = channelDetailLargeCoverItem.coverLeftText1;
        }
        if ((i9 & 4) != 0) {
            i7 = channelDetailLargeCoverItem.coverLeftIcon1;
        }
        if ((i9 & 8) != 0) {
            str3 = channelDetailLargeCoverItem.coverLeftText2;
        }
        if ((i9 & 16) != 0) {
            i8 = channelDetailLargeCoverItem.coverLeftIcon2;
        }
        if ((i9 & 32) != 0) {
            channelDetailCardUserInfo = channelDetailLargeCoverItem.userInfo;
        }
        if ((i9 & 64) != 0) {
            j7 = channelDetailLargeCoverItem.avId;
        }
        if ((i9 & 128) != 0) {
            z6 = channelDetailLargeCoverItem.isFav;
        }
        if ((i9 & 256) != 0) {
            sharePlane = channelDetailLargeCoverItem.sharePlane;
        }
        if ((i9 & 512) != 0) {
            inlineThreePointPanel = channelDetailLargeCoverItem.threePointPanel;
        }
        if ((i9 & 1024) != 0) {
            inlineProgressBar = channelDetailLargeCoverItem.inlineProgressBar;
        }
        if ((i9 & 2048) != 0) {
            iInlineProperty = channelDetailLargeCoverItem.inlineProperty;
        }
        return channelDetailLargeCoverItem.copy(str, str2, i7, str3, i8, channelDetailCardUserInfo, j7, z6, sharePlane, inlineThreePointPanel, inlineProgressBar, iInlineProperty);
    }

    @Nullable
    public final String component1() {
        return this.coverRightText;
    }

    @Nullable
    public final InlineThreePointPanel component10() {
        return this.threePointPanel;
    }

    @Nullable
    public final InlineProgressBar component11() {
        return this.inlineProgressBar;
    }

    @NotNull
    public final IInlineProperty component12() {
        return this.inlineProperty;
    }

    @Nullable
    public final String component2() {
        return this.coverLeftText1;
    }

    public final int component3() {
        return this.coverLeftIcon1;
    }

    @Nullable
    public final String component4() {
        return this.coverLeftText2;
    }

    public final int component5() {
        return this.coverLeftIcon2;
    }

    @Nullable
    public final ChannelDetailCardUserInfo component6() {
        return this.userInfo;
    }

    public final long component7() {
        return this.avId;
    }

    public final boolean component8() {
        return this.isFav;
    }

    @Nullable
    public final SharePlane component9() {
        return this.sharePlane;
    }

    @NotNull
    public final ChannelDetailLargeCoverItem copy(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3, int i8, @Nullable ChannelDetailCardUserInfo channelDetailCardUserInfo, long j7, boolean z6, @Nullable SharePlane sharePlane, @Nullable InlineThreePointPanel inlineThreePointPanel, @Nullable InlineProgressBar inlineProgressBar, @NotNull IInlineProperty iInlineProperty) {
        return new ChannelDetailLargeCoverItem(str, str2, i7, str3, i8, channelDetailCardUserInfo, j7, z6, sharePlane, inlineThreePointPanel, inlineProgressBar, iInlineProperty);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelDetailLargeCoverItem)) {
            return false;
        }
        ChannelDetailLargeCoverItem channelDetailLargeCoverItem = (ChannelDetailLargeCoverItem) obj;
        return Intrinsics.areEqual(this.coverRightText, channelDetailLargeCoverItem.coverRightText) && Intrinsics.areEqual(this.coverLeftText1, channelDetailLargeCoverItem.coverLeftText1) && this.coverLeftIcon1 == channelDetailLargeCoverItem.coverLeftIcon1 && Intrinsics.areEqual(this.coverLeftText2, channelDetailLargeCoverItem.coverLeftText2) && this.coverLeftIcon2 == channelDetailLargeCoverItem.coverLeftIcon2 && Intrinsics.areEqual(this.userInfo, channelDetailLargeCoverItem.userInfo) && this.avId == channelDetailLargeCoverItem.avId && this.isFav == channelDetailLargeCoverItem.isFav && Intrinsics.areEqual(this.sharePlane, channelDetailLargeCoverItem.sharePlane) && Intrinsics.areEqual(this.threePointPanel, channelDetailLargeCoverItem.threePointPanel) && Intrinsics.areEqual(this.inlineProgressBar, channelDetailLargeCoverItem.inlineProgressBar) && Intrinsics.areEqual(this.inlineProperty, channelDetailLargeCoverItem.inlineProperty);
    }

    public long getAid() {
        LikeButtonItemV2 likeButtonItemV2 = ((BasePlayerItem) this).likeButton;
        return likeButtonItemV2 != null ? likeButtonItemV2.aid : 0L;
    }

    public final long getAvId() {
        return this.avId;
    }

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return this.inlineProperty;
    }

    public long getCid() {
        PlayerArgs playerArgs = ((BasicIndexItem) this).playerArgs;
        return playerArgs != null ? playerArgs.cid : 0L;
    }

    public long getCoinCount() {
        return 0L;
    }

    public boolean getCoinState() {
        return false;
    }

    public long getCommentCount() {
        return 0L;
    }

    public final int getCoverLeftIcon1() {
        return this.coverLeftIcon1;
    }

    public final int getCoverLeftIcon2() {
        return this.coverLeftIcon2;
    }

    @Nullable
    public final String getCoverLeftText1() {
        return this.coverLeftText1;
    }

    @Nullable
    public final String getCoverLeftText2() {
        return this.coverLeftText2;
    }

    @Nullable
    public final String getCoverRightText() {
        return this.coverRightText;
    }

    @Nullable
    public final InlineProgressBar getInlineProgressBar() {
        return this.inlineProgressBar;
    }

    @NotNull
    public final IInlineProperty getInlineProperty() {
        return this.inlineProperty;
    }

    @Nullable
    public InlineThreePointPanel getInlineThreePointPanel() {
        return this.threePointPanel;
    }

    @NotNull
    /* JADX INFO: renamed from: getInternalInlinePlayableParams, reason: merged with bridge method [inline-methods] */
    public InlineUgcPlayableParams m7953getInternalInlinePlayableParams() {
        InlineUgcPlayableParams inlineUgcPlayableParams = new InlineUgcPlayableParams();
        b.a(inlineUgcPlayableParams, this, 99, 4);
        b.c(inlineUgcPlayableParams, this);
        ChannelMovieSpmid channelMovieSpmid = this.spmid;
        String spmid = channelMovieSpmid != null ? channelMovieSpmid.getSpmid() : null;
        String str = this.fromSpmid;
        inlineUgcPlayableParams.setSpmid(spmid);
        inlineUgcPlayableParams.setFromSpmid(str);
        inlineUgcPlayableParams.setJumpFrom("");
        inlineUgcPlayableParams.setShareJumpFrom("");
        return inlineUgcPlayableParams;
    }

    public long getLikeCount() {
        LikeButtonItemV2 likeButtonItemV2 = ((BasePlayerItem) this).likeButton;
        return likeButtonItemV2 != null ? likeButtonItemV2.count : 0L;
    }

    public boolean getLikeState() {
        LikeButtonItemV2 likeButtonItemV2 = ((BasePlayerItem) this).likeButton;
        return likeButtonItemV2 != null ? likeButtonItemV2.isSelected() : false;
    }

    public long getOid() {
        return this.avId;
    }

    public int getShareBusiness() {
        return 1;
    }

    @Nullable
    public SharePlane getSharePanel() {
        return this.sharePlane;
    }

    @Nullable
    public final SharePlane getSharePlane() {
        return this.sharePlane;
    }

    public int getSpanCount() {
        return 2;
    }

    @Nullable
    public List<ThreePointItem> getThreePoint() {
        return null;
    }

    @Nullable
    public final InlineThreePointPanel getThreePointPanel() {
        return this.threePointPanel;
    }

    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ String getUriQueryParameter(@NonNull String str) {
        return super.getUriQueryParameter(str);
    }

    @Nullable
    public final ChannelDetailCardUserInfo getUserInfo() {
        return this.userInfo;
    }

    public boolean hasTripleLike() {
        return false;
    }

    public int hashCode() {
        String str = this.coverRightText;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.coverLeftText1;
        int iA = I.a(this.coverLeftIcon1, ((iHashCode2 * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.coverLeftText2;
        int iA2 = I.a(this.coverLeftIcon2, (iA + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        ChannelDetailCardUserInfo channelDetailCardUserInfo = this.userInfo;
        int iA3 = z.a(C3554n0.a((iA2 + (channelDetailCardUserInfo == null ? 0 : channelDetailCardUserInfo.hashCode())) * 31, 31, this.avId), 31, this.isFav);
        SharePlane sharePlane = this.sharePlane;
        int iHashCode3 = sharePlane == null ? 0 : sharePlane.hashCode();
        InlineThreePointPanel inlineThreePointPanel = this.threePointPanel;
        int iHashCode4 = inlineThreePointPanel == null ? 0 : inlineThreePointPanel.hashCode();
        InlineProgressBar inlineProgressBar = this.inlineProgressBar;
        if (inlineProgressBar != null) {
            iHashCode = inlineProgressBar.hashCode();
        }
        return this.inlineProperty.hashCode() + ((((((iA3 + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31);
    }

    public /* bridge */ /* synthetic */ void initCache() {
        super.initCache();
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public boolean isFavorite() {
        return this.isFav;
    }

    public boolean isHot() {
        return false;
    }

    public boolean isTripleLikeCoin() {
        return false;
    }

    public boolean isTripleLikeFav() {
        return false;
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

    public final void setFav(boolean z6) {
        this.isFav = z6;
    }

    public void setFavorite(boolean z6) {
        this.isFav = z6;
    }

    public void setTripleLikeCoin(boolean z6) {
    }

    public void setTripleLikeFav(boolean z6) {
    }

    @NotNull
    public String toString() {
        String str = this.coverRightText;
        String str2 = this.coverLeftText1;
        int i7 = this.coverLeftIcon1;
        String str3 = this.coverLeftText2;
        int i8 = this.coverLeftIcon2;
        ChannelDetailCardUserInfo channelDetailCardUserInfo = this.userInfo;
        long j7 = this.avId;
        boolean z6 = this.isFav;
        SharePlane sharePlane = this.sharePlane;
        InlineThreePointPanel inlineThreePointPanel = this.threePointPanel;
        InlineProgressBar inlineProgressBar = this.inlineProgressBar;
        IInlineProperty iInlineProperty = this.inlineProperty;
        StringBuilder sbA = G0.b.a("ChannelDetailLargeCoverItem(coverRightText=", str, ", coverLeftText1=", str2, ", coverLeftIcon1=");
        M.a(i7, ", coverLeftText2=", str3, ", coverLeftIcon2=", sbA);
        sbA.append(i8);
        sbA.append(", userInfo=");
        sbA.append(channelDetailCardUserInfo);
        sbA.append(", avId=");
        c.a(j7, ", isFav=", sbA, z6);
        sbA.append(", sharePlane=");
        sbA.append(sharePlane);
        sbA.append(", threePointPanel=");
        sbA.append(inlineThreePointPanel);
        sbA.append(", inlineProgressBar=");
        sbA.append(inlineProgressBar);
        sbA.append(", inlineProperty=");
        sbA.append(iInlineProperty);
        sbA.append(")");
        return sbA.toString();
    }

    public void updateByMsg(@NotNull VideoStatusMessage videoStatusMessage) {
        updateLikeState(videoStatusMessage.getLikeState(), videoStatusMessage.getLikeCount());
    }

    public void updateCoinStatus(boolean z6, long j7) {
    }

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
