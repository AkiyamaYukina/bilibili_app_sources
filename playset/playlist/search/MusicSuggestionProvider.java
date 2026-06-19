package com.bilibili.playset.playlist.search;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.Nullable;
import com.bilibili.base.provider.CustomizableDBSearchRecentSuggestionsProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSuggestionProvider.class */
public class MusicSuggestionProvider extends CustomizableDBSearchRecentSuggestionsProvider {
    public static String AUTHORITY;
    private static final String DB_NAME = "suggestions_music_playlist.db";
    public static final int MODE = 1;

    private String getCursorString(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? cursor.getString(columnIndex) : "";
    }

    private Cursor getRecent(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        Cursor cursorQuery = super.query(uri, strArr, str, strArr2, str2);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "suggest_intent_query", "suggest_text_1", "suggest_icon_1"});
        int i7 = 0;
        while (cursorQuery.moveToNext()) {
            String cursorString = getCursorString(cursorQuery, "_id");
            String cursorString2 = getCursorString(cursorQuery, "suggest_intent_query");
            matrixCursor.addRow(new String[]{cursorString, cursorString2, cursorString2, String.valueOf(2131236117)});
            int i8 = i7 + 1;
            i7 = i8;
            if (i8 >= 20) {
                break;
            }
        }
        cursorQuery.close();
        return matrixCursor;
    }

    public String getCustomDBName() {
        return DB_NAME;
    }

    public int getHistoryIcon() {
        return 2131236117;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreate() {
        String str = getContext().getPackageName() + ".music.provider.MusicSearchSuggestionProvider";
        AUTHORITY = str;
        setupSuggestions(str, 1);
        return super.onCreate();
    }

    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        if (strArr2[0].length() == 0) {
            return getRecent(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "suggest_intent_query", "suggest_text_1", "suggest_icon_1", "suggest_text_2", "suggest_text_2_url"});
        String[] strArr3 = new String[6];
        Cursor cursorQuery = super.query(uri, strArr, str, strArr2, "suggest_intent_query");
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                strArr3[0] = getCursorString(cursorQuery, "_id");
                String cursorString = getCursorString(cursorQuery, "suggest_intent_query");
                strArr3[2] = cursorString;
                strArr3[1] = cursorString;
                strArr3[3] = String.valueOf(getHistoryIcon());
                strArr3[5] = null;
                strArr3[4] = null;
                matrixCursor.addRow(strArr3);
            }
            cursorQuery.close();
        }
        return matrixCursor;
    }
}
