package com.bilibili.ogv.opbase;

import com.bapis.bilibili.pgc.gateway.player.v2.InlineScene;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineType;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/VideoInfo_JsonDescriptor.class */
public final class VideoInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69962a = {new PojoPropertyDescriptor("total_duration", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_DURATION, (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13), new PojoPropertyDescriptor("auto_seek", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("inline_scene", (String[]) null, InlineScene.class, (Class) null, 7), new PojoPropertyDescriptor("inline_type", (String[]) null, InlineType.class, (Class) null, 7), new PojoPropertyDescriptor("clip_info", (String[]) null, ClipInfo.class, (Class) null, 4)};

    public VideoInfo_JsonDescriptor() {
        super(VideoInfo.class, f69962a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        long j7 = ((Duration) objArr[0]).unbox-impl();
        long j8 = ((Duration) objArr[1]).unbox-impl();
        Integer num = (Integer) objArr[2];
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj = objArr[3];
        if (obj == null) {
            i7 = 8;
        }
        InlineScene inlineScene = (InlineScene) obj;
        Object obj2 = objArr[4];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 16;
        }
        return new VideoInfo(j7, j8, iIntValue, inlineScene, (InlineType) obj2, (ClipInfo) objArr[5], i8);
    }

    public final Object get(Object obj, int i7) {
        VideoInfo videoInfo = (VideoInfo) obj;
        if (i7 == 0) {
            return Duration.box-impl(videoInfo.f69956a);
        }
        if (i7 == 1) {
            return Duration.box-impl(videoInfo.f69957b);
        }
        if (i7 == 2) {
            return Integer.valueOf(videoInfo.f69958c);
        }
        if (i7 == 3) {
            return videoInfo.f69959d;
        }
        if (i7 == 4) {
            return videoInfo.f69960e;
        }
        if (i7 != 5) {
            return null;
        }
        return videoInfo.f69961f;
    }
}
