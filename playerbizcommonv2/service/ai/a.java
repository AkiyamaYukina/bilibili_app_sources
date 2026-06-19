package com.bilibili.playerbizcommonv2.service.ai;

import android.content.Context;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import com.bilibili.playerbizcommonv2.widget.subtitle.K0;
import com.bilibili.playerbizcommonv2.widget.subtitle.L0;
import com.bilibili.ship.theseus.ugc.intro.ai.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IPlayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/a.class */
public interface a extends IPlayerService {
    @Nullable
    Object H(@NotNull Context context, @NotNull ContinuationImpl continuationImpl);

    void I(@Nullable f fVar);

    void N();

    @NotNull
    Flow<Unit> S();

    @NotNull
    MutableStateFlow U();

    @Nullable
    default L0 Y() {
        return null;
    }

    @NotNull
    MutableStateFlow b0();

    @Nullable
    Languages e0();

    @Nullable
    default K0 g0() {
        return null;
    }

    boolean getSupport();

    void i0(@Nullable Function2<? super LanguageItem, ? super Continuation<? super Unit>, ? extends Object> function2);

    @Nullable
    LanguageItem n0();

    void o0(@Nullable LanguageItem languageItem);

    void showFeedback();
}
