package com.bilibili.ship.theseus.united.bean;

import com.bapis.bilibili.pgc.gateway.player.v2.InlineScene;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineType;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/OgvClipParams_JsonDescriptor.class */
public final class OgvClipParams_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f98733a = {new PojoPropertyDescriptor("offset_start_time", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13), new PojoPropertyDescriptor("offset_end_time", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13), new PojoPropertyDescriptor("total_duration", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13), new PojoPropertyDescriptor("inline_scene", (String[]) null, InlineScene.class, (Class) null, 7), new PojoPropertyDescriptor("inline_video_type", (String[]) null, InlineType.class, (Class) null, 7), new PojoPropertyDescriptor("clip_id", (String[]) null, Long.TYPE, (Class) null, 5)};

    public OgvClipParams_JsonDescriptor() {
        super(OgvClipParams.class, f98733a);
    }

    public final Object constructWith(Object[] objArr) {
        char c7 = 0;
        long j7 = ((Duration) objArr[0]).unbox-impl();
        long j8 = ((Duration) objArr[1]).unbox-impl();
        long j9 = ((Duration) objArr[2]).unbox-impl();
        Object obj = objArr[3];
        if (obj == null) {
            c7 = '\b';
        }
        InlineScene inlineScene = (InlineScene) obj;
        Object obj2 = objArr[4];
        int i7 = c7;
        if (obj2 == null) {
            i7 = c7 | 16;
        }
        InlineType inlineType = (InlineType) obj2;
        Long l7 = (Long) objArr[5];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        InlineScene inlineScene2 = inlineScene;
        if ((i7 & 8) != 0) {
            inlineScene2 = InlineScene.UNKNOWN;
        }
        if ((i7 & 16) != 0) {
            inlineType = InlineType.TYPE_WHOLE;
        }
        return new OgvClipParams(j7, j8, j9, inlineScene2, inlineType, jLongValue);
    }

    public final Object get(Object obj, int i7) {
        OgvClipParams ogvClipParams = (OgvClipParams) obj;
        if (i7 == 0) {
            return Duration.box-impl(ogvClipParams.f98727a);
        }
        if (i7 == 1) {
            return Duration.box-impl(ogvClipParams.f98728b);
        }
        if (i7 == 2) {
            return Duration.box-impl(ogvClipParams.f98729c);
        }
        if (i7 == 3) {
            return ogvClipParams.f98730d;
        }
        if (i7 == 4) {
            return ogvClipParams.f98731e;
        }
        if (i7 != 5) {
            return null;
        }
        return Long.valueOf(ogvClipParams.f98732f);
    }
}
