package com.bilibili.ship.theseus.united.page.backpress;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/backpress/BackActionRepository.class */
@StabilityInferred(parameters = 0)
public final class BackActionRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f99046a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<Function1<Boolean, Boolean>> f99047b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f99048c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/backpress/BackActionRepository$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function1<Boolean, Boolean> f99049a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super Boolean, Boolean> function1) {
            this.f99049a = function1;
        }
    }

    @Inject
    public BackActionRepository() {
    }

    @Nullable
    public final Object a(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new BackActionRepository$cancelOnBackAction$2(this, function1, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Boolean> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$keepBackAction$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$keepBackAction$1 r0 = (com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$keepBackAction$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$keepBackAction$1 r0 = new com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$keepBackAction$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6c
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r7
            java.lang.Object r0 = r0.L$0
            com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$a r0 = (com.bilibili.ship.theseus.united.page.backpress.BackActionRepository.a) r0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L68
            goto L9d
        L68:
            r7 = move-exception
            goto Lb1
        L6c:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$a r0 = new com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$a
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            java.util.ArrayList<com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$a> r0 = r0.f99046a
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = r7
            r1 = r6
            r0.L$0 = r1     // Catch: java.lang.Throwable -> Lb0
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> Lb0
            r0 = r7
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> Lb0
            r7 = r0
            r0 = r7
            r1 = r9
            if (r0 != r1) goto L9b
            r0 = r9
            return r0
        L9b:
            r0 = r6
            r7 = r0
        L9d:
            r0 = r7
            r6 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L68
            r9 = r0
            r0 = r7
            r6 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            r0 = r7
            r6 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L68
        Lb0:
            r7 = move-exception
        Lb1:
            r0 = r5
            java.util.ArrayList<com.bilibili.ship.theseus.united.page.backpress.BackActionRepository$a> r0 = r0.f99046a
            r1 = r6
            boolean r0 = r0.remove(r1)
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.backpress.BackActionRepository.b(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(boolean z6) {
        Iterator it = CollectionsKt.reversed(this.f99047b).iterator();
        while (it.hasNext()) {
            if (((Boolean) ((Function1) it.next()).invoke(Boolean.valueOf(z6))).booleanValue()) {
                return;
            }
        }
        Iterator it2 = CollectionsKt.reversed(this.f99046a).iterator();
        while (it2.hasNext()) {
            if (((Boolean) ((a) it2.next()).f99049a.invoke(Boolean.valueOf(z6))).booleanValue()) {
                return;
            }
        }
        Function0<Unit> function0 = this.f99048c;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
