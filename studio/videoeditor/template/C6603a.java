package com.bilibili.studio.videoeditor.template;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.tribe.core.api.BuiltInBundleInfo;
import com.bilibili.lib.tribe.core.api.BundleInfo;
import com.bilibili.lib.tribe.core.api.DynamicBundleInfo;
import com.bilibili.lib.tribe.runtime.TribeApi;
import com.bilibili.studio.comm.manager.hdr.a;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6580q;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.module.tuwen.ITuwenPluginService;
import com.bilibili.studio.module.tuwen.callback.IBCutSoLoader;
import com.bilibili.studio.module.tuwen.model.BCutCodecInfo;
import com.bilibili.studio.module.tuwen.model.BCutDraftInfo;
import com.bilibili.studio.module.tuwen.model.BCutModResources;
import com.bilibili.studio.module.tuwen.model.BCutRequestToDetail;
import com.bilibili.studio.module.tuwen.model.BCutVideoData;
import com.bilibili.studio.module.tuwen.model.PbEngineType;
import com.bilibili.studio.videoeditor.help.compiler.sdk.i;
import com.bilibili.studio.videoeditor.template.bean.BiliDraftInfo;
import com.bilibili.studio.videoeditor.template.util.BiliTemplateEnvironment;
import com.bilibili.tribe.extra.TribeHelper;
import fD0.InterfaceC7041a;
import gD0.InterfaceC7247a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sw0.C8628a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.template.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/a.class */
public final class C6603a implements InterfaceC7041a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ITuwenPluginService f110035b;

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.template.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/a$a.class */
    public static final class C1210a implements IBCutSoLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Application f110036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliTemplateEnvironment f110037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C6603a f110038c;

        public C1210a(Application application, BiliTemplateEnvironment biliTemplateEnvironment, C6603a c6603a) {
            this.f110036a = application;
            this.f110037b = biliTemplateEnvironment;
            this.f110038c = c6603a;
        }

        @Override // com.bilibili.studio.module.tuwen.callback.IBCutSoLoader
        public final BCutModResources getModResources() {
            this.f110038c.getClass();
            return C6603a.v();
        }

        @Override // com.bilibili.studio.module.tuwen.callback.IBCutSoLoader
        public final boolean initEditorEngineSDK() {
            BiliTemplateEnvironment biliTemplateEnvironment = this.f110037b;
            return biliTemplateEnvironment != null ? biliTemplateEnvironment.initEditorEngineSDK(this.f110036a) : false;
        }

        @Override // com.bilibili.studio.module.tuwen.callback.IBCutSoLoader
        public final boolean initVideoCompilerSdk() {
            i.a.a(this.f110036a);
            return true;
        }

        @Override // com.bilibili.studio.module.tuwen.callback.IBCutSoLoader
        public final boolean loadCSharedSo() {
            BiliTemplateEnvironment biliTemplateEnvironment = this.f110037b;
            return biliTemplateEnvironment != null ? biliTemplateEnvironment.loadCSharedSo() : false;
        }
    }

    public static void t(hD0.e eVar) {
        Object obj;
        Object obj2;
        String str = eVar.a;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(TribeHelper.INSTANCE.activateFeatureIfInstalled("editorimagetxt", str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            BLog.wfmt("BiliTemplateEngineControllerImpl", androidx.fragment.app.z.a("ensure template target activation error: target=", eVar.a(), ", error=", th2.getMessage()), new Object[0]);
        }
        Boolean bool = Boolean.FALSE;
        Object obj3 = obj;
        if (Result.isFailure-impl(obj)) {
            obj3 = bool;
        }
        BLog.ifmt("BiliTemplateEngineControllerImpl", com.bilibili.ad.reward.test.K.a("ensure template target activated: target=", eVar.a(), ", activated=", ((Boolean) obj3).booleanValue()), new Object[0]);
        if (str == null && Intrinsics.areEqual("editorimagetxt", "editorimagetxt")) {
            try {
                obj2 = Result.constructor-impl(Boolean.valueOf(TribeHelper.INSTANCE.activateFeatureIfInstalled("editorimagetxt", "bcut_template")));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
            }
            Throwable th4 = Result.exceptionOrNull-impl(obj2);
            if (th4 != null) {
                BLog.wfmt("BiliTemplateEngineControllerImpl", C4496a.a("ensure legacy template module activation error: bundle=editorimagetxt, module=bcut_template, error=", th4.getMessage()), new Object[0]);
            }
            Boolean bool2 = Boolean.FALSE;
            Object obj4 = obj2;
            if (Result.isFailure-impl(obj2)) {
                obj4 = bool2;
            }
            BLog.ifmt("BiliTemplateEngineControllerImpl", com.bilibili.app.comm.bh.x5.b.a("ensure legacy template module activated: bundle=editorimagetxt, module=bcut_template, activated=", ((Boolean) obj4).booleanValue()), new Object[0]);
        }
    }

    public static ITuwenPluginService u() {
        BLRouter bLRouter = BLRouter.INSTANCE;
        ITuwenPluginService iTuwenPluginService = (ITuwenPluginService) bLRouter.get(ITuwenPluginService.class, "ProxyTemplateExternalService");
        ITuwenPluginService iTuwenPluginService2 = iTuwenPluginService;
        if (iTuwenPluginService == null) {
            iTuwenPluginService2 = (ITuwenPluginService) w8.d.a(bLRouter, ITuwenPluginService.class, "ProxyTemplateExternalService");
        }
        return iTuwenPluginService2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.studio.module.tuwen.model.BCutModResources v() {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.C6603a.v():com.bilibili.studio.module.tuwen.model.BCutModResources");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bilibili.studio.module.tuwen.model.BcutRequest, java.lang.Object] */
    @Override // fD0.b
    public final void a(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle, @Nullable Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        StringBuilder sbA = G0.b.a("downloadImageTxtTemplateAndPreprocess...id = ", str, ", url = ", str2, ", extra = ");
        sbA.append(bundle);
        sbA.append(", mService = ");
        sbA.append(iTuwenPluginServiceW);
        BLog.ifmt("BiliTemplateEngineControllerImpl", sbA.toString(), new Object[0]);
        List<Integer> listEmptyList = CollectionsKt.emptyList();
        Bundle bundle2 = new Bundle();
        ?? obj = new Object();
        obj.f108619a = 0;
        obj.f108620b = str;
        obj.f108621c = str2;
        obj.f108622d = listEmptyList;
        obj.f108623e = 0;
        obj.f108624f = true;
        obj.f108625g = bundle2;
        obj.setExtra(bundle);
        ITuwenPluginService iTuwenPluginServiceW2 = w();
        if (iTuwenPluginServiceW2 != 0) {
            iTuwenPluginServiceW2.downloadTemplateAndPreprocess(obj, function1, function12, function2);
        } else {
            function12.invoke(new IllegalStateException("template service missing: target=".concat("editorimagetxt")));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.studio.module.tuwen.model.BcutRequest, java.lang.Object] */
    @Override // fD0.b
    public final void b(@NotNull Bundle bundle) {
        BLog.ifmt("BiliTemplateEngineControllerImpl", "goToImageTxtTemplateListPage...mService = " + w(), new Object[0]);
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        List<Integer> listEmptyList = CollectionsKt.emptyList();
        Bundle bundle2 = new Bundle();
        ?? obj = new Object();
        obj.f108619a = 0;
        obj.f108620b = "";
        obj.f108621c = "";
        obj.f108622d = listEmptyList;
        obj.f108623e = 0;
        obj.f108624f = true;
        obj.f108625g = bundle2;
        bundle.putString("bbs_key_template_track_id", Xz0.g.d());
        obj.setExtra(bundle);
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != 0) {
            iTuwenPluginServiceW.goToTemplateListPage(application, obj);
        }
    }

    @Override // fD0.b
    public final void c(@NotNull C8628a c8628a) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.addStepCallback(c8628a);
        }
    }

    @Override // fD0.b
    public final void cancelAITask(@NotNull String str) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.cancelAITask(str);
        }
    }

    @Override // fD0.b
    public final void closeTemplateEditPage() {
        BLog.ifmt("BiliTemplateEngineControllerImpl", "closeTemplateEditPage...templateType = 0, mService = " + w(), new Object[0]);
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.closeTemplateEditPage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @Override // fD0.b
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.FrameLayout createCollisionView(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.Nullable float[] r6) {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.studio.module.tuwen.ITuwenPluginService r0 = r0.w()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L18
            r0 = r7
            r1 = r5
            r2 = r6
            android.widget.FrameLayout r0 = r0.createCollisionView(r1, r2)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L21
        L18:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
        L21:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.C6603a.createCollisionView(android.content.Context, float[]):android.widget.FrameLayout");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    @Override // fD0.b
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull com.bilibili.lib.fasthybrid.B r11, @org.jetbrains.annotations.NotNull com.bilibili.studio.videoeditor.template.B r12, @org.jetbrains.annotations.NotNull com.bilibili.studio.videoeditor.template.C r13) {
        /*
            r9 = this;
            r0 = r9
            com.bilibili.studio.module.tuwen.ITuwenPluginService r0 = r0.w()
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L26
            r0 = r14
            java.lang.String r1 = "ai_title_pink"
            r2 = r10
            java.lang.String r3 = ""
            java.lang.Class<com.bilibili.studio.editor.smarttitle.entity.aitask.SmartTitleAITaskResult> r4 = com.bilibili.studio.editor.smarttitle.entity.aitask.SmartTitleAITaskResult.class
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.String r0 = r0.createAndLoopAITask(r1, r2, r3, r4, r5, r6, r7)
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L29
        L26:
            java.lang.String r0 = ""
            r10 = r0
        L29:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.C6603a.d(java.lang.String, com.bilibili.lib.fasthybrid.B, com.bilibili.studio.videoeditor.template.B, com.bilibili.studio.videoeditor.template.C):java.lang.String");
    }

    @Override // fD0.b
    public final boolean destroyCollisionView(@NotNull FrameLayout frameLayout) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        return iTuwenPluginServiceW != null ? iTuwenPluginServiceW.destroyCollisionView(frameLayout) : false;
    }

    @Override // fD0.b
    public final void e(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull String str2, @Nullable BCutCodecInfo bCutCodecInfo, @NotNull List list, @NotNull String str3, @NotNull zC0.d dVar, @NotNull KH.h hVar, @Nullable KH.i iVar) {
        int size = ((ArrayList) list).size();
        ITuwenPluginService iTuwenPluginServiceW = w();
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(size, "renderVideo...videItems size", " templateId:", str, " mService = ");
        sbB.append(iTuwenPluginServiceW);
        BLog.ifmt("BiliTemplateEngineControllerImpl", sbB.toString(), new Object[0]);
        ITuwenPluginService iTuwenPluginServiceW2 = w();
        if (iTuwenPluginServiceW2 != null) {
            iTuwenPluginServiceW2.renderVideo(fragmentActivity, str, str2, 8, bCutCodecInfo, list, KaleidoscopeFactory.SDK_MON, str3, dVar, hVar, iVar);
        }
    }

    @Override // fD0.b
    public final void f(@Nullable Activity activity, @NotNull String str, @NotNull Bundle bundle, @Nullable Integer num) {
        int iIntValue = 0;
        BLog.ifmt("BiliTemplateEngineControllerImpl", "goToImageTxtTemplateEditPage...mService = " + w(), new Object[0]);
        Context context = activity;
        if (activity == null) {
            Application application = BiliContext.application();
            context = application;
            if (application == null) {
                return;
            }
        }
        if (num != null) {
            iIntValue = num.intValue();
        }
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.goToTemplateDetailPage(context, new BCutRequestToDetail(iIntValue, str, bundle, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.bilibili.studio.module.tuwen.model.BcutRequest, java.lang.Object] */
    @Override // fD0.b
    public final void g(@Nullable Activity activity, @NotNull String str, @NotNull String str2, int i7) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "cancelPreprocess...templateType = ", ", id = ", str, ", url = ");
        sbB.append(str2);
        sbB.append(", mService = ");
        sbB.append(iTuwenPluginServiceW);
        BLog.ifmt("BiliTemplateEngineControllerImpl", sbB.toString(), new Object[0]);
        boolean z6 = true;
        if ((56 & 1) != 0) {
            i7 = 0;
        }
        if ((56 & 2) != 0) {
            str = "";
        }
        if ((56 & 4) != 0) {
            str2 = "";
        }
        List<Integer> listEmptyList = (56 & 8) != 0 ? CollectionsKt.emptyList() : null;
        if ((56 & 32) == 0) {
            z6 = false;
        }
        Bundle bundle = new Bundle();
        ?? obj = new Object();
        obj.f108619a = i7;
        obj.f108620b = str;
        obj.f108621c = str2;
        obj.f108622d = listEmptyList;
        obj.f108623e = 0;
        obj.f108624f = z6;
        obj.f108625g = bundle;
        ITuwenPluginService iTuwenPluginServiceW2 = w();
        if (iTuwenPluginServiceW2 != 0) {
            iTuwenPluginServiceW2.cancelPreprocess(activity, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // fD0.b
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getBuildVersion() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.studio.module.tuwen.ITuwenPluginService r0 = r0.w()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L19
            r0 = r3
            int r0 = r0.getBuildVersion()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1d
        L19:
            java.lang.String r0 = "2160000"
            r3 = r0
        L1d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.C6603a.getBuildVersion():java.lang.String");
    }

    @Override // fD0.b
    @Nullable
    public final Object h(int i7, @NotNull String str) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "deleteDraft...templateType = ", ", draftId = ", str, ", mService = ");
        sbB.append(iTuwenPluginServiceW);
        BLog.ifmt("BiliTemplateEngineControllerImpl", sbB.toString(), new Object[0]);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ITuwenPluginService iTuwenPluginServiceW2 = w();
        if (iTuwenPluginServiceW2 != null) {
            iTuwenPluginServiceW2.deleteDraft(i7, str, new HH.a(booleanRef, 3));
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    @Override // fD0.b
    public final boolean i(@Nullable BiliTemplateEnvironment biliTemplateEnvironment) {
        BLog.ifmt("BiliTemplateEngineControllerImpl", "initialize...mService = " + w(), new Object[0]);
        Application application = BiliContext.application();
        boolean zDoBeforeLaunch = false;
        if (application != null) {
            ITuwenPluginService iTuwenPluginServiceW = w();
            zDoBeforeLaunch = false;
            if (iTuwenPluginServiceW != null) {
                iTuwenPluginServiceW.registerSoLoader(new C1210a(application, biliTemplateEnvironment, this));
                zDoBeforeLaunch = iTuwenPluginServiceW.doBeforeLaunch(application);
                Lazy<com.bilibili.studio.comm.manager.hdr.a> lazy = com.bilibili.studio.comm.manager.hdr.a.f105396e;
                boolean zG = a.C1185a.a().g();
                boolean zE = a.C1185a.a().e();
                float fA = a.C1185a.a().a();
                Lazy lazy2 = zw0.b.f130950a;
                boolean withDefault = ConfigManager.Companion.ab2().getWithDefault("upper.enable_hdr_export_trans_check", false);
                StringBuilder sbA = c6.Q.a("initialize, ", ", ", ", ", zE, zE);
                sbA.append(fA);
                sbA.append(", ");
                sbA.append(withDefault);
                BLog.e("BiliTemplateEngineControllerImpl", sbA.toString());
                iTuwenPluginServiceW.enableHdr(zG, zE, fA, withDefault);
            }
        }
        return zDoBeforeLaunch;
    }

    @Override // fD0.b
    public final boolean isCollisionAnimating(@NotNull FrameLayout frameLayout) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        return iTuwenPluginServiceW != null ? iTuwenPluginServiceW.isCollisionAnimating(frameLayout) : false;
    }

    @Override // fD0.c
    public final boolean j() {
        hD0.e eVar = new hD0.e();
        ITuwenPluginService iTuwenPluginServiceU = u();
        boolean z6 = true;
        if (iTuwenPluginServiceU != null) {
            BLog.ifmt("BiliTemplateEngineControllerImpl", "template service already registered: target=".concat(eVar.a()), new Object[0]);
            this.f110035b = iTuwenPluginServiceU;
            return true;
        }
        BundleInfo bundleInfo = TribeApi.INSTANCE.get("editorimagetxt");
        if (bundleInfo instanceof DynamicBundleInfo) {
            BLog.ifmt("BiliTemplateEngineControllerImpl", " bundleInfo is DynamicBundleInfo = " + bundleInfo, new Object[0]);
            t(eVar);
            ITuwenPluginService iTuwenPluginServiceU2 = u();
            if (iTuwenPluginServiceU2 != null) {
                this.f110035b = iTuwenPluginServiceU2;
            } else {
                BLog.wfmt("BiliTemplateEngineControllerImpl", "template service missing for installed target=".concat(eVar.a()), new Object[0]);
                z6 = false;
            }
        } else {
            if (bundleInfo instanceof BuiltInBundleInfo) {
                BLog.wfmt("BiliTemplateEngineControllerImpl", " bundleInfo is BuiltInBundleInfo = " + bundleInfo, new Object[0]);
                t(eVar);
                ITuwenPluginService iTuwenPluginServiceU3 = u();
                if (iTuwenPluginServiceU3 != null) {
                    this.f110035b = iTuwenPluginServiceU3;
                } else {
                    BLog.wfmt("BiliTemplateEngineControllerImpl", "template service missing for built-in target=".concat(eVar.a()), new Object[0]);
                }
            } else {
                BLog.wfmt("BiliTemplateEngineControllerImpl", " bundleInfo is StubBundleInfo = " + bundleInfo, new Object[0]);
            }
            z6 = false;
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.bilibili.studio.module.tuwen.model.BcutRequest, java.lang.Object] */
    @Override // fD0.b
    public final void k(@NotNull Activity activity, int i7, @NotNull String str, @NotNull String str2, @NotNull Bundle bundle, @Nullable com.bilibili.upper.module.contribute.picker.model.q qVar, @NotNull Function1 function1, @NotNull Function1 function12) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        StringBuilder sbA = G0.b.a("downloadTemplate...templateType = 1, id = ", str, ", url = ", str2, ", extra = ");
        sbA.append(bundle);
        sbA.append(", mService = ");
        sbA.append(iTuwenPluginServiceW);
        BLog.ifmt("BiliTemplateEngineControllerImpl", sbA.toString(), new Object[0]);
        boolean z6 = bundle.getBoolean("default_template_loader", true);
        List<Integer> listEmptyList = CollectionsKt.emptyList();
        Bundle bundle2 = new Bundle();
        ?? obj = new Object();
        obj.f108619a = 1;
        obj.f108620b = str;
        obj.f108621c = str2;
        obj.f108622d = listEmptyList;
        obj.f108623e = i7;
        obj.f108624f = z6;
        obj.f108625g = bundle2;
        obj.setExtra(bundle);
        ITuwenPluginService iTuwenPluginServiceW2 = w();
        if (iTuwenPluginServiceW2 != 0) {
            iTuwenPluginServiceW2.downloadTemplate(activity, obj, qVar, function1, function12);
        } else {
            function12.invoke(new IllegalStateException("template service missing: target=".concat("editorimagetxt")));
        }
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.studio.module.tuwen.model.BcutRequest, java.lang.Object] */
    @Override // fD0.b
    public final void l(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull List list, int i7, @Nullable Bundle bundle, @Nullable Function2 function2, @NotNull Function3 function3, @NotNull Function1 function1) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW == 0) {
            function1.invoke(new IllegalStateException("template service missing: target=".concat("editorimagetxt")));
            return;
        }
        Bundle bundle2 = new Bundle();
        ?? obj = new Object();
        obj.f108619a = 1;
        obj.f108620b = str;
        obj.f108621c = str2;
        obj.f108622d = list;
        obj.f108623e = i7;
        obj.f108624f = true;
        obj.f108625g = bundle2;
        obj.getExtra().putAll(bundle);
        Unit unit = Unit.INSTANCE;
        iTuwenPluginServiceW.loadTimeline(activity, obj, 2, function2, function3, function1);
    }

    @Override // fD0.b
    public final void m(@NotNull Activity activity, @Nullable String str, @NotNull List list, @Nullable Map map, @NotNull Function1 function1, @NotNull Function1 function12) {
        BLog.ifmt("BiliTemplateEngineControllerImpl", "startPreprocessMaterials...videItems size" + list.size() + " mService = " + w(), new Object[0]);
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.startPreprocessMaterials(activity, str, hD0.a.a(list), map, new OL.a(function1, 3), new OL.b(function12, 2), null);
        }
    }

    @Override // fD0.b
    public final boolean n() {
        return this.f110035b != null;
    }

    @Override // fD0.b
    public final void o(@NotNull List list, @NotNull PbEngineType pbEngineType, @NotNull C6580q c6580q, @NotNull com.bilibili.studio.editor.moudle.intelligence.vm.logic.r rVar) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.downloadPbMaterials(list, "bili_smart", pbEngineType, c6580q, rVar);
        }
    }

    @Override // fD0.b
    public final void openVideoCrop(@NotNull Context context, @NotNull BCutVideoData bCutVideoData, @Nullable String str) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.openVideoCrop(context, bCutVideoData, str);
        }
    }

    @Override // fD0.b
    public final void p(@Nullable InterfaceC7247a interfaceC7247a) {
        BLog.ifmt("BiliTemplateEngineControllerImpl", "registerBusinessAction...mService = " + w(), new Object[0]);
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.registerBusinessAcion(new com.bilibili.bililive.biz.pkv2.ui.container.m(interfaceC7247a));
        }
    }

    @Override // fD0.b
    public final void parseIntent2BCutVideoData(@Nullable Intent intent, @NotNull BCutVideoData bCutVideoData) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.parseIntent2BCutVideoData(intent, bCutVideoData);
        }
    }

    @Override // fD0.b
    public final void q(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
        BLog.ifmt("BiliTemplateEngineControllerImpl", "openDraft...context = " + context + ", templateType = 0, draftId = " + str + ", extra = " + bundle + ", mService = " + w(), new Object[0]);
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.openDraft(context, 0, str, bundle);
        }
    }

    @Override // fD0.b
    @Nullable
    public final Object queryAllDrafts(int i7) {
        List<BCutDraftInfo> listQueryAllDrafts;
        BLog.ifmt("BiliTemplateEngineControllerImpl", "queryAllDrafts...templateType = " + i7 + ", mService = " + w(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null && (listQueryAllDrafts = iTuwenPluginServiceW.queryAllDrafts(i7)) != null) {
            for (BCutDraftInfo bCutDraftInfo : listQueryAllDrafts) {
                arrayList.add(new BiliDraftInfo(bCutDraftInfo.getId(), bCutDraftInfo.getTitle(), bCutDraftInfo.getCreateTime(), bCutDraftInfo.getUpdateTime(), bCutDraftInfo.getCover(), bCutDraftInfo.getDuration(), bCutDraftInfo.getSize()));
            }
        }
        return arrayList;
    }

    @Override // fD0.c
    public final void r(@Nullable g0 g0Var) {
        hD0.e eVar = new hD0.e();
        if (w() != null) {
            BLog.ifmt("BiliTemplateEngineControllerImpl", "installTemplateTribe skipped, template service ready target=".concat(eVar.a()), new Object[0]);
            g0Var.b();
        } else {
            BLog.ifmt("BiliTemplateEngineControllerImpl", "installTemplateTribe getAndInstall target=".concat(eVar.a()), new Object[0]);
            TribeHelper.INSTANCE.getAndInstall("editorimagetxt", (String) null, new C6604b(g0Var, this, eVar));
        }
    }

    @Override // fD0.b
    public final void release() {
        BLog.ifmt("BiliTemplateEngineControllerImpl", "release...mService = " + w(), new Object[0]);
        this.f110035b = null;
        hD0.d.a.getClass();
        hD0.d.b = null;
    }

    @Override // fD0.b
    public final void releaseAllAITask() {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.releaseAllAITask();
        }
    }

    @Override // fD0.b
    public final void releaseTemplate() {
        BLog.ifmt("BiliTemplateEngineControllerImpl", "releaseTemplate", new Object[0]);
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.releaseTemplate();
        }
    }

    @Override // fD0.b
    public final <T> void requestAITask(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Class<T> cls, @NotNull Function3<? super String, ? super String, ? super T, Unit> function3, @NotNull Function2<? super Integer, ? super String, Unit> function2) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.requestAITask(str, str2, str3, cls, function3, function2);
        }
    }

    @Override // fD0.b
    public final void s(@NotNull Bundle bundle, @NotNull String str) {
        ITuwenPluginService iTuwenPluginServiceW;
        BLog.ifmt("BiliTemplateEngineControllerImpl", "goToUgcTemplatePreviewPage...mService = " + w(), new Object[0]);
        Application application = BiliContext.application();
        if (application == null || (iTuwenPluginServiceW = w()) == null) {
            return;
        }
        iTuwenPluginServiceW.goToUGCTemplatePreviewPage(application, new BCutRequestToDetail(1, str, bundle, null));
    }

    @Override // fD0.b
    public final boolean startCollisionAnim(@NotNull FrameLayout frameLayout) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        return iTuwenPluginServiceW != null ? iTuwenPluginServiceW.startCollisionAnim(frameLayout) : false;
    }

    @Override // fD0.b
    public final boolean stopCollisionAnim(@NotNull FrameLayout frameLayout) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        return iTuwenPluginServiceW != null ? iTuwenPluginServiceW.stopCollisionAnim(frameLayout) : false;
    }

    @Override // fD0.b
    public final void stopPreprocessMaterials() {
        BLog.dfmt("BiliTemplateEngineControllerImpl", "stopPreprocessMaterials...mService = " + w(), new Object[0]);
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.stopPreprocessMaterials();
        }
    }

    @Override // fD0.b
    public final void transferMmkvDataToBlkv(@Nullable Context context) {
        ITuwenPluginService iTuwenPluginServiceW = w();
        if (iTuwenPluginServiceW != null) {
            iTuwenPluginServiceW.transferMmkvDataToBlkv(context);
        }
    }

    public final ITuwenPluginService w() {
        BLog.vfmt("BiliTemplateEngineControllerImpl", "getService...mService = " + this.f110035b, new Object[0]);
        hD0.e eVar = new hD0.e();
        if (this.f110035b == null) {
            t(eVar);
            ITuwenPluginService iTuwenPluginServiceU = u();
            this.f110035b = iTuwenPluginServiceU;
            if (iTuwenPluginServiceU == null) {
                BLog.wfmt("BiliTemplateEngineControllerImpl", "template service missing after activation: target=".concat(eVar.a()), new Object[0]);
            }
        }
        return this.f110035b;
    }
}
