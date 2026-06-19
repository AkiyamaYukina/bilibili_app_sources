package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeSection_JsonDescriptor.class */
public final class EpisodeSection_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93535a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("more", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("more_left", (String[]) null, MoreLeft.class, (Class) null, 5), new PojoPropertyDescriptor("more_bottom_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("section_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("can_ord_desc", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("split_text", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("episodes", (String[]) null, Types.parameterizedType(List.class, new Type[]{OgvEpisode.class}), (Class) null, 21), new PojoPropertyDescriptor("episode_ids", (String[]) null, Types.parameterizedType(List.class, new Type[]{Long.class}), (Class) null, 21), new PojoPropertyDescriptor("type", (String[]) null, SectionType.class, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 4), new PojoPropertyDescriptor("module_style", (String[]) null, SectionStyle.class, (Class) null, 5), new PojoPropertyDescriptor("bg_info", (String[]) null, EpBgInfo.class, (Class) null, 4)};

    public EpisodeSection_JsonDescriptor() {
        super(EpisodeSection.class, f93535a);
    }

    public final Object constructWith(Object[] objArr) {
        char c7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        MoreLeft moreLeft = (MoreLeft) objArr[2];
        String str3 = (String) objArr[3];
        Long l7 = (Long) objArr[4];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Boolean bool = (Boolean) objArr[5];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        String str4 = (String) objArr[6];
        List list = (List) objArr[7];
        List list2 = (List) objArr[8];
        Object obj = objArr[9];
        if (obj == null) {
            c7 = 512;
        }
        SectionType sectionType = (SectionType) obj;
        Map map = (Map) objArr[10];
        SectionStyle sectionStyle = (SectionStyle) objArr[11];
        EpBgInfo epBgInfo = (EpBgInfo) objArr[12];
        SectionType sectionType2 = sectionType;
        if ((c7 & 512) != 0) {
            sectionType2 = SectionType.FEATURE;
        }
        return new EpisodeSection(str, str2, moreLeft, str3, jLongValue, zBooleanValue, str4, list, list2, sectionType2, map, sectionStyle, epBgInfo);
    }

    public final Object get(Object obj, int i7) {
        EpisodeSection episodeSection = (EpisodeSection) obj;
        switch (i7) {
            case 0:
                return episodeSection.f93523a;
            case 1:
                return episodeSection.f93524b;
            case 2:
                return episodeSection.b();
            case 3:
                return episodeSection.f93526d;
            case 4:
                return Long.valueOf(episodeSection.f93527e);
            case 5:
                return Boolean.valueOf(episodeSection.d());
            case 6:
                return episodeSection.a();
            case 7:
                return episodeSection.h;
            case 8:
                return episodeSection.c();
            case 9:
                return episodeSection.f93531j;
            case 10:
                return episodeSection.f93532k;
            case 11:
                return episodeSection.e();
            case 12:
                return episodeSection.f93534m;
            default:
                return null;
        }
    }
}
