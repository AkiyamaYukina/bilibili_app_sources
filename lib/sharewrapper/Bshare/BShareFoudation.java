package com.bilibili.lib.sharewrapper.Bshare;

import android.app.Application;
import android.os.Bundle;
import com.bilibili.lib.sharewrapper.Bshare.GShare;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/BShareFoudation.class */
public final class BShareFoudation {

    @NotNull
    public static final BShareFoudation INSTANCE = new BShareFoudation();
    public static GShare.Foundation fDelegate;
    public static Application fapp;
    public static Bundle metaData;

    @NotNull
    public final GShare.Foundation getFDelegate() {
        GShare.Foundation foundation = fDelegate;
        if (foundation != null) {
            return foundation;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fDelegate");
        return null;
    }

    @NotNull
    public final Application getFapp() {
        Application application = fapp;
        if (application != null) {
            return application;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fapp");
        return null;
    }

    @NotNull
    public final Bundle getMetaData() {
        Bundle bundle = metaData;
        if (bundle != null) {
            return bundle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("metaData");
        return null;
    }

    public final void setFDelegate(@NotNull GShare.Foundation foundation) {
        fDelegate = foundation;
    }

    public final void setFapp(@NotNull Application application) {
        fapp = application;
    }

    public final void setFoundationDelegate(@NotNull GShare.Foundation foundation) {
        setFDelegate(foundation);
        setFapp(getFDelegate().getFapp());
        setMetaData(getFDelegate().getMetadata());
    }

    public final void setMetaData(@NotNull Bundle bundle) {
        metaData = bundle;
    }
}
