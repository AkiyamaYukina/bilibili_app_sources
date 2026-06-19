package com.bilibili.biligame.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.utils.NumUtils;
import com.bilibili.biligame.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameBook.class */
@Keep
public class BiligameBook {

    @JSONField(name = "av_id")
    public String aid;

    @JSONField(name = "book_num")
    public int bookCount;
    public String description;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name_v2")
    public String gameNameV2;

    @JSONField(name = "game_type_label")
    public String gameType;

    @JSONField(name = "grade")
    public float grade;

    @JSONField(name = "icon")
    public String icon;
    public String image;

    @JSONField(name = "is_book")
    public boolean isBook;

    @JSONField(name = "is_precise_time")
    public int isPreciseTime;

    @JSONField(name = "android_book_link")
    public String link;

    @JSONField(name = "online_time")
    public String onlineTime;

    @JSONField(name = "postfix_list")
    public ArrayList<String> postfixList = new ArrayList<>();

    @JSONField(name = "start_test_time")
    public String startTestTime;

    @JSONField(name = "start_test_type")
    public String startTestType;

    @JSONField(name = "android_game_status")
    public int status;

    @JSONField(name = "summary")
    public String summary;

    @JSONField(name = "tag_list")
    public List<BiligameTag> tagList;

    @JSONField(name = "test_type")
    public String testType;
    public String title;

    @JSONField(name = "valid_comment_number")
    public int validCommentNumber;

    @JSONField(name = "book_video_image")
    public String videoImage;

    @JSONField(name = "video_detail")
    public GameVideoInfo videoInfo;

    public boolean equals(@Nullable Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BiligameBook)) {
            return false;
        }
        BiligameBook biligameBook = (BiligameBook) obj;
        if (this.gameBaseId != biligameBook.gameBaseId || this.isBook != biligameBook.isBook || this.status != biligameBook.status || this.bookCount != biligameBook.bookCount || !TextUtils.equals(this.title, biligameBook.title) || !TextUtils.equals(this.expandedName, biligameBook.expandedName) || !TextUtils.equals(this.image, biligameBook.image) || !TextUtils.equals(this.link, biligameBook.link) || !TextUtils.equals(this.testType, biligameBook.testType)) {
            z6 = false;
        }
        return z6;
    }

    public String getNewGameNameV2() {
        return !TextUtils.isEmpty(this.gameNameV2) ? this.gameNameV2 : this.title;
    }

    public ArrayList<String> getPostfixList() {
        return this.postfixList;
    }

    public String getStartTestTime(Context context) {
        String str = "";
        if (this.startTestTime == null) {
            return "";
        }
        int i7 = this.isPreciseTime;
        String string = (i7 == 0 || i7 == 3) ? context != null ? context.getResources().getString(2131823799) : "大约" : null;
        int i8 = this.isPreciseTime;
        if (i8 == 0 || i8 == 2) {
            str = "MM-dd HH:mm";
        } else if (i8 == 1 || i8 == 3) {
            str = "MM-dd";
        }
        String date = Utils.formatDate(NumUtils.parseLong(this.startTestTime), str);
        String strA = date;
        if (string != null) {
            strA = B0.a.a(string, " ", date);
        }
        return strA;
    }
}
