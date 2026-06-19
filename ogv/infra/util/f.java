package com.bilibili.ogv.infra.util;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/f.class */
public class f<E, S> extends kotlin.collections.c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<S> f67950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<S, E> f67951b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/f$a.class */
    public static final class a implements Iterator<E>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<S> f67952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f<E, S> f67953b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Iterator<? extends S> it, f<E, S> fVar) {
            this.f67952a = it;
            this.f67953b = fVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f67952a.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.f67953b.f67951b.invoke(this.f67952a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/f$b.class */
    public static final class b implements ListIterator<E>, KMappedMarker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator<S> f67954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f<E, S> f67955b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ListIterator<? extends S> listIterator, f<E, S> fVar) {
            this.f67954a = listIterator;
            this.f67955b = fVar;
        }

        @Override // java.util.ListIterator
        public final void add(E e7) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f67954a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f67954a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            return (E) this.f67955b.f67951b.invoke(this.f67954a.next());
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f67954a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final E previous() {
            return (E) this.f67955b.f67951b.invoke(this.f67954a.previous());
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f67954a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(E e7) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull List<? extends S> list, @NotNull Function1<? super S, ? extends E> function1) {
        this.f67950a = list;
        this.f67951b = function1;
    }

    public final E get(int i7) {
        return (E) this.f67951b.invoke(this.f67950a.get(i7));
    }

    public final int getSize() {
        return this.f67950a.size();
    }

    public final boolean isEmpty() {
        return this.f67950a.isEmpty();
    }

    @NotNull
    public final Iterator<E> iterator() {
        return new a(this.f67950a.iterator(), this);
    }

    @NotNull
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @NotNull
    public final ListIterator<E> listIterator(int i7) {
        return new b(this.f67950a.listIterator(i7), this);
    }
}
