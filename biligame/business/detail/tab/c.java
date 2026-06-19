package com.bilibili.biligame.business.detail.tab;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameApiService;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.biligame.api.call.BaseSafeApiCallback;
import com.bilibili.biligame.api.generator.GameServiceGenerator;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.utils.bus.GloBus;
import com.bilibili.biligame.web.JavaScriptParams;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/c.class */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecommendComment f62587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DetailFragmentV2 f62588b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/c$a.class */
    public final class a extends BaseSafeApiCallback<BiligameApiResponse<JSONObject>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TintProgressDialog f62589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f62590c;

        public a(c cVar, TintProgressDialog tintProgressDialog) {
            this.f62590c = cVar;
            this.f62589b = tintProgressDialog;
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onCatchSafe(Throwable th) {
            this.f62589b.dismiss();
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onErrorSafe(Throwable th) {
            this.f62589b.dismiss();
            ToastHelper.showToastShort(this.f62590c.f62588b.getContext(), 2131823617);
        }

        @Override // com.bilibili.biligame.api.call.BaseSafeApiCallback
        public final void onSuccessSafe(BiligameApiResponse<JSONObject> biligameApiResponse) {
            BiligameApiResponse<JSONObject> biligameApiResponse2 = biligameApiResponse;
            this.f62589b.dismiss();
            boolean zIsSuccess = biligameApiResponse2.isSuccess();
            c cVar = this.f62590c;
            if (!zIsSuccess) {
                ToastHelper.showToastShort(cVar.f62588b.getContext(), biligameApiResponse2.message);
                return;
            }
            ToastHelper.showToastShort(cVar.f62588b.getContext(), 2131823385);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new JavaScriptParams.NotifyInfo(6, true, String.valueOf(cVar.f62588b.f62508b)));
            GloBus.get().post(arrayList);
        }
    }

    public c(DetailFragmentV2 detailFragmentV2, RecommendComment recommendComment) {
        this.f62588b = detailFragmentV2;
        this.f62587a = recommendComment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!BiliAccounts.get(this.f62588b.getContext()).isLogin()) {
            BiligameRouterHelper.login(this.f62588b.getContext(), 100);
            return;
        }
        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
            ToastHelper.showToastShort(this.f62588b.getContext(), 2131823722);
            return;
        }
        TintProgressDialog tintProgressDialogShow = TintProgressDialog.show(this.f62588b.getContext(), null, this.f62588b.getString(2131823386), true, false);
        BiligameApiService biligameApiService = (BiligameApiService) GameServiceGenerator.createService(BiligameApiService.class);
        RecommendComment recommendComment = this.f62587a;
        biligameApiService.deleteComment(recommendComment.gameBaseId, recommendComment.commentNo).enqueue(new a(this, tintProgressDialogShow));
    }
}
