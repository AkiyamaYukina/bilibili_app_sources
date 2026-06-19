package com.bilibili.studio.videoeditor.extension;

import L50.a;
import R50.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxSticker;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bean.BVideo;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilter;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterClip;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoSmartTitle;
import com.bilibili.studio.videoeditor.editor.editdata.EditorEnterInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/f.class */
public final class f {
    @NotNull
    public static final String a(@Nullable EditVideoInfo editVideoInfo) {
        IntelligenceAudioConfig intelligenceAudioConfig;
        String str = "0";
        if (editVideoInfo != null) {
            EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo.getIntelligenceInfo();
            str = "0";
            if (intelligenceInfo != null) {
                if (!v(editVideoInfo) && ((intelligenceAudioConfig = intelligenceInfo.audioConfig) == null || intelligenceAudioConfig.autoASR || (intelligenceAudioConfig != null && intelligenceAudioConfig.fastAsrResult == 2))) {
                    List<CaptionInfo> captionInfoList = editVideoInfo.getCaptionInfoList();
                    str = "0";
                    if (captionInfoList != null) {
                        Iterator<T> it = captionInfoList.iterator();
                        while (true) {
                            str = "0";
                            if (!it.hasNext()) {
                                break;
                            }
                            if (Bw0.c.a(((CaptionInfo) it.next()).captionType)) {
                                str = "1";
                                break;
                            }
                        }
                    }
                } else {
                    str = CaptureSchema.OLD_INVALID_ID_STRING;
                }
            }
        }
        return str;
    }

    @NotNull
    public static final String b(@Nullable EditVideoInfo editVideoInfo) {
        String str = "0";
        if (editVideoInfo != null) {
            EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo.getIntelligenceInfo();
            str = "0";
            if (intelligenceInfo != null) {
                IntelligenceAudioConfig intelligenceAudioConfig = intelligenceInfo.audioConfig;
                if (Intrinsics.areEqual(intelligenceAudioConfig != null ? Boolean.valueOf(intelligenceAudioConfig.autoBgm) : null, Boolean.FALSE)) {
                    str = CaptureSchema.OLD_INVALID_ID_STRING;
                } else {
                    EditorMusicInfo editorMusicInfo = editVideoInfo.getEditorMusicInfo();
                    ArrayList<BMusic> arrayList = null;
                    if (editorMusicInfo != null) {
                        arrayList = editorMusicInfo.bMusicList;
                    }
                    str = "0";
                    if (!(arrayList == null || arrayList.isEmpty())) {
                        str = "1";
                    }
                }
            }
        }
        return str;
    }

    @NotNull
    public static final JSONArray c(@Nullable Map<String, String> map) {
        if (map == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("file_name", str);
            jSONObject.put("label", str2);
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    @NotNull
    public static final EditorEnterInfo d(@Nullable EditVideoInfo editVideoInfo) {
        int i7;
        EditorEnterInfo editorEnterInfo = new EditorEnterInfo();
        if (editVideoInfo == null) {
            return editorEnterInfo;
        }
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList != null && !userTrackBClipList.isEmpty()) {
            List<BClip> userTrackBClipList2 = editVideoInfo.getUserTrackBClipList();
            long j7 = 0;
            int i8 = 0;
            if (userTrackBClipList2 != null) {
                Iterator<T> it = userTrackBClipList2.iterator();
                j7 = 0;
                i7 = 0;
                i8 = 0;
                while (it.hasNext()) {
                    BVideo bVideo = ((BClip) it.next()).bVideo;
                    if (bVideo != null && bVideo.mediaFileType == 0) {
                        i8++;
                    } else if (bVideo != null && bVideo.mediaFileType == 1) {
                        i7++;
                        j7 += (bVideo != null ? bVideo.duration : 0L) / ((long) 1000);
                    }
                }
            } else {
                i7 = 0;
            }
            editorEnterInfo.setImageCount(i8);
            editorEnterInfo.setVideoCount(i7);
            editorEnterInfo.setVideoDuration(j7);
        }
        return editorEnterInfo;
    }

    public static final long e(@Nullable EditVideoInfo editVideoInfo) {
        long j7 = 0;
        if (editVideoInfo == null) {
            return 0L;
        }
        long videoDuration = editVideoInfo.getVideoDuration();
        if (videoDuration > 0) {
            return videoDuration / ((long) 1000);
        }
        List<SelectVideo> selectVideoList = editVideoInfo.getSelectVideoList();
        long j8 = 0;
        if (selectVideoList != null) {
            Iterator<T> it = selectVideoList.iterator();
            while (true) {
                j8 = j7;
                if (!it.hasNext()) {
                    break;
                }
                j7 += ((SelectVideo) it.next()).duration;
            }
        }
        return j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cb  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String f(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r7) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.f.f(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):java.lang.String");
    }

    public static final int g(@Nullable EditVideoInfo editVideoInfo) {
        if ((editVideoInfo != null ? editVideoInfo.getIntelligenceInfo() : null) == null) {
            return (editVideoInfo == null || !editVideoInfo.isCancelByUser()) ? 0 : 3;
        }
        EditorTemplateTabItemBean editTemplateInfo = editVideoInfo.getEditTemplateInfo();
        if (editTemplateInfo == null || editTemplateInfo.id != -101) {
            return editVideoInfo.getIntelligenceInfo().enterFrom;
        }
        return 3;
    }

    @NotNull
    public static final String h(@Nullable EditVideoInfo editVideoInfo, @NotNull HashMap<String, JSONArray> map) {
        String str;
        Map<String, String> map2;
        String str2;
        Map<String, String> map3;
        try {
            if (editVideoInfo == null) {
                return JSON.toJSONString(map);
            }
            EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo.getIntelligenceInfo();
            if (intelligenceInfo != null && (str2 = intelligenceInfo.zipUrl) != null && str2.length() != 0 && (map3 = intelligenceInfo.imageFrameAndTag) != null && !map3.isEmpty()) {
                map.put(str2, c(intelligenceInfo.imageFrameAndTag));
            }
            EditVideoSmartTitle editVideoSmartTitle = editVideoInfo.getEditVideoSmartTitle();
            if (editVideoSmartTitle != null && (str = editVideoSmartTitle.firstFrameZipUrl) != null && str.length() != 0 && (map2 = editVideoSmartTitle.recFrameAndTag) != null && !map2.isEmpty()) {
                map.put(str, c(editVideoSmartTitle.recFrameAndTag));
            }
            return JSON.toJSONString(map);
        } catch (Exception e7) {
            e7.printStackTrace();
            return "";
        }
    }

    @NotNull
    public static final String i(@Nullable EditVideoInfo editVideoInfo) {
        if ((editVideoInfo != null ? editVideoInfo.getIntelligenceInfo() : null) != null) {
            String str = editVideoInfo.getIntelligenceInfo().imageRecLabel;
            if (str == null) {
                str = "";
            }
            return str;
        }
        String imageLabels = "";
        if (editVideoInfo != null) {
            imageLabels = editVideoInfo.getImageLabels();
            if (imageLabels == null) {
                imageLabels = "";
            }
        }
        return imageLabels;
    }

    @NotNull
    public static final Pair<Integer, Integer> j(@Nullable EditVideoInfo editVideoInfo) {
        if (editVideoInfo == null) {
            return new Pair<>(0, 0);
        }
        EditorTemplateTabItemBean editTemplateInfo = editVideoInfo.getEditTemplateInfo();
        int intelligenceState = (editTemplateInfo == null || !editTemplateInfo.isOriginalFilm()) ? editVideoInfo.getIntelligenceState() : 0;
        int i7 = 0;
        int i8 = intelligenceState;
        if (v(editVideoInfo)) {
            i7 = 0;
            i8 = intelligenceState;
            if (g(editVideoInfo) == 1) {
                i8 = 0;
                i7 = intelligenceState;
            }
        }
        return new Pair<>(Integer.valueOf(i7), Integer.valueOf(i8));
    }

    @NotNull
    public static final Map<String, String> k(@Nullable EditVideoInfo editVideoInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strA = a(editVideoInfo);
        String strB = b(editVideoInfo);
        String strW = w(editVideoInfo);
        linkedHashMap.put("asr_apply_result", strA);
        linkedHashMap.put("bgm_apply_result", strB);
        linkedHashMap.put("template_apply_result", strW);
        Object obj = "0";
        if (!Intrinsics.areEqual(strA, "0") && !Intrinsics.areEqual(strB, "0") && Intrinsics.areEqual(strW, "1")) {
            obj = "1";
        } else if (!Intrinsics.areEqual(strA, "0") || !Intrinsics.areEqual(strB, "0") || !Intrinsics.areEqual(strW, "0")) {
            obj = "2";
        }
        linkedHashMap.put("smart_apply_result", obj);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String l(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.music.model.EditorMusicItem r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.f.l(com.bilibili.studio.editor.moudle.music.model.EditorMusicItem):java.lang.String");
    }

    @NotNull
    public static final String m(@Nullable EditVideoInfo editVideoInfo) {
        String recMusicSids;
        if (editVideoInfo == null) {
            return "";
        }
        if (editVideoInfo.getIntelligenceInfo() != null) {
            recMusicSids = "";
            if (editVideoInfo.getIntelligenceInfo().recMusicIds != null) {
                Iterator<String> it = editVideoInfo.getIntelligenceInfo().recMusicIds.iterator();
                String strA = "";
                while (true) {
                    String str = strA;
                    recMusicSids = str;
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    strA = TextUtils.isEmpty(str) ? next : B0.a.a(str, ",", next);
                }
            }
        } else {
            recMusicSids = "";
            if (editVideoInfo.getRecMusicSids() != null) {
                recMusicSids = editVideoInfo.getRecMusicSids();
            }
        }
        return recMusicSids;
    }

    @NotNull
    public static final String n(@Nullable EditVideoInfo editVideoInfo) {
        String strC = "";
        if (editVideoInfo != null) {
            if (editVideoInfo.getPictureRatioInfo() == null) {
                strC = "";
            } else {
                strC = "";
                if (editVideoInfo.getPictureRatioInfo().widthStand != 0) {
                    if (editVideoInfo.getPictureRatioInfo().heightStand == 0) {
                        strC = "";
                    } else {
                        strC = P.c(editVideoInfo.getPictureRatioInfo().widthStand, editVideoInfo.getPictureRatioInfo().heightStand);
                        if (strC == null) {
                            strC = "";
                        }
                    }
                }
            }
        }
        return strC;
    }

    @NotNull
    public static final String o(@Nullable EditVideoInfo editVideoInfo) {
        if (editVideoInfo == null || editVideoInfo.getPictureRatioInfo() == null) {
            return "";
        }
        if (editVideoInfo.getPictureRatioInfo().width <= 0 || editVideoInfo.getPictureRatioInfo().height <= 0) {
            return n(editVideoInfo);
        }
        String strC = P.c(editVideoInfo.getPictureRatioInfo().width, editVideoInfo.getPictureRatioInfo().height);
        if (strC == null) {
            strC = "";
        }
        return strC;
    }

    @NotNull
    public static final String p(@Nullable EditVideoInfo editVideoInfo) {
        String str;
        String str2;
        if (editVideoInfo == null) {
            return "";
        }
        if (editVideoInfo.getIntelligenceInfo() != null) {
            IntelligenceTemplateInfo intelligenceTemplateInfo = editVideoInfo.getIntelligenceInfo().templateInfo;
            if (intelligenceTemplateInfo == null || (str2 = intelligenceTemplateInfo.picLabel) == null) {
                EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo.getIntelligenceInfo();
                String str3 = intelligenceInfo != null ? intelligenceInfo.imageRecLabel : null;
                str = str3;
                if (str3 == null) {
                    str = "";
                }
            } else {
                str = str2;
            }
        } else {
            String imageLabels = editVideoInfo.getImageLabels();
            str = imageLabels;
            if (imageLabels == null) {
                str = "";
            }
        }
        return str;
    }

    public static final int q(@Nullable EditVideoInfo editVideoInfo) {
        if (editVideoInfo == null) {
            return 1;
        }
        List<SelectVideo> selectVideoList = editVideoInfo.getSelectVideoList();
        boolean z6 = false;
        boolean z7 = false;
        if (selectVideoList != null) {
            z6 = false;
            for (SelectVideo selectVideo : selectVideoList) {
                String str = selectVideo.mimeType;
                if (str == null || str.length() == 0) {
                    String str2 = selectVideo.videoPath;
                    r rVarU = a.a.a.a != null ? r.u() : null;
                    R50.a aVarS = rVarU != null ? rVarU.s(str2) : null;
                    Integer numValueOf = aVarS != null ? Integer.valueOf(aVarS.a.getAVFileType()) : null;
                    if (numValueOf != null && numValueOf.intValue() == 2) {
                        z7 = true;
                    } else if (numValueOf != null && numValueOf.intValue() == 0) {
                        z6 = true;
                    }
                } else if (selectVideo.isVideo()) {
                    z6 = true;
                } else if (selectVideo.isImage()) {
                    z7 = true;
                }
            }
        } else {
            z7 = false;
        }
        if (z6 && z7) {
            return 3;
        }
        return z6 ? 2 : 1;
    }

    @NotNull
    public static final String r(@Nullable EditVideoInfo editVideoInfo) {
        EditorMusicInfo editorMusicInfo;
        ArrayList<BMusic> arrayList;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject();
            if (editVideoInfo != null && (editorMusicInfo = editVideoInfo.getEditorMusicInfo()) != null && (arrayList = editorMusicInfo.bMusicList) != null) {
                int i7 = 0;
                for (Object obj : arrayList) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    jSONObject.put(String.valueOf(i7), String.valueOf(((BMusic) obj).bgmSid));
                    i7++;
                }
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            Object obj3 = obj2;
            if (Result.isFailure-impl(obj2)) {
                obj3 = null;
            }
            Object obj4 = (Void) obj3;
            return obj4 != null ? (String) obj4 : "";
        }
    }

    @NotNull
    public static final String s(@Nullable EditVideoInfo editVideoInfo) {
        String strT = t(editVideoInfo);
        String str = strT;
        if (strT.length() == 0) {
            str = "none";
        }
        return str;
    }

    @NotNull
    public static final String t(@Nullable EditVideoInfo editVideoInfo) {
        if (editVideoInfo == null) {
            return "";
        }
        List<EditTtsInfo> ttsInfoList = editVideoInfo.getTtsInfoList();
        if (ttsInfoList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (EditTtsInfo editTtsInfo : ttsInfoList) {
            if (!TextUtils.isEmpty(editTtsInfo.getTtsName()) && !arrayList.contains(editTtsInfo.getTtsName())) {
                arrayList.add(editTtsInfo.getTtsName());
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean u(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r2) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.f.u(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):boolean");
    }

    public static final boolean v(@NotNull EditVideoInfo editVideoInfo) {
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList == null) {
            return true;
        }
        Iterator<T> it = userTrackBClipList.iterator();
        while (it.hasNext()) {
            if (((BClip) it.next()).clipMediaType != 0) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final String w(@Nullable EditVideoInfo editVideoInfo) {
        String str = "0";
        if (editVideoInfo != null) {
            EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo.getIntelligenceInfo();
            str = "0";
            if (intelligenceInfo != null) {
                IntelligenceTemplateInfo intelligenceTemplateInfo = intelligenceInfo.templateInfo;
                str = "0";
                if ((intelligenceTemplateInfo != null ? intelligenceTemplateInfo.templateId : 0L) > 0) {
                    str = "1";
                }
            }
        }
        return str;
    }

    @NotNull
    public static final String x(@Nullable EditVideoInfo editVideoInfo) {
        EditVideoClip userVideoTrack;
        List<BClip> bClipList;
        EditFxFilterClip editFxFilterClip;
        EditFxFilter editFilter;
        Object next;
        EditVideoClip userVideoTrack2;
        EditFxFilterInfo editFxFilterInfo;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<EditFxFilterClip> filterClips = (editVideoInfo == null || (userVideoTrack2 = editVideoInfo.getUserVideoTrack()) == null || (editFxFilterInfo = userVideoTrack2.getEditFxFilterInfo()) == null) ? null : editFxFilterInfo.getFilterClips();
        if (editVideoInfo != null && (userVideoTrack = editVideoInfo.getUserVideoTrack()) != null && (bClipList = userVideoTrack.getBClipList()) != null) {
            Iterator<T> it = bClipList.iterator();
            while (it.hasNext()) {
                String str = ((BClip) it.next()).id;
                if (filterClips != null) {
                    Iterator<T> it2 = filterClips.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (Intrinsics.areEqual(str, ((EditFxFilterClip) next).getAppendClipId())) {
                            break;
                        }
                    }
                    editFxFilterClip = (EditFxFilterClip) next;
                } else {
                    editFxFilterClip = null;
                }
                int i7 = (editFxFilterClip == null || (editFilter = editFxFilterClip.getEditFilter()) == null) ? -1 : editFilter.id;
                if (i7 != 0) {
                    linkedHashSet.add(String.valueOf(i7));
                }
            }
        }
        return CollectionsKt.p(linkedHashSet, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
    }

    @NotNull
    public static final String y(@Nullable EditVideoInfo editVideoInfo) {
        ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList;
        EditCustomizeSticker editCustomizeSticker;
        EditFxSticker editFxSticker;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (editVideoInfo != null && (biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoList()) != null) {
            for (BiliEditorStickerInfo biliEditorStickerInfo : biliEditorStickerInfoList) {
                Integer numValueOf = (biliEditorStickerInfo == null || (editFxSticker = biliEditorStickerInfo.getEditFxSticker()) == null) ? null : Integer.valueOf(editFxSticker.getId());
                long j7 = (biliEditorStickerInfo == null || (editCustomizeSticker = biliEditorStickerInfo.getEditCustomizeSticker()) == null) ? -1L : editCustomizeSticker.sticker_id;
                if (numValueOf != null && numValueOf.intValue() != 0) {
                    linkedHashSet.add(String.valueOf(numValueOf.intValue()));
                } else if (j7 > 0) {
                    linkedHashSet.add(CaptureSchema.OLD_INVALID_ID_STRING);
                }
            }
        }
        return CollectionsKt.p(linkedHashSet, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
    }

    @NotNull
    public static final String z(@Nullable EditVideoInfo editVideoInfo) {
        EditVideoClip userVideoTrack;
        List<TransitionInfo> transitionInfoList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (editVideoInfo != null && (userVideoTrack = editVideoInfo.getUserVideoTrack()) != null && (transitionInfoList = userVideoTrack.getTransitionInfoList()) != null) {
            for (TransitionInfo transitionInfo : transitionInfoList) {
                Integer numValueOf = transitionInfo != null ? Integer.valueOf(transitionInfo.selectId) : null;
                if (numValueOf != null && numValueOf.intValue() != 0) {
                    linkedHashSet.add(String.valueOf(numValueOf.intValue()));
                }
            }
        }
        return CollectionsKt.p(linkedHashSet, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
    }
}
