package com.bilibili.search2.result.holder.collection;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.opd.app.bizcommon.context.ServiceManager;
import com.bilibili.opd.app.core.config.ConfigService;
import com.bilibili.upper.module.manuscript.activity.ArchiveAggregatedProblemActivity;
import com.bilibili.upper.module.manuscript.bean.ProblemDetailBean;
import com.bilibili.upper.module.manuscript.model.AggregatedAuditProblemShowViewModel;
import com.mall.common.context.m;
import com.mall.ui.page.category.MallCategoryFragment;
import java.util.HashMap;
import w8.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/collection/a.class */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88056b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f88055a = i7;
        this.f88056b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88055a) {
            case 0:
                ((g) this.f88056b).g(false);
                break;
            case 1:
                ArchiveAggregatedProblemActivity archiveAggregatedProblemActivity = (ArchiveAggregatedProblemActivity) this.f88056b;
                int i7 = ArchiveAggregatedProblemActivity.f113395G;
                AggregatedAuditProblemShowViewModel aggregatedAuditProblemShowViewModelQ6 = archiveAggregatedProblemActivity.Q6();
                ProblemDetailBean problemDetailBean = aggregatedAuditProblemShowViewModelQ6.f113658i;
                if (problemDetailBean != null) {
                    BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/manuscript-edit/")).extras(new Hr.a(problemDetailBean, 7)).requestCode(1).build(), archiveAggregatedProblemActivity);
                    WE0.a aVarA = WE0.a.a();
                    String str = problemDetailBean.source == 1 ? "creative_center" : "archive_manage";
                    aVarA.getClass();
                    WE0.a.b(str, "发布编辑页");
                    ProblemDetailBean problemDetailBean2 = aggregatedAuditProblemShowViewModelQ6.f113658i;
                    if (problemDetailBean2 != null) {
                        if (problemDetailBean2.statePanel == 2 && problemDetailBean2.isLimit()) {
                            TE0.b bVar = TE0.b.f24088a;
                            long j7 = problemDetailBean2.aid;
                            HashMap mapA = VF0.b.a(bVar);
                            mapA.put(GameCardButton.extraAvid, String.valueOf(j7));
                            Neurons.reportClick(false, "creation.return-limit-detial-page.revise.0.click", mapA);
                        } else {
                            TE0.b bVar2 = TE0.b.f24088a;
                            long j8 = problemDetailBean2.aid;
                            HashMap mapA2 = VF0.b.a(bVar2);
                            mapA2.put(GameCardButton.extraAvid, String.valueOf(j8));
                            Neurons.reportClick(false, "creation.only-return-detial-page.revise.0.click", mapA2);
                        }
                        break;
                    }
                }
                break;
            default:
                Context context = ((MallCategoryFragment) this.f88056b).getContext();
                if (context != null) {
                    m mVarD = m.d();
                    String string = "bilibili://mall/search?searchUrl=bilibili%3A%2F%2Fmall%2Fweb%3Furl%3Dhttps%253A%252F%252Fmall.bilibili.com%252Fneul-next%252Findex.html%253Fpage%253Dflow_searchResult%2526goFrom%253Dna%2526noTitleBar%253D1%2526from%253Dmall_all_category%2526from_type%253Dmall_all_category%2526keyword%253Dparam";
                    if (mVarD != null) {
                        ServiceManager serviceManager = mVarD.getServiceManager();
                        string = "bilibili://mall/search?searchUrl=bilibili%3A%2F%2Fmall%2Fweb%3Furl%3Dhttps%253A%252F%252Fmall.bilibili.com%252Fneul-next%252Findex.html%253Fpage%253Dflow_searchResult%2526goFrom%253Dna%2526noTitleBar%253D1%2526from%253Dmall_all_category%2526from_type%253Dmall_all_category%2526keyword%253Dparam";
                        if (serviceManager != null) {
                            ConfigService configService = serviceManager.getConfigService();
                            string = "bilibili://mall/search?searchUrl=bilibili%3A%2F%2Fmall%2Fweb%3Furl%3Dhttps%253A%252F%252Fmall.bilibili.com%252Fneul-next%252Findex.html%253Fpage%253Dflow_searchResult%2526goFrom%253Dna%2526noTitleBar%253D1%2526from%253Dmall_all_category%2526from_type%253Dmall_all_category%2526keyword%253Dparam";
                            if (configService != null) {
                                string = configService.getString("mallCategorySearchUrl", "bilibili://mall/search?searchUrl=bilibili%3A%2F%2Fmall%2Fweb%3Furl%3Dhttps%253A%252F%252Fmall.bilibili.com%252Fneul-next%252Findex.html%253Fpage%253Dflow_searchResult%2526goFrom%253Dna%2526noTitleBar%253D1%2526from%253Dmall_all_category%2526from_type%253Dmall_all_category%2526keyword%253Dparam");
                                if (string == null) {
                                    string = "bilibili://mall/search?searchUrl=bilibili%3A%2F%2Fmall%2Fweb%3Furl%3Dhttps%253A%252F%252Fmall.bilibili.com%252Fneul-next%252Findex.html%253Fpage%253Dflow_searchResult%2526goFrom%253Dna%2526noTitleBar%253D1%2526from%253Dmall_all_category%2526from_type%253Dmall_all_category%2526keyword%253Dparam";
                                }
                            }
                        }
                    }
                    if (string.length() != 0) {
                        k.a(context, Uri.parse(string));
                        break;
                    }
                }
                break;
        }
    }
}
