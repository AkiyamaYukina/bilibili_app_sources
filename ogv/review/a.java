package com.bilibili.ogv.review;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/a.class */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0454a f72208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final SQLiteDatabase f72209b;

    /* JADX INFO: renamed from: com.bilibili.ogv.review.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/a$a.class */
    public static class C0454a extends SQLiteOpenHelper {
        public C0454a(Context context) {
            super(context, "bangumi_review_draft.db", (SQLiteDatabase.CursorFactory) null, 105);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bangumi_review_draft(_id integer primary key, _data_id text, _user_id integer, _content_type integer, _title text, _content text, _score integer, _origin integer default 0, _spoiler integer default 0, UNIQUE( _data_id,_user_id,_content_type )ON CONFLICT REPLACE)");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e7) {
                    e7.printStackTrace();
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            onUpgrade(sQLiteDatabase, i7, i8);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bangumi_review_draft");
            onCreate(sQLiteDatabase);
        }
    }

    public a(Context context) {
        C0454a c0454a = new C0454a(context);
        this.f72208a = c0454a;
        try {
            this.f72209b = c0454a.getWritableDatabase();
        } catch (SQLiteException e7) {
            e7.printStackTrace();
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public final Cursor b(ReviewPublishInfo reviewPublishInfo, long j7) {
        if (this.f72209b == null) {
            return null;
        }
        try {
            return this.f72209b.query("bangumi_review_draft", null, "_data_id=? and _content_type=? and _user_id=?", new String[]{String.valueOf(reviewPublishInfo.f71723a.f71703a), String.valueOf(0), String.valueOf(j7)}, null, null, null);
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
