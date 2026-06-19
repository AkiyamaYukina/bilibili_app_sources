package com.bilibili.ship.theseus.ugc.play;

import com.bapis.bilibili.app.playerunite.ugcanymodel.Clip;
import com.bapis.bilibili.app.playerunite.ugcanymodel.ClipInfo;
import com.bapis.bilibili.app.playerunite.ugcanymodel.ClipType;
import com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tb0.h;
import tb0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f98099a = j.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f98100b = j.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final h f98101c = j.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final h f98102d = j.a(Boolean.FALSE);

    @Nullable
    public static final ClipInfo a(@NotNull UGCAnyModel uGCAnyModel) {
        Clip clip = uGCAnyModel.getClip();
        ClipInfo clipInfo = null;
        if (clip != null) {
            ClipInfo clipInfo2 = clip.getClipInfo();
            clipInfo = null;
            if (clipInfo2 != null) {
                clipInfo = null;
                if (clipInfo2.getClipType() == ClipType.CLIP_TYPE_HE) {
                    clipInfo = clipInfo2;
                }
            }
        }
        return clipInfo;
    }
}
