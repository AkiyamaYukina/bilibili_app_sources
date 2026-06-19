package com.bilibili.upper.module.cover.ui;

import android.net.Uri;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.upper.module.contribute.up.dialog.UpperLoadingDialog;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView;
import eJ0.C6935m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperCoverEditorActivity f112753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpperLoadingDialog f112754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112755c;

    public /* synthetic */ c(UpperLoadingDialog upperLoadingDialog, UpperCoverEditorActivity upperCoverEditorActivity, String str) {
        this.f112753a = upperCoverEditorActivity;
        this.f112754b = upperLoadingDialog;
        this.f112755c = str;
    }

    public final Object invoke(Object obj) {
        MultiCoverDraftService multiCoverDraftService;
        MultiCoverConfig multiCoverConfig;
        MultiCoverConfig multiCoverConfig2;
        final String str = (String) obj;
        int i7 = UpperCoverEditorActivity.f112688Y;
        final UpperCoverEditorActivity upperCoverEditorActivity = this.f112753a;
        upperCoverEditorActivity.e7();
        KH0.i iVar = upperCoverEditorActivity.f112700L;
        if (iVar != null && !upperCoverEditorActivity.Y6()) {
            upperCoverEditorActivity.b7(iVar);
        }
        SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
        KH0.i iVar2 = upperCoverEditorActivity.f112700L;
        MultiCoverDraft multiCoverDraftE = JH0.a.e((iVar2 == null || (multiCoverConfig2 = iVar2.f12745c) == null) ? null : multiCoverConfig2.getSubCoverKey());
        if (upperCoverEditorActivity.f112702N == null && multiCoverDraftE != null) {
            upperCoverEditorActivity.T6();
        }
        KH0.i iVar3 = upperCoverEditorActivity.f112702N;
        final UpperLoadingDialog upperLoadingDialog = this.f112754b;
        if (iVar3 == null) {
            if (C6935m.a(upperLoadingDialog.getContext())) {
                upperLoadingDialog.dismissAllowingStateLoss();
            }
            KH0.i iVar4 = upperCoverEditorActivity.f112700L;
            MultiCoverDraft multiCoverDraftE2 = JH0.a.e((iVar4 == null || (multiCoverConfig = iVar4.f12745c) == null) ? null : multiCoverConfig.getSubCoverKey());
            String coverPath = null;
            if (multiCoverDraftE2 != null) {
                coverPath = multiCoverDraftE2.getCoverPath();
            }
            int i8 = UpperCoverPreviewActivity.f112723H;
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper//cover_preview/")).extras(new l(upperCoverEditorActivity.f112706R, str, coverPath)).build(), upperCoverEditorActivity);
        } else {
            MultiCoverOperateView multiCoverOperateView = upperCoverEditorActivity.f112694F;
            if (multiCoverOperateView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subCoverOperateView");
                multiCoverOperateView = null;
            }
            multiCoverOperateView.a(upperCoverEditorActivity.f112702N);
            KH0.i iVar5 = upperCoverEditorActivity.f112702N;
            if (iVar5 != null && (multiCoverDraftService = iVar5.f12757p) != null) {
                multiCoverDraftService.generateCover(1.7777778f, this.f112755c, false, new Function1(upperLoadingDialog, upperCoverEditorActivity, str) { // from class: com.bilibili.upper.module.cover.ui.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UpperLoadingDialog f112759a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final UpperCoverEditorActivity f112760b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f112761c;

                    {
                        this.f112759a = upperLoadingDialog;
                        this.f112760b = upperCoverEditorActivity;
                        this.f112761c = str;
                    }

                    public final Object invoke(Object obj2) {
                        String str2 = (String) obj2;
                        int i9 = UpperCoverEditorActivity.f112688Y;
                        UpperLoadingDialog upperLoadingDialog2 = this.f112759a;
                        if (C6935m.a(upperLoadingDialog2.getContext())) {
                            upperLoadingDialog2.dismissAllowingStateLoss();
                        }
                        int i10 = UpperCoverPreviewActivity.f112723H;
                        UpperCoverEditorActivity upperCoverEditorActivity2 = this.f112760b;
                        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper//cover_preview/")).extras(new l(upperCoverEditorActivity2.f112706R, this.f112761c, str2)).build(), upperCoverEditorActivity2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }
}
