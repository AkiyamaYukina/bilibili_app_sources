package com.bilibili.biligame.api;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.abtest.AbTestHelper;
import com.bilibili.biligame.utils.NumUtils;
import com.bilibili.biligame.utils.Utils;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMainGame.class */
@Keep
public class BiligameMainGame extends BiligameHotGame implements Serializable {
    public static final int TYPE_ABOUT_DAY = 3;
    public static final int TYPE_ABOUT_TIME = 0;
    public static final int TYPE_EXACT_DAY = 1;
    public static final int TYPE_EXACT_TIME = 2;
    public static final int TYPE_NUM = 3;
    public static final int TYPE_RECOMMEND = 1;
    public static final int TYPE_TIME = 2;

    @JSONField(name = "activity_info")
    public GameActivitiesInfo activityInfo;

    @JSONField(name = "b_index")
    public long bIndexNum;

    @JSONField(name = "background_color")
    public String backgroundColor;
    private int bgColor;

    @JSONField(name = "cloud_game_config_v2")
    public CloudGameInfo cloudGameInfoV2;

    @JSONField(name = "cooperation_type")
    public int cooperationType;

    @JSONField(name = "databox")
    public String databox;

    @JSONField(name = "description")
    public String description;
    public int downloadType;

    @JSONField(name = "extend_info_text")
    public String extendText;

    @JSONField(name = "is_precise_time")
    public int isPreciseTime;
    public boolean isSelected;
    public int itemPosition;

    @JSONField(name = "last_download_time")
    public String lastDownloadTime;

    @JSONField(name = "new_wiki_link")
    public String nativeWikiLink;

    @JSONField(name = "reason_list")
    public List<String> reasons;

    @JSONField(name = "show_forum")
    public boolean showForum;

    @JSONField(name = "show_gift")
    public boolean showGift;

    @JSONField(name = "show_wiki")
    public boolean showWiki;

    @JSONField(name = "sign_activity_id")
    @Deprecated
    public String signActivityId;

    @JSONField(name = "start_test_time")
    public String startTestTime;

    @JSONField(name = "start_test_type")
    public String startTestType;

    @JSONField(name = "test_title")
    public String testTitle;

    @JSONField(name = "position_status")
    public int topStatus;
    public Boolean unread = Boolean.FALSE;

    @JSONField(name = "use_extend_info_text")
    public boolean useExtendText;

    @JSONField(name = "valid_comment_number")
    public int validCommentNumber;

    @JSONField(name = "video_image")
    public String videoImage;

    @JSONField(name = "wiki_link")
    public String wikiLink;

    @Override // com.bilibili.biligame.api.BiligameHotGame
    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiligameMainGame)) {
            return false;
        }
        BiligameMainGame biligameMainGame = (BiligameMainGame) obj;
        if (!super.equals(obj) || this.validCommentNumber != biligameMainGame.validCommentNumber || !TextUtils.equals(this.testTitle, biligameMainGame.testTitle) || this.isSelected != biligameMainGame.isSelected || this.bIndexNum != biligameMainGame.bIndexNum || this.followed != biligameMainGame.followed || this.topStatus != biligameMainGame.topStatus) {
            z6 = false;
        }
        return z6;
    }

    public void fillExtra(Map<String, String> map) {
        if (this.extra == null) {
            JSONObject jSONObject = new JSONObject();
            this.extra = jSONObject;
            jSONObject.put("recommendData", (Object) this.databox);
            this.extra.put("selected_group", (Object) AbTestHelper.INSTANCE.getGroupHotComment());
            if (map != null) {
                this.extra.putAll(map);
            }
        }
    }

    @Override // com.bilibili.biligame.api.BiligameHotGame
    public void fillReportParams(Map<String, String> map) {
        super.fillReportParams(map);
        map.put("recommendData", this.databox);
    }

    public int getBgColor() {
        int i7 = this.bgColor;
        if (i7 != 0) {
            return i7;
        }
        try {
            int color = Color.parseColor(this.backgroundColor);
            if (Utils.isAvailableGameDetailBackgroundColor(color)) {
                this.bgColor = color;
            } else {
                this.bgColor = ContextCompat.getColor(BiliContext.application(), 2131100655);
            }
            return this.bgColor;
        } catch (Exception e7) {
            int color2 = ContextCompat.getColor(BiliContext.application(), 2131100655);
            this.bgColor = color2;
            return color2;
        }
    }

    public String getStartTestTime(Context context) {
        int i7 = this.isPreciseTime;
        String string = (i7 == 0 || i7 == 3) ? context != null ? context.getResources().getString(2131823799) : "大约" : null;
        int i8 = this.isPreciseTime;
        String date = Utils.formatDate(NumUtils.parseLong(this.startTestTime), (i8 == 0 || i8 == 2) ? "MM-dd HH:mm" : (i8 == 1 || i8 == 3) ? "MM-dd" : "");
        String strA = date;
        if (string != null) {
            strA = B0.a.a(string, " ", date);
        }
        return strA;
    }

    public String getStartTestTimeV2(Context context) {
        int i7 = this.isPreciseTime;
        String string = (i7 == 0 || i7 == 3) ? context != null ? context.getResources().getString(2131823799) : "大约" : null;
        int i8 = this.isPreciseTime;
        String date = Utils.formatDate(NumUtils.parseLong(this.startTestTime), (i8 == 0 || i8 == 2) ? "HH:mm" : (i8 == 1 || i8 == 3) ? "MM-dd" : "");
        String strA = date;
        if (string != null) {
            strA = B0.a.a(string, " ", date);
        }
        return strA;
    }

    public void setBgColor(int i7) {
    }
}
