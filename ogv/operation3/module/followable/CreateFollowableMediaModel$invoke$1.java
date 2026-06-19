package com.bilibili.ogv.operation3.module.followable;

import Da0.C;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bilibili.lib.brouter.uri.Uri;
import dl0.C6822c;
import kntr.base.account.AccountState;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.router.RouterKt;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowableMediaModel$invoke$1.class */
public final class CreateFollowableMediaModel$invoke$1 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f71322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f71323b;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.ogv.operation3.module.followable.e] */
    public CreateFollowableMediaModel$invoke$1(final j jVar, final KomponentScope<?> komponentScope, final f fVar) {
        this.f71322a = new Function0(komponentScope, fVar, jVar, this) { // from class: com.bilibili.ogv.operation3.module.followable.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KomponentScope f71339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f f71340b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final j f71341c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final CreateFollowableMediaModel$invoke$1 f71342d;

            {
                this.f71339a = komponentScope;
                this.f71340b = fVar;
                this.f71341c = jVar;
                this.f71342d = this;
            }

            public final Object invoke() {
                boolean z6 = C.a() instanceof AccountState.Idle;
                KomponentScope komponentScope2 = this.f71339a;
                if (z6) {
                    ((Router) komponentScope2.getContext().getCompositionLocal(RouterKt.getLocalRouter())).launch(Uri.Companion.parse("bilibili://login"));
                } else {
                    KomponentHostScope.launch$default(komponentScope2, (CoroutineContext) null, (CoroutineStart) null, new CreateFollowableMediaModel$invoke$1$toggle$1$1(this.f71340b, this.f71341c, this.f71342d, (Toaster) komponentScope2.getContext().getCompositionLocal(ToasterKt.getLocalToaster()), null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        };
        this.f71323b = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((C6822c) jVar.getStatus()).f116495a), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.ogv.operation3.module.followable.k
    public final boolean a() {
        return ((Boolean) this.f71323b.getValue()).booleanValue();
    }

    @Override // com.bilibili.ogv.operation3.module.followable.k
    public final Function0<Unit> b() {
        return this.f71322a;
    }
}
