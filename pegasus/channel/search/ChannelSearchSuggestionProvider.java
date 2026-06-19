package com.bilibili.pegasus.channel.search;

import G.p;
import android.app.Application;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.base.provider.CustomizableDBSearchRecentSuggestionsProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/ChannelSearchSuggestionProvider.class */
@StabilityInferred(parameters = 0)
public final class ChannelSearchSuggestionProvider extends CustomizableDBSearchRecentSuggestionsProvider {
    public static final int $stable = 8;

    @NotNull
    private static final String AUTHORITY;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String DB_NAME = "suggestions_channel_search.db";
    public static final int MODE = 1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/ChannelSearchSuggestionProvider$a.class */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.pegasus.channel.search.ChannelSearchSuggestionProvider$a, java.lang.Object] */
    static {
        Application application = BiliContext.application();
        AUTHORITY = p.a(application != null ? application.getPackageName() : null, ".provider.ChannelSearchSuggestionProvider");
    }

    public ChannelSearchSuggestionProvider() {
        setupSuggestions(AUTHORITY, 1);
    }

    @NotNull
    public String getCustomDBName() {
        return DB_NAME;
    }

    @DrawableRes
    public int getHistoryIcon() {
        return 2131234610;
    }

    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "suggest_intent_query", "suggest_text_1", "suggest_icon_1", "suggest_text_2", "suggest_text_2_url"});
        String[] strArr3 = new String[6];
        Cursor cursorQuery = super.query(uri, strArr, str, strArr2, "suggest_intent_query");
        if (cursorQuery != null) {
            int i7 = 64;
            int i8 = 0;
            while (cursorQuery.moveToNext() && i8 < 10) {
                strArr3[0] = Integer.toString(i7);
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("suggest_intent_query"));
                strArr3[2] = string;
                strArr3[1] = string;
                strArr3[3] = String.valueOf(2131234610);
                strArr3[5] = null;
                strArr3[4] = null;
                matrixCursor.addRow(strArr3);
                i8++;
                i7++;
            }
            cursorQuery.close();
        }
        return matrixCursor;
    }
}
