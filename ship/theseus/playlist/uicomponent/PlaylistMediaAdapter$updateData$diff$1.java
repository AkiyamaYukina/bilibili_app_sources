package com.bilibili.ship.theseus.playlist.uicomponent;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistMediaAdapter$updateData$diff$1.class */
final class PlaylistMediaAdapter$updateData$diff$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DiffUtil.DiffResult>, Object> {
    final List<D.g.b> $list;
    final int $newSize;
    final ArrayList<D.g.b> $oldList;
    final int $oldSize;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistMediaAdapter$updateData$diff$1$a.class */
    public static final class a extends DiffUtil.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<D.g.b> f96003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<D.g.b> f96004d;

        public a(int i7, int i8, ArrayList<D.g.b> arrayList, List<D.g.b> list) {
            this.f96001a = i7;
            this.f96002b = i8;
            this.f96003c = arrayList;
            this.f96004d = list;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean areContentsTheSame(int i7, int i8) {
            D.g.b bVar;
            D.g.b bVar2 = (D.g.b) CollectionsKt.getOrNull(this.f96003c, i7);
            boolean zV = false;
            if (bVar2 == null || (bVar = (D.g.b) CollectionsKt.getOrNull(this.f96004d, i8)) == null) {
                return false;
            }
            MultiTypeMedia multiTypeMedia = null;
            Object obj = bVar2.f95984a;
            Object obj2 = bVar.f95984a;
            int i9 = bVar2.f95985b;
            if (i9 == 1) {
                MultiTypeMedia multiTypeMedia2 = obj instanceof MultiTypeMedia ? (MultiTypeMedia) obj : null;
                if (multiTypeMedia2 == null) {
                    return false;
                }
                if (obj2 instanceof MultiTypeMedia) {
                    multiTypeMedia = (MultiTypeMedia) obj2;
                }
                if (multiTypeMedia == null) {
                    return false;
                }
                D.g.b bVar3 = (D.g.b) CollectionsKt.getOrNull(this.f96003c, i7 - 1);
                if (bVar3 != null && bVar3.f95985b == 2) {
                    return false;
                }
                D.g.b bVar4 = (D.g.b) CollectionsKt.getOrNull(this.f96004d, i8 - 1);
                if (bVar4 != null && bVar4.f95985b == 2) {
                    return false;
                }
                zV = multiTypeMedia2.v(multiTypeMedia);
            } else if (i9 == 2) {
                Ou0.c cVar = obj instanceof Ou0.c ? (Ou0.c) obj : null;
                if (cVar == null) {
                    return false;
                }
                Ou0.c cVar2 = obj2 instanceof Ou0.c ? (Ou0.c) obj2 : null;
                if (cVar2 == null) {
                    return false;
                }
                D.g.b bVar5 = (D.g.b) CollectionsKt.getOrNull(this.f96003c, i7 - cVar.f18102p);
                Object obj3 = bVar5 != null ? bVar5.f95984a : null;
                MultiTypeMedia multiTypeMedia3 = obj3 instanceof MultiTypeMedia ? (MultiTypeMedia) obj3 : null;
                if (multiTypeMedia3 == null) {
                    return false;
                }
                Ou0.c cVar3 = (Ou0.c) CollectionsKt.getOrNull(multiTypeMedia3.f95225M, multiTypeMedia3.f95252z);
                long j7 = cVar.f18089b;
                if (cVar3 != null && j7 == cVar3.f18089b) {
                    return false;
                }
                D.g.b bVar6 = (D.g.b) CollectionsKt.getOrNull(this.f96004d, i8 - cVar2.f18102p);
                Object obj4 = bVar6 != null ? bVar6.f95984a : null;
                MultiTypeMedia multiTypeMedia4 = null;
                if (obj4 instanceof MultiTypeMedia) {
                    multiTypeMedia4 = (MultiTypeMedia) obj4;
                }
                if (multiTypeMedia4 == null) {
                    return false;
                }
                Ou0.c cVar4 = (Ou0.c) CollectionsKt.getOrNull(multiTypeMedia4.f95225M, multiTypeMedia4.f95252z);
                long j8 = cVar2.f18089b;
                if (cVar4 != null && j8 == cVar4.f18089b) {
                    return false;
                }
                if (j7 == j8) {
                    zV = true;
                }
            }
            return zV;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean areItemsTheSame(int i7, int i8) {
            D.g.b bVar;
            D.g.b bVar2 = (D.g.b) CollectionsKt.getOrNull(this.f96003c, i7);
            boolean zAreEqual = false;
            if (bVar2 == null || (bVar = (D.g.b) CollectionsKt.getOrNull(this.f96004d, i8)) == null) {
                return false;
            }
            Long lValueOf = null;
            Object obj = bVar2.f95984a;
            Object obj2 = bVar.f95984a;
            int i9 = bVar2.f95985b;
            if (i9 == 1) {
                MultiTypeMedia multiTypeMedia = obj instanceof MultiTypeMedia ? (MultiTypeMedia) obj : null;
                MultiTypeMedia multiTypeMedia2 = obj2 instanceof MultiTypeMedia ? (MultiTypeMedia) obj2 : null;
                Long lValueOf2 = multiTypeMedia != null ? Long.valueOf(multiTypeMedia.f95235i) : null;
                Long lValueOf3 = null;
                if (multiTypeMedia2 != null) {
                    lValueOf3 = Long.valueOf(multiTypeMedia2.f95235i);
                }
                zAreEqual = Intrinsics.areEqual(lValueOf2, lValueOf3);
            } else if (i9 == 2) {
                Ou0.c cVar = obj instanceof Ou0.c ? (Ou0.c) obj : null;
                Ou0.c cVar2 = obj2 instanceof Ou0.c ? (Ou0.c) obj2 : null;
                Long lValueOf4 = cVar != null ? Long.valueOf(cVar.f18089b) : null;
                if (cVar2 != null) {
                    lValueOf = Long.valueOf(cVar2.f18089b);
                }
                zAreEqual = Intrinsics.areEqual(lValueOf4, lValueOf);
            }
            return zAreEqual;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final int getNewListSize() {
            return this.f96002b;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final int getOldListSize() {
            return this.f96001a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistMediaAdapter$updateData$diff$1(int i7, int i8, ArrayList<D.g.b> arrayList, List<D.g.b> list, Continuation<? super PlaylistMediaAdapter$updateData$diff$1> continuation) {
        super(2, continuation);
        this.$oldSize = i7;
        this.$newSize = i8;
        this.$oldList = arrayList;
        this.$list = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistMediaAdapter$updateData$diff$1(this.$oldSize, this.$newSize, this.$oldList, this.$list, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DiffUtil.DiffResult> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DiffUtil.calculateDiff(new a(this.$oldSize, this.$newSize, this.$oldList, this.$list));
    }
}
