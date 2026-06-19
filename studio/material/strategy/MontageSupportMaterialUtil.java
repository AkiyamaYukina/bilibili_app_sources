package com.bilibili.studio.material.strategy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/strategy/MontageSupportMaterialUtil.class */
public final class MontageSupportMaterialUtil {

    @NotNull
    public static final MontageSupportMaterialUtil INSTANCE = new MontageSupportMaterialUtil();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static List<String> f108564a;

    @JvmStatic
    public static final boolean montageSupportMaterial(int i7) {
        String name;
        if (i7 == 0) {
            name = MaterialType.CaptionTemplate.INSTANCE.getName();
        } else if (i7 == 1) {
            name = MaterialType.Font.INSTANCE.getName();
        } else if (i7 == 2) {
            name = MaterialType.Filter.INSTANCE.getName();
        } else if (i7 == 3) {
            name = MaterialType.Bgm.INSTANCE.getName();
        } else if (i7 == 7) {
            name = MaterialType.Sticker.INSTANCE.getName();
        } else if (i7 == 8) {
            name = MaterialType.Transition.INSTANCE.getName();
        } else if (i7 == 13) {
            name = MaterialType.VideoAnimation.INSTANCE.getName();
        } else if (i7 == 36) {
            name = MaterialType.CaptionAnimation.INSTANCE.getName();
        } else if (i7 == 64) {
            name = MaterialType.HumanEffect.INSTANCE.getName();
        } else if (i7 != 80) {
            switch (i7) {
                case 17:
                    name = MaterialType.Effect.INSTANCE.getName();
                    break;
                case 18:
                    name = MaterialType.Background.INSTANCE.getName();
                    break;
                case 19:
                    name = MaterialType.Video.INSTANCE.getName();
                    break;
                case 20:
                    name = MaterialType.Audio.INSTANCE.getName();
                    break;
                case 21:
                    name = MaterialType.Flower.INSTANCE.getName();
                    break;
                default:
                    name = MaterialType.UnUsed.INSTANCE.getName();
                    break;
            }
        } else {
            name = MaterialType.a.f108495c.getName();
        }
        return INSTANCE.getMontageSupportMaterialTypes().contains(name);
    }

    @NotNull
    public final List<String> getMontageSupportMaterialTypes() {
        JSONArray jSONArray;
        if (f108564a == null) {
            try {
                jSONArray = JSON.parseArray((String) ConfigManager.Companion.config().get("material_download.support_montage_material_type", "[\"effect\",\"filter\",\"transition\",\"sticker\",\"fancy_word\",\"caption\",\"video_animation\",\"caption_animation\"]"));
            } catch (Exception e7) {
                jSONArray = new JSONArray();
                CollectionsKt.e(jSONArray, new String[]{"effect", "filter", "transition", "sticker", "fancy_word", UtilsKt.CaptionPath, "video_animation", "caption_animation"});
            }
            f108564a = CollectionsKt.toList(jSONArray);
        }
        return f108564a;
    }
}
