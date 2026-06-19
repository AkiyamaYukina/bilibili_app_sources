package com.bilibili.studio.videoeditor.util;

import UC0.n;
import android.text.TextUtils;
import androidx.compose.runtime.C4277b;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.editor.UploadEditUsageData;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.Lazy;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/h.class */
public final class C6635h {
    public static void a(String str) {
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_music_button_click", "click", e(), str});
    }

    public static void b(int i7, int i8) {
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"music_recommend_click", "click", com.bilibili.studio.videoeditor.H.a().f108866a, i(), String.valueOf(i7), String.valueOf(i8)});
    }

    public static void c(UploadEditUsageData uploadEditUsageData) {
        if (!uploadEditUsageData.isEdited) {
            InfoEyesManager infoEyesManager = InfoEyesManager.getInstance();
            JSONObject jSONObjectF = f();
            j(jSONObjectF);
            infoEyesManager.report2(false, "000225", new String[]{"contribute_upload_confirm_click", "click", jSONObjectF.toJSONString(), "if_edited:0"});
            return;
        }
        StringBuilder sb = new StringBuilder("edit_func");
        if (uploadEditUsageData.useClipTrim) {
            sb.append("1/");
        }
        if (uploadEditUsageData.useMusic) {
            sb.append("2/");
        }
        if (uploadEditUsageData.useCaption) {
            sb.append("3/");
        }
        if (uploadEditUsageData.useClipSpeed) {
            sb.append("4/");
        }
        if (uploadEditUsageData.useRecord) {
            sb.append("5/");
        }
        if (uploadEditUsageData.useFilter) {
            sb.append("6/");
        }
        if (uploadEditUsageData.useClipReorder) {
            sb.append("7/");
        }
        if (uploadEditUsageData.useClipCut) {
            sb.append("8/");
        }
        if (uploadEditUsageData.useSticker) {
            sb.append("9/");
        }
        String string = sb.toString();
        String strSubstring = string;
        if (!TextUtils.isEmpty(string)) {
            strSubstring = string;
            if (string.lastIndexOf(47) >= 0) {
                strSubstring = string.substring(0, string.lastIndexOf(47));
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pic_count", (Object) Integer.valueOf(uploadEditUsageData.countPicture));
        jSONObject.put("video_count", (Object) Integer.valueOf(uploadEditUsageData.countVideo));
        j(jSONObject);
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_upload_confirm_click", "click", e(), "if_edited:1", strSubstring, uploadEditUsageData.resolution, jSONObject.toJSONString()});
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("operation_from:", (Object) com.bilibili.studio.videoeditor.H.a().f108866a);
        return jSONObject;
    }

    public static String e() {
        int i7;
        JSONObject jSONObject = new JSONObject();
        try {
            i7 = Integer.parseInt(i());
        } catch (NumberFormatException e7) {
            e7.printStackTrace();
            i7 = 0;
        }
        jSONObject.put("operation_from", (Object) com.bilibili.studio.videoeditor.H.a().f108866a);
        jSONObject.put("source_from", (Object) Integer.valueOf(i7));
        jSONObject.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, (Object) h());
        return jSONObject.toJSONString();
    }

    public static JSONObject f() {
        int i7;
        JSONObject jSONObject = new JSONObject();
        try {
            i7 = Integer.parseInt(i());
        } catch (NumberFormatException e7) {
            e7.printStackTrace();
            i7 = 0;
        }
        jSONObject.put("operation_from:", (Object) com.bilibili.studio.videoeditor.H.a().f108866a);
        jSONObject.put("source_from", (Object) Integer.valueOf(i7));
        jSONObject.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, (Object) h());
        return jSONObject;
    }

    public static String g() {
        return TextUtils.equals(i(), String.valueOf(2)) ? "1" : "2";
    }

    public static String h() {
        Lazy<UC0.n> lazy = UC0.n.f24629b;
        n.a.a().getClass();
        rC0.a aVar = (rC0.a) rC0.b.a().a;
        EditVideoInfo editVideoInfo = aVar != null ? aVar.a : null;
        String relationFrom = "";
        if (editVideoInfo != null) {
            relationFrom = "";
            if (editVideoInfo.getSchemaInfo() != null) {
                relationFrom = "";
                if (editVideoInfo.getSchemaInfo().getRelationFrom() != null) {
                    relationFrom = editVideoInfo.getSchemaInfo().getRelationFrom();
                }
            }
        }
        return relationFrom;
    }

    public static String i() {
        return C4277b.a(com.bilibili.studio.videoeditor.H.a().f108867b, "", new StringBuilder());
    }

    public static void j(JSONObject jSONObject) {
        Lazy<UC0.n> lazy = UC0.n.f24629b;
        n.a.a().getClass();
        rC0.a aVar = (rC0.a) rC0.b.a().a;
        EditVideoInfo editVideoInfo = aVar != null ? aVar.a : null;
        Object obj = "2";
        if (editVideoInfo != null) {
            obj = "2";
            if (editVideoInfo.getEditorMode() == 51) {
                obj = "1";
            }
        }
        jSONObject.put("mode_from", obj);
    }

    public static void k(String str) {
        InfoEyesManager infoEyesManager = InfoEyesManager.getInstance();
        JSONObject jSONObjectF = f();
        jSONObjectF.put("where", (Object) g());
        jSONObjectF.put("tab", (Object) str);
        infoEyesManager.report2(false, "000377", new String[]{"musiclist_tab_show", "show", jSONObjectF.toJSONString()});
    }
}
