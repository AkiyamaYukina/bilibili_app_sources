package com.bilibili.studio.upper.service;

import com.bapis.bilibili.broadcast.message.archive.VideoDataReply;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/service/b.class */
public final class b implements MossResponseHandler<VideoDataReply> {
    public final void onError(MossException mossException) {
        BLog.e("UpperArchiveWatcher", "onError " + mossException);
    }

    public final void onNext(Object obj) {
        VideoDataReply videoDataReply = (VideoDataReply) obj;
        BLog.e("UpperArchiveWatcher", "onNext value=" + videoDataReply);
        if (videoDataReply != null) {
            Iterator it = ((ArrayList) UpperArchiveMossWatcher.f108684b).iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(videoDataReply);
            }
            Map<Long, d> map = UpperArchiveMossWatcher.f108683a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((Number) entry.getKey()).longValue() == videoDataReply.getType()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                d dVar = (d) ((Map.Entry) it2.next()).getValue();
                dVar.b(videoDataReply);
                UpperArchiveMossWatcher.a(dVar);
            }
        }
    }
}
