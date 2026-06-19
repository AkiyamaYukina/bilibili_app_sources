package com.bilibili.ogvcommon.play.resolver;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.play.vo.BangumiVipBarVo;
import com.bilibili.ogvcommon.play.vo.LimitDialogVo;
import com.bilibili.ogvcommon.play.vo.PlayerToastVo;
import com.bilibili.ogvcommon.play.vo.PopWinVo;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/ViewInfoExtraVo_JsonDescriptor.class */
public final class ViewInfoExtraVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73250a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("dialog", (String[]) null, LimitDialogVo.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("end_page", (String[]) null, EndPage.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("toast", (String[]) null, PlayerToastVo.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("pop_win", (String[]) null, PopWinVo.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("try_watch_prompt_bar", (String[]) null, BangumiVipBarVo.class, (Class) null, 4);
        Class cls = Boolean.TYPE;
        f73250a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, new PojoPropertyDescriptor("is_preview", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_drm", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_drm_ep", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("ext_dialog", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, LimitDialogVo.class}), (Class) null, 7), new PojoPropertyDescriptor("ext_toast", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, PlayerToastVo.class}), (Class) null, 7), new PojoPropertyDescriptor("watermark", (String[]) null, Watermark.class, (Class) null, 4), new PojoPropertyDescriptor("is_pre_live", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("episode_info", (String[]) null, EpisodeInfoVo.class, (Class) null, 4), new PojoPropertyDescriptor("user_status", (String[]) null, EpUserStatus.class, (Class) null, 5)};
    }

    public ViewInfoExtraVo_JsonDescriptor() {
        super(ViewInfoExtraVo.class, f73250a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        LimitDialogVo limitDialogVo = (LimitDialogVo) objArr[0];
        EndPage endPage = (EndPage) objArr[1];
        PlayerToastVo playerToastVo = (PlayerToastVo) objArr[2];
        PopWinVo popWinVo = (PopWinVo) objArr[3];
        BangumiVipBarVo bangumiVipBarVo = (BangumiVipBarVo) objArr[4];
        Boolean bool = (Boolean) objArr[5];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[6];
        boolean zBooleanValue3 = bool2 == null ? false : bool2.booleanValue();
        Boolean bool3 = (Boolean) objArr[7];
        boolean zBooleanValue4 = bool3 == null ? false : bool3.booleanValue();
        Object obj = objArr[8];
        char c7 = obj == null ? (char) 256 : (char) 0;
        Map map = (Map) obj;
        Object obj2 = objArr[9];
        int i7 = c7;
        if (obj2 == null) {
            i7 = c7 | 512;
        }
        Map mapEmptyMap = (Map) obj2;
        Watermark watermark = (Watermark) objArr[10];
        Boolean bool4 = (Boolean) objArr[11];
        if (bool4 != null) {
            zBooleanValue = bool4.booleanValue();
        }
        EpisodeInfoVo episodeInfoVo = (EpisodeInfoVo) objArr[12];
        EpUserStatus epUserStatus = (EpUserStatus) objArr[13];
        Map mapEmptyMap2 = map;
        if ((i7 & 256) != 0) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        if ((i7 & 512) != 0) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return new ViewInfoExtraVo(limitDialogVo, endPage, playerToastVo, popWinVo, bangumiVipBarVo, zBooleanValue2, zBooleanValue3, zBooleanValue4, mapEmptyMap2, mapEmptyMap, watermark, zBooleanValue, episodeInfoVo, epUserStatus);
    }

    public final Object get(Object obj, int i7) {
        ViewInfoExtraVo viewInfoExtraVo = (ViewInfoExtraVo) obj;
        switch (i7) {
            case 0:
                return viewInfoExtraVo.c();
            case 1:
                return viewInfoExtraVo.f73238b;
            case 2:
                return viewInfoExtraVo.f73239c;
            case 3:
                return viewInfoExtraVo.f73240d;
            case 4:
                return viewInfoExtraVo.d();
            case 5:
                return Boolean.valueOf(viewInfoExtraVo.f73242f);
            case 6:
                return Boolean.valueOf(viewInfoExtraVo.f73243g);
            case 7:
                return Boolean.valueOf(viewInfoExtraVo.h);
            case 8:
                return viewInfoExtraVo.a();
            case 9:
                return viewInfoExtraVo.b();
            case 10:
                return viewInfoExtraVo.f73246k;
            case 11:
                return Boolean.valueOf(viewInfoExtraVo.f73247l);
            case 12:
                return viewInfoExtraVo.f73248m;
            case 13:
                return viewInfoExtraVo.f73249n;
            default:
                return null;
        }
    }
}
