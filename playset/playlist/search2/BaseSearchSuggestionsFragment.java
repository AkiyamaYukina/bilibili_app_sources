package com.bilibili.playset.playlist.search2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.search.TintSearchView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt;
import es0.r;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.SearchView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/BaseSearchSuggestionsFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BaseSearchSuggestionsFragment extends BaseFragment implements Filter.FilterListener, SearchView.OnQueryTextListener, View.OnClickListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener, View.OnTouchListener, ThemeWatcher.Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public q f85378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TintTextView f85379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ListView f85380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f85381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TintSearchView f85382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public d f85383g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f85384i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f85385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TintConstraintLayout f85386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @JvmField
    public boolean f85387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public r f85388m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/BaseSearchSuggestionsFragment$a.class */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSearchSuggestionsFragment f85389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f85390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f85391c;

        public a(BaseSearchSuggestionsFragment baseSearchSuggestionsFragment, Bundle bundle, View view) {
            this.f85389a = baseSearchSuggestionsFragment;
            this.f85390b = bundle;
            this.f85391c = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            TintSearchView tintSearchView;
            SearchView.QueryText queryTextView;
            ViewTreeObserver viewTreeObserver;
            TintConstraintLayout tintConstraintLayout = this.f85389a.f85386k;
            if (tintConstraintLayout != null && (viewTreeObserver = tintConstraintLayout.getViewTreeObserver()) != null) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            BaseSearchSuggestionsFragment baseSearchSuggestionsFragment = this.f85389a;
            TintSearchView tintSearchView2 = baseSearchSuggestionsFragment.f85382f;
            if (tintSearchView2 != null) {
                tintSearchView2.setOnQueryTextListener(baseSearchSuggestionsFragment);
                tintSearchView2.setQuery(baseSearchSuggestionsFragment.f85384i);
                ViewGroup.LayoutParams layoutParams = tintSearchView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = tintSearchView2.getWidth();
                }
                tintSearchView2.requestLayout();
            }
            BaseSearchSuggestionsFragment baseSearchSuggestionsFragment2 = this.f85389a;
            View view = baseSearchSuggestionsFragment2.f85381e;
            if (view != null) {
                view.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(250L);
                View view2 = baseSearchSuggestionsFragment2.f85381e;
                if (view2 != null) {
                    view2.startAnimation(alphaAnimation);
                }
            }
            if (this.f85390b == null || !this.f85389a.isHidden()) {
                this.f85391c.setVisibility(8);
                BaseSearchSuggestionsFragment baseSearchSuggestionsFragment3 = this.f85389a;
                TintSearchView tintSearchView3 = baseSearchSuggestionsFragment3.f85382f;
                if (tintSearchView3 != null) {
                    tintSearchView3.setFocusable(true);
                }
                TintSearchView tintSearchView4 = baseSearchSuggestionsFragment3.f85382f;
                if (tintSearchView4 != null) {
                    tintSearchView4.requestFocus();
                }
                if (baseSearchSuggestionsFragment3.p3() != null && (tintSearchView = baseSearchSuggestionsFragment3.f85382f) != null && (queryTextView = tintSearchView.getQueryTextView()) != null) {
                    InputMethodManagerHelper.showSoftInput(baseSearchSuggestionsFragment3.p3(), queryTextView, 2);
                }
                this.f85391c.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.BaseSearchSuggestionsFragment$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/BaseSearchSuggestionsFragment$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BaseSearchSuggestionsFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.BaseSearchSuggestionsFragment$onViewCreated$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/BaseSearchSuggestionsFragment$onViewCreated$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaseSearchSuggestionsFragment f85392a;

            public a(BaseSearchSuggestionsFragment baseSearchSuggestionsFragment) {
                this.f85392a = baseSearchSuggestionsFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f85392a.mf();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BaseSearchSuggestionsFragment baseSearchSuggestionsFragment, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = baseSearchSuggestionsFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Flow flowWindowSizeFlow;
            Flow flowDistinctUntilChanged;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FragmentActivity fragmentActivityP3 = this.this$0.p3();
                if (fragmentActivityP3 != null && (flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(fragmentActivityP3)) != null && (flowDistinctUntilChanged = FlowKt.distinctUntilChanged(flowWindowSizeFlow)) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void jf() {
        Context context;
        Resources resources;
        if (getViewLifecycleOwnerLiveData().getValue() == null) {
            return;
        }
        TintTextView tintTextView = this.f85379c;
        if (tintTextView == null) {
            ListView listView = this.f85380d;
            TintTextView tintTextView2 = new TintTextView(listView != null ? listView.getContext() : null, null, 2130971317);
            this.f85379c = tintTextView2;
            tintTextView2.setTextColorById(R$color.Text3);
            TintTextView tintTextView3 = this.f85379c;
            if (tintTextView3 != null) {
                tintTextView3.setBackgroundResource(R$color.Bg1);
            }
            TintTextView tintTextView4 = this.f85379c;
            if (tintTextView4 != null) {
                tintTextView4.setTextSize(2, 14.0f);
            }
            ListView listView2 = this.f85380d;
            int dimensionPixelSize = (listView2 == null || (context = listView2.getContext()) == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131166076);
            TintTextView tintTextView5 = this.f85379c;
            if (tintTextView5 != null) {
                tintTextView5.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            TintTextView tintTextView6 = this.f85379c;
            if (tintTextView6 != null) {
                tintTextView6.setText(2131842509);
            }
            TintTextView tintTextView7 = this.f85379c;
            if (tintTextView7 != null) {
                tintTextView7.setGravity(17);
            }
        } else if (tintTextView != null) {
            tintTextView.tint();
        }
        ListView listView3 = this.f85380d;
        if (listView3 != null) {
            listView3.addFooterView(this.f85379c, null, true);
        }
        this.h = true;
    }

    @Nullable
    public abstract CharSequence kf();

    public final void lf(@Nullable String str) {
        this.f85384i = str;
        TintSearchView tintSearchView = this.f85382f;
        if (tintSearchView == null || this.f85385j) {
            return;
        }
        tintSearchView.setQuery(str);
    }

    public final void mf() {
        WindowSizeClass windowSizeClassWindowSize;
        ListView listView;
        WindowSizeClass windowSizeClassWindowSize2;
        Context context = getContext();
        boolean z6 = (!com.bilibili.playset.utils.b.d() || context == null || (windowSizeClassWindowSize2 = ScreenAdjustUtilsKt.windowSize(context)) == null || KScreenAdjustUtilsKt.isNormal(windowSizeClassWindowSize2)) ? false : true;
        ListView listView2 = this.f85380d;
        ConstraintLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = listView2 != null ? listView2.getLayoutParams() : null;
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            if (z6) {
                layoutParams.matchConstraintMaxWidth = ListExtentionsKt.toPx(600);
            } else {
                layoutParams.matchConstraintMaxWidth = 0;
            }
            ListView listView3 = this.f85380d;
            if (listView3 != null) {
                listView3.requestLayout();
            }
        }
        Context context2 = getContext();
        if (context2 == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(context2)) == null) {
            return;
        }
        int px = KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClassWindowSize) ? 0 : KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClassWindowSize) ? ListExtentionsKt.toPx(20) : ListExtentionsKt.toPx(12);
        r rVar = this.f85388m;
        if (rVar == null || (listView = rVar.f117466b) == null) {
            return;
        }
        InputExtensionsKt.updateMargin$default(listView, px, px, 0, 0, 12, null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        SearchView.QueryText queryTextView;
        Editable text;
        if (view.getId() == 2131310872) {
            TintSearchView tintSearchView = this.f85382f;
            onQueryTextSubmit((tintSearchView == null || (queryTextView = tintSearchView.getQueryTextView()) == null || (text = queryTextView.getText()) == null) ? null : text.toString());
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ThemeWatcher.getInstance().subscribe(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        r rVarInflate = r.inflate(layoutInflater, viewGroup, false);
        this.f85388m = rVarInflate;
        return rVarInflate != null ? rVarInflate.f117465a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        q qVar = this.f85378b;
        if (qVar != null) {
            BLog.d("SuggestionsAdapter", "close()");
            qVar.b(null);
            qVar.f85479p = true;
        }
        super.onDestroy();
        ThemeWatcher.getInstance().unSubscribe(this);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f85385j = true;
        TintSearchView tintSearchView = this.f85382f;
        if (tintSearchView != null) {
            tintSearchView.setFocusable(false);
        }
        ListView listView = this.f85380d;
        if (listView != null) {
            listView.setAdapter((ListAdapter) null);
        }
        this.f85386k = null;
        this.f85379c = null;
        this.f85380d = null;
        this.f85381e = null;
        this.f85388m = null;
        super.onDestroyView();
    }

    @Override // android.widget.Filter.FilterListener
    public final void onFilterComplete(int i7) {
        if (getViewLifecycleOwnerLiveData().getValue() == null) {
            return;
        }
        TintSearchView tintSearchView = this.f85382f;
        if (tintSearchView != null && tintSearchView.enoughToFilter()) {
            ListView listView = this.f85380d;
            if (listView != null) {
                listView.removeFooterView(this.f85379c);
            }
            this.h = false;
            InfoEyesManager.feedEvent("search_tab_suggest", new String[0]);
            return;
        }
        if (i7 == 0) {
            ListView listView2 = this.f85380d;
            if (listView2 != null) {
                listView2.removeFooterView(this.f85379c);
            }
            this.h = false;
            return;
        }
        if (this.f85379c == null || !this.h) {
            jf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onItemClick(@org.jetbrains.annotations.NotNull android.widget.AdapterView<?> r7, @org.jetbrains.annotations.NotNull android.view.View r8, int r9, long r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.search2.BaseSearchSuggestionsFragment.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public final boolean onQueryTextChange(@NotNull String str) {
        if (!TextUtils.isEmpty(this.f85384i) && Intrinsics.areEqual(this.f85384i, str)) {
            return true;
        }
        lf(str);
        onSuggestionQuery(str);
        return true;
    }

    public final boolean onQueryTextSubmit(@Nullable String str) {
        TintSearchView tintSearchView;
        lf(str);
        CollectionSearchSuggestionFragment collectionSearchSuggestionFragment = (CollectionSearchSuggestionFragment) this;
        if (collectionSearchSuggestionFragment.f85387l && (tintSearchView = collectionSearchSuggestionFragment.f85382f) != null) {
            tintSearchView.setQuery((CharSequence) null);
        }
        TintSearchView tintSearchView2 = collectionSearchSuggestionFragment.f85382f;
        if (tintSearchView2 != null) {
            tintSearchView2.clearFocus();
        }
        d dVar = collectionSearchSuggestionFragment.f85383g;
        if (dVar == null) {
            return true;
        }
        dVar.onQueryTextSubmit(str);
        return true;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("keyword", this.f85384i);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(@NotNull AbsListView absListView, int i7, int i8, int i9) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(@NotNull AbsListView absListView, int i7) {
        TintSearchView tintSearchView;
        if (i7 == 0 || (tintSearchView = this.f85382f) == null) {
            return;
        }
        tintSearchView.clearFocus();
    }

    public final boolean onSuggestionQuery(@NotNull String str) {
        q qVar;
        Filter filter;
        if (this.f85385j) {
            return true;
        }
        d dVar = this.f85383g;
        if (dVar != null) {
            dVar.V();
        }
        TintSearchView tintSearchView = this.f85382f;
        if (((tintSearchView == null || !tintSearchView.enoughToFilter()) && !TextUtils.isEmpty(str)) || (qVar = this.f85378b) == null || (filter = qVar.getFilter()) == null) {
            return true;
        }
        filter.filter(str, this);
        return true;
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        q qVar = this.f85378b;
        if (qVar != null) {
            qVar.notifyDataSetChanged();
        }
        TintTextView tintTextView = this.f85379c;
        if (tintTextView != null) {
            tintTextView.tint();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        if (p3() == null) {
            return false;
        }
        TintSearchView tintSearchView = this.f85382f;
        if (tintSearchView != null) {
            tintSearchView.clearFocus();
        }
        TintSearchView tintSearchView2 = this.f85382f;
        if (tintSearchView2 == null) {
            return false;
        }
        tintSearchView2.setFocusable(false);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.search2.BaseSearchSuggestionsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
