package com.bilibili.search2.result.ogv.aggregate;

import Bl.n0;
import Bl.o0;
import Vn.A;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.api.SearchComicItem;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import com.bilibili.search2.api.SearchOgvInline;
import com.bilibili.search2.utils.B;
import dt0.AbstractC6839b;
import dt0.AbstractC6842e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/w.class */
@StabilityInferred(parameters = 0)
public final class w extends AbstractC6842e<com.bilibili.search2.api.g, com.bilibili.search2.panel.i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final n0 f88437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<cY.a> f88438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public OgvAggregateBigComicHolder f88439g;

    @Nullable
    public d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public s f88440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public o f88441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final eY.a f88442k;

    public w(@NotNull n0 n0Var) {
        super(n0Var.a);
        this.f88437e = n0Var;
        this.f88438f = new ArrayList();
        this.f88442k = new eY.a(n0Var.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        ((com.bilibili.search2.api.g) getData()).f86338d = getBindingAdapterPosition();
        ((ArrayList) this.f88438f).clear();
        ((ArrayList) this.f88438f).add(new cY.b(this.f88442k, 0.0f));
        BaseSearchItem baseSearchItem = ((com.bilibili.search2.api.g) getData()).f86346m.f19218e;
        boolean z6 = baseSearchItem instanceof SearchComicItem;
        n0 n0Var = this.f88437e;
        if (z6) {
            ListExtentionsKt.visible(n0Var.c.a);
            ListExtentionsKt.gone(n0Var.b.a);
            ListExtentionsKt.gone(n0Var.d.a);
            if (this.f88439g == null) {
                this.f88439g = new OgvAggregateBigComicHolder(n0Var.c);
            }
            OgvAggregateBigComicHolder ogvAggregateBigComicHolder = this.f88439g;
            if (ogvAggregateBigComicHolder != null) {
                ogvAggregateBigComicHolder.bindFragment(getFragment());
            }
            OgvAggregateBigComicHolder ogvAggregateBigComicHolder2 = this.f88439g;
            if (ogvAggregateBigComicHolder2 != null) {
                ogvAggregateBigComicHolder2.f88311c = (com.bilibili.search2.api.g) getData();
            }
            OgvAggregateBigComicHolder ogvAggregateBigComicHolder3 = this.f88439g;
            if (ogvAggregateBigComicHolder3 != null) {
                BaseSearchItem baseSearchItem2 = ((com.bilibili.search2.api.g) getData()).f86346m.f19218e;
                AbstractC6839b.bindData$default(ogvAggregateBigComicHolder3, baseSearchItem2 instanceof SearchComicItem ? (SearchComicItem) baseSearchItem2 : null, false, 2, null);
            }
            this.h = null;
            this.f88441j = null;
        } else if (baseSearchItem instanceof SearchOgvInline) {
            ListExtentionsKt.gone(n0Var.b.a);
            ListExtentionsKt.gone(n0Var.c.a);
            o0 o0Var = n0Var.d;
            ListExtentionsKt.visible(o0Var.a);
            if (this.f88441j == null) {
                this.f88441j = new o(o0Var);
            }
            o oVar = this.f88441j;
            if (oVar != null) {
                oVar.bindFragment(getFragment());
            }
            o oVar2 = this.f88441j;
            if (oVar2 != null) {
                oVar2.f88370f = (com.bilibili.search2.api.g) getData();
            }
            o oVar3 = this.f88441j;
            if (oVar3 != null) {
                BaseSearchItem baseSearchItem3 = ((com.bilibili.search2.api.g) getData()).f86346m.f19218e;
                AbstractC6839b.bindData$default(oVar3, baseSearchItem3 instanceof SearchOgvInline ? (SearchOgvInline) baseSearchItem3 : null, false, 2, null);
            }
            this.h = null;
            this.f88439g = null;
        } else if (baseSearchItem instanceof SearchBangumiItem) {
            ListExtentionsKt.visible(n0Var.b.a);
            ListExtentionsKt.gone(n0Var.c.a);
            ListExtentionsKt.gone(n0Var.d.a);
            if (this.h == null) {
                this.h = new d(n0Var.b);
            }
            d dVar = this.h;
            if (dVar != null) {
                dVar.bindFragment(getFragment());
            }
            d dVar2 = this.h;
            if (dVar2 != null) {
                dVar2.f88333c = (com.bilibili.search2.api.g) getData();
            }
            d dVar3 = this.h;
            if (dVar3 != null) {
                BaseSearchItem baseSearchItem4 = ((com.bilibili.search2.api.g) getData()).f86346m.f19218e;
                AbstractC6839b.bindData$default(dVar3, baseSearchItem4 instanceof SearchBangumiItem ? (SearchBangumiItem) baseSearchItem4 : null, false, 2, null);
            }
            this.f88441j = null;
            this.f88439g = null;
        } else {
            ListExtentionsKt.gone(n0Var.c.a);
            ListExtentionsKt.gone(n0Var.b.a);
            ListExtentionsKt.gone(n0Var.d.a);
            this.f88441j = null;
            this.h = null;
            this.f88439g = null;
        }
        y0();
        if (((com.bilibili.search2.api.g) getData()).f86346m.f19218e == null || ((com.bilibili.search2.api.g) getData()).f86347n == null) {
            ListExtentionsKt.gone(n0Var.e);
            return;
        }
        ListExtentionsKt.visible(n0Var.e);
        if (((com.bilibili.search2.api.g) getData()).isInAlienationArea()) {
            B.x(n0Var.e, ListExtentionsKt.toPx(12));
        } else {
            B.x(n0Var.e, 0);
        }
    }

    @Override // dt0.AbstractC6843f, dt0.AbstractC6839b
    public final void bind(@NotNull List<Object> list) {
        super.bind(list);
        if (list.isEmpty()) {
            return;
        }
        ((ArrayList) this.f88438f).clear();
        ((ArrayList) this.f88438f).add(new cY.b(this.f88442k, 0.0f));
        y0();
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        o oVar = this.f88441j;
        if (oVar != null) {
            oVar.configCustomTaskBehavior(cardPlayTask, z6);
        }
        return cardPlayTask;
    }

    @NotNull
    public final List<cY.a> getExposeChildren() {
        return this.f88438f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.ViewGroup] */
    @Nullable
    public final ViewGroup getInlineContainer() {
        o oVar = this.f88441j;
        return oVar != null ? oVar.f88379p : null;
    }

    @NotNull
    public final Class<? extends com.bilibili.search2.panel.i> getPanelType() {
        return com.bilibili.search2.panel.i.class;
    }

    public final void on4GTipShown() {
    }

    @Override // dt0.AbstractC6842e, dt0.AbstractC6843f
    public final void onCardExpose() {
    }

    public final void onClickCloseBtn() {
    }

    public final void onClickGotoFreeData() {
    }

    public final void onClickPlayWithMobileData() {
    }

    public final void onNestedChildExpose(int i7, int i8, @NotNull View view) {
        s sVar;
        StringBuilder sbB = A.b(i7, i8, "onNestedChildExpose itemPosition=", " childPosition=", " child=");
        sbB.append(view);
        BLog.d("SearchOgvAggregateHolder", sbB.toString());
        n0 n0Var = this.f88437e;
        if (Intrinsics.areEqual(view, n0Var.c.a)) {
            OgvAggregateBigComicHolder ogvAggregateBigComicHolder = this.f88439g;
            if (ogvAggregateBigComicHolder != null) {
                ogvAggregateBigComicHolder.onCardExpose();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, n0Var.b.a)) {
            d dVar = this.h;
            if (dVar != null) {
                dVar.onCardExpose();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, n0Var.d.a)) {
            o oVar = this.f88441j;
            if (oVar != null) {
                oVar.onCardExpose();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, n0Var.f.a) || view.getId() != 2131308241 || (sVar = this.f88440i) == null) {
            return;
        }
        sVar.onNestedChildExpose(i7, i8, view);
    }

    public final void onNetworkAlertShow() {
    }

    @Override // dt0.AbstractC6842e
    public final void q0(InlinePanel inlinePanel) {
        com.bilibili.search2.panel.i iVar = (com.bilibili.search2.panel.i) inlinePanel;
        o oVar = this.f88441j;
        if (oVar != null) {
            oVar.q0(iVar);
        }
    }

    @Override // Os0.a
    public final void startScroll() {
        o oVar = this.f88441j;
        if (oVar != null) {
            oVar.startScroll();
        }
    }

    @Override // dt0.AbstractC6842e
    public final void w0(boolean z6) {
        o oVar = this.f88441j;
        if (oVar != null) {
            oVar.w0(z6);
        }
    }

    public final void y0() {
        List<cY.a> list;
        SearchOgvClusterRelationItem searchOgvClusterRelationItem = ((com.bilibili.search2.api.g) getData()).f86347n;
        n0 n0Var = this.f88437e;
        if (searchOgvClusterRelationItem == null) {
            ListExtentionsKt.gone(n0Var.f.a);
            this.f88440i = null;
            return;
        }
        ListExtentionsKt.visible(n0Var.f.a);
        if (this.f88440i == null) {
            this.f88440i = new s(n0Var.f);
        }
        s sVar = this.f88440i;
        if (sVar != null) {
            sVar.bindFragment(getFragment());
        }
        s sVar2 = this.f88440i;
        if (sVar2 != null) {
            sVar2.f88404b = (com.bilibili.search2.api.g) getData();
        }
        s sVar3 = this.f88440i;
        if (sVar3 != null) {
            AbstractC6839b.bindData$default(sVar3, searchOgvClusterRelationItem, false, 2, null);
        }
        s sVar4 = this.f88440i;
        if (sVar4 == null || (list = sVar4.f88405c) == null) {
            return;
        }
        ((ArrayList) this.f88438f).addAll(list);
    }
}
