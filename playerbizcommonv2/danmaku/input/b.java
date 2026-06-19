package com.bilibili.playerbizcommonv2.danmaku.input;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.bilibili.biligame.api.BookAward;
import com.bilibili.biligame.detail.ui.GameDetailFragmentV4;
import com.bilibili.biligame.detail.widget.GameDetailHeaderV4;
import com.bilibili.bililive.videoliveplayer.ui.roomv3.videolink.beans.VideoLinkStartInfo;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.l;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import com.bilibili.search2.result.ogv.aggregate.s;
import java.util.ArrayList;
import java.util.Map;
import kntr.app.ad.biz.comment.notice.o;
import kntr.common.ad.capability.report.IReportExtraHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rr0.ViewOnClickListenerC8544e;
import tv.danmaku.android.log.BLog;
import zp.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f80979b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f80978a = i7;
        this.f80979b = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invoke(Object obj) {
        j jVar;
        switch (this.f80978a) {
            case 0:
                InputPanelContainer inputPanelContainer = (InputPanelContainer) this.f80979b;
                d<?> dVar = inputPanelContainer.f80975c.get(Integer.valueOf(((e) obj).f80984a));
                if (dVar != null) {
                    com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVar = dVar.f80981b;
                    if (aVar == null) {
                        BLog.i(inputPanelContainer.f80973a, "this panel record has not init");
                    } else {
                        if (inputPanelContainer.f80976d.contains(aVar)) {
                            inputPanelContainer.d(aVar);
                        }
                        if (dVar.f80983d) {
                            ArrayList<com.bilibili.playerbizcommonv2.danmaku.input.panel.a> arrayList = new ArrayList();
                            arrayList.addAll(inputPanelContainer.f80976d);
                            inputPanelContainer.f80976d.clear();
                            for (com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVar2 : arrayList) {
                                if (aVar2.f81003c) {
                                    aVar2.j(inputPanelContainer);
                                }
                            }
                        }
                        if (!inputPanelContainer.f80976d.contains(aVar)) {
                            inputPanelContainer.f80976d.push(aVar);
                        }
                        if (!aVar.f81003c) {
                            if (aVar.f81001a == null) {
                                ViewGroup viewGroupM = aVar.m(inputPanelContainer.getContext(), inputPanelContainer);
                                aVar.f81001a = viewGroupM;
                                aVar.u(viewGroupM);
                            }
                            ViewGroup viewGroup = aVar.f81001a;
                            if (viewGroup == null) {
                                throw new IllegalArgumentException("AbsInputPanel create view failed");
                            }
                            ViewParent parent = viewGroup.getParent();
                            if (parent == null) {
                                inputPanelContainer.addView(aVar.f81001a);
                                aVar.f81003c = true;
                                aVar.k();
                                aVar.q();
                            } else {
                                if (!Intrinsics.areEqual(parent, inputPanelContainer)) {
                                    throw new IllegalArgumentException("AbsInputPanel please detach from pre container view");
                                }
                                aVar.q();
                            }
                        }
                        c cVar = inputPanelContainer.f80977e;
                        if (cVar != null) {
                            cVar.a(aVar);
                        }
                        bilibili.live.app.service.resolver.c.a(inputPanelContainer.f80976d.size(), "stack top panel changed ,size is ", inputPanelContainer.f80973a);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                s sVar = (s) this.f80979b;
                if (!Intrinsics.areEqual(((SearchOgvClusterRelationItem) sVar.getData()).getCurrentSelectedSecondExtra(), str)) {
                    ((SearchOgvClusterRelationItem) sVar.getData()).setCurrentSelectedSecondExtra(str);
                    s.r0(sVar);
                    sVar.t0("second_filter");
                }
                return Unit.INSTANCE;
            case 2:
                ((eM.b) this.f80979b).l.setValue((VideoLinkStartInfo) obj);
                return Unit.INSTANCE;
            case 3:
                IReportExtraHandler iReportExtraHandler = (IReportExtraHandler) obj;
                o.b(iReportExtraHandler, (Map) this.f80979b);
                iReportExtraHandler.put("event_from", "comment_notice");
                return Unit.INSTANCE;
            case 4:
                ((l) obj).f81148n = (ViewOnClickListenerC8544e) this.f80979b;
                return Unit.INSTANCE;
            default:
                BookAward bookAward = (BookAward) obj;
                GameDetailHeaderV4 gameDetailHeaderV4 = ((GameDetailFragmentV4) this.f80979b).t;
                if (gameDetailHeaderV4 != null && (jVar = gameDetailHeaderV4.k) != null) {
                    jVar.a(bookAward, false);
                }
                return Unit.INSTANCE;
        }
    }
}
