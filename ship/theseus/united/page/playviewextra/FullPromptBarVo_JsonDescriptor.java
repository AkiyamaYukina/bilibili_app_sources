package com.bilibili.ship.theseus.united.page.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/FullPromptBarVo_JsonDescriptor.class */
public final class FullPromptBarVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102388a = {new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 4), new PojoPropertyDescriptor("subtitle", (String[]) null, TextVo.class, (Class) null, 4), new PojoPropertyDescriptor("timer_countdown", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13), new PojoPropertyDescriptor("countdown_enable", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("buttons", (String[]) null, Types.parameterizedType(List.class, new Type[]{TextVo.class}), (Class) null, 21), new PojoPropertyDescriptor("fold_data_vo", (String[]) null, FoldDataVo.class, (Class) null, 4), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 4), new PojoPropertyDescriptor("bg_image", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bar_height", (String[]) null, Integer.TYPE, (Class) null, 5)};

    public FullPromptBarVo_JsonDescriptor() {
        super(FullPromptBarVo.class, f102388a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        TextVo textVo = (TextVo) objArr[1];
        TextVo textVo2 = (TextVo) objArr[2];
        long j7 = ((Duration) objArr[3]).unbox-impl();
        Boolean bool = (Boolean) objArr[4];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        List list = (List) objArr[5];
        FoldDataVo foldDataVo = (FoldDataVo) objArr[6];
        ReportVo reportVo = (ReportVo) objArr[7];
        String str2 = (String) objArr[8];
        Integer num = (Integer) objArr[9];
        return new FullPromptBarVo(str, textVo, textVo2, j7, zBooleanValue, list, foldDataVo, reportVo, str2, num == null ? 0 : num.intValue());
    }

    public final Object get(Object obj, int i7) {
        FullPromptBarVo fullPromptBarVo = (FullPromptBarVo) obj;
        switch (i7) {
            case 0:
                return fullPromptBarVo.f102379a;
            case 1:
                return fullPromptBarVo.f102380b;
            case 2:
                return fullPromptBarVo.f102381c;
            case 3:
                return Duration.box-impl(fullPromptBarVo.f102382d);
            case 4:
                return Boolean.valueOf(fullPromptBarVo.f102383e);
            case 5:
                return fullPromptBarVo.f102384f;
            case 6:
                return fullPromptBarVo.f102385g;
            case 7:
                return fullPromptBarVo.h;
            case 8:
                return fullPromptBarVo.f102386i;
            case 9:
                return Integer.valueOf(fullPromptBarVo.f102387j);
            default:
                return null;
        }
    }
}
