package com.bilibili.studio.videoeditor.generalrender.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.generalrender.bean.GRGetResourceResult;
import com.bilibili.studio.videoeditor.generalrender.bean.GRJsbResult;
import com.bilibili.studio.videoeditor.generalrender.bean.GRPreprocessResult;
import com.bilibili.studio.videoeditor.generalrender.bean.GRRenderResult;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceResult;
import com.bilibili.studio.videoeditor.generalrender.bean.GRVideoUploadResult;
import java.util.HashMap;
import java.util.List;
import kntr.common.upper.trace.EventLevel;
import kntr.common.upper.trace.ITraceManager;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import sw0.C8629b;
import sw0.C8631d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/k.class */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.alibaba.fastjson.JSONObject a(long r11, @org.jetbrains.annotations.Nullable java.lang.String r13, int r14, @org.jetbrains.annotations.Nullable java.lang.String r15, @org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.generalrender.bean.GRContributeResult r16, long r17) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.generalrender.model.k.a(long, java.lang.String, int, java.lang.String, com.bilibili.studio.videoeditor.generalrender.bean.GRContributeResult, long):com.alibaba.fastjson.JSONObject");
    }

    @NotNull
    public static final JSONObject b(@Nullable String str, int i7, @Nullable String str2, @Nullable GRGetResourceResult gRGetResourceResult) {
        HashMap map = new HashMap();
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        P4.a.a(i7, "file_name", str3, "error_code", map);
        map.put("error_message", str2 == null ? "" : str2);
        map.put("manuscript_type", wC0.a.a);
        if (i7 != 0) {
            String str4 = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.end$default(C8631d.f127390b, "活动资源缓存", "uper_activity_resource_cache_not_exist", "【活动资源缓存】缓存资源不存在", EventLevel.WARNING, C8629b.f127387b, map, false, 64, (Object) null);
            }
        }
        Neurons.trackT(false, "creation.annual.general_rendering.get-resource.track", map, 2, new AT0.c(8));
        if (i7 != 0) {
            n(i7, "buildGetResourceResult", str2);
            gRGetResourceResult = null;
        }
        JSONObject jSONObjectM = m(new GRJsbResult(i7, str2, gRGetResourceResult));
        if (i7 == 0) {
            String str5 = C8629b.f127386a;
            JSONObject jSONObject = jSONObjectM.getJSONObject("data");
            if (pw0.b.a()) {
                ITraceManager.process$default(C8631d.f127390b, "活动资源缓存", "uper_activity_resource_cache_exist", "【活动资源缓存】缓存资源存在", (EventLevel) null, C8629b.f127387b, C8629b.c(jSONObject), false, false, 200, (Object) null);
            }
        }
        return jSONObjectM;
    }

    @NotNull
    public static final JSONObject c(@Nullable String str, long j7, @Nullable List<String> list, @NotNull List<GRPreprocessResult.Clip> list2, int i7, @Nullable String str2, @Nullable Long l7, @Nullable String str3) {
        int size = list != null ? list.size() : 0;
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        map.put("task_name", str);
        P4.a.a(i7, "clip_count", pf.h.a(size, j7, EditCustomizeSticker.TAG_TEMPLATE_ID, map), "error_code", map);
        map.put("error_message", str2 == null ? "" : str2);
        map.put("manuscript_type", wC0.a.a);
        map.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(l7));
        if (str3 == null) {
            str3 = "";
        }
        map.put("flow_id", str3);
        map.put("sdk_type", KaleidoscopeFactory.SDK_MON);
        if (i7 == 0) {
            String str4 = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.process$default(C8631d.f127390b, "活动资源预处理", "uper_activity_preprocesses_success", "【资源预处理】处理成功", (EventLevel) null, (String) null, map, false, false, 216, (Object) null);
            }
        } else {
            String str5 = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.end$default(C8631d.f127390b, "活动资源预处理", "uper_activity_preprocesses_fail", "【资源预处理】处理失败", EventLevel.ERROR, (String) null, map, false, 80, (Object) null);
            }
        }
        Neurons.trackT(false, "creation.annual.general-rendering.preprocess.track", map, 2, new AT0.c(8));
        if (i7 != 0) {
            n(i7, "buildPreprocessResult", str2);
        }
        return m(new GRJsbResult(i7, str2, new GRPreprocessResult(list, list2)));
    }

    public static /* synthetic */ JSONObject d(String str, long j7, List list, List list2, int i7, String str2, Long l7, String str3, int i8) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        if ((i8 & 2) != 0) {
            j7 = 0;
        }
        if ((i8 & 4) != 0) {
            list = null;
        }
        if ((i8 & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((i8 & 32) != 0) {
            str2 = "";
        }
        if ((i8 & 64) != 0) {
            l7 = 0L;
        }
        if ((i8 & 128) != 0) {
            str3 = "";
        }
        return c(str, j7, list, list2, i7, str2, l7, str3);
    }

    @NotNull
    public static final JSONObject e(int i7, long j7, @Nullable String str) {
        GRRenderResult gRRenderResult;
        if (i7 == 0) {
            gRRenderResult = new GRRenderResult(j7);
        } else {
            n(i7, "buildRenderVideoResult", str);
            gRRenderResult = null;
        }
        JSONObject jSONObjectM = m(new GRJsbResult(i7, str, gRRenderResult));
        if (i7 == 0) {
            String str2 = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.process$default(C8631d.f127390b, "活动视频合成", "uper_activity_export_video_success", "【活动视频合成】合成成功", (EventLevel) null, (String) null, C8629b.c(null), false, false, 216, (Object) null);
            }
        } else {
            String str3 = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.end$default(C8631d.f127390b, "活动视频合成", "uper_activity_export_video_fail", "【活动视频合成】合成失败", EventLevel.ERROR, (String) null, C8629b.c(null), false, 80, (Object) null);
            }
        }
        return jSONObjectM;
    }

    @NotNull
    public static final JSONObject f(@Nullable GRResourceInfo gRResourceInfo, int i7, @Nullable String str, @Nullable String str2, @Nullable Long l7, boolean z6) {
        GRResourceResult gRResourceResult;
        if (z6) {
            String hash = gRResourceInfo != null ? gRResourceInfo.getHash() : null;
            String sourceType = gRResourceInfo != null ? gRResourceInfo.getSourceType() : null;
            String mimeType = gRResourceInfo != null ? gRResourceInfo.getMimeType() : null;
            String name = gRResourceInfo != null ? gRResourceInfo.getName() : null;
            HashMap map = new HashMap();
            String str3 = hash;
            if (hash == null) {
                str3 = "";
            }
            map.put("file_name", str3);
            String str4 = sourceType;
            if (sourceType == null) {
                str4 = "";
            }
            map.put("source_type", str4);
            String str5 = mimeType;
            if (mimeType == null) {
                str5 = "";
            }
            P4.a.a(i7, "mime_type", str5, "error_code", map);
            map.put("error_message", str == null ? "" : str);
            map.put("manuscript_type", wC0.a.a);
            map.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(l7));
            String str6 = name;
            if (name == null) {
                str6 = "";
            }
            map.put("task_name", str6);
            map.put("sdk_type", KaleidoscopeFactory.SDK_MON);
            if (i7 == 0) {
                String str7 = C8629b.f127386a;
                if (pw0.b.a()) {
                    ITraceManager.process$default(C8631d.f127390b, "活动资源下载", "uper_activity_preload_resource_success", "【活动资源下载】资源下载成功", (EventLevel) null, C8629b.f127387b, map, false, false, 200, (Object) null);
                }
            } else {
                String str8 = C8629b.f127386a;
                if (pw0.b.a()) {
                    ITraceManager.end$default(C8631d.f127390b, "活动资源下载", "uper_activity_preload_resource_fail", "【活动资源下载】资源下载失败", EventLevel.ERROR, C8629b.f127387b, map, false, 64, (Object) null);
                }
            }
            Neurons.trackT(false, "creation.annual.general_rendering.load-resource-base.track", map, 2, new AT0.c(8));
        }
        if (i7 == 0) {
            gRResourceResult = new GRResourceResult(str2);
        } else {
            n(i7, "buildResourceResult", str);
            gRResourceResult = null;
        }
        return m(new GRJsbResult(i7, str, gRResourceResult));
    }

    public static /* synthetic */ JSONObject g(GRResourceInfo gRResourceInfo, int i7, String str, String str2, int i8) {
        if ((i8 & 8) != 0) {
            str2 = null;
        }
        return f(gRResourceInfo, i7, str, str2, 0L, true);
    }

    @NotNull
    public static final JSONObject h(int i7, @Nullable String str, @Nullable String str2) {
        if (i7 != 0) {
            n(i7, "buildSaveVideoResult", str2);
        }
        HashMap map = new HashMap();
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        P4.a.a(i7, "file_name", str3, "error_code", map);
        map.put("error_message", str2 == null ? "" : str2);
        map.put("manuscript_type", wC0.a.a);
        Neurons.trackT(false, "creation.annual.general_rendering.save-video-to-album.track", map, 2, new AT0.c(8));
        JSONObject jSONObjectM = m(new GRJsbResult(i7, str2, null, 4, null));
        if (i7 == 0) {
            String str4 = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.process$default(C8631d.f127390b, "保存视频", "uper_activity_save_video_album_success", "【保存视频】保存成功", (EventLevel) null, (String) null, C8629b.c(null), false, false, 216, (Object) null);
            }
        } else {
            String str5 = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.end$default(C8631d.f127390b, "保存视频", "uper_activity_save_video_album_fail", "【保存视频】保存失败", EventLevel.ERROR, (String) null, C8629b.c(null), false, 80, (Object) null);
            }
        }
        return jSONObjectM;
    }

    @NotNull
    public static final JSONObject i(int i7, @Nullable String str, @Nullable String str2, long j7, int i8, int i9) {
        HashMap map = new HashMap();
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        map.put("task_name", str3);
        P4.a.a(i8, "material_size", pf.h.a(i7, j7, EditCustomizeSticker.TAG_TEMPLATE_ID, map), "clip_size", map);
        map.put("error_code", String.valueOf(i9));
        map.put("error_message", str2 == null ? "" : str2);
        map.put("sdk_type", KaleidoscopeFactory.SDK_MON);
        Neurons.trackT(false, "creation.annual.general-rendering.template-reuse-resource.track", map, 2, new AT0.c(8));
        return m(new GRJsbResult(i9, str2, null));
    }

    public static /* synthetic */ JSONObject j(int i7, String str, String str2, int i8, long j7, int i9, int i10) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            j7 = 0;
        }
        if ((i10 & 4) != 0) {
            i7 = 0;
        }
        if ((i10 & 8) != 0) {
            i8 = 0;
        }
        if ((i10 & 32) != 0) {
            str2 = "";
        }
        return i(i7, str, str2, j7, i8, i9);
    }

    @NotNull
    public static final JSONObject k(@Nullable String str, @Nullable String str2, @Nullable String str3, long j7, long j8, @Nullable String str4, int i7, @Nullable String str5, @Nullable GRVideoUploadResult gRVideoUploadResult, boolean z6, @Nullable Long l7) {
        if (i7 != 0) {
            n(i7, "buildVideoUploadResult", str5);
        }
        if (z6) {
            HashMap map = new HashMap();
            if (str == null) {
                str = "";
            }
            map.put("task_name", str);
            map.put("file_name", str3 == null ? "" : str3);
            map.put("file_size", String.valueOf(j7));
            map.put("upload_duration", String.valueOf(j8));
            if (str4 == null) {
                str4 = "";
            }
            map.put("upload_status", str4);
            map.put("error_message", str5 == null ? "" : str5);
            if (str2 == null) {
                str2 = "";
            }
            map.put("scene", str2);
            map.put("manuscript_type", wC0.a.a);
            String strValueOf = "";
            if (l7 != null) {
                strValueOf = String.valueOf(l7.longValue());
                if (strValueOf == null) {
                    strValueOf = "";
                }
            }
            map.put(EditCustomizeSticker.TAG_TEMPLATE_ID, strValueOf);
            map.put("sdk_type", KaleidoscopeFactory.SDK_MON);
            if (i7 == 0) {
                String str6 = C8629b.f127386a;
                if (pw0.b.a()) {
                    ITraceManager.process$default(C8631d.f127390b, "活动视频上传", "uper_activity_upload_video_success", "【活动视频上传】视频上传成功", (EventLevel) null, (String) null, C8629b.c(null), false, false, 216, (Object) null);
                }
            } else {
                String str7 = C8629b.f127386a;
                if (pw0.b.a()) {
                    ITraceManager.end$default(C8631d.f127390b, "活动视频上传", "uper_activity_upload_video_fail", "【活动视频上传】视频上传失败", EventLevel.ERROR, (String) null, C8629b.c(null), false, 80, (Object) null);
                }
            }
            Neurons.trackT(false, "creation.annual.general_rendering.upload-video.track", map, 2, new AT0.c(8));
        }
        return m(new GRJsbResult(i7, str5, gRVideoUploadResult));
    }

    public static /* synthetic */ JSONObject l(String str, String str2, String str3, long j7, long j8, String str4, int i7, String str5, GRVideoUploadResult gRVideoUploadResult, Long l7, int i8) {
        if ((i8 & 4) != 0) {
            str3 = "";
        }
        if ((i8 & 8) != 0) {
            j7 = 0;
        }
        if ((i8 & 16) != 0) {
            j8 = 0;
        }
        if ((i8 & 128) != 0) {
            str5 = "";
        }
        if ((i8 & 256) != 0) {
            gRVideoUploadResult = null;
        }
        return k(str, str2, str3, j7, j8, str4, i7, str5, gRVideoUploadResult, true, l7);
    }

    @NotNull
    public static final JSONObject m(@NotNull GRJsbResult gRJsbResult) {
        try {
            return JSON.parseObject(JSON.toJSONString(gRJsbResult));
        } catch (Exception e7) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", -1);
            jSONObject.put("message", "result parse to json error " + e7.getMessage());
            M.b("getJSONObject: json parse error:", e7.getMessage(), "GRResultFactory");
            return jSONObject;
        }
    }

    @Nullable
    public static final void n(int i7, @NotNull String str, @Nullable String str2) {
        S9.b.a(androidx.constraintlayout.widget.e.a(i7, "method:", str, " code:", " message:"), str2, "GeneralVideoRender");
    }
}
