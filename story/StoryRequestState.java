package com.bilibili.story;

import K7.N;
import Uv0.b;
import androidx.compose.animation.core.I;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/story/StoryRequestState.class */
public interface StoryRequestState {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/story/StoryRequestState$Finish.class */
    public static final class Finish implements StoryRequestState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f105093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f105094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<b> f105095c;

        public Finish(boolean z6, int i7, @NotNull List<b> list) {
            this.f105093a = z6;
            this.f105094b = i7;
            this.f105095c = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Finish copy$default(Finish finish, boolean z6, int i7, List list, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z6 = finish.f105093a;
            }
            if ((i8 & 2) != 0) {
                i7 = finish.f105094b;
            }
            if ((i8 & 4) != 0) {
                list = finish.f105095c;
            }
            return finish.copy(z6, i7, list);
        }

        public final boolean component1() {
            return this.f105093a;
        }

        public final int component2() {
            return this.f105094b;
        }

        @NotNull
        public final List<b> component3() {
            return this.f105095c;
        }

        @NotNull
        public final Finish copy(boolean z6, int i7, @NotNull List<b> list) {
            return new Finish(z6, i7, list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finish)) {
                return false;
            }
            Finish finish = (Finish) obj;
            return this.f105093a == finish.f105093a && this.f105094b == finish.f105094b && Intrinsics.areEqual(this.f105095c, finish.f105095c);
        }

        public final int getCode() {
            return this.f105094b;
        }

        @NotNull
        public final List<b> getStoryUniqueIdParams() {
            return this.f105095c;
        }

        public final boolean getSuccess() {
            return this.f105093a;
        }

        public int hashCode() {
            return this.f105095c.hashCode() + I.a(this.f105094b, Boolean.hashCode(this.f105093a) * 31, 31);
        }

        @NotNull
        public String toString() {
            List<b> list = this.f105095c;
            StringBuilder sb = new StringBuilder("Finish(success=");
            sb.append(this.f105093a);
            sb.append(", code=");
            return N.a(sb, this.f105094b, ", storyUniqueIdParams=", list, ")");
        }
    }
}
