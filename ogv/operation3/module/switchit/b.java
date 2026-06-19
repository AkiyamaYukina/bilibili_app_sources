package com.bilibili.ogv.operation3.module.switchit;

import US0.j;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import javax.inject.Inject;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/switchit/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f71430a;

    @Inject
    public b(@NotNull f fVar) {
        this.f71430a = fVar;
    }

    @NotNull
    public final CreateSwitchableModel$invoke$1 a(@NotNull Object obj, @NotNull List list, @NotNull KomponentScope komponentScope) {
        g gVar = obj instanceof g ? (g) obj : null;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int size = gVar != null ? gVar.getSize() : list.size();
        objectRef.element = (list.isEmpty() ? SequencesKt.emptySequence() : SequencesKt.f(SequencesKt.flattenSequenceOfIterable(SequencesKt.generateSequence(new j(list, 4))), size, size)).iterator();
        return new CreateSwitchableModel$invoke$1(komponentScope, list, objectRef, gVar, this, (Toaster) komponentScope.getContext().getCompositionLocal(ToasterKt.getLocalToaster()));
    }
}
