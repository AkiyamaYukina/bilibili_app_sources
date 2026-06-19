package com.bilibili.lib.projection.datasource;

import androidx.compose.runtime.C4277b;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/datasource/ProjectionDataSource.class */
public abstract class ProjectionDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<a> f62996a = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/datasource/ProjectionDataSource$a.class */
    public interface a {
        void a(@NotNull ProjectionDataSource projectionDataSource);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/datasource/ProjectionDataSource$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62997a;

        public b(int i7) {
            this.f62997a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f62997a == ((b) obj).f62997a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (Integer.hashCode(this.f62997a) * 31);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f62997a, ", tryRestOnFail=true)", new StringBuilder("NextInfo(index="));
        }
    }

    @NotNull
    public abstract IProjectionItem getItem(int i7);

    public abstract int getItemCount();

    @NotNull
    public final List<IProjectionItem> getProjectionItemList() {
        ArrayList arrayList = new ArrayList();
        if (getItemCount() <= 0) {
            return arrayList;
        }
        int itemCount = getItemCount();
        for (int i7 = 0; i7 < itemCount; i7++) {
            arrayList.add(getItem(i7));
        }
        return arrayList;
    }

    public int indexOf(@NotNull IProjectionItem iProjectionItem) {
        int itemCount = getItemCount();
        for (int i7 = 0; i7 < itemCount; i7++) {
            if (Intrinsics.areEqual(getItem(i7), iProjectionItem)) {
                return i7;
            }
        }
        return -1;
    }

    @Nullable
    public b next(int i7) {
        return i7 < getItemCount() - 1 ? new b(i7 + 1) : null;
    }

    public final void notifyDataSetChanged() {
        int i7;
        a[] aVarArr;
        synchronized (this.f62996a) {
            aVarArr = (a[]) ((ArrayList) this.f62996a).toArray(new a[0]);
        }
        for (a aVar : aVarArr) {
            aVar.a(this);
        }
    }

    public final void registerDataSetObserver(@NotNull a aVar) {
        synchronized (this.f62996a) {
            if (!((ArrayList) this.f62996a).contains(aVar)) {
                ((ArrayList) this.f62996a).add(aVar);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void unregisterDataSetObserver(@NotNull a aVar) {
        synchronized (this.f62996a) {
            ((ArrayList) this.f62996a).remove(aVar);
        }
    }
}
