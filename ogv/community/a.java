package com.bilibili.ogv.community;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/a.class */
public final class a<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<K, io.reactivex.rxjava3.subjects.a<Optional<V>>> f67499a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PublishSubject<Pair<K, Optional<V>>> f67500b = PublishSubject.create();

    /* JADX INFO: renamed from: com.bilibili.ogv.community.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/a$a.class */
    public static final class C0392a<T> implements Predicate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0392a<T> f67501a = (C0392a<T>) new Object();

        public final boolean test(Object obj) {
            return ((Optional) ((Pair) obj).getSecond()).isPresent();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/a$b.class */
    public static final class b<T, R> implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T, R> f67502a = (b<T, R>) new Object();

        public final Object apply(Object obj) {
            Pair pair = (Pair) obj;
            return new Pair(pair.getFirst(), ((Optional) pair.getSecond()).get());
        }
    }

    @Nullable
    public final V a(@NotNull K k7) {
        io.reactivex.rxjava3.subjects.a<Optional<V>> aVar = this.f67499a.get(k7);
        Object objOrElse = null;
        if (aVar != null) {
            Optional optional = (Optional) aVar.e();
            objOrElse = null;
            if (optional != null) {
                objOrElse = optional.orElse(null);
            }
        }
        return (V) objOrElse;
    }

    @NotNull
    public final Observable<Pair<K, V>> b() {
        return this.f67500b.filter(C0392a.f67501a).map(b.f67502a);
    }

    public final boolean c(@NotNull K k7, @NotNull V v7) {
        ConcurrentHashMap<K, io.reactivex.rxjava3.subjects.a<Optional<V>>> concurrentHashMap = this.f67499a;
        io.reactivex.rxjava3.subjects.a<Optional<V>> aVar = concurrentHashMap.get(k7);
        io.reactivex.rxjava3.subjects.a<Optional<V>> aVarC = aVar;
        if (aVar == null) {
            aVarC = io.reactivex.rxjava3.subjects.a.c();
            io.reactivex.rxjava3.subjects.a<Optional<V>> aVarPutIfAbsent = concurrentHashMap.putIfAbsent(k7, aVarC);
            if (aVarPutIfAbsent != null) {
                aVarC = aVarPutIfAbsent;
            }
        }
        io.reactivex.rxjava3.subjects.a<Optional<V>> aVar2 = aVarC;
        if (Intrinsics.areEqual(aVar2.e(), v7)) {
            return false;
        }
        aVar2.onNext(Optional.of(v7));
        this.f67500b.onNext(new Pair(k7, Optional.of(v7)));
        return true;
    }
}
