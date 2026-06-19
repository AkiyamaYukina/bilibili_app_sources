package com.bilibili.lib.resmanager.core;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/f.class */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f64303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f64304b = new EntityInsertAdapter();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/f$a.class */
    public static final class a extends EntityInsertAdapter<g> {
        @Override // androidx.room.EntityInsertAdapter
        public final void bind(SQLiteStatement sQLiteStatement, g gVar) {
            g gVar2 = gVar;
            sQLiteStatement.bindText(1, gVar2.f64305a);
            sQLiteStatement.bindLong(2, gVar2.f64306b);
            String str = gVar2.f64307c;
            if (str == null) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindText(3, str);
            }
            sQLiteStatement.bindLong(4, gVar2.f64308d);
            sQLiteStatement.bindLong(5, gVar2.f64309e);
            sQLiteStatement.bindLong(6, gVar2.f64310f);
            sQLiteStatement.bindText(7, gVar2.f64311g);
            sQLiteStatement.bindLong(8, gVar2.h);
        }

        @Override // androidx.room.EntityInsertAdapter
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `res_cache` (`_file_key`,`_ctime`,`_location`,`_access_count`,`_access_time`,`_size`,`_biz_type`,`_flag`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.room.EntityInsertAdapter, com.bilibili.lib.resmanager.core.f$a] */
    public f(@NotNull RoomDatabase roomDatabase) {
        this.f64303a = roomDatabase;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // com.bilibili.lib.resmanager.core.c
    @NotNull
    public final List<g> a() {
        return (List) DBUtil.performBlocking(this.f64303a, true, false, new Object());
    }

    @Override // com.bilibili.lib.resmanager.core.c
    public final void b(@NotNull List<String> list) {
        StringBuilder sbA = androidx.compose.ui.autofill.r.a("delete from res_cache where _file_key in (");
        StringUtil.appendPlaceholders(sbA, list.size());
        sbA.append(")");
        DBUtil.performBlocking(this.f64303a, false, true, new Ef.s(2, sbA.toString(), list));
    }

    @Override // com.bilibili.lib.resmanager.core.c
    public final void c(@NotNull final List<g> list) {
        DBUtil.performBlocking(this.f64303a, false, true, new Function1(this, list) { // from class: com.bilibili.lib.resmanager.core.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f64301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f64302b;

            {
                this.f64301a = this;
                this.f64302b = list;
            }

            public final Object invoke(Object obj) {
                List list2 = this.f64302b;
                this.f64301a.f64304b.insert((SQLiteConnection) obj, (Iterable) list2);
                return Unit.INSTANCE;
            }
        });
    }
}
