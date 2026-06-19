package com.bilibili.ogvcommon.play.resolver;

import com.bapis.bilibili.pgc.gateway.player.v2.ClipType;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/ViewInfoClipInfo_JsonDescriptor.class */
public final class ViewInfoClipInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73233a = {new PojoPropertyDescriptor("material_number", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("start", (String[]) null, Duration.class, DurationFromMillisTypeAdapter.class, 13), new PojoPropertyDescriptor("end", (String[]) null, Duration.class, DurationFromMillisTypeAdapter.class, 13), new PojoPropertyDescriptor("clip_type", (String[]) null, ClipType.class, (Class) null, 7), new PojoPropertyDescriptor("toast_text", (String[]) null, String.class, (Class) null, 6)};

    public ViewInfoClipInfo_JsonDescriptor() {
        super(ViewInfoClipInfo.class, f73233a);
    }

    public final Object constructWith(Object[] objArr) {
        char c7 = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        long j7 = ((Duration) objArr[1]).unbox-impl();
        long j8 = ((Duration) objArr[2]).unbox-impl();
        Object obj = objArr[3];
        if (obj == null) {
            c7 = '\b';
        }
        ClipType clipType = (ClipType) obj;
        Object obj2 = objArr[4];
        int i7 = c7;
        if (obj2 == null) {
            i7 = c7 | 16;
        }
        String str = (String) obj2;
        ClipType clipType2 = clipType;
        if ((i7 & 8) != 0) {
            clipType2 = ClipType.NT_UNKNOWN;
        }
        if ((i7 & 16) != 0) {
            str = null;
        }
        return new ViewInfoClipInfo(jLongValue, j7, j8, clipType2, str);
    }

    public final Object get(Object obj, int i7) {
        ViewInfoClipInfo viewInfoClipInfo = (ViewInfoClipInfo) obj;
        if (i7 == 0) {
            return Long.valueOf(viewInfoClipInfo.f73228a);
        }
        if (i7 == 1) {
            return Duration.box-impl(viewInfoClipInfo.f73229b);
        }
        if (i7 == 2) {
            return Duration.box-impl(viewInfoClipInfo.f73230c);
        }
        if (i7 == 3) {
            return viewInfoClipInfo.f73231d;
        }
        if (i7 != 4) {
            return null;
        }
        return viewInfoClipInfo.f73232e;
    }
}
