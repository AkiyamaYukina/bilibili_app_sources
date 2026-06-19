package com.bilibili.biligame.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiliGamePatchInfo;
import com.bilibili.biligame.api.bean.gamedetail.GameProductInfo;
import com.bilibili.biligame.api.cdk.CdkProductInfo;
import com.bilibili.biligame.api.download.BiligameDownloadExtraBean;
import com.bilibili.biligame.bean.BiliGameAdGameDataBean;
import com.bilibili.biligame.utils.GameUtils;
import com.bilibili.biligame.utils.NumUtils;
import com.bilibili.biligame.utils.NumberExtensionsKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameHotGame.class */
@Keep
public class BiligameHotGame implements Serializable {
    public static final int DOWNLOAD_STATUS_CLOSE = 0;
    public static final int DOWNLOAD_STATUS_OPEN = 1;
    public static final int GAME_STATUS_BOOK = 1;
    public static final int GAME_STATUS_BOOK_DETAIL = 2;
    public static final int GAME_STATUS_DOWNLOAD = 0;
    public static final int GAME_STATUS_ONLY_SHOW = 6;
    public static final int GAME_STATUS_SKIP_DETAIL = 5;
    public static final int GAME_STATUS_TEST = 3;
    public static final int GAME_STATUS_TEST_BOOK = 4;
    public static final int PC_GAME_BOOK = 1;
    public static final int PC_GAME_BOOK_SKIP_DETAIL = 2;
    public static final int PC_GAME_DETAIL = 3;
    public static final int PC_GAME_DOWNLOAD = 0;
    public static final int PURCHASE_TYPE_FREE = 0;
    public static final int PURCHASE_TYPE_PAY = 1;
    public static final int SOURCE_GOOGLE_PLAY = 1;
    public static final int SOURCE_H5 = 2;
    public static final int SOURCE_NON_MOBILE = 3;
    public static final int SOURCE_SDK = 0;
    public static final int SOURCE_SMALL_GAME = 4;

    @JSONField(name = "ad_pkg")
    public BiliGameAdGameDataBean adGamePkg;
    public String adTrackId;

    @JSONField(name = "android_book_link")
    public String androidBookLink;

    @JSONField(name = "android_game_status")
    public int androidGameStatus;

    @JSONField(name = "android_min_sdk")
    public String androidMinSdk;

    @JSONField(name = "android_pkg_size")
    public long androidPkgSize;

    @JSONField(name = "gray_android_pkg_size")
    public long androidPkgSizeGray;

    @JSONField(name = "android_pkg_ver")
    public String androidPkgVer;

    @JSONField(name = "gray_android_pkg_ver")
    public String androidPkgVerGray;

    @JSONField(name = "android_sign")
    public String androidSign;

    @JSONField(name = "gray_android_sign")
    public String androidSignGray;

    @JSONField(name = "app_id")
    public String appId;

    @JSONField(name = "av_id")
    public String avId;

    @JSONField(name = "book_num")
    public int bookNum;

    @JSONField(name = "activity_id")
    public String bookVersionActivityId;

    @JSONField(name = "is_book")
    public boolean booked;
    public String btnId;

    @JSONField(name = "button_text")
    public String buttonText;

    @JSONField(name = "bv_id")
    public String bvId;
    public boolean canDownload;

    @JSONField(name = "cdkey_products")
    public List<CdkProductInfo> cdkProducts;

    @JSONField(name = "cid")
    public String cid;

    @JSONField(name = "developer_name")
    public String developerName;
    public int discount;

    @JSONField(name = "discount_price")
    public double discountPrice;

    @JSONField(name = "download_link")
    public String downloadLink;

    @JSONField(name = "download_link2")
    public String downloadLink2;

    @JSONField(name = "gray_download_link")
    public String downloadLinkGray;

    @JSONField(name = "gray_download_link2")
    public String downloadLinkGray2;

    @JSONField(name = "download_mode")
    public String downloadMode;

    @JSONField(name = "download_status")
    public int downloadStatus;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @Nullable
    public JSONObject extra;

    @JSONField(name = "is_followed")
    public boolean followed;
    public boolean fromMainSite;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "game_name_v2")
    private String gameNameV2;
    public String gameTrackId;

    @JSONField(name = "game_type_label")
    public String gameType;
    public float grade;

    @JSONField(name = "gray_id")
    public String grayId;
    public String icon;

    @JSONField(name = "image")
    public String image;

    @JSONField(name = "is_android_pkg_incr_updated")
    public int isAndroidPkgIncrUpdated;

    @JSONField(name = "is_gray")
    public boolean isGray;
    public boolean isPlayVideo;

    @JSONField(name = "is_show_permission_detail")
    public int isShowPermissionDetail;

    @JSONField(name = "is_show_test")
    public boolean isShowTest;
    public String name;

    @JSONField(name = "platform_score")
    public float platformScore;

    @JSONField(name = "played_num")
    public int playedNum;

    @JSONField(name = "presale_status")
    public int presaleStatus;
    public double price;

    @JSONField(name = "products")
    public List<GameProductInfo> products;

    @JSONField(name = "android_skip_detail_link")
    public String protocolLink;

    @JSONField(name = "purchase_type")
    public int purchaseType;

    @JSONField(name = "is_purchased")
    public boolean purchased;

    @JSONField(deserialize = false, serialize = false)
    private Map<String, String> reportParams;

    @JSONField(name = "show_presale")
    public int showPresale;

    @JSONField(name = "small_game_link")
    public String smallGameLink;
    public int source;

    @JSONField(name = "source_from")
    public String sourceFrom;

    @JSONField(name = "steam_link")
    public String steamLink;

    @JSONField(name = "sub_title")
    public String subTitle;

    @JSONField(name = "summary")
    public String summary;

    @JSONField(name = "tag_id")
    public long tagId;

    @JSONField(name = "tag_list")
    public List<BiligameTag> tagList;

    @JSONField(name = "tag_list_v3")
    public List<BiligameTag> tagListV3;

    @JSONField(name = "tag_name")
    public String tagName;

    @JSONField(name = "test_hint_content")
    public String testHintContent;
    public String title;
    public BiliGamePatchInfo.UpdatedPkgInfo updatedPatchPkgInfo;
    public BiligameDownloadExtraBean.ZstdPkgInfoBean zstdPkgInfo;

    @JSONField(name = "postfix_list")
    public ArrayList<String> postfixList = new ArrayList<>();

    @JSONField(name = "android_pkg_name")
    public String androidPkgName = "";

    @JSONField(name = "pc_game_status")
    public int pcGameStatus = -1;

    @JSONField(name = "gray_android_pkg_name")
    public String androidPkgNameGray = "";

    @JSONField(name = "android_game_status_v2")
    public int androidGameStatusV2 = -1;

    @JSONField(name = "is_show_android")
    public int isShowAndroid = 1;
    public boolean isDetailClick = false;
    public boolean isPatchUpdate = false;
    public boolean isZstdDownload = false;
    public String channelId = "0";
    public String channelExtra = "";

    @JSONField(name = "is_android_temporary_offline")
    public boolean androidTemporaryOffline = false;

    @JSONField(name = "update_version_related_pc_game")
    public int updateVersionRelatedPcGame = 0;
    public boolean isBookVersion = false;
    public boolean bookVersionStatus = false;

    @JSONField(name = "same_server_tag")
    public String sameServerTag = "";

    @JSONField(name = "is_new_online")
    public int minigameNewOnline = 0;

    @JSONField(name = "new_online_show_text")
    public String minigameNewOnlineText = null;

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiligameHotGame)) {
            return false;
        }
        BiligameHotGame biligameHotGame = (BiligameHotGame) obj;
        if (this.gameBaseId != biligameHotGame.gameBaseId || this.grade != biligameHotGame.grade || this.source != biligameHotGame.source || this.androidGameStatus != biligameHotGame.androidGameStatus || this.downloadStatus != biligameHotGame.downloadStatus || this.purchaseType != biligameHotGame.purchaseType || !TextUtils.equals(this.title, biligameHotGame.title) || !TextUtils.equals(this.expandedName, biligameHotGame.expandedName) || !TextUtils.equals(this.icon, biligameHotGame.icon) || this.androidPkgSize != biligameHotGame.androidPkgSize || !TextUtils.equals(this.androidPkgName, biligameHotGame.androidPkgName) || !TextUtils.equals(this.androidPkgVer, biligameHotGame.androidPkgVer) || !TextUtils.equals(this.androidSign, biligameHotGame.androidSign) || !TextUtils.equals(this.downloadLink, biligameHotGame.downloadLink) || !TextUtils.equals(this.downloadLink2, biligameHotGame.downloadLink2) || this.isGray != biligameHotGame.isGray || !TextUtils.equals(this.grayId, biligameHotGame.grayId) || this.androidPkgSizeGray != biligameHotGame.androidPkgSizeGray || !TextUtils.equals(this.androidPkgNameGray, biligameHotGame.androidPkgNameGray) || !TextUtils.equals(this.androidPkgVerGray, biligameHotGame.androidPkgVerGray) || !TextUtils.equals(this.androidSignGray, biligameHotGame.androidSignGray) || !TextUtils.equals(this.downloadLinkGray, biligameHotGame.downloadLinkGray) || !TextUtils.equals(this.downloadLinkGray2, biligameHotGame.downloadLinkGray2) || this.isPatchUpdate != biligameHotGame.isPatchUpdate || getPatchSize() != biligameHotGame.getPatchSize()) {
            return false;
        }
        int i7 = this.androidGameStatus;
        if (i7 == 1 || i7 == 2) {
            if (this.booked != biligameHotGame.booked || this.bookNum != biligameHotGame.bookNum) {
                z6 = false;
            }
            return z6;
        }
        boolean z7 = true;
        if (this.purchaseType == 1) {
            z7 = this.purchased == biligameHotGame.purchased && this.discountPrice == biligameHotGame.discountPrice && this.price == biligameHotGame.price && biligameHotGame.discount == this.discount;
        }
        return z7;
    }

    public void fillReportParams(Map<String, String> map) {
        map.put("game_base_id", String.valueOf(this.gameBaseId));
        map.put("game_name", getGameNameV2());
        map.put("game_status", String.valueOf(this.androidGameStatus));
        map.put("is_book", NumberExtensionsKt.toIntString(Boolean.valueOf(this.booked)));
    }

    public String getGameName() {
        return !TextUtils.isEmpty(this.gameName) ? this.gameName : !TextUtils.isEmpty(this.title) ? this.title : "";
    }

    public String getGameNameV2() {
        return !TextUtils.isEmpty(this.gameNameV2) ? this.gameNameV2 : getGameName();
    }

    public long getPatchSize() {
        BiliGamePatchInfo.UpdatedPkgInfo updatedPkgInfo;
        if (!this.isPatchUpdate || (updatedPkgInfo = this.updatedPatchPkgInfo) == null) {
            return 0L;
        }
        return updatedPkgInfo.getPkgSize();
    }

    public String getPkgSign() {
        return isGray() ? this.androidSignGray : this.androidSign;
    }

    public long getPkgSize() {
        return this.isGray ? this.androidPkgSizeGray : this.androidPkgSize;
    }

    public String getPkgVer() {
        return isGray() ? this.androidPkgVerGray : this.androidPkgVer;
    }

    public int getPkgVersion() {
        String pkgVersion;
        if (GameUtils.isCombinedGamepkg(this.channelId)) {
            pkgVersion = isGray() ? this.androidPkgVerGray : this.androidPkgVer;
        } else {
            BiliGameAdGameDataBean biliGameAdGameDataBean = this.adGamePkg;
            pkgVersion = biliGameAdGameDataBean != null ? biliGameAdGameDataBean.getPkgVersion() : "0";
        }
        return NumUtils.parseInt(pkgVersion);
    }

    public ArrayList<String> getPostfixList() {
        return this.postfixList;
    }

    public final Map<String, String> getReportParams() {
        if (this.reportParams == null) {
            HashMap map = new HashMap();
            this.reportParams = map;
            fillReportParams(map);
        }
        return this.reportParams;
    }

    public long getTotalLength() {
        BiligameDownloadExtraBean.ZstdPkgInfoBean zstdPkgInfoBean;
        return (!this.isPatchUpdate || getPatchSize() <= 0) ? (!this.isZstdDownload || (zstdPkgInfoBean = this.zstdPkgInfo) == null || zstdPkgInfoBean.getZstSize() <= 0) ? getPkgSize() : this.zstdPkgInfo.getZstSize() : getPatchSize();
    }

    public int hashCode() {
        int iHashCode = this.gameBaseId;
        if (iHashCode == 0) {
            iHashCode = super.hashCode();
        }
        return iHashCode;
    }

    public boolean isFreeGame() {
        return this.purchaseType == 0;
    }

    public boolean isGray() {
        if (!this.isGray || this.androidPkgSizeGray <= 0 || !TextUtils.equals(this.androidPkgNameGray, this.androidPkgName) || TextUtils.isEmpty(this.androidSignGray) || TextUtils.isEmpty(this.androidPkgVerGray)) {
            return false;
        }
        return !(TextUtils.isEmpty(this.downloadLinkGray) && TextUtils.isEmpty(this.downloadLinkGray2)) && this.purchaseType == 0;
    }

    public boolean isShowBookPay() {
        boolean z6 = true;
        if (this.showPresale != 1) {
            z6 = false;
        }
        return z6;
    }

    public boolean isSupportPatchUpdate() {
        boolean z6 = true;
        if (this.isAndroidPkgIncrUpdated != 1) {
            z6 = false;
        }
        return z6;
    }

    public void setGameNameV2(String str) {
        this.gameNameV2 = str;
    }

    public boolean showAndroid() {
        boolean z6 = true;
        if (this.isShowAndroid != 1) {
            z6 = false;
        }
        return z6;
    }
}
