package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.BiligameVideoInfo;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameRecommendVideo.class */
@Keep
public class BiligameRecommendVideo extends BiligameVideoInfo {
    public static final int TYPE_COMPANY = 1;
    public static final int TYPE_PERSON = 0;
    public static final int TYPE_SPECIAL = 2;

    @JSONField(name = "android_book_link")
    public String androidBookLink;

    @JSONField(name = "android_game_status")
    public int androidGameStatus;

    @JSONField(name = "android_pkg_size")
    public long androidPkgSize;

    @JSONField(name = "android_pkg_ver")
    public String androidPkgVersion;

    @JSONField(name = "android_sign")
    public String androidSign;

    @JSONField(name = "attestation_display")
    public RecommendComment.AttestationDisplay attestationDisplay;

    @JSONField(name = "author_face")
    public String authorFace;

    @JSONField(name = "discount")
    public int discount;

    @JSONField(name = "discount_price")
    public double discountPrice;

    @JSONField(name = "download_link")
    public String downloadLink;

    @JSONField(name = "download_link2")
    public String downloadLink2;

    @JSONField(name = "download_status")
    public int downloadStatus;

    @JSONField(name = "from_ai")
    public int fromAi;
    private BiligameMainGame gameInfo;

    @JSONField(name = "is_book")
    public boolean isBook;

    @JSONField(name = "is_show_test")
    public boolean isShowTest;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    public String mid;

    @JSONField(name = "android_pkg_name")
    public String pkgName;

    @JSONField(name = "played_num")
    public int playedNum;

    @JSONField(name = "price")
    public double price;

    @JSONField(name = "android_skip_detail_link")
    public String protocolLink;

    @JSONField(name = "publish_date")
    public long publishDate;

    @JSONField(name = "purchase_type")
    public int purchaseType;

    @JSONField(name = "is_purchased")
    public boolean purchased;

    @JSONField(name = "related_game_id")
    public int relatedGameId;

    @JSONField(name = "related_game_name")
    public String relatedGameName;

    @JSONField(name = "small_game_link")
    public String smallGameLink;

    @JSONField(name = GameCardButton.extraParamSource)
    public int source;

    @JSONField(name = "steam_link")
    public String steamLink;

    @JSONField(name = "type")
    public int type;

    @JSONField(name = "feed_video_info")
    public GameVideoInfo videoInfo;

    @NonNull
    public BiligameMainGame getGameInfo() {
        if (this.gameInfo == null) {
            BiligameMainGame biligameMainGame = new BiligameMainGame();
            this.gameInfo = biligameMainGame;
            biligameMainGame.gameBaseId = this.relatedGameId;
            biligameMainGame.androidBookLink = this.androidBookLink;
            biligameMainGame.androidGameStatus = this.androidGameStatus;
            biligameMainGame.androidPkgName = this.pkgName;
            biligameMainGame.androidPkgVer = this.androidPkgVersion;
            biligameMainGame.androidPkgSize = this.androidPkgSize;
            biligameMainGame.title = this.relatedGameName;
            biligameMainGame.booked = this.isBook;
            biligameMainGame.source = this.source;
            biligameMainGame.downloadStatus = this.downloadStatus;
            biligameMainGame.purchased = this.purchased;
            biligameMainGame.purchaseType = this.purchaseType;
            biligameMainGame.downloadLink = this.downloadLink;
            biligameMainGame.downloadLink2 = this.downloadLink2;
            biligameMainGame.price = this.price;
            biligameMainGame.discount = this.discount;
            biligameMainGame.discountPrice = this.discountPrice;
            biligameMainGame.androidSign = this.androidSign;
            biligameMainGame.protocolLink = this.protocolLink;
            biligameMainGame.smallGameLink = this.smallGameLink;
            biligameMainGame.playedNum = this.playedNum;
            biligameMainGame.steamLink = this.steamLink;
            biligameMainGame.isShowTest = this.isShowTest;
        }
        return this.gameInfo;
    }
}
