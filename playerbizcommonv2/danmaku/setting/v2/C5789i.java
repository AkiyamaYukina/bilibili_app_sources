package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMSpeedLevel;
import com.bilibili.studio.template.data.VideoTemplateBean;
import com.bilibili.studio.template.data.VideoTemplateExtraBean;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import fD0.InterfaceC7041a;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/i.class */
public final /* synthetic */ class C5789i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f81438c;

    public /* synthetic */ C5789i(int i7, Object obj, Object obj2) {
        this.f81436a = i7;
        this.f81437b = obj;
        this.f81438c = obj2;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f81437b;
        Object obj3 = this.f81438c;
        switch (this.f81436a) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                DMSpeedLevel.Companion.getClass();
                DMSpeedLevel dMSpeedLevelB = DMSpeedLevel.a.b(fFloatValue);
                DanmakuSettingsDialog danmakuSettingsDialog = (DanmakuSettingsDialog) obj2;
                danmakuSettingsDialog.f81307t.setValue(Float.valueOf(dMSpeedLevelB.getSpeed()));
                danmakuSettingsDialog.f81290b.setDanmakuSpeed(dMSpeedLevelB.getDuration(), true);
                IReporterService iReporterService = danmakuSettingsDialog.f81291c;
                if (iReporterService != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    iReporterService.report(new NeuronsEvents.NormalEvent("player.player.danmaku-set.speed.player", new String[]{"speed", String.format("%s,%s", Arrays.copyOf(new Object[]{Integer.valueOf(((DMSpeedLevel) obj3).ordinal() + 1), Integer.valueOf(dMSpeedLevelB.ordinal() + 1)}, 2))}));
                }
                break;
            default:
                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                VideoTemplateBean videoTemplateBean = (VideoTemplateBean) obj3;
                long j7 = videoTemplateBean.id;
                com.bilibili.upper.module.template.vm.g gVar = (com.bilibili.upper.module.template.vm.g) obj2;
                Bundle bundleJ0 = gVar.J0(1, j7);
                Bundle bundle = bundleJ0.getBundle("bili_param_control");
                if (bundle != null && videoTemplateBean.topicId > 0) {
                    String string = bundle.getString("JUMP_PARAMS");
                    if (!TextUtils.isEmpty(string)) {
                        bundle.putString("JUMP_PARAMS", com.bilibili.studio.centerplus.util.l.a(string, CaptureSchema.TOPIC_ID, String.valueOf(videoTemplateBean.topicId), true));
                    }
                }
                bundleJ0.putBoolean("bbs_key_template_sdk_montage", true);
                bundleJ0.putLong("bbs_key_template_server_id", videoTemplateBean.id);
                bundleJ0.putString("bili_templateUrl", videoTemplateBean.downloadUrl);
                bundleJ0.putString("bbs_key_template_cat_id", String.valueOf(videoTemplateBean.catId));
                String str = videoTemplateBean.name;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                bundleJ0.putString("bbs_key_template_name", str2);
                String str3 = videoTemplateBean.desc;
                if (str3 == null) {
                    str3 = "";
                }
                bundleJ0.putString("bbs_key_template_desc", str3);
                VideoTemplateExtraBean videoTemplateExtraBean = videoTemplateBean.videoTemplateExtraBean;
                bundleJ0.putInt("bili_imageCount", videoTemplateExtraBean != null ? videoTemplateExtraBean.imageCount : 0);
                VideoTemplateExtraBean videoTemplateExtraBean2 = videoTemplateBean.videoTemplateExtraBean;
                bundleJ0.putInt("bili_videoCount", videoTemplateExtraBean2 != null ? videoTemplateExtraBean2.videoCount : 0);
                bundleJ0.putBoolean("template_corresponding_id_force_bind", videoTemplateBean.correspondingForceBind);
                bundleJ0.putString("bili_subScript", EA0.b.c(videoTemplateBean));
                InterfaceC7041a interfaceC7041a = gVar.f114047b.f109914e;
                bundleJ0.putString("bili_subVersion", interfaceC7041a != null ? interfaceC7041a.getBuildVersion() : "2160000");
                bundleJ0.putInt("bili_materialTabIndex", 0);
                VideoTemplateExtraBean videoTemplateExtraBean3 = videoTemplateBean.videoTemplateExtraBean;
                if (videoTemplateExtraBean3 != null) {
                    bundleJ0.putInt("bili_minCount", com.bilibili.studio.videoeditor.extension.k.a(Long.valueOf(videoTemplateExtraBean3.minCount)));
                    bundleJ0.putInt("bili_maxCount", (int) videoTemplateExtraBean3.maxCount);
                    bundleJ0.putSerializable("bbs_key_template_footage_constraint_list", EA0.b.a(videoTemplateBean));
                }
                bundleJ0.putInt("bbs_key_template_select_video_page_from", 1);
                Bundle bundle2 = bundleJ0.getBundle("bili_param_control");
                bundleJ0.remove("bili_param_control");
                bundleJ0.putBundle("bili_innerparam_control", bundle2);
                mutableBundleLike.put("bili_param_control", bundleJ0);
                break;
        }
        return Unit.INSTANCE;
    }
}
