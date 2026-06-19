package com.bilibili.playset.playlist.search2;

import android.app.SearchableInfo;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.util.C4640i;
import com.bilibili.app.comm.list.widget.search.TintSearchView;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintView;
import h1.AbstractC7389c;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qs0.q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/q.class */
@StabilityInferred(parameters = 0)
public final class q extends AbstractC7389c implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f85474r = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Context f85475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TintSearchView f85476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final BaseSearchSuggestionsFragment f85477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final SearchableInfo f85478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f85480q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/q$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f85481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TintImageView f85482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TintView f85483c;

        public a(@NotNull View view) {
            this.f85481a = (TextView) view.findViewById(2131311144);
            this.f85482b = (TintImageView) view.findViewById(2131299944);
            this.f85483c = (TintView) view.findViewById(2131303070);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/q$b.class */
    public static final class b {
        public static String a(Cursor cursor, int i7) {
            if (i7 == -1) {
                return null;
            }
            try {
                return cursor.getString(i7);
            } catch (Exception e7) {
                BLog.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
                return null;
            }
        }
    }

    public q(@NotNull Context context, @NotNull TintSearchView tintSearchView, @NotNull SearchableInfo searchableInfo, @NotNull BaseSearchSuggestionsFragment baseSearchSuggestionsFragment) {
        super(context, 2131501107);
        this.f85475l = context;
        this.f85476m = tintSearchView;
        this.f85477n = baseSearchSuggestionsFragment;
        this.f85480q = -1;
        this.f85478o = searchableInfo;
        new WeakHashMap();
    }

    @Override // h1.AbstractC7387a, h1.C7388b.a
    public final void b(@Nullable Cursor cursor) {
        if (this.f85479p) {
            BLog.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f85480q = cursor.getColumnIndex("suggest_text_1");
                cursor.getColumnIndex("suggest_icon_1");
            }
        } catch (Exception e7) {
            BLog.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // h1.C7388b.a
    @Nullable
    public final Cursor d(@NotNull CharSequence charSequence) {
        BLog.d("SuggestionsAdapter", "runQueryOnBackgroundThread(" + ((Object) charSequence) + ")");
        String string = charSequence.toString();
        if (this.f85476m.getVisibility() != 0) {
            BLog.w("SuggestionsAdapter", "mSearchView invsible");
            return null;
        }
        try {
            Cursor cursorH = h(this.f85478o, string);
            if (cursorH == null) {
                return null;
            }
            BLog.i("SuggestionsAdapter", "Cursor count:" + cursorH.getCount());
            return cursorH;
        } catch (RuntimeException e7) {
            BLog.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e7);
            return null;
        }
    }

    @Override // h1.AbstractC7387a
    public final void e(@NotNull View view, @NotNull Context context, @NotNull Cursor cursor) {
        a aVar = (a) view.getTag();
        String strA = b.a(cursor, this.f85480q);
        TextView textView = aVar.f85481a;
        textView.setText(strA);
        int i7 = 0;
        if (TextUtils.isEmpty(strA)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        final String strA2 = b.a(cursor, cursor.getColumnIndex("_id"));
        aVar.f85482b.setOnClickListener(new View.OnClickListener(this, strA2) { // from class: com.bilibili.playset.playlist.search2.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f85472a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f85473b;

            {
                this.f85472a = this;
                this.f85473b = strA2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q qVar = this.f85472a;
                String str = this.f85473b;
                Uri uriA = C4640i.a("content://", qVar.f85478o.getSuggestAuthority(), "/suggestions");
                String authority = uriA.getAuthority();
                if (authority != null) {
                    q.a aVarA = qs0.q.a(qVar.f85475l, authority);
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    aVarA.getClass();
                    try {
                        ContentProviderClient contentProviderClient = aVarA.f126328a;
                        if (contentProviderClient != null) {
                            contentProviderClient.delete(uriA, "_id=?", new String[]{str2});
                        }
                    } catch (Exception e7) {
                    }
                    aVarA.a();
                    Cursor cursorH = qVar.h(qVar.f85478o, qVar.f85476m.getQuery().toString());
                    if ((cursorH != null ? cursorH.getCount() : 0) == 0) {
                        BaseSearchSuggestionsFragment baseSearchSuggestionsFragment = qVar.f85477n;
                        ListView listView = baseSearchSuggestionsFragment.f85380d;
                        if (listView != null) {
                            listView.removeFooterView(baseSearchSuggestionsFragment.f85379c);
                        }
                        baseSearchSuggestionsFragment.h = false;
                    }
                    qVar.b(cursorH);
                }
            }
        });
        if (cursor.getPosition() == cursor.getCount() - 1) {
            i7 = 8;
        }
        aVar.f85483c.setVisibility(i7);
    }

    @Override // h1.AbstractC7389c, h1.AbstractC7387a
    @NotNull
    public final View f(@NotNull Context context, @NotNull Cursor cursor, @NotNull ViewGroup viewGroup) {
        View viewF = super.f(context, cursor, viewGroup);
        viewF.setTag(new a(viewF));
        return viewF;
    }

    @Override // h1.AbstractC7387a, h1.C7388b.a
    @Nullable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String a(@NotNull Cursor cursor) {
        String strA;
        String strA2;
        String strA3 = b.a(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strA3 != null) {
            return strA3;
        }
        if (this.f85478o.shouldRewriteQueryFromData() && (strA2 = b.a(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strA2;
        }
        if (!this.f85478o.shouldRewriteQueryFromText() || (strA = b.a(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strA;
    }

    @Override // h1.AbstractC7387a, android.widget.Adapter
    @NotNull
    public final View getView(int i7, @Nullable View view, @NotNull ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            BLog.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewF = f(this.f85475l, this.f120796c, viewGroup);
            ((a) viewF.getTag()).f85481a.setText(e7.toString());
            return viewF;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String[] strArr;
        Cursor cursorQuery;
        if (searchableInfo == null) {
            return null;
        }
        Uri uriA = C4640i.a("content://", this.f85478o.getSuggestAuthority(), "/suggestions");
        String authority = uriA.getAuthority();
        if (authority != null) {
            q.a aVarA = qs0.q.a(this.f85475l, authority);
            aVarA.getClass();
            try {
                ContentProviderClient contentProviderClient = aVarA.f126328a;
                if (contentProviderClient != null) {
                    contentProviderClient.delete(uriA, "_id IN (SELECT _id FROM suggestions ORDER BY date DESC LIMIT -1 OFFSET 20)", null);
                }
            } catch (Exception e7) {
            }
            aVarA.a();
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(TextSource.CFG_CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
            strArr = null;
        }
        builderFragment.appendQueryParameter("limit", String.valueOf(20));
        Uri uriBuild = builderFragment.build();
        Context context = this.f85475l;
        q.a aVar = qs0.q.f126327a;
        try {
            cursorQuery = context.getContentResolver().query(uriBuild, null, suggestSelection, strArr, null);
        } catch (Exception e8) {
            cursorQuery = null;
        }
        return cursorQuery;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f120796c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f120796c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f85476m.onQueryRefine((CharSequence) tag);
        }
    }
}
