package com.bilibili.ship.theseus.united.player.mediaplay.network;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/m.class */
@StabilityInferred(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f104582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IToastService f104583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f104584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f104585d;

    @Inject
    public m(@NotNull Context context, @NotNull IToastService iToastService, @NotNull a aVar) {
        this.f104582a = context;
        this.f104583b = iToastService;
        this.f104584c = aVar;
        this.f104585d = BiliGlobalPreferenceHelper.getBLKVSharedPreference(context);
    }

    public final long a() {
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(this.f104585d.getLong("pref_key_free_data_guide_toast_last_show_time", 0L), DurationUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.m.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.m.c(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.m.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object e(@NotNull SuspendLambda suspendLambda) {
        int freeDataResultCode = PlayerFreeDataHelper.INSTANCE.getFreeDataResultCode();
        defpackage.a.b("[theseus-united-NetworkShowToastService-showToastOnFreeDataFailed] ", C3259x.a(freeDataResultCode, "show toast on free data failed, error code: "), "NetworkShowToastService-showToastOnFreeDataFailed");
        Object objD = d(freeDataResultCode == 2036 ? this.f104582a.getString(2131846758) : this.f104582a.getString(2131847523), suspendLambda);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0174, code lost:
    
        if (r9.f104585d.getInt("pref_key_free_data_guide_toast_show_times", 0) < r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ac  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.m.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
