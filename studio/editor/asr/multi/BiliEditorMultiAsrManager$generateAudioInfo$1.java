package com.bilibili.studio.editor.asr.multi;

import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/BiliEditorMultiAsrManager$generateAudioInfo$1.class */
public final /* synthetic */ class BiliEditorMultiAsrManager$generateAudioInfo$1 extends FunctionReferenceImpl implements Function1<RecordInfo, AudioInfo> {
    public BiliEditorMultiAsrManager$generateAudioInfo$1(Object obj) {
        super(1, obj, BiliEditorMultiAsrManager.class, "generateAudioInfoFromAudio", "generateAudioInfoFromAudio(Lcom/bilibili/studio/videoeditor/ms/record/RecordInfo;)Lcom/bilibili/studio/editor/asr/bean/AudioInfo;", 0);
    }

    public final AudioInfo invoke(RecordInfo recordInfo) {
        BiliEditorMultiAsrManager biliEditorMultiAsrManager = (BiliEditorMultiAsrManager) ((CallableReference) this).receiver;
        BiliEditorMultiAsrManager biliEditorMultiAsrManager2 = BiliEditorMultiAsrManager.f105608a;
        biliEditorMultiAsrManager.getClass();
        AudioInfo audioInfo = new AudioInfo(String.valueOf(recordInfo.getId()), recordInfo.capTimeDuration, recordInfo.getPath(), recordInfo.getTrimIn(), recordInfo.getTrimOut(), recordInfo.inPoint, recordInfo.outPoint, (float) recordInfo.speed, null, 1, false, null, null, null, 15616, null);
        BiliEditorMultiAsrManager.f105608a.getClass();
        audioInfo.setCacheKey(BiliEditorMultiAsrManager.a(audioInfo));
        recordInfo.asrCacheKey = audioInfo.getCacheKey();
        return audioInfo;
    }
}
