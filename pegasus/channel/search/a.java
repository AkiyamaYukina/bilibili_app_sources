package com.bilibili.pegasus.channel.search;

import On0.t;
import On0.x;
import On0.y;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.provider.SearchRecentSuggestions;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import h1.AbstractC7389c;
import java.util.WeakHashMap;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SearchView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/a.class */
@StabilityInferred(parameters = 0)
public final class a implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, SearchView.f, SearchView.OnQueryTextListener, Filter.FilterListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SearchView f74924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ListView f74925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ChannelSearchActivity f74926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ChannelSearchActivity f74927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final t f74928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TintTextView f74929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Context f74930g;

    @NotNull
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f74931i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [On0.t, android.widget.ListAdapter, h1.c] */
    public a(@NotNull SearchView searchView, @NotNull ListView listView, @NotNull String str, boolean z6, @Nullable ChannelSearchActivity channelSearchActivity, @Nullable ChannelSearchActivity channelSearchActivity2) {
        this.f74924a = searchView;
        this.f74925b = listView;
        this.f74926c = channelSearchActivity;
        this.f74927d = channelSearchActivity2;
        Context context = searchView.getContext();
        this.f74930g = context;
        this.f74931i = true;
        this.h = str;
        searchView.setFocusable(false);
        searchView.setOnQueryTextListener(this);
        searchView.setQuery(this.h);
        searchView.setOnKeyPreImeListener(this);
        if (z6) {
            searchView.getViewTreeObserver().addOnGlobalLayoutListener(new x(this));
        }
        listView.setVisibility(ListExtentionsKt.toVisibility(z6));
        listView.setOnItemClickListener(this);
        listView.setOnScrollListener(this);
        listView.getViewTreeObserver().addOnGlobalLayoutListener(new y(this));
        listView.setOnTouchListener(new View.OnTouchListener(this) { // from class: On0.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.pegasus.channel.search.a f17951a;

            {
                this.f17951a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                com.bilibili.pegasus.channel.search.a aVar = this.f17951a;
                t tVar = aVar.f74928e;
                if (tVar == null || tVar.getCount() > 0) {
                    return false;
                }
                aVar.d();
                return false;
            }
        });
        SearchableInfo searchableInfo = ((SearchManager) context.getSystemService("search")).getSearchableInfo(ThemeUtils.getWrapperActivity(searchView.getContext()).getComponentName());
        Context context2 = searchView.getContext();
        ?? abstractC7389c = new AbstractC7389c(context2, 2131493830);
        abstractC7389c.f17943p = false;
        abstractC7389c.f17944q = -1;
        abstractC7389c.f17945r = -1;
        abstractC7389c.f17946s = -1;
        abstractC7389c.f17939l = searchView;
        abstractC7389c.f17940m = searchableInfo;
        abstractC7389c.f17941n = context2;
        abstractC7389c.f17942o = new WeakHashMap<>();
        this.f74928e = abstractC7389c;
        a();
        listView.setAdapter((ListAdapter) abstractC7389c);
        listView.removeFooterView(this.f74929f);
    }

    public final boolean A9(int i7, @NotNull KeyEvent keyEvent) {
        if (i7 == 4) {
            if (this.f74925b.getVisibility() == 0) {
                d();
                return true;
            }
            b();
            return true;
        }
        if (i7 != 84) {
            return true;
        }
        if (this.f74925b.getVisibility() == 0) {
            d();
        } else {
            b();
        }
        this.f74926c.P6(this.h);
        return true;
    }

    public final void a() {
        TintTextView tintTextView = this.f74929f;
        if (tintTextView == null) {
            TintTextView tintTextView2 = new TintTextView(this.f74925b.getContext(), null, 2130971317);
            this.f74929f = tintTextView2;
            tintTextView2.setBackgroundResource(R$color.f64616Wh0);
            this.f74929f.setTextColorById(R$color.Ga5);
            int dimensionPixelSize = this.f74925b.getContext().getResources().getDimensionPixelSize(2131166076);
            this.f74929f.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            this.f74929f.setText(this.f74925b.getContext().getString(2131845326));
            this.f74929f.setGravity(17);
        } else {
            tintTextView.tint();
        }
        this.f74925b.addFooterView(this.f74929f, null, true);
    }

    public final void b() {
        Context context = this.f74930g;
        if (context == null) {
            return;
        }
        InputMethodManagerHelper.hideSoftInput(this.f74930g, ThemeUtils.getWrapperActivity(context).getCurrentFocus(), 2);
        this.f74924a.clearFocus();
        this.f74924a.setFocusable(false);
    }

    public final void c() {
        if (this.f74930g == null) {
            return;
        }
        this.f74924a.setFocusable(true);
        this.f74924a.requestFocus();
        InputMethodManagerHelper.showSoftInput(this.f74930g, this.f74924a.getQueryTextView(), 2);
    }

    public final void d() {
        if (this.f74925b.getVisibility() == 8) {
            b();
            return;
        }
        b();
        this.f74925b.setVisibility(8);
        this.f74927d.Q6(false);
    }

    @Override // android.widget.Filter.FilterListener
    public final void onFilterComplete(int i7) {
        if (this.f74928e != null) {
            if (this.f74924a.enoughToFilter()) {
                this.f74925b.removeFooterView(this.f74929f);
            } else if (i7 == 0) {
                this.f74925b.removeFooterView(this.f74929f);
            } else if (this.f74925b.getFooterViewsCount() == 0) {
                a();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(@NotNull AdapterView<?> adapterView, @NotNull View view, int i7, long j7) {
        String strK;
        if (this.f74925b.getVisibility() == 8) {
            return;
        }
        if (adapterView.getItemAtPosition(i7) == null) {
            new AlertDialog.Builder(view.getContext()).setMessage(2131845130).setNegativeButton(2131841494, (DialogInterface.OnClickListener) null).setPositiveButton(2131841455, new DialogInterface.OnClickListener(this) { // from class: On0.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.pegasus.channel.search.a f17950a;

                {
                    this.f17950a = this;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x00d8
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                    */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface r7, int r8) {
                    /*
                        Method dump skipped, instruction units count: 225
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: On0.u.onClick(android.content.DialogInterface, int):void");
                }
            }).create().show();
            return;
        }
        Cursor cursor = (Cursor) adapterView.getItemAtPosition(i7);
        t tVar = this.f74928e;
        String strA = tVar != null ? tVar.a(cursor) : null;
        Uri uri = (this.f74928e == null || cursor == null || (strK = t.k(cursor, cursor.getColumnIndex("suggest_text_2_url"))) == null) ? null : Uri.parse(strK);
        this.f74924a.setQuery(strA);
        if (uri == null) {
            onQueryTextSubmit(strA);
            return;
        }
        Uri.parse(uri.buildUpon().build().toString());
        if (!TextUtils.isEmpty(strA) && this.f74930g != null) {
            Context context = this.f74930g;
            ChannelSearchSuggestionProvider.Companion.getClass();
            new SearchRecentSuggestions(context, ChannelSearchSuggestionProvider.AUTHORITY, 1).saveRecentQuery(strA, null);
        }
        if (this.f74931i) {
            this.f74924a.setQuery((CharSequence) null);
        }
        this.f74924a.clearFocus();
        d();
    }

    public final boolean onQueryTextChange(@NotNull String str) {
        this.h = str;
        if (this.f74925b.getVisibility() != 0) {
            this.f74925b.setVisibility(0);
            this.f74927d.Q6(true);
            c();
        }
        onSuggestionQuery(str);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable java.lang.String r7) {
        /*
            r6 = this;
            r0 = r7
            if (r0 == 0) goto Ld
            r0 = r7
            r8 = r0
            r0 = r7
            int r0 = android.text.TextUtils.getTrimmedLength(r0)
            if (r0 != 0) goto L1b
        Ld:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L17
            goto L58
        L17:
            java.lang.String r0 = "null"
            r8 = r0
        L1b:
            r0 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L25
            goto L58
        L25:
            r0 = r6
            android.content.Context r0 = r0.f74930g
            if (r0 != 0) goto L2f
            goto L4c
        L2f:
            r0 = r6
            android.content.Context r0 = r0.f74930g
            r7 = r0
            com.bilibili.pegasus.channel.search.ChannelSearchSuggestionProvider$a r0 = com.bilibili.pegasus.channel.search.ChannelSearchSuggestionProvider.Companion
            java.lang.Class r0 = r0.getClass()
            android.provider.SearchRecentSuggestions r0 = new android.provider.SearchRecentSuggestions
            r1 = r0
            r2 = r7
            java.lang.String r3 = com.bilibili.pegasus.channel.search.ChannelSearchSuggestionProvider.access$getAUTHORITY$cp()
            r4 = 1
            r1.<init>(r2, r3, r4)
            r1 = r8
            r2 = 0
            r0.saveRecentQuery(r1, r2)
        L4c:
            r0 = r6
            r0.d()
            r0 = r6
            com.bilibili.pegasus.channel.search.ChannelSearchActivity r0 = r0.f74926c
            r1 = r8
            r0.P6(r1)
        L58:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channel.search.a.onQueryTextSubmit(java.lang.String):boolean");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(@NotNull AbsListView absListView, int i7, int i8, int i9) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(@NotNull AbsListView absListView, int i7) {
        if (i7 != 0) {
            b();
        }
    }

    public final boolean onSuggestionQuery(@NotNull String str) {
        t tVar;
        Filter filter;
        if (this.f74930g == null) {
            return true;
        }
        if ((!this.f74924a.enoughToFilter() && !TextUtils.isEmpty(str)) || (tVar = this.f74928e) == null || (filter = tVar.getFilter()) == null) {
            return true;
        }
        filter.filter(str, this);
        return true;
    }
}
