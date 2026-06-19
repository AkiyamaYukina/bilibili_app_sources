package com.bilibili.studio.editor.asr.multi;

import Iw0.a;
import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.videoeditor.bean.BClip;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/BiliEditorMultiAsrManager$generateAudioInfo$4.class */
public final /* synthetic */ class BiliEditorMultiAsrManager$generateAudioInfo$4 extends FunctionReferenceImpl implements Function1<BClip, AudioInfo> {
    public BiliEditorMultiAsrManager$generateAudioInfo$4(Object obj) {
        super(1, obj, BiliEditorMultiAsrManager.class, "generateAudioInfoFromClip", "generateAudioInfoFromClip(Lcom/bilibili/studio/videoeditor/bean/BClip;)Lcom/bilibili/studio/editor/asr/bean/AudioInfo;", 0);
    }

    public final AudioInfo invoke(BClip bClip) {
        BiliEditorMultiAsrManager biliEditorMultiAsrManager = (BiliEditorMultiAsrManager) ((CallableReference) this).receiver;
        BiliEditorMultiAsrManager biliEditorMultiAsrManager2 = BiliEditorMultiAsrManager.f105608a;
        biliEditorMultiAsrManager.getClass();
        long duration = bClip.getDuration(false);
        String strB = a.C0057a.b(bClip.getTrimIn(), bClip.getTrimOut(), bClip.videoPath);
        String str = bClip.id;
        String str2 = strB;
        if (strB == null) {
            str2 = "";
        }
        AudioInfo audioInfo = new AudioInfo(str, duration, str2, bClip.getTrimIn(), bClip.getTrimOut(), bClip.getInPoint(), bClip.getOutPoint(), bClip.playRate, null, 0, false, bClip.videoPath, null, null, 13568, null);
        BiliEditorMultiAsrManager.f105608a.getClass();
        audioInfo.setCacheKey(BiliEditorMultiAsrManager.a(audioInfo));
        bClip.asrCacheKey = audioInfo.getCacheKey();
        return audioInfo;
    }
}
