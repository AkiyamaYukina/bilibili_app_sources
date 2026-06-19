package com.bilibili.tensorflow.data.common;

import MQ0.q;
import X50.C;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.mall.common.extension.MallKtExtensionKt;
import com.mall.data.common.MallLargeImageModel;
import com.mall.videodetail.vd.mall.comment.purchase.MallPurchaseCommentImageLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import mU0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/g.class */
public final class g implements com.bilibili.tensorflow.data.common.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f110734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f110735b = new EntityInsertAdapter();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f110736c = new EntityDeleteOrUpdateAdapter();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/g$a.class */
    public static final class a extends EntityInsertAdapter<h> {
        @Override // androidx.room.EntityInsertAdapter
        public final void bind(SQLiteStatement sQLiteStatement, h hVar) {
            h hVar2 = hVar;
            sQLiteStatement.bindLong(1, hVar2.f110737a);
            sQLiteStatement.bindText(2, hVar2.f110738b);
            sQLiteStatement.bindText(3, hVar2.f110739c);
            sQLiteStatement.bindText(4, hVar2.f110740d);
            sQLiteStatement.bindText(5, hVar2.f110741e);
            sQLiteStatement.bindLong(6, hVar2.f110742f);
            sQLiteStatement.bindLong(7, hVar2.f110743g);
        }

        @Override // androidx.room.EntityInsertAdapter
        public final String createQuery() {
            return "INSERT OR ABORT INTO `_tf_business_data` (`_id`,`_type`,`_data`,`_event_type`,`_user_id`,`_time_stamp`,`_report_time_stamp`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/g$b.class */
    public static final class b extends EntityDeleteOrUpdateAdapter<h> {
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final void bind(SQLiteStatement sQLiteStatement, h hVar) {
            h hVar2 = hVar;
            sQLiteStatement.bindLong(1, hVar2.f110737a);
            sQLiteStatement.bindText(2, hVar2.f110738b);
            sQLiteStatement.bindText(3, hVar2.f110739c);
            sQLiteStatement.bindText(4, hVar2.f110740d);
            sQLiteStatement.bindText(5, hVar2.f110741e);
            sQLiteStatement.bindLong(6, hVar2.f110742f);
            sQLiteStatement.bindLong(7, hVar2.f110743g);
            sQLiteStatement.bindLong(8, hVar2.f110737a);
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final String createQuery() {
            return "UPDATE OR ABORT `_tf_business_data` SET `_id` = ?,`_type` = ?,`_data` = ?,`_event_type` = ?,`_user_id` = ?,`_time_stamp` = ?,`_report_time_stamp` = ? WHERE `_id` = ?";
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.room.EntityInsertAdapter, com.bilibili.tensorflow.data.common.g$a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.room.EntityDeleteOrUpdateAdapter, com.bilibili.tensorflow.data.common.g$b] */
    public g(@NotNull RoomDatabase roomDatabase) {
        this.f110734a = roomDatabase;
    }

    @Override // com.bilibili.tensorflow.data.common.a
    @Nullable
    public final Object a(final long j7, final long j8, @NotNull final String str, @NotNull Continuation continuation) {
        return DBUtil.performSuspending(this.f110734a, true, false, new Function1(str, j7, j8) { // from class: com.bilibili.tensorflow.data.common.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f110725a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f110726b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f110727c;

            {
                this.f110725a = str;
                this.f110726b = j7;
                this.f110727c = j8;
            }

            public final Object invoke(Object obj) {
                String str2 = this.f110725a;
                long j9 = this.f110726b;
                long j10 = this.f110727c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj).prepare("SELECT * FROM _tf_business_data WHERE _event_type = ? AND _type = ? AND _report_time_stamp = ? AND _time_stamp >= ? AND _time_stamp <= ?");
                try {
                    sQLiteStatementPrepare.bindText(1, str2);
                    sQLiteStatementPrepare.bindText(2, "ogv_open_membership_event");
                    sQLiteStatementPrepare.bindLong(3, 0L);
                    sQLiteStatementPrepare.bindLong(4, j9);
                    sQLiteStatementPrepare.bindLong(5, j10);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_data");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_event_type");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_user_id");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_time_stamp");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_report_time_stamp");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new h(sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            }
        }, continuation);
    }

    @Override // com.bilibili.tensorflow.data.common.a
    @Nullable
    public final Object b(final long j7, @NotNull Continuation continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f110734a, false, true, new Function1(j7) { // from class: com.bilibili.tensorflow.data.common.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f110723a;

            {
                this.f110723a = j7;
            }

            public final Object invoke(Object obj) {
                long j8 = this.f110723a;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj).prepare("DELETE FROM _tf_business_data WHERE _id IN (SELECT _id FROM _tf_business_data WHERE _time_stamp <= ? AND  _type = ?)");
                try {
                    sQLiteStatementPrepare.bindLong(1, j8);
                    sQLiteStatementPrepare.bindText(2, "ogv_open_membership_event");
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // com.bilibili.tensorflow.data.common.a
    @Nullable
    public final Object c(final long j7, final long j8, @NotNull final String str, @NotNull ContinuationImpl continuationImpl) {
        return DBUtil.performSuspending(this.f110734a, true, false, new Function1(str, j7, j8) { // from class: com.bilibili.tensorflow.data.common.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f110731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f110732b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f110733c;

            {
                this.f110731a = str;
                this.f110732b = j7;
                this.f110733c = j8;
            }

            public final Object invoke(Object obj) {
                String str2 = this.f110731a;
                long j9 = this.f110732b;
                long j10 = this.f110733c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj).prepare("SELECT * FROM _tf_business_data WHERE _event_type = ? AND _type = ? AND _time_stamp >= ? AND _time_stamp <= ?");
                try {
                    sQLiteStatementPrepare.bindText(1, str2);
                    sQLiteStatementPrepare.bindText(2, "ogv_open_membership_event");
                    sQLiteStatementPrepare.bindLong(3, j9);
                    sQLiteStatementPrepare.bindLong(4, j10);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_data");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_event_type");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_user_id");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_time_stamp");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_report_time_stamp");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new h(sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            }
        }, continuationImpl);
    }

    @Override // com.bilibili.tensorflow.data.common.a
    @Nullable
    public final Object d(@NotNull h hVar, @NotNull Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.f110734a, false, true, new C(1, this, hVar), continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    @Override // com.bilibili.tensorflow.data.common.a
    @Nullable
    public final Object e(final long j7, @NotNull Continuation continuation) {
        return DBUtil.performSuspending(this.f110734a, true, false, new Function1(j7) { // from class: com.bilibili.tensorflow.data.common.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f110724a;

            {
                this.f110724a = j7;
            }

            public final Object invoke(Object obj) {
                long j8 = this.f110724a;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj).prepare("SELECT * FROM _tf_business_data WHERE _type = ? AND _report_time_stamp = ? AND _time_stamp < ? ORDER BY _time_stamp DESC");
                try {
                    sQLiteStatementPrepare.bindText(1, "ogv_open_membership_event");
                    sQLiteStatementPrepare.bindLong(2, 0L);
                    sQLiteStatementPrepare.bindLong(3, j8);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_data");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_event_type");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_user_id");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_time_stamp");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_report_time_stamp");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new h(sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            }
        }, continuation);
    }

    @Override // com.bilibili.tensorflow.data.common.a
    @Nullable
    public final Object f(@NotNull final h hVar, @NotNull Continuation<? super Long> continuation) {
        final int i7 = 0;
        return DBUtil.performSuspending(this.f110734a, false, true, new Function1(i7, this, hVar) { // from class: com.bilibili.tensorflow.data.common.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f110728a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f110729b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f110730c;

            {
                this.f110728a = i7;
                this.f110729b = this;
                this.f110730c = hVar;
            }

            public final Object invoke(Object obj) {
                Object obj2 = this.f110730c;
                Object obj3 = this.f110729b;
                switch (this.f110728a) {
                    case 0:
                        return Long.valueOf(((g) obj3).f110735b.insertAndReturnId((SQLiteConnection) obj, (h) obj2));
                    default:
                        MallPurchaseCommentImageLayout mallPurchaseCommentImageLayout = (MallPurchaseCommentImageLayout) obj;
                        mU0.l lVar = (mU0.l) obj3;
                        rU0.f fVar = new rU0.f(mallPurchaseCommentImageLayout, (rU0.h) obj2, lVar);
                        mallPurchaseCommentImageLayout.removeAllViews();
                        mU0.e eVar = lVar.a;
                        if (MallKtExtensionKt.isNotNullAndNotEmpty(eVar.a)) {
                            List list = eVar.a;
                            int size = list != null ? list.size() : 0;
                            List list2 = eVar.a;
                            if (list2 != null) {
                                int i8 = 0;
                                for (Object obj4 : list2) {
                                    if (i8 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    MallLargeImageModel mallLargeImageModel = (MallLargeImageModel) obj4;
                                    if (i8 <= 2) {
                                        nU0.b bVar = new nU0.b(mallLargeImageModel, i8, size);
                                        View viewInflate = LayoutInflater.from(mallPurchaseCommentImageLayout.getContext()).inflate(2131501135, (ViewGroup) mallPurchaseCommentImageLayout, false);
                                        bVar.invoke(viewInflate.findViewById(2131301895), viewInflate.findViewById(2131317398), viewInflate.findViewById(2131307599));
                                        viewInflate.setOnClickListener(new nU0.c(fVar, i8));
                                        mallPurchaseCommentImageLayout.addView(viewInflate, mallPurchaseCommentImageLayout.a(size > 1 ? 0 : 1, i8));
                                    }
                                    i8++;
                                }
                            }
                        } else {
                            o oVar = lVar.b;
                            if (MallKtExtensionKt.isNotNullAndNotEmpty(oVar.b)) {
                                View viewInflate2 = LayoutInflater.from(mallPurchaseCommentImageLayout.getContext()).inflate(2131501135, (ViewGroup) mallPurchaseCommentImageLayout, false);
                                BiliImageView biliImageViewFindViewById = viewInflate2.findViewById(2131301895);
                                View viewFindViewById = viewInflate2.findViewById(2131317398);
                                View viewFindViewById2 = viewInflate2.findViewById(2131307599);
                                BiliImageView biliImageView = biliImageViewFindViewById;
                                ImageView imageView = (ImageView) viewFindViewById;
                                TintTextView tintTextView = (TintTextView) viewFindViewById2;
                                int i9 = MallPurchaseCommentImageLayout.f;
                                MQ0.k.h(oVar.b, biliImageView, (q) null);
                                MallKtExtensionKt.gone(tintTextView);
                                MallKtExtensionKt.visible(imageView);
                                Unit unit = Unit.INSTANCE;
                                viewInflate2.setOnClickListener(new nU0.d(fVar));
                                mallPurchaseCommentImageLayout.addView(viewInflate2, mallPurchaseCommentImageLayout.a(1, 0));
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }, continuation);
    }
}
