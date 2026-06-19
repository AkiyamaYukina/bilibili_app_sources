package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/PlaylistInfo_JsonDescriptor.class */
public final class PlaylistInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95285a;

    static {
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("attr", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("cnt_info", (String[]) null, SocializeInfo.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("bv_id", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("cover_type", (String[]) null, cls, (Class) null, 7);
        Class cls2 = Long.TYPE;
        f95285a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("ctime", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("fav_state", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("functions", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("page_type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("id", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("intro", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("like_state", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("media_count", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("upper", (String[]) null, Upper.class, (Class) null, 6), new PojoPropertyDescriptor("fav_btn", (String[]) null, FavoriteButtonStr.class, (Class) null, 6)};
    }

    public PlaylistInfo_JsonDescriptor() {
        super(PlaylistInfo.class, f95285a);
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
        SocializeInfo socializeInfo = (SocializeInfo) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Integer num2 = (Integer) obj4;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Long l7 = (Long) obj5;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        Integer num3 = (Integer) obj6;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Integer num4 = (Integer) obj7;
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        Integer num5 = (Integer) obj8;
        int iIntValue5 = num5 == null ? 0 : num5.intValue();
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        Long l8 = (Long) obj9;
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj10 = objArr[9];
        int i16 = i15;
        if (obj10 == null) {
            i16 = i15 | 512;
        }
        String str2 = (String) obj10;
        Object obj11 = objArr[10];
        int i17 = i16;
        if (obj11 == null) {
            i17 = i16 | 1024;
        }
        Integer num6 = (Integer) obj11;
        int iIntValue6 = num6 == null ? 0 : num6.intValue();
        Object obj12 = objArr[11];
        int i18 = i17;
        if (obj12 == null) {
            i18 = i17 | 2048;
        }
        Integer num7 = (Integer) obj12;
        int iIntValue7 = num7 == null ? 0 : num7.intValue();
        Object obj13 = objArr[12];
        int i19 = i18;
        if (obj13 == null) {
            i19 = i18 | 4096;
        }
        Long l9 = (Long) obj13;
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Object obj14 = objArr[13];
        int i20 = i19;
        if (obj14 == null) {
            i20 = i19 | 8192;
        }
        String str3 = (String) obj14;
        Object obj15 = objArr[14];
        int i21 = i20;
        if (obj15 == null) {
            i21 = i20 | 16384;
        }
        Integer num8 = (Integer) obj15;
        int iIntValue8 = num8 == null ? 0 : num8.intValue();
        Object obj16 = objArr[15];
        int i22 = i21;
        if (obj16 == null) {
            i22 = i21 | 32768;
        }
        Upper upper = (Upper) obj16;
        Object obj17 = objArr[16];
        int i23 = i22;
        if (obj17 == null) {
            i23 = i22 | 65536;
        }
        return new PlaylistInfo(iIntValue, socializeInfo, str, iIntValue2, jLongValue, iIntValue3, iIntValue4, iIntValue5, jLongValue2, str2, iIntValue6, iIntValue7, jLongValue3, str3, iIntValue8, upper, (FavoriteButtonStr) obj17, i23);
    }

    public final Object get(Object obj, int i7) {
        PlaylistInfo playlistInfo = (PlaylistInfo) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(playlistInfo.f95269a);
            case 1:
                return playlistInfo.f();
            case 2:
                return playlistInfo.d();
            case 3:
                return Integer.valueOf(playlistInfo.f95272d);
            case 4:
                return Long.valueOf(playlistInfo.f95273e);
            case 5:
                return Integer.valueOf(playlistInfo.f95274f);
            case 6:
                return Integer.valueOf(playlistInfo.f95275g);
            case 7:
                return Integer.valueOf(playlistInfo.h);
            case 8:
                return Long.valueOf(playlistInfo.f95276i);
            case 9:
                return playlistInfo.f95277j;
            case 10:
                return Integer.valueOf(playlistInfo.f95278k);
            case 11:
                return Integer.valueOf(playlistInfo.f95279l);
            case 12:
                return Long.valueOf(playlistInfo.f95280m);
            case 13:
                return playlistInfo.f95281n;
            case 14:
                return Integer.valueOf(playlistInfo.f95282o);
            case 15:
                return playlistInfo.f95283p;
            case 16:
                return playlistInfo.e();
            default:
                return null;
        }
    }
}
