package com.bilibili.playset.playlist.search;

import android.R;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ContentProviderClient;
import android.database.Cursor;
import android.graphics.drawable.PaintDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.bilibili.lib.dblconfig.K;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.util.NightTheme;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playset.playlist.search.MusicSearchView;
import ff.b;
import h1.AbstractC7389c;
import java.util.WeakHashMap;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import qs0.d;
import qs0.e;
import qs0.f;
import qs0.g;
import qs0.k;
import qs0.q;
import qs0.r;
import tv.danmaku.android.util.DebugLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/BaseSearchSuggestionsFragment.class */
public abstract class BaseSearchSuggestionsFragment extends DialogFragment implements Filter.FilterListener, MusicSearchView.e, View.OnClickListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener, View.OnTouchListener, MusicSearchView.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f85327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MusicSearchView f85328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TintTextView f85329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ListView f85330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f85331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f85332g;
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f85333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f85334j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f85336l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f85340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f85341q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f85335k = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f85337m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f85338n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f85339o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f85342r = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/BaseSearchSuggestionsFragment$a.class */
    public final class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSearchSuggestionsFragment f85343a;

        public a(BaseSearchSuggestionsFragment baseSearchSuggestionsFragment) {
            this.f85343a = baseSearchSuggestionsFragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.f85343a.f85338n = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/BaseSearchSuggestionsFragment$b.class */
    public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSearchSuggestionsFragment f85344a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/BaseSearchSuggestionsFragment$b$a.class */
        public final class a extends b.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f85345a;

            public a(b bVar) {
                this.f85345a = bVar;
            }

            public final void onAnimationEnd() {
                b bVar = this.f85345a;
                ListView listView = bVar.f85344a.f85330e;
                if (listView != null) {
                    listView.setVisibility(0);
                }
                MusicSearchView musicSearchView = bVar.f85344a.f85328c;
                if (musicSearchView != null) {
                    musicSearchView.postDelayed(new K(this, 1), 100L);
                }
            }

            public final void onAnimationStart() {
                ListView listView = this.f85345a.f85344a.f85330e;
                if (listView != null) {
                    listView.setVisibility(8);
                }
            }
        }

        public b(BaseSearchSuggestionsFragment baseSearchSuggestionsFragment) {
            this.f85344a = baseSearchSuggestionsFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f85344a.f85341q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            BaseSearchSuggestionsFragment baseSearchSuggestionsFragment = this.f85344a;
            baseSearchSuggestionsFragment.f85328c.setOnQueryTextListener(baseSearchSuggestionsFragment);
            BaseSearchSuggestionsFragment baseSearchSuggestionsFragment2 = this.f85344a;
            baseSearchSuggestionsFragment2.f85328c.setQuery(baseSearchSuggestionsFragment2.f85335k);
            this.f85344a.f85328c.getLayoutParams().width = this.f85344a.f85328c.getWidth();
            this.f85344a.f85328c.requestLayout();
            BaseSearchSuggestionsFragment baseSearchSuggestionsFragment3 = this.f85344a;
            View view = baseSearchSuggestionsFragment3.f85331f;
            if (view != null) {
                view.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(250L);
                baseSearchSuggestionsFragment3.f85331f.startAnimation(alphaAnimation);
            }
            BaseSearchSuggestionsFragment baseSearchSuggestionsFragment4 = this.f85344a;
            if (baseSearchSuggestionsFragment4.f85337m) {
                a aVar = new a(this);
                ff.c cVarSf = baseSearchSuggestionsFragment4.sf(0, baseSearchSuggestionsFragment4.f85341q.getWidth());
                cVarSf.a(aVar);
                cVarSf.b();
                cVarSf.c(new FastOutSlowInInterpolator());
                cVarSf.d();
                return;
            }
            View view2 = baseSearchSuggestionsFragment4.getView();
            if (view2 != null) {
                view2.setVisibility(8);
                BaseSearchSuggestionsFragment.hf(this.f85344a);
                view2.setVisibility(0);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/BaseSearchSuggestionsFragment$c.class */
    public final class c extends Dialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSearchSuggestionsFragment f85346a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BaseSearchSuggestionsFragment baseSearchSuggestionsFragment, FragmentActivity fragmentActivity, int i7) {
            super(fragmentActivity, i7);
            this.f85346a = baseSearchSuggestionsFragment;
        }

        @Override // android.app.Dialog
        public final void onBackPressed() {
            this.f85346a.dismiss();
        }
    }

    public static void hf(BaseSearchSuggestionsFragment baseSearchSuggestionsFragment) {
        MusicSearchView musicSearchView = baseSearchSuggestionsFragment.f85328c;
        if (musicSearchView == null) {
            return;
        }
        musicSearchView.setFocusable(true);
        baseSearchSuggestionsFragment.f85328c.requestFocus();
        if (baseSearchSuggestionsFragment.p3() == null) {
            return;
        }
        InputMethodManagerHelper.showSoftInput(baseSearchSuggestionsFragment.p3(), baseSearchSuggestionsFragment.f85328c.getQueryTextView(), 2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (tf()) {
            return;
        }
        if (!this.f85337m) {
            of(new d(this));
            return;
        }
        pf();
        if (tf()) {
            return;
        }
        nf(new qs0.c(this));
    }

    public final void mf() {
        TintTextView tintTextView = this.f85329d;
        if (tintTextView == null) {
            TintTextView tintTextView2 = new TintTextView(this.f85330e.getContext(), null, 2130971317);
            this.f85329d = tintTextView2;
            tintTextView2.setBackgroundResource(2131101221);
            TintTextView tintTextView3 = this.f85329d;
            tintTextView3.setTextColor(tintTextView3.getResources().getColor(2131101466));
            int dimensionPixelSize = this.f85330e.getContext().getResources().getDimensionPixelSize(2131166076);
            this.f85329d.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            this.f85329d.setText(2131842509);
            this.f85329d.setGravity(17);
        } else {
            tintTextView.tint();
        }
        this.f85330e.addFooterView(this.f85329d, null, true);
        this.f85334j = true;
    }

    public final void nf(b.b bVar) {
        if (tf()) {
            return;
        }
        this.f85339o = true;
        rf();
        ff.c cVarSf = sf(this.f85341q.getWidth(), 0);
        cVarSf.a(bVar);
        cVarSf.b();
        cVarSf.c(new FastOutSlowInInterpolator());
        cVarSf.d();
    }

    public final void of(AnimatorListenerAdapter animatorListenerAdapter) {
        if (tf() || p3() == null) {
            return;
        }
        this.f85339o = true;
        pf();
        rf();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f85330e.getHeight(), 0);
        valueAnimatorOfInt.addUpdateListener(new g(this, this.f85330e.getLayoutParams()));
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter());
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.setTarget(this.f85330e);
        valueAnimatorOfInt.addListener(animatorListenerAdapter);
        valueAnimatorOfInt.start();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [h1.c, qs0.r] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        SearchManager searchManager = (SearchManager) p3().getSystemService("search");
        p3().getComponentName();
        SearchableInfo searchableInfo = searchManager.getSearchableInfo(p3().getComponentName());
        FragmentActivity fragmentActivityP3 = p3();
        MusicSearchView musicSearchView = this.f85328c;
        ?? abstractC7389c = new AbstractC7389c(fragmentActivityP3, 2131499731);
        abstractC7389c.f126333p = false;
        abstractC7389c.f126334q = -1;
        abstractC7389c.f126335r = -1;
        abstractC7389c.f126336s = -1;
        abstractC7389c.f126337t = fragmentActivityP3;
        abstractC7389c.f126329l = musicSearchView;
        abstractC7389c.f126330m = searchableInfo;
        abstractC7389c.f126331n = fragmentActivityP3;
        abstractC7389c.f126332o = new WeakHashMap<>();
        this.f85327b = abstractC7389c;
        this.f85334j = false;
        if (this.f85335k == null) {
            this.f85335k = "";
        }
        mf();
        this.f85330e.setAdapter((ListAdapter) this.f85327b);
        this.f85327b.getFilter().filter(this.f85335k, this);
        this.f85328c.setFocusable(false);
        this.f85341q.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != 2131310872) {
            if (id == 2131296853) {
                dismiss();
                return;
            } else {
                if (id != 2131307432 || this.f85338n) {
                    return;
                }
                this.f85338n = true;
                dismiss();
                return;
            }
        }
        String string = this.f85328c.getQueryTextView().getText().toString();
        if (this.f85339o) {
            return;
        }
        this.f85335k = string;
        MusicSearchSuggestionFragment musicSearchSuggestionFragment = (MusicSearchSuggestionFragment) this;
        if (musicSearchSuggestionFragment.f85339o) {
            return;
        }
        if (string != null && musicSearchSuggestionFragment.p3() != null) {
            new SearchRecentSuggestions(musicSearchSuggestionFragment.p3(), MusicSuggestionProvider.AUTHORITY, 1).saveRecentQuery(string, null);
        }
        MusicSearchView musicSearchView = musicSearchSuggestionFragment.f85328c;
        if (musicSearchView != null) {
            if (musicSearchSuggestionFragment.f85342r) {
                musicSearchView.setQuery(null);
            }
            musicSearchSuggestionFragment.f85328c.clearFocus();
        }
        k kVar = new k(musicSearchSuggestionFragment, string);
        if (musicSearchSuggestionFragment.f85337m) {
            musicSearchSuggestionFragment.nf(new f(musicSearchSuggestionFragment, kVar));
        } else {
            musicSearchSuggestionFragment.of(new e(musicSearchSuggestionFragment, kVar));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 2131887346);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        c cVar = new c(this, p3(), getTheme());
        Window window = cVar.getWindow();
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setDimAmount(0.0f);
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499725, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        r rVar = this.f85327b;
        rVar.getClass();
        DebugLog.d("SuggestionsAdapter", "close()");
        rVar.b(null);
        rVar.f126333p = true;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f85336l = true;
        this.f85328c.setFocusable(false);
        this.f85330e.setAdapter((ListAdapter) null);
        this.f85341q = null;
        this.f85328c = null;
        this.f85329d = null;
        this.f85330e = null;
        this.f85331f = null;
        this.f85332g = null;
        this.h = null;
        this.f85333i = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f85338n = false;
        this.f85339o = false;
    }

    @Override // android.widget.Filter.FilterListener
    public final void onFilterComplete(int i7) {
        MusicSearchView musicSearchView = this.f85328c;
        if (musicSearchView == null) {
            return;
        }
        if (musicSearchView.f85359c.getText().length() >= musicSearchView.f85364i) {
            this.f85330e.removeFooterView(this.f85329d);
            this.f85334j = false;
            InfoEyesManager.feedEvent("search_tab_suggest", new String[0]);
        } else if (i7 == 0) {
            this.f85330e.removeFooterView(this.f85329d);
            this.f85334j = false;
        } else if (this.f85329d == null || !this.f85334j) {
            mf();
        }
    }

    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        String strK;
        if (i7 == adapterView.getCount() - 1 && view == this.f85329d) {
            r rVar = this.f85327b;
            Uri uri = Uri.parse("content://" + rVar.f126330m.getSuggestAuthority() + "/suggestions");
            q.a aVarA = q.a(rVar.f126337t, uri.getAuthority());
            aVarA.getClass();
            try {
                ContentProviderClient contentProviderClient = aVarA.f126328a;
                if (contentProviderClient != null) {
                    contentProviderClient.delete(uri, null, null);
                }
            } catch (Exception e7) {
            }
            aVarA.a();
            rVar.b(null);
            Neurons.reportClick(false, "playlist.playlist-search.PLdetail-searchcleanall.1.click");
            this.f85330e.removeFooterView(this.f85329d);
            this.f85334j = false;
            return;
        }
        if (this.f85339o) {
            return;
        }
        Cursor cursor = (Cursor) adapterView.getItemAtPosition(i7);
        String strA = this.f85327b.a(cursor);
        this.f85327b.getClass();
        Uri uri2 = (cursor == null || (strK = r.k(cursor, cursor.getColumnIndex("suggest_text_2_url"))) == null) ? null : Uri.parse(strK);
        this.f85328c.setQuery(strA);
        if (uri2 != null) {
            Uri.Builder builderAppendQueryParameter = uri2.buildUpon().appendQueryParameter("intentFrom", String.valueOf(5)).appendQueryParameter("jumpFrom", String.valueOf(1281));
            this.f85335k = strA;
            Uri.parse(builderAppendQueryParameter.build().toString());
            MusicSearchSuggestionFragment musicSearchSuggestionFragment = (MusicSearchSuggestionFragment) this;
            if (!musicSearchSuggestionFragment.f85339o) {
                if (strA != null && musicSearchSuggestionFragment.p3() != null) {
                    new SearchRecentSuggestions(musicSearchSuggestionFragment.p3(), MusicSuggestionProvider.AUTHORITY, 1).saveRecentQuery(strA, null);
                }
                MusicSearchView musicSearchView = musicSearchSuggestionFragment.f85328c;
                if (musicSearchView != null) {
                    if (musicSearchSuggestionFragment.f85342r) {
                        musicSearchView.setQuery(null);
                    }
                    musicSearchSuggestionFragment.f85328c.clearFocus();
                }
                ?? obj = new Object();
                if (musicSearchSuggestionFragment.f85337m) {
                    musicSearchSuggestionFragment.nf(new f(musicSearchSuggestionFragment, obj));
                } else {
                    musicSearchSuggestionFragment.of(new e(musicSearchSuggestionFragment, obj));
                }
            }
        } else if (!this.f85339o) {
            this.f85335k = strA;
            MusicSearchSuggestionFragment musicSearchSuggestionFragment2 = (MusicSearchSuggestionFragment) this;
            if (!musicSearchSuggestionFragment2.f85339o) {
                if (strA != null && musicSearchSuggestionFragment2.p3() != null) {
                    new SearchRecentSuggestions(musicSearchSuggestionFragment2.p3(), MusicSuggestionProvider.AUTHORITY, 1).saveRecentQuery(strA, null);
                }
                MusicSearchView musicSearchView2 = musicSearchSuggestionFragment2.f85328c;
                if (musicSearchView2 != null) {
                    if (musicSearchSuggestionFragment2.f85342r) {
                        musicSearchView2.setQuery(null);
                    }
                    musicSearchSuggestionFragment2.f85328c.clearFocus();
                }
                k kVar = new k(musicSearchSuggestionFragment2, strA);
                if (musicSearchSuggestionFragment2.f85337m) {
                    musicSearchSuggestionFragment2.nf(new f(musicSearchSuggestionFragment2, kVar));
                } else {
                    musicSearchSuggestionFragment2.of(new e(musicSearchSuggestionFragment2, kVar));
                }
            }
        }
        adapterView.getContext();
        cursor.getPosition();
        InfoEyesManager.feedEvent("search_tab_suggest_click", new String[]{"suggest", strA});
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i8, int i9) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        if (i7 != 0) {
            this.f85328c.clearFocus();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            window.setLayout(-1, -1);
            p3();
            StatusBarCompat.tintStatusBar(window, 0);
        }
    }

    public final boolean onSuggestionQuery(String str) {
        if (this.f85336l) {
            return true;
        }
        MusicSearchView musicSearchView = this.f85328c;
        if (musicSearchView.f85359c.getText().length() < musicSearchView.f85364i && !TextUtils.isEmpty(str)) {
            return true;
        }
        this.f85327b.getFilter().filter(str, this);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f85338n = false;
        pf();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        this.f85338n = false;
        this.f85336l = false;
        this.f85339o = false;
        this.f85330e = (ListView) view.findViewById(R.id.list);
        MusicSearchView musicSearchView = (MusicSearchView) view.findViewById(2131310886);
        this.f85328c = musicSearchView;
        musicSearchView.setQueryHint(qf());
        this.f85332g = view.findViewById(2131296853);
        View viewFindViewById = view.findViewById(2131310872);
        this.h = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        this.f85332g.setOnClickListener(this);
        this.f85341q = view.findViewById(2131310953);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setCornerRadius(view.getResources().getDimensionPixelSize(2131165688));
        paintDrawable.getPaint().setColor(view.getContext().getResources().getColor(2131101221));
        this.f85341q.setBackgroundDrawable(paintDrawable);
        this.f85333i = (LinearLayout) view.findViewById(2131310956);
        this.f85330e.setOnItemClickListener(this);
        this.f85330e.setOnScrollListener(this);
        View viewFindViewById2 = view.findViewById(2131307432);
        this.f85331f = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        this.f85330e.setOnTouchListener(this);
        this.f85328c.setOnKeyPreImeListener(this);
        this.f85328c.getQueryTextView().setCustomSelectionActionModeCallback(tv.danmaku.bili.widget.a.a());
        if (NightTheme.isNightTheme(p3())) {
            ThemeUtils.tintDrawable(((ImageButton) this.f85332g).getDrawable(), getResources().getColor(2131101449));
        }
    }

    public final void pf() {
        if (p3() == null || getDialog() == null) {
            return;
        }
        InputMethodManagerHelper.hideSoftInput(p3(), getDialog().getCurrentFocus(), 2);
        MusicSearchView musicSearchView = this.f85328c;
        if (musicSearchView != null) {
            musicSearchView.clearFocus();
            this.f85328c.setFocusable(false);
        }
    }

    public abstract CharSequence qf();

    public final void rf() {
        if (this.f85331f != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(250L);
            this.f85331f.startAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new a(this));
        }
    }

    public final ff.c sf(int i7, int i8) {
        return ff.d.a(i7, i8, this.f85333i.getRight() - (this.h.getWidth() / 2), this.f85333i.getHeight() / 2, this.f85341q);
    }

    public final boolean tf() {
        return !isAdded() || isDetached() || isRemoving() || p3() == null;
    }
}
