package com.bilibili.playerbizcommonv2.abtest;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/abtest/AbtestBatchResult_JsonDescriptor.class */
public final class AbtestBatchResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f80808a = {new PojoPropertyDescriptor("reply_down_style", (String[]) null, IntExpData.class, (Class) null, 4), new PojoPropertyDescriptor("play_long_press_speed", (String[]) null, IntExpData.class, (Class) null, 4), new PojoPropertyDescriptor("video_bg_play_listen", (String[]) null, StringExpData.class, (Class) null, 4), new PojoPropertyDescriptor("story_video_bg_play_listen", (String[]) null, StringExpData.class, (Class) null, 4), new PojoPropertyDescriptor("play_comment_fav_icon_display", (String[]) null, IntExpData.class, (Class) null, 4), new PojoPropertyDescriptor("peak_progress_pm", (String[]) null, IntExpData.class, (Class) null, 4)};

    public AbtestBatchResult_JsonDescriptor() {
        super(AbtestBatchResult.class, f80808a);
    }

    public final Object constructWith(Object[] objArr) {
        return new AbtestBatchResult((IntExpData) objArr[0], (IntExpData) objArr[1], (StringExpData) objArr[2], (StringExpData) objArr[3], (IntExpData) objArr[4], (IntExpData) objArr[5]);
    }

    public final Object get(Object obj, int i7) {
        AbtestBatchResult abtestBatchResult = (AbtestBatchResult) obj;
        if (i7 == 0) {
            return abtestBatchResult.f();
        }
        if (i7 == 1) {
            return abtestBatchResult.b();
        }
        if (i7 == 2) {
            return abtestBatchResult.a();
        }
        if (i7 == 3) {
            return abtestBatchResult.e();
        }
        if (i7 == 4) {
            return abtestBatchResult.c();
        }
        if (i7 != 5) {
            return null;
        }
        return abtestBatchResult.d();
    }
}
