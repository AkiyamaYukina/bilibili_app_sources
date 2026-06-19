package com.bilibili.upper.module.cover.ui;

import EH0.p;
import android.content.Context;
import android.content.Intent;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.upper.module.contribute.up.dialog.UpperLoadingDialog;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService;
import eJ0.C6935m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperCoverEditorActivity f112756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpperLoadingDialog f112757b;

    public /* synthetic */ d(UpperCoverEditorActivity upperCoverEditorActivity, UpperLoadingDialog upperLoadingDialog) {
        this.f112756a = upperCoverEditorActivity;
        this.f112757b = upperLoadingDialog;
    }

    public final Object invoke(Object obj) {
        MultiCoverDraftService multiCoverDraftService;
        MultiCoverDraft multiCoverDraft;
        MultiCoverConfig multiCoverConfig;
        String str = (String) obj;
        int i7 = UpperCoverEditorActivity.f112688Y;
        Intent intent = new Intent();
        UpperCoverEditorActivity upperCoverEditorActivity = this.f112756a;
        intent.putExtra("is_cover_changed", upperCoverEditorActivity.X6());
        intent.putExtra("output_image_path", str);
        SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
        KH0.i iVar = upperCoverEditorActivity.f112700L;
        MultiCoverDraft multiCoverDraftE = JH0.a.e((iVar == null || (multiCoverConfig = iVar.f12745c) == null) ? null : multiCoverConfig.getSubCoverKey());
        KH0.i iVar2 = upperCoverEditorActivity.f112700L;
        if (iVar2 != null && (multiCoverDraft = iVar2.f12747e) != null) {
            multiCoverDraft.setCoverPath(str);
        }
        UpperLoadingDialog upperLoadingDialog = this.f112757b;
        if (multiCoverDraftE != null) {
            if (upperCoverEditorActivity.f112702N == null) {
                upperCoverEditorActivity.T6();
            }
            String coverPath = multiCoverDraftE.getCoverPath();
            String strF = coverPath;
            if (coverPath == null) {
                p pVar = p.f4125a;
                Context baseContext = FoundationAlias.getFapp().getBaseContext();
                pVar.getClass();
                strF = p.f(baseContext, false);
            }
            KH0.i iVar3 = upperCoverEditorActivity.f112702N;
            if (iVar3 != null && (multiCoverDraftService = iVar3.f12757p) != null) {
                String str2 = strF;
                if (strF == null) {
                    str2 = "";
                }
                MultiCoverDraftService.generateCover$default(multiCoverDraftService, 1.7777778f, str2, false, new com.bilibili.ad.adview.widget.bottomsheetdialog.panel.e(upperCoverEditorActivity, 1, intent, upperLoadingDialog), 4, null);
            }
        } else {
            TE0.b bVar = TE0.b.f24088a;
            KH0.i iVar4 = upperCoverEditorActivity.f112700L;
            String pageFrom = null;
            if (iVar4 != null) {
                MultiCoverConfig multiCoverConfig2 = iVar4.f12745c;
                pageFrom = null;
                if (multiCoverConfig2 != null) {
                    pageFrom = multiCoverConfig2.getPageFrom();
                }
            }
            bVar.getClass();
            TE0.b.r(1, pageFrom);
            if (C6935m.a(upperLoadingDialog.getContext())) {
                upperLoadingDialog.dismissAllowingStateLoss();
            }
            upperCoverEditorActivity.setResult(-1, intent);
            upperCoverEditorActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
