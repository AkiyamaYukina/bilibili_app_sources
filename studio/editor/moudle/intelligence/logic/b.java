package com.bilibili.studio.editor.moudle.intelligence.logic;

import Vn.A;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceEnterResult;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/logic/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f107346a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f107347b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static JSONObject f107348c;

    @NotNull
    public static IntelligenceEnterResult a(@NotNull List list, boolean z6) {
        Iterator it = list.iterator();
        int i7 = 0;
        long duration = 0;
        int i8 = 0;
        while (it.hasNext()) {
            ImageItem imageItem = (ImageItem) it.next();
            if (imageItem.isImage()) {
                i7++;
            } else {
                i8++;
                duration = imageItem.getDuration() + duration;
            }
        }
        StringBuilder sbB = A.b(i7, i8, " imageCount=", ",videoCount=", ",videoDuration=");
        sbB.append(duration);
        BLog.e("IntelligenceEnterLogic", sbB.toString());
        IntelligenceEnterResult intelligenceEnterResult = new IntelligenceEnterResult();
        intelligenceEnterResult.imageCount = i7;
        intelligenceEnterResult.videoCount = i8;
        intelligenceEnterResult.videoDuration = duration;
        if (z6) {
            intelligenceEnterResult.isEnter = true;
        }
        return intelligenceEnterResult;
    }
}
