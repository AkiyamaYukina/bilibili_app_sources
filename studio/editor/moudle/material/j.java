package com.bilibili.studio.editor.moudle.material;

import J3.D;
import android.text.TextUtils;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/j.class */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy<j> f107898a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new D(7));

    public j() {
        new LinkedHashMap();
    }

    @NotNull
    public static String a(long j7, @NotNull String str) {
        return i5.d.a(j7, str, "_");
    }

    public static void b(@NotNull EditVideoInfo editVideoInfo) {
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList == null || userTrackBClipList.isEmpty()) {
            BLog.e("MediaMaterialManager", "bClip为空～请先初始化数据");
            return;
        }
        List<BClip> userTrackBClipList2 = editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList2 != null) {
            int i7 = 0;
            for (BClip bClip : userTrackBClipList2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j7 = i7;
                String str = bClip.materialId;
                if (str == null || str.length() == 0) {
                    bClip.materialId = a(jCurrentTimeMillis + j7, bClip.videoPath);
                }
                i7++;
            }
        }
    }

    public static void c(@Nullable List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            BLog.e("MediaMaterialManager", "bClip为空～请先初始化数据");
            return;
        }
        int i7 = 0;
        if (!TextUtils.isEmpty(((BClip) list.get(0)).materialId)) {
            BLog.e("MediaMaterialManager", "firstClip.materialId 不为空～不需要再初始化");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BClip bClip = (BClip) it.next();
            bClip.materialId = a(System.currentTimeMillis() + ((long) i7), bClip.videoPath);
            i7++;
        }
    }
}
