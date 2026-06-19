package com.bilibili.search2.result.holder.recommend;

import Bl.T0;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.result.all.AbstractC6048b;
import com.bilibili.search2.utils.B;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/q.class */
@StabilityInferred(parameters = 0)
public final class q extends AbstractC6843f<SearchUPRecommendItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T0 f88202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SearchRelatedAuthorAdapter f88203b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.search2.result.all.b, com.bilibili.search2.result.holder.recommend.SearchRelatedAuthorAdapter] */
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
    public q(@NotNull T0 t02) {
        super(t02.a);
        this.f88202a = t02;
        Fragment fragment = getFragment();
        ?? abstractC6048b = new AbstractC6048b();
        abstractC6048b.f88151b = fragment;
        abstractC6048b.f88152c = 1;
        this.f88203b = abstractC6048b;
        RecyclerView recyclerView = t02.d;
        recyclerView.setAdapter(abstractC6048b);
        recyclerView.setLayoutManager(new LinearLayoutManager(t02.a.getContext(), 0, false));
        t02.b.setOnClickListener(new XC0.i(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        String moreText = ((SearchUPRecommendItem) getData()).getMoreText();
        if (moreText == null || StringsKt.isBlank(moreText)) {
            moreText = null;
        }
        T0 t02 = this.f88202a;
        if (moreText != null) {
            ListExtentionsKt.visible(t02.c);
            t02.b.setText(moreText);
            int style = ((SearchUPRecommendItem) getData()).getStyle();
            RecyclerView recyclerView = t02.d;
            if (style == 3) {
                B.v(recyclerView, ListExtentionsKt.toPx(0));
                B.y(t02.c, ListExtentionsKt.toPx(4));
            } else {
                B.v(recyclerView, ListExtentionsKt.toPx(0));
                B.y(t02.c, ListExtentionsKt.toPx(10));
            }
        } else {
            ListExtentionsKt.gone(t02.c);
            int style2 = ((SearchUPRecommendItem) getData()).getStyle();
            RecyclerView recyclerView2 = t02.d;
            if (style2 == 3) {
                B.v(recyclerView2, ListExtentionsKt.toPx(4));
            } else {
                B.v(recyclerView2, ListExtentionsKt.toPx(12));
            }
        }
        t02.e.setText(((SearchUPRecommendItem) getData()).getTitle());
        boolean zIsShowFollowButton = ((SearchUPRecommendItem) getData()).isShowFollowButton();
        SearchRelatedAuthorAdapter searchRelatedAuthorAdapter = this.f88203b;
        searchRelatedAuthorAdapter.f88153d = zIsShowFollowButton;
        if (searchRelatedAuthorAdapter.f88152c != ((SearchUPRecommendItem) getData()).getStyle()) {
            searchRelatedAuthorAdapter.f88152c = ((SearchUPRecommendItem) getData()).getStyle();
            RecyclerView recyclerView3 = t02.d;
            recyclerView3.setAdapter(searchRelatedAuthorAdapter);
            if (((SearchUPRecommendItem) getData()).getStyle() == 3) {
                RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
                LinearLayoutManager linearLayoutManager = null;
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                }
                if (linearLayoutManager != null) {
                    linearLayoutManager.setOrientation(1);
                    recyclerView3.setLayoutManager(linearLayoutManager);
                }
                B.y(recyclerView3, 0);
                B.x(recyclerView3, ListExtentionsKt.toPx(4));
            } else {
                RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
                LinearLayoutManager linearLayoutManager2 = null;
                if (layoutManager2 instanceof LinearLayoutManager) {
                    linearLayoutManager2 = (LinearLayoutManager) layoutManager2;
                }
                if (linearLayoutManager2 != null) {
                    linearLayoutManager2.setOrientation(0);
                    recyclerView3.setLayoutManager(linearLayoutManager2);
                }
                B.y(recyclerView3, ListExtentionsKt.toPx(8));
                B.x(recyclerView3, ListExtentionsKt.toPx(8));
            }
        }
        AbstractC6048b.S(searchRelatedAuthorAdapter, com.bilibili.search2.component.e.k(this.itemView.getContext(), ((SearchUPRecommendItem) getData()).getUpItems(), ((SearchUPRecommendItem) getData()).getHasWideAutoFill(), false, 56));
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f88203b.f88151b = fragment;
    }

    @Override // dt0.AbstractC6843f
    public final void onExpose(int i7, @NotNull View view) {
        List<UPRecommendItem> upItems = ((SearchUPRecommendItem) getData()).getUpItems();
        if (upItems == null) {
            super.onExpose(i7, view);
            return;
        }
        Iterator<T> it = upItems.iterator();
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UPRecommendItem uPRecommendItem = (UPRecommendItem) next;
            String linkType = uPRecommendItem.getLinkType();
            String str = linkType;
            if (linkType == null) {
                str = "up-recommend";
            }
            Xs0.b.k("search.search-result.search-card.all.show", str, uPRecommendItem, null, MapsKt.mapOf(new Pair[]{TuplesKt.to("module_pos", String.valueOf(i10)), TuplesKt.to("sub_moduleid", String.valueOf(uPRecommendItem.getMid()))}), false, null, null, null, 1000);
            i8 = i10;
        }
    }
}
