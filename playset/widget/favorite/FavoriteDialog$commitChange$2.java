package com.bilibili.playset.widget.favorite;

import com.google.gson.JsonObject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$commitChange$2.class */
final class FavoriteDialog$commitChange$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<String> $addIds;
    final Ref.ObjectRef<String> $delIds;
    final JsonObject $jsonExtra;
    final String $resources;
    int label;
    final FavoriteDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteDialog$commitChange$2(FavoriteDialog favoriteDialog, String str, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, JsonObject jsonObject, Continuation<? super FavoriteDialog$commitChange$2> continuation) {
        super(2, continuation);
        this.this$0 = favoriteDialog;
        this.$resources = str;
        this.$addIds = objectRef;
        this.$delIds = objectRef2;
        this.$jsonExtra = jsonObject;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoriteDialog$commitChange$2(this.this$0, this.$resources, this.$addIds, this.$delIds, this.$jsonExtra, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.widget.favorite.FavoriteDialog$commitChange$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
