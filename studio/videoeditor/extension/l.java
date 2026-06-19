package com.bilibili.studio.videoeditor.extension;

import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxSticker;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import com.bilibili.studio.videoeditor.template.bean.BiliImageTextTemplateBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/l.class */
public final class l {
    public static final void a(@Nullable EditVideoInfo editVideoInfo) throws JSONException {
        String strB;
        String strW;
        String strA;
        if (editVideoInfo == null) {
            return;
        }
        if (Intrinsics.areEqual(e(editVideoInfo), "1")) {
            strB = f.b(editVideoInfo);
            strW = f.w(editVideoInfo);
            strA = f.a(editVideoInfo);
        } else {
            strB = CaptureSchema.OLD_INVALID_ID_STRING;
            strW = CaptureSchema.OLD_INVALID_ID_STRING;
            strA = CaptureSchema.OLD_INVALID_ID_STRING;
        }
        JSONObject jSONObjectB = V7.e.b("music", strB, "template", strW);
        jSONObjectB.put("asr", strA);
        editVideoInfo.putReportData("creation_result", jSONObjectB.toString());
    }

    @NotNull
    public static final String b(@Nullable EditVideoInfo editVideoInfo) {
        BiliImageTextTemplateBean imageTextTemplate;
        Long l7;
        long jLongValue = (editVideoInfo == null || (imageTextTemplate = editVideoInfo.getImageTextTemplate()) == null || (l7 = imageTextTemplate.playId) == null) ? -1L : l7.longValue();
        if (jLongValue == 0) {
            jLongValue = -1;
        }
        return String.valueOf(jLongValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String c(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r3) {
        /*
            r0 = r3
            if (r0 == 0) goto L11
            r0 = r3
            java.lang.String r1 = "banner_type"
            java.lang.String r0 = r0.getReportData(r1)
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L14
        L11:
            java.lang.String r0 = ""
            r3 = r0
        L14:
            r0 = r3
            r4 = r0
            r0 = r3
            int r0 = r0.length()
            if (r0 != 0) goto L22
            java.lang.String r0 = "0"
            r4 = r0
        L22:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.l.c(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String d(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r5) {
        /*
            r0 = r5
            if (r0 == 0) goto L1f
            r0 = r5
            java.util.Map r0 = r0.getReportData()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1f
            r0 = r5
            java.lang.String r1 = "creation_result"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L22
        L1f:
            java.lang.String r0 = ""
            r5 = r0
        L22:
            r0 = r5
            r6 = r0
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L47
            java.lang.String r0 = "music"
            java.lang.String r1 = "-1"
            java.lang.String r2 = "template"
            java.lang.String r3 = "-1"
            org.json.JSONObject r0 = V7.e.b(r0, r1, r2, r3)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "asr"
            java.lang.String r2 = "-1"
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r5
            java.lang.String r0 = r0.toString()
            r6 = r0
        L47:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.l.d(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):java.lang.String");
    }

    @NotNull
    public static final String e(@Nullable EditVideoInfo editVideoInfo) {
        String reportData = "0";
        if (editVideoInfo != null) {
            reportData = editVideoInfo.getReportData("fast_video", "0");
            if (reportData == null) {
                reportData = "0";
            }
        }
        return reportData;
    }

    @NotNull
    public static final String f(@Nullable EditVideoInfo editVideoInfo) {
        if (editVideoInfo == null) {
            return "-";
        }
        StringBuilder sb = new StringBuilder();
        List<SelectVideo> selectVideoList = editVideoInfo.getSelectVideoList();
        if (selectVideoList != null) {
            for (SelectVideo selectVideo : selectVideoList) {
                if (selectVideo.id > 0) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(selectVideo.id);
                }
            }
        }
        return sb.length() == 0 ? "-" : sb.toString();
    }

    @NotNull
    public static final String g(@Nullable EditVideoInfo editVideoInfo) {
        EditVideoIntelligenceInfo intelligenceInfo;
        IntelligenceTemplateInfo intelligenceTemplateInfo;
        return (editVideoInfo == null || (intelligenceInfo = editVideoInfo.getIntelligenceInfo()) == null || (intelligenceTemplateInfo = intelligenceInfo.templateInfo) == null) ? "" : String.valueOf(intelligenceTemplateInfo.getOriginTemplateId());
    }

    @NotNull
    public static final String h(@Nullable EditVideoInfo editVideoInfo) {
        String strG = g(editVideoInfo);
        String strValueOf = strG;
        if (editVideoInfo != null) {
            EditorTemplateTabItemBean editTemplateInfo = editVideoInfo.getEditTemplateInfo();
            strValueOf = strG;
            if (editTemplateInfo != null) {
                long originId = editTemplateInfo.getOriginId();
                strValueOf = originId == -101 ? "" : String.valueOf(originId);
            }
        }
        return strValueOf.length() == 0 ? "" : strValueOf;
    }

    @NotNull
    public static final String i(@Nullable EditVideoInfo editVideoInfo) {
        if (editVideoInfo == null) {
            return "-";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoList();
        if (biliEditorStickerInfoList != null) {
            Iterator<T> it = biliEditorStickerInfoList.iterator();
            while (it.hasNext()) {
                EditFxSticker editFxSticker = ((BiliEditorStickerInfo) it.next()).getEditFxSticker();
                if (editFxSticker != null) {
                    int id = editFxSticker.getId();
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(id);
                }
            }
        }
        return sb.length() == 0 ? "-" : sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String j(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r3) {
        /*
            r0 = r3
            if (r0 == 0) goto L11
            r0 = r3
            java.lang.String r1 = "topic_id"
            java.lang.String r0 = r0.getReportData(r1)
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L14
        L11:
            java.lang.String r0 = ""
            r3 = r0
        L14:
            r0 = r3
            r4 = r0
            r0 = r3
            int r0 = r0.length()
            if (r0 != 0) goto L22
            java.lang.String r0 = "0"
            r4 = r0
        L22:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.l.j(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):java.lang.String");
    }
}
