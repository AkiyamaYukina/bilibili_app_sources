package com.bilibili.search2.provider;

import G.p;
import android.content.SearchRecentSuggestionsProvider;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/provider/BiliSearchSuggestionProvider.class */
@StabilityInferred(parameters = 0)
public final class BiliSearchSuggestionProvider extends SearchRecentSuggestionsProvider {
    public static final int $stable = 8;
    public static final int MODE = 1;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String AUTHORITY = p.a(BiliContext.application().getPackageName(), ".provider.BiliSearchSuggestionProvider");

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/provider/BiliSearchSuggestionProvider$a.class */
    public static final class a {
    }

    public BiliSearchSuggestionProvider() {
        setupSuggestions(AUTHORITY, 1);
    }

    private final Cursor getRecent(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery = super.query(uri, strArr, str, strArr2, str2);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "suggest_intent_query", "suggest_text_1", "suggest_icon_1"});
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("suggest_intent_query"));
                matrixCursor.addRow(new String[]{string, string2, string2, String.valueOf(2131236117)});
            }
            cursorQuery.close();
        }
        return matrixCursor;
    }

    @Override // android.content.SearchRecentSuggestionsProvider, android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return strArr2[0].length() == 0 ? getRecent(uri, strArr, str, strArr2, "suggest_intent_query") : null;
    }
}
