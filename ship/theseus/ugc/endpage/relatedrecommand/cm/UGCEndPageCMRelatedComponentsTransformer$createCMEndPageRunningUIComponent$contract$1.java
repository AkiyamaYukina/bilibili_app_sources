package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm;

import android.content.Context;
import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.videodetail.endpage.EndPageCMModel;
import com.bilibili.gripper.api.ad.biz.videodetail.endpage.IVDEndPage;
import com.bilibili.gripper.api.ad.biz.videodetail.endpage.IVDEndPageCallback;
import com.bilibili.gripper.api.ad.core.dislike.FeedbackClick;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6320j;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1.class */
public final class UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1 implements IVDEndPageCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenModeType f96869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EndPageCMModel f96870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UGCEndPageCMRelatedComponentsTransformer f96871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExposureEntryV f96872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f96873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f96874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ref.ObjectRef<RunningUIComponent> f96875g;

    public UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1(ScreenModeType screenModeType, EndPageCMModel endPageCMModel, UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer, ExposureEntryV exposureEntryV, String str, String str2, Ref.ObjectRef<RunningUIComponent> objectRef) {
        this.f96869a = screenModeType;
        this.f96870b = endPageCMModel;
        this.f96871c = uGCEndPageCMRelatedComponentsTransformer;
        this.f96872d = exposureEntryV;
        this.f96873e = str;
        this.f96874f = str2;
        this.f96875g = objectRef;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void changeCard(EndPageCMModel endPageCMModel, EndPageCMModel.Action action) throws NoWhenBranchMatchedException {
        Object next;
        RunningUIComponent runningUIComponent = (RunningUIComponent) this.f96875g.element;
        if (runningUIComponent == null) {
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(action, EndPageCMModel.Action.Insert.INSTANCE);
        UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer = this.f96871c;
        if (zAreEqual) {
            UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService = uGCEndPageCMRelatedComponentsTransformer.f96862c;
            RelateCard relateCard = endPageCMModel.getRelateCard();
            if (uGCEndPageRelatedRecommendService.f96820s.length() == 0) {
                return;
            }
            String strE = UGCEndPageRelatedRecommendService.e(relateCard);
            defpackage.a.b("showComponent: cardKey:", strE, "EndPageRelatedRecommend");
            uGCEndPageRelatedRecommendService.f96818q.put(strE, Boolean.TRUE);
            uGCEndPageRelatedRecommendService.i();
            return;
        }
        if (Intrinsics.areEqual(action, EndPageCMModel.Action.Remove.INSTANCE)) {
            UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService2 = uGCEndPageCMRelatedComponentsTransformer.f96862c;
            RelateCard relateCard2 = endPageCMModel.getRelateCard();
            if (uGCEndPageRelatedRecommendService2.f96820s.length() == 0) {
                return;
            }
            String strE2 = UGCEndPageRelatedRecommendService.e(relateCard2);
            defpackage.a.b("hideComponent: cardKey:", strE2, "EndPageRelatedRecommend");
            uGCEndPageRelatedRecommendService2.f96818q.put(strE2, Boolean.FALSE);
            uGCEndPageRelatedRecommendService2.i();
            return;
        }
        if (!(action instanceof EndPageCMModel.Action.Replace)) {
            throw new NoWhenBranchMatchedException();
        }
        UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService3 = uGCEndPageCMRelatedComponentsTransformer.f96862c;
        RunningUIComponent runningUIComponentC = uGCEndPageCMRelatedComponentsTransformer.c(EndPageCMModel.copy$default(endPageCMModel, (RelateCard) null, ((EndPageCMModel.Action.Replace) action).getToNormal() ? EndPageCMModel.State.NORMAL : EndPageCMModel.State.NOT_INTERESTED_OVERLAY, 0, 5, (Object) null), this.f96869a);
        boolean z6 = UGCEndPageRelatedRecommendService.f96802x;
        if (uGCEndPageRelatedRecommendService3.f96820s.length() == 0) {
            return;
        }
        UGCEndPageRelatedRecommendService.a aVar = (UGCEndPageRelatedRecommendService.a) ((LinkedHashMap) uGCEndPageRelatedRecommendService3.f96817p).get(uGCEndPageRelatedRecommendService3.f96820s);
        if (aVar == null) {
            return;
        }
        Iterator it = ((ArrayList) uGCEndPageRelatedRecommendService3.f96816o).iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (Intrinsics.areEqual((RunningUIComponent) it.next(), runningUIComponent)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 != -1) {
            ((ArrayList) uGCEndPageRelatedRecommendService3.f96816o).set(i7, runningUIComponentC);
            Iterator<T> it2 = aVar.f96827c.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.areEqual(((Map.Entry) next).getValue(), runningUIComponent)) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            String str = null;
            if (entry != null) {
                str = (String) entry.getKey();
            }
            if (str != null) {
                aVar.f96827c.put(str, runningUIComponentC);
                uGCEndPageRelatedRecommendService3.f96818q.put(str, Boolean.TRUE);
            }
        }
        uGCEndPageRelatedRecommendService3.i();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onClick(IVDEndPageCallback.Position position) throws NoWhenBranchMatchedException {
        String str;
        boolean z6 = position instanceof IVDEndPageCallback.Position.Card;
        String str2 = this.f96874f;
        String str3 = this.f96873e;
        str = "";
        EndPageCMModel endPageCMModel = this.f96870b;
        UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer = this.f96871c;
        if (z6) {
            Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("creative_id", str3), TuplesKt.to("sale_type", str2)});
            RelateCard relateCard = endPageCMModel.getRelateCard();
            PageReportService pageReportService = uGCEndPageCMRelatedComponentsTransformer.f96863d;
            o0 o0VarC = C6320j.c(relateCard, Long.MIN_VALUE, "");
            HashMap map = new HashMap();
            map.put("goto", o0VarC.f101317b);
            String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
            map.put("action_id", strCurrentPolarisActionId != null ? strCurrentPolarisActionId : "");
            map.put("track_id", uGCEndPageCMRelatedComponentsTransformer.f96864e.a().f123882d);
            map.putAll(mapMapOf);
            pageReportService.f("player.player.full-endpage-insertcard.0.player", map, true);
            return;
        }
        if (position instanceof IVDEndPageCallback.Position.Button) {
            return;
        }
        if (position instanceof IVDEndPageCallback.Position.ThreePoint) {
            Map mapMapOf2 = MapsKt.mapOf(new Pair[]{TuplesKt.to("creative_id", str3), TuplesKt.to("sale_type", str2)});
            RelateCard relateCard2 = endPageCMModel.getRelateCard();
            PageReportService pageReportService2 = uGCEndPageCMRelatedComponentsTransformer.f96863d;
            o0 o0VarC2 = C6320j.c(relateCard2, Long.MIN_VALUE, "");
            HashMap map2 = new HashMap();
            map2.put("goto", o0VarC2.f101317b);
            String strCurrentPolarisActionId2 = PageViewTracker.getInstance().currentPolarisActionId();
            map2.put("action_id", strCurrentPolarisActionId2 != null ? strCurrentPolarisActionId2 : "");
            map2.put("track_id", uGCEndPageCMRelatedComponentsTransformer.f96864e.a().f123882d);
            map2.putAll(mapMapOf2);
            pageReportService2.f("player.player.full-endpage-insertcard.three-point.player", map2, true);
            ScreenModeType screenModeType = ScreenModeType.VERTICAL_FULLSCREEN;
            ScreenModeType screenModeType2 = this.f96869a;
            if (screenModeType2 == screenModeType || screenModeType2 == ScreenModeType.LANDSCAPE_FULLSCREEN) {
                IVDEndPage endPage = GAdBizKt.getGAdVideoDetail().getEndPage();
                Context context = uGCEndPageCMRelatedComponentsTransformer.f96865f;
                IVDEndPageCallback.Position.ThreePoint threePoint = (IVDEndPageCallback.Position.ThreePoint) position;
                BuildersKt.launch$default(uGCEndPageCMRelatedComponentsTransformer.f96860a, (CoroutineContext) null, (CoroutineStart) null, new UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1$onClick$1(uGCEndPageCMRelatedComponentsTransformer, endPage.getDislikeFunctionWidget(context, threePoint.getFeedbackPanel(), threePoint.getOnItemClick()), screenModeType2, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (position instanceof IVDEndPageCallback.Position.FeedBackItem) {
            IVDEndPageCallback.Position.FeedBackItem feedBackItem = (IVDEndPageCallback.Position.FeedBackItem) position;
            if (feedBackItem.getFeedbackClick() instanceof FeedbackClick.Dislike) {
                Map mapMapOf3 = MapsKt.mapOf(new Pair[]{TuplesKt.to("creative_id", str3), TuplesKt.to("sale_type", str2), TuplesKt.to("cm_reason_id", String.valueOf(feedBackItem.getFeedbackClick().getSecondary().getReasonId()))});
                RelateCard relateCard3 = endPageCMModel.getRelateCard();
                PageReportService pageReportService3 = uGCEndPageCMRelatedComponentsTransformer.f96863d;
                o0 o0VarC3 = C6320j.c(relateCard3, Long.MIN_VALUE, "");
                HashMap map3 = new HashMap();
                map3.put("goto", o0VarC3.f101317b);
                String strCurrentPolarisActionId3 = PageViewTracker.getInstance().currentPolarisActionId();
                map3.put("action_id", strCurrentPolarisActionId3 != null ? strCurrentPolarisActionId3 : "");
                map3.put("track_id", uGCEndPageCMRelatedComponentsTransformer.f96864e.a().f123882d);
                map3.putAll(mapMapOf3);
                pageReportService3.f("player.player.full-endpage-insertcard.feedback.player", map3, true);
                return;
            }
            return;
        }
        if (!(position instanceof IVDEndPageCallback.Position.Revert)) {
            throw new NoWhenBranchMatchedException();
        }
        Map mapMapOf4 = MapsKt.mapOf(new Pair[]{TuplesKt.to("creative_id", str3), TuplesKt.to("sale_type", str2), TuplesKt.to("cm_reason_id", String.valueOf(((IVDEndPageCallback.Position.Revert) position).getReasonOrModuleId()))});
        RelateCard relateCard4 = endPageCMModel.getRelateCard();
        PageReportService pageReportService4 = uGCEndPageCMRelatedComponentsTransformer.f96863d;
        o0 o0VarC4 = C6320j.c(relateCard4, Long.MIN_VALUE, "");
        HashMap map4 = new HashMap();
        map4.put("goto", o0VarC4.f101317b);
        String strCurrentPolarisActionId4 = PageViewTracker.getInstance().currentPolarisActionId();
        if (strCurrentPolarisActionId4 == null) {
            strCurrentPolarisActionId4 = str;
        }
        map4.put("action_id", strCurrentPolarisActionId4);
        map4.put("track_id", uGCEndPageCMRelatedComponentsTransformer.f96864e.a().f123882d);
        map4.putAll(mapMapOf4);
        pageReportService4.f("player.player.full-endpage-insertcard.feedback-cancel.player", map4, true);
    }
}
