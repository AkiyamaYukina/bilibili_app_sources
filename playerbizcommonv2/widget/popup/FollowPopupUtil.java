package com.bilibili.playerbizcommonv2.widget.popup;

import Gj.c;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.theme.R$color;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil.class */
@StabilityInferred(parameters = 0)
public final class FollowPopupUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f82614a = LazyKt.lazy(new c(8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Job f82615b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$Scene.class */
    public static final class Scene {
        private static final EnumEntries $ENTRIES;
        private static final Scene[] $VALUES;
        public static final Scene Detail = new Scene("Detail", 0);
        public static final Scene Story = new Scene("Story", 1);

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$Scene$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f82616a;

            static {
                int[] iArr = new int[Scene.values().length];
                try {
                    iArr[Scene.Detail.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[Scene.Story.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f82616a = iArr;
            }
        }

        private static final /* synthetic */ Scene[] $values() {
            return new Scene[]{Detail, Story};
        }

        static {
            Scene[] sceneArr$values = $values();
            $VALUES = sceneArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sceneArr$values);
        }

        private Scene(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Scene> getEntries() {
            return $ENTRIES;
        }

        public static Scene valueOf(String str) {
            return (Scene) Enum.valueOf(Scene.class, str);
        }

        public static Scene[] values() {
            return (Scene[]) $VALUES.clone();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final int bgColor() throws NoWhenBranchMatchedException {
            int i7;
            int i8 = a.f82616a[ordinal()];
            if (i8 == 1) {
                i7 = R$color.Bg1_float;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 = R$color.Ga9_u;
            }
            return i7;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final int contentTextColor() throws NoWhenBranchMatchedException {
            int i7;
            int i8 = a.f82616a[ordinal()];
            if (i8 == 1) {
                i7 = R$color.Text1;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 = R$color.Wh0_u;
            }
            return i7;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final int iconColor() throws NoWhenBranchMatchedException {
            int i7;
            int i8 = a.f82616a[ordinal()];
            if (i8 == 1) {
                i7 = R$color.Brand_pink;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 = R$color.Wh0_u;
            }
            return i7;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final int yOffset() throws NoWhenBranchMatchedException {
            int px;
            int i7 = a.f82616a[ordinal()];
            if (i7 == 1) {
                px = 0;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                px = NewPlayerUtilsKt.toPx(58);
            }
            return px;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f82617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f82618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f82619c = 80;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f82620d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f82621e;

        public a(ConstraintLayout constraintLayout, View view, int i7) {
            this.f82617a = constraintLayout;
            this.f82618b = view;
            this.f82621e = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f82617a, aVar.f82617a) && Intrinsics.areEqual(this.f82618b, aVar.f82618b) && this.f82619c == aVar.f82619c && this.f82620d == aVar.f82620d && this.f82621e == aVar.f82621e;
        }

        public final int hashCode() {
            int iHashCode = this.f82617a.hashCode();
            return Integer.hashCode(this.f82621e) + I.a(this.f82620d, I.a(this.f82619c, (this.f82618b.hashCode() + (iHashCode * 31)) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            View view = this.f82618b;
            StringBuilder sb = new StringBuilder("PopupParams(contentView=");
            sb.append(this.f82617a);
            sb.append(", parentView=");
            sb.append(view);
            sb.append(", gravity=");
            sb.append(this.f82619c);
            sb.append(", xOffset=");
            sb.append(this.f82620d);
            sb.append(", yOffset=");
            return C4277b.a(this.f82621e, ")", sb);
        }
    }

    public static tv.danmaku.bili.widget.preference.a a() {
        return (tv.danmaku.bili.widget.preference.a) f82614a.getValue();
    }

    public static void b(ComponentActivity componentActivity, Scene scene) {
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(4, DurationUnit.SECONDS);
        Job job = f82615b;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        f82615b = null;
        if (componentActivity.isFinishing() || componentActivity.isDestroyed()) {
            return;
        }
        f82615b = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), (CoroutineContext) null, (CoroutineStart) null, new FollowPopupUtil$showWithScene$1(componentActivity, scene, duration, null), 3, (Object) null);
    }
}
