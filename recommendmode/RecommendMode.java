package com.bilibili.recommendmode;

import Cs0.a;
import Cs0.b;
import Cs0.d;
import Cs0.f;
import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/recommendmode/RecommendMode.class */
public final class RecommendMode {

    @NotNull
    public static final RecommendMode INSTANCE = new RecommendMode();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f85868a = LazyKt.lazy(new a(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f85869b = LazyKt.lazy(new b(0));

    @JvmStatic
    public static final void addObserver(@NotNull d dVar) {
        INSTANCE.getObservers$recommendmode_release().add(dVar);
    }

    @JvmStatic
    public static final void addObserver(@NotNull f fVar) {
        INSTANCE.getOperatorObservers$recommendmode_release().add(fVar);
    }

    public static final boolean isRecommendModeEnable() {
        Application application = BiliContext.application();
        boolean z6 = true;
        if (application != null) {
            z6 = BiliGlobalPreferenceHelper.getBLKVSharedPreference(application).getBoolean("key:is:recommend:mode:enable", true);
        }
        return z6;
    }

    @JvmStatic
    public static /* synthetic */ void isRecommendModeEnable$annotations() {
    }

    @JvmStatic
    public static final void removeObserver(@NotNull d dVar) {
        INSTANCE.getObservers$recommendmode_release().remove(dVar);
    }

    @JvmStatic
    public static final void removeObserver(@NotNull f fVar) {
        INSTANCE.getOperatorObservers$recommendmode_release().remove(fVar);
    }

    @NotNull
    public final CopyOnWriteArraySet<d> getObservers$recommendmode_release() {
        return (CopyOnWriteArraySet) f85868a.getValue();
    }

    @NotNull
    public final CopyOnWriteArraySet<f> getOperatorObservers$recommendmode_release() {
        return (CopyOnWriteArraySet) f85869b.getValue();
    }
}
