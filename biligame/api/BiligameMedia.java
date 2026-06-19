package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMedia.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameMedia implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private BiligameMediaPicture picture;

    @NotNull
    private BiligameMediaType type;

    @Nullable
    private GameVideoInfo video;

    public BiligameMedia(@NotNull BiligameMediaPicture biligameMediaPicture) {
        this.type = BiligameMediaType.Picture;
        this.picture = biligameMediaPicture;
    }

    public BiligameMedia(@NotNull GameVideoInfo gameVideoInfo) {
        this.type = BiligameMediaType.Picture;
        this.type = BiligameMediaType.Video;
        this.video = gameVideoInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof com.bilibili.biligame.api.BiligameMedia
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L10
            r0 = r6
            r5 = r0
            goto Lbb
        L10:
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L1a
        L15:
            r0 = 1
            r5 = r0
            goto Lbb
        L1a:
            r0 = r3
            com.bilibili.biligame.api.BiligameMediaType r0 = r0.type
            r7 = r0
            r0 = r4
            com.bilibili.biligame.api.BiligameMedia r0 = (com.bilibili.biligame.api.BiligameMedia) r0
            r9 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = r9
            com.bilibili.biligame.api.BiligameMediaType r1 = r1.type
            if (r0 != r1) goto Lbb
            com.bilibili.biligame.api.BiligameMediaType r0 = com.bilibili.biligame.api.BiligameMediaType.Video
            r4 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            r1 = r4
            if (r0 != r1) goto L77
            r0 = r3
            com.bilibili.biligame.api.GameVideoInfo r0 = r0.video
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L50
            r0 = r4
            java.lang.String r0 = r0.getAvId()
            r4 = r0
            goto L52
        L50:
            r0 = 0
            r4 = r0
        L52:
            r0 = r9
            com.bilibili.biligame.api.GameVideoInfo r0 = r0.video
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L68
            r0 = r7
            java.lang.String r0 = r0.getAvId()
            r7 = r0
            goto L6b
        L68:
            r0 = 0
            r7 = r0
        L6b:
            r0 = r4
            r1 = r7
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L77
            goto L15
        L77:
            r0 = r6
            r5 = r0
            r0 = r3
            com.bilibili.biligame.api.BiligameMediaType r0 = r0.type
            com.bilibili.biligame.api.BiligameMediaType r1 = com.bilibili.biligame.api.BiligameMediaType.Picture
            if (r0 != r1) goto Lbb
            r0 = r3
            com.bilibili.biligame.api.BiligameMediaPicture r0 = r0.picture
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L94
            r0 = r4
            java.lang.String r0 = r0.getFilePath()
            r4 = r0
            goto L96
        L94:
            r0 = 0
            r4 = r0
        L96:
            r0 = r9
            com.bilibili.biligame.api.BiligameMediaPicture r0 = r0.picture
            r9 = r0
            r0 = r8
            r7 = r0
            r0 = r9
            if (r0 == 0) goto Lad
            r0 = r9
            java.lang.String r0 = r0.getFilePath()
            r7 = r0
        Lad:
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = r7
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto Lbb
            goto L15
        Lbb:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.BiligameMedia.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final BiligameMediaPicture getPicture() {
        return this.picture;
    }

    @NotNull
    public final BiligameMediaType getType() {
        return this.type;
    }

    @Nullable
    public final GameVideoInfo getVideo() {
        return this.video;
    }

    public final void setPicture(@Nullable BiligameMediaPicture biligameMediaPicture) {
        this.picture = biligameMediaPicture;
    }

    public final void setType(@NotNull BiligameMediaType biligameMediaType) {
        this.type = biligameMediaType;
    }

    public final void setVideo(@Nullable GameVideoInfo gameVideoInfo) {
        this.video = gameVideoInfo;
    }
}
