package com.bilibili.ship.theseus.united.di;

import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/G.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class G implements Factory<TheseusCommentService.c> {
    public static TheseusCommentService.c a(E e7) {
        e7.getClass();
        TheseusCommentService.c cVar = (TheseusCommentService.c) com.bilibili.ship.theseus.united.page.comment.g.f99298a.a(e7.f98768d);
        TheseusCommentService.c cVar2 = cVar;
        if (cVar == null) {
            cVar2 = new TheseusCommentService.c(null, null, null, null);
        }
        return (TheseusCommentService.c) Preconditions.checkNotNullFromProvides(cVar2);
    }
}
