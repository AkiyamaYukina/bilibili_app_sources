package com.bilibili.playset.playlist.search;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.provider.SearchRecentSuggestions;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Filter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.ui.util.NightTheme;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.playset.O0;
import com.bilibili.playset.playlist.search.MusicSearchView;
import qs0.f;
import qs0.k;
import qs0.m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchView.class */
public class MusicSearchView extends FrameLayout {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f85356n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f85357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f85358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final QueryText f85359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f85360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f85361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f85362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SearchableInfo f85363g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final K9.a f85365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f85366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f85367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85368m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchView$QueryText.class */
    public static class QueryText extends AppCompatEditText {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MusicSearchView f85369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f85370b;

        public QueryText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z6, int i7, Rect rect) {
            super.onFocusChanged(z6, i7, rect);
            this.f85369a.f();
        }

        @Override // android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking()) {
                        this.f85369a.clearFocus();
                        this.f85369a.setImeVisibility(false);
                        d dVar = this.f85370b;
                        if (dVar == null) {
                            return true;
                        }
                        BaseSearchSuggestionsFragment baseSearchSuggestionsFragment = (BaseSearchSuggestionsFragment) dVar;
                        if (i7 != 4) {
                            return true;
                        }
                        if (!baseSearchSuggestionsFragment.f85337m) {
                            baseSearchSuggestionsFragment.dismiss();
                            return true;
                        }
                        baseSearchSuggestionsFragment.pf();
                        if (baseSearchSuggestionsFragment.tf()) {
                            return true;
                        }
                        baseSearchSuggestionsFragment.nf(new qs0.c(baseSearchSuggestionsFragment));
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        public void setOnKeyPreImeListener(d dVar) {
            this.f85370b = dVar;
        }

        public void setSearchView(MusicSearchView musicSearchView) {
            this.f85369a = musicSearchView;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchView$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicSearchView f85371a;

        public a(MusicSearchView musicSearchView) {
            this.f85371a = musicSearchView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MusicSearchView musicSearchView = this.f85371a;
            if (view == musicSearchView.f85358b) {
                musicSearchView.d();
                InfoEyesManager.feedEvent("search_tab_clear_click", new String[0]);
                return;
            }
            QueryText queryText = musicSearchView.f85359c;
            if (view == queryText) {
                String string = queryText.getText().toString();
                e eVar = musicSearchView.f85367l;
                if (eVar != null) {
                    ((BaseSearchSuggestionsFragment) eVar).onSuggestionQuery(string);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchView$b.class */
    public final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicSearchView f85372a;

        public b(MusicSearchView musicSearchView) {
            this.f85372a = musicSearchView;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            this.f85372a.e(charSequence);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchView$c.class */
    public final class c implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicSearchView f85373a;

        public c(MusicSearchView musicSearchView) {
            this.f85373a = musicSearchView;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            MusicSearchView.b(this.f85373a);
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchView$d.class */
    public interface d {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchView$e.class */
    public interface e {
    }

    public MusicSearchView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [qs0.m] */
    public MusicSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f85364i = 1;
        this.f85365j = new K9.a(this, 2);
        this.f85366k = new Runnable(this) { // from class: qs0.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicSearchView f126318a;

            {
                this.f126318a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MusicSearchView.a(this.f126318a);
            }
        };
        a aVar = new a(this);
        b bVar = new b(this);
        c cVar = new c(this);
        LayoutInflater.from(context).inflate(2131499733, this);
        this.f85357a = findViewById(2131310936);
        QueryText queryText = (QueryText) findViewById(2131310947);
        this.f85359c = queryText;
        queryText.setSearchView(this);
        ImageView imageView = (ImageView) findViewById(2131310902);
        this.f85358b = imageView;
        imageView.setOnClickListener(aVar);
        queryText.setOnClickListener(aVar);
        queryText.addTextChangedListener(bVar);
        queryText.setOnEditorActionListener(cVar);
        if (NightTheme.isNightTheme(context)) {
            queryText.setHintTextColor(getResources().getColor(2131101463));
            ThemeUtils.tintDrawable(imageView.getDrawable(), getResources().getColor(2131101449));
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O0.f83994b, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        CharSequence text = typedArrayObtainStyledAttributes.getText(11);
        if (!TextUtils.isEmpty(text)) {
            setQueryHint(text);
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i7 != -1) {
            setImeOptions(i7);
        }
        int i8 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i8 != -1) {
            setInputType(i8);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void a(MusicSearchView musicSearchView) {
        boolean zHasFocus = musicSearchView.f85359c.hasFocus();
        if (musicSearchView.f85357a.getBackground() == null) {
            return;
        }
        musicSearchView.f85357a.getBackground().setState(zHasFocus ? FrameLayout.FOCUSED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        musicSearchView.invalidate();
    }

    public static void b(MusicSearchView musicSearchView) {
        String string = musicSearchView.f85359c.getText().toString();
        e eVar = musicSearchView.f85367l;
        if (eVar != null) {
            BaseSearchSuggestionsFragment baseSearchSuggestionsFragment = (BaseSearchSuggestionsFragment) eVar;
            if (!baseSearchSuggestionsFragment.f85339o) {
                baseSearchSuggestionsFragment.f85335k = string;
                MusicSearchSuggestionFragment musicSearchSuggestionFragment = (MusicSearchSuggestionFragment) baseSearchSuggestionsFragment;
                if (musicSearchSuggestionFragment.f85339o) {
                    return;
                }
                if (string != null && musicSearchSuggestionFragment.p3() != null) {
                    new SearchRecentSuggestions(musicSearchSuggestionFragment.p3(), MusicSuggestionProvider.AUTHORITY, 1).saveRecentQuery(string, null);
                }
                MusicSearchView musicSearchView2 = musicSearchSuggestionFragment.f85328c;
                if (musicSearchView2 != null) {
                    if (musicSearchSuggestionFragment.f85342r) {
                        musicSearchView2.setQuery(null);
                    }
                    musicSearchSuggestionFragment.f85328c.clearFocus();
                }
                k kVar = new k(musicSearchSuggestionFragment, string);
                if (musicSearchSuggestionFragment.f85337m) {
                    musicSearchSuggestionFragment.nf(new f(musicSearchSuggestionFragment, kVar));
                    return;
                } else {
                    musicSearchSuggestionFragment.of(new qs0.e(musicSearchSuggestionFragment, kVar));
                    return;
                }
            }
        }
        if (musicSearchView.f85363g == null || string == null || TextUtils.getTrimmedLength(string) <= 0) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
        intent.putExtra("user_query", musicSearchView.f85361e);
        intent.putExtra("query", string);
        intent.setComponent(musicSearchView.f85363g.getSearchActivity());
        musicSearchView.getContext().startActivity(intent);
        musicSearchView.setImeVisibility(false);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(2131165240);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImeVisibility(boolean z6) {
        if (z6) {
            post(this.f85365j);
            return;
        }
        removeCallbacks(this.f85365j);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.h = true;
        setImeVisibility(false);
        super.clearFocus();
        this.f85359c.clearFocus();
        this.h = false;
    }

    public final void d() {
        if (TextUtils.isEmpty(this.f85359c.getText())) {
            clearFocus();
            return;
        }
        this.f85359c.setText("");
        this.f85359c.requestFocus();
        setImeVisibility(true);
    }

    public final void e(CharSequence charSequence) {
        this.f85361e = this.f85359c.getText();
        boolean zIsEmpty = TextUtils.isEmpty(this.f85359c.getText());
        this.f85358b.setVisibility(!zIsEmpty ? 0 : 8);
        this.f85358b.getDrawable().setState(!zIsEmpty ? FrameLayout.ENABLED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        if (this.f85367l != null && !TextUtils.equals(charSequence, this.f85362f)) {
            e eVar = this.f85367l;
            String string = charSequence.toString();
            BaseSearchSuggestionsFragment baseSearchSuggestionsFragment = (BaseSearchSuggestionsFragment) eVar;
            if (TextUtils.isEmpty(baseSearchSuggestionsFragment.f85335k) || !baseSearchSuggestionsFragment.f85335k.equals(string)) {
                baseSearchSuggestionsFragment.f85335k = string;
                baseSearchSuggestionsFragment.onSuggestionQuery(string);
            }
        }
        this.f85362f = charSequence.toString();
    }

    public final void f() {
        post(this.f85366k);
        if (!this.f85359c.hasFocus()) {
            setImeVisibility(false);
            return;
        }
        String string = this.f85359c.getText().toString();
        e eVar = this.f85367l;
        if (eVar != null) {
            ((BaseSearchSuggestionsFragment) eVar).onSuggestionQuery(string);
        }
        setImeVisibility(true);
    }

    public final void g() {
        CharSequence charSequence = this.f85360d;
        if (charSequence != null) {
            this.f85359c.setHint(charSequence);
            return;
        }
        SearchableInfo searchableInfo = this.f85363g;
        if (searchableInfo == null) {
            this.f85359c.setHint("");
            return;
        }
        int hintId = searchableInfo.getHintId();
        String string = hintId != 0 ? getContext().getString(hintId) : null;
        if (string != null) {
            this.f85359c.setHint(string);
        }
    }

    public int getImeOptions() {
        return this.f85359c.getImeOptions();
    }

    public int getInputType() {
        return this.f85359c.getInputType();
    }

    public int getMaxWidth() {
        return this.f85368m;
    }

    public CharSequence getQuery() {
        return this.f85361e;
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f85360d;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f85363g;
        String string = null;
        if (searchableInfo != null) {
            int hintId = searchableInfo.getHintId();
            string = null;
            if (hintId != 0) {
                string = getContext().getString(hintId);
            }
        }
        return string;
    }

    public QueryText getQueryTextView() {
        return this.f85359c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f85366k);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        post(this.f85366k);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (!this.h && isFocusable()) {
            return this.f85359c.requestFocus(i7, rect);
        }
        return false;
    }

    public void setFilter(Filter filter) {
    }

    public void setImeOptions(int i7) {
        this.f85359c.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f85359c.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f85368m = i7;
        requestLayout();
    }

    public void setOnKeyPreImeListener(d dVar) {
        QueryText queryText = this.f85359c;
        if (queryText != null) {
            queryText.setOnKeyPreImeListener(dVar);
        }
    }

    public void setOnQueryTextListener(e eVar) {
        this.f85367l = eVar;
    }

    public void setQuery(CharSequence charSequence) {
        if (charSequence == null || !charSequence.toString().equals(this.f85361e)) {
            this.f85359c.setText(charSequence);
            this.f85359c.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f85360d = charSequence;
        g();
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f85363g = searchableInfo;
        if (searchableInfo != null) {
            g();
            this.f85364i = this.f85363g.getSuggestThreshold();
        }
    }

    public void setSubmitButtonEnabled(boolean z6) {
    }
}
