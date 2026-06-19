package com.bilibili.opd.app.bizcommon.imageselector.media;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.ResizeOption;
import com.bilibili.mediautils.FileUtils;
import com.bilibili.opd.app.bizcommon.imageselector.widget.MallMediaImageView;
import com.facebook.imagepipeline.common.ResizeOptions;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/MallMediaHelper.class */
@StabilityInferred(parameters = 0)
public final class MallMediaHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f73740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ResizeOptions f73741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ResizeOptions f73742c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/MallMediaHelper$ScreenType.class */
    public static final class ScreenType {
        private static final EnumEntries $ENTRIES;
        private static final ScreenType[] $VALUES;
        private final int value;
        public static final ScreenType SMALL = new ScreenType("SMALL", 0, 180);
        public static final ScreenType NORMAL = new ScreenType("NORMAL", 1, 320);
        public static final ScreenType LARGE = new ScreenType("LARGE", 2, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);

        private static final /* synthetic */ ScreenType[] $values() {
            return new ScreenType[]{SMALL, NORMAL, LARGE};
        }

        static {
            ScreenType[] screenTypeArr$values = $values();
            $VALUES = screenTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(screenTypeArr$values);
        }

        private ScreenType(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<ScreenType> getEntries() {
            return $ENTRIES;
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    static {
        Lazy lazy = LazyKt.lazy((Function0) new Object());
        f73740a = lazy;
        f73741b = new ResizeOptions(((ScreenType) lazy.getValue()).getValue(), ((ScreenType) lazy.getValue()).getValue(), 0.0f, 0.0f, 12, (DefaultConstructorMarker) null);
        ScreenType screenType = ScreenType.SMALL;
        f73742c = new ResizeOptions(screenType.getValue(), screenType.getValue(), 0.0f, 0.0f, 12, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NotNull String str, @NotNull MallMediaImageView mallMediaImageView) {
        if (TextUtils.isEmpty(str)) {
            mallMediaImageView.setBackgroundResource(2131231978);
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            ResizeOptions resizeOptions = file.length() < 5242880 ? f73741b : f73742c;
            ImageRequestBuilder.enableAnimate$default(BiliImageLoader.INSTANCE.with(mallMediaImageView.getContext()).url(Pf.a.a(FileUtils.SCHEME_FILE, file.getPath()).toString()).resizeOption(new ResizeOption(resizeOptions.width, resizeOptions.height)), false, (Boolean) null, 2, (Object) null).into(mallMediaImageView);
        }
    }
}
