package com.bilibili.ogv.pub.reserve;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.bilibili.ad.adview.videodetail.pausedpage.brand.loopcard.S;
import com.bilibili.api.utils.GsonInstance;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/j.class */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f71670a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f71672c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f71671b = new a(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f71673d = new EntityDeleteOrUpdateAdapter();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f71674e = new c(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/j$a.class */
    public static final class a extends EntityInsertAdapter<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f71675a;

        public a(j jVar) {
            this.f71675a = jVar;
        }

        @Override // androidx.room.EntityInsertAdapter
        public final void bind(SQLiteStatement sQLiteStatement, l lVar) {
            l lVar2 = lVar;
            Long l7 = lVar2.f71678a;
            if (l7 == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindLong(1, l7.longValue());
            }
            sQLiteStatement.bindLong(2, lVar2.f71679b);
            sQLiteStatement.bindLong(3, lVar2.f71680c);
            sQLiteStatement.bindLong(4, lVar2.f71681d);
            sQLiteStatement.bindLong(5, lVar2.f71682e);
            e eVar = this.f71675a.f71672c;
            ReserveEpisode reserveEpisode = lVar2.f71683f;
            String json = reserveEpisode == null ? null : GsonInstance.globalGson.toJson(reserveEpisode);
            if (json == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindText(6, json);
            }
            sQLiteStatement.bindLong(7, lVar2.f71684g);
            sQLiteStatement.bindLong(8, lVar2.h);
            sQLiteStatement.bindLong(9, lVar2.f71685i);
            String str = lVar2.f71686j;
            if (str == null) {
                sQLiteStatement.bindNull(10);
            } else {
                sQLiteStatement.bindText(10, str);
            }
            String str2 = lVar2.f71687k;
            if (str2 == null) {
                sQLiteStatement.bindNull(11);
            } else {
                sQLiteStatement.bindText(11, str2);
            }
            String str3 = lVar2.f71688l;
            if (str3 == null) {
                sQLiteStatement.bindNull(12);
            } else {
                sQLiteStatement.bindText(12, str3);
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `vip_reserve_cache` (`id`,`ep_id`,`is_reserve`,`pub_time`,`is_online`,`episode`,`quality`,`season_type`,`season_id`,`season_title`,`reserve_index`,`reserve_title`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/j$b.class */
    public static final class b extends EntityDeleteOrUpdateAdapter<l> {
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final void bind(SQLiteStatement sQLiteStatement, l lVar) {
            Long l7 = lVar.f71678a;
            if (l7 == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindLong(1, l7.longValue());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final String createQuery() {
            return "DELETE FROM `vip_reserve_cache` WHERE `id` = ?";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/j$c.class */
    public static final class c extends EntityDeleteOrUpdateAdapter<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f71676a;

        public c(j jVar) {
            this.f71676a = jVar;
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final void bind(SQLiteStatement sQLiteStatement, l lVar) {
            l lVar2 = lVar;
            Long l7 = lVar2.f71678a;
            if (l7 == null) {
                sQLiteStatement.bindNull(1);
            } else {
                sQLiteStatement.bindLong(1, l7.longValue());
            }
            sQLiteStatement.bindLong(2, lVar2.f71679b);
            sQLiteStatement.bindLong(3, lVar2.f71680c);
            sQLiteStatement.bindLong(4, lVar2.f71681d);
            sQLiteStatement.bindLong(5, lVar2.f71682e);
            e eVar = this.f71676a.f71672c;
            ReserveEpisode reserveEpisode = lVar2.f71683f;
            String json = reserveEpisode == null ? null : GsonInstance.globalGson.toJson(reserveEpisode);
            if (json == null) {
                sQLiteStatement.bindNull(6);
            } else {
                sQLiteStatement.bindText(6, json);
            }
            sQLiteStatement.bindLong(7, lVar2.f71684g);
            sQLiteStatement.bindLong(8, lVar2.h);
            sQLiteStatement.bindLong(9, lVar2.f71685i);
            String str = lVar2.f71686j;
            if (str == null) {
                sQLiteStatement.bindNull(10);
            } else {
                sQLiteStatement.bindText(10, str);
            }
            String str2 = lVar2.f71687k;
            if (str2 == null) {
                sQLiteStatement.bindNull(11);
            } else {
                sQLiteStatement.bindText(11, str2);
            }
            String str3 = lVar2.f71688l;
            if (str3 == null) {
                sQLiteStatement.bindNull(12);
            } else {
                sQLiteStatement.bindText(12, str3);
            }
            Long l8 = lVar2.f71678a;
            if (l8 == null) {
                sQLiteStatement.bindNull(13);
            } else {
                sQLiteStatement.bindLong(13, l8.longValue());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final String createQuery() {
            return "UPDATE OR ABORT `vip_reserve_cache` SET `id` = ?,`ep_id` = ?,`is_reserve` = ?,`pub_time` = ?,`is_online` = ?,`episode` = ?,`quality` = ?,`season_type` = ?,`season_id` = ?,`season_title` = ?,`reserve_index` = ?,`reserve_title` = ? WHERE `id` = ?";
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.ogv.pub.reserve.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.room.EntityDeleteOrUpdateAdapter, com.bilibili.ogv.pub.reserve.j$b] */
    public j(@NotNull RoomDatabase roomDatabase) {
        this.f71670a = roomDatabase;
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    @NotNull
    public final List<l> a() {
        return (List) DBUtil.performBlocking(this.f71670a, true, false, new J41.b(this, 3));
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    public final void b(@NotNull List<l> list) {
        DBUtil.performBlocking(this.f71670a, false, true, new S(1, this, list));
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    public final void c(@NotNull l lVar) {
        DBUtil.performBlocking(this.f71670a, false, true, new cF0.k(1, this, lVar));
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    @Nullable
    public final List<l> d(final long j7) {
        return (List) DBUtil.performBlocking(this.f71670a, true, false, new Function1(j7, this) { // from class: com.bilibili.ogv.pub.reserve.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f71663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f71664b;

            {
                this.f71663a = j7;
                this.f71664b = this;
            }

            public final Object invoke(Object obj) {
                long j8 = this.f71663a;
                j jVar = this.f71664b;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj).prepare("SELECT * FROM vip_reserve_cache WHERE ep_id=?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j8);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ep_id");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_reserve");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pub_time");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_online");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "episode");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quality");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "season_type");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "season_id");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "season_title");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reserve_index");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reserve_title");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = null;
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                        long j9 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                        int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                        long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                        int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        e eVar = jVar.f71672c;
                        ReserveEpisode reserveEpisodeA = e.a(text2);
                        int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                        int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                        long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        }
                        arrayList.add(new l(lValueOf, j9, i7, j10, i8, reserveEpisodeA, i9, i10, j11, text3, text4, text));
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            }
        });
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    public final void e(@NotNull final List<l> list) {
        final int i7 = 0;
        DBUtil.performBlocking(this.f71670a, false, true, new Function1(i7, this, list) { // from class: com.bilibili.ogv.pub.reserve.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f71665a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f71666b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f71667c;

            {
                this.f71665a = i7;
                this.f71666b = this;
                this.f71667c = list;
            }

            public final Object invoke(Object obj) {
                switch (this.f71665a) {
                    case 0:
                        List list2 = (List) this.f71667c;
                        ((j) this.f71666b).f71674e.handleMultiple((SQLiteConnection) obj, list2);
                        break;
                    default:
                        ((MutableState) this.f71667c).setValue(Dp.m3878boximpl(((Density) this.f71666b).mo1268toDpu2uoSUM((int) (((LayoutCoordinates) obj).mo3153getSizeYbymL2g() & 4294967295L))));
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    @NotNull
    public final List<l> f() {
        return (List) DBUtil.performBlocking(this.f71670a, true, false, new Af1.m(this, 4));
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    @NotNull
    public final List g() {
        return (List) DBUtil.performBlocking(this.f71670a, true, false, new J41.d(this, 3));
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    @NotNull
    public final List h(final boolean z6) {
        return (List) DBUtil.performBlocking(this.f71670a, true, false, new Function1(z6, this) { // from class: com.bilibili.ogv.pub.reserve.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f71668a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f71669b;

            {
                this.f71668a = z6;
                this.f71669b = this;
            }

            public final Object invoke(Object obj) {
                boolean z7 = this.f71668a;
                j jVar = this.f71669b;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj).prepare("SELECT * FROM vip_reserve_cache WHERE is_reserve=? ORDER BY CASE WHEN ? = 1 THEN pub_time END ASC,CASE WHEN ? = 0 THEN pub_time END DESC");
                try {
                    sQLiteStatementPrepare.bindLong(1, 1);
                    long j7 = z7 ? 1L : 0L;
                    sQLiteStatementPrepare.bindLong(2, j7);
                    sQLiteStatementPrepare.bindLong(3, j7);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ep_id");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_reserve");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pub_time");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_online");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "episode");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quality");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "season_type");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "season_id");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "season_title");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reserve_index");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reserve_title");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = null;
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                        long j8 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                        int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                        long j9 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                        int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        e eVar = jVar.f71672c;
                        ReserveEpisode reserveEpisodeA = e.a(text2);
                        int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                        int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                        long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        }
                        arrayList.add(new l(lValueOf, j8, i7, j9, i8, reserveEpisodeA, i9, i10, j10, text3, text4, text));
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            }
        });
    }

    @Override // com.bilibili.ogv.pub.reserve.f
    @NotNull
    public final FlowUtil$createFlow$$inlined$map$1 i() {
        return androidx.room.coroutines.h.a(this.f71670a, false, new String[]{"vip_reserve_cache"}, new J41.c(this, 2));
    }
}
