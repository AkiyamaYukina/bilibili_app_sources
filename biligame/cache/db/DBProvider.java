package com.bilibili.biligame.cache.db;

import G.p;
import Ho.b;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.T;
import androidx.media3.common.util.C4640i;
import com.bilibili.lib.spy.generated.android_content_ContentProvider;
import com.bilibili.xpref.Xpref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/cache/db/DBProvider.class */
public class DBProvider extends android_content_ContentProvider {
    private static final long MB = 1048576;
    private static final int MIN_SPACE_LEFT = 150;
    private static final String TAG = "DBProvider";
    private static Uri USER_CONTENT_URI;
    public static final int USER_URI_CODE = 1;
    private b dbOpenHelper;
    private Context mContext;
    private boolean mInit;
    private boolean maybeInit;
    private String authority = "";
    private UriMatcher mUriMatcher = new UriMatcher(-1);

    public static Uri getContentUri(Context context) {
        if (USER_CONTENT_URI == null) {
            USER_CONTENT_URI = C4640i.a("content://", p.a(context.getApplicationContext().getPackageName(), ".cache.db.provider"), "/com_bilibili_biligame_cache_db_BaseDBModle");
        }
        return USER_CONTENT_URI;
    }

    private String getTableName(Uri uri) {
        return this.mUriMatcher.match(uri) != 1 ? null : "com_bilibili_biligame_cache_db_BaseDBModle";
    }

    public void clear() {
        b bVar = this.dbOpenHelper;
        if (bVar != null) {
            Map<String, b> map = b.f8732b;
            String str = bVar.f8733a;
            HashMap map2 = (HashMap) map;
            b bVar2 = (b) map2.get(str);
            if (bVar2 != null) {
                bVar2.close();
            }
            map2.remove(bVar.f8733a);
        }
        this.dbOpenHelper = null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        maybeInit(getContext());
        if (!this.mInit) {
            BLog.e(TAG, "insert fail,dbOpenHelper init fail");
            return null;
        }
        if (this.dbOpenHelper == null) {
            throw new NullPointerException("dbOpenHelper not init");
        }
        String tableName = getTableName(uri);
        if (TextUtils.isEmpty(tableName)) {
            throw new IllegalArgumentException(T.a(uri, "Unsupported URI: "));
        }
        b bVar = this.dbOpenHelper;
        Map<String, b> map = b.f8732b;
        b bVar2 = (b) ((HashMap) map).get(bVar.f8733a);
        synchronized (bVar2) {
            bVar2.getWritableDatabase().replace(tableName, null, contentValues);
        }
        this.mContext.getContentResolver().notifyChange(uri, null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5, types: [Ho.b, android.database.sqlite.SQLiteOpenHelper] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v16, types: [Ho.b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public void maybeInit(Context context) {
        long availableBytes;
        if (this.maybeInit) {
            return;
        }
        try {
            availableBytes = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Throwable th) {
            availableBytes = -1;
        }
        try {
            int i7 = Xpref.getSharedPreferences(context, "pref_key_gamecenter").getInt("pref_key_gamecenter_min_space_left", 0);
            int i8 = i7;
            if (i7 <= 0) {
                i8 = MIN_SPACE_LEFT;
            }
            long j7 = ((long) i8) * 1048576;
            if (availableBytes > j7) {
                Map<String, b> map = b.f8732b;
                b bVar = (b) ((HashMap) map).get("BiliGameDataCache.db");
                ?? r14 = bVar;
                if (bVar == null) {
                    ?? sQLiteOpenHelper = new SQLiteOpenHelper(context.getApplicationContext(), "BiliGameDataCache.db", (SQLiteDatabase.CursorFactory) null, 1);
                    sQLiteOpenHelper.f8733a = "BiliGameDataCache.db";
                    new ArrayList();
                    r14 = sQLiteOpenHelper;
                }
                ((HashMap) map).put("BiliGameDataCache.db", r14);
                this.dbOpenHelper = r14;
                String str = context.getApplicationContext().getPackageName() + ".cache.db.provider";
                this.authority = str;
                this.mUriMatcher.addURI(str, "com_bilibili_biligame_cache_db_BaseDBModle", 1);
                this.dbOpenHelper.b(new BaseDBModle());
            } else {
                BLog.e(TAG, "availableLength = " + availableBytes + " minSpaceLeft = " + j7);
            }
            this.mInit = true;
        } catch (Throwable th2) {
            BLog.e(TAG, th2.getMessage());
        }
        this.maybeInit = true;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.mContext = getContext();
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        maybeInit(getContext());
        if (!this.mInit) {
            BLog.e(TAG, "query fail,dbOpenHelper init fail");
            return null;
        }
        if (this.dbOpenHelper == null) {
            throw new NullPointerException("dbOpenHelper not init");
        }
        String tableName = getTableName(uri);
        if (TextUtils.isEmpty(tableName)) {
            throw new IllegalArgumentException(T.a(uri, "Unsupported URI: "));
        }
        b bVar = this.dbOpenHelper;
        Map<String, b> map = b.f8732b;
        b bVar2 = (b) ((HashMap) map).get(bVar.f8733a);
        synchronized (bVar2) {
            cursorQuery = bVar2.getReadableDatabase().query(tableName, strArr, str, strArr2, null, null, str2, null);
        }
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
