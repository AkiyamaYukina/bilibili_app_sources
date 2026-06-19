package com.bilibili.pegasus.data.base;

import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.utils.InlineReportParam;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
import com.bilibili.pegasus.data.component.ArgsData;
import com.bilibili.pegasus.data.component.UpArgsData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.video.bilicardplayer.DataRelationShipChain;
import tv.danmaku.video.bilicardplayer.DataWorkInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/base/BasePegasusPlayerData.class */
public interface BasePegasusPlayerData extends BasePegasusData, IInlineCardData, DataRelationShipChain, DataWorkInfo {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/base/BasePegasusPlayerData$a.class */
    public static final class a implements IInlineBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BasePegasusPlayerData f77278a;

        public a(BasePegasusPlayerData basePegasusPlayerData) {
            this.f77278a = basePegasusPlayerData;
        }

        public final long getCardAutoPlayDelay() {
            return 0L;
        }

        public final boolean getCardPlayable(boolean z6) {
            return this.f77278a.getInternalCardPlayable(z6);
        }

        public final boolean getReleaseOnEnd() {
            return this.f77278a.isReleaseOnEnd();
        }

        public final int getRepeatCount() {
            return this.f77278a.getRepeatCount();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/base/BasePegasusPlayerData$b.class */
    public static final class b implements IInlinePlayItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BasePegasusPlayerData f77279a;

        public b(BasePegasusPlayerData basePegasusPlayerData) {
            this.f77279a = basePegasusPlayerData;
        }

        public final CharSequence getInlineLogDescription() {
            return this.f77279a.getInternalInlineLogDescription();
        }

        public final Video.PlayableParams getInlinePlayableParams() {
            return this.f77279a.getInternalInlinePlayableParams();
        }
    }

    default boolean canPlay() {
        boolean z6 = true;
        if (getCanPlay() != 1) {
            z6 = false;
        }
        return z6;
    }

    int getCanPlay();

    boolean getDisableDanmaku();

    @Nullable
    default Long getDuration() {
        return getPlayerArgs() != null ? Long.valueOf(r0.fakeDuration) : null;
    }

    @Nullable
    String getExtraUri();

    @Nullable
    default String getFrom() {
        return "76";
    }

    @Nullable
    default String getFromSpmid() {
        return PlayerParamsBuilderKt.SPMID_RECOMMEND;
    }

    boolean getHideDanmakuSwitch();

    @NotNull
    default IInlineBehavior getInlineBehavior() {
        return new a(this);
    }

    @NotNull
    default IInlinePlayItem getInlinePlayerItem() {
        return new b(this);
    }

    @Nullable
    default InlineReportParam getInlineReportParams() {
        InlineReportParam inlineReportParam;
        PlayerArgs playerArgs = getPlayerArgs();
        if (playerArgs != null) {
            String cardType = getCardType();
            String str = cardType;
            if (cardType == null) {
                str = "";
            }
            inlineReportParam = new InlineReportParam(str, playerArgs.aid, playerArgs.cid, playerArgs.epid, playerArgs.pgcSeasonId, playerArgs.roomId, (String) null, 64, (DefaultConstructorMarker) null);
        } else {
            inlineReportParam = null;
        }
        return inlineReportParam;
    }

    @Nullable
    InlineThreePointPanel getInlineThreePointPanel();

    @Nullable
    default String getInlineUri() {
        return null;
    }

    default boolean getInternalCardPlayable(boolean z6) {
        return z6 && canPlay();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    default java.lang.CharSequence getInternalInlineLogDescription() {
        /*
            r2 = this;
            r0 = r2
            tv.danmaku.biliplayerv2.service.Video$PlayableParams r0 = r0.getInternalInlinePlayableParams()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L17
            r0 = r3
            java.lang.String r0 = r0.getLogDescription()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L17
            goto L1c
        L17:
            r0 = r2
            java.lang.String r0 = r0.toString()
            r3 = r0
        L1c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.data.base.BasePegasusPlayerData.getInternalInlineLogDescription():java.lang.CharSequence");
    }

    @Nullable
    Video.PlayableParams getInternalInlinePlayableParams();

    @Nullable
    LikeButtonItemV2 getLikeButton();

    @Nullable
    default Boolean getRelationCoinState() {
        return Boolean.valueOf(isCoin());
    }

    @Nullable
    default Boolean getRelationFavoriteState() {
        return Boolean.valueOf(isFav());
    }

    @Nullable
    default Boolean getRelationFollowState() {
        Boolean boolValueOf;
        if (getUpArgs() != null) {
            UpArgsData upArgs = getUpArgs();
            boolean z6 = false;
            if (upArgs != null) {
                z6 = false;
                if (upArgs.getSelected() == 1) {
                    z6 = true;
                }
            }
            boolValueOf = Boolean.valueOf(z6);
        } else if (getArgs() != null) {
            ArgsData args = getArgs();
            boolean z7 = false;
            if (args != null) {
                z7 = false;
                if (args.isFollow() == 1) {
                    z7 = true;
                }
            }
            boolValueOf = Boolean.valueOf(z7);
        } else {
            boolValueOf = null;
        }
        return boolValueOf;
    }

    @Nullable
    default Long getRelationLikeNum() {
        LikeButtonItemV2 likeButton = getLikeButton();
        return Long.valueOf(likeButton != null ? likeButton.count : 0L);
    }

    @Nullable
    default Boolean getRelationLikeState() {
        LikeButtonItemV2 likeButton = getLikeButton();
        boolean z6 = false;
        if (likeButton != null) {
            z6 = false;
            if (likeButton.isSelected()) {
                z6 = true;
            }
        }
        return Boolean.valueOf(z6);
    }

    default int getRepeatCount() {
        return 1;
    }

    @Nullable
    String getReportFlowData();

    default boolean getShareMenuEnable() {
        return false;
    }

    @Nullable
    default String getSpmid() {
        return PlayerParamsBuilderKt.SPMID_RECOMMEND;
    }

    @Nullable
    String getTalkBack();

    @Nullable
    default String getUpperAvatar() {
        UpArgsData upArgs = getUpArgs();
        return upArgs != null ? upArgs.getUpFace() : null;
    }

    @Nullable
    default String[] getUpperId() {
        UpArgsData upArgs = getUpArgs();
        return upArgs != null ? new String[]{String.valueOf(upArgs.getUpId())} : null;
    }

    @Nullable
    default String getUpperName() {
        UpArgsData upArgs = getUpArgs();
        return upArgs != null ? upArgs.getUpName() : null;
    }

    @Nullable
    default String getVideoId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? String.valueOf(playerArgs.cid) : null;
    }

    @Nullable
    default String[] getVideoList() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? new String[]{String.valueOf(playerArgs.cid)} : null;
    }

    @Nullable
    default String getVideoTitle() {
        return null;
    }

    @Nullable
    default String getWorkId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? String.valueOf(playerArgs.aid) : null;
    }

    @Nullable
    default String getWorkTitle() {
        return getTitle();
    }

    boolean isCoin();

    boolean isFav();

    default boolean isInlinePlayable() {
        boolean z6 = true;
        if (getCanPlay() != 1) {
            z6 = false;
        }
        return z6;
    }

    default boolean isPreview() {
        PlayerArgs playerArgs = getPlayerArgs();
        boolean z6 = false;
        if (playerArgs != null) {
            z6 = false;
            if (playerArgs.isPreview == 1) {
                z6 = true;
            }
        }
        return z6;
    }

    default boolean isReleaseOnEnd() {
        return true;
    }

    void setCoin(boolean z6);

    void setFav(boolean z6);
}
