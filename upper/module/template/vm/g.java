package com.bilibili.upper.module.template.vm;

import Xz0.k;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5789i;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.template.data.VideoTemplateBean;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import gD0.InterfaceC7248b;
import java.util.HashMap;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/g.class */
@StabilityInferred(parameters = 0)
public final class g extends ZA0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliTemplateEngineManager f114047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f114048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f114049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, String>> f114050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public VideoTemplateBean f114051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f114052g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f114053i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/g$a.class */
    public static final class a implements InterfaceC7248b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f114054a;

        public a(g gVar) {
            this.f114054a = gVar;
        }

        @Override // gD0.InterfaceC7248b
        public final void K8() {
            this.f114054a.f114049d.postValue(-1);
        }

        @Override // gD0.InterfaceC7248b
        public final void Z2(int i7) {
            this.f114054a.f114049d.postValue(Integer.valueOf(i7));
        }

        @Override // gD0.InterfaceC7248b
        public final void f1() {
            this.f114054a.f114049d.postValue(101);
        }
    }

    public g() {
        BiliTemplateEngineManager biliTemplateEngineManager = new BiliTemplateEngineManager(0);
        biliTemplateEngineManager.i(BiliContext.application());
        this.f114047b = biliTemplateEngineManager;
        this.f114049d = new MutableLiveData<>();
        this.f114050e = new MutableLiveData<>();
        this.f114052g = "";
        this.f114053i = "";
        biliTemplateEngineManager.f109919k = new a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I0(@org.jetbrains.annotations.Nullable android.app.Activity r12) {
        /*
            r11 = this;
            r0 = r11
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.f114049d
            r1 = 101(0x65, float:1.42E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setValue(r1)
            long r0 = java.lang.System.currentTimeMillis()
            r14 = r0
            r0 = r11
            long r0 = r0.f114048c
            r16 = r0
            r0 = r11
            com.bilibili.studio.template.data.VideoTemplateBean r0 = r0.f114051f
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L34
            r0 = r18
            long r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r19 = r0
            r0 = r19
            r18 = r0
            r0 = r19
            if (r0 != 0) goto L38
        L34:
            java.lang.String r0 = ""
            r18 = r0
        L38:
            TE0.b r0 = TE0.b.f24088a
            java.lang.Class r0 = r0.getClass()
            r0 = r14
            r1 = r16
            long r0 = r0 - r1
            java.lang.String r1 = "text"
            r2 = r18
            java.lang.String r3 = "cancel"
            TE0.b.e0(r0, r1, r2, r3)
            r0 = r11
            com.bilibili.studio.template.data.VideoTemplateBean r0 = r0.f114051f
            r18 = r0
            r0 = r18
            if (r0 == 0) goto Laa
            r0 = r18
            boolean r0 = EA0.b.g(r0)
            if (r0 == 0) goto L64
            r0 = 0
            r13 = r0
            goto L66
        L64:
            r0 = -1
            r13 = r0
        L66:
            r0 = r18
            boolean r0 = EA0.b.h(r0)
            if (r0 == 0) goto L73
            r0 = 1
            r13 = r0
            goto L73
        L73:
            r0 = r13
            r1 = -1
            if (r0 != r1) goto L79
            return
        L79:
            r0 = r18
            long r0 = r0.id
            r14 = r0
            r0 = r18
            java.lang.String r0 = r0.downloadUrl
            r19 = r0
            r0 = r11
            com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager r0 = r0.f114047b
            r18 = r0
            r0 = r18
            java.lang.Class r0 = r0.getClass()
            r0 = r18
            r1 = 0
            r2 = 1
            com.bilibili.studio.videoeditor.template.k r3 = new com.bilibili.studio.videoeditor.template.k
            r4 = r3
            r5 = r18
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r9 = r19
            r4.<init>(r5, r6, r7, r8, r9)
            r0.e(r1, r2, r3)
        Laa:
            r0 = r11
            r1 = 0
            r0.f114051f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.template.vm.g.I0(android.app.Activity):void");
    }

    public final Bundle J0(int i7, long j7) {
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        HashMap map = (HashMap) Xz0.j.b(k.f28474a);
        String str = (String) map.get("first_entrance");
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        String str3 = (String) map.get("send_channel");
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        String str5 = (String) map.get("video_template");
        String str6 = str5;
        if (str5 == null) {
            str6 = "";
        }
        String str7 = (String) map.get("template_page_from");
        String str8 = str7 != null ? str7 : "";
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("JUMP_PARAMS", this.f114052g);
        bundle2.putBoolean("is_new_ui", this.h);
        bundle2.putInt("bbs_key_template_type", i7);
        bundle2.putString("bbs_key_first_entrance_v2", str2);
        bundle2.putString("bbs_key_relation_from_v2", this.f114053i);
        bundle2.putString("bbs_key_video_template", str6);
        bundle2.putString("bbs_key_send_channel", str4);
        bundle2.putString("bbs_key_templates_abtest", "a");
        bundle2.putString("bbs_key_template_page_from_v2", str8);
        bundle2.putLong("bbs_key_template_server_id", j7);
        bundle.putBundle("bili_param_control", bundle2);
        bundle.putInt("bbs_key_template_type", i7);
        bundle.putString("bbs_key_first_entrance_v2", str2);
        bundle.putString("bbs_key_relation_from_v2", this.f114053i);
        bundle.putString("bbs_key_video_template", str6);
        bundle.putString("bbs_key_send_channel", str4);
        bundle.putString("bbs_key_templates_abtest", "a");
        bundle.putString("bbs_key_template_page_from_v2", str8);
        if (i7 == 0) {
            bundle.putInt("bili_needNumber", 1);
            bundle.putInt("bili_filledNumber", 1);
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(final java.lang.String r18, com.bilibili.studio.template.data.VideoTemplateBean r19, final android.os.Bundle r20, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r21, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r22, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r23, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.template.vm.g.K0(java.lang.String, com.bilibili.studio.template.data.VideoTemplateBean, android.os.Bundle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    public final void L0(@NotNull VideoTemplateBean videoTemplateBean, @Nullable Context context) {
        if (context == null) {
            return;
        }
        EA0.b.i(videoTemplateBean);
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/material/choose")).extras(new C5789i(1, this, videoTemplateBean)).build(), BiliContext.application());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M0() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r7 = r0
            r0 = r6
            long r0 = r0.f114048c
            r9 = r0
            r0 = r6
            com.bilibili.studio.template.data.VideoTemplateBean r0 = r0.f114051f
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L27
            r0 = r11
            long r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L2b
        L27:
            java.lang.String r0 = ""
            r11 = r0
        L2b:
            TE0.b r0 = TE0.b.f24088a
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            r1 = r9
            long r0 = r0 - r1
            java.lang.String r1 = "text"
            r2 = r11
            java.lang.String r3 = "fail"
            TE0.b.e0(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.template.vm.g.M0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0() {
        /*
            r6 = this;
            r0 = r6
            long r1 = java.lang.System.currentTimeMillis()
            r0.f114048c = r1
            r0 = r6
            com.bilibili.studio.template.data.VideoTemplateBean r0 = r0.f114051f
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1e
            r0 = r7
            long r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L21
        L1e:
            java.lang.String r0 = ""
            r7 = r0
        L21:
            TE0.b r0 = TE0.b.f24088a
            java.lang.Class r0 = r0.getClass()
            r0 = 0
            java.lang.String r1 = "text"
            r2 = r7
            java.lang.String r3 = "start"
            TE0.b.e0(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.template.vm.g.N0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r7 = r0
            r0 = r6
            long r0 = r0.f114048c
            r9 = r0
            r0 = r6
            com.bilibili.studio.template.data.VideoTemplateBean r0 = r0.f114051f
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L27
            r0 = r11
            long r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L2b
        L27:
            java.lang.String r0 = ""
            r11 = r0
        L2b:
            TE0.b r0 = TE0.b.f24088a
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            r1 = r9
            long r0 = r0 - r1
            java.lang.String r1 = "text"
            r2 = r11
            java.lang.String r3 = "success"
            TE0.b.e0(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.template.vm.g.O0():void");
    }
}
