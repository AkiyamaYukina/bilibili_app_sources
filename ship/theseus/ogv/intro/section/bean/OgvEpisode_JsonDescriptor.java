package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import com.bilibili.ship.theseus.ogv.season.PayStatus;
import com.bilibili.ship.theseus.united.bean.VideoDimension;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.Staff;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/OgvEpisode_JsonDescriptor.class */
public final class OgvEpisode_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93580a;

    static {
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("ep_id", (String[]) null, cls, (Class) null, 5);
        Class cls2 = Integer.TYPE;
        f93580a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("ep_index", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("section_index", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("badge_info", (String[]) null, OgvBadgeInfo.class, (Class) null, 4), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, PayStatus.class, (Class) null, 7), new PojoPropertyDescriptor("aid", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("from", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("long_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("release_date", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("share_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("short_link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("share_copy", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("toast_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("subtitle", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("show_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("section_type", (String[]) null, SectionType.class, (Class) null, 7), new PojoPropertyDescriptor("up_infos", (String[]) null, Types.parameterizedType(List.class, new Type[]{Staff.class}), (Class) null, 21), new PojoPropertyDescriptor("up_info", (String[]) null, Staff.class, (Class) null, 4), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bvid", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("pv", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("rights", (String[]) null, EpisodeRights.class, (Class) null, 4), new PojoPropertyDescriptor("interaction", (String[]) null, EpisodeInteraction.class, (Class) null, 4), new PojoPropertyDescriptor("stat_for_unity", (String[]) null, EpisodeStat.class, (Class) null, 5), new PojoPropertyDescriptor("dimension", (String[]) null, VideoDimension.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 4), new PojoPropertyDescriptor("pub_time", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_DURATION, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("bottom_right_badge", (String[]) null, String.class, (Class) null, 5)};
    }

    public OgvEpisode_JsonDescriptor() {
        super(OgvEpisode.class, f93580a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj = objArr[1];
        int i7 = obj == null ? 2 : 0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj2 = objArr[2];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 4;
        }
        Integer num2 = (Integer) obj2;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        OgvBadgeInfo ogvBadgeInfo = (OgvBadgeInfo) objArr[3];
        Object obj3 = objArr[4];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 16;
        }
        PayStatus payStatus = (PayStatus) obj3;
        Long l8 = (Long) objArr[5];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Long l9 = (Long) objArr[6];
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        String str = (String) objArr[7];
        String str2 = (String) objArr[8];
        String str3 = (String) objArr[9];
        String str4 = (String) objArr[10];
        String str5 = (String) objArr[11];
        String str6 = (String) objArr[12];
        String str7 = (String) objArr[13];
        String str8 = (String) objArr[14];
        String str9 = (String) objArr[15];
        String str10 = (String) objArr[16];
        String str11 = (String) objArr[17];
        Object obj4 = objArr[18];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 262144;
        }
        SectionType sectionType = (SectionType) obj4;
        List list = (List) objArr[19];
        Staff staff = (Staff) objArr[20];
        String str12 = (String) objArr[21];
        String str13 = (String) objArr[22];
        Boolean bool = (Boolean) objArr[23];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        EpisodeRights episodeRights = (EpisodeRights) objArr[24];
        EpisodeInteraction episodeInteraction = (EpisodeInteraction) objArr[25];
        EpisodeStat episodeStat = (EpisodeStat) objArr[26];
        VideoDimension videoDimension = (VideoDimension) objArr[27];
        Map map = (Map) objArr[28];
        Long l10 = (Long) objArr[29];
        long jLongValue4 = l10 == null ? 0L : l10.longValue();
        Long l11 = (Long) objArr[30];
        return new OgvEpisode(jLongValue, iIntValue, iIntValue2, ogvBadgeInfo, payStatus, jLongValue2, jLongValue3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, sectionType, list, staff, str12, str13, zBooleanValue, episodeRights, episodeInteraction, episodeStat, videoDimension, map, jLongValue4, l11 == null ? 0L : l11.longValue(), (String) objArr[31], i10);
    }

    public final Object get(Object obj, int i7) {
        OgvEpisode ogvEpisode = (OgvEpisode) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(ogvEpisode.f93555a);
            case 1:
                return Integer.valueOf(ogvEpisode.f93556b);
            case 2:
                return Integer.valueOf(ogvEpisode.f93557c);
            case 3:
                return ogvEpisode.f93558d;
            case 4:
                return ogvEpisode.f93559e;
            case 5:
                return Long.valueOf(ogvEpisode.a());
            case 6:
                return Long.valueOf(ogvEpisode.f93561g);
            case 7:
                return ogvEpisode.h;
            case 8:
                return ogvEpisode.f93562i;
            case 9:
                return ogvEpisode.f93563j;
            case 10:
                return ogvEpisode.f93564k;
            case 11:
                return ogvEpisode.f93565l;
            case 12:
                return ogvEpisode.f93566m;
            case 13:
                return ogvEpisode.f93567n;
            case 14:
                return ogvEpisode.f93568o;
            case 15:
                return ogvEpisode.f93569p;
            case 16:
                return ogvEpisode.f93570q;
            case 17:
                return ogvEpisode.f93571r;
            case 18:
                return ogvEpisode.f93572s;
            case 19:
                return ogvEpisode.g();
            case 20:
                return ogvEpisode.d();
            case 21:
                return ogvEpisode.f93575v;
            case 22:
                return ogvEpisode.f93576w;
            case 23:
                return Boolean.valueOf(ogvEpisode.i());
            case 24:
                return ogvEpisode.e();
            case 25:
                return ogvEpisode.f93579z;
            case 26:
                return ogvEpisode.f();
            case 27:
                return ogvEpisode.f93546B;
            case 28:
                return ogvEpisode.f93547C;
            case 29:
                return Long.valueOf(ogvEpisode.f93548D);
            case 30:
                return Long.valueOf(ogvEpisode.c());
            case 31:
                return ogvEpisode.b();
            default:
                return null;
        }
    }
}
