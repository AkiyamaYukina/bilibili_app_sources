package com.bilibili.tensorflow.data.common;

import androidx.appcompat.widget.C3259x;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/i.class */
public final class i extends RoomDatabase.Callback {
    @Override // androidx.room.RoomDatabase.Callback
    public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        defpackage.a.b("[tensorflow-TfDatabase$Companion$buildDatabase$1-onCreate] ", C3259x.a(supportSQLiteDatabase.getVersion(), "room:onCreate:version:"), "TfDatabase$Companion$buildDatabase$1-onCreate");
    }

    @Override // androidx.room.RoomDatabase.Callback
    public final void onDestructiveMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
        defpackage.a.b("[tensorflow-TfDatabase$Companion$buildDatabase$1-onDestructiveMigration] ", C3259x.a(supportSQLiteDatabase.getVersion(), "room:onMigration:version:"), "TfDatabase$Companion$buildDatabase$1-onDestructiveMigration");
    }

    @Override // androidx.room.RoomDatabase.Callback
    public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        defpackage.a.b("[tensorflow-TfDatabase$Companion$buildDatabase$1-onOpen] ", com.bilibili.app.comm.bh.x5.b.a("room:onOpen:isOpen:", supportSQLiteDatabase.isOpen()), "TfDatabase$Companion$buildDatabase$1-onOpen");
    }
}
