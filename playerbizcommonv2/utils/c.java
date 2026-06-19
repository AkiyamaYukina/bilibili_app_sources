package com.bilibili.playerbizcommonv2.utils;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/c.class */
public final class c {
    public static Object a(Context context, Bitmap bitmap, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new Compose2ImageUtilKt$saveBitmapToCacheDir$2(context, "cheese_attendance_shared.png", bitmap, 90, null), continuation);
    }
}
