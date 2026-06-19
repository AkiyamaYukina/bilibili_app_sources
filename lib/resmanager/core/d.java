package com.bilibili.lib.resmanager.core;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/d.class */
public final /* synthetic */ class d implements Function1 {
    public final Object invoke(Object obj) {
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj).prepare("select * from res_cache");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_file_key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_ctime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_location");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_access_count");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_access_time");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_size");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_biz_type");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_flag");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new g(sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.getText(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }
}
