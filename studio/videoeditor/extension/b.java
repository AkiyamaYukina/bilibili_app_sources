package com.bilibili.studio.videoeditor.extension;

import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmPointEntry;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/b.class */
public final class b {
    public static final void a(@Nullable BgmMissionInfo bgmMissionInfo, @Nullable Bgm bgm) {
        ArrayList<BgmPointEntry> arrayList;
        if (bgmMissionInfo == null || bgm == null) {
            return;
        }
        ArrayList<BgmMissionInfo.TimelineBean> arrayList2 = bgmMissionInfo.timeline;
        if (arrayList2 != null) {
            ArrayList<BgmPointEntry> arrayList3 = new ArrayList<>();
            Iterator<T> it = arrayList2.iterator();
            while (true) {
                arrayList = arrayList3;
                if (!it.hasNext()) {
                    break;
                }
                BgmMissionInfo.TimelineBean timelineBean = (BgmMissionInfo.TimelineBean) it.next();
                BgmPointEntry bgmPointEntry = new BgmPointEntry();
                bgmPointEntry.point = timelineBean.point;
                String str = timelineBean.comment;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                bgmPointEntry.comment = str2;
                bgmPointEntry.recommend = (int) timelineBean.recommend;
                arrayList3.add(bgmPointEntry);
            }
        } else {
            arrayList = null;
        }
        bgm.timeline = arrayList;
    }
}
