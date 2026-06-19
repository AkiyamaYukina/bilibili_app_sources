package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import com.bapis.bilibili.app.viewunite.common.ViewMaterial;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/o.class */
public final class o {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/o$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f97370a;

        static {
            int[] iArr = new int[com.bapis.bilibili.app.viewunite.common.DescType.values().length];
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.DescType.DescTypeAt.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.DescType.DescTypeText.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f97370a = iArr;
        }
    }

    @NotNull
    public static final B a(@NotNull ViewMaterial viewMaterial) {
        return new B(viewMaterial.getOid(), viewMaterial.getMid(), viewMaterial.getTitle(), viewMaterial.getAuthor(), viewMaterial.getJumpUrl());
    }
}
