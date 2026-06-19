package com.bilibili.studio.material;

import com.bilibili.studio.material.util.UtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType.class */
public abstract class MaterialType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f108493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108494b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Audio.class */
    public static final class Audio extends MaterialType {

        @NotNull
        public static final Audio INSTANCE = new Audio();

        public Audio() {
            super("audio", 20, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Background.class */
    public static final class Background extends MaterialType {

        @NotNull
        public static final Background INSTANCE = new Background();

        public Background() {
            super("background", 18, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Bgm.class */
    public static final class Bgm extends MaterialType {

        @NotNull
        public static final Bgm INSTANCE = new Bgm();

        public Bgm() {
            super("bgm", 3, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$CaptionAnimation.class */
    public static final class CaptionAnimation extends MaterialType {

        @NotNull
        public static final CaptionAnimation INSTANCE = new CaptionAnimation();

        public CaptionAnimation() {
            super("caption_animation", 36, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$CaptionTemplate.class */
    public static final class CaptionTemplate extends MaterialType {

        @NotNull
        public static final CaptionTemplate INSTANCE = new CaptionTemplate();

        public CaptionTemplate() {
            super(UtilsKt.CaptionPath, 0, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Effect.class */
    public static final class Effect extends MaterialType {

        @NotNull
        public static final Effect INSTANCE = new Effect();

        public Effect() {
            super("effect", 17, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$ExtraType.class */
    public static class ExtraType extends MaterialType {
        public ExtraType(@NotNull String str, int i7) {
            super(str, i7, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Filter.class */
    public static final class Filter extends MaterialType {

        @NotNull
        public static final Filter INSTANCE = new Filter();

        public Filter() {
            super("filter", 2, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Flower.class */
    public static final class Flower extends MaterialType {

        @NotNull
        public static final Flower INSTANCE = new Flower();

        public Flower() {
            super("fancy_word", 21, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Font.class */
    public static final class Font extends MaterialType {

        @NotNull
        public static final Font INSTANCE = new Font();

        public Font() {
            super("font", 1, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$HumanEffect.class */
    public static final class HumanEffect extends MaterialType {

        @NotNull
        public static final HumanEffect INSTANCE = new HumanEffect();

        public HumanEffect() {
            super("portrait_effect", 64, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Rhythms.class */
    public static final class Rhythms extends MaterialType {

        @NotNull
        public static final Rhythms INSTANCE = new Rhythms();

        public Rhythms() {
            super("Rhythms", 14, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Sticker.class */
    public static final class Sticker extends MaterialType {

        @NotNull
        public static final Sticker INSTANCE = new Sticker();

        public Sticker() {
            super("sticker", 7, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Transition.class */
    public static final class Transition extends MaterialType {

        @NotNull
        public static final Transition INSTANCE = new Transition();

        public Transition() {
            super("transition", 8, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$UnUsed.class */
    public static final class UnUsed extends MaterialType {

        @NotNull
        public static final UnUsed INSTANCE = new UnUsed();

        public UnUsed() {
            super("Unused", 0, 2, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$Video.class */
    public static final class Video extends MaterialType {

        @NotNull
        public static final Video INSTANCE = new Video();

        public Video() {
            super("video", 19, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$VideoAnimation.class */
    public static final class VideoAnimation extends MaterialType {

        @NotNull
        public static final VideoAnimation INSTANCE = new VideoAnimation();

        public VideoAnimation() {
            super("video_animation", 13, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialType$a.class */
    public static final class a extends MaterialType {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f108495c = new MaterialType("customize_sticker", 80, null);
    }

    public /* synthetic */ MaterialType(String str, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i8 & 2) != 0 ? -1 : i7, null);
    }

    public MaterialType(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this.f108493a = str;
        this.f108494b = i7;
    }

    @NotNull
    public final String getName() {
        return this.f108493a;
    }

    public final int getValue() {
        return this.f108494b;
    }

    @NotNull
    public String toString() {
        return this.f108493a;
    }
}
