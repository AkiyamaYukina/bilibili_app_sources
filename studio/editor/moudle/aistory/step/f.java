package com.bilibili.studio.editor.moudle.aistory.step;

import L50.a;
import R50.r;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryTtsBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import com.bilibili.studio.videoeditor.util.P;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/f.class */
public class f extends d {
    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    public final void d(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
        List<AIStoryTtsBean> ttsPathList = aIStoryBean.getTtsPathList();
        CaptionInfo captionInfo = aIStoryBean.getCaptionInfo();
        List<AIStoryTtsBean> list = ttsPathList;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Size originSize = editVideoInfo.getOriginSize();
        Size sizeD = originSize;
        if (originSize == null) {
            sizeD = P.d(editVideoInfo.getVideoList());
        }
        CaptionInfo captionInfo2 = captionInfo;
        if (captionInfo == null) {
            captionInfo2 = new CaptionInfo();
            captionInfo2.font = "";
            captionInfo2.fontSize = Math.min(sizeD.getWidth(), sizeD.getHeight()) * 0.07777777f;
            captionInfo2.txtMax = 60;
            CaptionAssetBean captionAssetBean = new CaptionAssetBean();
            captionInfo2.captionAssetBean = captionAssetBean;
            OC0.h.a(captionAssetBean);
        }
        int size = list.size();
        int i7 = 0;
        long j7 = 0;
        long trimOut = 0;
        while (i7 < size) {
            AIStoryTtsBean aIStoryTtsBean = ttsPathList.get(i7);
            CaptionInfo captionInfoMo9886clone = captionInfo2.mo9886clone();
            captionInfoMo9886clone.id = System.currentTimeMillis() + ((long) arrayList.size());
            captionInfoMo9886clone.text = aIStoryTtsBean.getSentence();
            captionInfoMo9886clone.textOrigin = aIStoryTtsBean.getSentence();
            long duration = aIStoryTtsBean.getDuration();
            long j8 = 30000;
            long j9 = duration - j8;
            captionInfoMo9886clone.tempDuration = j9;
            captionInfoMo9886clone.inPoint = j7;
            captionInfoMo9886clone.outPoint = j7 + j9;
            long j10 = j7 + j9 + j8;
            d.c(captionInfoMo9886clone, editVideoInfo.getUserTrackBClipList());
            arrayList.add(captionInfoMo9886clone);
            int size2 = arrayList2.size();
            String filePath = aIStoryTtsBean.getFilePath();
            R50.a aVarS = null;
            r rVarU = a.a.a.a != null ? r.u() : null;
            if (rVarU != null) {
                aVarS = rVarU.s(filePath);
            }
            long audioStreamDuration = aVarS != null ? aVarS.a.getAudioStreamDuration(0) : 0L;
            long duration2 = (aIStoryTtsBean.getDuration() + trimOut) - 1;
            if (duration2 <= audioStreamDuration) {
                audioStreamDuration = duration2;
            }
            EditTtsInfo editTtsInfo = new EditTtsInfo();
            editTtsInfo.setClipId(System.currentTimeMillis() + ((long) size2));
            editTtsInfo.setTtsFilePath(aIStoryTtsBean.getFilePath());
            editTtsInfo.setTtsVolume(1.0f);
            editTtsInfo.setTrimIn(trimOut);
            editTtsInfo.setTrimOut(audioStreamDuration);
            editTtsInfo.setDuration(audioStreamDuration - trimOut);
            editTtsInfo.setCaptionId(captionInfoMo9886clone.id);
            editTtsInfo.setInPoint(captionInfoMo9886clone.inPoint);
            editTtsInfo.setOutPoint(captionInfoMo9886clone.outPoint);
            Long voiceId = aIStoryBean.getVoiceId();
            editTtsInfo.setTtsId(voiceId != null ? voiceId.longValue() : 0L);
            Long voiceId2 = aIStoryBean.getVoiceId();
            editTtsInfo.setAiStoryTtsId(voiceId2 != null ? voiceId2.longValue() : 0L);
            String voiceName = aIStoryBean.getVoiceName();
            String str = voiceName;
            if (voiceName == null) {
                str = "tianmei";
            }
            editTtsInfo.setTtsVoice(str);
            String ttsName = aIStoryBean.getTtsName();
            String str2 = ttsName;
            if (ttsName == null) {
                str2 = "";
            }
            editTtsInfo.setTtsName(str2);
            Integer speedRate = aIStoryBean.getSpeedRate();
            editTtsInfo.setSpeedRate(speedRate != null ? speedRate.intValue() : 0);
            String ttsVoiceEngine = aIStoryBean.getTtsVoiceEngine();
            String str3 = ttsVoiceEngine;
            if (ttsVoiceEngine == null) {
                str3 = "bili";
            }
            editTtsInfo.setTtsVoiceEngine(str3);
            trimOut = editTtsInfo.getTrimOut() + 1;
            arrayList2.add(editTtsInfo);
            i7++;
            j7 = j10;
        }
        editVideoInfo.setCaptionInfoList(arrayList);
        editVideoInfo.setTtsInfoList(arrayList2);
        editVideoInfo.setNativeVolume(0.0f);
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    public final void g(@NotNull EditVideoInfo editVideoInfo, @Nullable List<AIStoryTtsBean> list) {
    }
}
