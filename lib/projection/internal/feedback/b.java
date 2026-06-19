package com.bilibili.lib.projection.internal.feedback;

import By0.A;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.z;
import com.alibaba.fastjson.JSON;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.magicasakura.widgets.TintButton;
import com.bilibili.opd.app.bizcommon.context.download.KtExtensionKt;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerAction;
import com.mall.data.common.BaseModel;
import com.mall.data.page.create.presale.PreSaleDataBean;
import com.mall.data.page.create.submit.CouponInfoBean;
import he0.j;
import in0.i;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/b.class */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f63197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f63198c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f63196a = i7;
        this.f63197b = obj;
        this.f63198c = obj2;
    }

    public /* synthetic */ b(i iVar, RadarTriggerAction radarTriggerAction) {
        this.f63196a = 1;
        this.f63197b = iVar;
        this.f63198c = radarTriggerAction;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC7845m interfaceC7845m;
        com.bilibili.lib.projection.internal.reporter.a reporter;
        switch (this.f63196a) {
            case 0:
                PlayerCastFeedbackFragment playerCastFeedbackFragment = (PlayerCastFeedbackFragment) this.f63197b;
                TintButton tintButton = (TintButton) this.f63198c;
                if (playerCastFeedbackFragment.isAdded() && playerCastFeedbackFragment.f63180e == null) {
                    if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                        ToastHelper.showToastShort(BiliContext.application(), playerCastFeedbackFragment.getString(2131832822));
                        break;
                    } else {
                        long jNow = ServerClock.now();
                        if (jNow > 0 && Math.abs(System.currentTimeMillis() - jNow) >= 86400000) {
                            ToastHelper.showToastShort(BiliContext.application(), playerCastFeedbackFragment.getString(2131845421));
                            break;
                        } else {
                            ProjectionReportLayout projectionReportLayout = playerCastFeedbackFragment.f63178c;
                            if (projectionReportLayout != null && projectionReportLayout.isShown()) {
                                ProjectionReportLayout projectionReportLayout2 = playerCastFeedbackFragment.f63178c;
                                String reportId = projectionReportLayout2 != null ? projectionReportLayout2.getReportId() : null;
                                ProjectionReportLayout projectionReportLayout3 = playerCastFeedbackFragment.f63178c;
                                String selectOptions = projectionReportLayout3 != null ? projectionReportLayout3.getSelectOptions() : null;
                                ProjectionReportLayout projectionReportLayout4 = playerCastFeedbackFragment.f63178c;
                                String otherStr = projectionReportLayout4 != null ? projectionReportLayout4.getOtherStr() : null;
                                String strA = z.a("理由：", selectOptions, "\n详细：", otherStr);
                                if (TextUtils.isEmpty(reportId)) {
                                    ToastHelper.showToastShort(playerCastFeedbackFragment.getContext(), playerCastFeedbackFragment.getResources().getString(2131846772));
                                    break;
                                } else if (TextUtils.equals(reportId, "4") && otherStr != null && otherStr.length() < 2) {
                                    ToastHelper.showToastShort(playerCastFeedbackFragment.getContext(), playerCastFeedbackFragment.getResources().getString(2131847267));
                                    break;
                                } else {
                                    ProjectionReportLayout projectionReportLayout5 = playerCastFeedbackFragment.f63178c;
                                    if (projectionReportLayout5 != null) {
                                        projectionReportLayout5.setVisibility(4);
                                    }
                                    View view2 = playerCastFeedbackFragment.f63179d;
                                    if (view2 != null) {
                                        view2.setVisibility(0);
                                    }
                                    TextView textView = playerCastFeedbackFragment.f63181f;
                                    if (textView != null) {
                                        textView.setVisibility(8);
                                    }
                                    if (playerCastFeedbackFragment.f63180e != null) {
                                        tintButton.setEnabled(true);
                                        ProjectionReportLayout projectionReportLayout6 = playerCastFeedbackFragment.f63178c;
                                        if (projectionReportLayout6 != null) {
                                            projectionReportLayout6.setVisibility(0);
                                        }
                                        View view3 = playerCastFeedbackFragment.f63179d;
                                        if (view3 != null) {
                                            view3.setVisibility(4);
                                        }
                                        TextView textView2 = playerCastFeedbackFragment.f63181f;
                                        if (textView2 != null) {
                                            textView2.setVisibility(0);
                                        }
                                        break;
                                    } else {
                                        tintButton.setEnabled(false);
                                        c cVar = new c(playerCastFeedbackFragment.getContext(), playerCastFeedbackFragment.h, strA);
                                        playerCastFeedbackFragment.f63180e = cVar;
                                        AsyncTask.THREAD_POOL_EXECUTOR.execute(cVar);
                                        if (reportId != null && (interfaceC7845m = playerCastFeedbackFragment.f63177b) != null && (reporter = interfaceC7845m.getReporter()) != null) {
                                            j.c("player.player.screencast-feedback.0.click", null, null, reporter.f63524a, new A(reportId, 4), 4);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                i iVar = (i) this.f63197b;
                RadarTriggerAction radarTriggerAction = (RadarTriggerAction) this.f63198c;
                iVar.f121931w = true;
                if (!KtExtensionKt.isNotNullAndNotEmpty(radarTriggerAction.getActionUrl())) {
                    int noUrlClickClose = iVar.f121917i.getNoUrlClickClose();
                    if (noUrlClickClose != 0) {
                        if (noUrlClickClose == 1) {
                            iVar.f("");
                        } else {
                            iVar.f("");
                        }
                    }
                } else {
                    in0.e.i(iVar, radarTriggerAction.getActionUrl(), radarTriggerAction.getActionId(), radarTriggerAction.getJumpAction(), 0, null, 24);
                }
                break;
            default:
                zR0.i iVar2 = (zR0.i) this.f63197b;
                PreSaleDataBean preSaleDataBean = (PreSaleDataBean) this.f63198c;
                HashMap map = new HashMap();
                String str = iVar2.l;
                if (str != null) {
                    map.put("type", str);
                }
                KQ0.e.f(2131830909, map, 2131830915);
                KQ0.g.l(2131830908, map);
                iVar2.a.startPageBySchemaForResult(Uri.parse(com.mall.logic.page.create.c.e).buildUpon().appendQueryParameter("coupon_info", JSON.toJSONString(new CouponInfoBean(preSaleDataBean.couponListIsShow, preSaleDataBean.couponCodeId, preSaleDataBean.couponDesc, preSaleDataBean.couponCodeList, preSaleDataBean.couponMaxTag, preSaleDataBean.couponShowText, Integer.valueOf(preSaleDataBean.couponIsSelected), preSaleDataBean.discountTotalAmountAll, ((BaseModel) preSaleDataBean).codeType, (Boolean) null, ((BaseModel) preSaleDataBean).codeMsg, true, 0, false, 12800, (DefaultConstructorMarker) null))).appendQueryParameter("type", iVar2.l).appendQueryParameter("mall_trade_source_type_key", String.valueOf(iVar2.m)).build().toString(), com.mall.logic.page.create.c.f);
                break;
        }
    }
}
