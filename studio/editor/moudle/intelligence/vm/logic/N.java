package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.asr.bean.CaptionRecognition;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/N.class */
public final class N extends C9270a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f107741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public IntelligenceMusicInfo f107742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public List<String> f107743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public IntelligenceAudioConfig f107744g;

    @Nullable
    public List<CaptionRecognition> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public IntelligenceTemplateInfo f107745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public EditorTemplateTabItemBean f107746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public T f107747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f107748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Map<String, String> f107749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f107750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f107751o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/N$a.class */
    public interface a {
        void a(@Nullable EditVideoInfo editVideoInfo, boolean z6, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/N$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final N f107752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f107753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f107754c;

        public b(N n7, a aVar, long j7) {
            this.f107752a = n7;
            this.f107753b = aVar;
            this.f107754c = j7;
        }

        public final void a() {
            N n7 = this.f107752a;
            IntelligenceTemplateInfo intelligenceTemplateInfo = n7.f107745i;
            if (intelligenceTemplateInfo != null) {
                intelligenceTemplateInfo.templateId = 0L;
            }
            n7.f(this.f107753b, this.f107754c);
        }
    }

    public final boolean d() {
        IntelligenceAudioConfig intelligenceAudioConfig;
        IntelligenceAudioConfig intelligenceAudioConfig2;
        BLog.e("IntelligenceProjectLogic", "isHaveNoData intelligenceMusicInfo=" + this.f107742e + ",asrParseResult=" + this.f107744g + ",captionList=" + this.h);
        IntelligenceMusicInfo intelligenceMusicInfo = this.f107742e;
        boolean z6 = true;
        if (intelligenceMusicInfo == null && this.f107745i == null && this.h == null) {
            return true;
        }
        boolean z7 = intelligenceMusicInfo == null || !((intelligenceAudioConfig = this.f107744g) == null || intelligenceAudioConfig.autoBgm);
        List<CaptionRecognition> list = this.h;
        boolean z8 = list == null || list.isEmpty() || !((intelligenceAudioConfig2 = this.f107744g) == null || intelligenceAudioConfig2.autoASR);
        if (!z7 || !z8 || this.f107745i != null) {
            z6 = false;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.bilibili.studio.editor.moudle.intelligence.vm.logic.N.a r9, long r10) {
        /*
            Method dump skipped, instruction units count: 1671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.logic.N.e(com.bilibili.studio.editor.moudle.intelligence.vm.logic.N$a, long):void");
    }

    public final void f(a aVar, long j7) {
        Integer num;
        IntelligenceAudioConfig intelligenceAudioConfig = this.f107744g;
        EditVideoInfo editVideoInfo = this.f130974a;
        if (intelligenceAudioConfig != null && (num = intelligenceAudioConfig.audioSrcVolume) != null) {
            float fIntValue = num.intValue() / 100;
            if (editVideoInfo != null) {
                editVideoInfo.setConfigSrcVolume(fIntValue);
            }
            if (editVideoInfo != null) {
                editVideoInfo.setUserTrackNativeVolume(fIntValue);
            }
        }
        aVar.a(editVideoInfo, true, System.currentTimeMillis() - j7);
    }

    public final void g(a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f107751o) {
            return;
        }
        this.f107751o = true;
        if (this.f130974a == null) {
            return;
        }
        if (d()) {
            aVar.a(this.f130974a, false, 0L);
        } else {
            e(aVar, jCurrentTimeMillis);
        }
    }
}
