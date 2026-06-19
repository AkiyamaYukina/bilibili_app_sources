package com.bilibili.studio.editor.moudle.intelligence.frame;

import androidx.annotation.WorkerThread;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import rz0.k;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/e.class */
public final class e {
    @JvmStatic
    @WorkerThread
    @NotNull
    public static final List a(@NotNull k kVar, @NotNull List list) {
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new FrameUtils$getMultipleFramesSync$1(list, obj, kVar, arrayList, null), 3, (Object) null);
        synchronized (obj) {
            try {
                BLog.d("FrameUtils", "FRAME_TASK, getMultipleFrames, to wait.");
                obj.wait(PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE);
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
            Unit unit = Unit.INSTANCE;
        }
        BLog.d("FrameUtils", "FRAME_TASK, getMultipleFrames, return.");
        return arrayList;
    }
}
