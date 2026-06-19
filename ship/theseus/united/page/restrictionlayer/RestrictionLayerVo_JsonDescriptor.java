package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo_JsonDescriptor.class */
public final class RestrictionLayerVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102696a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("style_type", (String[]) null, RestrictionLayerVo.Style.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("backgroundInfo", (String[]) null, BackgroundVo.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 0);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("sub_title", (String[]) null, TextVo.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("image", (String[]) null, ImageVo.class, (Class) null, 0);
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("buttons", (String[]) null, Types.parameterizedType(List.class, new Type[]{TextVo.class}), (Class) null, 17);
        PojoPropertyDescriptor pojoPropertyDescriptor7 = new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 0);
        PojoPropertyDescriptor pojoPropertyDescriptor8 = new PojoPropertyDescriptor("bottom_display", (String[]) null, Types.parameterizedType(List.class, new Type[]{RestrictionLayerVo.BottomDisplayVo.class}), (Class) null, 21);
        Class cls = Boolean.TYPE;
        f102696a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, pojoPropertyDescriptor7, pojoPropertyDescriptor8, new PojoPropertyDescriptor("is_hide_more_btn", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("ext_data", (String[]) null, RestrictionLayerVo.Extra.class, (Class) null, 4), new PojoPropertyDescriptor("hide_button_on_half", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("deliver_win_id", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("conditions", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1), new PojoPropertyDescriptor("nextPlayable", (String[]) null, RestrictionLayerVo.NextPlayableVo.class, (Class) null, 2), new PojoPropertyDescriptor("countdown", (String[]) null, Duration.class, (Class) null, 3)};
    }

    public RestrictionLayerVo_JsonDescriptor() {
        super(RestrictionLayerVo.class, f102696a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        RestrictionLayerVo.Style style = (RestrictionLayerVo.Style) objArr[0];
        BackgroundVo backgroundVo = (BackgroundVo) objArr[1];
        TextVo textVo = (TextVo) objArr[2];
        TextVo textVo2 = (TextVo) objArr[3];
        ImageVo imageVo = (ImageVo) objArr[4];
        List list = (List) objArr[5];
        ReportVo reportVo = (ReportVo) objArr[6];
        List list2 = (List) objArr[7];
        Boolean bool = (Boolean) objArr[8];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        RestrictionLayerVo.Extra extra = (RestrictionLayerVo.Extra) objArr[9];
        Boolean bool2 = (Boolean) objArr[10];
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        String str = (String) objArr[11];
        Map map = (Map) objArr[12];
        Object obj = objArr[13];
        if (obj == null) {
            i7 = 8192;
        }
        RestrictionLayerVo.NextPlayableVo nextPlayableVo = (RestrictionLayerVo.NextPlayableVo) obj;
        Object obj2 = objArr[14];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 16384;
        }
        Duration duration = (Duration) obj2;
        return new RestrictionLayerVo(style, backgroundVo, textVo, textVo2, imageVo, list, reportVo, list2, zBooleanValue, extra, zBooleanValue2, str, map, nextPlayableVo, duration != null ? duration.unbox-impl() : 0L, i8);
    }

    public final Object get(Object obj, int i7) {
        boolean zG;
        RestrictionLayerVo restrictionLayerVo = (RestrictionLayerVo) obj;
        switch (i7) {
            case 0:
                return restrictionLayerVo.h();
            case 1:
                return restrictionLayerVo.b();
            case 2:
                return restrictionLayerVo.f102669c;
            case 3:
                return restrictionLayerVo.i();
            case 4:
                return restrictionLayerVo.f102671e;
            case 5:
                return restrictionLayerVo.f102672f;
            case 6:
                return restrictionLayerVo.f102673g;
            case 7:
                return restrictionLayerVo.c();
            case 8:
                zG = restrictionLayerVo.g();
                break;
            case 9:
                return restrictionLayerVo.f();
            case 10:
                zG = restrictionLayerVo.d();
                break;
            case 11:
                return restrictionLayerVo.e();
            case 12:
                return restrictionLayerVo.f102678m;
            case 13:
                return restrictionLayerVo.f102679n;
            case 14:
                return Duration.box-impl(restrictionLayerVo.f102680o);
            default:
                return null;
        }
        return Boolean.valueOf(zG);
    }
}
