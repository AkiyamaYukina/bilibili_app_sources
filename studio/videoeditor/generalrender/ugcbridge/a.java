package com.bilibili.studio.videoeditor.generalrender.ugcbridge;

import Ba1.f;
import Ih0.InterfaceC2297a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.foundation.util.Objects;
import com.bilibili.studio.template.data.VideoTemplateBean;
import com.bilibili.studio.template.data.VideoTemplateClip;
import com.bilibili.studio.template.data.VideoTemplateExtraBean;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.extension.k;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo;
import com.bilibili.studio.videoeditor.generalrender.model.f;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.template.BiliTemplateResource;
import com.bilibili.studio.videoeditor.template.bean.BiliVideoData;
import fD0.InterfaceC7041a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kntr.common.upper.trace.EventLevel;
import kntr.common.upper.trace.ITraceManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sw0.C8629b;
import sw0.C8631d;
import zC0.m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/ugcbridge/a.class */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Lazy<a> f109659g = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new f(6));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f109663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C1208a f109664e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Long, VideoTemplateBean> f109660a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Long, List<BiliVideoData>> f109661b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<Long, String> f109662c = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Boolean f109665f = (Boolean) ConfigManager.Companion.ab().get("upper.h5_ugc_template_default_loader", Boolean.TRUE);

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.generalrender.ugcbridge.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/ugcbridge/a$a.class */
    public static final class C1208a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public GRResourceInfo f109666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public VideoTemplateBean f109667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public InterfaceC2297a f109668c;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1208a)) {
                return false;
            }
            C1208a c1208a = (C1208a) obj;
            return Intrinsics.areEqual(this.f109666a, c1208a.f109666a) && Intrinsics.areEqual(this.f109667b, c1208a.f109667b) && Intrinsics.areEqual(this.f109668c, c1208a.f109668c);
        }

        public final int hashCode() {
            int iHashCode = this.f109666a.hashCode();
            return this.f109668c.hashCode() + ((this.f109667b.hashCode() + (iHashCode * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ChooseMaterialWrapper(info=" + this.f109666a + ", templateBean=" + this.f109667b + ", callback=" + this.f109668c + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/ugcbridge/a$b.class */
    public static final class b {
        @NotNull
        public static a a() {
            return (a) a.f109659g.getValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/ugcbridge/a$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f109669a;

        static {
            int[] iArr = new int[BiliTemplateResource.values().length];
            try {
                iArr[BiliTemplateResource.Tribe.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BiliTemplateResource.Mod.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BiliTemplateResource.TemplateMaterial.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[BiliTemplateResource.UgcTemplate.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f109669a = iArr;
        }
    }

    public static void a(FragmentActivity fragmentActivity, String str, Function1 function1) {
        if (str == null || str.length() == 0) {
            function1.invoke((Object) null);
            return;
        }
        String str2 = com.bilibili.studio.videoeditor.generalrender.model.f.f109601c;
        String strH = f.a.h(fragmentActivity, f.a.d(str));
        if (Intrinsics.areEqual(str, strH)) {
            function1.invoke(str);
        } else {
            new kD0.b(str, strH, new m(strH, function1)).execute(new Void[0]);
        }
    }

    public static final String c(BiliTemplateResource biliTemplateResource) {
        if (biliTemplateResource == BiliTemplateResource.TemplateMaterial) {
            String str = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.process$default(C8631d.f127390b, "活动资源下载", "uper_activity_preload_material_start", "【活动资源下载】开始下载模板资源", (EventLevel) null, C8629b.f127387b, C8629b.c(null), true, false, 8, (Object) null);
            }
        }
        int i7 = c.f109669a[biliTemplateResource.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "" : "template_resource" : "template_material" : "template_mod" : "template_tribe";
    }

    public final Bundle b(FragmentActivity fragmentActivity, VideoTemplateBean videoTemplateBean, String str, String str2) {
        Object next;
        Bundle bundle = new Bundle();
        bundle.putInt("bbs_key_template_type", 1);
        bundle.putString("bbs_key_template_page_from_v2", "一键投稿");
        bundle.putLong("bbs_key_template_server_id", videoTemplateBean.id);
        if (str != null && str.length() != 0) {
            if (str.length() == 0) {
                str = "";
            } else {
                Uri uriC = com.bilibili.studio.videoeditor.editor.editdata.b.c(str);
                if (uriC != null) {
                    str = com.bilibili.studio.videoeditor.editor.editdata.b.a(uriC, MapsKt.mapOf(TuplesKt.to(CaptureSchema.POST_CONFIG, Objects.toJsonString(MapsKt.mapOf(TuplesKt.to("first_entrance", "一键投稿")))))).toString();
                }
            }
            bundle.putString("JUMP_PARAMS", str);
        }
        bundle.putLong("bbs_key_template_server_id", videoTemplateBean.id);
        bundle.putString("bili_templateUrl", videoTemplateBean.downloadUrl);
        bundle.putString("bbs_key_template_cat_id", String.valueOf(videoTemplateBean.catId));
        String str3 = videoTemplateBean.name;
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        bundle.putString("bbs_key_template_name", str4);
        String str5 = videoTemplateBean.desc;
        String str6 = str5;
        if (str5 == null) {
            str6 = "";
        }
        bundle.putString("bbs_key_template_desc", str6);
        VideoTemplateExtraBean videoTemplateExtraBean = videoTemplateBean.videoTemplateExtraBean;
        bundle.putInt("bili_imageCount", videoTemplateExtraBean != null ? videoTemplateExtraBean.imageCount : 0);
        VideoTemplateExtraBean videoTemplateExtraBean2 = videoTemplateBean.videoTemplateExtraBean;
        bundle.putInt("bili_videoCount", videoTemplateExtraBean2 != null ? videoTemplateExtraBean2.videoCount : 0);
        Iterator<T> it = videoTemplateBean.videoTemplateExtraBean.all_clips_v2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((VideoTemplateClip) next).detectMode > 0) {
                break;
            }
        }
        bundle.putBoolean("bili_needDownVideoDetect", next != null);
        InterfaceC7041a interfaceC7041a = d(fragmentActivity).f109914e;
        bundle.putString("bili_subVersion", interfaceC7041a != null ? interfaceC7041a.getBuildVersion() : "2160000");
        bundle.putInt("bili_materialTabIndex", 0);
        VideoTemplateExtraBean videoTemplateExtraBean3 = videoTemplateBean.videoTemplateExtraBean;
        if (videoTemplateExtraBean3 != null) {
            bundle.putInt("bili_minCount", k.a(Long.valueOf(videoTemplateExtraBean3.minCount)));
            bundle.putInt("bili_maxCount", (int) videoTemplateExtraBean3.maxCount);
            bundle.putParcelableArrayList("bbs_key_template_footage_constraint_list", EA0.b.a(videoTemplateBean));
        }
        bundle.putInt("bbs_key_template_select_video_page_from", 1001);
        String str7 = str2;
        if (str2 == null) {
            str7 = "";
        }
        bundle.putString("bili_flowId", str7);
        bundle.putBoolean("template_corresponding_id_force_bind", true);
        Boolean bool = this.f109665f;
        if (bool != null) {
            bundle.putBoolean("default_template_loader", bool.booleanValue());
        }
        bundle.putBoolean("bbs_key_template_sdk_montage", true);
        bundle.putBoolean("bbs_key_template_sdk_montage_force", true);
        return bundle;
    }

    @NotNull
    public final BiliTemplateEngineManager d(@NotNull FragmentActivity fragmentActivity) {
        BiliTemplateEngineManager biliTemplateEngineManager = this.f109663d;
        BiliTemplateEngineManager biliTemplateEngineManager2 = biliTemplateEngineManager;
        if (biliTemplateEngineManager == null) {
            biliTemplateEngineManager2 = new BiliTemplateEngineManager(8);
            biliTemplateEngineManager2.i(fragmentActivity);
            this.f109663d = biliTemplateEngineManager2;
        }
        return biliTemplateEngineManager2;
    }

    public final void e(FragmentActivity fragmentActivity, Intent intent) {
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("bili_param_control") : null;
        long j7 = bundleExtra != null ? bundleExtra.getLong("bbs_key_template_server_id") : 0L;
        Serializable serializable = bundleExtra != null ? bundleExtra.getSerializable("bbs_key_material_select_videos") : null;
        List<BiliVideoData> list = serializable instanceof List ? (List) serializable : null;
        List<BiliVideoData> list2 = list;
        if (list2 == null || list2.isEmpty() || this.f109664e == null) {
            String str = C8629b.f127386a;
            if (pw0.b.a()) {
                ITraceManager.process$default(C8631d.f127390b, "活动资源选择", "uper_activity_select_local_source_cancel", "【活动资源选择】本地资源选择取消", EventLevel.WARNING, C8629b.f127387b, C8629b.c(null), false, false, 192, (Object) null);
            }
            C1208a c1208a = this.f109664e;
            JSONObject jSONObjectG = com.bilibili.studio.videoeditor.generalrender.model.k.g(c1208a != null ? c1208a.f109666a : null, -1101, "", null, 48);
            C1208a c1208a2 = this.f109664e;
            if (c1208a2 != null) {
                c1208a2.f109668c.a(jSONObjectG);
                return;
            }
            return;
        }
        String str2 = C8629b.f127386a;
        if (pw0.b.a()) {
            ITraceManager.process$default(C8631d.f127390b, "活动资源选择", "uper_activity_select_local_source_success", "【活动资源选择】本地资源选择完成", (EventLevel) null, C8629b.f127387b, C8629b.c(null), false, false, 200, (Object) null);
        }
        this.f109661b.put(Long.valueOf(j7), list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (BiliVideoData biliVideoData : list) {
            String str3 = biliVideoData.correspondingId;
            if (str3 != null && str3.length() != 0) {
                if (linkedHashMap.containsKey(biliVideoData.correspondingId)) {
                    List list3 = (List) linkedHashMap.get(biliVideoData.correspondingId);
                    if (list3 != null) {
                        list3.add(biliVideoData);
                    }
                } else {
                    linkedHashMap.put(biliVideoData.correspondingId, new ArrayList());
                }
            }
            a(fragmentActivity, biliVideoData.filePath, new zC0.b(booleanRef, this, biliVideoData, intRef, linkedHashMap, list, fragmentActivity));
        }
    }
}
