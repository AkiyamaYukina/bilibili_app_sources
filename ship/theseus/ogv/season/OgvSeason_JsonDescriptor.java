package com.bilibili.ship.theseus.ogv.season;

import androidx.core.app.NotificationCompat;
import com.alipay.blueshield.IDeviceColorModule;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.pub.season.a;
import com.bilibili.ship.theseus.ogv.intro.download.bean.OgvEpisodeReserve;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeason_JsonDescriptor.class */
public final class OgvSeason_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94500a;

    static {
        Class cls = Long.TYPE;
        f94500a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("season_type", (String[]) null, a.class, (Class) null, 5), new PojoPropertyDescriptor("show_season_type", (String[]) null, a.class, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, PayStatus.class, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("media_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("rights", (String[]) null, OgvSeasonRights.class, (Class) null, 5), new PojoPropertyDescriptor("user_status", (String[]) null, OgvSeason.UserStatus.class, (Class) null, 5), new PojoPropertyDescriptor("stat", (String[]) null, OgvSeasonStat.class, (Class) null, 5), new PojoPropertyDescriptor("season_name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("reserve", (String[]) null, OgvEpisodeReserve.class, (Class) null, 4), new PojoPropertyDescriptor("new_ep", (String[]) null, NewestEp.class, (Class) null, 4), new PojoPropertyDescriptor("ogv_switch", (String[]) null, TestSwitch.class, (Class) null, 5), new PojoPropertyDescriptor("publish", (String[]) null, Publish.class, (Class) null, 5), new PojoPropertyDescriptor(IDeviceColorModule.EDGE_MODE_KEY, (String[]) null, SeasonMode.class, (Class) null, 7), new PojoPropertyDescriptor("share_url", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("short_link", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("square_cover", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("horizontal_cover169", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("horizontal_cover1610", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("dynamic_subtitle", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("cache_auth_config", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, OgvSeason.CacheAuthConfig.class}), (Class) null, 5)};
    }

    public OgvSeason_JsonDescriptor() {
        super(OgvSeason.class, f94500a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        a aVar = (a) objArr[1];
        a aVar2 = (a) objArr[2];
        Object obj = objArr[3];
        if (obj == null) {
            i7 = 8;
        }
        PayStatus payStatus = (PayStatus) obj;
        String str = (String) objArr[4];
        Long l8 = (Long) objArr[5];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        OgvSeasonRights ogvSeasonRights = (OgvSeasonRights) objArr[6];
        OgvSeason.UserStatus userStatus = (OgvSeason.UserStatus) objArr[7];
        OgvSeasonStat ogvSeasonStat = (OgvSeasonStat) objArr[8];
        String str2 = (String) objArr[9];
        OgvEpisodeReserve ogvEpisodeReserve = (OgvEpisodeReserve) objArr[10];
        NewestEp newestEp = (NewestEp) objArr[11];
        TestSwitch testSwitch = (TestSwitch) objArr[12];
        Publish publish = (Publish) objArr[13];
        Object obj2 = objArr[14];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 16384;
        }
        return new OgvSeason(jLongValue, aVar, aVar2, payStatus, str, jLongValue2, ogvSeasonRights, userStatus, ogvSeasonStat, str2, ogvEpisodeReserve, newestEp, testSwitch, publish, (SeasonMode) obj2, (String) objArr[15], (String) objArr[16], (String) objArr[17], (String) objArr[18], (String) objArr[19], (String) objArr[20], (String) objArr[21], (Map) objArr[22], i8);
    }

    public final Object get(Object obj, int i7) {
        OgvSeason ogvSeason = (OgvSeason) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(ogvSeason.f94449a);
            case 1:
                return ogvSeason.f94450b;
            case 2:
                return ogvSeason.c();
            case 3:
                return ogvSeason.f94452d;
            case 4:
                return ogvSeason.f94453e;
            case 5:
                return Long.valueOf(ogvSeason.f94454f);
            case 6:
                return ogvSeason.f94455g;
            case 7:
                return ogvSeason.h;
            case 8:
                return ogvSeason.f94456i;
            case 9:
                return ogvSeason.f94457j;
            case 10:
                return ogvSeason.f94458k;
            case 11:
                return ogvSeason.a();
            case 12:
                return ogvSeason.b();
            case 13:
                return ogvSeason.f94461n;
            case 14:
                return ogvSeason.f94462o;
            case 15:
                return ogvSeason.f94463p;
            case 16:
                return ogvSeason.f94464q;
            case 17:
                return ogvSeason.f94465r;
            case 18:
                return ogvSeason.f94466s;
            case 19:
                return ogvSeason.f94467t;
            case 20:
                return ogvSeason.f94468u;
            case 21:
                return ogvSeason.f94469v;
            case 22:
                return ogvSeason.d();
            default:
                return null;
        }
    }
}
