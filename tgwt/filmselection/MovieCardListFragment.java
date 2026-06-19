package com.bilibili.tgwt.filmselection;

import DD0.h0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import com.bilibili.tgwt.api.MovieCardListVo;
import kntr.home.history.mvi.HistoryStateHolder;
import kntr.home.history.mvi.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/MovieCardListFragment.class */
@StabilityInferred(parameters = 0)
public abstract class MovieCardListFragment extends BaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f111174c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f111176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EmptyStateView f111177f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111173b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111175d = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f111178g = new com.bilibili.app.gemini.ui.f(false);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/MovieCardListFragment$a.class */
    public static final class a extends Nl0.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MovieCardListFragment f111179b;

        public a(MovieCardListFragment movieCardListFragment) {
            this.f111179b = movieCardListFragment;
        }

        @Override // Nl0.e
        public final void onLastItemVisible() {
            this.f111179b.loadData();
        }
    }

    @NotNull
    public final EmptyStateView jf() {
        EmptyStateView emptyStateView = this.f111177f;
        if (emptyStateView != null) {
            return emptyStateView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEmptyStateView");
        return null;
    }

    public abstract void kf(int i7, @NotNull l lVar, @NotNull m mVar);

    public abstract void lf(@NotNull MovieCardListVo.Item item);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.tgwt.filmselection.m] */
    public final void loadData() {
        if (!this.f111175d || this.f111174c) {
            return;
        }
        this.f111174c = true;
        final int i7 = 0;
        kf(this.f111173b, new l(this, 0), new Function1(this, i7) { // from class: com.bilibili.tgwt.filmselection.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f111198a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f111199b;

            {
                this.f111198a = i7;
                this.f111199b = this;
            }

            public final Object invoke(Object obj) {
                Object obj2 = this.f111199b;
                switch (this.f111198a) {
                    case 0:
                        MovieCardListFragment movieCardListFragment = (MovieCardListFragment) obj2;
                        movieCardListFragment.f111174c = false;
                        EmptyStateView emptyStateViewJf = movieCardListFragment.jf();
                        int i8 = EmptyStateView.f73157k;
                        emptyStateViewJf.b(3, false);
                        break;
                    case 1:
                        ((HistoryStateHolder) obj2).b(new a.z((String) obj));
                        break;
                    default:
                        ((MutableState) obj2).setValue((String) obj);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        h0 h0VarInflate = h0.inflate(layoutInflater, viewGroup, false);
        h0VarInflate.f2532x.setAdapter(this.f111178g);
        this.f111176e = h0VarInflate.f2532x;
        this.f111177f = h0VarInflate.f2531w;
        jf().a();
        return h0VarInflate.getRoot();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        RecyclerView recyclerView = this.f111176e;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecylcerView");
            recyclerView2 = null;
        }
        recyclerView2.addOnScrollListener(new a(this));
    }
}
