package com.bilibili.studio.videoeditor.help.mux;

import UC0.a;
import UC0.k;
import Y0.c;
import androidx.annotation.Keep;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/mux/MuxerImplHelper.class */
@Keep
public class MuxerImplHelper {
    private static final String TAG = "MuxerImplHelper";

    /* JADX WARN: Removed duplicated region for block: B:76:0x022d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int buildNativeAudioTrack(com.bilibili.studio.editor.timeline.UpperTimeline r9, P50.u r10, com.bilibili.studio.videoeditor.help.mux.MuxVideoTrack r11) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.help.mux.MuxerImplHelper.buildNativeAudioTrack(com.bilibili.studio.editor.timeline.UpperTimeline, P50.u, com.bilibili.studio.videoeditor.help.mux.MuxVideoTrack):int");
    }

    public static int buildStickerBgmTrack(UpperTimeline upperTimeline, List<BiliEditorStickerInfo> list) {
        if (list == null || upperTimeline == null) {
            return 8;
        }
        return !upperTimeline.buildStickerBgm(list) ? -1 : 0;
    }

    public static int buildTtsTrack(UpperTimeline upperTimeline, EditTtsInfo editTtsInfo, long j7) {
        a aVarAppendAudioTrack;
        if (editTtsInfo == null || upperTimeline == null || (aVarAppendAudioTrack = upperTimeline.appendAudioTrack("audio_track_type_tts")) == null || aVarAppendAudioTrack.q() == null) {
            return 8;
        }
        return !aVarAppendAudioTrack.k(j7, editTtsInfo) ? 26 : 0;
    }

    public static int buildVideoTrack(UpperTimeline upperTimeline, MuxVideoTrack muxVideoTrack, long j7) {
        if (muxVideoTrack == null) {
            return 24;
        }
        if (upperTimeline == null) {
            return 6;
        }
        k kVarAppendVideoTrack = upperTimeline.appendVideoTrack(muxVideoTrack.isUserTrack ? "video_track_main" : "video_track_other");
        if (kVarAppendVideoTrack == null) {
            return 12;
        }
        boolean zY = kVarAppendVideoTrack.y(muxVideoTrack.isUserTrack, muxVideoTrack.bClipList, j7, false);
        c.c("set clip to video track, buildOk: ", TAG, zY);
        if (!zY) {
            return 12;
        }
        kVarAppendVideoTrack.k();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int buildVideoTrackDecoration(P50.u r5, com.bilibili.studio.videoeditor.help.mux.MuxVideoTrack r6) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.help.mux.MuxerImplHelper.buildVideoTrackDecoration(P50.u, com.bilibili.studio.videoeditor.help.mux.MuxVideoTrack):int");
    }

    private static void setAudioClipVolume(a aVar, List<BClip> list) {
        for (int i7 = 0; i7 < ((ArrayList) aVar.n()).size(); i7++) {
            P50.c cVar = (P50.c) ((ArrayList) aVar.n()).get(i7);
            for (BClip bClip : list) {
                if (bClip.isVideo() && bClip.getInPoint() == cVar.getInPoint()) {
                    cVar.setVolumeGain(bClip.getClipVolume(), bClip.getClipVolume());
                }
            }
        }
    }

    private static void setAudioClipVolumeByTrack(a aVar, List<BClip> list, float f7) {
        for (int i7 = 0; i7 < ((ArrayList) aVar.n()).size(); i7++) {
            P50.c cVar = (P50.c) ((ArrayList) aVar.n()).get(i7);
            for (BClip bClip : list) {
                if (bClip.isVideo() && bClip.getInPoint() == cVar.getInPoint()) {
                    BLog.e(TAG, "setAudioClipVolumeByTrack trackVolume=" + f7);
                    cVar.setVolumeGain(f7, f7);
                }
            }
        }
    }
}
