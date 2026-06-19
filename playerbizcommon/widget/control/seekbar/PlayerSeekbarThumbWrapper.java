package com.bilibili.playerbizcommon.widget.control.seekbar;

import android.content.Context;
import androidx.compose.foundation.text.C0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarThumbWrapper.class */
public final class PlayerSeekbarThumbWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f80620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<b> f80621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f80622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public e f80623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Job f80624e;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerSeekbarThumbWrapper(@NotNull f fVar) {
        this.f80620a = fVar;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f80621b = arrayList;
        arrayList.add(new PlayerSeekbarSpriteThumb());
        arrayList.add(new Object());
        arrayList.add(new PlayerSeekbarPngThumb());
        arrayList.add(new Object());
    }

    public final void a(@NotNull e eVar) {
        FragmentActivity fragmentActivityFindFragmentActivityOrNull;
        e eVar2 = this.f80623d;
        long j7 = eVar.f80634a;
        if (eVar2 != null && j7 == eVar2.f80634a && Intrinsics.areEqual(eVar.f80635b, eVar2.f80635b)) {
            e eVar3 = this.f80623d;
            if (Intrinsics.areEqual(eVar.f80636c, eVar3 != null ? eVar3.f80636c : null)) {
                e eVar4 = this.f80623d;
                if (Intrinsics.areEqual(eVar.f80639f, eVar4 != null ? eVar4.f80639f : null)) {
                    e eVar5 = this.f80623d;
                    if (Intrinsics.areEqual(eVar.f80638e, eVar5 != null ? eVar5.f80638e : null)) {
                        e eVar6 = this.f80623d;
                        if (Intrinsics.areEqual(eVar.f80637d, eVar6 != null ? eVar6.f80637d : null)) {
                            e eVar7 = this.f80623d;
                            if (Intrinsics.areEqual(eVar.f80640g, eVar7 != null ? eVar7.f80640g : null)) {
                                e eVar8 = this.f80623d;
                                if (Intrinsics.areEqual(eVar.h, eVar8 != null ? eVar8.h : null)) {
                                    e eVar9 = this.f80623d;
                                    if (Intrinsics.areEqual(eVar.f80641i, eVar9 != null ? eVar9.f80641i : null)) {
                                        e eVar10 = this.f80623d;
                                        if (Intrinsics.areEqual(eVar.f80642j, eVar10 != null ? eVar10.f80642j : null)) {
                                            C0.c(j7, "load thumb, same ", "SeekbarThumb-wrapper");
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f80623d = eVar;
        C0.c(j7, "load thumb, ", "SeekbarThumb-wrapper");
        Context contextX = this.f80620a.x();
        if (contextX == null || (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(contextX)) == null) {
            return;
        }
        Job job = this.f80624e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f80624e = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull), (CoroutineContext) null, (CoroutineStart) null, new PlayerSeekbarThumbWrapper$loadThumb$1(this, eVar, null), 3, (Object) null);
    }
}
