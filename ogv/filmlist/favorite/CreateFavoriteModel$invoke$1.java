package com.bilibili.ogv.filmlist.favorite;

import Da0.C;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bilibili.lib.brouter.uri.Uri;
import kntr.base.account.AccountState;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.router.RouterKt;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/favorite/CreateFavoriteModel$invoke$1.class */
public final class CreateFavoriteModel$invoke$1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableState f67697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<?> f67698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f67699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67700d;

    public CreateFavoriteModel$invoke$1(boolean z6, KomponentScope<?> komponentScope, a aVar, String str) {
        this.f67698b = komponentScope;
        this.f67699c = aVar;
        this.f67700d = str;
        this.f67697a = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z6), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ((Boolean) this.f67697a.getValue()).booleanValue();
    }

    public final void b() {
        KomponentScope<?> komponentScope = this.f67698b;
        Toaster toaster = (Toaster) komponentScope.getContext().getCompositionLocal(ToasterKt.getLocalToaster());
        if (C.a() instanceof AccountState.Idle) {
            ((Router) komponentScope.getContext().getCompositionLocal(RouterKt.getLocalRouter())).launch(Uri.Companion.parse("bilibili://login"));
            return;
        }
        boolean zA = a();
        a aVar = this.f67699c;
        if (zA) {
            KomponentHostScope.launch$default(this.f67698b, (CoroutineContext) null, (CoroutineStart) null, new CreateFavoriteModel$invoke$1$toggleFavoriteState$1(aVar, this.f67700d, this, toaster, null), 3, (Object) null);
        } else {
            KomponentHostScope.launch$default(this.f67698b, (CoroutineContext) null, (CoroutineStart) null, new CreateFavoriteModel$invoke$1$toggleFavoriteState$2(aVar, this.f67700d, this, toaster, null), 3, (Object) null);
        }
    }
}
