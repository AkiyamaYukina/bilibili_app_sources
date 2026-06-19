package com.bilibili.search2.result.holder.collection;

import Bl.S;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchCollectionItem;
import com.bilibili.search2.result.all.AbstractC6048b;
import com.bilibili.search2.share.r;
import dt0.AbstractC6842e;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import yt0.AbstractC9088a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/collection/j.class */
@StabilityInferred(parameters = 0)
public final class j extends AbstractC6842e<SearchCollectionItem, InlinePanel> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final S f88079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TintTextView[] f88080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CollectionVideoNewAdapter f88081g;
    public AbstractC9088a<? extends InlinePanel> h;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.search2.result.all.b, com.bilibili.search2.result.holder.collection.CollectionVideoNewAdapter] */
    public j(@NotNull S s7) {
        super(s7.a);
        this.f88079e = s7;
        this.f88080f = new TintTextView[]{s7.f, s7.e};
        this.f88081g = new AbstractC6048b();
        s7.a.setOnClickListener(new Jb.g(this, 4));
        s7.c.setOnClickListener(new Jb.h(this, 2));
        s7.h.setOnClickListener(new ER.b(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.collection.j.bind():void");
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        CollectionVideoNewAdapter collectionVideoNewAdapter = this.f88081g;
        collectionVideoNewAdapter.getClass();
        if (fragment != null) {
            collectionVideoNewAdapter.f88053b = new Os0.f(fragment.getLifecycle());
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        AbstractC9088a<? extends InlinePanel> abstractC9088a = this.h;
        AbstractC9088a<? extends InlinePanel> abstractC9088a2 = abstractC9088a;
        if (abstractC9088a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateInlineCard");
            abstractC9088a2 = null;
        }
        return abstractC9088a2.configCustomTaskBehavior(cardPlayTask, z6);
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View[] getClickStatusViewArray() {
        return this.f88080f;
    }

    @Nullable
    public final ViewGroup getInlineContainer() {
        if (!((SearchCollectionItem) getData()).getHasInline()) {
            return null;
        }
        AbstractC9088a<? extends InlinePanel> abstractC9088a = this.h;
        if (abstractC9088a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateInlineCard");
            abstractC9088a = null;
        }
        return abstractC9088a.getInlineContainer();
    }

    @NotNull
    public final Class<? extends InlinePanel> getPanelType() {
        AbstractC9088a<? extends InlinePanel> abstractC9088a = this.h;
        AbstractC9088a<? extends InlinePanel> abstractC9088a2 = abstractC9088a;
        if (abstractC9088a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateInlineCard");
            abstractC9088a2 = null;
        }
        return abstractC9088a2.getPanelType();
    }

    @Override // Os0.a
    public final void invisible() {
        Os0.f fVar = this.f88081g.f88053b;
        if (fVar != null) {
            fVar.a(false);
        }
    }

    public final void on4GTipShown() {
    }

    @Override // dt0.AbstractC6842e, dt0.AbstractC6843f
    public final void onCardExpose() {
        if (!((SearchCollectionItem) getData()).isExposed()) {
            SearchCollectionItem searchCollectionItem = (SearchCollectionItem) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z6 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z6 = true;
            }
            searchCollectionItem.setAtFirstScreen(z6);
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("is_inline", ((SearchCollectionItem) getData()).getHasInline() ? "1" : "0");
        Integer includeIaaVideo = ((SearchCollectionItem) getData()).getIncludeIaaVideo();
        if (includeIaaVideo != null) {
            mapCreateMapBuilder.put("is_include_short_plays", String.valueOf(includeIaaVideo.intValue()));
        }
        Xs0.b.k("search.search-result.search-card.all.show", getModuleType(), (BaseSearchItem) getData(), Xs0.b.d((BaseSearchItem) getData(), null, null, 3), MapsKt.build(mapCreateMapBuilder), false, null, null, null, 992);
    }

    public final void onClickCloseBtn() {
    }

    public final void onClickGotoFreeData() {
    }

    public final void onClickPlayWithMobileData() {
    }

    public final void onNetworkAlertShow() {
    }

    @Override // dt0.AbstractC6842e
    public final void q0(@NotNull InlinePanel inlinePanel) {
        if (((SearchCollectionItem) getData()).getHasInline()) {
            AbstractC9088a<? extends InlinePanel> abstractC9088a = this.h;
            AbstractC9088a<? extends InlinePanel> abstractC9088a2 = abstractC9088a;
            if (abstractC9088a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateInlineCard");
                abstractC9088a2 = null;
            }
            abstractC9088a2.b(inlinePanel);
        }
    }

    @Override // Os0.a
    public final void startScroll() {
        if (((SearchCollectionItem) getData()).getHasInline()) {
            AbstractC9088a<? extends InlinePanel> abstractC9088a = this.h;
            AbstractC9088a<? extends InlinePanel> abstractC9088a2 = abstractC9088a;
            if (abstractC9088a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateInlineCard");
                abstractC9088a2 = null;
            }
            abstractC9088a2.d(this.f116702a);
        }
    }

    @Override // dt0.AbstractC6842e, Os0.a
    public final void visible() {
        super.visible();
        Os0.f fVar = this.f88081g.f88053b;
        if (fVar != null) {
            fVar.a(true);
        }
    }

    @Override // dt0.AbstractC6842e
    public final void w0(boolean z6) {
        if (((SearchCollectionItem) getData()).getHasInline()) {
            AbstractC9088a<? extends InlinePanel> abstractC9088a = this.h;
            AbstractC9088a<? extends InlinePanel> abstractC9088a2 = abstractC9088a;
            if (abstractC9088a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateInlineCard");
                abstractC9088a2 = null;
            }
            abstractC9088a2.c(z6, this.f116702a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6842e
    public final void x0(@NotNull String str) {
        r rVar = r.f88699a;
        BaseSearchItem.Feedback feedback = ((SearchCollectionItem) getData()).getFeedback();
        rVar.getClass();
        if (r.e(feedback)) {
            if (Intrinsics.areEqual(str, "threepoint_click")) {
                String linkType = ((SearchCollectionItem) getData()).getLinkType();
                String str2 = linkType;
                if (linkType == null) {
                    str2 = "";
                }
                Xs0.b.i("search.search-result.search-card.all.click", "", str2, (BaseSearchItem) getData(), null, null, Xs0.b.d((BaseSearchItem) getData(), "threepoint", null, 2), null, null, null, false, null, 7168);
            }
            rVar.k(this, this.itemView.getContext(), null, null, false);
        }
    }
}
