package com.bilibili.biligame.card.newcard.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.bean.BiliGameAdGameDataBean;
import com.bilibili.biligame.bean.BiliGameTestInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/BiliGameCardDataBean.class */
@Keep
public class BiliGameCardDataBean {
    private static final int BUTTON_TYPE_DEFAULT = 0;

    @JSONField(name = "ad_pkg")
    @Nullable
    private BiliGameAdGameDataBean adGamePkg;

    @JSONField(name = "android_min_sdk")
    @Nullable
    private String androidMinSdk;

    @JSONField(name = "is_android_pkg_incr_updated")
    private int androidPkgIncrUpdated;

    @JSONField(name = "android_pkg_size")
    private long androidPkgSize;

    @JSONField(name = "android_pkg_ver")
    @Nullable
    private String androidPkgVer;

    @JSONField(name = "android_sign")
    @Nullable
    private String androidSign;

    @JSONField(name = "is_book")
    private boolean booked;

    @JSONField(name = "button_link")
    @Nullable
    private String buttonLink;

    @Nullable
    private String buttonText;

    @JSONField(name = "user_status")
    @Nullable
    private BiliGameButtonUserStatus buttonUserStatus;

    @JSONField(name = "coupon_info")
    @Nullable
    private BiliGameButtonCouponInfo couponInfo;

    @JSONField(name = "download_link")
    @Nullable
    private String downloadLink;

    @JSONField(name = "download_link2")
    @Nullable
    private String downloadLink2;

    @JSONField(name = "game_name")
    @Nullable
    private String gameName;

    @JSONField(name = "game_status")
    private int gameStatus;

    @JSONField(name = "game_version_info")
    @Nullable
    private BiliGameVersionInfo gameVersionInfo;

    @JSONField(name = "gift_detail_info")
    @Nullable
    private BiliGameButtonGiftInfo giftInfo;

    @JSONField(name = "link")
    @Nullable
    private String link;

    @JSONField(name = "is_main_game")
    private boolean mainGame;

    @JSONField(name = "main_game_detail")
    @Nullable
    private BiliGameCardMainGame mainGameDetail;

    @JSONField(name = "test_info")
    @Nullable
    private BiliGameTestInfo testInfo;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int BUTTON_TYPE_TEST = 1;
    private static final int BUTTON_TYPE_VERSION_BOOK = 2;
    private static final int BUTTON_TYPE_GIFT = 3;
    private static final int BUTTON_TYPE_EVENT = 4;
    private static final int BUTTON_TYPE_COUPON = 5;
    private static final int BUTTON_TYPE_FOLLOW = 6;

    @JSONField(name = "game_base_id")
    private long gameBaseId = -1;

    @JSONField(name = "android_pkg_name")
    @NotNull
    private String androidPkgName = "";

    @Nullable
    private String channelId = "0";

    @NotNull
    private String channelExtra = "";

    @JSONField(name = "button_type")
    private int buttonType = BUTTON_TYPE_DEFAULT;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/BiliGameCardDataBean$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getBUTTON_TYPE_COUPON() {
            return BiliGameCardDataBean.BUTTON_TYPE_COUPON;
        }

        public final int getBUTTON_TYPE_DEFAULT() {
            return BiliGameCardDataBean.BUTTON_TYPE_DEFAULT;
        }

        public final int getBUTTON_TYPE_EVENT() {
            return BiliGameCardDataBean.BUTTON_TYPE_EVENT;
        }

        public final int getBUTTON_TYPE_FOLLOW() {
            return BiliGameCardDataBean.BUTTON_TYPE_FOLLOW;
        }

        public final int getBUTTON_TYPE_GIFT() {
            return BiliGameCardDataBean.BUTTON_TYPE_GIFT;
        }

        public final int getBUTTON_TYPE_TEST() {
            return BiliGameCardDataBean.BUTTON_TYPE_TEST;
        }

        public final int getBUTTON_TYPE_VERSION_BOOK() {
            return BiliGameCardDataBean.BUTTON_TYPE_VERSION_BOOK;
        }
    }

    public final boolean alreadyApplyTest() {
        BiliGameButtonUserStatus biliGameButtonUserStatus = this.buttonUserStatus;
        return biliGameButtonUserStatus != null ? biliGameButtonUserStatus.getSignedUp() : false;
    }

    public final boolean couponAllReceived() {
        BiliGameButtonCouponInfo biliGameButtonCouponInfo = this.couponInfo;
        boolean z6 = true;
        if (biliGameButtonCouponInfo != null) {
            z6 = biliGameButtonCouponInfo.getCouponCount() == 0;
        }
        return z6;
    }

    public final boolean followed() {
        BiliGameButtonUserStatus biliGameButtonUserStatus = this.buttonUserStatus;
        return biliGameButtonUserStatus != null ? biliGameButtonUserStatus.isFollowed() : false;
    }

    @Nullable
    public final BiliGameAdGameDataBean getAdGamePkg() {
        return this.adGamePkg;
    }

    @Nullable
    public final String getAndroidMinSdk() {
        return this.androidMinSdk;
    }

    public final int getAndroidPkgIncrUpdated() {
        return this.androidPkgIncrUpdated;
    }

    @NotNull
    public final String getAndroidPkgName() {
        return this.androidPkgName;
    }

    public final long getAndroidPkgSize() {
        return this.androidPkgSize;
    }

    @Nullable
    public final String getAndroidPkgVer() {
        return this.androidPkgVer;
    }

    @Nullable
    public final String getAndroidSign() {
        return this.androidSign;
    }

    public final boolean getBooked() {
        return this.booked;
    }

    @Nullable
    public final String getButtonLink() {
        return this.buttonLink;
    }

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    public final int getButtonType() {
        return this.buttonType;
    }

    @Nullable
    public final BiliGameButtonUserStatus getButtonUserStatus() {
        return this.buttonUserStatus;
    }

    @NotNull
    public final String getChannelExtra() {
        return this.channelExtra;
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final BiliGameButtonCouponInfo getCouponInfo() {
        return this.couponInfo;
    }

    @Nullable
    public final String getDownloadLink() {
        return this.downloadLink;
    }

    @Nullable
    public final String getDownloadLink2() {
        return this.downloadLink2;
    }

    public final long getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    public final int getGameStatus() {
        return this.gameStatus;
    }

    @Nullable
    public final BiliGameVersionInfo getGameVersionInfo() {
        return this.gameVersionInfo;
    }

    @Nullable
    public final BiliGameButtonGiftInfo getGiftInfo() {
        return this.giftInfo;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final boolean getMainGame() {
        return this.mainGame;
    }

    @Nullable
    public final BiliGameCardMainGame getMainGameDetail() {
        return this.mainGameDetail;
    }

    @Nullable
    public final BiliGameTestInfo getTestInfo() {
        return this.testInfo;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean giftAllReceived() {
        BiliGameButtonGiftInfo biliGameButtonGiftInfo = this.giftInfo;
        boolean z6 = true;
        if (biliGameButtonGiftInfo != null) {
            z6 = biliGameButtonGiftInfo.getGiftCount() == 0;
        }
        return z6;
    }

    public final boolean isButtonDataV2Valid() {
        int i7 = this.buttonType;
        boolean z6 = true;
        if (i7 != BUTTON_TYPE_DEFAULT && i7 != BUTTON_TYPE_TEST) {
            if (i7 == BUTTON_TYPE_VERSION_BOOK) {
                BiliGameVersionInfo biliGameVersionInfo = this.gameVersionInfo;
                String gameVersionId = biliGameVersionInfo != null ? biliGameVersionInfo.getGameVersionId() : null;
                if (gameVersionId == null || gameVersionId.length() == 0 || this.buttonUserStatus == null) {
                }
            } else if (i7 != BUTTON_TYPE_GIFT) {
                z6 = i7 == BUTTON_TYPE_EVENT ? false : false;
            }
        }
        return z6;
    }

    public final boolean isRecruitTest() {
        BiliGameTestInfo biliGameTestInfo = this.testInfo;
        boolean z6 = false;
        if (biliGameTestInfo != null) {
            z6 = false;
            if (biliGameTestInfo.getTestType() == 1) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void setAdGamePkg(@Nullable BiliGameAdGameDataBean biliGameAdGameDataBean) {
        this.adGamePkg = biliGameAdGameDataBean;
    }

    public final void setAndroidMinSdk(@Nullable String str) {
        this.androidMinSdk = str;
    }

    public final void setAndroidPkgIncrUpdated(int i7) {
        this.androidPkgIncrUpdated = i7;
    }

    public final void setAndroidPkgName(@NotNull String str) {
        this.androidPkgName = str;
    }

    public final void setAndroidPkgSize(long j7) {
        this.androidPkgSize = j7;
    }

    public final void setAndroidPkgVer(@Nullable String str) {
        this.androidPkgVer = str;
    }

    public final void setAndroidSign(@Nullable String str) {
        this.androidSign = str;
    }

    public final void setBooked(boolean z6) {
        this.booked = z6;
    }

    public final void setButtonLink(@Nullable String str) {
        this.buttonLink = str;
    }

    public final void setButtonText(@Nullable String str) {
        this.buttonText = str;
    }

    public final void setButtonType(int i7) {
        this.buttonType = i7;
    }

    public final void setButtonUserStatus(@Nullable BiliGameButtonUserStatus biliGameButtonUserStatus) {
        this.buttonUserStatus = biliGameButtonUserStatus;
    }

    public final void setChannelExtra(@NotNull String str) {
        this.channelExtra = str;
    }

    public final void setChannelId(@Nullable String str) {
        this.channelId = str;
    }

    public final void setCouponInfo(@Nullable BiliGameButtonCouponInfo biliGameButtonCouponInfo) {
        this.couponInfo = biliGameButtonCouponInfo;
    }

    public final void setDownloadLink(@Nullable String str) {
        this.downloadLink = str;
    }

    public final void setDownloadLink2(@Nullable String str) {
        this.downloadLink2 = str;
    }

    public final void setGameBaseId(long j7) {
        this.gameBaseId = j7;
    }

    public final void setGameName(@Nullable String str) {
        this.gameName = str;
    }

    public final void setGameStatus(int i7) {
        this.gameStatus = i7;
    }

    public final void setGameVersionInfo(@Nullable BiliGameVersionInfo biliGameVersionInfo) {
        this.gameVersionInfo = biliGameVersionInfo;
    }

    public final void setGiftInfo(@Nullable BiliGameButtonGiftInfo biliGameButtonGiftInfo) {
        this.giftInfo = biliGameButtonGiftInfo;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setMainGame(boolean z6) {
        this.mainGame = z6;
    }

    public final void setMainGameDetail(@Nullable BiliGameCardMainGame biliGameCardMainGame) {
        this.mainGameDetail = biliGameCardMainGame;
    }

    public final void setTestInfo(@Nullable BiliGameTestInfo biliGameTestInfo) {
        this.testInfo = biliGameTestInfo;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
