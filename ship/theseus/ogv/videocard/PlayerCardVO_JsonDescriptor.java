package com.bilibili.ship.theseus.ogv.videocard;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/PlayerCardVO_JsonDescriptor.class */
public final class PlayerCardVO_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94702a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("unique_id", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("win_id", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("img_url", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("from", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13);
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("to", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13);
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor7 = new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor8 = new PojoPropertyDescriptor("card_type", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor9 = new PojoPropertyDescriptor("jump_url", (String[]) null, String.class, (Class) null, 5);
        Class cls2 = Boolean.TYPE;
        f94702a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, pojoPropertyDescriptor7, pojoPropertyDescriptor8, pojoPropertyDescriptor9, new PojoPropertyDescriptor("show_selected", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("selected_button", (String[]) null, PlayerCardButtonVO.class, (Class) null, 4), new PojoPropertyDescriptor("unselected_button", (String[]) null, PlayerCardButtonVO.class, (Class) null, 4), new PojoPropertyDescriptor("need_login", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1), new PojoPropertyDescriptor("unselected_disappear_time", (String[]) null, Duration.class, DurationFromMillisTypeAdapter.class, 15), new PojoPropertyDescriptor("unselected_show_time", (String[]) null, Duration.class, DurationFromMillisTypeAdapter.class, 15), new PojoPropertyDescriptor("business_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("season_id", (String[]) null, Long.class, (Class) null, 4), new PojoPropertyDescriptor("ep_id", (String[]) null, Long.class, (Class) null, 4), new PojoPropertyDescriptor("activity_id", (String[]) null, Long.class, (Class) null, 4), new PojoPropertyDescriptor("is_support_cancel", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("related_act_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("unselectedSubText", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("follow_danmu", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("has_close_button", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("is_always_display", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("imgStyle", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("specifiedSeasonId", (String[]) null, Long.TYPE, (Class) null, 1), new PojoPropertyDescriptor("customizeTag", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("order_report_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("frame_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 15), new PojoPropertyDescriptor("title_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 15)};
    }

    public PlayerCardVO_JsonDescriptor() {
        super(PlayerCardVO.class, f94702a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        long j7 = ((Duration) objArr[4]).unbox-impl();
        long j8 = ((Duration) objArr[5]).unbox-impl();
        Integer num = (Integer) objArr[6];
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[7];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        String str5 = (String) objArr[8];
        Boolean bool = (Boolean) objArr[9];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        PlayerCardButtonVO playerCardButtonVO = (PlayerCardButtonVO) objArr[10];
        PlayerCardButtonVO playerCardButtonVO2 = (PlayerCardButtonVO) objArr[11];
        Object obj = objArr[12];
        if (obj == null) {
            i7 = 4096;
        }
        Boolean bool2 = (Boolean) obj;
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Map map = (Map) objArr[13];
        Object obj2 = objArr[14];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 16384;
        }
        Duration duration = (Duration) obj2;
        long j9 = duration != null ? duration.unbox-impl() : 0L;
        Object obj3 = objArr[15];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 32768;
        }
        Duration duration2 = (Duration) obj3;
        long j10 = duration2 != null ? duration2.unbox-impl() : 0L;
        Integer num3 = (Integer) objArr[16];
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Long l7 = (Long) objArr[17];
        Long l8 = (Long) objArr[18];
        Long l9 = (Long) objArr[19];
        Boolean bool3 = (Boolean) objArr[20];
        boolean zBooleanValue3 = bool3 == null ? false : bool3.booleanValue();
        Integer num4 = (Integer) objArr[21];
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        String str6 = (String) objArr[22];
        Boolean bool4 = (Boolean) objArr[23];
        boolean zBooleanValue4 = bool4 == null ? false : bool4.booleanValue();
        Boolean bool5 = (Boolean) objArr[24];
        boolean zBooleanValue5 = bool5 == null ? false : bool5.booleanValue();
        Boolean bool6 = (Boolean) objArr[25];
        boolean zBooleanValue6 = bool6 == null ? false : bool6.booleanValue();
        Integer num5 = (Integer) objArr[26];
        int iIntValue5 = num5 == null ? 0 : num5.intValue();
        Long l10 = (Long) objArr[27];
        long jLongValue = l10 == null ? 0L : l10.longValue();
        String str7 = (String) objArr[28];
        Object obj4 = objArr[29];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER;
        }
        Map map2 = (Map) obj4;
        Object obj5 = objArr[30];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE;
        }
        Integer num6 = (Integer) obj5;
        int iIntValue6 = num6 == null ? 0 : num6.intValue();
        Object obj6 = objArr[31];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | Integer.MIN_VALUE;
        }
        Integer num7 = (Integer) obj6;
        return new PlayerCardVO(str, str2, str3, str4, j7, j8, iIntValue, iIntValue2, str5, zBooleanValue, playerCardButtonVO, playerCardButtonVO2, zBooleanValue2, map, j9, j10, iIntValue3, l7, l8, l9, zBooleanValue3, iIntValue4, str6, zBooleanValue4, zBooleanValue5, zBooleanValue6, iIntValue5, jLongValue, str7, map2, iIntValue6, num7 == null ? 0 : num7.intValue(), i12);
    }

    public final Object get(Object obj, int i7) {
        PlayerCardVO playerCardVO = (PlayerCardVO) obj;
        switch (i7) {
            case 0:
                return playerCardVO.m();
            case 1:
                return playerCardVO.B();
            case 2:
                return playerCardVO.z();
            case 3:
                return playerCardVO.n();
            case 4:
                return Duration.box-impl(playerCardVO.l());
            case 5:
                return Duration.box-impl(playerCardVO.i());
            case 6:
                return Integer.valueOf(playerCardVO.v());
            case 7:
                return Integer.valueOf(playerCardVO.f());
            case 8:
                return playerCardVO.o();
            case 9:
                return Boolean.valueOf(playerCardVO.u());
            case 10:
                return playerCardVO.s();
            case 11:
                return playerCardVO.A();
            case 12:
                return Boolean.valueOf(playerCardVO.p());
            case 13:
                return playerCardVO.f94689n;
            case 14:
                return Duration.box-impl(playerCardVO.h());
            case 15:
                return Duration.box-impl(playerCardVO.g());
            case 16:
                return Integer.valueOf(playerCardVO.e());
            case 17:
                return playerCardVO.r();
            case 18:
                return playerCardVO.j();
            case 19:
                return playerCardVO.b();
            case 20:
                return Boolean.valueOf(playerCardVO.x());
            case 21:
                return Integer.valueOf(playerCardVO.a());
            case 22:
                return playerCardVO.w();
            case 23:
                return Boolean.valueOf(playerCardVO.k());
            case 24:
                return Boolean.valueOf(playerCardVO.t());
            case 25:
                return Boolean.valueOf(playerCardVO.c());
            case 26:
                return Integer.valueOf(playerCardVO.f94671A);
            case 27:
                return Long.valueOf(playerCardVO.f94672B);
            case 28:
                return playerCardVO.f94673C;
            case 29:
                return playerCardVO.q();
            case 30:
                return Integer.valueOf(playerCardVO.d());
            case 31:
                return Integer.valueOf(playerCardVO.y());
            default:
                return null;
        }
    }
}
