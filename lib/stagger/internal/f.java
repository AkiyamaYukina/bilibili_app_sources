package com.bilibili.lib.stagger.internal;

import androidx.collection.ArrayMap;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bilibili.gripper.mod.ModStaggerSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC7988c;
import mf0.InterfaceC7989d;
import nf0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayMap<String, MutableLiveData<nf0.o>> f64521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayMap<String, MutableLiveData<nf0.o>> f64522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final nf0.i f64523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayMap<String, List<a>> f64524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayMap<InterfaceC7988c.InterfaceC1323c, a> f64525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Object f64526f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/f$a.class */
    public static final class a implements InterfaceC7988c.InterfaceC1323c, Observer<nf0.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ModStaggerSource.a f64527a;

        public a(@NotNull ModStaggerSource.a aVar) {
            this.f64527a = aVar;
        }

        @Override // mf0.InterfaceC7988c.InterfaceC1323c
        public final void a(@NotNull InterfaceC7988c interfaceC7988c) {
            this.f64527a.a(interfaceC7988c);
        }

        @Override // mf0.InterfaceC7988c.InterfaceC1323c
        public final void b(@Nullable InterfaceC7988c.a aVar) {
            this.f64527a.b(aVar);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull nf0.o oVar) throws NoWhenBranchMatchedException {
            if (oVar instanceof o.b) {
                a(((o.b) oVar).f124124a);
            } else {
                if (!(oVar instanceof o.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                b(((o.a) oVar).f124123b);
            }
        }
    }

    public f() {
        new ArrayMap();
        this.f64521a = new ArrayMap<>();
        new ArrayMap();
        this.f64522b = new ArrayMap<>();
        this.f64523c = new nf0.i();
        this.f64524d = new ArrayMap<>();
        this.f64525e = new ArrayMap<>();
        this.f64526f = new Object();
    }

    public final MutableLiveData a(String str, ArrayMap arrayMap) {
        MutableLiveData mutableLiveData;
        synchronized (this) {
            Object obj = arrayMap.get(str);
            Object mutableLiveData2 = obj;
            if (obj == null) {
                mutableLiveData2 = new MutableLiveData();
                arrayMap.put(str, mutableLiveData2);
            }
            mutableLiveData = (MutableLiveData) mutableLiveData2;
        }
        return mutableLiveData;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b(@NotNull nf0.o oVar) throws NoWhenBranchMatchedException {
        InterfaceC7989d interfaceC7989d;
        boolean z6 = oVar instanceof o.b;
        if (z6) {
            nf0.i iVar = this.f64523c;
            nf0.j jVar = ((o.b) oVar).f124124a;
            synchronized (iVar) {
                ArrayMap arrayMap = (ArrayMap) iVar.f124100a.getValue();
                String str = jVar.f124103b;
                Object obj = arrayMap.get(str);
                Object arrayList = obj;
                if (obj == null) {
                    arrayList = new ArrayList();
                    arrayMap.put(str, arrayList);
                }
                List list = (List) arrayList;
                ListIterator listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if (Intrinsics.areEqual(((InterfaceC7988c) listIterator.next()).getKey(), jVar.f124102a)) {
                        listIterator.remove();
                    }
                }
                list.add(jVar);
            }
        }
        if (z6) {
            interfaceC7989d = ((o.b) oVar).f124124a;
        } else {
            if (!(oVar instanceof o.a)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC7989d = ((o.a) oVar).f124122a;
        }
        a(interfaceC7989d.getKey(), this.f64521a).postValue(oVar);
        String hash = interfaceC7989d.getHash();
        if (hash != null) {
            a(hash, this.f64521a).postValue(oVar);
        }
        synchronized (this.f64526f) {
            List<a> list2 = this.f64524d.get(interfaceC7989d.getBizType());
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).onChanged(oVar);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        a(interfaceC7989d.getBizType(), this.f64522b).postValue(oVar);
    }
}
