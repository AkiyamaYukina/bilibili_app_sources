package com.bilibili.ship.theseus.playlist.api;

import Ou0.c;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/MultiTypeMedia_JsonDescriptor.class */
public final class MultiTypeMedia_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95253a;

    static {
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("attr", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("bv_id", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("cnt_info", (String[]) null, SocializeInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("coin", (String[]) null, CoinExtra.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("copy_right", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 7);
        Class cls2 = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor7 = new PojoPropertyDescriptor(EditCustomizeSticker.TAG_DURATION, (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor8 = new PojoPropertyDescriptor("fav_state", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor9 = new PojoPropertyDescriptor("id", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor10 = new PojoPropertyDescriptor("index", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor11 = new PojoPropertyDescriptor("intro", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor12 = new PojoPropertyDescriptor("like_state", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor13 = new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor14 = new PojoPropertyDescriptor("offset", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor15 = new PojoPropertyDescriptor(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor16 = new PojoPropertyDescriptor("pages", (String[]) null, Types.parameterizedType(List.class, new Type[]{Page.class}), (Class) null, 23);
        PojoPropertyDescriptor pojoPropertyDescriptor17 = new PojoPropertyDescriptor("pubtime", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor18 = new PojoPropertyDescriptor("rights", (String[]) null, Rights.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor19 = new PojoPropertyDescriptor("short_link", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor20 = new PojoPropertyDescriptor("tid", (String[]) null, cls2, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor21 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor22 = new PojoPropertyDescriptor("type", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor23 = new PojoPropertyDescriptor("upper", (String[]) null, Upper.class, (Class) null, 6);
        Class cls3 = Boolean.TYPE;
        f95253a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, pojoPropertyDescriptor7, pojoPropertyDescriptor8, pojoPropertyDescriptor9, pojoPropertyDescriptor10, pojoPropertyDescriptor11, pojoPropertyDescriptor12, pojoPropertyDescriptor13, pojoPropertyDescriptor14, pojoPropertyDescriptor15, pojoPropertyDescriptor16, pojoPropertyDescriptor17, pojoPropertyDescriptor18, pojoPropertyDescriptor19, pojoPropertyDescriptor20, pojoPropertyDescriptor21, pojoPropertyDescriptor22, pojoPropertyDescriptor23, new PojoPropertyDescriptor("expanded", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("selected", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("playing_episode_index", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("ogv_info", (String[]) null, OgvInfo.class, (Class) null, 6), new PojoPropertyDescriptor("pugv_info", (String[]) null, PugvInfo.class, (Class) null, 6), new PojoPropertyDescriptor("forbid_fav", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("progress_percent", (String[]) null, Double.TYPE, (Class) null, 7), new PojoPropertyDescriptor("badge", (String[]) null, Badge.class, (Class) null, 6), new PojoPropertyDescriptor("display_media_size", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("is_from_download", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("is_charge_video", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("show_trans", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("is_translated", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("translated_title", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("translate_panel_state", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("episodes", (String[]) null, Types.parameterizedType(List.class, new Type[]{c.class}), (Class) null, 23), new PojoPropertyDescriptor("local_index", (String[]) null, cls, (Class) null, 7)};
    }

    public MultiTypeMedia_JsonDescriptor() {
        super(MultiTypeMedia.class, f95253a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        SocializeInfo socializeInfo = (SocializeInfo) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        CoinExtra coinExtra = (CoinExtra) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Integer num2 = (Integer) obj5;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        String str2 = (String) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Long l7 = (Long) obj7;
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        Integer num3 = (Integer) obj8;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        Long l8 = (Long) obj9;
        long jLongValue3 = l8 == null ? 0L : l8.longValue();
        Object obj10 = objArr[9];
        int i16 = i15;
        if (obj10 == null) {
            i16 = i15 | 512;
        }
        Integer num4 = (Integer) obj10;
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        Object obj11 = objArr[10];
        int i17 = i16;
        if (obj11 == null) {
            i17 = i16 | 1024;
        }
        String str3 = (String) obj11;
        Object obj12 = objArr[11];
        int i18 = i17;
        if (obj12 == null) {
            i18 = i17 | 2048;
        }
        Integer num5 = (Integer) obj12;
        int iIntValue5 = num5 == null ? 0 : num5.intValue();
        Object obj13 = objArr[12];
        int i19 = i18;
        if (obj13 == null) {
            i19 = i18 | 4096;
        }
        String str4 = (String) obj13;
        Object obj14 = objArr[13];
        int i20 = i19;
        if (obj14 == null) {
            i20 = i19 | 8192;
        }
        Long l9 = (Long) obj14;
        long jLongValue4 = l9 == null ? 0L : l9.longValue();
        Object obj15 = objArr[14];
        int i21 = i20;
        if (obj15 == null) {
            i21 = i20 | 16384;
        }
        Integer num6 = (Integer) obj15;
        int iIntValue6 = num6 == null ? 0 : num6.intValue();
        Object obj16 = objArr[15];
        int i22 = i21;
        if (obj16 == null) {
            i22 = i21 | 32768;
        }
        List list = (List) obj16;
        Object obj17 = objArr[16];
        int i23 = i22;
        if (obj17 == null) {
            i23 = i22 | 65536;
        }
        Long l10 = (Long) obj17;
        long jLongValue5 = l10 == null ? 0L : l10.longValue();
        Object obj18 = objArr[17];
        int i24 = i23;
        if (obj18 == null) {
            i24 = i23 | 131072;
        }
        Rights rights = (Rights) obj18;
        Object obj19 = objArr[18];
        int i25 = i24;
        if (obj19 == null) {
            i25 = i24 | 262144;
        }
        String str5 = (String) obj19;
        Object obj20 = objArr[19];
        int i26 = i25;
        if (obj20 == null) {
            i26 = i25 | AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
        }
        Long l11 = (Long) obj20;
        if (l11 != null) {
            jLongValue = l11.longValue();
        }
        Object obj21 = objArr[20];
        int i27 = i26;
        if (obj21 == null) {
            i27 = i26 | AccessibilityNodeInfoCompat.ACTION_DISMISS;
        }
        String str6 = (String) obj21;
        Object obj22 = objArr[21];
        int i28 = i27;
        if (obj22 == null) {
            i28 = i27 | AccessibilityNodeInfoCompat.ACTION_SET_TEXT;
        }
        Integer num7 = (Integer) obj22;
        int iIntValue7 = num7 == null ? 0 : num7.intValue();
        Object obj23 = objArr[22];
        int i29 = i28;
        if (obj23 == null) {
            i29 = i28 | 4194304;
        }
        Upper upper = (Upper) obj23;
        Object obj24 = objArr[23];
        int i30 = i29;
        if (obj24 == null) {
            i30 = i29 | GravityCompat.RELATIVE_LAYOUT_DIRECTION;
        }
        Boolean bool = (Boolean) obj24;
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Object obj25 = objArr[24];
        int i31 = i30;
        if (obj25 == null) {
            i31 = i30 | 16777216;
        }
        Boolean bool2 = (Boolean) obj25;
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Object obj26 = objArr[25];
        int i32 = i31;
        if (obj26 == null) {
            i32 = i31 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D;
        }
        Integer num8 = (Integer) obj26;
        int iIntValue8 = num8 == null ? 0 : num8.intValue();
        Object obj27 = objArr[26];
        int i33 = i32;
        if (obj27 == null) {
            i33 = i32 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT;
        }
        OgvInfo ogvInfo = (OgvInfo) obj27;
        Object obj28 = objArr[27];
        int i34 = i33;
        if (obj28 == null) {
            i34 = i33 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT;
        }
        PugvInfo pugvInfo = (PugvInfo) obj28;
        Object obj29 = objArr[28];
        int i35 = i34;
        if (obj29 == null) {
            i35 = i34 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE;
        }
        Boolean bool3 = (Boolean) obj29;
        boolean zBooleanValue3 = bool3 == null ? false : bool3.booleanValue();
        Object obj30 = objArr[29];
        int i36 = i35;
        if (obj30 == null) {
            i36 = i35 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER;
        }
        Double d7 = (Double) obj30;
        double dDoubleValue = d7 == null ? 0.0d : d7.doubleValue();
        Object obj31 = objArr[30];
        int i37 = i36;
        if (obj31 == null) {
            i37 = i36 | BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE;
        }
        Badge badge = (Badge) obj31;
        Object obj32 = objArr[31];
        int i38 = i37;
        if (obj32 == null) {
            i38 = i37 | Integer.MIN_VALUE;
        }
        String str7 = (String) obj32;
        Object obj33 = objArr[32];
        int i39 = obj33 == null ? 1 : 0;
        Boolean bool4 = (Boolean) obj33;
        boolean zBooleanValue4 = bool4 == null ? false : bool4.booleanValue();
        Object obj34 = objArr[33];
        int i40 = i39;
        if (obj34 == null) {
            i40 = i39 | 2;
        }
        Boolean bool5 = (Boolean) obj34;
        boolean zBooleanValue5 = bool5 == null ? false : bool5.booleanValue();
        Object obj35 = objArr[34];
        int i41 = i40;
        if (obj35 == null) {
            i41 = i40 | 4;
        }
        Boolean bool6 = (Boolean) obj35;
        boolean zBooleanValue6 = bool6 == null ? false : bool6.booleanValue();
        Object obj36 = objArr[35];
        int i42 = i41;
        if (obj36 == null) {
            i42 = i41 | 8;
        }
        Boolean bool7 = (Boolean) obj36;
        boolean zBooleanValue7 = bool7 == null ? false : bool7.booleanValue();
        Object obj37 = objArr[36];
        int i43 = i42;
        if (obj37 == null) {
            i43 = i42 | 16;
        }
        String str8 = (String) obj37;
        Object obj38 = objArr[37];
        int i44 = i43;
        if (obj38 == null) {
            i44 = i43 | 32;
        }
        Integer num9 = (Integer) obj38;
        int iIntValue9 = num9 == null ? 0 : num9.intValue();
        Object obj39 = objArr[38];
        int i45 = i44;
        if (obj39 == null) {
            i45 = i44 | 64;
        }
        List list2 = (List) obj39;
        Object obj40 = objArr[39];
        int i46 = i45;
        if (obj40 == null) {
            i46 = i45 | 128;
        }
        Integer num10 = (Integer) obj40;
        return new MultiTypeMedia(iIntValue, str, socializeInfo, coinExtra, iIntValue2, str2, jLongValue2, iIntValue3, jLongValue3, iIntValue4, str3, iIntValue5, str4, jLongValue4, iIntValue6, list, jLongValue5, rights, str5, jLongValue, str6, iIntValue7, upper, zBooleanValue, zBooleanValue2, iIntValue8, ogvInfo, pugvInfo, zBooleanValue3, dDoubleValue, badge, str7, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, str8, iIntValue9, list2, num10 == null ? 0 : num10.intValue(), i38, i46);
    }

    public final Object get(Object obj, int i7) {
        MultiTypeMedia multiTypeMedia = (MultiTypeMedia) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(multiTypeMedia.f95228a);
            case 1:
                return multiTypeMedia.f();
            case 2:
                return multiTypeMedia.o();
            case 3:
                return multiTypeMedia.f95231d;
            case 4:
                return Integer.valueOf(multiTypeMedia.g());
            case 5:
                return multiTypeMedia.f95233f;
            case 6:
                return Long.valueOf(multiTypeMedia.f95234g);
            case 7:
                return Integer.valueOf(multiTypeMedia.h);
            case 8:
                return Long.valueOf(multiTypeMedia.f95235i);
            case 9:
                return Integer.valueOf(multiTypeMedia.f95236j);
            case 10:
                return multiTypeMedia.f95237k;
            case 11:
                return Integer.valueOf(multiTypeMedia.f95238l);
            case 12:
                return multiTypeMedia.f95239m;
            case 13:
                return Long.valueOf(multiTypeMedia.f95240n);
            case 14:
                return Integer.valueOf(multiTypeMedia.p());
            case 15:
                return multiTypeMedia.f95242p;
            case 16:
                return Long.valueOf(multiTypeMedia.f95243q);
            case 17:
                return multiTypeMedia.f95244r;
            case 18:
                return multiTypeMedia.f95245s;
            case 19:
                return Long.valueOf(multiTypeMedia.f95246t);
            case 20:
                return multiTypeMedia.f95247u;
            case 21:
                return Integer.valueOf(multiTypeMedia.f95248v);
            case 22:
                return multiTypeMedia.f95249w;
            case 23:
                return Boolean.valueOf(multiTypeMedia.f95250x);
            case 24:
                return Boolean.valueOf(multiTypeMedia.f95251y);
            case 25:
                return Integer.valueOf(multiTypeMedia.f95252z);
            case 26:
                return multiTypeMedia.i();
            case 27:
                return multiTypeMedia.l();
            case 28:
                return Boolean.valueOf(multiTypeMedia.h());
            case 29:
                return Double.valueOf(multiTypeMedia.k());
            case 30:
                return multiTypeMedia.e();
            case 31:
                return multiTypeMedia.f95218F;
            case 32:
                return Boolean.valueOf(multiTypeMedia.f95219G);
            case 33:
                return Boolean.valueOf(multiTypeMedia.f95220H);
            case 34:
                return Boolean.valueOf(multiTypeMedia.n());
            case 35:
                return Boolean.valueOf(multiTypeMedia.f95222J);
            case 36:
                return multiTypeMedia.f95223K;
            case 37:
                return Integer.valueOf(multiTypeMedia.f95224L);
            case 38:
                return multiTypeMedia.f95225M;
            case 39:
                return Integer.valueOf(multiTypeMedia.f95226N);
            default:
                return null;
        }
    }
}
