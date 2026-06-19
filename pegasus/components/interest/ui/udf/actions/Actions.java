package com.bilibili.pegasus.components.interest.ui.udf.actions;

import Fo0.j;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseAgeUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseGenderUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseItemUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseSubItemUi;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kp0.C7782e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions.class */
public interface Actions {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$ReportActions.class */
    public interface ReportActions extends Actions {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$ReportActions$Type.class */
        public static final class Type {
            private static final EnumEntries $ENTRIES;
            private static final Type[] $VALUES;
            public static final Type Click = new Type("Click", 0);
            public static final Type Show = new Type("Show", 1);
            public static final Type Fold = new Type("Fold", 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{Click, Show, Fold};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
            }

            private Type(String str, int i7) {
            }

            @NotNull
            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$ReportActions$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements ReportActions {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f76405a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Fo0.c f76406b;

            public a(@NotNull String str, @NotNull Fo0.c cVar) {
                this.f76405a = str;
                this.f76406b = cVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f76405a, aVar.f76405a) && Intrinsics.areEqual(this.f76406b, aVar.f76406b);
            }

            public final int hashCode() {
                return this.f76406b.hashCode() + (this.f76405a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "FirstPageReport(eventId=" + this.f76405a + ", model=" + this.f76406b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$ReportActions$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements ReportActions {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final j f76407a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Type f76408b;

            public b(@NotNull j jVar, @NotNull Type type) {
                this.f76407a = jVar;
                this.f76408b = type;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f76407a, bVar.f76407a) && this.f76408b == bVar.f76408b;
            }

            public final int hashCode() {
                return this.f76408b.hashCode() + (this.f76407a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "ItemReport(model=" + this.f76407a + ", type=" + this.f76408b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$ReportActions$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements ReportActions {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.pegasus.components.interest.ui.udf.actions.a f76409a;

            public c(@NotNull com.bilibili.pegasus.components.interest.ui.udf.actions.a aVar) {
                this.f76409a = aVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f76409a, ((c) obj).f76409a);
            }

            public final int hashCode() {
                return this.f76409a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "NormalReport(normalReportType=" + this.f76409a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$ReportActions$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d implements ReportActions {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterestChooseItemUi f76410a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final InterestChooseSubItemUi f76411b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final Type f76412c;

            public d(@NotNull InterestChooseItemUi interestChooseItemUi, @Nullable InterestChooseSubItemUi interestChooseSubItemUi, @NotNull Type type) {
                this.f76410a = interestChooseItemUi;
                this.f76411b = interestChooseSubItemUi;
                this.f76412c = type;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f76410a, dVar.f76410a) && Intrinsics.areEqual(this.f76411b, dVar.f76411b) && this.f76412c == dVar.f76412c;
            }

            public final int hashCode() {
                int iHashCode = this.f76410a.hashCode();
                InterestChooseSubItemUi interestChooseSubItemUi = this.f76411b;
                return this.f76412c.hashCode() + (((iHashCode * 31) + (interestChooseSubItemUi == null ? 0 : interestChooseSubItemUi.hashCode())) * 31);
            }

            @NotNull
            public final String toString() {
                return "SubItemReport(item=" + this.f76410a + ", subItem=" + this.f76411b + ", type=" + this.f76412c + ")";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$a.class */
    public interface a extends Actions {

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.udf.actions.Actions$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0490a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterestChooseAgeUi f76413a;

            public C0490a(@NotNull InterestChooseAgeUi interestChooseAgeUi) {
                this.f76413a = interestChooseAgeUi;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0490a) && Intrinsics.areEqual(this.f76413a, ((C0490a) obj).f76413a);
            }

            public final int hashCode() {
                return this.f76413a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "AgeClick(item=" + this.f76413a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterestChooseGenderUi f76414a;

            public b(@NotNull InterestChooseGenderUi interestChooseGenderUi) {
                this.f76414a = interestChooseGenderUi;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f76414a, ((b) obj).f76414a);
            }

            public final int hashCode() {
                return this.f76414a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "GenderClick(item=" + this.f76414a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final j f76415a;

            public c(@NotNull j jVar) {
                this.f76415a = jVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f76415a, ((c) obj).f76415a);
            }

            public final int hashCode() {
                return this.f76415a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "ItemClick(item=" + this.f76415a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$a$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterestChooseItemUi f76416a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final InterestChooseSubItemUi f76417b;

            public d(@NotNull InterestChooseItemUi interestChooseItemUi, @NotNull InterestChooseSubItemUi interestChooseSubItemUi) {
                this.f76416a = interestChooseItemUi;
                this.f76417b = interestChooseSubItemUi;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f76416a, dVar.f76416a) && Intrinsics.areEqual(this.f76417b, dVar.f76417b);
            }

            public final int hashCode() {
                return this.f76417b.hashCode() + (this.f76416a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "SubItemClick(item=" + this.f76416a + ", subItem=" + this.f76417b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$a$e.class */
        @StabilityInferred(parameters = 0)
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterestChooseItemUi f76418a;

            public e(@NotNull InterestChooseItemUi interestChooseItemUi) {
                this.f76418a = interestChooseItemUi;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f76418a, ((e) obj).f76418a);
            }

            public final int hashCode() {
                return this.f76418a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "ThirdPageUnfoldClick(item=" + this.f76418a + ")";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements Actions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f76419a = new b();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1775460546;
        }

        @NotNull
        public final String toString() {
            return "Confirm";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements Actions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f76420a = new c();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1877413196;
        }

        @NotNull
        public final String toString() {
            return "FetchSecond";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements Actions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f76421a = new d();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -644125128;
        }

        @NotNull
        public final String toString() {
            return "GotoNext";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$e.class */
    @StabilityInferred(parameters = 1)
    public static final class e implements Actions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f76422a = new e();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1457956826;
        }

        @NotNull
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$f.class */
    @StabilityInferred(parameters = 0)
    public static final class f implements Actions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final C7782e f76424b;

        public f(int i7, @Nullable C7782e c7782e) {
            this.f76423a = i7;
            this.f76424b = c7782e;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f76423a == fVar.f76423a && Intrinsics.areEqual(this.f76424b, fVar.f76424b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f76423a);
            C7782e c7782e = this.f76424b;
            return (iHashCode * 31) + (c7782e == null ? 0 : c7782e.hashCode());
        }

        @NotNull
        public final String toString() {
            return "SecondResponse(cnt=" + this.f76423a + ", response=" + this.f76424b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/actions/Actions$g.class */
    @StabilityInferred(parameters = 1)
    public static final class g implements Actions {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f76425a = new g();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -286752806;
        }

        @NotNull
        public final String toString() {
            return "Submit";
        }
    }
}
