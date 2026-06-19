package com.bilibili.ogv.opbase;

import androidx.core.app.NotificationCompat;
import com.bapis.bilibili.ad.v1.AdCardDto;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.bilibili.ogvcommon.play.BangumiDimension;
import com.bilibili.studio.centerplus.util.blink.BlinkEffectManager;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard_JsonDescriptor.class */
public final class CommonCard_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69814a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("img_badge", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("tag", (String[]) null, Tag.class, (Class) null, 6);
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("desc_type", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor7 = new PojoPropertyDescriptor("desc_link", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor8 = new PojoPropertyDescriptor("desc2", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor9 = new PojoPropertyDescriptor("badge", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor10 = new PojoPropertyDescriptor("type", (String[]) null, CommonCard.BangumiCardType.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor11 = new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, Progress.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor12 = new PojoPropertyDescriptor("gif", (String[]) null, String.class, (Class) null, 6);
        Class cls2 = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor13 = new PojoPropertyDescriptor("season_id", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor14 = new PojoPropertyDescriptor("season_type", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor15 = new PojoPropertyDescriptor("badge_type", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor16 = new PojoPropertyDescriptor("badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor17 = new PojoPropertyDescriptor("progress_percent", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor18 = new PojoPropertyDescriptor("top_left_badge", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor19 = new PojoPropertyDescriptor("bottom_left_badge", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor20 = new PojoPropertyDescriptor("icons", (String[]) null, Types.parameterizedType(List.class, new Type[]{String.class}), (Class) null, 22);
        PojoPropertyDescriptor pojoPropertyDescriptor21 = new PojoPropertyDescriptor("bottom_right_badge", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor22 = new PojoPropertyDescriptor("desc_badge", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor23 = new PojoPropertyDescriptor("sub_title_left_badge", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6);
        Class cls3 = Boolean.TYPE;
        f69814a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, pojoPropertyDescriptor7, pojoPropertyDescriptor8, pojoPropertyDescriptor9, pojoPropertyDescriptor10, pojoPropertyDescriptor11, pojoPropertyDescriptor12, pojoPropertyDescriptor13, pojoPropertyDescriptor14, pojoPropertyDescriptor15, pojoPropertyDescriptor16, pojoPropertyDescriptor17, pojoPropertyDescriptor18, pojoPropertyDescriptor19, pojoPropertyDescriptor20, pojoPropertyDescriptor21, pojoPropertyDescriptor22, pojoPropertyDescriptor23, new PojoPropertyDescriptor("is_new", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor(BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL, (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, Status.class, (Class) null, 7), new PojoPropertyDescriptor("can_watch", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("stat", (String[]) null, CountInfo.class, (Class) null, 6), new PojoPropertyDescriptor("wid", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("item_id", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("unique_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("cursor", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("button_type", (String[]) null, CommonCard.OGVInlineActionType.class, (Class) null, 7), new PojoPropertyDescriptor("rcmd_oid", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("rcmd_otype", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("title_badge", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("tags", (String[]) null, Types.parameterizedType(List.class, new Type[]{Tag.class}), (Class) null, 22), new PojoPropertyDescriptor("button_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("spmid", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("from_spmid", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("feedback_content", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("oid", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("date", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("hat", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("check", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("follow", (String[]) null, FollowInCard.class, (Class) null, 6), new PojoPropertyDescriptor("can_favor", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("order_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("module_title", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("module_type", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("module_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("report_title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("report_subtitle", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("new_page_name", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("dynamic_param", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("dynamic_up_name", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("dynamic_play", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("dynamic_played_num_text", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("dynamic_played_num_icon", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("dynamic_danmaku", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("dynamic_reply", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("dynamic_page_name", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("dynamic_duration", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("is_dynamic", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("aid", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("cid", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("static_cover", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("item_style", (String[]) null, BadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("title_right_badge", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("badge_control", (String[]) null, BadgeControll.class, (Class) null, 6), new PojoPropertyDescriptor("dimension", (String[]) null, BangumiDimension.class, (Class) null, 6), new PojoPropertyDescriptor("player_info", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("episode_id", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("preview_link", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("preview_episode_id", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("preview_season_id", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("is_preview", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("video", (String[]) null, VideoInfo.class, (Class) null, 6), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 6), new PojoPropertyDescriptor("item_type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("item_show_type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("item_show_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("dynamic_banner", (String[]) null, CommonCard.VideoBannerInfo.class, (Class) null, 6), new PojoPropertyDescriptor("video_url", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("small_cover", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("source_content", (String[]) null, SourceContent.class, (Class) null, 6), new PojoPropertyDescriptor("freya_info", (String[]) null, RoomInfo.class, (Class) null, 6), new PojoPropertyDescriptor("skin", (String[]) null, CommonCard.Skin.class, (Class) null, 6), new PojoPropertyDescriptor("items", (String[]) null, Types.parameterizedType(List.class, new Type[]{CommonCard.class}), (Class) null, 23), new PojoPropertyDescriptor("has_next", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("upper", (String[]) null, UpInfo.class, (Class) null, 6), new PojoPropertyDescriptor("intervene_placeholder", (String[]) null, CommonCard.HomeBannerInterveneType.class, (Class) null, 7), new PojoPropertyDescriptor("feedback_source", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("evaluate", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("pub_time", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("release_date_show", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("day", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("supplementary_drama", (String[]) null, JsonObject.class, (Class) null, 6), new PojoPropertyDescriptor("online_text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("season_styles", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("new_ep", (String[]) null, NewestEp.class, (Class) null, 6)};
    }

    public CommonCard_JsonDescriptor() {
        super(CommonCard.class, f69814a);
    }

    public final Object constructWith(Object[] objArr) {
        CommonCard commonCard = new CommonCard();
        Object obj = objArr[0];
        if (obj != null) {
            commonCard.f69746a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            commonCard.f69749b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            commonCard.f69752c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            commonCard.f69754d = (String) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            commonCard.f69756e = (Tag) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            commonCard.f69758f = ((Integer) obj6).intValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            commonCard.f69760g = (String) obj7;
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            commonCard.h = (String) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            commonCard.f69763i = (String) obj9;
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            commonCard.f69765j = (CommonCard.BangumiCardType) obj10;
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            commonCard.f69767k = (Progress) obj11;
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            commonCard.f69769l = (String) obj12;
        }
        Object obj13 = objArr[12];
        if (obj13 != null) {
            commonCard.f69771m = ((Long) obj13).longValue();
        }
        Object obj14 = objArr[13];
        if (obj14 != null) {
            commonCard.f69773n = ((Integer) obj14).intValue();
        }
        Object obj15 = objArr[14];
        if (obj15 != null) {
            commonCard.f69775o = ((Integer) obj15).intValue();
        }
        Object obj16 = objArr[15];
        if (obj16 != null) {
            commonCard.T((BangumiBadgeInfo) obj16);
        }
        Object obj17 = objArr[16];
        if (obj17 != null) {
            commonCard.J(((Integer) obj17).intValue());
        }
        Object obj18 = objArr[17];
        if (obj18 != null) {
            commonCard.P((BangumiBadgeInfo) obj18);
        }
        Object obj19 = objArr[18];
        if (obj19 != null) {
            commonCard.z((BangumiBadgeInfo) obj19);
        }
        Object obj20 = objArr[19];
        if (obj20 != null) {
            commonCard.Q((List) obj20);
        }
        Object obj21 = objArr[20];
        if (obj21 != null) {
            commonCard.A((BangumiBadgeInfo) obj21);
        }
        Object obj22 = objArr[21];
        if (obj22 != null) {
            commonCard.L((BangumiBadgeInfo) obj22);
        }
        Object obj23 = objArr[22];
        if (obj23 != null) {
            commonCard.M((BangumiBadgeInfo) obj23);
        }
        Object obj24 = objArr[23];
        if (obj24 != null) {
            commonCard.E(((Boolean) obj24).booleanValue());
        }
        Object obj25 = objArr[24];
        if (obj25 != null) {
            commonCard.f69795y = (String) obj25;
        }
        Object obj26 = objArr[25];
        if (obj26 != null) {
            commonCard.x((String) obj26);
        }
        Object obj27 = objArr[26];
        if (obj27 != null) {
            commonCard.f69694A = (Status) obj27;
        }
        Object obj28 = objArr[27];
        if (obj28 != null) {
            commonCard.f69696B = ((Boolean) obj28).booleanValue();
        }
        Object obj29 = objArr[28];
        if (obj29 != null) {
            commonCard.B((CountInfo) obj29);
        }
        Object obj30 = objArr[29];
        if (obj30 != null) {
            commonCard.f69700D = ((Long) obj30).longValue();
        }
        Object obj31 = objArr[30];
        if (obj31 != null) {
            commonCard.f69702E = ((Long) obj31).longValue();
        }
        Object obj32 = objArr[31];
        if (obj32 != null) {
            commonCard.f69704F = (String) obj32;
        }
        Object obj33 = objArr[32];
        if (obj33 != null) {
            commonCard.f69706G = (String) obj33;
        }
        Object obj34 = objArr[33];
        if (obj34 != null) {
            commonCard.f69708H = (CommonCard.OGVInlineActionType) obj34;
        }
        Object obj35 = objArr[34];
        if (obj35 != null) {
            commonCard.f69710I = ((Integer) obj35).intValue();
        }
        Object obj36 = objArr[35];
        if (obj36 != null) {
            commonCard.f69712J = ((Integer) obj36).intValue();
        }
        Object obj37 = objArr[36];
        if (obj37 != null) {
            commonCard.f69714K = (BangumiBadgeInfo) obj37;
        }
        Object obj38 = objArr[37];
        if (obj38 != null) {
            commonCard.f69716L = (List) obj38;
        }
        Object obj39 = objArr[38];
        if (obj39 != null) {
            commonCard.f69718M = (String) obj39;
        }
        Object obj40 = objArr[39];
        if (obj40 != null) {
            commonCard.f69720N = (String) obj40;
        }
        Object obj41 = objArr[40];
        if (obj41 != null) {
            commonCard.f69722O = (String) obj41;
        }
        Object obj42 = objArr[41];
        if (obj42 != null) {
            commonCard.f69724P = (String) obj42;
        }
        Object obj43 = objArr[42];
        if (obj43 != null) {
            commonCard.f69726Q = ((Long) obj43).longValue();
        }
        Object obj44 = objArr[43];
        if (obj44 != null) {
            commonCard.f69728R = (String) obj44;
        }
        Object obj45 = objArr[44];
        if (obj45 != null) {
            commonCard.f69730S = (String) obj45;
        }
        Object obj46 = objArr[45];
        if (obj46 != null) {
            commonCard.f69732T = (String) obj46;
        }
        Object obj47 = objArr[46];
        if (obj47 != null) {
            commonCard.f69734U = (FollowInCard) obj47;
        }
        Object obj48 = objArr[47];
        if (obj48 != null) {
            commonCard.f69740X = ((Boolean) obj48).booleanValue();
        }
        Object obj49 = objArr[48];
        if (obj49 != null) {
            commonCard.f69742Y = ((Integer) obj49).intValue();
        }
        Object obj50 = objArr[49];
        if (obj50 != null) {
            commonCard.f69744Z = (String) obj50;
        }
        Object obj51 = objArr[50];
        if (obj51 != null) {
            commonCard.f69747a0 = (String) obj51;
        }
        Object obj52 = objArr[51];
        if (obj52 != null) {
            commonCard.f69750b0 = (String) obj52;
        }
        Object obj53 = objArr[52];
        if (obj53 != null) {
            commonCard.f69753c0 = (String) obj53;
        }
        Object obj54 = objArr[53];
        if (obj54 != null) {
            commonCard.f69755d0 = (String) obj54;
        }
        Object obj55 = objArr[54];
        if (obj55 != null) {
            commonCard.f69757e0 = (String) obj55;
        }
        Object obj56 = objArr[55];
        if (obj56 != null) {
            commonCard.f69759f0 = (String) obj56;
        }
        Object obj57 = objArr[56];
        if (obj57 != null) {
            commonCard.f69761g0 = (String) obj57;
        }
        Object obj58 = objArr[57];
        if (obj58 != null) {
            commonCard.f69762h0 = ((Integer) obj58).intValue();
        }
        Object obj59 = objArr[58];
        if (obj59 != null) {
            commonCard.f69764i0 = (String) obj59;
        }
        Object obj60 = objArr[59];
        if (obj60 != null) {
            commonCard.f69766j0 = (String) obj60;
        }
        Object obj61 = objArr[60];
        if (obj61 != null) {
            commonCard.f69768k0 = ((Integer) obj61).intValue();
        }
        Object obj62 = objArr[61];
        if (obj62 != null) {
            commonCard.f69770l0 = ((Integer) obj62).intValue();
        }
        Object obj63 = objArr[62];
        if (obj63 != null) {
            commonCard.f69772m0 = (String) obj63;
        }
        Object obj64 = objArr[63];
        if (obj64 != null) {
            commonCard.f69774n0 = ((Long) obj64).longValue();
        }
        Object obj65 = objArr[64];
        if (obj65 != null) {
            commonCard.f69776o0 = ((Boolean) obj65).booleanValue();
        }
        Object obj66 = objArr[65];
        if (obj66 != null) {
            commonCard.f69778p0 = ((Long) obj66).longValue();
        }
        Object obj67 = objArr[66];
        if (obj67 != null) {
            commonCard.f69780q0 = ((Long) obj67).longValue();
        }
        Object obj68 = objArr[67];
        if (obj68 != null) {
            commonCard.F((String) obj68);
        }
        Object obj69 = objArr[68];
        if (obj69 != null) {
            commonCard.y((BadgeInfo) obj69);
        }
        Object obj70 = objArr[69];
        if (obj70 != null) {
            commonCard.O((BangumiBadgeInfo) obj70);
        }
        Object obj71 = objArr[70];
        if (obj71 != null) {
            commonCard.f69788u0 = (BadgeControll) obj71;
        }
        Object obj72 = objArr[71];
        if (obj72 != null) {
            commonCard.f69790v0 = (BangumiDimension) obj72;
        }
        Object obj73 = objArr[72];
        if (obj73 != null) {
            commonCard.G((String) obj73);
        }
        Object obj74 = objArr[73];
        if (obj74 != null) {
            commonCard.C(((Long) obj74).longValue());
        }
        Object obj75 = objArr[74];
        if (obj75 != null) {
            commonCard.f69796y0 = (String) obj75;
        }
        Object obj76 = objArr[75];
        if (obj76 != null) {
            commonCard.I(((Long) obj76).longValue());
        }
        Object obj77 = objArr[76];
        if (obj77 != null) {
            commonCard.f69695A0 = ((Long) obj77).longValue();
        }
        Object obj78 = objArr[77];
        if (obj78 != null) {
            commonCard.H(((Boolean) obj78).booleanValue());
        }
        Object obj79 = objArr[78];
        if (obj79 != null) {
            commonCard.S((VideoInfo) obj79);
        }
        Object obj80 = objArr[79];
        if (obj80 != null) {
            commonCard.f69701D0 = (Map) obj80;
        }
        Object obj81 = objArr[80];
        if (obj81 != null) {
            commonCard.f69703E0 = ((Integer) obj81).intValue();
        }
        Object obj82 = objArr[81];
        if (obj82 != null) {
            commonCard.f69705F0 = ((Integer) obj82).intValue();
        }
        Object obj83 = objArr[82];
        if (obj83 != null) {
            commonCard.f69707G0 = ((Integer) obj83).intValue();
        }
        Object obj84 = objArr[83];
        if (obj84 != null) {
            commonCard.R((CommonCard.VideoBannerInfo) obj84);
        }
        Object obj85 = objArr[84];
        if (obj85 != null) {
            commonCard.f69711I0 = (String) obj85;
        }
        Object obj86 = objArr[85];
        if (obj86 != null) {
            commonCard.f69713J0 = (String) obj86;
        }
        Object obj87 = objArr[86];
        if (obj87 != null) {
            commonCard.f69715K0 = (SourceContent) obj87;
        }
        Object obj88 = objArr[87];
        if (obj88 != null) {
            commonCard.f69717L0 = (RoomInfo) obj88;
        }
        Object obj89 = objArr[88];
        if (obj89 != null) {
            commonCard.f69721N0 = (CommonCard.Skin) obj89;
        }
        Object obj90 = objArr[89];
        if (obj90 != null) {
            commonCard.K((List) obj90);
        }
        Object obj91 = objArr[90];
        if (obj91 != null) {
            commonCard.f69725P0 = ((Boolean) obj91).booleanValue();
        }
        Object obj92 = objArr[91];
        if (obj92 != null) {
            commonCard.f69727Q0 = (UpInfo) obj92;
        }
        Object obj93 = objArr[92];
        if (obj93 != null) {
            commonCard.D((CommonCard.HomeBannerInterveneType) obj93);
        }
        Object obj94 = objArr[93];
        if (obj94 != null) {
            commonCard.f69733T0 = ((Integer) obj94).intValue();
        }
        Object obj95 = objArr[94];
        if (obj95 != null) {
            commonCard.f69735U0 = (String) obj95;
        }
        Object obj96 = objArr[95];
        if (obj96 != null) {
            commonCard.f69737V0 = (String) obj96;
        }
        Object obj97 = objArr[96];
        if (obj97 != null) {
            commonCard.f69739W0 = (String) obj97;
        }
        Object obj98 = objArr[97];
        if (obj98 != null) {
            commonCard.f69741X0 = (String) obj98;
        }
        Object obj99 = objArr[98];
        if (obj99 != null) {
            commonCard.N((JsonObject) obj99);
        }
        Object obj100 = objArr[99];
        if (obj100 != null) {
            commonCard.f69745Z0 = (String) obj100;
        }
        Object obj101 = objArr[100];
        if (obj101 != null) {
            commonCard.f69748a1 = (String) obj101;
        }
        Object obj102 = objArr[101];
        if (obj102 != null) {
            commonCard.f69751b1 = (NewestEp) obj102;
        }
        return commonCard;
    }

    public final Object get(Object obj, int i7) {
        CommonCard commonCard = (CommonCard) obj;
        switch (i7) {
            case 0:
                return commonCard.f69746a;
            case 1:
                return commonCard.f69749b;
            case 2:
                return commonCard.f69752c;
            case 3:
                return commonCard.f69754d;
            case 4:
                return commonCard.f69756e;
            case 5:
                return Integer.valueOf(commonCard.f69758f);
            case 6:
                return commonCard.f69760g;
            case 7:
                return commonCard.h;
            case 8:
                return commonCard.f69763i;
            case 9:
                return commonCard.f69765j;
            case 10:
                return commonCard.f69767k;
            case 11:
                return commonCard.f69769l;
            case 12:
                return Long.valueOf(commonCard.f69771m);
            case 13:
                return Integer.valueOf(commonCard.f69773n);
            case 14:
                return Integer.valueOf(commonCard.f69775o);
            case 15:
                return commonCard.u();
            case 16:
                return Integer.valueOf(commonCard.k());
            case 17:
                return commonCard.q();
            case 18:
                return commonCard.c();
            case 19:
                return commonCard.r();
            case 20:
                return commonCard.d();
            case 21:
                return commonCard.m();
            case 22:
                return commonCard.n();
            case 23:
                return Boolean.valueOf(commonCard.v());
            case 24:
                return commonCard.f69795y;
            case 25:
                return commonCard.a();
            case 26:
                return commonCard.f69694A;
            case 27:
                return Boolean.valueOf(commonCard.f69696B);
            case 28:
                return commonCard.e();
            case 29:
                return Long.valueOf(commonCard.f69700D);
            case 30:
                return Long.valueOf(commonCard.f69702E);
            case 31:
                return commonCard.f69704F;
            case 32:
                return commonCard.f69706G;
            case 33:
                return commonCard.f69708H;
            case 34:
                return Integer.valueOf(commonCard.f69710I);
            case 35:
                return Integer.valueOf(commonCard.f69712J);
            case 36:
                return commonCard.f69714K;
            case 37:
                return commonCard.f69716L;
            case 38:
                return commonCard.f69718M;
            case 39:
                return commonCard.f69720N;
            case 40:
                return commonCard.f69722O;
            case 41:
                return commonCard.f69724P;
            case 42:
                return Long.valueOf(commonCard.f69726Q);
            case 43:
                return commonCard.f69728R;
            case 44:
                return commonCard.f69730S;
            case 45:
                return commonCard.f69732T;
            case 46:
                return commonCard.f69734U;
            case 47:
                return Boolean.valueOf(commonCard.f69740X);
            case 48:
                return Integer.valueOf(commonCard.f69742Y);
            case 49:
                return commonCard.f69744Z;
            case 50:
                return commonCard.f69747a0;
            case 51:
                return commonCard.f69750b0;
            case 52:
                return commonCard.f69753c0;
            case 53:
                return commonCard.f69755d0;
            case 54:
                return commonCard.f69757e0;
            case 55:
                return commonCard.f69759f0;
            case 56:
                return commonCard.f69761g0;
            case 57:
                return Integer.valueOf(commonCard.f69762h0);
            case 58:
                return commonCard.f69764i0;
            case 59:
                return commonCard.f69766j0;
            case 60:
                return Integer.valueOf(commonCard.f69768k0);
            case 61:
                return Integer.valueOf(commonCard.f69770l0);
            case 62:
                return commonCard.f69772m0;
            case 63:
                return Long.valueOf(commonCard.f69774n0);
            case 64:
                return Boolean.valueOf(commonCard.f69776o0);
            case 65:
                return Long.valueOf(commonCard.f69778p0);
            case 66:
                return Long.valueOf(commonCard.f69780q0);
            case 67:
                return commonCard.h();
            case 68:
                return commonCard.b();
            case 69:
                return commonCard.p();
            case 70:
                return commonCard.f69788u0;
            case 71:
                return commonCard.f69790v0;
            case 72:
                return commonCard.i();
            case 73:
                return Long.valueOf(commonCard.f());
            case 74:
                return commonCard.f69796y0;
            case 75:
                return Long.valueOf(commonCard.j());
            case 76:
                return Long.valueOf(commonCard.f69695A0);
            case AdCardDto.STORY_ANCHOR_FIELD_NUMBER /* 77 */:
                return Boolean.valueOf(commonCard.w());
            case AdCardDto.JUMP_INTERACTION_STYLE_FIELD_NUMBER /* 78 */:
                return commonCard.t();
            case 79:
                return commonCard.f69701D0;
            case 80:
                return Integer.valueOf(commonCard.f69703E0);
            case 81:
                return Integer.valueOf(commonCard.f69705F0);
            case 82:
                return Integer.valueOf(commonCard.f69707G0);
            case AdCardDto.DESC_LIST_FIELD_NUMBER /* 83 */:
                return commonCard.s();
            case AdCardDto.PRODUCT_SOURCE_FIELD_NUMBER /* 84 */:
                return commonCard.f69711I0;
            case AdCardDto.COUPON_DESC_FIELD_NUMBER /* 85 */:
                return commonCard.f69713J0;
            case AdCardDto.COUPON_PRICE_FIELD_NUMBER /* 86 */:
                return commonCard.f69715K0;
            case AdCardDto.VOLUME_DESC_FIELD_NUMBER /* 87 */:
                return commonCard.f69717L0;
            case AdCardDto.LABELS_FIELD_NUMBER /* 88 */:
                return commonCard.f69721N0;
            case AdCardDto.ITEM_SOURCE_FIELD_NUMBER /* 89 */:
                return commonCard.l();
            case AdCardDto.UNDERFRAME_ICON_TYPE_FIELD_NUMBER /* 90 */:
                return Boolean.valueOf(commonCard.f69725P0);
            case AdCardDto.AD_TAG_STYLE_FULL_SCREEN_FIELD_NUMBER /* 91 */:
                return commonCard.f69727Q0;
            case AdCardDto.BENEFIT_ICON_FIELD_NUMBER /* 92 */:
                return commonCard.g();
            case AdCardDto.RELATED_INTERACTION_STYLE_FIELD_NUMBER /* 93 */:
                return Integer.valueOf(commonCard.f69733T0);
            case AdCardDto.HAS_ANTI_SNIPING_PRICE_FIELD_NUMBER /* 94 */:
                return commonCard.f69735U0;
            case AdCardDto.ANTI_SNIPING_TEXT_FIELD_NUMBER /* 95 */:
                return commonCard.f69737V0;
            case 96:
                return commonCard.f69739W0;
            case 97:
                return commonCard.f69741X0;
            case 98:
                return commonCard.o();
            case 99:
                return commonCard.f69745Z0;
            case 100:
                return commonCard.f69748a1;
            case 101:
                return commonCard.f69751b1;
            default:
                return null;
        }
    }
}
