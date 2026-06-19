package com.bilibili.playerbizcommon.gesture;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/PriorityGestureProcessor.class */
public final class PriorityGestureProcessor<T> {

    @NotNull
    public static final a Companion = new Object();
    public static final int PRIORITY_HIGH = 3;
    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_LOWEST = 0;
    public static final int PRIORITY_NORMAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SparseArray<b<T>> f80045a = new SparseArray<>(3);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/PriorityGestureProcessor$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/PriorityGestureProcessor$b.class */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkedList<T> f80046a = new LinkedList<>();

        public final boolean a(@NotNull Function1<? super T, Boolean> function1) {
            Iterator<T> it = this.f80046a.iterator();
            while (it.hasNext()) {
                if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void addProcessCallback(T t7, int i7) {
        int i8 = (i7 < 0 || i7 > 3) ? 2 : i7;
        b<T> bVar = this.f80045a.get(i7);
        if (bVar == null || !bVar.f80046a.contains(t7)) {
            b<T> bVar2 = bVar;
            if (bVar == null) {
                bVar2 = new b<>();
                this.f80045a.put(i8, bVar2);
            }
            bVar2.f80046a.add(t7);
        }
    }

    public final void clear() {
        this.f80045a.clear();
    }

    public final boolean process(@NotNull Function1<? super T, Boolean> function1) {
        b<T> bVar = this.f80045a.get(3);
        if (bVar != null && bVar.a(function1)) {
            return true;
        }
        b<T> bVar2 = this.f80045a.get(2);
        if (bVar2 != null && bVar2.a(function1)) {
            return true;
        }
        b<T> bVar3 = this.f80045a.get(1);
        if (bVar3 != null && bVar3.a(function1)) {
            return true;
        }
        b<T> bVar4 = this.f80045a.get(0);
        return bVar4 != null && bVar4.a(function1);
    }

    public final void removeProcessCallback(T t7) {
        int size = this.f80045a.size();
        for (int i7 = 0; i7 < size; i7++) {
            SparseArray<b<T>> sparseArray = this.f80045a;
            Iterator<T> it = sparseArray.get(sparseArray.keyAt(i7)).f80046a.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next(), t7)) {
                    it.remove();
                }
            }
        }
    }
}
