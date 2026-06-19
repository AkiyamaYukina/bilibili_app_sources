package com.bilibili.ship.theseus.united.di;

import com.bilibili.lib.projection.commonburid.CastContentType;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/v.class */
public final class v {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/v$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f98782a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f98782a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final CastContentType a(@Nullable BusinessType businessType) throws NoWhenBranchMatchedException {
        CastContentType castContentType;
        int i7 = businessType == null ? -1 : a.f98782a[businessType.ordinal()];
        if (i7 == -1 || i7 == 1) {
            castContentType = CastContentType.CastContentTypeUGC;
        } else if (i7 == 2) {
            castContentType = CastContentType.CastContentTypeEDU;
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            castContentType = CastContentType.CastContentTypePGC;
        }
        return castContentType;
    }
}
