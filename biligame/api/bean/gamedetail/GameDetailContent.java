package com.bilibili.biligame.api.bean.gamedetail;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameTag;
import com.bilibili.live.streaming.source.TextSource;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailContent.class */
@Keep
public class GameDetailContent implements Serializable {

    @JSONField(name = "activity_image")
    public String activityImage;

    @JSONField(name = "activity_url")
    public String activityUrl;

    @JSONField(name = "book_award")
    public String bookAward;

    @JSONField(name = "guide_book_content")
    public String bookGuideContent;

    @JSONField(name = "cadpa_info")
    public String cadpaInfo;

    @JSONField(name = "custom_desc")
    public String customDesc;

    @JSONField(name = "custom_title")
    public String customTitle;

    @JSONField(name = "customer_service_url")
    public String customerServiceUrl;

    @JSONField(name = "desc")
    public String desc;

    @JSONField(name = "detail_list")
    public List<DetailInfo> detailList;

    @JSONField(name = "dev_introduction")
    public String devIntroduction;

    @JSONField(name = "editor_recommend")
    public String editorRecommend;

    @JSONField(name = "enable_anti_interception")
    public boolean enableAntiInterception;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "is_show_permission_detail")
    public int isShowPermissionDetail;

    @JSONField(name = "latest_update")
    public String latestUpdate;

    @JSONField(name = "latest_update_time")
    public String latestUpdateTime;

    @JSONField(name = "main_game_base_id")
    public int mainGameBaseId;

    @JSONField(name = "main_android_book_link")
    public String mainGameBookLink;

    @JSONField(name = "qq_group_list")
    public List<String> qqList;

    @JSONField(name = "media_score")
    public List<MediaScore> scoreList;

    @JSONField(name = "screen_shots")
    public List<ScreenShot> screenShotList;

    @JSONField(name = "sell_info")
    public List<SaleSituation> sellInfo;
    public long serverTime;

    @JSONField(name = "summary")
    public String summary;

    @JSONField(name = "support_language")
    public String supportLanguage;

    @JSONField(name = "tag_list")
    public List<BiligameTag> tagList;

    @JSONField(name = "title")
    public String title;

    @JSONField(name = "comment_notice")
    public String topBulletin;

    @JSONField(name = "update_time")
    public String updataTime;

    @JSONField(name = "version")
    public String version;

    @JSONField(name = "website")
    public String website;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailContent$DetailInfo.class */
    @Keep
    public static class DetailInfo implements Serializable {
        public static final String DATA_TYPE_CUSTOMER = "customer";
        public static final String DATA_TYPE_PRIVACY_POLICY = "privacy_policy";
        public static final String UI_TYPE_JUMP_LINK = "jump_link";
        public static final String UI_TYPE_OFFICIAL_ACCOUNT = "official_account";
        public static final String UI_TYPE_QQ_GROUP = "qq_group";
        public static final String UI_TYPE_TEXT_COPY = "text_copy";
        public static final String UI_TYPE_TEXT_SHOW = "text_show";

        @Nullable
        @JSONField(name = TextSource.CFG_CONTENT)
        public String content;

        @JSONField(name = "data_type")
        public String dataType;

        @Nullable
        @JSONField(name = "link")
        public String link;

        @Nullable
        @JSONField(name = UI_TYPE_OFFICIAL_ACCOUNT)
        public GameOfficialAccount officialAccount;

        @Nullable
        @JSONField(name = "title")
        public String title;

        @JSONField(name = "ui_type")
        public String uiType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailInfo)) {
                return false;
            }
            DetailInfo detailInfo = (DetailInfo) obj;
            if (Objects.equals(this.uiType, detailInfo.uiType) && Objects.equals(this.dataType, detailInfo.dataType) && Objects.equals(this.title, detailInfo.title) && Objects.equals(this.content, detailInfo.content) && Objects.equals(this.link, detailInfo.link)) {
                return Objects.equals(this.officialAccount, detailInfo.officialAccount);
            }
            return false;
        }

        public int hashCode() {
            String str = this.uiType;
            int iHashCode = 0;
            int iHashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.dataType;
            int iHashCode3 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.title;
            int iHashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.content;
            int iHashCode5 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.link;
            int iHashCode6 = str5 != null ? str5.hashCode() : 0;
            GameOfficialAccount gameOfficialAccount = this.officialAccount;
            if (gameOfficialAccount != null) {
                iHashCode = gameOfficialAccount.hashCode();
            }
            return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
        }

        public boolean isValid() {
            return Objects.equals(this.uiType, UI_TYPE_TEXT_SHOW) || Objects.equals(this.uiType, UI_TYPE_JUMP_LINK) || Objects.equals(this.uiType, UI_TYPE_TEXT_COPY) || Objects.equals(this.uiType, UI_TYPE_OFFICIAL_ACCOUNT) || Objects.equals(this.uiType, UI_TYPE_QQ_GROUP);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailContent$MediaScore.class */
    @Keep
    public static class MediaScore implements Serializable {

        @JSONField(name = "media_full_score")
        public String fullScore;

        @JSONField(name = "media_name")
        public String name;

        @JSONField(name = "media_score")
        public String score;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailContent$SaleSituation.class */
    @Keep
    public static class SaleSituation implements Serializable {

        @JSONField(name = "platform")
        public String platform;

        @JSONField(name = "sell_date")
        public String sellDate;

        @JSONField(name = "sell_price")
        public String sellPrice;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailContent$ScreenShot.class */
    @Keep
    public static class ScreenShot implements Parcelable, Serializable {
        public static final Parcelable.Creator<ScreenShot> CREATOR = new Parcelable.Creator<ScreenShot>() { // from class: com.bilibili.biligame.api.bean.gamedetail.GameDetailContent.ScreenShot.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ScreenShot createFromParcel(Parcel parcel) {
                return new ScreenShot(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ScreenShot[] newArray(int i7) {
                return new ScreenShot[i7];
            }
        };

        @JSONField(name = "height")
        public String height;

        @JSONField(name = "url")
        public String url;

        @JSONField(name = "width")
        public String width;

        public ScreenShot() {
        }

        public ScreenShot(Parcel parcel) {
            this.url = parcel.readString();
            this.height = parcel.readString();
            this.width = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z6 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ScreenShot)) {
                return false;
            }
            ScreenShot screenShot = (ScreenShot) obj;
            if (!TextUtils.equals(this.url, screenShot.url) || !TextUtils.equals(this.height, screenShot.height) || !TextUtils.equals(this.width, screenShot.width)) {
                z6 = false;
            }
            return z6;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.url);
            parcel.writeString(this.height);
            parcel.writeString(this.width);
        }
    }
}
