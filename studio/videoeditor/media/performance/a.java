package com.bilibili.studio.videoeditor.media.performance;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.videoeditor.media.performance.BeautifyConfigV1;
import com.bilibili.studio.videoeditor.media.performance.BeautifyTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tv.danmaku.android.log.BLog;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/performance/a.class */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f109838e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile BeautifyTemplate f109841c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f109839a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f109840b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f109842d = 2;

    public static BeautifyTemplate.TemplateParams d(int i7, String str) {
        BeautifyTemplate.TemplateParams templateParams = new BeautifyTemplate.TemplateParams();
        templateParams.id = i7;
        templateParams.name = str;
        BeautifyConfigV1.BeautifyParams beautifyParams = new BeautifyConfigV1.BeautifyParams();
        templateParams.beautifyParams = beautifyParams;
        beautifyParams.filterAverageSkinColor = -0.1f;
        beautifyParams.smoothStrength = -0.8f;
        beautifyParams.sharpen = 0.0f;
        beautifyParams.whitening = -0.2f;
        beautifyParams.filterStyleAdjustment = 1.0f;
        beautifyParams.redden = -1.0f;
        beautifyParams.removeNasolabialFolds = 0.0f;
        beautifyParams.removeDarkCircle = -0.4f;
        beautifyParams.brightEye = -1.0f;
        beautifyParams.eyeDistance = 0.0f;
        beautifyParams.eyeEnlarging = -0.4f;
        beautifyParams.filterEyesVerticalMove = 0.0f;
        beautifyParams.filterEyebrow = -0.4f;
        beautifyParams.roundEye = -1.0f;
        beautifyParams.openCanthus = -0.2f;
        beautifyParams.outerCanthus = -0.6f;
        beautifyParams.eyeAngle = 0.0f;
        beautifyParams.appleMuscle = -1.0f;
        beautifyParams.hairline = 0.65f;
        beautifyParams.thinFace = -0.9f;
        beautifyParams.shrinkJaw = -0.7f;
        beautifyParams.narrowFace = -0.8f;
        beautifyParams.shrinkCheekbone = -0.8f;
        beautifyParams.shrinkUnderJaw = -0.9f;
        beautifyParams.chinLength = 0.0f;
        beautifyParams.sharpChin = 0.0f;
        beautifyParams.filterBridgeOfNose = -0.6f;
        beautifyParams.profileRhinoplasty = -1.0f;
        beautifyParams.narrowNose = 0.3f;
        beautifyParams.filterRootOfNose = 0.4f;
        beautifyParams.wingOfNose = -1.0f;
        beautifyParams.longNose = 0.0f;
        beautifyParams.mouthSize = 0.2f;
        beautifyParams.lip = 0.0f;
        beautifyParams.philtrum = 0.65f;
        beautifyParams.whiteTeeth = -0.5f;
        beautifyParams.mapParams();
        return templateParams;
    }

    public static a e() {
        if (f109838e == null) {
            synchronized (a.class) {
                try {
                    if (f109838e == null) {
                        f109838e = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f109838e;
    }

    public static int h() {
        Application application = BiliContext.application();
        if (application == null) {
            return 2;
        }
        return j.a(application).b("capture_last_grade", 2);
    }

    public final void a(BeautifyConfigV1 beautifyConfigV1) {
        this.f109841c = new BeautifyTemplate();
        this.f109841c.grade = 0;
        this.f109841c.isConfigured = true;
        this.f109841c.templateParamsList.clear();
        List<BeautifyTemplate.TemplateParams> list = this.f109841c.templateParamsList;
        ArrayList arrayList = new ArrayList();
        for (BeautifyConfigV1.TemplateConfig templateConfig : beautifyConfigV1.templates) {
            BeautifyTemplate.TemplateParams templateParams = new BeautifyTemplate.TemplateParams();
            templateParams.id = templateConfig.id;
            templateParams.name = templateConfig.name;
            Iterator<BeautifyConfigV1.GradeConfig> it = templateConfig.gradeConfigs.iterator();
            while (true) {
                if (it.hasNext()) {
                    BeautifyConfigV1.GradeConfig next = it.next();
                    if (next.grade == 0) {
                        next.config.mapParams();
                        templateParams.beautifyParams = next.config;
                        break;
                    }
                }
            }
            arrayList.add(templateParams);
        }
        list.addAll(arrayList);
        this.f109841c.frontCameraTemplateId = beautifyConfigV1.frontCamera.templateId;
        this.f109841c.backCameraTemplateId = beautifyConfigV1.backCamera.templateId;
    }

    public final void b() {
        this.f109841c = new BeautifyTemplate();
        this.f109841c.isConfigured = false;
        this.f109841c.grade = 2;
        this.f109841c.templateParamsList.add(d(1, BiliContext.application().getString(2131841957)));
        this.f109841c.templateParamsList.add(d(4, BiliContext.application().getString(2131841906)));
        this.f109841c.frontCameraTemplateId = 1;
        this.f109841c.backCameraTemplateId = 1;
    }

    public final BeautifyTemplate c() {
        if (this.f109841c == null) {
            b();
        }
        return this.f109841c;
    }

    public final int f() {
        if (!this.f109840b.get()) {
            this.f109839a = h();
        }
        return this.f109839a;
    }

    public final void g() {
        BeautifyConfigV1 beautifyConfigV1 = null;
        String string = j.a(BiliContext.application()).a.getString("capture_default_beautify_v1", null);
        BLog.e("a", " initBeautifyFromSp 从sp中读取数据 spConfig=" + string);
        if (TextUtils.isEmpty(string)) {
            b();
            return;
        }
        try {
            beautifyConfigV1 = (BeautifyConfigV1) JSON.parseObject(string, BeautifyConfigV1.class);
        } catch (Exception e7) {
        }
        if (beautifyConfigV1 == null) {
            b();
        } else {
            a(beautifyConfigV1);
        }
    }
}
