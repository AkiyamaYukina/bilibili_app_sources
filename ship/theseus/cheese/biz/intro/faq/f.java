package com.bilibili.ship.theseus.cheese.biz.intro.faq;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f89435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89436b;

    @Inject
    public f(@NotNull Context context, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f89435a = context;
        this.f89436b = introContentSizeRepository;
    }
}
