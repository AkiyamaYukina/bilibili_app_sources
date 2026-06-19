package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/QualityDolbyInfoComponent.class */
@StabilityInferred(parameters = 0)
public final class QualityDolbyInfoComponent extends com.bilibili.app.gemini.ui.m<kq0.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f82710d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<com.bilibili.player.tangram.basic.c, Unit> f82711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<ScreenModeType> f82713c;

    public QualityDolbyInfoComponent(@NotNull Function0 function0, @NotNull Function0 function02, @NotNull Function1 function1) {
        this.f82711a = function1;
        this.f82712b = function0;
        this.f82713c = function02;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kq0.b.inflate(layoutInflater, viewGroup, false);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(@NotNull kq0.b bVar, @NotNull Continuation<? super Unit> continuation) {
        bVar.f122950d.setOnClickListener(new Ua.i(this, 2));
        bVar.f122948b.setOnClickListener(new Ua.j(this, 3));
        Object objD = d(bVar.f122949c, continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.bilibili.lib.image2.view.BiliImageView r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.QualityDolbyInfoComponent.d(com.bilibili.lib.image2.view.BiliImageView, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
