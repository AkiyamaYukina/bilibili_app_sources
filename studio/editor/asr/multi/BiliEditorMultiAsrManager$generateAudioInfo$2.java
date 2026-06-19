package com.bilibili.studio.editor.asr.multi;

import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.videoeditor.bean.BMusic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/BiliEditorMultiAsrManager$generateAudioInfo$2.class */
public final /* synthetic */ class BiliEditorMultiAsrManager$generateAudioInfo$2 extends FunctionReferenceImpl implements Function1<BMusic, AudioInfo> {
    public BiliEditorMultiAsrManager$generateAudioInfo$2(Object obj) {
        super(1, obj, BiliEditorMultiAsrManager.class, "generateAudioInfoFromBMusic", "generateAudioInfoFromBMusic(Lcom/bilibili/studio/videoeditor/bean/BMusic;)Lcom/bilibili/studio/editor/asr/bean/AudioInfo;", 0);
    }

    public final AudioInfo invoke(BMusic bMusic) {
        AudioInfo audioInfo;
        String str;
        BiliEditorMultiAsrManager biliEditorMultiAsrManager = (BiliEditorMultiAsrManager) ((CallableReference) this).receiver;
        BiliEditorMultiAsrManager biliEditorMultiAsrManager2 = BiliEditorMultiAsrManager.f105608a;
        biliEditorMultiAsrManager.getClass();
        if (bMusic == null || (str = bMusic.localPath) == null) {
            audioInfo = null;
        } else {
            audioInfo = new AudioInfo(String.valueOf(bMusic.bgmSid), bMusic.totalTime, str, bMusic.trimIn, bMusic.trimOut, bMusic.inPoint, bMusic.outPoint, 1.0f, null, 2, false, null, null, null, 15616, null);
            BiliEditorMultiAsrManager.f105608a.getClass();
            audioInfo.setCacheKey(BiliEditorMultiAsrManager.a(audioInfo));
        }
        return audioInfo;
    }
}
