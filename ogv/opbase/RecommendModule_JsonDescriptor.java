package com.bilibili.ogv.opbase;

import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ogv.opbase.RecommendModule;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule_JsonDescriptor.class */
public final class RecommendModule_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69933a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("style", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("wid", (String[]) null, Types.parameterizedType(List.class, new Type[]{Long.class}), (Class) null, 23);
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor7 = new PojoPropertyDescriptor("icon_night", (String[]) null, String.class, (Class) null, 6);
        Class cls = Integer.TYPE;
        f69933a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, pojoPropertyDescriptor7, new PojoPropertyDescriptor(TextSource.CFG_SIZE, (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("attr", (String[]) null, ModuleAttr.class, (Class) null, 7), new PojoPropertyDescriptor("headers", (String[]) null, Types.parameterizedType(List.class, new Type[]{ModuleHeader.class}), (Class) null, 23), new PojoPropertyDescriptor("headers_type", (String[]) null, RecommendModule.OGVHeaderType.class, (Class) null, 7), new PojoPropertyDescriptor("items", (String[]) null, Types.parameterizedType(List.class, new Type[]{CommonCard.class}), (Class) null, 23), new PojoPropertyDescriptor("follow", (String[]) null, FollowInModule.class, (Class) null, 6), new PojoPropertyDescriptor("skin", (String[]) null, RecommendModule.Skin.class, (Class) null, 6), new PojoPropertyDescriptor("type", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("jump_module_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("module_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 6), new PojoPropertyDescriptor("version", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("color_control", (String[]) null, OGVRankThemeType.class, (Class) null, 7), new PojoPropertyDescriptor("topic_info", (String[]) null, RecommendModule.Topic.class, (Class) null, 6), new PojoPropertyDescriptor("set_id", (String[]) null, Long.TYPE, (Class) null, 7), new PojoPropertyDescriptor("subscribe_status", (String[]) null, RecommendModule.OGVCinemaSubscribeType.class, (Class) null, 7), new PojoPropertyDescriptor("multi_style", (String[]) null, RecommendModule.OGVMultiCardType.class, (Class) null, 6), new PojoPropertyDescriptor("first_module_title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("collection_button_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("feed_module_title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("bg_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("intervenes", (String[]) null, Types.parameterizedType(List.class, new Type[]{Intervene.class}), (Class) null, 23), new PojoPropertyDescriptor("exp", (String[]) null, Exp.class, (Class) null, 7)};
    }

    public RecommendModule_JsonDescriptor() {
        super(RecommendModule.class, f69933a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str2 = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str3 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        String str4 = (String) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        List list = (List) obj5;
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        String str5 = (String) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        String str6 = (String) obj7;
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        Integer num = (Integer) obj8;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        ModuleAttr moduleAttr = (ModuleAttr) obj9;
        Object obj10 = objArr[9];
        int i16 = i15;
        if (obj10 == null) {
            i16 = i15 | 512;
        }
        List list2 = (List) obj10;
        Object obj11 = objArr[10];
        int i17 = i16;
        if (obj11 == null) {
            i17 = i16 | 1024;
        }
        RecommendModule.OGVHeaderType oGVHeaderType = (RecommendModule.OGVHeaderType) obj11;
        Object obj12 = objArr[11];
        int i18 = i17;
        if (obj12 == null) {
            i18 = i17 | 2048;
        }
        List list3 = (List) obj12;
        Object obj13 = objArr[12];
        int i19 = i18;
        if (obj13 == null) {
            i19 = i18 | 4096;
        }
        FollowInModule followInModule = (FollowInModule) obj13;
        Object obj14 = objArr[13];
        int i20 = i19;
        if (obj14 == null) {
            i20 = i19 | 8192;
        }
        RecommendModule.Skin skin = (RecommendModule.Skin) obj14;
        Object obj15 = objArr[14];
        int i21 = i20;
        if (obj15 == null) {
            i21 = i20 | 16384;
        }
        String str7 = (String) obj15;
        Object obj16 = objArr[15];
        int i22 = i21;
        if (obj16 == null) {
            i22 = i21 | 32768;
        }
        Integer num2 = (Integer) obj16;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj17 = objArr[16];
        int i23 = i22;
        if (obj17 == null) {
            i23 = i22 | 65536;
        }
        String str8 = (String) obj17;
        Object obj18 = objArr[17];
        int i24 = i23;
        if (obj18 == null) {
            i24 = i23 | 131072;
        }
        String str9 = (String) obj18;
        Object obj19 = objArr[18];
        int i25 = i24;
        if (obj19 == null) {
            i25 = i24 | 262144;
        }
        String str10 = (String) obj19;
        Object obj20 = objArr[19];
        int i26 = i25;
        if (obj20 == null) {
            i26 = i25 | AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
        }
        Map map = (Map) obj20;
        Object obj21 = objArr[20];
        int i27 = i26;
        if (obj21 == null) {
            i27 = i26 | AccessibilityNodeInfoCompat.ACTION_DISMISS;
        }
        Integer num3 = (Integer) obj21;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Object obj22 = objArr[21];
        int i28 = i27;
        if (obj22 == null) {
            i28 = i27 | AccessibilityNodeInfoCompat.ACTION_SET_TEXT;
        }
        OGVRankThemeType oGVRankThemeType = (OGVRankThemeType) obj22;
        Object obj23 = objArr[22];
        int i29 = i28;
        if (obj23 == null) {
            i29 = i28 | 4194304;
        }
        RecommendModule.Topic topic = (RecommendModule.Topic) obj23;
        Object obj24 = objArr[23];
        int i30 = i29;
        if (obj24 == null) {
            i30 = i29 | GravityCompat.RELATIVE_LAYOUT_DIRECTION;
        }
        Long l7 = (Long) obj24;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj25 = objArr[24];
        int i31 = i30;
        if (obj25 == null) {
            i31 = i30 | 16777216;
        }
        RecommendModule.OGVCinemaSubscribeType oGVCinemaSubscribeType = (RecommendModule.OGVCinemaSubscribeType) obj25;
        Object obj26 = objArr[25];
        int i32 = i31;
        if (obj26 == null) {
            i32 = i31 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D;
        }
        RecommendModule.OGVMultiCardType oGVMultiCardType = (RecommendModule.OGVMultiCardType) obj26;
        Object obj27 = objArr[26];
        int i33 = i32;
        if (obj27 == null) {
            i33 = i32 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT;
        }
        String str11 = (String) obj27;
        Object obj28 = objArr[27];
        int i34 = i33;
        if (obj28 == null) {
            i34 = i33 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT;
        }
        String str12 = (String) obj28;
        Object obj29 = objArr[28];
        int i35 = i34;
        if (obj29 == null) {
            i35 = i34 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE;
        }
        String str13 = (String) obj29;
        Object obj30 = objArr[29];
        int i36 = i35;
        if (obj30 == null) {
            i36 = i35 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER;
        }
        Integer num4 = (Integer) obj30;
        Object obj31 = objArr[30];
        int i37 = i36;
        if (obj31 == null) {
            i37 = i36 | BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE;
        }
        String str14 = (String) obj31;
        Object obj32 = objArr[31];
        int i38 = i37;
        if (obj32 == null) {
            i38 = i37 | Integer.MIN_VALUE;
        }
        List list4 = (List) obj32;
        Object obj33 = objArr[32];
        return new RecommendModule(str, str2, str3, str4, list, str5, str6, iIntValue, moduleAttr, list2, oGVHeaderType, list3, followInModule, skin, str7, iIntValue2, str8, str9, str10, map, iIntValue3, oGVRankThemeType, topic, jLongValue, oGVCinemaSubscribeType, oGVMultiCardType, str11, str12, str13, num4, str14, list4, (Exp) obj33, i38, obj33 == null ? 1 : 0);
    }

    public final Object get(Object obj, int i7) {
        int iA;
        RecommendModule recommendModule = (RecommendModule) obj;
        switch (i7) {
            case 0:
                return recommendModule.f69900a;
            case 1:
                return recommendModule.d();
            case 2:
                return recommendModule.f69902c;
            case 3:
                return recommendModule.f69903d;
            case 4:
                return recommendModule.g();
            case 5:
                return recommendModule.f69905f;
            case 6:
                return recommendModule.f69906g;
            case 7:
                iA = recommendModule.a();
                break;
            case 8:
                return recommendModule.f69907i;
            case 9:
                return recommendModule.f69908j;
            case 10:
                return recommendModule.f69909k;
            case 11:
                return recommendModule.b();
            case 12:
                return recommendModule.f69911m;
            case 13:
                return recommendModule.f69912n;
            case 14:
                return recommendModule.f69913o;
            case 15:
                iA = recommendModule.c();
                break;
            case 16:
                return recommendModule.f69915q;
            case 17:
                return recommendModule.f69916r;
            case 18:
                return recommendModule.f69917s;
            case 19:
                return recommendModule.f69918t;
            case 20:
                return Integer.valueOf(recommendModule.f69919u);
            case 21:
                return recommendModule.e();
            case 22:
                return recommendModule.f();
            case 23:
                return Long.valueOf(recommendModule.f69922x);
            case 24:
                return recommendModule.f69923y;
            case 25:
                return recommendModule.f69924z;
            case 26:
                return recommendModule.f69891A;
            case 27:
                return recommendModule.f69892B;
            case 28:
                return recommendModule.f69893C;
            case 29:
                return recommendModule.f69894D;
            case 30:
                return recommendModule.f69895E;
            case 31:
                return recommendModule.f69896F;
            case 32:
                return recommendModule.f69897G;
            default:
                return null;
        }
        return Integer.valueOf(iA);
    }
}
