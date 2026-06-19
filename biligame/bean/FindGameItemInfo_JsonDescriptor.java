package com.bilibili.biligame.bean;

import com.alibaba.fastjson.JSONObject;
import com.bapis.bilibili.ad.v1.AdCardDto;
import com.bilibili.biligame.api.BiliGamePatchInfo;
import com.bilibili.biligame.api.BiligameTag;
import com.bilibili.biligame.api.CloudGameInfo;
import com.bilibili.biligame.api.GameActivitiesInfo;
import com.bilibili.biligame.api.bean.BiligameRankInfo;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.biligame.api.bean.gamedetail.GameProductInfo;
import com.bilibili.biligame.api.cdk.CdkProductInfo;
import com.bilibili.biligame.api.download.BiligameDownloadExtraBean;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.biligame.ui.gamedetail.data.AvailableGiftData;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.videoeditor.CaptionFx;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/FindGameItemInfo_JsonDescriptor.class */
public final class FindGameItemInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f62230a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("game_rank_info", (String[]) null, BiligameRankInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("screen_shots", (String[]) null, Types.parameterizedType(List.class, new Type[]{Types.wildcardType(new Type[]{GameDetailContent.ScreenShot.class}, new Type[0])}), (Class) null, 22);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("avail_gift_b_o", (String[]) null, AvailableGiftData.class, (Class) null, 6);
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("valid_comment_number", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("test_title", (String[]) null, String.class, (Class) null, 6);
        Class cls2 = Boolean.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("isSelected", (String[]) null, cls2, (Class) null, 3);
        Class cls3 = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor7 = new PojoPropertyDescriptor("b_index", (String[]) null, cls3, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor8 = new PojoPropertyDescriptor("wiki_link", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor9 = new PojoPropertyDescriptor("new_wiki_link", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor10 = new PojoPropertyDescriptor("start_test_time", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor11 = new PojoPropertyDescriptor("start_test_type", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor12 = new PojoPropertyDescriptor("is_precise_time", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor13 = new PojoPropertyDescriptor("position_status", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor14 = new PojoPropertyDescriptor("last_download_time", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor15 = new PojoPropertyDescriptor("use_extend_info_text", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor16 = new PojoPropertyDescriptor("extend_info_text", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor17 = new PojoPropertyDescriptor("description", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor18 = new PojoPropertyDescriptor("cooperation_type", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor19 = new PojoPropertyDescriptor("reason_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{String.class}), (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor20 = new PojoPropertyDescriptor("downloadType", (String[]) null, cls, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor21 = new PojoPropertyDescriptor("unread", (String[]) null, Boolean.class, (Class) null, 2);
        PojoPropertyDescriptor pojoPropertyDescriptor22 = new PojoPropertyDescriptor("itemPosition", (String[]) null, cls, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor23 = new PojoPropertyDescriptor("cloud_game_config_v2", (String[]) null, CloudGameInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor24 = new PojoPropertyDescriptor("video_image", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor25 = new PojoPropertyDescriptor("background_color", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor26 = new PojoPropertyDescriptor("show_forum", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor27 = new PojoPropertyDescriptor("show_wiki", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor28 = new PojoPropertyDescriptor("show_gift", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor29 = new PojoPropertyDescriptor("databox", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor30 = new PojoPropertyDescriptor("sign_activity_id", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor31 = new PojoPropertyDescriptor("activity_info", (String[]) null, GameActivitiesInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor32 = new PojoPropertyDescriptor("bgColor", (String[]) null, cls, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor33 = new PojoPropertyDescriptor("is_followed", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor34 = new PojoPropertyDescriptor("game_base_id", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor35 = new PojoPropertyDescriptor("app_id", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor36 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2);
        PojoPropertyDescriptor pojoPropertyDescriptor37 = new PojoPropertyDescriptor("game_name", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor38 = new PojoPropertyDescriptor("game_name_v2", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor39 = new PojoPropertyDescriptor("postfix_list", (String[]) null, Types.parameterizedType(ArrayList.class, new Type[]{String.class}), (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor40 = new PojoPropertyDescriptor("expanded_name", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor41 = new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 2);
        PojoPropertyDescriptor pojoPropertyDescriptor42 = new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 2);
        PojoPropertyDescriptor pojoPropertyDescriptor43 = new PojoPropertyDescriptor(GameCardButton.extraParamSource, (String[]) null, cls, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor44 = new PojoPropertyDescriptor("purchase_type", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor45 = new PojoPropertyDescriptor("is_purchased", (String[]) null, cls2, (Class) null, 7);
        Class cls4 = Double.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor46 = new PojoPropertyDescriptor("price", (String[]) null, cls4, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor47 = new PojoPropertyDescriptor("discount_price", (String[]) null, cls4, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor48 = new PojoPropertyDescriptor("discount", (String[]) null, cls, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor49 = new PojoPropertyDescriptor("download_link", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor50 = new PojoPropertyDescriptor("download_status", (String[]) null, cls, (Class) null, 7);
        Class cls5 = Float.TYPE;
        f62230a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, pojoPropertyDescriptor7, pojoPropertyDescriptor8, pojoPropertyDescriptor9, pojoPropertyDescriptor10, pojoPropertyDescriptor11, pojoPropertyDescriptor12, pojoPropertyDescriptor13, pojoPropertyDescriptor14, pojoPropertyDescriptor15, pojoPropertyDescriptor16, pojoPropertyDescriptor17, pojoPropertyDescriptor18, pojoPropertyDescriptor19, pojoPropertyDescriptor20, pojoPropertyDescriptor21, pojoPropertyDescriptor22, pojoPropertyDescriptor23, pojoPropertyDescriptor24, pojoPropertyDescriptor25, pojoPropertyDescriptor26, pojoPropertyDescriptor27, pojoPropertyDescriptor28, pojoPropertyDescriptor29, pojoPropertyDescriptor30, pojoPropertyDescriptor31, pojoPropertyDescriptor32, pojoPropertyDescriptor33, pojoPropertyDescriptor34, pojoPropertyDescriptor35, pojoPropertyDescriptor36, pojoPropertyDescriptor37, pojoPropertyDescriptor38, pojoPropertyDescriptor39, pojoPropertyDescriptor40, pojoPropertyDescriptor41, pojoPropertyDescriptor42, pojoPropertyDescriptor43, pojoPropertyDescriptor44, pojoPropertyDescriptor45, pojoPropertyDescriptor46, pojoPropertyDescriptor47, pojoPropertyDescriptor48, pojoPropertyDescriptor49, pojoPropertyDescriptor50, new PojoPropertyDescriptor("grade", (String[]) null, cls5, (Class) null, 3), new PojoPropertyDescriptor("platform_score", (String[]) null, cls5, (Class) null, 7), new PojoPropertyDescriptor("tag_id", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("tag_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("tag_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{BiligameTag.class}), (Class) null, 6), new PojoPropertyDescriptor("tag_list_v3", (String[]) null, Types.parameterizedType(List.class, new Type[]{BiligameTag.class}), (Class) null, 6), new PojoPropertyDescriptor("is_book", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("book_num", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("android_pkg_size", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("android_sign", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("android_pkg_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("android_pkg_ver", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("android_min_sdk", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("is_gray", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("products", (String[]) null, Types.parameterizedType(List.class, new Type[]{GameProductInfo.class}), (Class) null, 6), new PojoPropertyDescriptor("cdkey_products", (String[]) null, Types.parameterizedType(List.class, new Type[]{CdkProductInfo.class}), (Class) null, 6), new PojoPropertyDescriptor("pc_game_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("gray_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("gray_android_pkg_size", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("gray_android_sign", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("gray_android_pkg_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("gray_android_pkg_ver", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("gray_download_link2", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("gray_download_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("download_link2", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("android_game_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("android_game_status_v2", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("android_book_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("android_skip_detail_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("btnId", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("played_num", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("small_game_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("summary", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("is_show_test", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("test_hint_content", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("is_show_android", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("av_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("bv_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("cid", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("image", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("steam_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("button_text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("isPlayVideo", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("canDownload", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("game_type_label", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("developer_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("is_show_permission_detail", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("is_android_pkg_incr_updated", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("show_presale", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("presale_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor(CaptureSchema.JUMP_PARAMS_EXTRA, (String[]) null, JSONObject.class, (Class) null, 2), new PojoPropertyDescriptor("isDetailClick", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("isPatchUpdate", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("updatedPatchPkgInfo", (String[]) null, BiliGamePatchInfo.UpdatedPkgInfo.class, (Class) null, 2), new PojoPropertyDescriptor("isZstdDownload", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("zstdPkgInfo", (String[]) null, BiligameDownloadExtraBean.ZstdPkgInfoBean.class, (Class) null, 2), new PojoPropertyDescriptor("fromMainSite", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("channelId", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("channelExtra", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("ad_pkg", (String[]) null, BiliGameAdGameDataBean.class, (Class) null, 6), new PojoPropertyDescriptor("source_from", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("download_mode", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("is_android_temporary_offline", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("activity_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("update_version_related_pc_game", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("isBookVersion", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("bookVersionStatus", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("same_server_tag", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("is_new_online", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("new_online_show_text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("adTrackId", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("gameTrackId", (String[]) null, String.class, (Class) null, 2)};
    }

    public FindGameItemInfo_JsonDescriptor() {
        super(FindGameItemInfo.class, f62230a);
    }

    public final Object constructWith(Object[] objArr) {
        FindGameItemInfo findGameItemInfo = new FindGameItemInfo();
        Object obj = objArr[0];
        if (obj != null) {
            findGameItemInfo.setGameRankInfo((BiligameRankInfo) obj);
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            findGameItemInfo.setScreenShotList((List) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            findGameItemInfo.setGiftInfo((AvailableGiftData) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            findGameItemInfo.validCommentNumber = ((Integer) obj4).intValue();
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            findGameItemInfo.testTitle = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            findGameItemInfo.isSelected = ((Boolean) obj6).booleanValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            findGameItemInfo.bIndexNum = ((Long) obj7).longValue();
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            findGameItemInfo.wikiLink = (String) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            findGameItemInfo.nativeWikiLink = (String) obj9;
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            findGameItemInfo.startTestTime = (String) obj10;
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            findGameItemInfo.startTestType = (String) obj11;
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            findGameItemInfo.isPreciseTime = ((Integer) obj12).intValue();
        }
        Object obj13 = objArr[12];
        if (obj13 != null) {
            findGameItemInfo.topStatus = ((Integer) obj13).intValue();
        }
        Object obj14 = objArr[13];
        if (obj14 != null) {
            findGameItemInfo.lastDownloadTime = (String) obj14;
        }
        Object obj15 = objArr[14];
        if (obj15 != null) {
            findGameItemInfo.useExtendText = ((Boolean) obj15).booleanValue();
        }
        Object obj16 = objArr[15];
        if (obj16 != null) {
            findGameItemInfo.extendText = (String) obj16;
        }
        Object obj17 = objArr[16];
        if (obj17 != null) {
            findGameItemInfo.description = (String) obj17;
        }
        Object obj18 = objArr[17];
        if (obj18 != null) {
            findGameItemInfo.cooperationType = ((Integer) obj18).intValue();
        }
        Object obj19 = objArr[18];
        if (obj19 != null) {
            findGameItemInfo.reasons = (List) obj19;
        }
        Object obj20 = objArr[19];
        if (obj20 != null) {
            findGameItemInfo.downloadType = ((Integer) obj20).intValue();
        }
        Object obj21 = objArr[20];
        if (obj21 != null) {
            findGameItemInfo.unread = (Boolean) obj21;
        }
        Object obj22 = objArr[21];
        if (obj22 != null) {
            findGameItemInfo.itemPosition = ((Integer) obj22).intValue();
        }
        Object obj23 = objArr[22];
        if (obj23 != null) {
            findGameItemInfo.cloudGameInfoV2 = (CloudGameInfo) obj23;
        }
        Object obj24 = objArr[23];
        if (obj24 != null) {
            findGameItemInfo.videoImage = (String) obj24;
        }
        Object obj25 = objArr[24];
        if (obj25 != null) {
            findGameItemInfo.backgroundColor = (String) obj25;
        }
        Object obj26 = objArr[25];
        if (obj26 != null) {
            findGameItemInfo.showForum = ((Boolean) obj26).booleanValue();
        }
        Object obj27 = objArr[26];
        if (obj27 != null) {
            findGameItemInfo.showWiki = ((Boolean) obj27).booleanValue();
        }
        Object obj28 = objArr[27];
        if (obj28 != null) {
            findGameItemInfo.showGift = ((Boolean) obj28).booleanValue();
        }
        Object obj29 = objArr[28];
        if (obj29 != null) {
            findGameItemInfo.databox = (String) obj29;
        }
        Object obj30 = objArr[29];
        if (obj30 != null) {
            findGameItemInfo.signActivityId = (String) obj30;
        }
        Object obj31 = objArr[30];
        if (obj31 != null) {
            findGameItemInfo.activityInfo = (GameActivitiesInfo) obj31;
        }
        Object obj32 = objArr[31];
        if (obj32 != null) {
            findGameItemInfo.setBgColor(((Integer) obj32).intValue());
        }
        Object obj33 = objArr[32];
        if (obj33 != null) {
            findGameItemInfo.followed = ((Boolean) obj33).booleanValue();
        }
        Object obj34 = objArr[33];
        if (obj34 != null) {
            findGameItemInfo.gameBaseId = ((Integer) obj34).intValue();
        }
        Object obj35 = objArr[34];
        if (obj35 != null) {
            findGameItemInfo.appId = (String) obj35;
        }
        Object obj36 = objArr[35];
        if (obj36 != null) {
            findGameItemInfo.title = (String) obj36;
        }
        Object obj37 = objArr[36];
        if (obj37 != null) {
            findGameItemInfo.gameName = (String) obj37;
        }
        Object obj38 = objArr[37];
        if (obj38 != null) {
            findGameItemInfo.setGameNameV2((String) obj38);
        }
        Object obj39 = objArr[38];
        if (obj39 != null) {
            findGameItemInfo.postfixList = (ArrayList) obj39;
        }
        Object obj40 = objArr[39];
        if (obj40 != null) {
            findGameItemInfo.expandedName = (String) obj40;
        }
        Object obj41 = objArr[40];
        if (obj41 != null) {
            findGameItemInfo.icon = (String) obj41;
        }
        Object obj42 = objArr[41];
        if (obj42 != null) {
            findGameItemInfo.name = (String) obj42;
        }
        Object obj43 = objArr[42];
        if (obj43 != null) {
            findGameItemInfo.source = ((Integer) obj43).intValue();
        }
        Object obj44 = objArr[43];
        if (obj44 != null) {
            findGameItemInfo.purchaseType = ((Integer) obj44).intValue();
        }
        Object obj45 = objArr[44];
        if (obj45 != null) {
            findGameItemInfo.purchased = ((Boolean) obj45).booleanValue();
        }
        Object obj46 = objArr[45];
        if (obj46 != null) {
            findGameItemInfo.price = ((Double) obj46).doubleValue();
        }
        Object obj47 = objArr[46];
        if (obj47 != null) {
            findGameItemInfo.discountPrice = ((Double) obj47).doubleValue();
        }
        Object obj48 = objArr[47];
        if (obj48 != null) {
            findGameItemInfo.discount = ((Integer) obj48).intValue();
        }
        Object obj49 = objArr[48];
        if (obj49 != null) {
            findGameItemInfo.downloadLink = (String) obj49;
        }
        Object obj50 = objArr[49];
        if (obj50 != null) {
            findGameItemInfo.downloadStatus = ((Integer) obj50).intValue();
        }
        Object obj51 = objArr[50];
        if (obj51 != null) {
            findGameItemInfo.grade = ((Float) obj51).floatValue();
        }
        Object obj52 = objArr[51];
        if (obj52 != null) {
            findGameItemInfo.platformScore = ((Float) obj52).floatValue();
        }
        Object obj53 = objArr[52];
        if (obj53 != null) {
            findGameItemInfo.tagId = ((Long) obj53).longValue();
        }
        Object obj54 = objArr[53];
        if (obj54 != null) {
            findGameItemInfo.tagName = (String) obj54;
        }
        Object obj55 = objArr[54];
        if (obj55 != null) {
            findGameItemInfo.tagList = (List) obj55;
        }
        Object obj56 = objArr[55];
        if (obj56 != null) {
            findGameItemInfo.tagListV3 = (List) obj56;
        }
        Object obj57 = objArr[56];
        if (obj57 != null) {
            findGameItemInfo.booked = ((Boolean) obj57).booleanValue();
        }
        Object obj58 = objArr[57];
        if (obj58 != null) {
            findGameItemInfo.bookNum = ((Integer) obj58).intValue();
        }
        Object obj59 = objArr[58];
        if (obj59 != null) {
            findGameItemInfo.androidPkgSize = ((Long) obj59).longValue();
        }
        Object obj60 = objArr[59];
        if (obj60 != null) {
            findGameItemInfo.androidSign = (String) obj60;
        }
        Object obj61 = objArr[60];
        if (obj61 != null) {
            findGameItemInfo.androidPkgName = (String) obj61;
        }
        Object obj62 = objArr[61];
        if (obj62 != null) {
            findGameItemInfo.androidPkgVer = (String) obj62;
        }
        Object obj63 = objArr[62];
        if (obj63 != null) {
            findGameItemInfo.androidMinSdk = (String) obj63;
        }
        Object obj64 = objArr[63];
        if (obj64 != null) {
            findGameItemInfo.isGray = ((Boolean) obj64).booleanValue();
        }
        Object obj65 = objArr[64];
        if (obj65 != null) {
            findGameItemInfo.products = (List) obj65;
        }
        Object obj66 = objArr[65];
        if (obj66 != null) {
            findGameItemInfo.cdkProducts = (List) obj66;
        }
        Object obj67 = objArr[66];
        if (obj67 != null) {
            findGameItemInfo.pcGameStatus = ((Integer) obj67).intValue();
        }
        Object obj68 = objArr[67];
        if (obj68 != null) {
            findGameItemInfo.grayId = (String) obj68;
        }
        Object obj69 = objArr[68];
        if (obj69 != null) {
            findGameItemInfo.androidPkgSizeGray = ((Long) obj69).longValue();
        }
        Object obj70 = objArr[69];
        if (obj70 != null) {
            findGameItemInfo.androidSignGray = (String) obj70;
        }
        Object obj71 = objArr[70];
        if (obj71 != null) {
            findGameItemInfo.androidPkgNameGray = (String) obj71;
        }
        Object obj72 = objArr[71];
        if (obj72 != null) {
            findGameItemInfo.androidPkgVerGray = (String) obj72;
        }
        Object obj73 = objArr[72];
        if (obj73 != null) {
            findGameItemInfo.downloadLinkGray2 = (String) obj73;
        }
        Object obj74 = objArr[73];
        if (obj74 != null) {
            findGameItemInfo.downloadLinkGray = (String) obj74;
        }
        Object obj75 = objArr[74];
        if (obj75 != null) {
            findGameItemInfo.downloadLink2 = (String) obj75;
        }
        Object obj76 = objArr[75];
        if (obj76 != null) {
            findGameItemInfo.androidGameStatus = ((Integer) obj76).intValue();
        }
        Object obj77 = objArr[76];
        if (obj77 != null) {
            findGameItemInfo.androidGameStatusV2 = ((Integer) obj77).intValue();
        }
        Object obj78 = objArr[77];
        if (obj78 != null) {
            findGameItemInfo.androidBookLink = (String) obj78;
        }
        Object obj79 = objArr[78];
        if (obj79 != null) {
            findGameItemInfo.protocolLink = (String) obj79;
        }
        Object obj80 = objArr[79];
        if (obj80 != null) {
            findGameItemInfo.btnId = (String) obj80;
        }
        Object obj81 = objArr[80];
        if (obj81 != null) {
            findGameItemInfo.playedNum = ((Integer) obj81).intValue();
        }
        Object obj82 = objArr[81];
        if (obj82 != null) {
            findGameItemInfo.smallGameLink = (String) obj82;
        }
        Object obj83 = objArr[82];
        if (obj83 != null) {
            findGameItemInfo.summary = (String) obj83;
        }
        Object obj84 = objArr[83];
        if (obj84 != null) {
            findGameItemInfo.subTitle = (String) obj84;
        }
        Object obj85 = objArr[84];
        if (obj85 != null) {
            findGameItemInfo.isShowTest = ((Boolean) obj85).booleanValue();
        }
        Object obj86 = objArr[85];
        if (obj86 != null) {
            findGameItemInfo.testHintContent = (String) obj86;
        }
        Object obj87 = objArr[86];
        if (obj87 != null) {
            findGameItemInfo.isShowAndroid = ((Integer) obj87).intValue();
        }
        Object obj88 = objArr[87];
        if (obj88 != null) {
            findGameItemInfo.avId = (String) obj88;
        }
        Object obj89 = objArr[88];
        if (obj89 != null) {
            findGameItemInfo.bvId = (String) obj89;
        }
        Object obj90 = objArr[89];
        if (obj90 != null) {
            findGameItemInfo.cid = (String) obj90;
        }
        Object obj91 = objArr[90];
        if (obj91 != null) {
            findGameItemInfo.image = (String) obj91;
        }
        Object obj92 = objArr[91];
        if (obj92 != null) {
            findGameItemInfo.steamLink = (String) obj92;
        }
        Object obj93 = objArr[92];
        if (obj93 != null) {
            findGameItemInfo.buttonText = (String) obj93;
        }
        Object obj94 = objArr[93];
        if (obj94 != null) {
            findGameItemInfo.isPlayVideo = ((Boolean) obj94).booleanValue();
        }
        Object obj95 = objArr[94];
        if (obj95 != null) {
            findGameItemInfo.canDownload = ((Boolean) obj95).booleanValue();
        }
        Object obj96 = objArr[95];
        if (obj96 != null) {
            findGameItemInfo.gameType = (String) obj96;
        }
        Object obj97 = objArr[96];
        if (obj97 != null) {
            findGameItemInfo.developerName = (String) obj97;
        }
        Object obj98 = objArr[97];
        if (obj98 != null) {
            findGameItemInfo.isShowPermissionDetail = ((Integer) obj98).intValue();
        }
        Object obj99 = objArr[98];
        if (obj99 != null) {
            findGameItemInfo.isAndroidPkgIncrUpdated = ((Integer) obj99).intValue();
        }
        Object obj100 = objArr[99];
        if (obj100 != null) {
            findGameItemInfo.showPresale = ((Integer) obj100).intValue();
        }
        Object obj101 = objArr[100];
        if (obj101 != null) {
            findGameItemInfo.presaleStatus = ((Integer) obj101).intValue();
        }
        Object obj102 = objArr[101];
        if (obj102 != null) {
            findGameItemInfo.extra = (JSONObject) obj102;
        }
        Object obj103 = objArr[102];
        if (obj103 != null) {
            findGameItemInfo.isDetailClick = ((Boolean) obj103).booleanValue();
        }
        Object obj104 = objArr[103];
        if (obj104 != null) {
            findGameItemInfo.isPatchUpdate = ((Boolean) obj104).booleanValue();
        }
        Object obj105 = objArr[104];
        if (obj105 != null) {
            findGameItemInfo.updatedPatchPkgInfo = (BiliGamePatchInfo.UpdatedPkgInfo) obj105;
        }
        Object obj106 = objArr[105];
        if (obj106 != null) {
            findGameItemInfo.isZstdDownload = ((Boolean) obj106).booleanValue();
        }
        Object obj107 = objArr[106];
        if (obj107 != null) {
            findGameItemInfo.zstdPkgInfo = (BiligameDownloadExtraBean.ZstdPkgInfoBean) obj107;
        }
        Object obj108 = objArr[107];
        if (obj108 != null) {
            findGameItemInfo.fromMainSite = ((Boolean) obj108).booleanValue();
        }
        Object obj109 = objArr[108];
        if (obj109 != null) {
            findGameItemInfo.channelId = (String) obj109;
        }
        Object obj110 = objArr[109];
        if (obj110 != null) {
            findGameItemInfo.channelExtra = (String) obj110;
        }
        Object obj111 = objArr[110];
        if (obj111 != null) {
            findGameItemInfo.adGamePkg = (BiliGameAdGameDataBean) obj111;
        }
        Object obj112 = objArr[111];
        if (obj112 != null) {
            findGameItemInfo.sourceFrom = (String) obj112;
        }
        Object obj113 = objArr[112];
        if (obj113 != null) {
            findGameItemInfo.downloadMode = (String) obj113;
        }
        Object obj114 = objArr[113];
        if (obj114 != null) {
            findGameItemInfo.androidTemporaryOffline = ((Boolean) obj114).booleanValue();
        }
        Object obj115 = objArr[114];
        if (obj115 != null) {
            findGameItemInfo.bookVersionActivityId = (String) obj115;
        }
        Object obj116 = objArr[115];
        if (obj116 != null) {
            findGameItemInfo.updateVersionRelatedPcGame = ((Integer) obj116).intValue();
        }
        Object obj117 = objArr[116];
        if (obj117 != null) {
            findGameItemInfo.isBookVersion = ((Boolean) obj117).booleanValue();
        }
        Object obj118 = objArr[117];
        if (obj118 != null) {
            findGameItemInfo.bookVersionStatus = ((Boolean) obj118).booleanValue();
        }
        Object obj119 = objArr[118];
        if (obj119 != null) {
            findGameItemInfo.sameServerTag = (String) obj119;
        }
        Object obj120 = objArr[119];
        if (obj120 != null) {
            findGameItemInfo.minigameNewOnline = ((Integer) obj120).intValue();
        }
        Object obj121 = objArr[120];
        if (obj121 != null) {
            findGameItemInfo.minigameNewOnlineText = (String) obj121;
        }
        Object obj122 = objArr[121];
        if (obj122 != null) {
            findGameItemInfo.adTrackId = (String) obj122;
        }
        Object obj123 = objArr[122];
        if (obj123 != null) {
            findGameItemInfo.gameTrackId = (String) obj123;
        }
        return findGameItemInfo;
    }

    public final Object get(Object obj, int i7) {
        FindGameItemInfo findGameItemInfo = (FindGameItemInfo) obj;
        switch (i7) {
            case 0:
                return findGameItemInfo.getGameRankInfo();
            case 1:
                return findGameItemInfo.getScreenShotList();
            case 2:
                return findGameItemInfo.getGiftInfo();
            case 3:
                return Integer.valueOf(findGameItemInfo.validCommentNumber);
            case 4:
                return findGameItemInfo.testTitle;
            case 5:
                return Boolean.valueOf(findGameItemInfo.isSelected);
            case 6:
                return Long.valueOf(findGameItemInfo.bIndexNum);
            case 7:
                return findGameItemInfo.wikiLink;
            case 8:
                return findGameItemInfo.nativeWikiLink;
            case 9:
                return findGameItemInfo.startTestTime;
            case 10:
                return findGameItemInfo.startTestType;
            case 11:
                return Integer.valueOf(findGameItemInfo.isPreciseTime);
            case 12:
                return Integer.valueOf(findGameItemInfo.topStatus);
            case 13:
                return findGameItemInfo.lastDownloadTime;
            case 14:
                return Boolean.valueOf(findGameItemInfo.useExtendText);
            case 15:
                return findGameItemInfo.extendText;
            case 16:
                return findGameItemInfo.description;
            case 17:
                return Integer.valueOf(findGameItemInfo.cooperationType);
            case 18:
                return findGameItemInfo.reasons;
            case 19:
                return Integer.valueOf(findGameItemInfo.downloadType);
            case 20:
                return findGameItemInfo.unread;
            case 21:
                return Integer.valueOf(findGameItemInfo.itemPosition);
            case 22:
                return findGameItemInfo.cloudGameInfoV2;
            case 23:
                return findGameItemInfo.videoImage;
            case 24:
                return findGameItemInfo.backgroundColor;
            case 25:
                return Boolean.valueOf(findGameItemInfo.showForum);
            case 26:
                return Boolean.valueOf(findGameItemInfo.showWiki);
            case 27:
                return Boolean.valueOf(findGameItemInfo.showGift);
            case 28:
                return findGameItemInfo.databox;
            case 29:
                return findGameItemInfo.signActivityId;
            case 30:
                return findGameItemInfo.activityInfo;
            case 31:
                return Integer.valueOf(findGameItemInfo.getBgColor());
            case 32:
                return Boolean.valueOf(findGameItemInfo.followed);
            case 33:
                return Integer.valueOf(findGameItemInfo.gameBaseId);
            case 34:
                return findGameItemInfo.appId;
            case 35:
                return findGameItemInfo.title;
            case 36:
                return findGameItemInfo.gameName;
            case 37:
                return findGameItemInfo.getGameNameV2();
            case 38:
                return findGameItemInfo.postfixList;
            case 39:
                return findGameItemInfo.expandedName;
            case 40:
                return findGameItemInfo.icon;
            case 41:
                return findGameItemInfo.name;
            case 42:
                return Integer.valueOf(findGameItemInfo.source);
            case 43:
                return Integer.valueOf(findGameItemInfo.purchaseType);
            case 44:
                return Boolean.valueOf(findGameItemInfo.purchased);
            case 45:
                return Double.valueOf(findGameItemInfo.price);
            case 46:
                return Double.valueOf(findGameItemInfo.discountPrice);
            case 47:
                return Integer.valueOf(findGameItemInfo.discount);
            case 48:
                return findGameItemInfo.downloadLink;
            case 49:
                return Integer.valueOf(findGameItemInfo.downloadStatus);
            case 50:
                return Float.valueOf(findGameItemInfo.grade);
            case 51:
                return Float.valueOf(findGameItemInfo.platformScore);
            case 52:
                return Long.valueOf(findGameItemInfo.tagId);
            case 53:
                return findGameItemInfo.tagName;
            case 54:
                return findGameItemInfo.tagList;
            case 55:
                return findGameItemInfo.tagListV3;
            case 56:
                return Boolean.valueOf(findGameItemInfo.booked);
            case 57:
                return Integer.valueOf(findGameItemInfo.bookNum);
            case 58:
                return Long.valueOf(findGameItemInfo.androidPkgSize);
            case 59:
                return findGameItemInfo.androidSign;
            case 60:
                return findGameItemInfo.androidPkgName;
            case 61:
                return findGameItemInfo.androidPkgVer;
            case 62:
                return findGameItemInfo.androidMinSdk;
            case 63:
                return Boolean.valueOf(findGameItemInfo.isGray);
            case 64:
                return findGameItemInfo.products;
            case 65:
                return findGameItemInfo.cdkProducts;
            case 66:
                return Integer.valueOf(findGameItemInfo.pcGameStatus);
            case 67:
                return findGameItemInfo.grayId;
            case 68:
                return Long.valueOf(findGameItemInfo.androidPkgSizeGray);
            case 69:
                return findGameItemInfo.androidSignGray;
            case 70:
                return findGameItemInfo.androidPkgNameGray;
            case 71:
                return findGameItemInfo.androidPkgVerGray;
            case 72:
                return findGameItemInfo.downloadLinkGray2;
            case 73:
                return findGameItemInfo.downloadLinkGray;
            case 74:
                return findGameItemInfo.downloadLink2;
            case 75:
                return Integer.valueOf(findGameItemInfo.androidGameStatus);
            case 76:
                return Integer.valueOf(findGameItemInfo.androidGameStatusV2);
            case AdCardDto.STORY_ANCHOR_FIELD_NUMBER /* 77 */:
                return findGameItemInfo.androidBookLink;
            case AdCardDto.JUMP_INTERACTION_STYLE_FIELD_NUMBER /* 78 */:
                return findGameItemInfo.protocolLink;
            case 79:
                return findGameItemInfo.btnId;
            case 80:
                return Integer.valueOf(findGameItemInfo.playedNum);
            case 81:
                return findGameItemInfo.smallGameLink;
            case 82:
                return findGameItemInfo.summary;
            case AdCardDto.DESC_LIST_FIELD_NUMBER /* 83 */:
                return findGameItemInfo.subTitle;
            case AdCardDto.PRODUCT_SOURCE_FIELD_NUMBER /* 84 */:
                return Boolean.valueOf(findGameItemInfo.isShowTest);
            case AdCardDto.COUPON_DESC_FIELD_NUMBER /* 85 */:
                return findGameItemInfo.testHintContent;
            case AdCardDto.COUPON_PRICE_FIELD_NUMBER /* 86 */:
                return Integer.valueOf(findGameItemInfo.isShowAndroid);
            case AdCardDto.VOLUME_DESC_FIELD_NUMBER /* 87 */:
                return findGameItemInfo.avId;
            case AdCardDto.LABELS_FIELD_NUMBER /* 88 */:
                return findGameItemInfo.bvId;
            case AdCardDto.ITEM_SOURCE_FIELD_NUMBER /* 89 */:
                return findGameItemInfo.cid;
            case AdCardDto.UNDERFRAME_ICON_TYPE_FIELD_NUMBER /* 90 */:
                return findGameItemInfo.image;
            case AdCardDto.AD_TAG_STYLE_FULL_SCREEN_FIELD_NUMBER /* 91 */:
                return findGameItemInfo.steamLink;
            case AdCardDto.BENEFIT_ICON_FIELD_NUMBER /* 92 */:
                return findGameItemInfo.buttonText;
            case AdCardDto.RELATED_INTERACTION_STYLE_FIELD_NUMBER /* 93 */:
                return Boolean.valueOf(findGameItemInfo.isPlayVideo);
            case AdCardDto.HAS_ANTI_SNIPING_PRICE_FIELD_NUMBER /* 94 */:
                return Boolean.valueOf(findGameItemInfo.canDownload);
            case AdCardDto.ANTI_SNIPING_TEXT_FIELD_NUMBER /* 95 */:
                return findGameItemInfo.gameType;
            case 96:
                return findGameItemInfo.developerName;
            case 97:
                return Integer.valueOf(findGameItemInfo.isShowPermissionDetail);
            case 98:
                return Integer.valueOf(findGameItemInfo.isAndroidPkgIncrUpdated);
            case 99:
                return Integer.valueOf(findGameItemInfo.showPresale);
            case 100:
                return Integer.valueOf(findGameItemInfo.presaleStatus);
            case 101:
                return findGameItemInfo.extra;
            case 102:
                return Boolean.valueOf(findGameItemInfo.isDetailClick);
            case 103:
                return Boolean.valueOf(findGameItemInfo.isPatchUpdate);
            case 104:
                return findGameItemInfo.updatedPatchPkgInfo;
            case 105:
                return Boolean.valueOf(findGameItemInfo.isZstdDownload);
            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD /* 106 */:
                return findGameItemInfo.zstdPkgInfo;
            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD /* 107 */:
                return Boolean.valueOf(findGameItemInfo.fromMainSite);
            case 108:
                return findGameItemInfo.channelId;
            case 109:
                return findGameItemInfo.channelExtra;
            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD /* 110 */:
                return findGameItemInfo.adGamePkg;
            case CaptionFx.BUBBLEPATH_FIELD_NUMBER /* 111 */:
                return findGameItemInfo.sourceFrom;
            case 112:
                return findGameItemInfo.downloadMode;
            case 113:
                return Boolean.valueOf(findGameItemInfo.androidTemporaryOffline);
            case 114:
                return findGameItemInfo.bookVersionActivityId;
            case 115:
                return Integer.valueOf(findGameItemInfo.updateVersionRelatedPcGame);
            case 116:
                return Boolean.valueOf(findGameItemInfo.isBookVersion);
            case 117:
                return Boolean.valueOf(findGameItemInfo.bookVersionStatus);
            case 118:
                return findGameItemInfo.sameServerTag;
            case 119:
                return Integer.valueOf(findGameItemInfo.minigameNewOnline);
            case 120:
                return findGameItemInfo.minigameNewOnlineText;
            case 121:
                return findGameItemInfo.adTrackId;
            case 122:
                return findGameItemInfo.gameTrackId;
            default:
                return null;
        }
    }
}
