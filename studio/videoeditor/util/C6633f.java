package com.bilibili.studio.videoeditor.util;

import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/f.class */
@JvmName(name = "BizFromUtil")
public final class C6633f {
    public static final int a(@Nullable EditVideoInfo editVideoInfo) {
        int iIntValue = 0;
        if (editVideoInfo == null) {
            return 0;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList == null) {
            EditVideoInfoUtils.throwDebugException("BizFromUtil.getBizFrom bClips == null");
        }
        if (userTrackBClipList != null) {
            Iterator<T> it = userTrackBClipList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Integer.valueOf(((BClip) it.next()).getBizFrom()));
            }
        }
        if (linkedHashSet.contains(1) && linkedHashSet.contains(2)) {
            iIntValue = 12;
        } else if (linkedHashSet.contains(3) && linkedHashSet.contains(4)) {
            iIntValue = 34;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (((Number) obj).intValue() != 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                iIntValue = ((Number) CollectionsKt.first(arrayList)).intValue();
            }
        }
        return iIntValue;
    }
}
